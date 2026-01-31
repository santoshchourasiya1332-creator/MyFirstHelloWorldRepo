pipeline {
    agent any
    stages {
        stage('clone code') {
            steps 
                git branch: 'main', url: 'https://github.com/santoshchourasiya1332-creator/MyFirstHelloWorldRepo'
                
        }
    }
}
    stages {
        stage('compile java code') {
            steps 
                sh 'javac January26_2020.java'
        }
    }
}
    stages {
        stage('build') {
            steps 
                sh 'mvn package'
        }       
    }
}
