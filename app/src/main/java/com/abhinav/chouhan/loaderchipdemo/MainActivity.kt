package com.abhinav.chouhan.loaderchipdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhinav.chouhan.loaderchip.LoaderChip
import com.abhinav.chouhan.loaderchipdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activity = this

    }

    fun load(){
       binding.loaderChip.startLoading()
    }
}