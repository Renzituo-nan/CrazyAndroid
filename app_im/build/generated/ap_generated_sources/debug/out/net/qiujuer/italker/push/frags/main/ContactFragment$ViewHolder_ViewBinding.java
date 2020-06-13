// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.main;

import android.view.View;
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

public class ContactFragment$ViewHolder_ViewBinding implements Unbinder {
  private ContactFragment.ViewHolder target;

  private View view7f0900dd;

  @UiThread
  public ContactFragment$ViewHolder_ViewBinding(final ContactFragment.ViewHolder target,
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
    target.mDesc = Utils.findRequiredViewAsType(source, R.id.txt_desc, "field 'mDesc'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ContactFragment.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPortraitView = null;
    target.mName = null;
    target.mDesc = null;

    view7f0900dd.setOnClickListener(null);
    view7f0900dd = null;
  }
}
