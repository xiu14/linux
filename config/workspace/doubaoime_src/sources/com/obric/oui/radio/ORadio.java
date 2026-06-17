package com.obric.oui.radio;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.common.util.b;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public class ORadio extends AppCompatRadioButton {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private int f7967c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7968d;

    public ORadio(Context context) {
        this(context, null, 0, false, 14);
    }

    public ORadio(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12);
    }

    public ORadio(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ORadio(android.content.Context r3, android.util.AttributeSet r4, int r5, boolean r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            r0 = r7 & 4
            r1 = 0
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 8
            if (r7 == 0) goto L10
            r6 = r1
        L10:
            java.lang.String r7 = "context"
            kotlin.s.c.l.f(r3, r7)
            r2.<init>(r3, r4, r5)
            r2.f7968d = r6
            r6 = 1
            r2.b = r6
            if (r4 == 0) goto L49
            int[] r7 = e.i.a.b.b.B
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r7, r5, r1)
            java.lang.String r4 = "context.obtainStyledAttr….ORadio, defStyleAttr, 0)"
            kotlin.s.c.l.e(r3, r4)
            boolean r4 = r2.f7968d
            boolean r4 = r3.getBoolean(r6, r4)
            r2.f7968d = r4
            r4 = 3
            int r4 = r3.getInt(r4, r1)
            r2.f7967c = r4
            boolean r4 = r3.getBoolean(r1, r6)
            r2.b = r4
            r4 = 2
            boolean r4 = r3.getBoolean(r4, r1)
            r2.a = r4
            r3.recycle()
        L49:
            boolean r3 = r2.f7968d
            if (r3 != 0) goto L51
            r2.a()
            goto L54
        L51:
            r2.setClickable(r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.radio.ORadio.<init>(android.content.Context, android.util.AttributeSet, int, boolean, int):void");
    }

    private final void a() {
        if (this.f7968d) {
            return;
        }
        if (this.f7967c == 1) {
            setButtonDrawable(C0838R.drawable.o_ic_radio_tick_checked);
        } else {
            setButtonDrawable(this.a ? C0838R.drawable.o_radio_round_always_light : C0838R.drawable.o_radio_round);
        }
        setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f7968d && this.b) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            b.a(this, a.a(TypedValue.applyDimension(1, 44, system.getDisplayMetrics())));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        if (!this.f7968d && this.f7967c == 1) {
            setVisibility(z ? 0 : 4);
        }
    }

    public final void setStyle(int i) {
        if (this.f7968d) {
            return;
        }
        this.f7967c = i;
        a();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }
}
