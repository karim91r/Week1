package Sudoku_project

fun main(){
    val x:Boolean= isValidSudokuBoard(
        arrayOf(
            arrayOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
            arrayOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
            arrayOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
            arrayOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
            arrayOf("4", "2", "6", "-", "5", "3", "7", "9", "1"),
            arrayOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
            arrayOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
            arrayOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
            arrayOf("3", "-", "5", "2", "8", "6", "1", "7", "9")
        )
    )
    println(x)
}

fun isValidSudokuBoard(board:Array<Array<String>>):Boolean{
    for(row in board){
        val num= mutableSetOf<String>()
        for(element in row){
            if(element!="-"&& !num.add(element))return false
        }
    }
    for(column in 0..<9){
        val num= mutableSetOf<String>()
        for(element in 0..<9){
            val cell=board[element][column]
            if(cell!="-"&& !num.add(cell))return false
        }
    }
    for(startColumn in listOf(0,3,6)){
        for(startRow in listOf(0,3,6)){
            val box= mutableSetOf<String>()
            for (row in startRow..<startRow+3){
                for(column in startColumn..<startColumn +3){
                    val cell=board[row][column]
                    if(cell!="-"&&!box.add(cell)) return false
                }
            }
        }
    }
    return true
}