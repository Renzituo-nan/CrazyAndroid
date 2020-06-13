// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.account;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.genius.ui.widget.Loading;
import net.qiujuer.italker.push.R;

public class LoginFragment_ViewBinding implements Unbinder {
  private LoginFragment target;

  private View view7f090056;

  private View view7f09019e;

  @UiThread
  public LoginFragment_ViewBinding(final LoginFragment target, View source) {
    this.target = target;

    View view;
    target.mPhone = Utils.findRequiredViewAsType(source, R.id.edit_phone, "field 'mPhone'", EditText.class);
    target.mPassword = Utils.findRequiredViewAsType(source, R.id.edit_password, "field 'mPassword'", EditText.class);
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
    view = Utils.findRequiredView(source, R.id.txt_go_register, "method 'onShowRegisterClick'");
    view7f09019e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onShowRegisterClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPhone = null;
    target.mPassword = null;
    target.mLoading = null;
    target.mSubmit = null;

    view7f090056.setOnClickListener(null);
    view7f090056 = null;
    view7f09019e.setOnClickListener(null);
    view7f09019e = null;
  }
}
