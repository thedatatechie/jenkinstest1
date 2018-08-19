
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
            bat "git remote set-url origin git@github.com:..."

            // tags current changeset
            bat "git tag -a snapshot -m \"passed CI\""

            // pushes the tags
            bat "git push --tags"

        }
    }
  }
}