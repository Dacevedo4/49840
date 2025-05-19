Este Proyecto de SSL es un analizador en el cual podremos ver la sintaxis sobre un lenguaje en especifico ( es este caso JavaScript) 
	Comenzamos descargando todo lo necesario para poder realizar el proyecto; Java , Node.js y VS Code. En VS Code descargamos la extensión de Antlr y clonamos el repositorio del ejemplo ssl-antlr-calculator.
	Y ahí abrimos la carpeta ssl-antl-calculator en VS Code y empezamos a Editar
 
1-Agregamos un nuevo Archivo con nuestra Gramatica(en Antlr) que nos asignaron, en mi paso yo le puse el nombre SimpleFlang.g4.Luego editamos el archivo launch.json , en "grammar", colocamos nuestra gramática.
![Captura de pantalla 2025-05-18 183002](https://github.com/user-attachments/assets/43bb595e-1c39-440d-a424-d6c1147bb4be)

2-En nuestra izquierda se podrá ver la extensión de Antlr , donde nos generará los los lexer token y parser rules de nuestra gramática. 
![Antlr 1](https://github.com/user-attachments/assets/74cb0883-a446-4760-a4b9-b8bdc3208009)
![Antlr 2](https://github.com/user-attachments/assets/271f1651-32e5-4343-924e-79fc2498bf3f)

3-Y Utilizando este comando ( o apretando F5) se debe generar nuestro árbol de derivación.Verificamos que nuestro árbol este todo en orden (en este caso use el ImputCorrecto-1)
![Antlr Arbol](https://github.com/user-attachments/assets/debdec0b-7be2-47d5-a3dd-476b4d9e3c3f)

4-Sumanos un nuevo archivo para que nos haga la tabla de token y lexemas, le ponemos el nombre CustomSimpleLangVisitor.js y lo editamos, asi realiza la tabla.

5-Si se ejecuta de forma correcta,en nuestra terminal de VS Code colocamos el código npm start y nos enseñara si la entrada utilizada es valida/correcta.
![Antlr npm start](https://github.com/user-attachments/assets/6f22a40b-cf47-4d74-856c-240118581a73)
![Antlr npm start 1](https://github.com/user-attachments/assets/a3b0f782-eb0a-495f-9812-941e5cf83ed3)

En el Primer ejemplo correcto, podemos ver que se pudo realizar la tabla de tokens y lexemas con el arbol de derivacion.
Ahora veremos que sucede cuando esta mal desarrollado el ejemplo (InputIncorrecto-1.txt)

![Antlr npm incorrecto 2](https://github.com/user-attachments/assets/ac5b678b-1e9f-4e53-b4c2-128350ec9a3e)
![Antlr npm incorrecto 1](https://github.com/user-attachments/assets/3682cbee-0b5c-4e06-ab50-ab91cfb35861)

Aca observamos que si se realiza la tabla de tokens y lexemas , pero no el arbol y nos dice que es lo que esta mal y en que linea esta.
