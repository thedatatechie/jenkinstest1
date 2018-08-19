
pipeline {
    agent any
    // clearing the failed branches
    options {buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '4'))}

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

        stage ('deploy') {
            steps{
                    archiveArtifacts artifacts: '**', fingerprint: true
                    bat "copy /y \"target/jenkinstest2-1.0-SNAPSHOT-jar-with-dependencies.jar\" \"C:/jar_files/jenkinstest2-1.0-SNAPSHOT-jar-with-dependencies.jar\""
                    //bat 'cp target/jenkinstest2-1.0-SNAPSHOT-jar-with-dependencies.jar C:/jar_files/'

                    //bat ‘ssh user@server rm -rf /var/www/temp_deploy/dist/’
                    //bat ‘ssh user@server mkdir -p /var/www/temp_deploy’
                    //bat ‘scp -r dist user@server:/var/www/temp_deploy/dist/’
                    //bat ‘ssh user@server “rm -rf /var/www/example.com/dist/ && mv /var/www/temp_deploy/dist/ /var/www/example.com/”’
            }
        }
    }
}