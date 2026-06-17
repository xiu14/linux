package com.obric.oui.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.a.b.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class ODivider extends View {
    private int a;

    public ODivider(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setStyle(int i) {
        setBackgroundColor(ContextCompat.getColor(getContext(), C0838R.color.oui_line_2));
    }

    public ODivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ODivider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.p, 0, 0);
        try {
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
            setStyle(this.a);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
