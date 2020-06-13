// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.activities;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.common.widget.PortraitView;
import net.qiujuer.italker.push.R;

public class PersonalActivity_ViewBinding implements Unbinder {
  private PersonalActivity target;

  private View view7f090054;

  @UiThread
  public PersonalActivity_ViewBinding(PersonalActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PersonalActivity_ViewBinding(final PersonalActivity target, View source) {
    this.target = target;

    View view;
    target.mHeader = Utils.findRequiredViewAsType(source, R.id.im_header, "field 'mHeader'", ImageView.class);
    target.mPortrait = Utils.findRequiredViewAsType(source, R.id.im_portrait, "field 'mPortrait'", PortraitView.class);
    target.mName = Utils.findRequiredViewAsType(source, R.id.txt_name, "field 'mName'", TextView.class);
    target.mDesc = Utils.findRequiredViewAsType(source, R.id.txt_desc, "field 'mDesc'", TextView.class);
    target.mFollows = Utils.findRequiredViewAsType(source, R.id.txt_follows, "field 'mFollows'", TextView.class);
    target.mFollowing = Utils.findRequiredViewAsType(source, R.id.txt_following, "field 'mFollowing'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_say_hello, "field 'mSayHello' and method 'onSayHelloClick'");
    target.mSayHello = Utils.castView(view, R.id.btn_say_hello, "field 'mSayHello'", Button.class);
    view7f090054 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSayHelloClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PersonalActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mHeader = null;
    target.mPortrait = null;
    target.mName = null;
    target.mDesc = null;
    target.mFollows = null;
    target.mFollowing = null;
    target.mSayHello = null;

    view7f090054.setOnClickListener(null);
    view7f090054 = null;
  }
}
