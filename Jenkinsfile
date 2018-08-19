
pipeline {
    agent any
    // clearing the failed branches
    options {buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '4', artifactNumToKeepStr: '3'))}

    stages {

        stage('build') {
          steps {
            bat 'mvn clean install'
          }
        }

        stage('publish'){
            steps{
                bat("git config user.email vijaymec@gmail.com")
                bat("git config user.name 'thedatatechie'")
                bat "git remote set-url origin https://github.com/thedatatechie/jenkinstest1.git"

                // deletes current snapshot tag
                bat "git tag -d snapshot"
                bat "git push --delete origin snapshot"
                // tags current changeset
                bat "git tag -a snapshot -m \"passed CI\""

                // pushes the tags
                bat "git push --tags"
            }
        }
    }
}