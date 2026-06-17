package com.bytedance.android.input.fragment.custom_symbol.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class CompatSymbolEditText extends AppCompatEditText {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompatSymbolEditText(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompatSymbolEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompatSymbolEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
