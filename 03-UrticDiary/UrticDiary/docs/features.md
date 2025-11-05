# 🌿 UrticDiary — Documento de funcionalidades

**Versión:** 1.0  
**Autor:** m-eugenia-ruberte  
**Última actualización:** noviembre 2025

---

## 🎯 Objetivo general

**UrticDiary** es una aplicación Android destinada al **registro diario de síntomas de urticaria crónica**, enfocada en la **simplicidad de uso**, la **constancia del seguimiento** y la **visualización de la evolución** a lo largo del tiempo.

La app está pensada para uso personal, con la posibilidad de expansión hacia una versión pública o compartida en el futuro.

---

## 🧩 Funcionalidades principales

| Categoría | Funcionalidad | Descripción |
|------------|----------------|-------------|
| **Registro diario** | Entrada del día | Permite registrar el número de ronchas y la intensidad del picor, con opciones predefinidas. Se puede añadir nota o foto opcional. |
| | Notas y fotos | Asociar texto o imágenes a cada día, para registrar contextos, posibles causas o tratamientos. |
| **Recordatorios** | Notificación diaria | Recordatorio configurable a una hora fija, que permanece visible hasta que se complete el registro del día. |
| | Configuración de hora | El usuario define la hora preferida para recibir el aviso diario. |
| **Historial** | Listado diario | Muestra los registros anteriores de forma cronológica, con indicadores visuales de intensidad. |
| | Edición / eliminación | Permite modificar o eliminar registros pasados. |
| **Estadísticas** | Vista semanal y mensual | Gráficos de evolución para picor y ronchas, mostrando tendencias o picos. |
| | Promedios y distribución | Cálculo de promedios por período. |
| **Configuración** | Backup y sincronización | Copia local y opción futura de sincronización con la nube (Firebase o Google Drive). |
| | Exportación | Posibilidad futura de exportar registros a CSV o PDF. |

---

## 📅 Flujo de usuario

### 1️⃣ Primer uso
1. El usuario abre la app por primera vez.
2. Se muestra un mensaje de bienvenida y una opción para configurar la hora del recordatorio diario.
3. A partir de ese momento, la app genera una notificación diaria persistente.

### 2️⃣ Registro diario
1. El usuario recibe una **notificación** a la hora configurada.
2. Al pulsarla, se abre la pantalla de registro.
3. Se eligen los niveles de:
    - **Ronchas:** ninguna, ≤20, 21–50, >50
    - **Picor:** ninguno, leve, moderado, intenso
4. (Opcional) Se añade una nota o una foto.
5. Al guardar, la notificación del día se marca como completada.

### 3️⃣ Consulta del historial
- Desde el menú principal, el usuario puede ver los registros pasados en lista.
- Cada elemento muestra fecha, niveles y, si hay, icono de nota o foto.
- Puede entrar al detalle para editar o eliminar.

### 4️⃣ Visualización de estadísticas
- En vistas semanales o mensuales, la app muestra:
    - Promedio de ronchas y picor.
    - Distribución de niveles.
    - Posibles correlaciones (a futuro).

### 5️⃣ Configuración
- El usuario puede:
    - Cambiar la hora del recordatorio.
    - Hacer una copia de seguridad local o en la nube.
    - Exportar datos (en versiones futuras).

---

## 🌡️ Escalas y niveles

A continuación se definen las escalas que utiliza la app para cuantificar los síntomas.  
Cada nivel incluye una descripción detallada para facilitar la autoevaluación diaria del usuario.

