# 06: Clases y Objetos

## Temas prácticos

- Declaración de clases
- Propiedades y métodos
- Visibilidad (`private`, `public`)
- Constructores primarios y secundarios
- Bloques `init`
- Objetos (`object`)
- Uso de `this`

## Resumen de teoría

- **Clases:** Plantillas para crear objetos. Se definen con la palabra clave `class`.
- **Propiedades:** Variables que describen el estado del objeto, definidas dentro de la clase.
- **Métodos:** Funciones dentro de una clase que definen comportamientos.
- **Visibilidad:** Por defecto, las propiedades y métodos son `public`. Con `private` se restringe el acceso solo a la clase.
- **Constructores primarios:** Definidos en la cabecera de la clase para inicializar propiedades.
- **Constructores secundarios:** Métodos alternativos para crear objetos, usan la palabra clave `constructor`.
- **Bloques `init`:** Código que se ejecuta justo después del constructor primario, ideal para inicializaciones adicionales.
- **Objetos (`object`):** Instancia única y singleton que puede contener propiedades y métodos.
- **Uso de `this`:** Referencia explícita al objeto actual, útil para distinguir propiedades de parámetros con el mismo nombre.


## Ejercicios

1. **Clase Persona**  
   Crear una clase `Persona` con propiedades `nombre` y `edad`, y un método `presentarse()` que imprima un mensaje con sus datos.

2. **Clase Rectángulo**  
   Crear una clase `Rectangulo` con propiedades `base` y `altura`, y un método `area()` que devuelva el área. Luego, imprimir el resultado.

3. **Clase Coche**  
   Crear una clase `Coche` con una propiedad `modelo` y un método `arrancar()` que imprima un mensaje indicando que el coche ha arrancado.

4. **Clase CuentaBancaria**  
   Crear una clase `CuentaBancaria` con una propiedad `saldo` privada. Incluir métodos públicos `depositar(monto: Double)` y `retirar(monto: Double)`, con lógica simple de operación y mensajes. Mostrar cómo acceder al saldo mediante un método.

5. **Clase Producto con dos constructores**  
   Crear una clase `Producto` con constructor primario que reciba `nombre` y `precio`. Añadir un constructor secundario que permita crear un producto sin precio, asignando uno por defecto.

6. **Clase Libro con bloque init**  
   Crear una clase `Libro` con propiedad `titulo`. Usar un bloque `init` para imprimir un mensaje como “Libro ‘X’ creado”.

7. **Objeto Configuración**  
   Crear un `object` llamado `Configuracion` con propiedades `modoOscuro` (Boolean) e `idioma`. Mostrar cómo acceder a esas propiedades desde `main()`.

8. **Clase Alumno con uso de `this`**  
   Crear una clase `Alumno` con una propiedad `nota`. Incluir un método `evaluar(nota: Int)` que actualice la propiedad usando `this.nota = nota` y determine si está aprobado (nota ≥ 6). Mostrar el resultado.

## Archivo de respuestas

Puedes ver todo el código fuente con las soluciones en este archivo:  
[📄 respuestas.kt](./respuestas.kt)
