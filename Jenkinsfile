pipeline {
    agent any

    environment {
        MAVEN_OPTS = "-Dmaven.repo.local=.m2/repository"
    }

    tools {
        maven 'maven'
        jdk 'jdk-17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/equevedo007/bluetab-triangle-classification-serenity-screenpl.git'
            }
        }

        stage('Clean & Verify') {
            steps {
                sh 'mvn clean verify -Dcucumber.filter.tags="@Triangulo and not @WIP"'
            }
        }

        stage('Generate Report') {
            steps {
                sh 'mvn serenity:aggregate'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/site/serenity/**', fingerprint: true
            junit '**/target/site/serenity/*.xml'
        }
    }
}
