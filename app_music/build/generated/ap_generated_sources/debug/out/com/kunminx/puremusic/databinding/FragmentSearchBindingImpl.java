package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding implements com.kunminx.puremusic.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_title, 9);
        sViewsWithIds.put(R.id.tv_content, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[3]
            , (android.widget.SeekBar) bindings[7]
            , (android.widget.SeekBar) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            );
        this.btnBack.setTag(null);
        this.btnSubsribe.setTag(null);
        this.ic.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pb.setTag(null);
        this.pbCancelable.setTag(null);
        this.tvTestDownload.setTag(null);
        this.tvTestLifecycleDownload.setTag(null);
        this.tvTip.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 6);
        mCallback13 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 4);
        mCallback11 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 2);
        mCallback14 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 5);
        mCallback12 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 3);
        mCallback10 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 1);
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
            setVm((com.kunminx.puremusic.ui.state.SearchViewModel) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.kunminx.puremusic.ui.state.SearchViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setClick(@Nullable com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy Click) {
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
                return onChangeVmProgressCancelable((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeVmProgress((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmProgressCancelable(androidx.databinding.ObservableField<java.lang.Integer> VmProgressCancelable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmProgress(androidx.databinding.ObservableField<java.lang.Integer> VmProgress, int fieldId) {
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
        java.lang.Integer vmProgressGet = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmProgressGet = 0;
        java.lang.Integer vmProgressCancelableGet = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmProgressCancelableGet = 0;
        com.kunminx.puremusic.ui.state.SearchViewModel vm = mVm;
        androidx.databinding.ObservableField<java.lang.Integer> vmProgressCancelable = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmProgress = null;
        com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy click = mClick;

        if ((dirtyFlags & 0x17L) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (vm != null) {
                        // read vm.progress_cancelable
                        vmProgressCancelable = vm.progress_cancelable;
                    }
                    updateRegistration(0, vmProgressCancelable);


                    if (vmProgressCancelable != null) {
                        // read vm.progress_cancelable.get()
                        vmProgressCancelableGet = vmProgressCancelable.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.progress_cancelable.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmProgressCancelableGet = androidx.databinding.ViewDataBinding.safeUnbox(vmProgressCancelableGet);
            }
            if ((dirtyFlags & 0x16L) != 0) {

                    if (vm != null) {
                        // read vm.progress
                        vmProgress = vm.progress;
                    }
                    updateRegistration(1, vmProgress);


                    if (vmProgress != null) {
                        // read vm.progress.get()
                        vmProgressGet = vmProgress.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.progress.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmProgressGet = androidx.databinding.ViewDataBinding.safeUnbox(vmProgressGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnBack.setOnClickListener(mCallback10);
            this.btnSubsribe.setOnClickListener(mCallback11);
            com.kunminx.architecture.ui.binding_adapter.DrawablesBindingAdapter.setViewBackground(this.btnSubsribe, (int)0, 0xffFF7055, (int)0, (float)0f, (float)0f, (float)0f, 25, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null);
            this.ic.setOnClickListener(mCallback12);
            this.tvTestDownload.setOnClickListener(mCallback14);
            com.kunminx.architecture.ui.binding_adapter.DrawablesBindingAdapter.setViewBackground(this.tvTestDownload, (int)0, 0xffFF7055, (int)0, (float)0f, (float)0f, (float)0f, 25, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null);
            this.tvTestLifecycleDownload.setOnClickListener(mCallback15);
            com.kunminx.architecture.ui.binding_adapter.DrawablesBindingAdapter.setViewBackground(this.tvTestLifecycleDownload, (int)0, 0xffFF7055, (int)0, (float)0f, (float)0f, (float)0f, 25, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (int)0, (java.lang.Integer)null, (int)0, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (java.lang.Integer)null, (java.lang.Integer)null, (java.lang.Integer)null, (int)0, (int)0, (java.lang.Float)null, (java.lang.Float)null, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (float)0f, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null);
            this.tvTip.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.pb, androidxDatabindingViewDataBindingSafeUnboxVmProgressGet);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.pbCancelable, androidxDatabindingViewDataBindingSafeUnboxVmProgressCancelableGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.testLifecycleDownload();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.testNav();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.subscribe();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.testDownload();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.testNav();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.SearchFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.back();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.progress_cancelable
        flag 1 (0x2L): vm.progress
        flag 2 (0x3L): vm
        flag 3 (0x4L): click
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}