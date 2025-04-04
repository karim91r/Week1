package Sudoku_project

fun main(){

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