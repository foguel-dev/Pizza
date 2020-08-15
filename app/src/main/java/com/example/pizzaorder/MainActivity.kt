package com.example.pizzaorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        orderbutton.setOnClickListener {
            var precioPizza = 0.0
            var precioTotal = 0.0
            var orderDescripcion = ""

            when {
                radioGroupPizza.pizzaPequena.isChecked -> {
                    precioPizza = 5.0
                    orderDescripcion = "Pequenia"
                }

                radioGroupPizza.pizzaMediana.isChecked -> {
                    precioPizza = 7.0
                    orderDescripcion = "Mediana"
                }
                radioGroupPizza.pizzaGrande.isChecked -> {
                    precioPizza = 9.0
                    orderDescripcion = "Grande"
                }
            }

            orderDescripcion += "Pizza"

            if (checkCebolla.isChecked) {
                precioTotal +=1
                orderDescripcion += "Cebollas"
            }


            if (checkAceitunas.isChecked) {
                precioTotal += 2
                orderDescripcion += "Aceitunas"
            }


            if (checkTomate.isChecked) {
                precioTotal +=3
                orderDescripcion += "Tomates"
            }

            txtResultado.text = "El precio total es: $"+(precioPizza + precioTotal)

            //mensaje (carta dirigida al android)
            val i: Intent = Intent(this, OrderPart2Activity::class.java)
            i.putExtra("PRECIO_TOTAL", precioPizza + precioTotal)
            i.putExtra("ORDEN_DESCRIPCION",orderDescripcion)

            startActivity(intent)
        }


    }
}