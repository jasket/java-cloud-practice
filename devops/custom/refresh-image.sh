#!/usr/bin/env bash
mvn install -f ${HOME}/custom-service/pom.xml -DskipTests=true
yes | cp -rf ${HOME}/custom-service/target/custom-service-0.0.1-SNAPSHOT.jar ${HOME}/devops/custom/source/