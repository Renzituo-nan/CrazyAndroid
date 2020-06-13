// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.group;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.common.widget.PortraitView;
import net.qiujuer.italker.push.R;

public class GroupMemberAddFragment$ViewHolder_ViewBinding implements Unbinder {
  private GroupMemberAddFragment.ViewHolder target;

  private View view7f090059;

  @UiThread
  public GroupMemberAddFragment$ViewHolder_ViewBinding(
      final GroupMemberAddFragment.ViewHolder target, View source) {
    this.target = target;

    View view;
    target.mPortrait = Utils.findRequiredViewAsType(source, R.id.im_portrait, "field 'mPortrait'", PortraitView.class);
    target.mName = Utils.findRequiredViewAsType(source, R.id.txt_name, "field 'mName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.cb_select, "field 'mSelect' and method 'onCheckedChanged'");
    target.mSelect = Utils.castView(view, R.id.cb_select, "field 'mSelect'", CheckBox.class);
    view7f090059 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onCheckedChanged(p1);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupMemberAddFragment.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPortrait = null;
    target.mName = null;
    target.mSelect = null;

    ((CompoundButton) view7f090059).setOnCheckedChangeListener(null);
    view7f090059 = null;
  }
}
