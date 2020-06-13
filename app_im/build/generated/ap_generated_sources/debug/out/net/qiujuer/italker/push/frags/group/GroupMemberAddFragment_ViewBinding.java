// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.group;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class GroupMemberAddFragment_ViewBinding implements Unbinder {
  private GroupMemberAddFragment target;

  @UiThread
  public GroupMemberAddFragment_ViewBinding(GroupMemberAddFragment target, View source) {
    this.target = target;

    target.mRecycler = Utils.findRequiredViewAsType(source, R.id.recycler, "field 'mRecycler'", RecyclerView.class);
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupMemberAddFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecycler = null;
    target.mToolbar = null;
  }
}
