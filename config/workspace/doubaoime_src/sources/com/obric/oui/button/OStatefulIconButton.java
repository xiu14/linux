package com.obric.oui.button;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OStatefulIconButton extends OIconButton {
    private static final int[] j = {C0838R.attr.state_checked};
    private boolean i;

    public OStatefulIconButton(Context context) {
        this(context, null, 0, 0, 14);
    }

    public OStatefulIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12);
    }

    public OStatefulIconButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OStatefulIconButton(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            r0 = r12 & 2
            if (r0 == 0) goto L5
            r9 = 0
        L5:
            r2 = r9
            r9 = r12 & 4
            r0 = 0
            if (r9 == 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            r3 = r10
        Le:
            r9 = r12 & 8
            if (r9 == 0) goto L14
            r4 = r0
            goto L15
        L14:
            r4 = r11
        L15:
            java.lang.String r9 = "context"
            kotlin.s.c.l.f(r8, r9)
            r5 = 0
            r6 = 16
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.button.OStatefulIconButton.<init>(android.content.Context, android.util.AttributeSet, int, int, int):void");
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.i) {
            ImageView.mergeDrawableStates(onCreateDrawableState, j);
        }
        l.e(onCreateDrawableState, "drawableState");
        return onCreateDrawableState;
    }

    public final void setChecked(boolean z) {
        if (this.i != z) {
            this.i = z;
            refreshDrawableState();
        }
    }
}
