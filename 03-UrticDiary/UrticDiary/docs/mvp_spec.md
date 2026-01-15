# MVP Especificación — Fase 1

## Objetivo
Construir el núcleo funcional mínimo de UrticDiary, permitiendo al usuario registrar los síntomas diarios de urticaria.

## Pantallas
- **Registro diario**:
    - Nivel de ronchas (4 niveles)
    - Nivel de picor (4 niveles)
    - Notas opcionales
- **Listado de registros previos**:
    - Mostrar entradas por fecha
    - Mensaje si no hay registros

## Persistencia
- Local con **Room**.
- Estructura de base de datos:
    - Tabla `daily_entries`:
        - id (PK)
        - date
        - hivesLevel
        - itchLevel
        - notes

## Notificación
- Recordatorio diario fijo a hora predefinida.
- Abre la app directamente al pulsar la notificación.

## Criterio de “Done”
- El usuario puede abrir la app, registrar un día y ver la entrada en la lista.
- Notificación diaria funcional y visible.
