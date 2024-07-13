package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.example.myapplication.adapter.ProductAdapter
import com.example.myapplication.databinding.HomeLayoutBinding
import com.example.myapplication.model.Product

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: HomeLayoutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var productList = arrayListOf(
            Product("@drawable/i_user", "RUCI SOFIAN PERMANA", "SSI202202863"),
            Product("@drawable/i_user", "SYARIFUL IQBAL NURIFAL", "SSI202202864"),
            Product("@drawable/i_user", "MOHAMMAD RAFI DZUL\n" +
                    "FAKAR", "SSI202202865"),
            Product("@drawable/i_user", "NABIL RINDA AL-BARA", "SSI202202866"),
            Product("@drawable/i_user", "YIKI TRIYANI", "SSI202202867"),
            Product("@drawable/i_user", "MIRNA DWI RAFINA", "SSI202202868"),
            Product("@drawable/i_user", "LUVITA NUR AZIZZA\n" +
                    "NINGRUM\n", "SSI202202939"),
            Product("@drawable/i_user", "MELIYANI", "SSI202202943"),
            Product("@drawable/i_user", "MUHAMMAD SUHUD AL\n" +
                    "HABSYI", "SSI202202945"),
            Product("@drawable/i_user", "ANDIKA DWI SAPUTRA", "SSI202202947"),
            Product("@drawable/i_user", "RIZAL FATHAN NUGROHO", "SSI202202949"),
            )

        binding = HomeLayoutBinding.inflate(layoutInflater)


        setContentView(binding.root)

        val adapter = ProductAdapter(this, productList)
        val productListView : ListView = findViewById(R.id.list_item)
        productListView.adapter = adapter
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}