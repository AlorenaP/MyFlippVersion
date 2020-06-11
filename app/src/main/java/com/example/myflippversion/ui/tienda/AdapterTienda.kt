package com.example.myflippversion.ui.tienda

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.myflippversion.R
import com.example.myflippversion.model.Tienda
import kotlinx.android.synthetic.main.renglon_browser.view.*
import kotlin.collections.List

class AdapterTienda(private val mContext: Context, private val listaTiendas:List<Tienda>) :ArrayAdapter<Tienda>(mContext,0, listaTiendas) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layout =LayoutInflater.from(mContext).inflate(R.layout.renglon_browser, parent, false)

        val tienda=listaTiendas[position]
        layout.nombre.text= tienda.nombre
        layout.imageView.setImageResource(tienda.imagen)
        return layout
    }
}