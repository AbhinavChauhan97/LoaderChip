package com.abhinav.chouhan.loaderchipdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.abhinav.chouhan.loaderchip.LoaderChip
import com.abhinav.chouhan.loaderchipdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activity = this
        



//        println(MyChip.obj)
//        println(MyChip.obj)
//        println(MyChip.obj)
//        println(MyChip.obj)
//        println(MyChip.obj)
//        println(MyChip.obj)



    }

    fun load(){
       Handler(Looper.getMainLooper()).postDelayed({ binding.loaderChip.stopLoading()},3000 )
        binding.loaderChip.stopLoading()
       // Handler(Looper.getMainLooper()).postDelayed({ binding.loaderChip.startLoading()},3000 )
    }
}