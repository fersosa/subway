#!/bin/sh

PORT=8080

if [ -n "$1" ]; then
   PORT="$1"
fi

#mvn package
java -agentlib:jdwp=transport=dt_socket,server=y,address=8000,suspend=n -jar subway-parent/subway-web/target/dependency/jetty-runner.jar --port $PORT subway-parent/subway-web/target/*.war
