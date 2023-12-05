package com.example.lab3_android.presentation.firstapipack

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab3_android.data.remote.model.ApiFactoryBiblia
import com.example.lab3_android.data.remote.model.BibliasApiInterface
import com.example.lab3_android.databinding.FragmentFirstBinding
import kotlinx.coroutines.launch
import java.lang.Exception

class FirsViewModel: ViewModel() {


    lateinit var binding: FragmentFirstBinding
    var txtDataViewM1: MutableLiveData<String> = MutableLiveData()


    fun getListProducts1() {
        val retrofit = ApiFactoryBiblia.getInstance()
        val apiInterface = retrofit.create(BibliasApiInterface::class.java)


        viewModelScope.launch {
            try {
                val response = apiInterface.getAll()
                if (response.isSuccessful) {
                    if ((response.body()?.verses?.size ?: 0) <= 0) {

                        txtDataViewM1.value = "DOWNLOADING ERROR"


                    } else {
                        response.body()?.let {

                            txtDataViewM1.value = it.verses.joinToString("\n\n")

                        }
                    }
                } else {

                    txtDataViewM1.value = "DOWNLOADING ERROR"

                   //
                }
            } catch (ex: Exception) {
                ex.localizedMessage?.let { Log.e("Error", it) }
            }
        }
    }

}