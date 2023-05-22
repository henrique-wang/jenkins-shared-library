def call(Map config = [:]) {
    sh "to: ${config.to}"
    sh "subject: ${config.subject}"
    sh "body: ${config.body}"
}