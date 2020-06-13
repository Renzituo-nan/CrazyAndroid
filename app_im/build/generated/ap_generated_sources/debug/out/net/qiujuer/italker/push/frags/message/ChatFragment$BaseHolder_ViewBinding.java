// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.message;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.genius.ui.widget.Loading;
import net.qiujuer.italker.common.widget.PortraitView;
import net.qiujuer.italker.push.R;

public class ChatFragment$BaseHolder_ViewBinding implements Unbinder {
  private ChatFragment.BaseHolder target;

  private View view7f0900dd;

  @UiThread
  public ChatFragment$BaseHolder_ViewBinding(final ChatFragment.BaseHolder target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.im_portrait, "field 'mPortrait' and method 'onRePushClick'");
    target.mPortrait = Utils.castView(view, R.id.im_portrait, "field 'mPortrait'", PortraitView.class);
    view7f0900dd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRePushClick();
      }
    });
    target.mLoading = Utils.findOptionalViewAsType(source, R.id.loading, "field 'mLoading'", Loading.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatFragment.BaseHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPortrait = null;
    target.mLoading = null;

    view7f0900dd.setOnClickListener(null);
    view7f0900dd = null;
  }
}
