// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.user;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public class UpdateInfoFragment_ViewBinding implements Unbinder {
  private UpdateInfoFragment target;

  private View view7f0900df;

  private View view7f0900dd;

  private View view7f090056;

  @UiThread
  public UpdateInfoFragment_ViewBinding(final UpdateInfoFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.im_sex, "field 'mSex' and method 'onSexClick'");
    target.mSex = Utils.castView(view, R.id.im_sex, "field 'mSex'", ImageView.class);
    view7f0900df = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSexClick();
      }
    });
    target.mDesc = Utils.findRequiredViewAsType(source, R.id.edit_desc, "field 'mDesc'", EditText.class);
    view = Utils.findRequiredView(source, R.id.im_portrait, "field 'mPortrait' and method 'onPortraitClick'");
    target.mPortrait = Utils.castView(view, R.id.im_portrait, "field 'mPortrait'", PortraitView.class);
    view7f0900dd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPortraitClick();
      }
    });
    target.mLoading = Utils.findRequiredViewAsType(source, R.id.loading, "field 'mLoading'", Loading.class);
    view = Utils.findRequiredView(source, R.id.btn_submit, "field 'mSubmit' and method 'onSubmitClick'");
    target.mSubmit = Utils.castView(view, R.id.btn_submit, "field 'mSubmit'", Button.class);
    view7f090056 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmitClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    UpdateInfoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSex = null;
    target.mDesc = null;
    target.mPortrait = null;
    target.mLoading = null;
    target.mSubmit = null;

    view7f0900df.setOnClickListener(null);
    view7f0900df = null;
    view7f0900dd.setOnClickListener(null);
    view7f0900dd = null;
    view7f090056.setOnClickListener(null);
    view7f090056 = null;
  }
}
