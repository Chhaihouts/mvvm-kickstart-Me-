package com.rupp.kickstart_mvvm.utils

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ApiModelHelper {
    companion object {
        fun <T>observe(observable: Observable<T>): Observable<T> {
            return observable
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
        }
    }
}