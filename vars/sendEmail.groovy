def call(String to, String subject, String body) {
    sh "to: ${config.to}"
    sh "subject: ${config.subject}"
    sh "body: ${config.body}"
}