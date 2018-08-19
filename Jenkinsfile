
pipeline {
    agent any

    // clearing the failed branches
    options {buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '4'))}

    stages {

        stage('code_coverage'){
            steps{
                bat 'mvn clean cobertura:cobertura'
            }
        }

        stage('build') {
          steps {
            bat 'mvn install'
          }
        }




    }
}