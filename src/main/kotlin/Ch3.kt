import kotlin.random.Random

/*fun main(args : Array<String>){
    var choices = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(choices)
    val userChoice = getUserChoice(choices)
    printResult(userChoice, gameChoice)

}

fun getGameChoice(choices : Array<String>) : String {
    val pick = Random.nextInt(choices.size)
    return choices[pick]
}

fun getUserChoice(choices : Array<String>) : String {
    var isValidChoice = false
    var userChoice = ""

    while(!isValidChoice){
        print("Please choose one of the following:")
        for(option in choices) print(" $option")

        val userInput = readLine()

        if(userInput != null && userInput in choices) {
            isValidChoice = true
            userChoice = userInput
        } else print("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    if(userChoice == gameChoice) result = "Tie!"

    else if((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Scissors" && gameChoice == "Paper") ||
            (userChoice == "Paper" && gameChoice == "Rock"))
        result = "You win!"

    else result = "You lose!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}*/