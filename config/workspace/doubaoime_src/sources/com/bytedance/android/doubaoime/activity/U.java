package com.bytedance.android.doubaoime.activity;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class U extends ClickableSpan {
    final /* synthetic */ PrivacyStatementActivity a;

    U(PrivacyStatementActivity privacyStatementActivity) {
        this.a = privacyStatementActivity;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        kotlin.s.c.l.f(view, "widget");
        this.a.startActivity(new Intent(this.a, (Class<?>) ImeGuideSettingsNewActivity.class));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        kotlin.s.c.l.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setColor(this.a.getColor(C0838R.color.privacy_statement_url_link));
        textPaint.setUnderlineText(false);
    }
}
