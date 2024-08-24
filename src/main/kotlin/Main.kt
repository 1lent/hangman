
import java.util.*


fun main() {
    val reader = Scanner(System.`in`)

    val words = arrayOf("apple", "book", "chair", "dog", "elephant", "fish", "grape", "house", "ice", "jacket", "kite", "lamp", "moon", "nest", "orange", "pencil", "queen", "rain", "sun", "tree")
    val randomwords = words.randomOrNull()

    for (i in 1..2) {
        println("Loading.. ")
    }

    //println("\nThe word has $length letters")
    val result: String

    println("Enter a word to guess (lowecaser): ")
    val guess = reader.next()
    var hangmancount = 0

    while (true) {
        if (guess == randomwords) {
            println("You got it!")
            break
        } else {
            println("\nYou got it wrong!")
            hangmancount++
            println("Hangman errors: $hangmancount")
            println("It was $randomwords")
            for (i in 1..2) {
                println(" ")

            }
            println("Enter a word to guess (lowecase): ")
            val guess = reader.next()
            continue

        }
    }}