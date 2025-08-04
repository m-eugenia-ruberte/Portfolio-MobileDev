# 05 - Colecciones

## Temas prácticos

- Declaración y uso de listas
- Recorrer colecciones con bucles
- Operaciones básicas con colecciones
- Filtrado de elementos
- Funciones con colecciones como parámetro
- Búsqueda de elementos

## Resumen de teoría

- Una **colección** es una estructura de datos que agrupa elementos (números, cadenas, objetos, etc.).
- En Kotlin, se usan principalmente:
  - `listOf(...)` para listas **inmutables**
  - `mutableListOf(...)` para listas **mutables**
  - `setOf(...)` y `mutableSetOf(...)` para conjuntos **sin duplicados**
- Puedes recorrer una colección con un bucle `for`.
- Las listas tienen métodos útiles como `.size`, `.first()`, `.last()`, `.contains()`, entre otros.
- Puedes filtrar elementos usando `.filter { ... }` y transformar usando `.map { ... }`.

> 🔎 **Nota:** Al intentar agregar un elemento duplicado a un `Set`, no se lanza error: simplemente se ignora de forma silenciosa.

---

## Ejercicios

1. **Lista de nombres**  
   Crea una lista de nombres y recórrela para imprimir cada uno en pantalla.

2. **Números al cuadrado**  
   Declara una lista de números enteros y muestra por pantalla sus cuadrados.

3. **Suma total de una lista**  
   Escribe una función que reciba una lista de enteros y devuelva la suma total de sus elementos.

4. **Filtro de números pares**  
   Dada una lista de números, crea una nueva lista solo con los números pares.

5. **Búsqueda de elemento**  
   Escribe una función que indique si un número dado está presente en una lista.
---

## Código fuente completo

Puedes ver todo el código fuente con las soluciones en este archivo:  
[📄 respuestas.kt](./respuestas.kt)

---

¡Gracias por pasar por aquí! 😊

