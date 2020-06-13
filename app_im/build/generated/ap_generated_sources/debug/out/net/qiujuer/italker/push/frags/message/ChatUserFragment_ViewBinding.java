// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.message;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.common.widget.PortraitView;
import net.qiujuer.italker.push.R;

public class ChatUserFragment_ViewBinding extends ChatFragment_ViewBinding {
  private ChatUserFragment target;

  private View view7f0900dd;

  @UiThread
  public ChatUserFragment_ViewBinding(final ChatUserFragment target, View source) {
    super(target, source);

    this.target = target;

    View view;
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
  public void unbind() {
    ChatUserFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPortrait = null;

    view7f0900dd.setOnClickListener(null);
    view7f0900dd = null;

    super.unbind();
  }
}
