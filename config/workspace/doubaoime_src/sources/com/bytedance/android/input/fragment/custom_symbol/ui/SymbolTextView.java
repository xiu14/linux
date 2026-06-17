package com.bytedance.android.input.fragment.custom_symbol.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.fragment.custom_symbol.l.f;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public final class SymbolTextView extends TextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SymbolTextView(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Object J2;
        String obj;
        try {
            getPaint().getFontMetrics();
            CharSequence text = getText();
            if (text == null || (obj = text.toString()) == null) {
                J2 = null;
            } else {
                f fVar = f.a;
                if (f.b().contains(obj)) {
                    Context context = getContext();
                    l.e(context, "context");
                    l.f(context, "context");
                    float applyDimension = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
                    if (canvas != null) {
                        canvas.translate(applyDimension, 0.0f);
                    }
                }
                if (f.a().contains(obj)) {
                    Context context2 = getContext();
                    l.e(context2, "context");
                    l.f(context2, "context");
                    float applyDimension2 = TypedValue.applyDimension(1, 5.0f, context2.getResources().getDisplayMetrics());
                    if (canvas != null) {
                        canvas.translate(-applyDimension2, 0.0f);
                    }
                }
                J2 = o.a;
            }
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            String str = "onFailure e = " + b;
            l.f(str, "msg");
            IAppGlobals.a.e("[custom_symbol]", str);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SymbolTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
