package POKEMON

class Pokemon (id:Int, nombre:String, vida:Int, var tipo:String, tipoAtaca:String) {

    var id: Int=0
        set(value){
            if(value < 0){
                throw Exception("El id no puede ser menor que cero")
            }
            field = value
        }
    var nombre: String=""
    var vida: Int=0
        set(value){
            if(value < 0){
                throw Exception("La vida no puede ser menor que cero")
            }
            field = value
    var tipoAtaca: String=""

    var tipo=Tipo(tipo)
    var listaAtaques= listOf<String>("","","","")
    }

    override fun toString(): String{
        return "Hola mi nombre es $nombre, tengo $vida de vida y soy de tipo ${Tipo(tipo)}"
    }

}