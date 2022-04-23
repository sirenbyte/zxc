FROM openjdk:8-jre-alpine
MAINTAINER Abzal <abzal.tugan@gmail.com>

ENV TZ=Asia/Almaty
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
VOLUME /tmp
ARG JAR_FILE
ADD ./target/keloyna-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap","-jar","/app/keloyna-0.0.1-SNAPSHOT.jar"]