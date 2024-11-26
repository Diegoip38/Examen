//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("se encuentran balanceadas estas expresiones?")
    println("{3*([34*2]/7)}: "+balanceado("{3*([34*2]/7)}"))
    println("{a + b [c] * (2x2)}}}}: "+balanceado("{a + b [c] * (2x2)}}}}"))
    println("{ [ a * ( c + d ) ] - 5 }: "+balanceado("{ [ a * ( c + d ) ] - 5 }"))
    println("{a^4 + (ax4)}: "+balanceado("{a^4 + (ax4)}"))
    println("{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }: "+balanceado("{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"))
    println("(a: "+balanceado("(a"))
    println("{{{{{{(}}}}}}: "+balanceado("{{{{{{(}}}}}}"))

}


private fun balanceado(ex: String): Boolean {
    val sim = mapOf('{' to '}', '[' to ']', '(' to ')')
    var st = arrayListOf<Char>()
    ex.forEach {
        if (it in sim.values) {
            if (st.isEmpty() || sim[st.last()] != it) {
                return false
            }
            st.removeAt(st.lastIndex)
        } else if (it in sim.keys) {
            st.add(it)
        }
    }
    return st.isEmpty()
}

