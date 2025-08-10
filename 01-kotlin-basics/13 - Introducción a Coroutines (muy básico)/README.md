# 13 - Introducción a Coroutines (muy básico)

En esta unidad comenzarás a conocer las **coroutines** en Kotlin, una forma eficiente de manejar operaciones asíncronas y concurrencia sin bloquear el hilo principal.

---

## 🎯 Objetivos de aprendizaje

- Entender qué es una coroutine y para qué sirve.
- Conocer los conceptos básicos: suspensión, scopes y dispatchers.
- Aprender a lanzar coroutines simples con launch y async.
- Usar funciones suspend para definir operaciones que se pueden pausar.
- Evitar bloqueos en el hilo principal con coroutines.

---

## 📚 Teoría básica

### 1. ¿Qué es una coroutine?

Una coroutine es una unidad ligera de trabajo que puede ser pausada y reanudada sin bloquear un hilo. Permite escribir código asíncrono de forma secuencial y legible.

---

### 2. Conceptos clave

- Suspender: Pausar la ejecución de una coroutine sin bloquear el hilo.
- Scope: Contexto en el que se ejecutan las coroutines, controla su ciclo de vida.
- Dispatcher: Define en qué hilo o hilo pool se ejecuta la coroutine (por ejemplo, Dispatchers.Main, Dispatchers.IO).

---

### 3. Lanzar coroutines básicas

- launch: Inicia una coroutine que no devuelve resultado (Job).
- async: Inicia una coroutine que devuelve un resultado diferido (Deferred).

Ejemplo básico:

val job = CoroutineScope(Dispatchers.Default).launch {
    // Código que se ejecuta en background
    delay(1000)
    println("Tarea completada")
}

---

### 4. Funciones suspend

Se usan para marcar funciones que pueden ser pausadas sin bloquear el hilo. Solo pueden llamarse dentro de una coroutine o de otra función suspend.

Ejemplo:

suspend fun esperar() {
    delay(1000)
    println("Esperé 1 segundo")
}

---

## 📝 Ejercicios

Ejercicio 1 - Crear y lanzar una coroutine  
Lanza una coroutine que imprima un mensaje después de 1 segundo usando delay.

Ejercicio 2 - Función suspend simple  
Define una función suspend que imprima un mensaje y úsala dentro de una coroutine.

Ejercicio 3 - Uso de async y await  
Lanza dos coroutines con async que retornen valores y usa await para obtenerlos y sumarlos.

Ejercicio 4 - Dispatcher y contexto  
Prueba cambiar el Dispatcher para ver en qué hilo se ejecuta la coroutine.

---

## 💡 Consejos

- Recuerda que delay no bloquea el hilo, a diferencia de Thread.sleep.
- Usa coroutines para tareas como llamadas a red, operaciones de base de datos o procesos largos.
- No olvides manejar el ciclo de vida con scopes adecuados para evitar fugas de memoria.

---

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[respuestas.kt](./respuestas.kt)
