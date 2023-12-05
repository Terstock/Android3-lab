package com.example.lab3_android.presentation.firstapipack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.lab3_android.R
import com.example.lab3_android.databinding.FragmentFirstBinding
import com.example.lab3_android.presentation.MAIN



class FirstFragment : Fragment() {

    private val viewModel: FirsViewModel by viewModels()
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return  binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGet1.setOnClickListener {

            viewModel.getListProducts1()

            viewModel.txtDataViewM1.observe(viewLifecycleOwner) { newData ->
                binding.txtData.text = newData
            }

        }

        binding.buttonFirstToSec.setOnClickListener {

            MAIN.navController.navigate(R.id.action_firstFragment_to_secondFragment)

        }


    }

}