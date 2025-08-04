# 01 - Variables y tipos

## Temas prácticos

- Declaración de variables con `val` y `var`
- Tipado estático e inferencia de tipos
- Tipos básicos en Kotlin: `Int`, `Double`, `Boolean`, `String`
- Conversión entre tipos
- Uso de constantes e inmutabilidad
- Evaluación de condiciones booleanas

## Resumen de teoría

- En Kotlin, las variables se declaran con:
  - `val` (inmutable, como una constante)
  - `var` (mutable, puede cambiar su valor)
- El tipo de dato puede especificarse o inferirse automáticamente:
  - `val edad: Int = 30`
  - `val nombre = "Ana"` (el tipo se infiere como `String`)
- Los tipos básicos son:
  - `Int` (enteros), `Double` (decimales), `Boolean` (true/false), `String` (texto)
- Para convertir tipos se usan funciones como `.toDouble()`, `.toInt()`, etc.
- Las constantes no pueden cambiarse (`val`), mientras que las variables sí (`var`).
- Se pueden usar operadores como `>`, `<`, `==`, `!=` para obtener valores booleanos a partir de comparaciones.


## Ejercicios

1. **Tu presentación**  
   - Declara una variable para tu nombre y otra para tu edad.  
   - Crea una cadena de texto que diga: "Hola, me llamo ___ y tengo ___ años."  

2. **Cálculos simples**  
   - Declara una constante con el año actual.  
   - Calcula el año de nacimiento a partir de tu edad.  
   - Muestra el resultado en un mensaje.  

3. **Tipos y conversión**  
   - Declara una variable `alturaCm` como entero (por ejemplo 165).  
   - Declara una variable `alturaM` como número decimal, convirtiendo la anterior a metros.  

4. **Booleanos**  
   - Declara una variable que indique si eres mayor de edad.  
   - Usa una comparación para obtener el valor booleano a partir de tu edad.  

5. **Constantes y mutabilidad**  
   - Declara una constante `pais` y una variable `ciudad`.  
   - Modifica el valor de `ciudad` y observa qué sucede si intentas hacer lo mismo con `pais`.  
   
   ---

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[📄 respuestas.kt](./respuestas.kt)

---

¡Gracias por pasar por aquí!  
