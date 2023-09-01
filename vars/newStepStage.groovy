#!/usr/bin/env groovy

def call(def branch) {
    return {
        stage('staaaaage') {
            echo "new new"
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
}

