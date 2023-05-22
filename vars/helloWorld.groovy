def call(Map config = [:]) {
    sh "echo Hello ${config.name} from develop branch. Today is ${config.dayOfWeek}."
}