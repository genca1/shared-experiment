def call(def username) {
    def creds = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
            com.cloudbees.plugins.credentials.common.StandardUsernamePasswordCredentials.class,
            jenkins.model.Jenkins.instance
    )

    def c = creds.findResult { it.username == username ? it : null }

    if (c) {
        println(c.id + " : " + c.description + " : " + c.password)
    } else {
        println "could not find credential for ${username}"
    }
}

