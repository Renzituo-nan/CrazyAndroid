// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.message;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class ChatFragment$PicHolder_ViewBinding extends ChatFragment$BaseHolder_ViewBinding {
  private ChatFragment.PicHolder target;

  @UiThread
  public ChatFragment$PicHolder_ViewBinding(ChatFragment.PicHolder target, View source) {
    super(target, source);

    this.target = target;

    target.mContent = Utils.findRequiredViewAsType(source, R.id.im_image, "field 'mContent'", ImageView.class);
  }

  @Override
  public void unbind() {
    ChatFragment.PicHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mContent = null;

    super.unbind();
  }
}
