# jenkins-shared-library
Jenkins Pipeline - Shared library: this repository contains functions used in [Jenkins file study](https://github.com/henrique-wang/jenkins-scm).

## Functions

### sendEmail
- Description: simulates a function which sends an email. Receives 3 parameters ("to", "subject" and "body") and prints their values.
- Input: (String to, String subject, String body)

### sendFailureEmail
- Description: simulates a function that sends an email warning that the Jenkins job build failed.
- Input: (String stage, String recipient)

### sendSuccessEmail
- Description: simulates a function that sends an email telling the user that the Jenkins job build succeeded.
- Input: (String stage, String recipient)
