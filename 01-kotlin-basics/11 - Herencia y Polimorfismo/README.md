# 11 - Herencia y Polimorfismo

En esta unidad aprenderás los conceptos fundamentales de la **herencia** y el **polimorfismo** en Kotlin, que permiten crear jerarquías de clases y reutilizar código de forma eficiente.

---

## 🎯 Objetivos de aprendizaje

- Entender qué es la herencia y cómo usar `open` y `override` en Kotlin.
- Crear clases base y derivadas que extienden funcionalidades.
- Comprender el concepto de polimorfismo y el uso de clases y funciones polimórficas.
- Sobrescribir métodos para adaptar comportamientos.
- Usar clases abstractas e interfaces para definir contratos comunes.
- Aplicar herencia y polimorfismo en ejemplos prácticos.

---

## 📚 Teoría básica

### 1. Herencia

- En Kotlin, las clases son `final` por defecto, para permitir herencia deben declararse con `open`.
- Una clase derivada extiende una clase base usando `:`.
- Las funciones o propiedades que se pueden sobrescribir también deben ser `open` en la clase base.
- Para sobrescribir se usa `override`.

Ejemplo:  
open class Animal {  
  open fun sonido() = println("Sonido genérico")  
}  

class Perro : Animal() {  
  override fun sonido() = println("Guau guau")  
}

### 2. Polimorfismo

- El polimorfismo permite usar referencias a la clase base para manipular objetos de clases derivadas.
- Se ejecuta el método sobrescrito según el tipo real del objeto en tiempo de ejecución.

Ejemplo:  
val animal: Animal = Perro()  
animal.sonido()  // Imprime: Guau guau

### 3. Clases abstractas

- Son clases que no pueden instanciarse directamente y pueden contener métodos abstractos (sin implementación).
- Se usan para definir un contrato común que las clases derivadas deben implementar.

Ejemplo:  
abstract class Vehiculo {  
  abstract fun conducir()  
}  

class Coche : Vehiculo() {  
  override fun conducir() = println("Conduciendo coche")  
}

### 4. Interfaces

- Las interfaces definen métodos y propiedades que las clases implementan.
- Soportan herencia múltiple.
- Pueden contener implementación por defecto.

Ejemplo:  
interface Volador {  
  fun volar() = println("Volando")  
}  

class Pajaro : Volador

---

## 📝 Ejercicios

1. **Herencia básica**  
 Crea una clase `Persona` con función `presentarse()` que imprima nombre y edad.  
 Crea una clase `Empleado` que herede de `Persona` y añada propiedad `puesto`. Sobrescribe `presentarse()` para incluir el puesto.

2. **Polimorfismo**  
 Crea clases `Gato` y `Perro` que hereden de `Animal` y sobrescriban método `sonido()`.  
 Declara una lista de `Animal` con objetos de ambos tipos y llama a `sonido()` en cada uno.

3. **Clases abstractas**  
 Crea clase abstracta `Figura` con método abstracto `area()`.  
 Implementa clases `Rectangulo` y `Circulo` que calculen su área.

4. **Interfaces**  
 Define interfaz `Nadador` con función `nadar()`.  
 Crea clase `Pato` que implemente `Nadador` y otra clase `Persona` que no la implemente.  
 Demuestra la llamada a `nadar()`.

---

💡 **Consejo:**  
Practica la creación de jerarquías sencillas antes de complicarlas. Recuerda que `open`, `override`, `abstract` y `interface` son claves para manejar herencia y polimorfismo en Kotlin.

---

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[respuestas.kt](./respuestas.kt)
