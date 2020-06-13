package com.kunminx.puremusic.databinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterPlayItemBindingImpl extends AdapterPlayItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_play_status, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterPlayItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private AdapterPlayItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (net.steamcrafted.materialiconlib.MaterialIconView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivCover.setTag(null);
        this.rootView.setTag(null);
        this.tvArtist.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.album == variableId) {
            setAlbum((com.kunminx.puremusic.data.bean.TestAlbum.TestMusic) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAlbum(@Nullable com.kunminx.puremusic.data.bean.TestAlbum.TestMusic Album) {
        this.mAlbum = Album;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.album);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.kunminx.puremusic.data.bean.TestAlbum.TestMusic album = mAlbum;
        java.lang.String albumArtistName = null;
        java.lang.String albumCoverImg = null;
        java.lang.String albumTitle = null;
        com.kunminx.puremusic.data.bean.TestAlbum.TestArtist albumArtist = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (album != null) {
                    // read album.coverImg
                    albumCoverImg = album.getCoverImg();
                    // read album.title
                    albumTitle = album.getTitle();
                    // read album.artist
                    albumArtist = album.getArtist();
                }


                if (albumArtist != null) {
                    // read album.artist.name
                    albumArtistName = albumArtist.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.kunminx.puremusic.ui.base.binding_adapter.CommonBindingAdapter.loadUrl(this.ivCover, albumCoverImg, (android.graphics.drawable.Drawable)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvArtist, albumArtistName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, albumTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): album
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}