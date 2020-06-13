// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class ChatFragment$AudioHolder_ViewBinding extends ChatFragment$BaseHolder_ViewBinding {
  private ChatFragment.AudioHolder target;

  @UiThread
  public ChatFragment$AudioHolder_ViewBinding(ChatFragment.AudioHolder target, View source) {
    super(target, source);

    this.target = target;

    target.mContent = Utils.findRequiredViewAsType(source, R.id.txt_content, "field 'mContent'", TextView.class);
    target.mAudioTrack = Utils.findRequiredViewAsType(source, R.id.im_audio_track, "field 'mAudioTrack'", ImageView.class);
  }

  @Override
  public void unbind() {
    ChatFragment.AudioHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mContent = null;
    target.mAudioTrack = null;

    super.unbind();
  }
}
