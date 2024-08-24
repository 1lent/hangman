
import java.util.*


fun main() {
    val reader = Scanner(System.`in`)
    println("Enter A Word: ")
    val first = reader.next()
    val length = first.count()


    for (i in 1..50) {
        println("[!] MAKING SPACE [!]")
    }



    println("\nThe word has $length letters")
    val result: String

    println("Enter a word to guess:")
    val guess = reader.next()
    var hangmancount = 0

    if (guess != first) {
        println("You got it wrong")
        hangmancount++
        print("Hangman errors: $hangmancount")
    } else {
        println("You got it!")




    }





}