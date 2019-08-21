package com.rupp.kickstart_mvvm.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.rupp.kickstart_mvvm.R
import com.rupp.kickstart_mvvm.databinding.ActivityMainBinding
import com.rupp.kickstart_mvvm.databinding.ActivityUserListBinding
import com.rupp.kickstart_mvvm.view.adapter.UserListAdapter
import com.rupp.kickstart_mvvm.viewmodel.ExViewModel
import com.rupp.kickstart_mvvm.viewmodel.UserListViewMode
import kotlinx.android.synthetic.main.activity_user_list.*

class UserListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserListBinding
    private lateinit var userListViewModel: UserListViewMode
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_list)
        userListViewModel = ViewModelProviders.of(this).get(UserListViewMode::class.java)
        binding.userViewModel = userListViewModel
        binding.lifecycleOwner = this

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UserListAdapter(userListViewModel, this)
    }
}
