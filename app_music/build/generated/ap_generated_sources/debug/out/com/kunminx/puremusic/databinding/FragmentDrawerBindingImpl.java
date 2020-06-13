package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDrawerBindingImpl extends FragmentDrawerBinding implements com.kunminx.puremusic.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.ivLogo.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rv.setTag(null);
        this.tvApp.setTag(null);
        this.tvCopyright.setTag(null);
        this.tvSummary.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 4);
        mCallback5 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setVm((com.kunminx.puremusic.ui.state.DrawerViewModel) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((androidx.recyclerview.widget.ListAdapter) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.kunminx.puremusic.ui.page.DrawerFragment.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.kunminx.puremusic.ui.state.DrawerViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setAdapter(@Nullable androidx.recyclerview.widget.ListAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setClick(@Nullable com.kunminx.puremusic.ui.page.DrawerFragment.ClickProxy Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmList((androidx.lifecycle.MutableLiveData<java.util.List<com.kunminx.puremusic.data.bean.LibraryInfo>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmList(androidx.lifecycle.MutableLiveData<java.util.List<com.kunminx.puremusic.data.bean.LibraryInfo>> VmList, int fieldId) {
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
        java.util.List<com.kunminx.puremusic.data.bean.LibraryInfo> vmListGetValue = null;
        com.kunminx.puremusic.ui.state.DrawerViewModel vm = mVm;
        androidx.recyclerview.widget.ListAdapter<?,? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter = mAdapter;
        com.kunminx.puremusic.ui.page.DrawerFragment.ClickProxy click = mClick;
        androidx.lifecycle.MutableLiveData<java.util.List<com.kunminx.puremusic.data.bean.LibraryInfo>> vmList = null;

        if ((dirtyFlags & 0x17L) != 0) {



                if (vm != null) {
                    // read vm.list
                    vmList = vm.list;
                }
                updateLiveDataRegistration(0, vmList);


                if (vmList != null) {
                    // read vm.list.getValue()
                    vmListGetValue = vmList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.ivLogo.setOnClickListener(mCallback4);
            this.tvApp.setOnClickListener(mCallback5);
            this.tvCopyright.setOnClickListener(mCallback7);
            this.tvSummary.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x17L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.RecyclerViewBindingAdapter.bindList(this.rv, adapter, vmListGetValue, (boolean)false, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.DrawerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.logoClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.DrawerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.logoClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.DrawerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.logoClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.DrawerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.logoClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.list
        flag 1 (0x2L): vm
        flag 2 (0x3L): adapter
        flag 3 (0x4L): click
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}