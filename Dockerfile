FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

#Copia o .jar local se tiver
COPY backend/app-web/target/app-web-0.0.0.1-SNAPSHOT.jar /app/app-web.jar

#Copia a pasta dist release se tiver
COPY frontend/angular/front/dist/front/browser/. /app/static/


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app-web.jar"]