package com.rupp.kickstart_mvvm.view.adapter

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rupp.kickstart_mvvm.R
import com.rupp.kickstart_mvvm.model.User
import com.rupp.kickstart_mvvm.viewmodel.UserListViewMode
import kotlinx.android.synthetic.main.activity_user_list_item.view.*

class UserListAdapter(userListViewModel: UserListViewMode, lifecycleOwner: LifecycleOwner) :
    RecyclerView.Adapter<UserListViewHolder>() {
    val user: ArrayList<User> = ArrayList()

    init {
        userListViewModel.userList.observe(lifecycleOwner, Observer<List<User>> { t ->
            user.clear()
            user.addAll(t!!)
            notifyDataSetChanged()
        })
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserListViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.activity_user_list_item, null, false)
        return UserListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return user.size
    }

    override fun onBindViewHolder(p0: UserListViewHolder, p1: Int) {
        p0.bindView(user[p1])
    }
}

class UserListViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    fun bindView(user: User) {
        itemView.txtTitle.text = user.title
        itemView.txtDes.text = user.body
    }
}