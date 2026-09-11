pipeline {
    agent any

    environment {
        PATH = "/opt/homebrew/bin:/opt/homebrew/opt/openjdk@21/bin:${env.PATH}"
        JAVA_HOME = "/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/sudheer04k-ai/jenkins-sdet-cicd.git'
            }
        }

        stage('Environment Check') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/junitreports/*.xml'

            archiveArtifacts artifacts: 'target/surefire-reports/**',
                    allowEmptyArchive: true
        }
    }
}