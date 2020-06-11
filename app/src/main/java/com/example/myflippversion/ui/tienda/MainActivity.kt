package com.example.myflippversion.ui.tienda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//import com.example.myflippversion.databinding.ActivityMainBinding
import androidx.fragment.app.Fragment
import com.example.myflippversion.R
import com.example.myflippversion.ui.ListFragment

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val browserFragment =
            BrowserFragment()
        val listFragment = ListFragment()

        actionButtonMenu(browserFragment)
        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_browse -> actionButtonMenu(browserFragment)
                R.id.ic_list -> actionButtonMenu(listFragment)
                R.id.ic_coupon -> Toast.makeText(this,"No Implement", Toast.LENGTH_LONG).show()
                R.id.ic_deal -> Toast.makeText(this,"No Implement", Toast.LENGTH_LONG).show()
                R.id.ic_search -> Toast.makeText(this,"No Implement", Toast.LENGTH_LONG).show()
            }
            true

        }

    }

    fun actionButtonMenu(fragmentActual: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_Browser, fragmentActual)
            commit()
        }


}
