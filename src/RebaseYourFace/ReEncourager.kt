package RebaseYourFace

class ReEncourager {
    fun encourage(checker: AwesomeChecker) {
        if (checker.isAwesome() > 0) {
            println("You're still awesome")
        } else {
            println("It's been a good run but it's time to step aside")
        }
    }
}

