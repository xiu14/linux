package com.bytedance.android.doubaoime.activity;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.window.permission.WebViewActivity;

/* loaded from: classes.dex */
public final class T extends ClickableSpan {
    final /* synthetic */ PrivacyStatementActivity a;
    final /* synthetic */ kotlin.s.c.z<String> b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.s.c.z<String> f1946c;

    T(PrivacyStatementActivity privacyStatementActivity, kotlin.s.c.z<String> zVar, kotlin.s.c.z<String> zVar2) {
        this.a = privacyStatementActivity;
        this.b = zVar;
        this.f1946c = zVar2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        kotlin.s.c.l.f(view, "widget");
        WebViewActivity.m(this.a, this.b.a, this.f1946c.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        kotlin.s.c.l.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setColor(this.a.getColor(C0838R.color.privacy_statement_url_link));
        textPaint.setUnderlineText(false);
    }
}
