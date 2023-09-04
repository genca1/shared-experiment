pipeline {
    agent any
    environment {
        USER = 'AA'
    }
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
                script {
                    sayHello 'Nothing to do!'
                }
                commandRun('ls')
            }
        }

        /*
        stage ('matching') {
            steps {
                match_them_all(USA)
            }
        }
        */

        stage ('seeUsername') {
            steps {
                script {
                    echo "USER..: ${USER}"
                }
                usernameGetter('A1')
                script {
                    echo "USER..: ${USER}"
                }
                script {
                    echo "SECRET..: ${USER}"
                }
                usernameGetter('B1')
                script {
                    echo "SECRET..: ${USER}"
                }
            }
        }

        /*
        stage ('looops') {
            steps {
                script {
                def map = [Io: 1, Europa: 2, Ganymed: 3];
                loop(map)
                map[Moon: 4];
                loop(map)
                }
            }
        }
        */
 
    }
}
