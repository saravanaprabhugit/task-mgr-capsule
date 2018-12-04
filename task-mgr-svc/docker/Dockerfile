FROM openjdk:8
ADD /task-mgr-svc-0.0.1-SNAPSHOT.jar task-mgr-svc-0.0.1-SNAPSHOT.jar
EXPOSE 6050
RUN bash -c 'touch /task-mgr-svc-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","task-mgr-svc-0.0.1-SNAPSHOT.jar"]