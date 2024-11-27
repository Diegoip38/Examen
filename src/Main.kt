//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val matriz1 = arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("O", "X", "X"),
        arrayOf("O", "X", "O")
    )
    val matriz2 = arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("O", "X", "O"),
        arrayOf("X", "O", "X")
    )
    val matriz3 = arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("O", "O", "O"),
        arrayOf("X", "O", "X")
    )
    val matriz4 = arrayOf(
        arrayOf("X", "O", "X","O"),
        arrayOf("O", "O", "O","X"),
        arrayOf("X", "O", "X","O")
    )
    val matriz5 = arrayOf(
        arrayOf("", "", ""),
        arrayOf("", "", ""),
        arrayOf("", "", "")
    )

    println(analizarMatriz(matriz1))
    println(analizarMatriz(matriz2))
    println(analizarMatriz(matriz3))
    println(analizarMatriz(matriz4))
    println(analizarMatriz(matriz5))


}

fun analizarMatriz(matriz: Array<Array<String>>): String {

    if (matriz.size != 3 || matriz[0].size != 3) {
        return "Nulo"
    }
    var xC = 0
    var oC = 0
    for (i in matriz) {
        for (j in i) {
            if (j == "X") {
                xC++
            } else if (j == "O") {
                oC++
            }
        }
    }
    if (xC == 0 || oC == 0) {
        return "Nulo"
    }
    for (i in matriz) {
        if (i[0] == i[1] && i[1] == i[2] && i[0] != "") {
            return i[0]
        }
    }
    for (x in 0 until 3) {
        if (matriz[0][x] == matriz[1][x] && matriz[1][x] == matriz[2][x] && matriz[0][x] != "") {
            return matriz[0][x]
        }
    }
    if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != "") {
        return matriz[0][0]
    }
    if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != "") {
        return matriz[0][2]
    }
    for (i in matriz) {
        for (j in i) {
            if (j == "") {
                return "Nulo"
            }
        }
    }
    return "Empate"
}




