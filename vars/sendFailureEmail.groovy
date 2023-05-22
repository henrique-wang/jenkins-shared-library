def call(Map config = [:]) {
    def message = "Build ${env.BUILD_NUMBER} status: FAILED. Failed Stage: ${config.stage}. Please go to ${env.BUILD_URL} for more information."
    def recipient = "Pull Request Owner"
    def subject = "Build ${env.BUILD_NUMBER} status: FAILED"
    sendEmail(to: '${recipient}', subject: '${subject}', body: '${message}')
}