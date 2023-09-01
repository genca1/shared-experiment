#!/usr/bin/env groovy

def call() {
    return {
        echo "before join"
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

