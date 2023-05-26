def sendEmail(String to, String subject, String body) {
    sh "echo to: ${to}"
    sh "echo subject: ${subject}"
    sh "echo body: ${body}"
}

def sendFailureEmail(String stage, String recipient) {
    def message = "Build ${env.BUILD_NUMBER} status: FAILED. Failed Stage: ${stage}. Please go to ${env.BUILD_URL} for more information."
    def subject = "Build ${env.BUILD_NUMBER} status: FAILED"
    sendEmail("${recipient}", "${subject}", "${message}")
}

def sendSuccessEmail(String recipient) {
    def message = "Build ${env.BUILD_NUMBER} status: SUCCESS. Please go to ${env.BUILD_URL} for more information."
    def subject = "Build ${env.BUILD_NUMBER} status: SUCCESS"
    sendEmail("${recipient}", "${subject}", "${message}")
}