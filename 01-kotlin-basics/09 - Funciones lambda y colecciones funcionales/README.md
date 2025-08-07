# 09 - Funciones lambda y colecciones funcionales

## Temas prácticos

- Uso de funciones lambda con listas
- Funciones `filter`, `map`, `forEach`, `count`, `find`, `any`, `all`
- Uso de `it` en lambdas simples
- Encadenamiento de operaciones funcionales
- Lambdas como argumentos de funciones

## Teoría resumida

### Herencia de funciones funcionales

Las funciones funcionales de colecciones en Kotlin permiten trabajar con datos de forma declarativa. Usan lambdas para definir el comportamiento.

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

### Encadenamiento

Puedes encadenar múltiples operaciones funcionales para procesar datos de forma limpia.

```kotlin
val resultado = numeros
    .filter { it % 2 == 0 }
    .map { it * it }
    .count { it > 10 }
```

## Ejercicios

1. **Filtrar mayores de edad**  
   Dada una lista de edades, usa `filter` para obtener solo las mayores o iguales a 18.

2. **Doblar valores**  
   Dada una lista de enteros, usa `map` para devolver una lista con cada número multiplicado por 2.

3. **Buscar nombre con 5 letras**  
   Usa `find` para buscar el primer nombre de exactamente 5 letras en una lista de strings.

4. **¿Hay palabras largas?**  
   Usa `any` para verificar si alguna palabra en una lista tiene más de 10 caracteres.

5. **¿Todos son positivos?**  
   Usa `all` para comprobar si todos los elementos de una lista de enteros son mayores que cero.

6. **Contar números impares**  
   Usa `count` para saber cuántos elementos de una lista son impares.

7. **Imprimir elementos uno por uno**  
   Usa `forEach` para imprimir todos los elementos de una lista con su índice correspondiente.

8. **Operación encadenada**  
   A partir de una lista de números, encadena `filter` y `map` para obtener los cuadrados de los números pares menores que 10.

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[📄 respuestas.kt](./respuestas.kt)
