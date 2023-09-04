def call(secretId) {
    def SECRET = com.cloudbees.plugins.credentials.SystemCredentialsProvider.getInstance().getStore().getCredentials(com.cloudbees.plugins.credentials.domains.Domain.global()).find { it.getId().equals(secretId) }.getSecret().getPlainText()
    env['USER'] = SECRET
    echo "gooooo  " + env['USER']
    echo 'ekleme yapildiii'
}