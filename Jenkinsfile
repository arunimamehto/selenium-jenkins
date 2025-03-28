pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'github-cc', url: 'https://github.com/arunimamehto/selenium-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'  // Publish test results
        }
    }
}
