# 08 - Herencia y Polimorfismo en Kotlin

## Temas prácticos

- Herencia de clases con `open` y `:`
- Sobrescritura de métodos con `override`
- Uso de `super`
- Clases abstractas y métodos abstractos
- Polimorfismo en tiempo de ejecución

## Teoría resumida

### 🔹 Herencia básica

En Kotlin, las clases no son heredables por defecto. Para permitir la herencia, se deben marcar como `open`.

```kotlin
open class Animal {
    open fun hacerSonido() {
        println("Algún sonido")
    }
}

class Perro : Animal() {
    override fun hacerSonido() {
        println("Guau")
    }
}
```

### 🔹 Uso de `super`

Se utiliza `super` para acceder a métodos o propiedades de la clase padre desde una clase hija.

```kotlin
class Gato : Animal() {
    override fun hacerSonido() {
        super.hacerSonido()
        println("Miau")
    }
}
```

### 🔹 Clases abstractas

Una clase abstracta no puede ser instanciada y puede contener métodos abstractos (sin implementación).

```kotlin
abstract class Figura {
    abstract fun area(): Double
}
```

Las clases hijas deben implementar los métodos abstractos:

```kotlin
class Circulo(val radio: Double) : Figura() {
    override fun area(): Double = Math.PI * radio * radio
}
```

### 🔹 Polimorfismo

Permite tratar objetos de diferentes clases que comparten un mismo tipo base de forma uniforme.

```kotlin
fun imprimirSonido(animal: Animal) {
    animal.hacerSonido()
}
```

## Ejercicios

1. **Clase base Animal**  
   Define una clase `Animal` con un método `hacerSonido()` que imprima "Sonido genérico". Crea una clase hija `Perro` que sobrescriba este método para imprimir "Guau".

2. **Uso de super en Gato**  
   Crea una clase `Gato` que herede de `Animal`, sobrescriba `hacerSonido()` e imprima primero el mensaje del padre y luego "Miau".

3. **Clase abstracta Figura**  
   Declara una clase abstracta `Figura` con un método abstracto `area()`. Luego crea una clase `Rectangulo` que herede de ella e implemente el método.

4. **Polimorfismo en acción**  
   Crea una función `imprimirArea(figura: Figura)` que imprima el área. Usa esta función con distintas figuras para mostrar el comportamiento polimórfico.

5. **Sobrescritura en cadena**  
   Crea una clase `Vehiculo` con un método `conducir()`, y una clase `Coche` que lo sobrescriba. Luego una clase `Deportivo` que herede de `Coche` y también sobrescriba `conducir()`.

6. **Uso de clases abstractas con animales**  
   Declara una clase abstracta `AnimalSalvaje` con un método abstracto `alimentarse()`. Luego crea dos clases que hereden de ella (`Leon` y `Jirafa`) e implementen el método de forma distinta.

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[📄 respuestas.kt](./respuestas.kt)
