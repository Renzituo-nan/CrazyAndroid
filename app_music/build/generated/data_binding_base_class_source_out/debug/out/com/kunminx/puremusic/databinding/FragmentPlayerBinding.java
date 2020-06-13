// Generated by data binding compiler. Do not edit!
package com.kunminx.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.ui.page.PlayerFragment;
import com.kunminx.puremusic.ui.state.PlayerViewModel;
import com.kunminx.puremusic.ui.view.LyricView;
import com.kunminx.puremusic.ui.view.PlayPauseView;
import java.lang.Deprecated;
import java.lang.Object;
import net.steamcrafted.materialiconlib.MaterialIconView;

public abstract class FragmentPlayerBinding extends ViewDataBinding {
  @NonNull
  public final View albumArt;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final TextView artist;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final MaterialIconView btnClose;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final RelativeLayout customToolbar;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final MaterialIconView icPlayList;

  @NonNull
  public final View iconContainer;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final LyricView lyricView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final MaterialIconView mode;

  @NonNull
  public final MaterialIconView next;

  @NonNull
  public final PlayPauseView playPause;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final MaterialIconView popupMenu;

  @NonNull
  public final MaterialIconView previous;

  @NonNull
  public final SeekBar seekBottom;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final ProgressBar songProgressNormal;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final LinearLayout summary;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final TextView title;

  @NonNull
  public final CoordinatorLayout topContainer;

  @Bindable
  protected PlayerFragment.ClickProxy mClick;

  @Bindable
  protected PlayerFragment.EventHandler mEvent;

  @Bindable
  protected PlayerViewModel mVm;

  protected FragmentPlayerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View albumArt, TextView artist, MaterialIconView btnClose, RelativeLayout customToolbar,
      MaterialIconView icPlayList, View iconContainer, LyricView lyricView, MaterialIconView mode,
      MaterialIconView next, PlayPauseView playPause, MaterialIconView popupMenu,
      MaterialIconView previous, SeekBar seekBottom, ProgressBar songProgressNormal,
      LinearLayout summary, TextView title, CoordinatorLayout topContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.albumArt = albumArt;
    this.artist = artist;
    this.btnClose = btnClose;
    this.customToolbar = customToolbar;
    this.icPlayList = icPlayList;
    this.iconContainer = iconContainer;
    this.lyricView = lyricView;
    this.mode = mode;
    this.next = next;
    this.playPause = playPause;
    this.popupMenu = popupMenu;
    this.previous = previous;
    this.seekBottom = seekBottom;
    this.songProgressNormal = songProgressNormal;
    this.summary = summary;
    this.title = title;
    this.topContainer = topContainer;
  }

  public abstract void setClick(@Nullable PlayerFragment.ClickProxy click);

  @Nullable
  public PlayerFragment.ClickProxy getClick() {
    return mClick;
  }

  public abstract void setEvent(@Nullable PlayerFragment.EventHandler event);

  @Nullable
  public PlayerFragment.EventHandler getEvent() {
    return mEvent;
  }

  public abstract void setVm(@Nullable PlayerViewModel vm);

  @Nullable
  public PlayerViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static FragmentPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_player, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlayerBinding>inflateInternal(inflater, R.layout.fragment_player, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_player, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlayerBinding>inflateInternal(inflater, R.layout.fragment_player, null, false, component);
  }

  public static FragmentPlayerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentPlayerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlayerBinding)bind(component, view, R.layout.fragment_player);
  }
}
