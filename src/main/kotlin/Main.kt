
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

    println("Enter a word to guess:")
    val guess = reader.next()
    var hangmancount = 0

    if (guess != randomwords) {
        println("You got it wrong")
        hangmancount++
        print("Hangman errors: $hangmancount")
    } else {
        println("You got it!")
    }
}