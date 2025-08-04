# 07 - Nullable y Null Safety

## Temas prácticos

- Concepto de null y variables nullable
- Operador seguro `?.`
- Operador Elvis `?:`
- Evitar NullPointerException
- Uso de `let` con variables nullable
- Cast seguro `as?`
- Buenas prácticas con null safety

## Resumen de teoría

- En Kotlin, las variables no pueden contener `null` a menos que se definan con `?` (nullable).
- Usar `?.` para acceder a propiedades o métodos solo si no es null.
- El operador `?:` permite dar un valor por defecto si el valor es null.
- Evita usar el operador `!!` porque puede lanzar excepciones.
- `let` ejecuta un bloque solo si la variable no es null.
- El cast seguro `as?` devuelve null en lugar de excepción si no es posible convertir.

## Ejercicios

1. Declarar una variable nullable y mostrar su valor con un valor por defecto usando Elvis.
2. Crear una función que reciba un String nullable y devuelva su longitud o 0 si es null.
3. Usar `let` para imprimir un mensaje solo si un String nullable no es null.
4. Intentar convertir un `Any` a `String` con cast seguro y manejar el resultado.
5. Explicar por qué evitar `!!` y dar un ejemplo de su uso peligroso.

## Archivo de respuestas
[respuestas.kt](respuestas.kt)
