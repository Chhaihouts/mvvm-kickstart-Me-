package com.rupp.kickstart_mvvm.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.rupp.kickstart_mvvm.model.BaseModel.BaseModel
import com.rupp.kickstart_mvvm.model.User
import com.rupp.kickstart_mvvm.model.repository.RequestInterface

class ExViewModel: NetworkViewModel() {
    val name: MutableLiveData<String> = MutableLiveData()
    val status: MutableLiveData<String> = MutableLiveData()
    val listUser: MutableLiveData<List<User>> = MutableLiveData()
    val error: MutableLiveData<Throwable> = MutableLiveData()


    init {
        onCreate()
    }

    private fun onCreate() {
        callApi(RequestInterface.requestInterface.getUser(),this::handleUserResponse, this::handleError)
    }

    fun onSaveClick() {
        status.value = "My name is ${name.value}"
    }

    fun handleUserResponse(response:List<User>){
        //body
        listUser.value = response
        Log.d("ooooo", listUser.value?.size.toString())
    }

    fun handleError(error:Throwable){
        //body
        Log.d("ooooo", error.toString())
    }
}