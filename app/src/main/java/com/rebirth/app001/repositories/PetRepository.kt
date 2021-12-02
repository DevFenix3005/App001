package com.rebirth.app001.repositories

import com.rebirth.app001.domain.Pet

class PetRepository {

    val petList = mutableListOf<Pet>()
    var counter = 1

    fun addPet(pet: Pet) {
        //petList += pet
        pet.id = counter++
        petList.add(pet)
    }


}