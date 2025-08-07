# 09 - Funciones lambda y colecciones funcionales

## Temas prácticos

- Uso de funciones lambda con listas
- Funciones `filter`, `map`, `forEach`, `count`, `find`, `any`, `all`
- Uso de `it` en lambdas simples
- Encadenamiento de operaciones funcionales
- Lambdas como argumentos de funciones

## Teoría resumida

### Lambdas en colecciones

Kotlin permite aplicar **operaciones funcionales** a colecciones usando lambdas, lo que facilita un estilo declarativo y conciso.

---

### Principales funciones funcionales sobre colecciones

### filter y map

`filter` devuelve una nueva lista con los elementos que cumplen una condición.  
`map` transforma cada elemento de la lista.

```kotlin
val numeros = listOf(1, 2, 3, 4, 5)
val pares = numeros.filter { it % 2 == 0 }
val dobles = numeros.map { it * 2 }
```

### forEach, count, find

- `forEach` ejecuta una acción por cada elemento
- `count` cuenta cuántos elementos cumplen una condición
- `find` devuelve el primer elemento que cumple una condición (o `null`)

```kotlin
numeros.forEach { println(it) }
val cantidadPares = numeros.count { it % 2 == 0 }
val primerMayorA3 = numeros.find { it > 3 }
```

### any y all

- `any` devuelve `true` si **algún** elemento cumple una condición
- `all` devuelve `true` si **todos** los elementos cumplen la condición

```kotlin
val hayNegativos = numeros.any { it < 0 }
val todosSonPositivos = numeros.all { it > 0 }
```

#### `reduce` y `fold`
Combinan todos los elementos en un solo valor (acumulador):

```kotlin
val numeros = listOf(1, 2, 3, 4)
val suma = numeros.reduce { acc, num -> acc + num } // Resultado: 10
val sumaConInicial = numeros.fold(10) { acc, num -> acc + num } // Resultado: 20
```
### Encadenamiento

Puedes encadenar múltiples operaciones funcionales para procesar datos de forma limpia.

```kotlin
val resultado = numeros
    .filter { it % 2 == 0 }
    .map { it * it }
    .count { it > 10 }
```

## Ejercicios

1. **Recorrer y mostrar con `forEach`**  
   A partir de una lista de productos, muestra por pantalla uno a uno con `forEach` en el formato: `"Producto: <nombre> - Precio: <precio>"`.
   
2. **Filtrar y transformar**  
   Dada una lista de números del 1 al 10, usa `filter` para quedarte con los impares y luego `map` para elevarlos al cuadrado. Imprime el resultado.

3. **Contar elementos**  
   Crea una lista de temperaturas (números decimales) y usa `count` para saber cuántas superan los 30 grados.

4. **Buscar elementos con `find`**  
   Dada una lista de nombres, encuentra el primero que empiece por la letra "M". Muestra el resultado o un mensaje si no hay ninguno.

5. **Verificar condiciones con `any` y `all`**  
   Con una lista de edades, comprueba si hay algún menor de edad (`any`) y si todos son mayores de 18 (`all`).

6. **Sumar con `reduce` y `fold`**  
   Usa `reduce` para obtener la suma total de una lista de números. Luego, usa `fold` con un valor inicial de 100 para hacer lo mismo.

7. **Encadenamiento de operaciones**  
   Dada una lista de enteros, encadena las siguientes operaciones:
   - `filter` para quedarte con los múltiplos de 3,
   - `map` para restarles 1,
   - `count` para saber cuántos son mayores que 5.

8. **Lambdas como argumentos**  
   Escribe una función que reciba una lista de números y una lambda que defina una condición. La función debe devolver cuántos elementos cumplen esa condición usando `count`.

9. **Transformar datos con `map` y `filter`**  
   Dada una lista de cadenas con nombres y apellidos ("Juan Pérez", "Ana Gómez", etc.), filtra los que terminan en "z" y convierte el resultado a mayúsculas con `map`.

10. **Mini desafío: nombres válidos**  
    Dada una lista de nombres, encadena estas operaciones:
    - Filtra los que tengan más de 4 letras,
    - Usa `map` para obtener su longitud,
    - Usa `all` para comprobar si **todas** esas longitudes son mayores a 5.


## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[📄 respuestas.kt](./respuestas.kt)
