package com.rebirth.app001.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.rebirth.app001.databinding.ActivityPetFormBinding
import com.rebirth.app001.viewmodels.PetFormViewModel

class PetFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val petFormViewModel = ViewModelProvider(this)[PetFormViewModel::class.java]

        val activityPetFormBinding = ActivityPetFormBinding.inflate(layoutInflater)
        activityPetFormBinding.lifecycleOwner = this
        activityPetFormBinding.viewmodel = petFormViewModel

        setContentView(activityPetFormBinding.root)
    }
}