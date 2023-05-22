def call(to, subject, body) {
    sh "to: ${config.to}"
    sh "subject: ${config.subject}"
    sh "body: ${config.body}"
}