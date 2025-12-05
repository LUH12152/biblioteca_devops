pipeline{
    agent any

    tools{
        jdk 'jdk-21'
        maven 'Maven3.9.11'
    }

    environment{
        VERSION_BACK = "2.0.1"
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
       stage('Comandos Maven'){
            steps{
            bat 'mvn clean package'
            }
       }
       stage('Crear directorio'){
        steps{
        bat 'mkdir v%VERSION_BACK%'
        }
       }
    }
}
