package com.rebirth.app001.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyBindViewModel: ViewModel() {

    val mensaje: MutableLiveData<String> = MutableLiveData("Hola Mundo!!")

}