pipeline {
    agent any
	
	tools{
		maven 'maven'
		jdk 'jdk8'
	}
    stages {
		stage('initialize'){
			steps{
				sh '''
					echo "PATH = ${PATH}"
					echo "M2_HOME = ${M2_HOME}"
				'''
			}
		}
        stage('build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
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
			junit 'target/surefire-reports/*.xml'
		}
	}
}
