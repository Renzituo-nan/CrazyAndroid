// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.activities;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class GroupMemberActivity_ViewBinding implements Unbinder {
  private GroupMemberActivity target;

  @UiThread
  public GroupMemberActivity_ViewBinding(GroupMemberActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GroupMemberActivity_ViewBinding(GroupMemberActivity target, View source) {
    this.target = target;

    target.mRecycler = Utils.findRequiredViewAsType(source, R.id.recycler, "field 'mRecycler'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupMemberActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecycler = null;
  }
}
