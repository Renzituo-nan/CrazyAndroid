// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class ChatGroupFragment_ViewBinding extends ChatFragment_ViewBinding {
  private ChatGroupFragment target;

  @UiThread
  public ChatGroupFragment_ViewBinding(ChatGroupFragment target, View source) {
    super(target, source);

    this.target = target;

    target.mHeader = Utils.findRequiredViewAsType(source, R.id.im_header, "field 'mHeader'", ImageView.class);
    target.mLayMembers = Utils.findRequiredViewAsType(source, R.id.lay_members, "field 'mLayMembers'", LinearLayout.class);
    target.mMemberMore = Utils.findRequiredViewAsType(source, R.id.txt_member_more, "field 'mMemberMore'", TextView.class);
  }

  @Override
  public void unbind() {
    ChatGroupFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mHeader = null;
    target.mLayMembers = null;
    target.mMemberMore = null;

    super.unbind();
  }
}
