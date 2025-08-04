# 04 - Bucles en Kotlin

## Temas prácticos

- Bucles `for`, `while` y `do-while`  
- Recorrido de rangos y listas  
- Acumuladores y contadores  
- Uso de `break` y `continue`  
- Bucles anidados  

---

## Teoría resumida

### Bucle `for`

Recorre un rango, una lista o cualquier estructura iterable.

Ejemplo:

    for (i in 1..5) {
        println(i)
    }

---

### Bucle `while`

Ejecuta el bloque mientras la condición sea verdadera.

Ejemplo:

    var x = 0
    while (x < 5) {
        println(x)
        x++
    }

---

### Bucle `do-while`

Similar a `while`, pero garantiza que el bloque se ejecuta al menos una vez.

Ejemplo:

    var y = 0
    do {
        println(y)
        y++
    } while (y < 5)

---

### Palabras clave útiles

- `break`: Sale del bucle de inmediato.  
- `continue`: Salta a la siguiente iteración del bucle sin terminar el ciclo actual.

---

## Ejercicios

1. Contador del 1 al 10  
   Imprime los números del 1 al 10 usando un bucle `for`.

2. Suma de números del 1 al 100  
   Usa un bucle `while` para calcular la suma total de los números del 1 al 100.

3. Bucle con condición de salida  
   Usa un bucle `do-while` para pedir al usuario que escriba palabras hasta que introduzca "salir".

4. Números pares del 1 al 20  
   Imprime solo los números pares entre 1 y 20 usando `continue`.

5. Tabla de multiplicar del 5  
   Usa un bucle `for` para mostrar la tabla de multiplicar del 5, del 5x1 al 5x10.

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[📄 respuestas.kt](./respuestas.kt)
