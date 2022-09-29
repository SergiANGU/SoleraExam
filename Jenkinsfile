pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/SergiANGU/SoleraExam.git'
                bat '.\mvnw clean compile'
            }
        }
    }
}