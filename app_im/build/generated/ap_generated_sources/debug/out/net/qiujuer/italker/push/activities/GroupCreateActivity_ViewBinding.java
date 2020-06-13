// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.activities;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.common.widget.PortraitView;
import net.qiujuer.italker.push.R;

public class GroupCreateActivity_ViewBinding implements Unbinder {
  private GroupCreateActivity target;

  private View view7f0900dd;

  @UiThread
  public GroupCreateActivity_ViewBinding(GroupCreateActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GroupCreateActivity_ViewBinding(final GroupCreateActivity target, View source) {
    this.target = target;

    View view;
    target.mRecycler = Utils.findRequiredViewAsType(source, R.id.recycler, "field 'mRecycler'", RecyclerView.class);
    target.mName = Utils.findRequiredViewAsType(source, R.id.edit_name, "field 'mName'", EditText.class);
    target.mDesc = Utils.findRequiredViewAsType(source, R.id.edit_desc, "field 'mDesc'", EditText.class);
    view = Utils.findRequiredView(source, R.id.im_portrait, "field 'mPortrait' and method 'onPortraitClick'");
    target.mPortrait = Utils.castView(view, R.id.im_portrait, "field 'mPortrait'", PortraitView.class);
    view7f0900dd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPortraitClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupCreateActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecycler = null;
    target.mName = null;
    target.mDesc = null;
    target.mPortrait = null;

    view7f0900dd.setOnClickListener(null);
    view7f0900dd = null;
  }
}
