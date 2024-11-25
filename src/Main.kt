//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println(balanceado("{3*([34*2]/7)}}"))

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

