//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println ("introduzca su primera palabra")
    val p1 : String = readln()

    println ("introduzca su segunda palabra")
    val p2 : String = readln()

    println(Anagrama(p1, p2))
}

private fun Anagrama (p1 : String, p2 : String):Boolean {

    if (p1.lowercase() == p2.lowercase()){
        return false
    // reducir a minuscula, combertirlo en un array de chars y  con sortedArray colocarlos en orden alfabetico
    }else if (return p1.lowercase().toCharArray().sortedArray().contentEquals( p2.lowercase().toCharArray().sortedArray())){
        println("true")
    }
    // sin escepcion para palidromos
}