| Tipo | Nivel | Descripción breve | Detalle orientativo | Valor interno |
|------|--------|-------------------|----------------------|----------------|
| **Ronchas** | Ninguna | Sin ronchas visibles. | La piel se mantiene limpia y sin marcas durante todo el día. No se observan brotes. | 0 |
|  | ≤20 | Leve, controlado. | Aparecen pocas ronchas aisladas; suelen desaparecer en pocas horas o tras tomar medicación. No afectan al descanso ni a la rutina. | 1 |
|  | 21–50 | Moderado. | Brote visible con varias ronchas distribuidas en distintas zonas. Puede causar incomodidad leve o necesidad de rascarse. | 2 |
|  | >50 | Intenso o brote agudo. | Gran cantidad de ronchas, extendidas o agrupadas. Puede afectar el descanso, causar picor intenso o requerir medicación urgente. | 3 |
| **Picor** | Ninguno | Sin picor. | No hay sensación de picor en ningún momento del día. | 0 |
|  | Leve | Molestia ocasional. | Picor puntual o esporádico que no interfiere con las actividades diarias ni el descanso. | 1 |
|  | Moderado | Molestia frecuente. | Picor presente varias veces al día; obliga a rascarse o tomar medicación de apoyo. | 2 |
|  | Intenso | Picor constante o molesto. | Picor continuo o nocturno que interrumpe el sueño o genera irritabilidad o fatiga. | 3 |

Estas descripciones sirven como **guía orientativa** y pueden adaptarse en futuras versiones para ofrecer explicaciones personalizadas o configurables.

---

## 🔔 Recordatorios y notificaciones

| Elemento | Comportamiento | Observaciones |
|-----------|----------------|---------------|
| **Tipo** | Notificación persistente diaria. | No desaparece hasta abrir la app. |
| **Programación** | Hora fija definida por el usuario (no basada en la hora del último registro). | Mejora respecto a otras apps similares. |
| **Estado** | Se oculta cuando el usuario completa el registro del día. | Reaparece al día siguiente. |
| **Tecnología** | `AlarmManager` o `WorkManager` según versión de Android. | Se decidirá en fase técnica. |

---

## 💾 Persistencia de datos

| Tipo | Descripción | Implementación |
|------|--------------|----------------|
| **Local (MVP)** | Base de datos SQLite gestionada con Room. | Entidad `DailyEntry`. |
| **En la nube (opcional)** | Sincronización o backup con Firebase Firestore o Google Drive API. | Etapa futura. |
| **Exportación** | Exportar datos a CSV o PDF para compartir o imprimir. | Etapa futura. |

---

## 📱 Navegación y pantallas

| Pantalla | Descripción | Acceso |
|-----------|--------------|--------|
| **Splash / Onboarding** | Presentación inicial y configuración de hora del recordatorio. | Primer uso. |
| **Home / Dashboard** | Vista rápida del día y resumen semanal. | Al abrir la app. |
| **Entry Screen** | Registro de ronchas, picor, nota y foto. | Desde Home o notificación. |
| **History Screen** | Lista cronológica de registros pasados. | Desde menú inferior. |
| **Stats Screen** | Gráficos de evolución. | Desde menú inferior. |
| **Settings Screen** | Hora del recordatorio, backup, exportación. | Desde menú inferior. |

---

## 🧭 Roadmap funcional (versión ampliada)

| Fase | Objetivo | Funcionalidades incluidas |
|------|-----------|----------------------------|
| **Fase 1 — MVP local** | Registro diario + recordatorio. | Entry Screen, Room DB, notificación diaria fija. |
| **Fase 2 — Historial básico** | Ver y editar días pasados. | Lista cronológica, edición. |
| **Fase 3 — Estadísticas** | Análisis visual de evolución. | Gráficos semanales/mensuales. |
| **Fase 4 — Configuración avanzada** | Recordatorio configurable + backups. | Pantalla de ajustes. |
| **Fase 5 — Sincronización y exportación** | Backup en nube y exportación CSV/PDF. | Firebase / Drive API. |
| **Fase 6 — Refinamiento UI** | Pulido visual, animaciones, accesibilidad. | Estilos y mejoras UX. |

---

## 🧩 Posibles ampliaciones futuras

- Sincronización automática entre dispositivos.
- Integración con calendario médico.
- Detección de patrones (IA ligera / análisis estadístico).
- Modo oscuro / personalización visual.
- Widget para registro rápido desde la pantalla de inicio.

---

## 📘 Notas finales

Este documento describe el comportamiento funcional de la aplicación.  
Cualquier cambio importante en el alcance o diseño deberá reflejarse aquí antes de iniciar su desarrollo.

---

**Autor:** [m-eugenia-ruberte](https://github.com/m-eugenia-ruberte)  
**Repositorio:** [Portfolio-MobileDev](https://github.com/m-eugenia-ruberte/Portfolio-MobileDev)
