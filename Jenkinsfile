pipeline {
    agent none
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
        stage ('destable') {
            steps {
                    unstablizer()
                }
        }
 
    }
}
