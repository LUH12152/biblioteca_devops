pipeline{
    agent any

    tools{
        jdk 'jdk-17'
        maven 'Maven3.9.11'
    }

    stages{

    stage('Show message'){
        steps{
          bat 'echo "Primer stage del pipeline"'
          bat 'echo "A continuacion hacemos el checkout del proyecto"'
          }
    }
       stage('Checkout proyecto'){
            steps{
                git branch: 'master',
                    url: 'https://github.com/LUH12152/biblioteca_devops.git'
               }
            }
       stage('Maven Clean'){
            steps{
            bat 'mvn clean'
            }
       }
    }
}