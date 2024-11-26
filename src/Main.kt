//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val a1 = arrayListOf<String>("correr","saltar","correr","saltar","correr")
    val a2 = arrayListOf<String>("correr", "correr", "correr", "saltar", "correr")
    val a3 = arrayListOf<String>("correr", "correr", "saltar", "saltar", "correr")
    val a4 = arrayListOf<String>("correr", "correr", "saltar", "saltar", "correr")
    val a5 = arrayListOf<String>("correr", "saltar", "correr", "saltar")
    val a6 = arrayListOf<String>("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr")
    val a7 = arrayListOf<String>("saltar", "saltar", "saltar", "saltar", "saltar")
    val a8 = arrayListOf<String>("saltar", "saltar", "saltar", "saltar", "saltar")


    val c1:String = "_|_|_"


}

private fun Carrera(a:Array<String>,c:String){

    for (i in a.indices){
        if(a[i]=="correr" && c[i] == '_'){
            print("_")
        }else if(a[i]=="correr" && c[i] == '|'){
            print("/")
        }else if(a[i]=="saltar" && c[i] == '|'){
            print("|")
        }else if(a[i]=="saltar" && c[i] == '_'){
            print("x")
        }else print("?")

    }
}



