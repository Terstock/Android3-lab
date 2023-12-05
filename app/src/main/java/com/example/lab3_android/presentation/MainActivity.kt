package com.example.lab3_android.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_android.R
import com.example.lab3_android.databinding.ActivityMainBinding
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lab3_android.presentation.secondapipack.SecondViewModel
import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController



    private val viewModel: SecondViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.fragment1)

        MAIN = this

    }

}