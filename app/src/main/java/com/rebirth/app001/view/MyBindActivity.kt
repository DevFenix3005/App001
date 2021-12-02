package com.rebirth.app001.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.rebirth.app001.databinding.ActivityMyBindBinding
import com.rebirth.app001.viewmodels.MyBindViewModel

class MyBindActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myBindViewModel = ViewModelProvider(this)[MyBindViewModel::class.java]

        val activityMyBindBinding = ActivityMyBindBinding.inflate(layoutInflater)
        activityMyBindBinding.viewmodel = myBindViewModel
        activityMyBindBinding.lifecycleOwner = this

        setContentView(activityMyBindBinding.root)
    }

    companion object {
        const val TAG = "MyBindActivity"
    }

}