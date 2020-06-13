package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingLandImpl extends FragmentMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar_layout, 4);
        sViewsWithIds.put(R.id.view_pager, 5);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , null
            , null
            , null
            , null
            , null
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.google.android.material.tabs.TabLayout) bindings[1]
            , null
            , null
            , (androidx.viewpager.widget.ViewPager) bindings[5]
            , (android.webkit.WebView) bindings[3]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rv.setTag(null);
        this.tabLayout.setTag(null);
        this.webView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setVm((com.kunminx.puremusic.ui.state.MainViewModel) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((androidx.recyclerview.widget.ListAdapter) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.kunminx.puremusic.ui.page.MainFragment.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.kunminx.puremusic.ui.state.MainViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setAdapter(@Nullable androidx.recyclerview.widget.ListAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setClick(@Nullable com.kunminx.puremusic.ui.page.MainFragment.ClickProxy Click) {
        this.mClick = Click;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmList((androidx.lifecycle.MutableLiveData<java.util.List<com.kunminx.puremusic.data.bean.TestAlbum.TestMusic>>) object, fieldId);
            case 1 :
                return onChangeVmPageAssetPath((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmInitTabAndPage((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeVmNotifyCurrentListChanged((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmList(androidx.lifecycle.MutableLiveData<java.util.List<com.kunminx.puremusic.data.bean.TestAlbum.TestMusic>> VmList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPageAssetPath(androidx.databinding.ObservableField<java.lang.String> VmPageAssetPath, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmInitTabAndPage(androidx.databinding.ObservableBoolean VmInitTabAndPage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmNotifyCurrentListChanged(androidx.lifecycle.MutableLiveData<java.lang.Boolean> VmNotifyCurrentListChanged, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxVmNotifyCurrentListChangedGetValue = false;
        boolean vmInitTabAndPageGet = false;
        com.kunminx.puremusic.ui.state.MainViewModel vm = mVm;
        androidx.lifecycle.MutableLiveData<java.util.List<com.kunminx.puremusic.data.bean.TestAlbum.TestMusic>> vmList = null;
        androidx.databinding.ObservableField<java.lang.String> vmPageAssetPath = null;
        java.util.List<com.kunminx.puremusic.data.bean.TestAlbum.TestMusic> vmListGetValue = null;
        androidx.databinding.ObservableBoolean vmInitTabAndPage = null;
        java.lang.Boolean vmNotifyCurrentListChangedGetValue = null;
        java.lang.String vmPageAssetPathGet = null;
        androidx.recyclerview.widget.ListAdapter<?,? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> adapter = mAdapter;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmNotifyCurrentListChanged = null;

        if ((dirtyFlags & 0xbfL) != 0) {


            if ((dirtyFlags & 0xb1L) != 0) {

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
            if ((dirtyFlags & 0x92L) != 0) {

                    if (vm != null) {
                        // read vm.pageAssetPath
                        vmPageAssetPath = vm.pageAssetPath;
                    }
                    updateRegistration(1, vmPageAssetPath);


                    if (vmPageAssetPath != null) {
                        // read vm.pageAssetPath.get()
                        vmPageAssetPathGet = vmPageAssetPath.get();
                    }
            }
            if ((dirtyFlags & 0x94L) != 0) {

                    if (vm != null) {
                        // read vm.initTabAndPage
                        vmInitTabAndPage = vm.initTabAndPage;
                    }
                    updateRegistration(2, vmInitTabAndPage);


                    if (vmInitTabAndPage != null) {
                        // read vm.initTabAndPage.get()
                        vmInitTabAndPageGet = vmInitTabAndPage.get();
                    }
            }
            if ((dirtyFlags & 0x98L) != 0) {

                    if (vm != null) {
                        // read vm.notifyCurrentListChanged
                        vmNotifyCurrentListChanged = vm.notifyCurrentListChanged;
                    }
                    updateLiveDataRegistration(3, vmNotifyCurrentListChanged);


                    if (vmNotifyCurrentListChanged != null) {
                        // read vm.notifyCurrentListChanged.getValue()
                        vmNotifyCurrentListChangedGetValue = vmNotifyCurrentListChanged.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.notifyCurrentListChanged.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmNotifyCurrentListChangedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmNotifyCurrentListChangedGetValue);
            }
        }
        if ((dirtyFlags & 0xb1L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x98L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.RecyclerViewBindingAdapter.notifyListChanged(this.rv, androidxDatabindingViewDataBindingSafeUnboxVmNotifyCurrentListChangedGetValue);
        }
        if ((dirtyFlags & 0xb1L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.RecyclerViewBindingAdapter.bindList(this.rv, adapter, vmListGetValue, (boolean)false, (boolean)false);
        }
        if ((dirtyFlags & 0x94L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.TabPageBindingAdapter.initTabAndPage(this.tabLayout, vmInitTabAndPageGet);
        }
        if ((dirtyFlags & 0x92L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.WebViewBindingAdapter.loadAssetsPage(this.webView, vmPageAssetPathGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.list
        flag 1 (0x2L): vm.pageAssetPath
        flag 2 (0x3L): vm.initTabAndPage
        flag 3 (0x4L): vm.notifyCurrentListChanged
        flag 4 (0x5L): vm
        flag 5 (0x6L): adapter
        flag 6 (0x7L): click
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}