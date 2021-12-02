package com.rebirth.app001.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.rebirth.app001.R
import com.rebirth.app001.viewmodels.MainViewModel


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val textviewMensaje = findViewById<TextView>(R.id.textview_mensaje)
        val editTextNombre = findViewById<EditText>(R.id.editText_Nombre)

        mainViewModel.mensaje.observe(this, {
            textviewMensaje.text = it
        })

        editTextNombre.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
                if (s != "") {
                    mainViewModel.mensaje.value = s.toString()
                }
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }

            override fun afterTextChanged(s: Editable) {}
        })
    }
}