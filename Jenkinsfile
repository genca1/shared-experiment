pipeline {
    agent none
    stages {
        stage ('Example') {
            steps {
                // log.info 'Starting' 
                script { 
                    sayHello 'Nothing to do!'
                }
            }
        }
         stage ('Branch AND Tag') {
            steps {
                // log.info 'Starting' 
                script { 
                    branch_tag_name(env.BRANCH_NAME, env.TAG_NAME)
                }
            }
        }
         stage ('Condition') {
            steps {
                // log.info 'Starting' 
                script { 
                    condition(env.BRANCH_NAME)
                }
            }
        }
    }
}
