package com.example.lab3_android.presentation.secondapipack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab3_android.R
import com.example.lab3_android.databinding.FragmentSecondBinding
import com.example.lab3_android.presentation.MAIN
import androidx.fragment.app.viewModels

class SecondFragment : Fragment() {


private val viewModel: SecondViewModel by viewModels()
   private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecToFirst.setOnClickListener {

            MAIN.navController.navigate(R.id.action_secondFragment_to_firstFragment)


            }


            binding.buttonNew.setOnClickListener {

                viewModel.getListReqres1()

                viewModel.txtDataViewM2.observe(viewLifecycleOwner) { newData ->
                    binding.txtDataNew.text = newData
            }




        }






    }




//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment SecondFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            SecondFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}