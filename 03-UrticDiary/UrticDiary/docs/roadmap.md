# 🗺️ UrticDiary — Roadmap de desarrollo

**Versión:** 1.0  
**Autor:** m-eugenia-ruberte  
**Repositorio:** [Portfolio-MobileDev](https://github.com/m-eugenia-ruberte/Portfolio-MobileDev)  
**Ubicación:** `03-UrticDiary/UrticDiary/docs/roadmap.md`  
**Última actualización:** noviembre 2025

---

## 🎯 Objetivo general

Crear una aplicación Android funcional y sostenible que permita **registrar y visualizar la evolución de síntomas diarios de urticaria**, con **recordatorios automáticos**, **almacenamiento local y sincronización futura**, y una **experiencia de uso cuidada y clara**.

El desarrollo se organizará por fases incrementales, con entregables verificables y documentación asociada.

---

## 🧩 Fase 0 — Configuración inicial

**Objetivo:** preparar la base técnica y documental del proyecto.  
**Duración estimada:** 1–2 días de trabajo.

**Tareas:**
- Crear estructura de carpetas (`docs`, `app`, `data`, `ui`, etc.).
- Redactar `README.md`, `LICENSE.md`, `architecture.md` y `roadmap.md`.
- Configurar Gradle inicial (Kotlin, Compose, Room, Navigation).
- Definir `package name` y nombre visible de la app: `UrticDiary`.

**Entregable:**  
Repositorio funcional con documentación completa y commit inicial limpio.

---

## 🩺 Fase 1 — MVP: Registro diario local

**Objetivo:** construir el núcleo funcional mínimo de la app.  
**Duración estimada:** 1 semana de trabajo progresivo.

**Características:**
- Pantalla para registrar síntomas del día:
    - Nivel de ronchas (4 niveles)
    - Nivel de picor (4 niveles)
    - Notas opcionales
- Persistencia local con **Room**.
- Recordatorio diario **fijo** (hora predefinida, sin configuración).
- Interfaz inicial en **Compose** (sin estilo final).
- Listado simple de registros previos.

**Criterio de “Done”:**
- El usuario puede abrir la app, registrar un día y ver el registro en la lista.
- Notificación diaria funcional que abre la app.

**Documentos asociados:**
- `docs/mvp_spec.md` — especificación funcional de la Fase 1.
- `CHANGELOG.md` — registro de avances.

---

## 🔔 Fase 2 — Recordatorios configurables

**Objetivo:** permitir al usuario ajustar la hora de los recordatorios.  
**Duración estimada:** 3–4 días.

**Características:**
- Pantalla de **Configuración** (Settings).
- Selector de hora para la notificación diaria.
- Persistencia de la configuración (Room o DataStore).
- Uso de **WorkManager / AlarmManager** para notificación persistente.

**Criterio de “Done”:**
- El recordatorio se lanza cada día a la hora elegida, aunque el dispositivo se reinicie.
- Se actualiza si el usuario cambia la hora.

---

## 📅 Fase 3 — Historial y navegación

**Objetivo:** permitir consultar los registros previos por día, semana y mes.  
**Duración estimada:** 1 semana.

**Características:**
- Integración de **Compose Navigation**.
- Pantalla de **Historial** con filtro por rango de fechas.
- Visualización de notas y fotos asociadas.
- Navegación entre pantallas: Home → Entry → History → Settings.

**Criterio de “Done”:**
- El usuario puede moverse entre secciones y ver datos organizados.
- Navegación estable y estados preservados.

---

## 📊 Fase 4 — Estadísticas y resumen visual

**Objetivo:** ofrecer información resumida de la evolución de síntomas.  
**Duración estimada:** 1 semana.

**Características:**
- Cálculo de medias de ronchas y picor por semana/mes.
- Gráficos básicos con Compose (líneas o barras).
- Resumen visual claro y accesible.

**Criterio de “Done”:**
- El usuario ve una representación visual de su evolución.
- Gráficas se actualizan automáticamente según los datos.

---

## ☁️ Fase 5 — Sincronización y copia en la nube (opcional)

**Objetivo:** añadir soporte para copia y recuperación de datos.  
**Duración estimada:** abierta.

**Características:**
- Integración con **Firebase** (Authentication + Firestore/Storage).
- Sincronización manual o automática.
- Copia de seguridad de notas y fotos.

**Criterio de “Done”:**
- Los datos locales se pueden respaldar y restaurar.
- Seguridad y privacidad garantizadas.

---

## 🎨 Fase 6 — Refinamiento UI / UX

**Objetivo:** mejorar la apariencia, accesibilidad y usabilidad.  
**Duración estimada:** abierta (iterativa).

**Características:**
- Aplicar tema Material3 con colores suaves.
- Modo oscuro / claro.
- Animaciones suaves y navegación fluida.
- Mejora de textos y escalas descriptivas.

**Criterio de “Done”:**
- Interfaz coherente, estética y usable.
- Cumplimiento de principios de accesibilidad.

---

## 🧠 Fase 7 — Futuras ampliaciones (pendiente de decidir)

**Ideas posibles:**
- Exportar datos en CSV o PDF.
- Añadir IA de análisis de patrones (por ejemplo, correlación entre notas y síntomas).
- Sincronización entre dispositivos.
- Módulo de seguimiento médico o compartido.

Estas tareas quedarán **en estado “pendiente para después”**, con su propia evaluación futura según interés o tiempo disponible.

---

## 🧾 Referencias técnicas

- **Arquitectura base:** ver `docs/architecture.md`.
- **Estilo de commits:** formato convencional (feat, fix, docs, chore...).
- **Ramas recomendadas:** `main` (estable) / `dev` (en desarrollo).

---

## 🪴 Filosofía de desarrollo

- Desarrollar **de forma sostenible y pausada**, con commits claros y documentados.
- Priorizar **mantenibilidad sobre complejidad técnica**.
- Documentar cada fase antes de comenzar la siguiente.
- Publicar avances graduales en GitHub como parte del portfolio.

---

**Autor:** [m-eugenia-ruberte](https://github.com/m-eugenia-ruberte)  
**Contacto:** *privado / portfolio personal*  
**Fecha de inicio:** noviembre 2025  
