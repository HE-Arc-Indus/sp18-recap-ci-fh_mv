pipeline {
    agent { docker { image 'maven:4.0.0' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
		stage('test') {
			steps {
				sh 'mvn test'
			}
		}
    }
	
	post {
		always {
			junit "target/surefire-reports/*.xml"
		}
	}
}