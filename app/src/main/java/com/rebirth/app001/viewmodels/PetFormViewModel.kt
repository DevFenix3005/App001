package com.rebirth.app001.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rebirth.app001.domain.Pet
import com.rebirth.app001.repositories.PetRepository

class PetFormViewModel() : ViewModel() {

    val nombre: MutableLiveData<String> = MutableLiveData()

    val tipo: MutableLiveData<String> = MutableLiveData()

    val raza: MutableLiveData<String> = MutableLiveData()

    val edad: MutableLiveData<String> = MutableLiveData()

    val petRepository: PetRepository = PetRepository()

    fun registrar() {
        val pet = Pet(
            nombre = nombre.value!!,
            tipo = tipo.value!!,
            raza = raza.value!!,
            edad = edad.value!!.toInt()
        )
        petRepository.addPet(pet)
        val petInfo = pet.info()
        Log.d(TAG, petInfo)
    }


    companion object {
        const val TAG = "PetFormViewModel"
    }

}