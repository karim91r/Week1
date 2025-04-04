package Sudoku_project
import Ipv4_project.test

fun main(){
    test(
        name = "should return true when given a valid 3x3 sudoku (filled board)",
        result = isValidSudokuBoard(
            arrayOf(
                arrayOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                arrayOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                arrayOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                arrayOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                arrayOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                arrayOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                arrayOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                arrayOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                arrayOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = true
    )
    test(
        name = "should return true when given a valid 3x3 sudoku (empty board)",
        result = isValidSudokuBoard(
            Array(9) { Array(9) { "-" } } // 9x9 grid filled with '-'
        ),
        correctResult = true
    )
    test(
        name ="should return false when given a 3x3 sudoku with a duplicate in a row",
        result= isValidSudokuBoard(
            arrayOf(
                arrayOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                arrayOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                arrayOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                arrayOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                arrayOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                arrayOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                arrayOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                arrayOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                arrayOf("3", "4", "5", "2", "8", "6", "1", "1", "9")
            )
        ),
        correctResult = false
    )
    test(
        name="should return false when given a 3x3 sudoku with a duplicate in a column",
        result = isValidSudokuBoard(
            arrayOf(
                arrayOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                arrayOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                arrayOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                arrayOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                arrayOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                arrayOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                arrayOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                arrayOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                arrayOf("3", "5", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )
    test(
        name = "should return false when given a 3x3 sudoku with a duplicate in a 3x3 sub-grid",
        result = isValidSudokuBoard(
            arrayOf(
                arrayOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                arrayOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                arrayOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                arrayOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                arrayOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                arrayOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                arrayOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                arrayOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                arrayOf("3", "4", "5", "2", "8", "6", "1", "9", "9")
            )
        ),
        correctResult = false
    )
}



