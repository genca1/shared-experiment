import jenkins.*
import jenkins.model.* 
import hudson.*
import hudson.model.*
def call(usernameId) {
    def jenkinsCredentials = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
            com.cloudbees.plugins.credentials.Credentials.class,
            Jenkins.instance,
            null,
            null
    );

    for (creds in jenkinsCredentials) {
            println(creds.id)
            if(creds.id == usernameId) {
                println('bulunduuuu..: ' + creds.id)
            } else {
                println('bulunamadi')
            }
    }
}