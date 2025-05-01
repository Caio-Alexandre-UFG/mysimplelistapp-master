package com.example.mysimplelistapp

import FormDialogFragment
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mysimplelistapp.databinding.ActivityMainBinding
import com.example.mysimplelistapp.model.Item
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    private val shoppingList = mutableListOf(
        Item("Arroz", "Pacote de 5kg", "https://upload.wikimedia.org/wikipedia/commons/7/7b/White%2C_Brown%2C_Red_%26_Wild_rice.jpg", 15.99),
        Item("Feijão", "Feijão carioca 1kg", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Feijão.jpg/800px-Feijão.jpg", 7.49),
        Item("Macarrão", "Tipo espaguete", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Spaghetti_noodles.jpg/800px-Spaghetti_noodles.jpg", 3.99),
        Item("Açúcar", "Açúcar refinado 1kg", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Sugar.jpg/800px-Sugar.jpg", 4.59),
        Item("Café", "Pó de café 500g", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Coffee_grounds.jpg/800px-Coffee_grounds.jpg", 8.99),
        Item("Óleo", "Óleo de soja 900ml", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Vegetable_oil.jpg/800px-Vegetable_oil.jpg", 5.79),
        Item("Sal", "Sal refinado 1kg", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Salt.jpg/800px-Salt.jpg", 1.99),
        Item("Leite", "Caixa de leite integral 1L", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Milk_carton.jpg/800px-Milk_carton.jpg", 3.19),
        Item("Farinha", "Farinha de trigo 1kg", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Wheat_flour.jpg/800px-Wheat_flour.jpg", 2.49),
        Item("Biscoito", "Biscoito recheado chocolate", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Chocolate_cookies.jpg/800px-Chocolate_cookies.jpg", 2.99)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ItemAdapter(shoppingList)
        val fab: FloatingActionButton = findViewById(R.id.fab)


        fab.setOnClickListener {
            val formDialog = FormDialogFragment()
            formDialog.show(supportFragmentManager, "FormDialog")
        }

    }



}
