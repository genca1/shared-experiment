#!/usr/bin/env groovy

def call(String name = 'human') {
    pipeline { 
        agent any 
        stages {
            stage('Echo-name') {
                steps {
                    echo "Hello, ${name}."
                }
            }
            stage('Run-Branch Name') {
                steps {
                    echo "Branh name is... ${this.env.branch}"
                }
            }
        }
    }
}

