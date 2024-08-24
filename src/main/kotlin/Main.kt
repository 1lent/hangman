
import java.util.*


fun main() {
    val reader = Scanner(System.`in`)

    val words = arrayOf("apple", "book", "chair", "dog", "elephant", "fish", "grape", "house", "ice", "jacket", "kite", "lamp", "moon", "nest", "orange", "pencil", "queen", "rain", "sun", "tree")
    val randomwords = words.randomOrNull()

    for (i in 1..10) {
        println("Loading.. ")
    }

    //println("\nThe word has $length letters")
    val result: String

    println("Enter a word to guess (lowecase): ")
    val guess = reader.next()
    var hangmancount = 0

    while (true) {
        if (guess == randomwords) {
            println("You got it!")
            break
        } else {
            println("You got it wrong!")
            hangmancount++
            println("Hangman errors: $hangmancount")
            println("It was $randomwords")
            for (i in 1..10) {
                println("Loading new game...")
            }
            println("Enter a word to guess (lowecase): ")
            val guess = reader.next()
            continue

        }
    }}