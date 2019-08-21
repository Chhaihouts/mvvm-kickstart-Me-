package com.rupp.kickstart_mvvm.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rupp.kickstart_mvvm.viewmodel.UserListViewMode;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityUserListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected UserListViewMode mUserViewModel;

  protected ActivityUserListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setUserViewModel(@Nullable UserListViewMode userViewModel);

  @Nullable
  public UserListViewMode getUserViewModel() {
    return mUserViewModel;
  }

  @NonNull
  public static ActivityUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_user_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityUserListBinding>inflateInternal(inflater, com.rupp.kickstart_mvvm.R.layout.activity_user_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityUserListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_user_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityUserListBinding>inflateInternal(inflater, com.rupp.kickstart_mvvm.R.layout.activity_user_list, null, false, component);
  }

  public static ActivityUserListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityUserListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityUserListBinding)bind(component, view, com.rupp.kickstart_mvvm.R.layout.activity_user_list);
  }
}
