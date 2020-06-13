package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sliding_layout, 1);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            , (com.sothree.slidinguppanel.SlidingUpPanelLayout) bindings[1]
            );
        this.dl.setTag(null);
        setRootTag(root);
        // listeners
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
            setVm((com.kunminx.puremusic.ui.state.MainActivityViewModel) variable);
        }
        else if (BR.event == variableId) {
            setEvent((com.kunminx.puremusic.MainActivity.EventHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.kunminx.puremusic.ui.state.MainActivityViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setEvent(@Nullable com.kunminx.puremusic.MainActivity.EventHandler Event) {
        this.mEvent = Event;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.event);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmOpenDrawer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmAllowDrawerOpen((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmOpenDrawer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> VmOpenDrawer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmAllowDrawerOpen(androidx.lifecycle.MutableLiveData<java.lang.Boolean> VmAllowDrawerOpen, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.kunminx.puremusic.ui.state.MainActivityViewModel vm = mVm;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmOpenDrawerGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmAllowDrawerOpenGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmOpenDrawer = null;
        java.lang.Boolean vmOpenDrawerGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmAllowDrawerOpen = null;
        com.kunminx.puremusic.MainActivity.EventHandler event = mEvent;
        java.lang.Boolean vmAllowDrawerOpenGetValue = null;

        if ((dirtyFlags & 0x17L) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (vm != null) {
                        // read vm.openDrawer
                        vmOpenDrawer = vm.openDrawer;
                    }
                    updateLiveDataRegistration(0, vmOpenDrawer);


                    if (vmOpenDrawer != null) {
                        // read vm.openDrawer.getValue()
                        vmOpenDrawerGetValue = vmOpenDrawer.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.openDrawer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmOpenDrawerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmOpenDrawerGetValue);
            }
            if ((dirtyFlags & 0x16L) != 0) {

                    if (vm != null) {
                        // read vm.allowDrawerOpen
                        vmAllowDrawerOpen = vm.allowDrawerOpen;
                    }
                    updateLiveDataRegistration(1, vmAllowDrawerOpen);


                    if (vmAllowDrawerOpen != null) {
                        // read vm.allowDrawerOpen.getValue()
                        vmAllowDrawerOpenGetValue = vmAllowDrawerOpen.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.allowDrawerOpen.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmAllowDrawerOpenGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmAllowDrawerOpenGetValue);
            }
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.DrawerBindingAdapter.allowDrawerOpen(this.dl, androidxDatabindingViewDataBindingSafeUnboxVmAllowDrawerOpenGetValue);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.DrawerBindingAdapter.listenDrawerState(this.dl, event);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.DrawerBindingAdapter.openDrawer(this.dl, androidxDatabindingViewDataBindingSafeUnboxVmOpenDrawerGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.openDrawer
        flag 1 (0x2L): vm.allowDrawerOpen
        flag 2 (0x3L): vm
        flag 3 (0x4L): event
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}