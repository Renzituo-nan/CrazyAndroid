// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.panel;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class FaceHolder_ViewBinding implements Unbinder {
  private FaceHolder target;

  @UiThread
  public FaceHolder_ViewBinding(FaceHolder target, View source) {
    this.target = target;

    target.mFace = Utils.findRequiredViewAsType(source, R.id.im_face, "field 'mFace'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FaceHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFace = null;
  }
}
