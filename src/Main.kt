/**
 * ------------------------------------------------------------------------
 * OLD GOLD GAME
 * Level 2 programming project
 *
 * by TYLER EGGERS
 *
 * BRIEF PROJECT DESCRIPTION HERE
 * BRIEF PROJECT DESCRIPTION HERE
 * BRIEF PROJECT DESCRIPTION HERE
 * ------------------------------------------------------------------------
 */

/**
 * basics
 * Set up board ✔
 * get player names ✔
 * randomise pieces ✔
 * differentiate between normal and gold coins ✔
 * set up piece movement
 * turn rotation ✔
 * check for winning 
 * end game

 * extras
 * check for move legality
 * changeable grid size and coin count

 */
/**
 * Program entry point
 */
fun main() {
    val board = mutableListOf <String> ()

    setupGame(board)
    /**
     * getting player names
     */
    println("now who's playing today")
    val playerOne = readln()
    println("and who is the opponent today")
    val playerTwo = readln()



    showIntro()
    var currentPlayer = playerOne

    // Main game loop
    while (true) {
        showBoard(board)
        playerMove(board, currentPlayer)

        if (currentPlayer == playerOne) {
            currentPlayer = playerTwo
        }
        else {
            currentPlayer = playerOne
        }
    }
}


fun showIntro() {

    /**
     * explaining the rules of the game
     */
    println("welcome to Old Gold")
    println("the rules of this game are pretty simple")
    println("you can only move the coins to the left, once they're at the end of the line you may take it")
    println("the goal of the game is to be the one to take the gold coin")
    println("you may not move a coin through another coin")



}


fun setupGame(board: MutableList<String>) {
    repeat(15){
        board.add(" ")
    }
    repeat(4){
        board.add("C")
    }
    board.add("G")

    board.shuffle()
}


fun showBoard(board:MutableList<String>) {
    /**
     * setting up board
     */

    print("┌────┐".repeat(board.size))
    println("┐")

    for (square in board) {
        print("| %-2s |".format(square))
    }
    println("|")

    // Build bottom
    print("└────┘".repeat(board.size))
    println("┘")


}

fun playerMove(board: MutableList<String>, name: String) {

    println("Your turn $name")
    println("what coin would you like to move?")
    var movedFrom = readln()
    println("and where would you like to move it?")
    var movedTo = readln()




}