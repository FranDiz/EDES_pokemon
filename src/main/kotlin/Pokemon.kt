class Pokemon (id:Int, nombre:String, vida:Int, tipo:String, tipoAtaca:String) {

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
    var tipo: String=""
    var tipoAtaca: String=""


    init{
        this.id= id;
        this.nombre= nombre;
        this.vida=vida;
        this.tipo=tipo;
        this.tipoAtaca=tipoAtaca;
        if(id<0){
            throw Exception("El id no puede ser menor que 0")
        }
    }

    override fun toString(): String{
        return "Hola mi nombre es $nombre, tengo $vida de vida y soy de tipo $tipo"
    }
    fun efectividad(){

    }

}