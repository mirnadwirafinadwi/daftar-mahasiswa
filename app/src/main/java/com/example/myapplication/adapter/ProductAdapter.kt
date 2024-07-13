package com.example.myapplication.adapter

import android.R
import android.app.Activity
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.model.Product
import java.net.URL


class ProductAdapter(
    private val context: Activity,
    private val productList: ArrayList<Product>
) : ArrayAdapter<Product>(context, com.example.myapplication.R.layout.pastry_item_layout, productList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context).inflate(com.example.myapplication.R.layout.pastry_item_layout, null)
        val product = productList[position]

        val image: ImageView = view.findViewById(com.example.myapplication.R.id.imageProduct)
        val name: TextView = view.findViewById(com.example.myapplication.R.id.nameProduct)
        val price: TextView = view.findViewById(com.example.myapplication.R.id.priceProduct)

        //Change string to drawable
        val imageResource: Int = context.resources.getIdentifier(product.image, null, context.packageName)
        val res: Drawable = context.resources.getDrawable(imageResource)

        image.setImageDrawable(res)
        name.text = product.name
        price.text = product.price

        return view
    }

    private fun getDrawable(bitmapUrl: String?): Drawable? {
        return try {
            val url = URL(bitmapUrl)
            BitmapDrawable(
                BitmapFactory.decodeStream(
                    url.openConnection().getInputStream()
                )
            )
        } catch (ex: Exception) {
            null
        }
    }
}