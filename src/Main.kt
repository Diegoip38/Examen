class Contacto(
    val tlf : String,
    var nombre : String
)

class Listadecontactos {
    private val lista = mutableListOf<Contacto>()

    fun CrearContacto(contacto: Contacto): Boolean {
        if (lista.size >= 10) {
            println("La lista de contactos está llena. No se puede agregar más contactos.")
            return false
        }
        if (lista.any { it.tlf == contacto.tlf }) {
            println("el contacto con telefono ${contacto.tlf} ya existe.")
            return false
        }
        lista.add(contacto)
        println("el contacto con telefono ${contacto.tlf} agregado.")
        return true
    }

    fun EliminarContacto(tlf: String): Boolean {
        lista.removeIf { it.tlf == tlf }
        println("Contacto con telefono $tlf eliminada.")
        return true
    }

    fun ObtenerContactoPorNombre(nombre: String): Contacto? {
        return lista.find { it.nombre == nombre }

    }

    fun ObtenerListaContactos(): List<Contacto> {
        return lista

    }

    fun ObtenerContactoPorNombreOTelefono(nombre: String? = null, tlf: String? = null): Contacto? {
        return lista.find { (it.nombre == nombre) || (it.tlf == tlf) }
    }

    fun EspacioRestante(){
        if (lista.size >= 10) {
            println("La lista de contactos está llena. No se puede agregar más contactos.")

        }else println("todavia queda espacio")
    }
    fun EspacioRestanteNumero(){
        if (lista.size >= 10) {
            println("La lista de contactos está llena. No se puede agregar más contactos.")

        }else println(10-lista.size)
    }

}


fun main() {

    val listadecontactos = Listadecontactos()

    listadecontactos.CrearContacto(Contacto("546686109","Diego"))
    listadecontactos.CrearContacto(Contacto("542286105","Marcos"))
    listadecontactos.CrearContacto(Contacto("146686108","Maria"))

    var option : Int

    do{
        println("^1.Añadir un contacto a la agenda: si no se pueden meter más contactos a la agenda se indicará por pantalla. No se pueden meter contactos que sean iguales." )
        println("^2.Listar todos los contactos de la agenda." )
        println("^3.Buscar un contacto por su nombre. Si lo encuentra muestra su teléfono y si no, se indica por pantalla." )
        println("4.Comprobar si un contacto existe." )
        println("^5.Eliminar un contacto. Indicar por pantalla si se eliminó o no." )
        println("^6.Indicar el número de contactos que se pueden añadir en la agenda, es decir, indicar el número de huecos libres." )
        println("^7.Comprobar si la agenda está llena." )
        println("^8.Salir.\n")
        println("escoge una opcion: ")

        option = readln().toInt()

        when (option) {
            1 ->{
                println("Introducca el nombre")
                var nombre :String= readln()
                println("Introducca el telefono")
                var tlf :String = readln()
                listadecontactos.CrearContacto(Contacto(tlf,nombre))
            }
            2 -> {
                listadecontactos.ObtenerListaContactos()
            }
            3 -> {
                println("Introducca el nombre")
                var nombre:String = readln()
                listadecontactos.ObtenerContactoPorNombre(nombre)
            }
            4 -> {
                println("presione 1 para buscar por telefono y 2 para buscar por nombre (puse cualquier otra tecla para salir)")

                var x:Int= readln().toInt()
                if(x==1){
                    println("Introducca el telefono")
                    var tlf:String = readln()
                    listadecontactos.ObtenerContactoPorNombreOTelefono(tlf)
                }else if(x==2){
                    println("Introducca el nombre")
                    var nombre:String = readln()
                    listadecontactos.ObtenerContactoPorNombreOTelefono(nombre)
                }
            }
            5 -> {
                println("Introducca el telefono")
                var tlf:String = readln()
                listadecontactos.EliminarContacto(tlf)
            }
            6 -> {
                listadecontactos.EspacioRestanteNumero()
            }
            7 -> {
                listadecontactos.EspacioRestante()
            }
            8->{println("Ha Salido")}
        }

    }while (option !=8)
}








