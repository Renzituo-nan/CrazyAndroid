// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.search;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.common.widget.PortraitView;
import net.qiujuer.italker.push.R;

public class SearchUserFragment$ViewHolder_ViewBinding implements Unbinder {
  private SearchUserFragment.ViewHolder target;

  private View view7f0900dd;

  private View view7f0900d8;

  @UiThread
  public SearchUserFragment$ViewHolder_ViewBinding(final SearchUserFragment.ViewHolder target,
      View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.im_portrait, "field 'mPortraitView' and method 'onPortraitClick'");
    target.mPortraitView = Utils.castView(view, R.id.im_portrait, "field 'mPortraitView'", PortraitView.class);
    view7f0900dd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPortraitClick();
      }
    });
    target.mName = Utils.findRequiredViewAsType(source, R.id.txt_name, "field 'mName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.im_follow, "field 'mFollow' and method 'onFollowClick'");
    target.mFollow = Utils.castView(view, R.id.im_follow, "field 'mFollow'", ImageView.class);
    view7f0900d8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFollowClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchUserFragment.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPortraitView = null;
    target.mName = null;
    target.mFollow = null;

    view7f0900dd.setOnClickListener(null);
    view7f0900dd = null;
    view7f0900d8.setOnClickListener(null);
    view7f0900d8 = null;
  }
}
