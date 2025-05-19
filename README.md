Este proyecto de SSL es un analizador en el cual podremos observar la sintaxis de un lenguaje específico (en este caso, JavaScript).

Comenzamos descargando todo lo necesario para poder realizar el proyecto: Java, Node.js y VS Code. En VS Code descargamos la extensión de ANTLR y clonamos el repositorio del ejemplo ssl-antlr-calculator.
Luego, abrimos la carpeta ssl-antlr-calculator en VS Code y comenzamos a editar.

1. Agregar una nueva gramática
Creamos un nuevo archivo con la gramática en ANTLR que nos fue asignada. En mi caso, lo nombré SimpleFlang.g4. Luego, editamos el archivo launch.json y, en el campo "grammar", colocamos el nombre de nuestra gramática.

![Captura de pantalla 2025-05-18 183002](https://github.com/user-attachments/assets/43bb595e-1c39-440d-a424-d6c1147bb4be)

2. Generación automática de reglas
En el panel izquierdo de VS Code se puede ver la extensión de ANTLR, la cual nos generará automáticamente los lexer tokens y las parser rules correspondientes a nuestra gramática.

![Antlr 1](https://github.com/user-attachments/assets/74cb0883-a446-4760-a4b9-b8bdc3208009)
![Antlr 2](https://github.com/user-attachments/assets/271f1651-32e5-4343-924e-79fc2498bf3f)

3. Visualización del árbol de derivación
Utilizando el comando correspondiente (o presionando F5), se debe generar el árbol de derivación. Verificamos que el árbol esté correctamente formado (en este caso utilicé el archivo InputCorrecto-1).

![Antlr Arbol](https://github.com/user-attachments/assets/debdec0b-7be2-47d5-a3dd-476b4d9e3c3f)

4. Creación del visitante para tokens y lexemas
Agregamos un nuevo archivo que generará la tabla de tokens y lexemas. Lo llamamos CustomSimpleLangVisitor.js y lo editamos para que cumpla esta función.

5. Ejecución y verificación
Si todo funciona correctamente, ejecutamos el comando npm start en la terminal de VS Code. Este nos indicará si la entrada utilizada es válida o no.

![Antlr npm start](https://github.com/user-attachments/assets/6f22a40b-cf47-4d74-856c-240118581a73)
![Antlr npm start 1](https://github.com/user-attachments/assets/a3b0f782-eb0a-495f-9812-941e5cf83ed3)
En el primer ejemplo correcto, se puede observar que se genera exitosamente la tabla de tokens y lexemas junto con el árbol de derivación.

6. Manejo de errores
Ahora veremos qué sucede cuando el archivo de entrada está mal formado (InputIncorrecto-1.txt).

![Antlr npm incorrecto 2](https://github.com/user-attachments/assets/ac5b678b-1e9f-4e53-b4c2-128350ec9a3e)
![Antlr npm incorrecto 1](https://github.com/user-attachments/assets/3682cbee-0b5c-4e06-ab50-ab91cfb35861)

En este caso, se genera la tabla de tokens y lexemas, pero no se produce el árbol de derivación. Además, se muestra un mensaje indicando cuál es el error y en qué línea se encuentra.
