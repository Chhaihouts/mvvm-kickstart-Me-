package com.rupp.kickstart_mvvm.model.repository
import io.reactivex.Observable
import com.rupp.kickstart_mvvm.model.BaseModel.BaseModel
import com.rupp.kickstart_mvvm.model.User
import com.rupp.kickstart_mvvm.utils.Constant
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RequestInterface {
    companion object {
        val requestInterface: RequestInterface = Retrofit.Builder()
            .baseUrl(Constant.baseUrl)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RequestInterface::class.java)
    }

    @GET("posts")
    fun getUser(): Observable<List<User>>
}