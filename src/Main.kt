//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val a1 = listOf("correr","saltar","correr","correr")
    val a2 = listOf("correr","saltar","correr")

    val c1 : String = "_|_"
    val c2 : String = "_||"

    println(Carrera(a1,c1))
    println(Carrera(a2,c1))
    println(Carrera(a2,c2))

}

private fun Carrera(a:List<String>,c:String):Boolean{



    val cm = c.toMutableList()


    for (i in a.indices){


        when (a[i]){
            "correr" ->{
                if( cm[i] == '|'){
                    cm[i]='/'
                    print(cm)
                    return false
                }
            }
            "saltar"-> {
                if (cm[i] == '_') {
                    cm[i] = 'x'
                    print(cm)
                    return false
                }
            }
        }
        if  (a.size != c.length){
            val min = minOf(a.size , c.length)
            for (j in 0 until min){
                cm.add('?')
                print(cm)
                return false
            }
        }
    }
    print(cm)
    return true
}



