FROM ibmjava:sfj

LABEL maintainer="Rasool Ansari Shaik"
LABEL description="Hello Hi K8s spring boot application"

RUN apt-get update -y
RUN apt-get dist-upgrade -y

COPY target/hello-hi-k8s-0.0.1-SNAPSHOT.jar hello-hi-k8s.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hello-hi-k8s.jar"]
