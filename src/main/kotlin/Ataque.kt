class Ataque (nombre:String, tipo:String, fuerza:Int) {
    var fuerza:Int = 0
        set(value){
            if(value<0){
                throw Exception("La fuerza no puede ser menor que 0")
            }
            field = value
        }
    var nombre:String = ""
    var tipo:String = ""

    override fun toString(): String {
        return "$nombre de tipo $tipo hizo $fuerza de daño"
    }
}