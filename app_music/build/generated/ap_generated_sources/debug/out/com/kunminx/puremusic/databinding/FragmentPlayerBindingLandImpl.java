package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayerBindingLandImpl extends FragmentPlayerBinding implements com.kunminx.puremusic.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lyric_view, 6);
        sViewsWithIds.put(R.id.icon_container, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlayerBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentPlayerBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.view.View) bindings[1]
            , null
            , null
            , null
            , null
            , (android.view.View) bindings[7]
            , (com.kunminx.puremusic.ui.view.LyricView) bindings[6]
            , null
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[4]
            , (com.kunminx.puremusic.ui.view.PlayPauseView) bindings[3]
            , null
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[2]
            , (android.widget.SeekBar) bindings[5]
            , null
            , null
            , null
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            );
        this.albumArt.setTag(null);
        this.next.setTag(null);
        this.playPause.setTag(null);
        this.previous.setTag(null);
        this.seekBottom.setTag(null);
        this.topContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setVm((com.kunminx.puremusic.ui.state.PlayerViewModel) variable);
        }
        else if (BR.event == variableId) {
            setEvent((com.kunminx.puremusic.ui.page.PlayerFragment.EventHandler) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.kunminx.puremusic.ui.state.PlayerViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setEvent(@Nullable com.kunminx.puremusic.ui.page.PlayerFragment.EventHandler Event) {
        this.mEvent = Event;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.event);
        super.requestRebind();
    }
    public void setClick(@Nullable com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmCoverImg((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmMaxSeekDuration((androidx.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeVmPlaceHolder((androidx.databinding.ObservableField<android.graphics.drawable.Drawable>) object, fieldId);
            case 3 :
                return onChangeVmIsPlaying((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeVmCurrentSeekPosition((androidx.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmCoverImg(androidx.databinding.ObservableField<java.lang.String> VmCoverImg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmMaxSeekDuration(androidx.databinding.ObservableInt VmMaxSeekDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPlaceHolder(androidx.databinding.ObservableField<android.graphics.drawable.Drawable> VmPlaceHolder, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsPlaying(androidx.databinding.ObservableBoolean VmIsPlaying, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCurrentSeekPosition(androidx.databinding.ObservableInt VmCurrentSeekPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        androidx.databinding.ObservableField<java.lang.String> vmCoverImg = null;
        java.lang.String vmCoverImgGet = null;
        boolean vmIsPlayingGet = false;
        androidx.databinding.ObservableInt vmMaxSeekDuration = null;
        androidx.databinding.ObservableField<android.graphics.drawable.Drawable> vmPlaceHolder = null;
        com.kunminx.puremusic.ui.state.PlayerViewModel vm = mVm;
        android.graphics.drawable.Drawable vmPlaceHolderGet = null;
        androidx.databinding.ObservableBoolean vmIsPlaying = null;
        int vmCurrentSeekPositionGet = 0;
        com.kunminx.puremusic.ui.page.PlayerFragment.EventHandler event = mEvent;
        int vmMaxSeekDurationGet = 0;
        com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy click = mClick;
        androidx.databinding.ObservableInt vmCurrentSeekPosition = null;

        if ((dirtyFlags & 0x13fL) != 0) {


            if ((dirtyFlags & 0x125L) != 0) {

                    if (vm != null) {
                        // read vm.coverImg
                        vmCoverImg = vm.coverImg;
                        // read vm.placeHolder
                        vmPlaceHolder = vm.placeHolder;
                    }
                    updateRegistration(0, vmCoverImg);
                    updateRegistration(2, vmPlaceHolder);


                    if (vmCoverImg != null) {
                        // read vm.coverImg.get()
                        vmCoverImgGet = vmCoverImg.get();
                    }
                    if (vmPlaceHolder != null) {
                        // read vm.placeHolder.get()
                        vmPlaceHolderGet = vmPlaceHolder.get();
                    }
            }
            if ((dirtyFlags & 0x122L) != 0) {

                    if (vm != null) {
                        // read vm.maxSeekDuration
                        vmMaxSeekDuration = vm.maxSeekDuration;
                    }
                    updateRegistration(1, vmMaxSeekDuration);


                    if (vmMaxSeekDuration != null) {
                        // read vm.maxSeekDuration.get()
                        vmMaxSeekDurationGet = vmMaxSeekDuration.get();
                    }
            }
            if ((dirtyFlags & 0x128L) != 0) {

                    if (vm != null) {
                        // read vm.isPlaying
                        vmIsPlaying = vm.isPlaying;
                    }
                    updateRegistration(3, vmIsPlaying);


                    if (vmIsPlaying != null) {
                        // read vm.isPlaying.get()
                        vmIsPlayingGet = vmIsPlaying.get();
                    }
            }
            if ((dirtyFlags & 0x130L) != 0) {

                    if (vm != null) {
                        // read vm.currentSeekPosition
                        vmCurrentSeekPosition = vm.currentSeekPosition;
                    }
                    updateRegistration(4, vmCurrentSeekPosition);


                    if (vmCurrentSeekPosition != null) {
                        // read vm.currentSeekPosition.get()
                        vmCurrentSeekPositionGet = vmCurrentSeekPosition.get();
                    }
            }
        }
        if ((dirtyFlags & 0x140L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x125L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.CommonBindingAdapter.loadUrl(((com.kunminx.puremusic.ui.view.ForegroundImageView) this.albumArt), vmCoverImgGet, vmPlaceHolderGet);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.next.setOnClickListener(mCallback3);
            this.playPause.setOnClickListener(mCallback2);
            this.previous.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x128L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.IconBindingAdapter.isPlaying(this.playPause, vmIsPlayingGet);
        }
        if ((dirtyFlags & 0x122L) != 0) {
            // api target 1

            this.seekBottom.setMax(vmMaxSeekDurationGet);
        }
        if ((dirtyFlags & 0x130L) != 0) {
            // api target 1

            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.seekBottom, vmCurrentSeekPositionGet);
        }
        if ((dirtyFlags & 0x140L) != 0) {
            // api target 1

            this.seekBottom.setOnSeekBarChangeListener(event);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.togglePlay();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.next();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.previous();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.coverImg
        flag 1 (0x2L): vm.maxSeekDuration
        flag 2 (0x3L): vm.placeHolder
        flag 3 (0x4L): vm.isPlaying
        flag 4 (0x5L): vm.currentSeekPosition
        flag 5 (0x6L): vm
        flag 6 (0x7L): event
        flag 7 (0x8L): click
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}