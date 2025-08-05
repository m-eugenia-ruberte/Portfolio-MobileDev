# 08 - Extensiones y funciones lambda

## Temas prácticos

- Funciones de extensión (`fun Tipo.funcion()`)
- Propiedades de extensión
- Lambdas como parámetros de función
- Sintaxis de lambdas
- Tipos `Function` y funciones de orden superior

## Teoría resumida

### Extensiones

Las funciones de extensión permiten **agregar funcionalidades a clases existentes** sin necesidad de heredar o modificar su código.

```kotlin
fun String.saludar(): String {
    return "Hola, $this"
}

val mensaje = "Kotlin".saludar()  // Hola, Kotlin
```

También se pueden definir propiedades de extensión (solo de lectura):

```kotlin
val String.primeraLetra: Char
    get() = this.first()
```

### Lambdas y funciones de orden superior

Una **lambda** es una función anónima que puede almacenarse en variables o pasarse como parámetro.

```kotlin
val saludar = { nombre: String -> "Hola, $nombre" }
println(saludar("Ana"))  // Hola, Ana
```

Una **función de orden superior** es una función que recibe otras funciones como argumento o devuelve una función.

```kotlin
fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

val suma = operar(3, 4) { x, y -> x + y }  // 7
```

Las lambdas pueden usar `it` si tienen un solo parámetro:

```kotlin
val duplicar = { it: Int -> it * 2 }  // o simplemente { it * 2 }
```

## Ejercicios

1. **Función de extensión `esPar()`**  
   Crea una función de extensión para `Int` llamada `esPar()` que devuelva `true` si el número es par.

2. **Extensión para String: `palabras()`**  
   Define una función de extensión que divida un `String` en una lista de palabras.

3. **Propiedad de extensión `primeraLetra`**  
   Declara una propiedad de extensión para `String` que devuelva la primera letra.

4. **Función de orden superior `operar()`**  
   Implementa una función que reciba dos enteros y una lambda para operar con ellos. Prueba con suma, resta y multiplicación.

5. **Lambda personalizada `saludar`**  
   Define una lambda que reciba un nombre y devuelva un saludo.

6. **Filtrar lista con lambda**  
   Dada una lista de enteros del 1 al 10, usa `filter` con una lambda para obtener solo los números pares.

7. **Contar caracteres usando `count {}`**  
   Cuenta cuántas letras mayúsculas hay en un texto usando una lambda con `count`.

8. **Ejecutar una lambda dentro de una función**  
   Escribe una función `ejecutarOperacion` que reciba una lambda sin parámetros ni retorno y la ejecute.

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[respuestas.kt](./respuestas.kt)
