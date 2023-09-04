import jenkins.*
import jenkins.model.* 
import hudson.*
import hudson.model.*
def call(usernameId) {
    def PASSWORD = com.cloudbees.plugins.credentials.SystemCredentialsProvider.getInstance().getStore().getCredentials(com.cloudbees.plugins.credentials.domains.Domain.global()).find { it.getId().equals(usernameId) }.getPassword()
    env['USER'] = PASSWORD
    echo 'ekleme yapildiii'
}