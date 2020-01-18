package com.example.newproject1006

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newproject1006.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //binding.vm = MainViewmodel()

        binding.vm = ViewModelProvider(this)[MainViewmodel::class.java]

//        binding.edittext.addTextChangedListener{
//            binding.name = it.toString()
//        }
    }
}
