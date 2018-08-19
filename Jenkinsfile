
pipeline {
  agent any


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
            bat "git remote set-url origin https://thedatatechie:1kiviku1@github.com/thedatatechie/jenkinstest1.git"

            // deletes current snapshot tag
            bat "git tag -d snapshot"
            // tags current changeset
            bat "git tag -a snapshot -m \"passed CI\""

            // pushes the tags
            bat "git push --tags"

        }
    }
  }
}