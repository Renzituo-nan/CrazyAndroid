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

public class SearchGroupFragment$ViewHolder_ViewBinding implements Unbinder {
  private SearchGroupFragment.ViewHolder target;

  private View view7f0900db;

  @UiThread
  public SearchGroupFragment$ViewHolder_ViewBinding(final SearchGroupFragment.ViewHolder target,
      View source) {
    this.target = target;

    View view;
    target.mPortraitView = Utils.findRequiredViewAsType(source, R.id.im_portrait, "field 'mPortraitView'", PortraitView.class);
    target.mName = Utils.findRequiredViewAsType(source, R.id.txt_name, "field 'mName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.im_join, "field 'mJoin' and method 'onJoinClick'");
    target.mJoin = Utils.castView(view, R.id.im_join, "field 'mJoin'", ImageView.class);
    view7f0900db = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onJoinClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchGroupFragment.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPortraitView = null;
    target.mName = null;
    target.mJoin = null;

    view7f0900db.setOnClickListener(null);
    view7f0900db = null;
  }
}
