package com.example.lekcja3marca

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    lateinit var pizza: CheckBox
    lateinit var frytki: CheckBox
    lateinit var sałatka: CheckBox
    lateinit var chleb: CheckBox
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Zakupy"
        pizza = findViewById(R.id.checkBox)
        frytki = findViewById(R.id.checkBox1)
        sałatka = findViewById(R.id.checkBox2)
        chleb = findViewById(R.id.checkBox3)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            var Łączna_Cena: Int = 0
            val result = StringBuilder()
            if (pizza.isChecked) {
                Łączna_Cena += 20
            }
            if (frytki.isChecked) {
                Łączna_Cena += 5
            }
            if (sałatka.isChecked) {
                Łączna_Cena += 10
            }
            if (chleb.isChecked)
            {
                Łączna_Cena += 10
            }
            if (Łączna_Cena == 0)
            {
                result.append("Nic nie wybrano\nRazem: " + Łączna_Cena + " zł")
                Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
            }
            else
            {
                result.append("Wybrane produkty to: ")
                if(pizza.isChecked)
                {
                    result.append("\nPizza - 20 zł")
                }
                if(frytki.isChecked)
                {
                    result.append("\nFrytki - 5 zł")
                }
                if(sałatka.isChecked)
                {
                    result.append("\nSałatka - 15 zł")
                }
                if(chleb.isChecked)
                {
                    result.append("\nChleb - 10 zł")
                }
                result.append("\nRazem: " + Łączna_Cena + " zł")
                Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}