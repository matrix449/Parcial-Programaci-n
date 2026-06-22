# Requisitos del Proyecto - JuninComercial (SAPC)

Este proyecto es una aplicación JavaFX configurada con Maven.

## Requisitos de Sistema
- **Java JDK 21**: El proyecto está configurado para compilar y ejecutarse con Java 21.
- **Conexión a Internet**: Necesaria la primera vez para que Maven descargue las dependencias de JavaFX.

## Cómo ejecutar el proyecto

Para lanzar la aplicación con todos los módulos de JavaFX correctamente configurados, utiliza el Maven Wrapper incluido en la raíz del proyecto:

```powershell
./mvnw.cmd javafx:run
```

## Notas Técnicas
- **JavaFX**: No es necesario instalar JavaFX por separado en el sistema; Maven descarga automáticamente las librerías `javafx-controls` y `javafx-fxml` (versión 21) según lo definido en el `pom.xml`.
- **Compilación**: Si solo deseas compilar sin ejecutar, usa:
  ```powershell
  ./mvnw.cmd clean compile
  ```
