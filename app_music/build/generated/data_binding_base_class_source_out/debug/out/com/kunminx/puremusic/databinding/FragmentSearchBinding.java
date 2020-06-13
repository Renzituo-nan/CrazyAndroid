// Generated by data binding compiler. Do not edit!
package com.kunminx.puremusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kunminx.puremusic.R;
import com.kunminx.puremusic.ui.page.SearchFragment;
import com.kunminx.puremusic.ui.state.SearchViewModel;
import java.lang.Deprecated;
import java.lang.Object;
import net.steamcrafted.materialiconlib.MaterialIconView;

public abstract class FragmentSearchBinding extends ViewDataBinding {
  @NonNull
  public final MaterialIconView btnBack;

  @NonNull
  public final TextView btnSubsribe;

  @NonNull
  public final MaterialIconView ic;

  @NonNull
  public final SeekBar pb;

  @NonNull
  public final SeekBar pbCancelable;

  @NonNull
  public final TextView tvContent;

  @NonNull
  public final TextView tvTestDownload;

  @NonNull
  public final TextView tvTestLifecycleDownload;

  @NonNull
  public final TextView tvTip;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected SearchFragment.ClickProxy mClick;

  @Bindable
  protected SearchViewModel mVm;

  protected FragmentSearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialIconView btnBack, TextView btnSubsribe, MaterialIconView ic, SeekBar pb,
      SeekBar pbCancelable, TextView tvContent, TextView tvTestDownload,
      TextView tvTestLifecycleDownload, TextView tvTip, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBack = btnBack;
    this.btnSubsribe = btnSubsribe;
    this.ic = ic;
    this.pb = pb;
    this.pbCancelable = pbCancelable;
    this.tvContent = tvContent;
    this.tvTestDownload = tvTestDownload;
    this.tvTestLifecycleDownload = tvTestLifecycleDownload;
    this.tvTip = tvTip;
    this.tvTitle = tvTitle;
  }

  public abstract void setClick(@Nullable SearchFragment.ClickProxy click);

  @Nullable
  public SearchFragment.ClickProxy getClick() {
    return mClick;
  }

  public abstract void setVm(@Nullable SearchViewModel vm);

  @Nullable
  public SearchViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, R.layout.fragment_search, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, R.layout.fragment_search, null, false, component);
  }

  public static FragmentSearchBinding bind(@NonNull View view) {
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
  public static FragmentSearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSearchBinding)bind(component, view, R.layout.fragment_search);
  }
}
