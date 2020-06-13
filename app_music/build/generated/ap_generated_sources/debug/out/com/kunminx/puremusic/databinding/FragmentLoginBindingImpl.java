package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.kunminx.puremusic.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_title, 6);
        sViewsWithIds.put(R.id.tv_content, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.name.get()
            //         is vm.name.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.kunminx.puremusic.ui.state.LoginViewModel vm = mVm;
            // vm.name != null
            boolean vmNameJavaLangObjectNull = false;
            // vm.name.get()
            java.lang.String vmNameGet = null;
            // vm.name
            androidx.databinding.ObservableField<java.lang.String> vmName = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmName = vm.name;

                vmNameJavaLangObjectNull = (vmName) != (null);
                if (vmNameJavaLangObjectNull) {




                    vmName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etPwdandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.password.get()
            //         is vm.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPwd);
            // localize variables for thread safety
            // vm.password.get()
            java.lang.String vmPasswordGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.kunminx.puremusic.ui.state.LoginViewModel vm = mVm;
            // vm.password != null
            boolean vmPasswordJavaLangObjectNull = false;
            // vm.password
            androidx.databinding.ObservableField<java.lang.String> vmPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPassword = vm.password;

                vmPasswordJavaLangObjectNull = (vmPassword) != (null);
                if (vmPasswordJavaLangObjectNull) {




                    vmPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[1]
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.ProgressBar) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            );
        this.btnBack.setTag(null);
        this.btnLogin.setTag(null);
        this.etName.setTag(null);
        this.etPwd.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 1);
        mCallback9 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.vm == variableId) {
            setVm((com.kunminx.puremusic.ui.state.LoginViewModel) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.kunminx.puremusic.ui.page.LoginFragment.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.kunminx.puremusic.ui.state.LoginViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setClick(@Nullable com.kunminx.puremusic.ui.page.LoginFragment.ClickProxy Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeVmName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmPassword(androidx.databinding.ObservableField<java.lang.String> VmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLoadingVisible(androidx.databinding.ObservableBoolean VmLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmName(androidx.databinding.ObservableField<java.lang.String> VmName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String vmPasswordGet = null;
        com.kunminx.puremusic.ui.state.LoginViewModel vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmPassword = null;
        androidx.databinding.ObservableBoolean vmLoadingVisible = null;
        java.lang.String vmNameGet = null;
        com.kunminx.puremusic.ui.page.LoginFragment.ClickProxy click = mClick;
        androidx.databinding.ObservableField<java.lang.String> vmName = null;
        boolean vmLoadingVisibleGet = false;

        if ((dirtyFlags & 0x2fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (vm != null) {
                        // read vm.password
                        vmPassword = vm.password;
                    }
                    updateRegistration(0, vmPassword);


                    if (vmPassword != null) {
                        // read vm.password.get()
                        vmPasswordGet = vmPassword.get();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        vmLoadingVisible = vm.loadingVisible;
                    }
                    updateRegistration(1, vmLoadingVisible);


                    if (vmLoadingVisible != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = vmLoadingVisible.get();
                    }
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (vm != null) {
                        // read vm.name
                        vmName = vm.name;
                    }
                    updateRegistration(2, vmName);


                    if (vmName != null) {
                        // read vm.name.get()
                        vmNameGet = vmName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnBack.setOnClickListener(mCallback8);
            this.btnLogin.setOnClickListener(mCallback9);
            com.kunminx.architecture.ui.binding_adapter.DrawablesBindingAdapter.setViewBackground(this.btnLogin, (int)0, 0xffFF7055, (int)0, (float)0f, (float)0f, (float)0f, 25, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null);
            com.kunminx.architecture.ui.binding_adapter.DrawablesBindingAdapter.setViewBackground(this.etName, (int)0, (java.lang.Integer)null, 0xffeeeeee, 1, (float)0f, (float)0f, 12, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNameandroidTextAttrChanged);
            com.kunminx.architecture.ui.binding_adapter.DrawablesBindingAdapter.setViewBackground(this.etPwd, (int)0, (java.lang.Integer)null, 0xffeeeeee, 1, (float)0f, (float)0f, 12, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPwd, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPwdandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etName, vmNameGet);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPwd, vmPasswordGet);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.CommonBindingAdapter.visible(this.progress, vmLoadingVisibleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.LoginFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.back();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.LoginFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.login();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.password
        flag 1 (0x2L): vm.loadingVisible
        flag 2 (0x3L): vm.name
        flag 3 (0x4L): vm
        flag 4 (0x5L): click
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}