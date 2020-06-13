// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.activities;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.genius.ui.widget.FloatActionButton;
import net.qiujuer.italker.common.widget.PortraitView;
import net.qiujuer.italker.push.R;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f0900dd;

  private View view7f090050;

  private View view7f0900de;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.mLayAppbar = Utils.findRequiredView(source, R.id.appbar, "field 'mLayAppbar'");
    view = Utils.findRequiredView(source, R.id.im_portrait, "field 'mPortrait' and method 'onPortraitClick'");
    target.mPortrait = Utils.castView(view, R.id.im_portrait, "field 'mPortrait'", PortraitView.class);
    view7f0900dd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPortraitClick();
      }
    });
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.txt_title, "field 'mTitle'", TextView.class);
    target.mContainer = Utils.findRequiredViewAsType(source, R.id.lay_container, "field 'mContainer'", FrameLayout.class);
    target.mNavigation = Utils.findRequiredViewAsType(source, R.id.navigation, "field 'mNavigation'", BottomNavigationView.class);
    view = Utils.findRequiredView(source, R.id.btn_action, "field 'mAction' and method 'onActionClick'");
    target.mAction = Utils.castView(view, R.id.btn_action, "field 'mAction'", FloatActionButton.class);
    view7f090050 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onActionClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.im_search, "method 'onSearchMenuClick'");
    view7f0900de = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSearchMenuClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLayAppbar = null;
    target.mPortrait = null;
    target.mTitle = null;
    target.mContainer = null;
    target.mNavigation = null;
    target.mAction = null;

    view7f0900dd.setOnClickListener(null);
    view7f0900dd = null;
    view7f090050.setOnClickListener(null);
    view7f090050 = null;
    view7f0900de.setOnClickListener(null);
    view7f0900de = null;
  }
}
