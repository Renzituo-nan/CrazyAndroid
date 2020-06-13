// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.activities;

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

public class GroupMemberActivity$ViewHolder_ViewBinding implements Unbinder {
  private GroupMemberActivity.ViewHolder target;

  private View view7f0900dd;

  @UiThread
  public GroupMemberActivity$ViewHolder_ViewBinding(final GroupMemberActivity.ViewHolder target,
      View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.im_portrait, "field 'mPortrait' and method 'onPortraitClick'");
    target.mPortrait = Utils.castView(view, R.id.im_portrait, "field 'mPortrait'", PortraitView.class);
    view7f0900dd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPortraitClick();
      }
    });
    target.mName = Utils.findRequiredViewAsType(source, R.id.txt_name, "field 'mName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupMemberActivity.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPortrait = null;
    target.mName = null;

    view7f0900dd.setOnClickListener(null);
    view7f0900dd = null;
  }
}
