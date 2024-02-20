FROM --platform=linux/amd64 openjdk:21-jdk-slim

WORKDIR /home/app
COPY  ./target/*.jar /home/app/app.jar
COPY  ./Mobile_Food_Facility_Permit.csv .

#RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
ENTRYPOINT  ["java","-jar","app.jar"]
EXPOSE 8080