package com.obric.oui.textswitcher;

import android.text.TextUtils;
import android.view.View;
import android.widget.ViewSwitcher;
import com.obric.oui.text.OTextView;
import com.obric.oui.textswitcher.OTextSwitcher;
import java.util.Objects;

/* loaded from: classes2.dex */
final class a implements ViewSwitcher.ViewFactory {
    final /* synthetic */ OTextSwitcher.a a;

    a(OTextSwitcher.a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        OTextView oTextView = new OTextView(this.a.b, null, 0, null, 14);
        OTextSwitcher oTextSwitcher = OTextSwitcher.this;
        int i = OTextSwitcher.f8098c;
        Objects.requireNonNull(oTextSwitcher);
        oTextView.setGravity(16);
        oTextView.setSingleLine(true);
        Objects.requireNonNull(OTextSwitcher.this);
        oTextView.setEllipsize(TextUtils.TruncateAt.END);
        return oTextView;
    }
}
