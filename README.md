# PK-Tasks - Lista de Tareas en Java

**PK-Tasks** es una aplicación de escritorio desarrollada en Java utilizando **JavaFX**. Permite gestionar una lista de tareas de forma intuitiva, visual y eficiente, ideal para organizar actividades personales o académicas.

## 🛠️ Tecnologías utilizadas

- Java 21
- JavaFX 17
- Gradle / IntelliJ IDEA (u otro entorno de desarrollo compatible)
- Launch4j (para generar el ejecutable `.exe`)

## 📦 Estructura del proyecto

```
PK-Tasks-Lista-De-Tareas-Java/
├── src/
│   └── main/
│       ├── java/
│       │   └── org.example.pktaskslistadetareasjava/
│       └── resources/
│           └── org.example.pktaskslistadetareasjava/
│               └── icon.png
├── out/
│   └── artifacts/
│       └── PK_Tasks_Lista_De_Tareas_Java_jar/
│           └── PK_Tasks_Lista_De_Tareas_Java.jar
└── README.md
```

## 🚀 Ejecución

### Opción 1: Desde consola

Ejecutar el `.jar` con JavaFX:

```bash
java --module-path "C:\javafx-sdk-17.0.15\lib" --add-modules javafx.controls,javafx.fxml -jar PK_Tasks_Lista_De_Tareas_Java.jar
```

> ⚠️ Asegúrate de tener instalada la versión correcta de JavaFX y que el path sea válido.

---

### Opción 2: Ejecutable `.exe` con Launch4j

1. Abre Launch4j y configura lo siguiente:
   - **Output file**: `PK-Tasks.exe`
   - **Jar**: Ruta completa al `.jar` generado por IntelliJ.
   - **JRE Min Version**: `21`
   - **VM options**:  
     ```
     --module-path C:\javafx-sdk-17.0.15\lib --add-modules javafx.controls,javafx.fxml
     ```
2. Haz clic en **Build wrapper**.
3. Ejecuta `PK-Tasks.exe`.

---

## 📋 Funcionalidades

- ✅ Añadir nuevas tareas
- ✅ Marcar tareas como completadas
- ✅ Eliminar tareas
- ✅ Interfaz moderna y limpia con JavaFX
- ✅ Icono personalizado

---

## 📌 Requisitos

- Java JDK 21 o superior
- JavaFX SDK 17
- Launch4j (solo si deseas generar un `.exe`)

---

## 👤 Autor

**Juan Pablo Vera Morales**  
Facultad de Ingeniería, UNAM  
Materia: Programación Orientada a Objetos (POO)  
Semestre 2025-1

---

## 📄 Licencia

Este proyecto es de uso académico. Puedes modificarlo y distribuirlo para fines educativos.
