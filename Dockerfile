FROM maven:3.8.7-openjdk-18 AS build

WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests


FROM amazoncorretto:17
ARG PROFILE=dev
ARG VERSION=1.2

WORKDIR /app
COPY --from=build /build/target/prep-*.jar /app
EXPOSE 8099

ENV DB_URL=jdbc:postgresql://postgres_prep_container:5432/prep_db
ENV APP_VERSION=${VERSION}
ENV ACTIVE_PROFILE=${PROFILE}

CMD java -Dspring.profiles.activate=${ACTIVE_PROFILE} -Dspring.datasource.url=${DB_URL} -jar prep-${APP_VERSION}.jar

