def call(stage) {
    def message = "Build ${env.BUILD_NUMBER} status: FAILED. Failed Stage: ${stage}. Please go to ${env.BUILD_URL} for more information."
    def recipient = "Pull Request Owner"
    def subject = "Build ${env.BUILD_NUMBER} status: FAILED"
    sendEmail("${recipient}", "${subject}", "${message}")
}