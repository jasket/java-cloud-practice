#!/usr/bin/env bash
mvn install -f ${HOME}/practice-config/pom.xml -DskipTests=true
yes | cp -rf ${HOME}/practice-config/target/practice-config-0.0.1-SNAPSHOT.jar ${HOME}/devops/config/source/