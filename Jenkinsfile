pipeline {
    agent any                  // Exécute sur n'importe quel agent Jenkins

    tools {
        maven 'Maven-3.9'      // Nom du Maven configuré dans "Manage Jenkins > Tools"
        jdk   'JDK-17'         // Nom du JDK configuré
    }

    stages {
        stage('Récupérer le code') {
            steps {
                echo 'Checkout du code...'
                checkout scm
            }
        }

        stage('Compilation') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        always {
            echo 'Fin du pipeline'
        }
        success {
            echo 'Build réussi !'
        }
        failure {
            echo 'Échec du build'
        }
    }
}
