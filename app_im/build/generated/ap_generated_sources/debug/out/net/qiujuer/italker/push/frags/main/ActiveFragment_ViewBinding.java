// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.main;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.common.widget.EmptyView;
import net.qiujuer.italker.push.R;

public class ActiveFragment_ViewBinding implements Unbinder {
  private ActiveFragment target;

  @UiThread
  public ActiveFragment_ViewBinding(ActiveFragment target, View source) {
    this.target = target;

    target.mEmptyView = Utils.findRequiredViewAsType(source, R.id.empty, "field 'mEmptyView'", EmptyView.class);
    target.mRecycler = Utils.findRequiredViewAsType(source, R.id.recycler, "field 'mRecycler'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ActiveFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEmptyView = null;
    target.mRecycler = null;
  }
}
