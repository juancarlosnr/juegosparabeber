package com.example.juegosparabeber.ui.yonunca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.juegosparabeber.databinding.ActivityYoNuncaBinding

class Yonunca : AppCompatActivity() {
    private lateinit var binding: ActivityYoNuncaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoNuncaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFiesta.setOnClickListener {
            val intent = Intent(this, VersionFiesta::class.java)
            startActivity(intent)
        }
        binding.btnPicante.setOnClickListener {
            val intent = Intent(this, VersionPicante::class.java)
            startActivity(intent)
        }
        binding.btnTinderpeip.setOnClickListener {
            val intent = Intent(this, VersionTinderPeip::class.java)
            startActivity(intent)
        }
    }
}