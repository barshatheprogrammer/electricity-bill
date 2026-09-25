pipeline {
    agent any

   tools {
    jdk 'JDK-17'
    maven 'mvn'
}

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Java project...'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running JUnit tests...'
                bat 'mvn test'
            }
        }
    }
}
