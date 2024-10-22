pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from Git
                git 'https://github.com/AdvaitBothe1105/Java.git'
            }
        }
        stage('Build') {
            steps {
                // Use Maven to clean and build the Java project
                dir('Maven-Example') {
                    // Use Maven to build the project
                    sh 'mvn clean install'
                }
            }
        }
        stage('Test') {
            steps {
                // Run the unit tests
                sh 'mvn test'
            }
        }
    }
    post {
        success {
            echo 'Build successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
