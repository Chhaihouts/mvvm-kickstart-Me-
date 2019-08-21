package com.rupp.kickstart_mvvm.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.rupp.kickstart_mvvm.R
import com.rupp.kickstart_mvvm.databinding.ActivityMainBinding
import com.rupp.kickstart_mvvm.viewmodel.ExViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var exViewMode: ExViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        exViewMode = ViewModelProviders.of(this).get(ExViewModel::class.java)
        binding.exViewModel = this.exViewMode
        binding.lifecycleOwner = this

        exViewMode.status.observe(this, Observer { status ->
            Toast.makeText(this,status, Toast.LENGTH_SHORT).show()
        })

        exViewMode.name.observe(this, Observer { name ->
            Toast.makeText(this,name + "Me", Toast.LENGTH_SHORT).show()
        })

//        exViewMode.listUser.observe(this, Observer { listUser ->
//            Log.d("ooooo", listUser.toString())
//        })
//
//        exViewMode.error.observe(this, Observer { error ->
//            Log.d("errorr", error.toString())
//        })
    }
}
