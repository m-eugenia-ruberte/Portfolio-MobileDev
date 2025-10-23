
# Estructura general del proyecto

```
com.example.tuapp/
│
├── data/                ← Capa de datos (fuentes externas)
│   ├── local/           ← Room, DataStore, SharedPrefs
│   ├── remote/          ← Retrofit, Firebase, API REST
│   ├── repository/      ← Implementaciones concretas de los repositorios
│   └── mappers/         ← Conversiones entre modelos (DTO ↔ Entity ↔ Domain)
│
├── domain/              ← Lógica de negocio pura (independiente de Android)
│   ├── model/           ← Clases de negocio (data classes limpias)
│   ├── repository/      ← Interfaces que define el dominio
│   └── usecase/         ← Casos de uso (una acción de negocio específica)
│
├── ui/                  ← Capa de presentación (Compose)
│   ├── screens/         ← Pantallas y subpantallas
│   │   ├── home/
│   │   ├── detail/
│   │   └── ...
│   ├── components/      ← Elementos visuales reutilizables
│   ├── theme/           ← Colores, tipografía, formas
│   ├── navigation/      ← Graph de navegación Compose
│   └── viewmodel/       ← Lógica de UI + comunicación con domain
│
└── di/                  ← Inyección de dependencias (Hilt o Koin)
```