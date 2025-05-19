import SimpleLangLexer from "./generated/SimpleLangLexer.js";
import SimpleLangParser from "./generated/SimpleLangParser.js";
import CustomSimpleLangVisitor from "./CustomSimpleLangVisitor.js";
import { CharStreams, CommonTokenStream } from "antlr4";
import readline from "readline";
import fs from "fs";

async function main() {
  // Buscar archivos de entrada válidos
  const files = fs.readdirSync(".")
    .filter(f => f.match(/^Input(Correcto|Incorrecto)-\d+\.txt$/i))
    .sort();

  console.log("Archivos encontrados para procesar:", files);

  if (files.length === 0) {
    // Si no hay archivos, pedir entrada manual
    const input = await leerCadena();
    await procesarEntrada(input, "Entrada desde consola");
  } else {
    for (const file of files) {
      const input = fs.readFileSync(file, "utf8");
      await procesarEntrada(input, file);
    }
  }
}

async function procesarEntrada(input, fuente) {
  console.log(`\n--- Procesando: ${fuente} ---`);

  // Mostrar expectativas según el tipo de archivo
  if (/Incorrecto/i.test(fuente)) {
    console.log("🔴 Esperando errores...");
  } else if (/Correcto/i.test(fuente)) {
    console.log("🟢 Esperando entrada válida...");
  }

  // Lexer
  let inputStream = CharStreams.fromString(input);
  let lexer = new SimpleLangLexer(inputStream);

  console.log("Verificando tokens generados por el lexer...");
  const tokens = lexer.getAllTokens();
  if (tokens.length === 0) {
    console.error("⚠️ No se generaron tokens. Verifica la entrada o la gramática.");
    return;
  }

  console.log("\nTabla de Tokens y Lexemas:");
  console.log("--------------------------------------------------");
  console.log("| Lexema         | Token                         |");
  console.log("--------------------------------------------------");
  for (let token of tokens) {
    const tokenType = SimpleLangLexer.symbolicNames[token.type] || `UNKNOWN (${token.type})`;
    const lexema = token.text;
    console.log(`| ${lexema.padEnd(14)} | ${tokenType.padEnd(30)}|`);
  }
  console.log("--------------------------------------------------");

  // Parser (volver a crear el lexer y tokenStream)
  inputStream = CharStreams.fromString(input);
  lexer = new SimpleLangLexer(inputStream);
  let tokenStream = new CommonTokenStream(lexer);
  let parser = new SimpleLangParser(tokenStream);

  // Listener de errores personalizado
  parser.removeErrorListeners();
  parser.addErrorListener({
    syntaxError(recognizer, offendingSymbol, line, column, msg) {
      console.error(`❌ Error de sintaxis en línea ${line}, columna ${column}: ${msg}`);
    }
  });

  let tree = parser.program();

  if (parser._syntaxErrors > 0) {
    console.error("❌ Se encontraron errores de sintaxis en la entrada.");
  } else {
    console.log("✅ Entrada válida.");
    const cadena_tree = tree.toStringTree(parser.ruleNames);
    console.log(`Árbol de derivación:\n${cadena_tree}`);

    const visitor = new CustomSimpleLangVisitor();
    visitor.visit(tree);
  }
}

function leerCadena() {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
  });
  return new Promise((resolve) => {
    rl.question("Ingrese una cadena: ", (answer) => {
      rl.close();
      resolve(answer);
    });
  });
}

main();
