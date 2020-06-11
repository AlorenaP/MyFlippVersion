package com.example.myflippversion.ui.tienda

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.myflippversion.R
import com.example.myflippversion.model.Tienda
import com.example.myflippversion.ui.producto.DetalleTienda

/**
 * A simple [Fragment] subclass.
 */
class BrowserFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val viewn: View = inflater.inflate(R.layout.fragment_browser, container, false)


        val tienda = Tienda(
            "Bashas",
            R.drawable.bashas
        )
        val tienda1 = Tienda(
            "Walmart",
            R.drawable.walmartt
        )
        val tienda2 = Tienda(
            "Family",
            R.drawable.family
        )
        val tienda3 = Tienda(
            "Dollar",
            R.drawable.dollar
        )

        var lv = viewn.findViewById<ListView>(R.id.list_view)
        val listaTiendas = listOf(tienda, tienda1, tienda2, tienda3)

        val adapter = AdapterTienda(
            viewn.context,
            listaTiendas
        )
        lv.adapter = adapter


        lv.setOnItemClickListener{parent, view, position, id ->
            val intent= Intent(viewn.context, DetalleTienda::class.java)
            startActivity(intent)
        }
        return viewn

    }

}
