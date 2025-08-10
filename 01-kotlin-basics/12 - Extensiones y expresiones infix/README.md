# 12 - Extensiones y expresiones infix

En esta unidad aprenderás a **crear funciones de extensión** para ampliar el comportamiento de clases existentes sin modificar su código, y a usar **funciones infix** para escribir código más expresivo y legible.

---

## 🎯 Objetivos de aprendizaje

- Crear y usar funciones de extensión en Kotlin.
- Entender las ventajas de las extensiones frente a la herencia.
- Definir y utilizar funciones infix.
- Combinar extensiones e infix para un código más limpio.

---

## 📚 Teoría básica

### 1. Funciones de extensión
Una **función de extensión** permite añadir métodos a clases existentes sin heredar de ellas ni modificarlas.  
Se define con la sintaxis `fun Tipo.nombreFuncion(...)`.

Ejemplo:
`fun String.saludar() = println("Hola, $this")`

Uso:
`"Mundo".saludar()` → imprime "Hola, Mundo".

---

### 2. Funciones infix
Una **función infix** es una función que se puede llamar sin paréntesis ni punto, siempre que cumpla estas reglas:
- Debe ser miembro o extensión.
- Debe tener un único parámetro.
- Debe marcarse con la palabra clave `infix`.

Ejemplo:
`infix fun Int.suma(x: Int) = this + x`

Uso:
`5 suma 3` → devuelve 8.

---

### 3. Combinación de extensiones e infix
Podemos crear funciones infix como extensiones para lograr código muy expresivo.

Ejemplo:
`infix fun String.concatena(otra: String) = this + otra`

Uso:
`"Hola" concatena " Mundo"` → devuelve "Hola Mundo".

---

## 📝 Ejercicios

**Ejercicio 1 - Función de extensión simple**  
Crea una función de extensión para `String` que imprima un saludo personalizado.

**Ejercicio 2 - Extensión con lógica condicional**  
Crea una extensión para `Int` que indique si un número es par.

**Ejercicio 3 - Extensión sobre colecciones**  
Crea una extensión para `List<Int>` que devuelva la suma de todos sus elementos.

**Ejercicio 4 - Función infix personalizada**  
Crea una función infix que sume un número a otro y la use en el `main`.

**Ejercicio 5 - Combinar infix con otras funciones**  
Crea una función infix que concatene dos listas y prueba su uso.

---

## 💡 Consejos
- Usa extensiones para añadir funcionalidad a clases que no puedes modificar.
- Usa infix cuando quieras mejorar la legibilidad de operaciones simples.
- Recuerda que infix no sustituye a la sintaxis tradicional, solo es una forma opcional.

---

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[respuestas.kt](./respuestas.kt)
