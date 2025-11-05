# 🏗️ UrticDiary — Arquitectura y estructura técnica

**Versión:** 1.0  
**Autor:** m-eugenia-ruberte  
**Última actualización:** noviembre 2025

---

## 🎯 Objetivo

Definir la arquitectura técnica de **UrticDiary**, describiendo las capas, dependencias y flujo de datos que compondrán la aplicación.  
El objetivo es mantener una base **modular, mantenible y fácilmente extensible**, compatible con **Jetpack Compose** y las herramientas modernas de Android.

---

## 🧩 Estructura general

La aplicación se basa en una arquitectura **MVVM (Model–View–ViewModel)** con separación lógica por capas.  
Cada capa tiene responsabilidades claras y se comunica con las demás mediante flujos de datos reactivos (StateFlow / LiveData).

com.meruberte.urticdiary
├── core/ # Constantes, extensiones, utilidades comunes
├── data/ # Repositorios, fuentes de datos y entidades locales/remotas
│ ├── local/ # Base de datos Room
│ ├── remote/ # (Futuro) Firebase / API / backup en la nube
│ └── repository/ # Lógica de acceso a datos unificada
├── domain/ # Modelos y lógica de negocio pura
├── ui/ # Pantallas, ViewModels y navegación Compose
│ ├── screens/
│ │ ├── home/
│ │ ├── entry/
│ │ ├── history/
│ │ ├── stats/
│ │ └── settings/
│ ├── components/ # Elementos visuales reutilizables (botones, sliders, etc.)
│ └── theme/ # Colores, tipografía, estilos
└── di/ # Inyección de dependencias (Hilt o alternativa ligera)

---

## 🧠 Capas y responsabilidades

| Capa | Responsabilidad principal | Ejemplo de elementos |
|------|-----------------------------|-----------------------|
| **UI** | Mostrar datos y recibir interacción del usuario. Gestiona estados visuales y lógica de presentación. | Pantallas Compose, `ViewModel`, `UiState`. |
| **Domain** | Contiene los modelos de negocio y lógica pura. No depende de Android. | Clases `DailyEntry`, cálculos de promedios, validaciones. |
| **Data** | Gestiona la persistencia y fuentes de datos (local o remota). | `Room DAO`, `Repository`, `DataSource`. |
| **Core** | Define utilidades y elementos transversales. | Extensiones, recursos comunes, `Result` genérico. |
| **DI (Dependency Injection)** | Gestiona las dependencias entre capas. | Módulos de Hilt o manuales con `Singletons`. |

---

## 🔄 Flujo de datos

1. **UI (pantalla Compose)** solicita datos o acciones al **ViewModel**.
2. El **ViewModel** llama al **Repository**, que combina datos locales y/o remotos.
3. El **Repository** accede a Room (y en el futuro, a la nube).
4. Los datos fluyen de vuelta al ViewModel y luego al estado de Compose (`UiState`), que actualiza la interfaz de forma reactiva.

UI → ViewModel → Repository → Room (o remoto)
↑ ↓
StateFlow ← actualizaciones

---

## 🧱 Componentes principales

| Componente | Descripción | Librerías / APIs |
|-------------|-------------|------------------|
| **Room** | Persistencia local de los registros diarios. | `androidx.room` |
| **ViewModel** | Lógica de presentación, mantiene estado de pantalla. | `androidx.lifecycle.viewmodel` |
| **StateFlow / MutableStateFlow** | Comunicación reactiva entre ViewModel y UI. | `kotlinx.coroutines.flow` |
| **WorkManager / AlarmManager** | Programación de recordatorios diarios persistentes. | `androidx.work` |
| **Compose Navigation** | Navegación entre pantallas. | `androidx.navigation.compose` |
| **Hilt (opcional)** | Inyección de dependencias sencilla. | `dagger.hilt.android` |

---

## 🧩 Entidades principales

| Entidad | Descripción | Campos principales |
|----------|--------------|--------------------|
| **DailyEntry** | Registro diario de síntomas. | `id`, `date`, `hivesLevel`, `itchLevel`, `note`, `photoUri`. |
| **ReminderSettings** | Configuración de hora del recordatorio. | `hour`, `minute`, `isEnabled`. |
| **StatsSummary** | Datos calculados para gráficas y promedios. | `avgHives`, `avgItch`, `rangeStart`, `rangeEnd`. |

---

## 🧭 Dependencias y librerías iniciales sugeridas

| Categoría | Librería / herramienta | Propósito |
|------------|------------------------|------------|
| **UI** | Jetpack Compose, Material3 | Interfaz moderna y declarativa |
| **Arquitectura** | ViewModel, Lifecycle, Navigation | Manejo de estado y navegación |
| **Persistencia** | Room | Base de datos local |
| **Tareas programadas** | WorkManager | Recordatorios diarios |
| **Inyección de dependencias** | Hilt (opcional) | Gestión limpia de dependencias |
| **Kotlin** | Coroutines, Flow | Concurrencia y reactividad |
| **Utilidades** | Coil | Carga de imágenes (fotos diarias) |

---

## 🧮 Ejemplo de flujo funcional (registro diario)

[Notificación diaria] → [Pantalla EntryScreen]
↓
Usuario introduce datos → ViewModel valida → Repository guarda en Room
↓
Base de datos actualiza → Flow emite cambio → UI se actualiza

---

## 📦 Escalabilidad y modularización futura

En futuras versiones, podrá dividirse en módulos Gradle separados:

:app
:data
:domain
:ui
:core


Esto permitirá añadir sincronización, exportación o IA sin modificar la estructura base.

---

## 🧭 Guía de desarrollo progresivo

| Etapa | Enfoque técnico | Objetivo |
|--------|----------------|-----------|
| **Fase 1** | MVP con Room + ViewModel + Compose básico | Registro diario + recordatorio |
| **Fase 2** | Añadir Navigation + lista de registros | Historial interactivo |
| **Fase 3** | Añadir WorkManager + configuración | Recordatorio configurable |
| **Fase 4** | Incorporar gráficos con `Charts` | Estadísticas visuales |
| **Fase 5** | Modularizar y añadir backup remoto | Sincronización y exportación |
| **Fase 6** | Refinamiento UI / UX | Animaciones, dark mode, accesibilidad |

---

## 📘 Notas finales

Esta arquitectura proporciona una base sólida para mantener el proyecto limpio y sostenible.  
Las decisiones técnicas pueden ajustarse según las necesidades reales de rendimiento, simplicidad o compatibilidad de versiones de Android.

---

**Autor:** [m-eugenia-ruberte](https://github.com/m-eugenia-ruberte)  
**Repositorio:** [Portfolio-MobileDev](https://github.com/m-eugenia-ruberte/Portfolio-MobileDev)


