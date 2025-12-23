pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build application'
            }
        }

        stage('Test') {
            steps {
                echo 'Test Application'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy Application'
            }
        }
    }

    post {
        always {
            emailext(
                subject: 'Pipeline status',
                body: 'summary',
                to: 'veerabhadrappaj29@gmail.com'
            )
        }
    }
}
