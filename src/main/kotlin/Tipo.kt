package POKEMON

import java.lang.IllegalArgumentException

class Tipo(tipo:String) {
    var tipo = ""
        get() {
            return field
        }
        set(value) {
            if (value !in arrayOf("acero", "agua", "bicho", "dragon", "electrico", "fantasma", "fuego", "hada", "hielo", "lucha", "normal", "planta", "psiquico", "roca", "siniestro", "tierra", "veneno", "volador")){
                throw IllegalArgumentException("El tipo no es válido"); field = ""
            }
            else {
                field = value
            }
        }
    fun Efectividad(tipoAtaca:String) {
        return when(tipo){
            "acero"-> when(tipoAtaca){
                "fuego","lucha","tierra"
            }

        }
    }
}

