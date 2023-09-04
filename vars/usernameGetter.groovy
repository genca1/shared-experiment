def call(usernameId) {
    def PASSWORD = com.cloudbees.plugins.credentials.SystemCredentialsProvider.getInstance().getStore().getCredentials(com.cloudbees.plugins.credentials.domains.Domain.global()).find { it.getId().equals(usernameId) }.getPassword()
    env['USER'] = PASSWORD
    echo "gooooo  " + env['USER']
    echo 'ekleme yapildiii'
}