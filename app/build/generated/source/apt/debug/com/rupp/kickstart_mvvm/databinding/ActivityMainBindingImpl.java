package com.rupp.kickstart_mvvm.databinding;
import com.rupp.kickstart_mvvm.R;
import com.rupp.kickstart_mvvm.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.rupp.kickstart_mvvm.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etNameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of exViewModel.name.getValue()
            //         is exViewModel.name.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etName);
            // localize variables for thread safety
            // exViewModel.name.getValue()
            java.lang.String exViewModelNameGetValue = null;
            // exViewModel != null
            boolean exViewModelJavaLangObjectNull = false;
            // exViewModel
            com.rupp.kickstart_mvvm.viewmodel.ExViewModel exViewModel = mExViewModel;
            // exViewModel.name != null
            boolean exViewModelNameJavaLangObjectNull = false;
            // exViewModel.name
            android.arch.lifecycle.MutableLiveData<java.lang.String> exViewModelName = null;



            exViewModelJavaLangObjectNull = (exViewModel) != (null);
            if (exViewModelJavaLangObjectNull) {


                exViewModelName = exViewModel.getName();

                exViewModelNameJavaLangObjectNull = (exViewModelName) != (null);
                if (exViewModelNameJavaLangObjectNull) {




                    exViewModelName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[1]
            );
        this.etName.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.rupp.kickstart_mvvm.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.exViewModel == variableId) {
            setExViewModel((com.rupp.kickstart_mvvm.viewmodel.ExViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setExViewModel(@Nullable com.rupp.kickstart_mvvm.viewmodel.ExViewModel ExViewModel) {
        this.mExViewModel = ExViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.exViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeExViewModelName((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeExViewModelName(android.arch.lifecycle.MutableLiveData<java.lang.String> ExViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String exViewModelNameGetValue = null;
        com.rupp.kickstart_mvvm.viewmodel.ExViewModel exViewModel = mExViewModel;
        android.arch.lifecycle.MutableLiveData<java.lang.String> exViewModelName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (exViewModel != null) {
                    // read exViewModel.name
                    exViewModelName = exViewModel.getName();
                }
                updateLiveDataRegistration(0, exViewModelName);


                if (exViewModelName != null) {
                    // read exViewModel.name.getValue()
                    exViewModelNameGetValue = exViewModelName.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etName, exViewModelNameGetValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etName, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNameandroidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // exViewModel != null
        boolean exViewModelJavaLangObjectNull = false;
        // exViewModel
        com.rupp.kickstart_mvvm.viewmodel.ExViewModel exViewModel = mExViewModel;



        exViewModelJavaLangObjectNull = (exViewModel) != (null);
        if (exViewModelJavaLangObjectNull) {


            exViewModel.onSaveClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): exViewModel.name
        flag 1 (0x2L): exViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}