def sendEmail(String to, String subject, String body) {
    sh "to: ${to}"
    sh "subject: ${subject}"
    sh "body: ${body}"
}

def sendFailureEmail(String stage) {
    def message = "Build ${env.BUILD_NUMBER} status: FAILED. Failed Stage: ${stage}. Please go to ${env.BUILD_URL} for more information."
    def recipient = "Pull Request Owner"
    def subject = "Build ${env.BUILD_NUMBER} status: FAILED"
    sendEmail("${recipient}", "${subject}", "${message}")
}

def sendSuccessEmail() {
    def message = "Build ${env.BUILD_NUMBER} status: SUCCESS. Please go to ${env.BUILD_URL} for more information."
    def recipient = "Pull Request Owner"
    def subject = "Build ${env.BUILD_NUMBER} status: SUCCESS"
    sendEmail("${recipient}", "${subject}", "${message}")
}