package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayerBindingImpl extends FragmentPlayerBinding implements com.kunminx.puremusic.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.custom_toolbar, 13);
        sViewsWithIds.put(R.id.summary, 14);
        sViewsWithIds.put(R.id.icon_container, 15);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.view.View) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[2]
            , (android.widget.RelativeLayout) bindings[13]
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[11]
            , (android.view.View) bindings[15]
            , null
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[10]
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[7]
            , (com.kunminx.puremusic.ui.view.PlayPauseView) bindings[8]
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[3]
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[9]
            , (android.widget.SeekBar) bindings[12]
            , (android.widget.ProgressBar) bindings[4]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[5]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            );
        this.albumArt.setTag(null);
        this.artist.setTag(null);
        this.btnClose.setTag(null);
        this.icPlayList.setTag(null);
        this.mode.setTag(null);
        this.next.setTag(null);
        this.playPause.setTag(null);
        this.popupMenu.setTag(null);
        this.previous.setTag(null);
        this.seekBottom.setTag(null);
        this.songProgressNormal.setTag(null);
        this.title.setTag(null);
        this.topContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 2);
        mCallback21 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 6);
        mCallback19 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 4);
        mCallback20 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 5);
        mCallback16 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 1);
        mCallback22 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 7);
        mCallback18 = new com.kunminx.puremusic.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setEvent(@Nullable com.kunminx.puremusic.ui.page.PlayerFragment.EventHandler Event) {
        this.mEvent = Event;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.event);
        super.requestRebind();
    }
    public void setClick(@Nullable com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmCoverImg((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmMaxSeekDuration((androidx.databinding.ObservableInt) object, fieldId);
            case 3 :
                return onChangeVmPlaceHolder((androidx.databinding.ObservableField<android.graphics.drawable.Drawable>) object, fieldId);
            case 4 :
                return onChangeVmIsPlaying((androidx.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeVmArtist((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeVmPlayModeIcon((androidx.databinding.ObservableField<net.steamcrafted.materialiconlib.MaterialDrawableBuilder.IconValue>) object, fieldId);
            case 7 :
                return onChangeVmCurrentSeekPosition((androidx.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmTitle(androidx.databinding.ObservableField<java.lang.String> VmTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCoverImg(androidx.databinding.ObservableField<java.lang.String> VmCoverImg, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmMaxSeekDuration(androidx.databinding.ObservableInt VmMaxSeekDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPlaceHolder(androidx.databinding.ObservableField<android.graphics.drawable.Drawable> VmPlaceHolder, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsPlaying(androidx.databinding.ObservableBoolean VmIsPlaying, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmArtist(androidx.databinding.ObservableField<java.lang.String> VmArtist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPlayModeIcon(androidx.databinding.ObservableField<net.steamcrafted.materialiconlib.MaterialDrawableBuilder.IconValue> VmPlayModeIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCurrentSeekPosition(androidx.databinding.ObservableInt VmCurrentSeekPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.databinding.ObservableField<java.lang.String> vmTitle = null;
        androidx.databinding.ObservableField<java.lang.String> vmCoverImg = null;
        net.steamcrafted.materialiconlib.MaterialDrawableBuilder.IconValue vmPlayModeIconGet = null;
        java.lang.String vmCoverImgGet = null;
        boolean vmIsPlayingGet = false;
        androidx.databinding.ObservableInt vmMaxSeekDuration = null;
        androidx.databinding.ObservableField<android.graphics.drawable.Drawable> vmPlaceHolder = null;
        com.kunminx.puremusic.ui.state.PlayerViewModel vm = mVm;
        android.graphics.drawable.Drawable vmPlaceHolderGet = null;
        androidx.databinding.ObservableBoolean vmIsPlaying = null;
        int vmCurrentSeekPositionGet = 0;
        com.kunminx.puremusic.ui.page.PlayerFragment.EventHandler event = mEvent;
        androidx.databinding.ObservableField<java.lang.String> vmArtist = null;
        int vmMaxSeekDurationGet = 0;
        androidx.databinding.ObservableField<net.steamcrafted.materialiconlib.MaterialDrawableBuilder.IconValue> vmPlayModeIcon = null;
        java.lang.String vmArtistGet = null;
        java.lang.String vmTitleGet = null;
        com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy click = mClick;
        androidx.databinding.ObservableInt vmCurrentSeekPosition = null;

        if ((dirtyFlags & 0x9ffL) != 0) {


            if ((dirtyFlags & 0x901L) != 0) {

                    if (vm != null) {
                        // read vm.title
                        vmTitle = vm.title;
                    }
                    updateRegistration(0, vmTitle);


                    if (vmTitle != null) {
                        // read vm.title.get()
                        vmTitleGet = vmTitle.get();
                    }
            }
            if ((dirtyFlags & 0x90aL) != 0) {

                    if (vm != null) {
                        // read vm.coverImg
                        vmCoverImg = vm.coverImg;
                        // read vm.placeHolder
                        vmPlaceHolder = vm.placeHolder;
                    }
                    updateRegistration(1, vmCoverImg);
                    updateRegistration(3, vmPlaceHolder);


                    if (vmCoverImg != null) {
                        // read vm.coverImg.get()
                        vmCoverImgGet = vmCoverImg.get();
                    }
                    if (vmPlaceHolder != null) {
                        // read vm.placeHolder.get()
                        vmPlaceHolderGet = vmPlaceHolder.get();
                    }
            }
            if ((dirtyFlags & 0x904L) != 0) {

                    if (vm != null) {
                        // read vm.maxSeekDuration
                        vmMaxSeekDuration = vm.maxSeekDuration;
                    }
                    updateRegistration(2, vmMaxSeekDuration);


                    if (vmMaxSeekDuration != null) {
                        // read vm.maxSeekDuration.get()
                        vmMaxSeekDurationGet = vmMaxSeekDuration.get();
                    }
            }
            if ((dirtyFlags & 0x910L) != 0) {

                    if (vm != null) {
                        // read vm.isPlaying
                        vmIsPlaying = vm.isPlaying;
                    }
                    updateRegistration(4, vmIsPlaying);


                    if (vmIsPlaying != null) {
                        // read vm.isPlaying.get()
                        vmIsPlayingGet = vmIsPlaying.get();
                    }
            }
            if ((dirtyFlags & 0x920L) != 0) {

                    if (vm != null) {
                        // read vm.artist
                        vmArtist = vm.artist;
                    }
                    updateRegistration(5, vmArtist);


                    if (vmArtist != null) {
                        // read vm.artist.get()
                        vmArtistGet = vmArtist.get();
                    }
            }
            if ((dirtyFlags & 0x940L) != 0) {

                    if (vm != null) {
                        // read vm.playModeIcon
                        vmPlayModeIcon = vm.playModeIcon;
                    }
                    updateRegistration(6, vmPlayModeIcon);


                    if (vmPlayModeIcon != null) {
                        // read vm.playModeIcon.get()
                        vmPlayModeIconGet = vmPlayModeIcon.get();
                    }
            }
            if ((dirtyFlags & 0x980L) != 0) {

                    if (vm != null) {
                        // read vm.currentSeekPosition
                        vmCurrentSeekPosition = vm.currentSeekPosition;
                    }
                    updateRegistration(7, vmCurrentSeekPosition);


                    if (vmCurrentSeekPosition != null) {
                        // read vm.currentSeekPosition.get()
                        vmCurrentSeekPositionGet = vmCurrentSeekPosition.get();
                    }
            }
        }
        if ((dirtyFlags & 0xa00L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x90aL) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.CommonBindingAdapter.loadUrl(((androidx.appcompat.widget.AppCompatImageView) this.albumArt), vmCoverImgGet, vmPlaceHolderGet);
        }
        if ((dirtyFlags & 0x920L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.artist, vmArtistGet);
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.btnClose.setOnClickListener(mCallback16);
            this.icPlayList.setOnClickListener(mCallback22);
            this.mode.setOnClickListener(mCallback21);
            this.next.setOnClickListener(mCallback18);
            this.playPause.setOnClickListener(mCallback19);
            this.popupMenu.setOnClickListener(mCallback17);
            this.previous.setOnClickListener(mCallback20);
        }
        if ((dirtyFlags & 0x940L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.IconBindingAdapter.setIcon(this.mode, vmPlayModeIconGet);
        }
        if ((dirtyFlags & 0x910L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.IconBindingAdapter.isPlaying(this.playPause, vmIsPlayingGet);
        }
        if ((dirtyFlags & 0x904L) != 0) {
            // api target 1

            this.seekBottom.setMax(vmMaxSeekDurationGet);
            this.songProgressNormal.setMax(vmMaxSeekDurationGet);
        }
        if ((dirtyFlags & 0x980L) != 0) {
            // api target 1

            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.seekBottom, vmCurrentSeekPositionGet);
            this.songProgressNormal.setProgress(vmCurrentSeekPositionGet);
        }
        if ((dirtyFlags & 0xa00L) != 0) {
            // api target 1

            this.seekBottom.setOnSeekBarChangeListener(event);
        }
        if ((dirtyFlags & 0x901L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, vmTitleGet);
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


                    click.more();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.playMode();
                }
                break;
            }
            case 4: {
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
            case 5: {
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
            case 1: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.slideDown();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // click
                com.kunminx.puremusic.ui.page.PlayerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.showPlayList();
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.title
        flag 1 (0x2L): vm.coverImg
        flag 2 (0x3L): vm.maxSeekDuration
        flag 3 (0x4L): vm.placeHolder
        flag 4 (0x5L): vm.isPlaying
        flag 5 (0x6L): vm.artist
        flag 6 (0x7L): vm.playModeIcon
        flag 7 (0x8L): vm.currentSeekPosition
        flag 8 (0x9L): vm
        flag 9 (0xaL): event
        flag 10 (0xbL): click
        flag 11 (0xcL): null
    flag mapping end*/
    //end
}