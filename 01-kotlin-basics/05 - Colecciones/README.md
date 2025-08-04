# 05: Colecciones

## Temas prácticos

- Declaración y uso de listas (`listOf`, `mutableListOf`)
- Declaración y uso de conjuntos (`setOf`, `mutableSetOf`)
- Diferencias entre List y Set
- Recorrer colecciones con bucles
- Operaciones básicas con colecciones: tamaño, acceso, modificación
- Filtrado y búsqueda de elementos
- Funciones auxiliares: `contains`, `sum`, `map`, `filter`, etc.

## Comparativa: List vs Set

| Tipo de colección    | ¿Permite duplicados? | ¿Es mutable? | Ejemplo de creación |
|----------------------|----------------------|--------------|----------------------|
| `listOf()`           | ✅ Sí                | ❌ No        | `val lista = listOf(1, 2, 3)` |
| `mutableListOf()`    | ✅ Sí                | ✅ Sí        | `val lista = mutableListOf(1, 2, 3)` |
| `setOf()`            | ❌ No                | ❌ No        | `val conjunto = setOf(1, 2, 3)` |
| `mutableSetOf()`     | ❌ No                | ✅ Sí        | `val conjunto = mutableSetOf(1, 2, 3)` |

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

