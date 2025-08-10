# 12 - Manejo de errores (try/catch)

En esta unidad aprenderás a manejar excepciones en Kotlin utilizando las estructuras `try`, `catch` y `finally`, para que tu programa pueda responder ante situaciones inesperadas sin fallar.

---

## 🎯 Objetivos de aprendizaje

- Entender qué es una excepción.
- Usar `try` y `catch` para capturar y manejar errores.
- Usar `finally` para ejecutar código siempre, haya error o no.
- Lanzar excepciones personalizadas con `throw`.
- Manejar múltiples tipos de excepciones.

---

## 📚 Teoría básica

### 1. **Qué es una excepción**
Una excepción es un evento que interrumpe el flujo normal del programa. Por ejemplo, intentar convertir `"abc"` a número.

    val numero = "abc".toInt() // Lanza NumberFormatException

---

### 2. **Bloque try/catch**
Sirve para "atrapar" y manejar la excepción evitando que el programa termine abruptamente.

    try {
        val numero = "abc".toInt()
    } catch (e: NumberFormatException) {
        println("Error: no es un número válido")
    }

---

### 3. **finally**
Se ejecuta siempre, ocurra o no una excepción. Ideal para cerrar recursos o limpiar datos.

    try {
        println("Intentando...")
    } catch (e: Exception) {
        println("Error detectado")
    } finally {
        println("Esto siempre se ejecuta")
    }

---

### 4. **Lanzar excepciones**
Puedes lanzar una excepción manualmente con `throw`.

    fun validarEdad(edad: Int) {
        if (edad < 0) {
            throw IllegalArgumentException("La edad no puede ser negativa")
        }
    }

---

### 5. **Múltiples excepciones**
Puedes capturar diferentes tipos de errores usando varios `catch`.

    try {
        val lista = listOf(1, 2, 3)
        println(lista[5]) // IndexOutOfBoundsException
    } catch (e: NumberFormatException) {
        println("Formato numérico incorrecto")
    } catch (e: IndexOutOfBoundsException) {
        println("Índice fuera de rango")
    }

---

## 📝 Ejercicios

**Ejercicio 1 - Conversión segura de String a Int**  
Pide al usuario un número y conviértelo a `Int` usando `try/catch`.

**Ejercicio 2 - División con control de errores**  
Haz una función que reciba dos números y maneje la división por cero.

**Ejercicio 3 - Uso de finally**  
Abre un archivo (ficticio) y usa `finally` para cerrarlo.

**Ejercicio 4 - Excepción personalizada**  
Lanza una excepción si la contraseña tiene menos de 8 caracteres.

**Ejercicio 5 - Múltiples excepciones**  
Lee un número desde consola y captura tanto `NumberFormatException` como `IndexOutOfBoundsException`.

---

💡 **Consejos**  
- Usa `try/catch` solo cuando preveas que puede ocurrir un error, no como flujo normal del programa.  
- El bloque `finally` es ideal para liberar recursos como archivos o conexiones.

---

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[respuestas.kt](./respuestas.kt)
