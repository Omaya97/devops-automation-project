pipeline {
    agent any
    tools{
        maven 'maven'
    }
 stages{
        stage('Build Maven'){
            steps{
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Omaya97/devops-automation-project']])
               sh 'mvn clean install'
            }
        }
         stage('Build docker image'){
            steps{
                script{
               sh 'docker build -t omayatestouri/devops-integration .'
                }
            }
         }
                    stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                sh "docker login -u omayatestouri -p ${123456789}"

                }
                   sh 'docker push omayatestouri/devops-integration'
                }
            }
        }
}   }