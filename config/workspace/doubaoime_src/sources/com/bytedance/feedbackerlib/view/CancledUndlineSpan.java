package com.bytedance.feedbackerlib.view;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;

/* loaded from: classes.dex */
public class CancledUndlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
