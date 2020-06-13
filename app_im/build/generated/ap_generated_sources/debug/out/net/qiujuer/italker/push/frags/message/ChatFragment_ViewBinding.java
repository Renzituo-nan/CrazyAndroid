// Generated code from Butter Knife. Do not modify!
package net.qiujuer.italker.push.frags.message;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.IllegalStateException;
import java.lang.Override;
import net.qiujuer.italker.push.R;

public class ChatFragment_ViewBinding implements Unbinder {
  private ChatFragment target;

  private View view7f090056;

  private View view7f090051;

  private View view7f090053;

  @UiThread
  public ChatFragment_ViewBinding(final ChatFragment target, View source) {
    this.target = target;

    View view;
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler, "field 'mRecyclerView'", RecyclerView.class);
    target.mAppBarLayout = Utils.findRequiredViewAsType(source, R.id.appbar, "field 'mAppBarLayout'", AppBarLayout.class);
    target.mCollapsingLayout = Utils.findRequiredViewAsType(source, R.id.collapsingToolbarLayout, "field 'mCollapsingLayout'", CollapsingToolbarLayout.class);
    target.mContent = Utils.findRequiredViewAsType(source, R.id.edit_content, "field 'mContent'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_submit, "field 'mSubmit' and method 'onSubmitClick'");
    target.mSubmit = view;
    view7f090056 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmitClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_face, "method 'onFaceClick'");
    view7f090051 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFaceClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_record, "method 'onRecordClick'");
    view7f090053 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRecordClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.mRecyclerView = null;
    target.mAppBarLayout = null;
    target.mCollapsingLayout = null;
    target.mContent = null;
    target.mSubmit = null;

    view7f090056.setOnClickListener(null);
    view7f090056 = null;
    view7f090051.setOnClickListener(null);
    view7f090051 = null;
    view7f090053.setOnClickListener(null);
    view7f090053 = null;
  }
}
