package com.rupp.kickstart_mvvm.model.BaseModel

data class BaseModel<T>(var success:Boolean,var code:Int,var message:String,var models:T)