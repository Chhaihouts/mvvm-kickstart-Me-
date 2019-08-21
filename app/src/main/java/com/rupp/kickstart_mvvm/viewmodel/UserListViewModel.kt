package com.rupp.kickstart_mvvm.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.rupp.kickstart_mvvm.model.User
import com.rupp.kickstart_mvvm.model.repository.RequestInterface

class UserListViewMode: NetworkViewModel() {
    val userList: MutableLiveData<List<User>> = MutableLiveData()

    init {
        onCreate()
    }

    private fun onCreate() {
        callApi(RequestInterface.requestInterface.getUser(), this::handleResponse, this::handleError)
    }

    fun handleResponse(response: List<User>) {
        userList.value = response
    }

    fun handleError(error: Throwable) {
        Log.d("ooooo", error.printStackTrace().toString())
    }
}