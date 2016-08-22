package RebaseYourFace

fun main(args: Array<String>) {

    val checker = AwesomeChecker()
    val encourager = Encourager()
    val reencourager = ReEncourager()

    encourager.encourage(checker)
    reencourager.encourage(checker)
}


