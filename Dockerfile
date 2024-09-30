# Utiliza una imagen base con OpenJDK 17 y Maven 3.8.1
FROM maven:3.8.1-openjdk-17 AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo pom.xml y descarga las dependencias
COPY pom.xml ./
RUN mvn dependency:go-offline -B

# Copia el resto de los archivos del proyecto
COPY . .

# Construye la aplicación
RUN mvn clean install

# Cambia a una imagen más ligera de OpenJDK 17 para la ejecución
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR de tu aplicación al directorio de trabajo
COPY --from=build /app/target/NameIETI-0.0.1-SNAPSHOT.jar .

# Exponer el puerto que utilizará la aplicación
EXPOSE 8080

# Define el comando de inicio de la aplicación
CMD ["java", "-jar", "NameIETI-0.0.1-SNAPSHOT.jar"]
