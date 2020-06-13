package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingImpl extends FragmentMainBinding implements com.kunminx.puremusic.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar_layout, 9);
        sViewsWithIds.put(R.id.collapse_layout, 10);
        sViewsWithIds.put(R.id.iv_bg, 11);
        sViewsWithIds.put(R.id.view_pager, 12);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.appbar.AppBarLayout) bindings[9]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (com.google.android.material.tabs.TabLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (androidx.viewpager.widget.ViewPager) bindings[12]
            , (android.webkit.WebView) bindings[8]
            );
        this.ivIcon.setTag(null);
        this.ivMenu.setTag(null);
        this.ivSearch.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rv.setTag(null);
        this.tabLayout.setTag(null);
        this.toolbar.setTag(null);
        this.tvApp.setTag(null);
        this.webView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 3);
        mCallback23 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 1);
        mCallback26 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 4);
        mCallback24 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 2);
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
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
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
        com.kunminx.puremusic.ui.page.MainFragment.ClickProxy click = mClick;
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
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.ivIcon, mCallback24);
            this.ivMenu.setOnClickListener(mCallback23);
            com.kunminx.puremusic.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.ivSearch, mCallback26);
            com.kunminx.architecture.ui.binding_adapter.DrawablesBindingAdapter.setViewBackground(this.toolbar, (int)0, 0x88ffffff, 0x33666666, 1, (float)0f, (float)0f, 8, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null);
            com.kunminx.puremusic.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvApp, mCallback25);
        }
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
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.MainFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.login();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.MainFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.openMenu();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.MainFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.search();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.MainFragment.ClickProxy click = mClick;
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