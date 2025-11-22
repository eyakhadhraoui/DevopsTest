pipeline {
    agent any

    environment {
        // Token GitHub enregistré dans Jenkins Credentials
        GIT_CREDENTIALS = 'github-token'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Clonage du dépôt GitHub...'
                git branch: 'main',
                    url: 'https://github.com/eyakhadhraoui/DevopsTest.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation du projet Maven...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Exécution des tests unitaires...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging de l’application...'
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build terminé avec succès !'
        }
        failure {
            echo 'Le build a échoué !'
        }
        always {
            echo 'Fin du pipeline.'
        }
    }
}
