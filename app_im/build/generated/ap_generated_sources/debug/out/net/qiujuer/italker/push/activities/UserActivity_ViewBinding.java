// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.activities;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class UserActivity_ViewBinding implements Unbinder {
  private UserActivity target;

  @UiThread
  public UserActivity_ViewBinding(UserActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserActivity_ViewBinding(UserActivity target, View source) {
    this.target = target;

    target.mBg = Utils.findRequiredViewAsType(source, R.id.im_bg, "field 'mBg'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBg = null;
  }
}
