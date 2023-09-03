pipeline {
    agent any
    stages {
        stage ('Example') {
            steps {
                script { 
                    sayHello 'Nothing to do!'
                }
            }
        }
        stage ('Branch AND Tag') {
            steps {
                branch_tag_name(env.BRANCH_NAME, env.TAG_NAME)
                }
        }
        stage ('Condition') {
            steps {
                script { 
                    condition(env.BRANCH_NAME)
                }
            }
        }
        /*
        stage ('destablize') {
            steps {
                unstablizer()
            }
        }
        */
                
        stage ('try catch') {
            steps {
                
                try_catch()
            }
        }

         stage ('commands') {
            steps {
                commandRun('ls')
            }
        }

        stage ('looops') {
            steps {
                script {
                def map = [Io: 1, Europa: 2, Ganymed: 3];
                looops(map)
                }
            }
        }
 
    }
}
