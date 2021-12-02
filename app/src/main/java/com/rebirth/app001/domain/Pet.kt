package com.rebirth.app001.domain

class Pet constructor(
    var id: Int = 0,
    val nombre: String,
    val tipo: String,
    val raza: String,
    val edad: Int
) {

    fun info(): String = "Pet<ID:$id Nombre:$nombre Tipo:$tipo Raza$raza Edad:$edad/>"

}