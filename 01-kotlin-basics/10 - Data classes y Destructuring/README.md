# 10 - Data classes y Destructuring

En esta unidad aprenderás a trabajar con **clases de datos** en Kotlin, que facilitan la creación de objetos para almacenar información, y a usar **destructuring** para extraer valores de manera sencilla.

---

## Objetivos de aprendizaje

- Crear y usar `data class` en Kotlin.  
- Comprender las funciones automáticas generadas (`toString`, `equals`, `hashCode`, `copy`).  
- Usar destructuring para asignar propiedades a variables de forma directa.  
- Aplicar destructuring con `Pair` y `Triple`.  
- Combinar destructuring con listas, bucles y funciones.  

---

## Teoría básica

### 1. Qué es una `data class`

En Kotlin, una `data class` se usa para almacenar datos. Se declara con la palabra clave `data` y automáticamente genera:

- `toString()` → representación en texto del objeto.  
- `equals()` y `hashCode()` → comparación y uso en colecciones.  
- `copy()` → creación de copias modificadas.  
- Componentes (`component1`, `component2`, etc.) para destructuring.

Ejemplo:

    data class Persona(val nombre: String, val edad: Int)

    val p1 = Persona("Ana", 30)
    println(p1) // Persona(nombre=Ana, edad=30)

---

### 2. Destructuring

Permite extraer propiedades en variables directamente.

Ejemplo:

    val (nombre, edad) = p1
    println(nombre) // Ana
    println(edad)   // 30

---

### 3. `copy()`

Crea una nueva instancia cambiando algunas propiedades.

Ejemplo:

    val p2 = p1.copy(edad = 31)

---

### 4. Destructuring con `Pair` y `Triple`

Ejemplo:

    val coordenada: Pair<Int, Int> = 10 to 20
    val (x, y) = coordenada

    val triple: Triple<String, Int, Boolean> = Triple("Ana", 30, true)
    val (nombre, edad, activo) = triple

---

## Ejercicios

### Ejercicio 1 - Crear `data class` y mostrar datos  
Crea una `data class` `Producto(nombre: String, precio: Double)`.  
Instancia un objeto y muéstralo en consola.

---

### Ejercicio 2 - Destructuring básico  
Usa destructuring para extraer las propiedades de un objeto `Producto` en variables y muéstralas por pantalla.

---

### Ejercicio 3 - Copiar objetos con `copy()`  
A partir de un `Producto`, crea una copia cambiando solo el precio.

---

### Ejercicio 4 - Comparar `data class`  
Crea dos objetos con los mismos datos y comprueba si son iguales usando `==`.

---

### Ejercicio 5 - Lista de objetos y destructuring en `forEach`  
Crea una lista de `Producto` y usa destructuring dentro de un `forEach` para mostrar nombre y precio.

---

### Ejercicio 6 - Destructuring en funciones  
Escribe una función que devuelva un objeto `Producto`.  
En el `main`, usa destructuring para recibir sus propiedades.

---

### Ejercicio 7 - Destructuring con `Pair` y `Triple`  
Crea un `Pair` y un `Triple` con datos a tu elección, y usa destructuring para mostrar cada elemento.

---

## Consejos prácticos

- Usa destructuring para simplificar código cuando trabajes con listas de objetos en bucles y funciones.  
- `componentN` se genera automáticamente en `data class` y en tipos como `Pair` o `Triple`.  
- Ten en cuenta que `copy()` crea un nuevo objeto; si necesitas mutabilidad, define propiedades `var`.

---

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[respuestas.kt](./respuestas.kt)
