#!/usr/bin/env bash
mvn install -f ${HOME}/registry-service/pom.xml -DskipTests=true
yes | cp -rf ${HOME}/registry-service/target/registry-0.0.1-SNAPSHOT.jar ${HOME}/devops/registry/source/