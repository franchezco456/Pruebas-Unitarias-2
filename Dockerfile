FROM ubuntu:latest
WORKDIR /workspace
COPY . .
RUN mvn clean test
