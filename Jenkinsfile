
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
    		sh("git config user.email vijaymec@gmail.com")
            sh("git config user.name 'thedatatechie'")

            sh "git remote set-url origin git@github.com:..."

            // deletes current snapshot tag
            sh "git tag -d snapshot || true"
            // tags current changeset
            sh "git tag -a snapshot -m \"passed CI\""
            // deletes tag on remote in order not to fail pushing the new one
            sh "git push origin :refs/tags/snapshot"
            // pushes the tags
            sh "git push --tags"

        }
    }
  }
}