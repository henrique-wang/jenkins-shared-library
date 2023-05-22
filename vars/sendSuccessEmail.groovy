def call() {
    def message = "Build ${env.BUILD_NUMBER} status: SUCCESS. Please go to ${env.BUILD_URL} for more information."
    def recipient = "Pull Request Owner"
    def subject = "Build ${env.BUILD_NUMBER} status: SUCCESS"
    sendEmail(to: '${recipient}', subject: '${subject}', body: '${message}')
}