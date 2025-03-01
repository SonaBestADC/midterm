pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'calculator-app'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/SonaBestADC/midterm.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh "docker build -t $DOCKER_IMAGE:$DOCKER_TAG ."
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    sh "docker stop $DOCKER_IMAGE || true"
                    sh "docker rm $DOCKER_IMAGE || true"
                    sh """
                    docker run -d --name calculator-container \\
                        -p 8080:8080 \\
                        $DOCKER_IMAGE:$DOCKER_TAG
                    """
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check logs for details.'
        }
    }
}

