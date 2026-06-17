package com.obric.oui.selection;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.obric.oui.checkbox.OCheckBox;
import com.obric.oui.common.util.b;
import com.obric.oui.layout.OUIConstraintLayout;
import com.obric.oui.radio.ORadio;
import com.obric.oui.text.OTextView;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OSelectionPanelItemView extends OUIConstraintLayout {

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f7991g;
    private final OTextView h;
    private final ORadio i;
    private final OCheckBox j;
    private final View k;
    private boolean l;
    private boolean m;
    private boolean n;

    public OSelectionPanelItemView(Context context) {
        this(context, null, false, false, 14);
    }

    public OSelectionPanelItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, false, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OSelectionPanelItemView(android.content.Context r8, android.util.AttributeSet r9, boolean r10, boolean r11, int r12) {
        /*
            r7 = this;
            r0 = r12 & 2
            if (r0 == 0) goto L5
            r9 = 0
        L5:
            r2 = r9
            r9 = r12 & 4
            r6 = 0
            if (r9 == 0) goto Lc
            r10 = r6
        Lc:
            r9 = r12 & 8
            if (r9 == 0) goto L11
            r11 = r6
        L11:
            java.lang.String r9 = "context"
            kotlin.s.c.l.f(r8, r9)
            r3 = 0
            r4 = 0
            r5 = 12
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.m = r10
            r7.n = r11
            r9 = 1
            r7.l = r9
            r9 = 2131558792(0x7f0d0188, float:1.874291E38)
            android.view.ViewGroup.inflate(r8, r9, r7)
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2131167175(0x7f0707c7, float:1.7948616E38)
            float r8 = r8.getDimension(r9)
            int r8 = (int) r8
            r7.setMinHeight(r8)
            r8 = 2131362657(0x7f0a0361, float:1.83451E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r9 = "findViewById(R.id.iv_icon)"
            kotlin.s.c.l.e(r8, r9)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r7.f7991g = r8
            r8 = 2131363446(0x7f0a0676, float:1.8346701E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r9 = "findViewById(R.id.tv_text)"
            kotlin.s.c.l.e(r8, r9)
            com.obric.oui.text.OTextView r8 = (com.obric.oui.text.OTextView) r8
            r7.h = r8
            r8 = 2131363047(0x7f0a04e7, float:1.8345892E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r9 = "findViewById(R.id.radio)"
            kotlin.s.c.l.e(r8, r9)
            com.obric.oui.radio.ORadio r8 = (com.obric.oui.radio.ORadio) r8
            r7.i = r8
            r8 = 2131362182(0x7f0a0186, float:1.8344137E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r9 = "findViewById(R.id.checkbox)"
            kotlin.s.c.l.e(r8, r9)
            com.obric.oui.checkbox.OCheckBox r8 = (com.obric.oui.checkbox.OCheckBox) r8
            r7.j = r8
            r9 = 2131362348(0x7f0a022c, float:1.8344474E38)
            android.view.View r9 = r7.findViewById(r9)
            java.lang.String r10 = "findViewById(R.id.divider)"
            kotlin.s.c.l.e(r9, r10)
            r7.k = r9
            r8.setClickable(r6)
            android.content.res.Resources r8 = r7.getResources()
            r10 = 2131167229(0x7f0707fd, float:1.7948726E38)
            float r8 = r8.getDimension(r10)
            int r8 = (int) r8
            r7.setRadius(r8)
            boolean r8 = r7.m
            r7.setSelectMode(r8)
            boolean r8 = r7.n
            if (r8 == 0) goto La8
            com.obric.oui.common.util.b.g(r9)
            goto Lab
        La8:
            com.obric.oui.common.util.b.f(r9)
        Lab:
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2131167214(0x7f0707ee, float:1.7948695E38)
            int r8 = r8.getDimensionPixelSize(r9)
            int r10 = r7.getPaddingTop()
            android.content.res.Resources r11 = r7.getResources()
            int r9 = r11.getDimensionPixelSize(r9)
            int r11 = r7.getPaddingBottom()
            r7.setPadding(r8, r10, r9, r11)
            com.obric.oui.selection.OSelectionPanelItemView$addAccessibilityCompat$1 r8 = new com.obric.oui.selection.OSelectionPanelItemView$addAccessibilityCompat$1
            r8.<init>()
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.selection.OSelectionPanelItemView.<init>(android.content.Context, android.util.AttributeSet, boolean, boolean, int):void");
    }

    public final void h() {
        b.f(this.k);
    }

    public final ImageView i() {
        return this.f7991g;
    }

    public final OTextView j() {
        return this.h;
    }

    public final boolean k() {
        return this.m ? this.j.isChecked() : this.i.isChecked();
    }

    public final boolean l() {
        return this.m;
    }

    public final void m(boolean z) {
        this.l = z;
        if (z) {
            setSelectMode(this.m);
        } else {
            b.f(this.j);
            b.f(this.i);
        }
    }

    public final void setItemSelected(boolean z) {
        if (this.m) {
            this.j.setChecked(z);
        } else {
            this.i.setChecked(z);
        }
        if (this.l) {
            return;
        }
        ORadio oRadio = this.i;
        l.f(oRadio, "$this$makeInvisible");
        oRadio.setVisibility(4);
    }

    public final void setMultiSelect(boolean z) {
        this.m = z;
    }

    public final void setSelectMode(boolean z) {
        this.m = z;
        if (z) {
            b.g(this.j);
            b.f(this.i);
        } else {
            b.f(this.j);
            b.g(this.i);
        }
        setItemSelected(k());
    }

    public final void setShowDivider(boolean z) {
        this.n = z;
    }
}
