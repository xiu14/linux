package com.bytedance.android.input.keyboard.ClipboardHistory;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class ClipboardHistoryEmptyView extends FrameLayout implements View.OnClickListener {
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardHistoryEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "ClipboardHistoryEmptyView";
        FrameLayout.inflate(context, C0838R.layout.clipboard_history_empty_view, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onClick, v id: ");
        M.append(view != null ? Integer.valueOf(view.getId()) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged, orientation: ");
        M.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        kotlin.s.c.l.e(getContext(), "context");
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onVisibilityChanged, orientation: ");
        e.a.a.a.a.F0(M, getResources().getConfiguration().orientation, ", visibility = ", i, " , view = ");
        M.append(view);
        com.bytedance.android.input.r.j.i(str, M.toString());
        if ((kotlin.s.c.l.a(view, getParent()) || kotlin.s.c.l.a(view, this)) && i == 0) {
            kotlin.s.c.l.e(getContext(), "context");
        }
        String str2 = this.a;
        StringBuilder M2 = e.a.a.a.a.M("onVisibilityChanged over, orientation: ");
        e.a.a.a.a.F0(M2, getResources().getConfiguration().orientation, ", visibility = ", i, " , view = ");
        M2.append(view);
        com.bytedance.android.input.r.j.i(str2, M2.toString());
    }
}
