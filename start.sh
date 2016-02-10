#!/bin/sh

PORT=8080

if [ -n "$1" ]; then
   PORT="$1"
fi

java -jar subway-parent/subway-web/target/dependency/jetty-runner.jar --port $PORT subway-parent/subway-web/target/*.war