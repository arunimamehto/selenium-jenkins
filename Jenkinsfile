pipeline {
    agent any  // Runs on any available Jenkins agent

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-repo/AmazonTestProject.git'  // Replace with your repo
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
            junit '**/target/surefire-reports/*.xml'  // Collect JUnit-compatible reports
        }
    }
}
