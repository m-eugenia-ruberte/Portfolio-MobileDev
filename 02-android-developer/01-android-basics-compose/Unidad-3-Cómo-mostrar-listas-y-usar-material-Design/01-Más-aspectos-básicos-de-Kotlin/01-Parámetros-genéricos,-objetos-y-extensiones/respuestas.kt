
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty{
    EASY, MEDIUM, HARD
}

interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()
}
class Quiz: ProgressPrintable{

    val q1 = Question<String>("Quoth the raven__", "nevermore", Difficulty.MEDIUM)
    val q2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val q3 = Question<Int>("How many days are ther between full moons", 28, Difficulty.HARD)

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar(){
        repeat(Quiz.answered){print("▓")}
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    fun printQuiz(){
        q1.let{
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        q2.let{
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        q3.let{
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }


    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 3
    }
}

fun main() {

    Quiz().apply{
        printQuiz()
    }

}

