package com.alfaro.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alfaro.menus.databinding.ActivityDetailBinding
import com.alfaro.menus.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun cerrar(view: View){
        finish()
    }

}
