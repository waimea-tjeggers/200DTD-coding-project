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
 * randomise pieces
 * differentiate between normal and gold coins
 * set up piece movement
 * turn rotation
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
    val boardsize = mutableListOf <String> ()
repeat(times = 15){
    boardsize.add(" ")
}




    /**
     * getting player names
     */
    println("now who's playing today")
    val playerOne = readln()
    println("and who is the opponent today")
    val playerTwo = readln()



    showIntro()
    BoardSetUp(boardsize)
    StartTurnRotation(boardsize,playerOne,playerTwo)

}


fun showIntro() {

    /**
     * explaining the rules of the game
     */
    println("welcome to Old Gold")
    println("the rules of this game are pretty simple")
    println("you can only move the coins to the left, once they're at the end of the line you may take it")
    println("the goal of the game is to be the one to take the gold coin")
    println("you cannot move and remove a coin in the same turn")
    println("you may not move a coin through another coin")



}


fun BoardSetUp(boardsize:MutableList<String>) {
    /**
     * setting up board
     */

    print("┌────┐".repeat(boardsize.size))
    println("┐")

    for (board in boardsize) {
        print("| %-2s |".format(board))
    }
    println("|")

    // Build bottom
    print("└────┘".repeat(boardsize.size))
    println("┘")


}

fun StartTurnRotation(boardsize: MutableList<String>, playerOne: String, playerTwo: String) {
    println(playerOne)
    println(playerTwo)

}