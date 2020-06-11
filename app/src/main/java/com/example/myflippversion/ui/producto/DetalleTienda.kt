package com.example.myflippversion.ui.producto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myflippversion.model.Producto
import com.example.myflippversion.R
import kotlinx.android.synthetic.main.activity_detalle_tienda.*

class DetalleTienda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_tienda)

        lateinit var detalleAdapter: AdapterDetalle

        val adapterLayoutManager = LinearLayoutManager(this)
        detalleAdapter = AdapterDetalle(emptyList())
        recycler.apply {
            layoutManager = adapterLayoutManager
            adapter = detalleAdapter
        }


    }
}
