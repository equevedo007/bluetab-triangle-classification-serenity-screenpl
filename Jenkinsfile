pipeline {
    agent any

    environment {
        MAVEN_OPTS = "-Dmaven.repo.local=.m2/repository"
        REPORT_DIR = "target/site/serenity"
    }

    tools {
        maven 'maven'
        jdk 'jdk-21'
    }

    options {
        timeout(time: 15, unit: 'MINUTES')   // Evita bloqueos
        buildDiscarder(logRotator(numToKeepStr: '10'))  // Guarda solo últimos builds
        timestamps()  // Registra con tiempo
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean verify'
            }
        }

        stage('Generate Serenity Report') {
            steps {
                sh 'mvn serenity:aggregate'
            }
        }

        stage('Publish Report URL') {
            steps {
                echo "Puedes ver el reporte en: https://itsolutioncompany.net/reports/bluetab-triangle"
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
