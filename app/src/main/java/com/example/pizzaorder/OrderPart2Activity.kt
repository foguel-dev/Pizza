package com.example.pizzaorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_order_part2.*

class OrderPart2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_part2)

        if (intent!=null){
            var totalPrice = intent.getDoubleExtra("TOTAL_PRICE", 0.0)
            var orderDescripcion = intent.getStringExtra("ORDER_DESCRIPTION")

            txtDetalleOrden.setText(orderDescripcion + "TOTAL"+ totalPrice)

        }

    }

    fun Regresar(view: View){
        finish()
    }
}