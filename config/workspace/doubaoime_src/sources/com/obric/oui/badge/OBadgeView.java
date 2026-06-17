package com.obric.oui.badge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.obric.oui.text.OTextView;
import e.a.a.a.a;
import e.i.a.b.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBadgeView extends OTextView {
    private static int j = 99;
    private int i;

    public OBadgeView(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i != 0) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float m = a.m("Resources.getSystem()", 1, (float) 1.5d);
            Paint paint = new Paint();
            paint.setColor(this.i);
            paint.setAntiAlias(true);
            if (canvas != null) {
                canvas.drawCircle(width, height, m, paint);
            }
            if (canvas != null) {
                canvas.drawCircle(width - a.e0("Resources.getSystem()", 1, 6), height, m, paint);
            }
            if (canvas != null) {
                canvas.drawCircle(width + a.e0("Resources.getSystem()", 1, 6), height, m, paint);
            }
        }
    }

    @Override // com.obric.oui.text.OTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.obric.oui.text.OTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setMaxNumberInCount(int i) {
        j = i;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        l.f(charSequence, "inText");
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Integer valueOf = Integer.valueOf(charSequence.toString());
                if (valueOf.intValue() > j) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    sb.append('+');
                    charSequence = sb.toString();
                } else if (valueOf.intValue() < 0) {
                    charSequence = "";
                }
            } catch (Exception unused) {
                StringBuilder M = a.M("Excepted a int but get ");
                M.append(getText());
                throw new IllegalArgumentException(M.toString());
            }
        }
        super.setText(charSequence, bufferType);
    }

    public OBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null, 8);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.b);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.OBadgeView)");
        this.i = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        setLines(1);
    }
}
