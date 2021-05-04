package com.example.juegosparabeber.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.juegosparabeber.R
import com.example.juegosparabeber.databinding.ActivityMainBinding
import com.example.juegosparabeber.databinding.ActivityYoNuncaBinding
import com.example.juegosparabeber.ui.yonunca.VersionFiesta
import com.example.juegosparabeber.ui.yonunca.Yonunca

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnYonunca.setOnClickListener {
            val intent = Intent(this, Yonunca::class.java).apply {

            }
            startActivity(intent)
        }
    }
}