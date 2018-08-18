#!/usr/bin/env groovy

pipeline {
    agent any
        stage('Build') {
            step {
                sh 'mvn -B -DskipTests clean package'
            }

    }
}