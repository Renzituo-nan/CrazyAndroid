// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.message;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class ChatFragment$TextHolder_ViewBinding extends ChatFragment$BaseHolder_ViewBinding {
  private ChatFragment.TextHolder target;

  @UiThread
  public ChatFragment$TextHolder_ViewBinding(ChatFragment.TextHolder target, View source) {
    super(target, source);

    this.target = target;

    target.mContent = Utils.findRequiredViewAsType(source, R.id.txt_content, "field 'mContent'", TextView.class);
  }

  @Override
  public void unbind() {
    ChatFragment.TextHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mContent = null;

    super.unbind();
  }
}
