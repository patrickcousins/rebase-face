package RebaseYourFace

class Encourager {
    fun encourage(checker: AwesomeChecker) {
        if (checker.isAwesome() >= 0) {
            println("You're awesome")
        } else {
            println("Sad trombone")
        }
    }
}

