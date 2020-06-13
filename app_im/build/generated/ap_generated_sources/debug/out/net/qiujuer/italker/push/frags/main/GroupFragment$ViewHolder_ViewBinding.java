// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.main;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.common.widget.PortraitView;
import net.qiujuer.italker.push.R;

public class GroupFragment$ViewHolder_ViewBinding implements Unbinder {
  private GroupFragment.ViewHolder target;

  @UiThread
  public GroupFragment$ViewHolder_ViewBinding(GroupFragment.ViewHolder target, View source) {
    this.target = target;

    target.mPortraitView = Utils.findRequiredViewAsType(source, R.id.im_portrait, "field 'mPortraitView'", PortraitView.class);
    target.mName = Utils.findRequiredViewAsType(source, R.id.txt_name, "field 'mName'", TextView.class);
    target.mDesc = Utils.findRequiredViewAsType(source, R.id.txt_desc, "field 'mDesc'", TextView.class);
    target.mMember = Utils.findRequiredViewAsType(source, R.id.txt_member, "field 'mMember'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupFragment.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPortraitView = null;
    target.mName = null;
    target.mDesc = null;
    target.mMember = null;
  }
}
