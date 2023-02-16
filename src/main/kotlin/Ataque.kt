package POKEMON


class Ataque (nombre:String, tipo:String, fuerza:Int) {
    var fuerza:Int = 0
        set(value){
            if(value<0){
                throw Exception("La fuerza no puede ser menor que 0")
            }
            field = value
        }
    var nombre:String = ""
    var tipo=Tipo(tipo)


    override fun toString(): String {
        return "$nombre de tipo ${Tipo(tipo.toString())} hizo $fuerza de daño"
    }
}