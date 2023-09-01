#!/usr/bin/env groovy

def call(def branch) {
    return {
        stage('staaaaage') {
            echo "New stage ${branch}"
            when{
                anyOf {
                    branch "master"
                }
            }
            steps {
                script {
                    echo "It works!!!"
                }
            }
        }
    }

