package com.uacm.gearcontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ScrollView
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {

    var button: Button ?= null
    var desplazamiento: ScrollView ?= null

    var tarjeta: CardView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_registro_motor)
        setContentView(R.layout.tarjeta_material)

        /*
        button = findViewById(R.id.btnAñadirMaterial)
        desplazamiento = findViewById(R.id.scroll)

        button?.setOnClickListener {
            mostrarScroll()
        }*/

    }

    private fun mostrarScroll(){
         desplazamiento?.visibility = View.VISIBLE
    }



}