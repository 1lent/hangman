
import java.util.*


fun main() {


    val words = arrayOf("apple", "book", "chair", "dog", "elephant", "fish", "grape", "house", "ice", "jacket", "kite", "lamp", "moon", "nest", "orange", "pencil", "queen", "rain", "sun", "tree")
    var randomWord = words.random()

    for (i in 1..2) {
        println("Loading.. ")
    }

    //println("\nThe word has $length letters")
    val result: String

    println("Enter a word to guess (lowercase): ")
    val guess = readln()
    var hangmancount = 0

    while (true) {
        if (guess == randomWord) {
            println("You got it!")
            break
        } else {

            println("\nYou got it wrong!")
            hangmancount++
            println("Hangman errors: $hangmancount")
            println("It was $randomWord")
            for (i in 1..2) {
                println(" ")
            }
            println("Enter a word to guess (lowercase): ")
            randomWord = words.random()
            var randomWord = words.random()
            val guess = readln()
            continue
        }
    }}