package com.example.myflippversion.ui.producto

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myflippversion.R
import com.example.myflippversion.model.Producto

class AdapterDetalle(private val listaProducto: List<Producto>):
    RecyclerView.Adapter<AdapterDetalle.ItemViewHolder>(){



    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val adapterContainer =
            itemView.findViewById<ConstraintLayout>(R.id.adapterContainer)
        private val productImage = itemView.findViewById<TextView>(R.id.img_producto)

        fun bind(listm: Producto) {
            productImage.text = listm.nombre
            //adapterContainer.setOnClickListener { listener.onRecipeClick(recipe) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount()=listaProducto.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}