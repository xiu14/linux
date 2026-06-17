package com.bytedance.android.input.fragment.settings;

import android.view.View;

/* loaded from: classes.dex */
public final class V0 implements View.OnTouchListener {
    private float a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ KeyCustomSymbolFragment f2414c;

    V0(KeyCustomSymbolFragment keyCustomSymbolFragment) {
        this.f2414c = keyCustomSymbolFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r2 = r5.f2382e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r5 = r5.f2382e;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r5 = r4.f2414c
            boolean r5 = com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.x(r5)
            r0 = 0
            if (r5 == 0) goto L56
            if (r6 == 0) goto L56
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r5 = r4.f2414c
            int r1 = r6.getAction()
            r2 = 1
            if (r1 == r2) goto L51
            r2 = 2
            if (r1 == r2) goto L18
            goto L56
        L18:
            float r1 = r6.getX()
            float r6 = r6.getY()
            float r2 = r4.a
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            r3 = 1112014848(0x42480000, float:50.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L37
            com.bytedance.android.input.fragment.custom_symbol.KeyCustomSymbolAdapter r2 = com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.w(r5)
            if (r2 == 0) goto L37
            r2.c(r0)
        L37:
            float r2 = r4.b
            float r2 = r6 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L4c
            com.bytedance.android.input.fragment.custom_symbol.KeyCustomSymbolAdapter r5 = com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.w(r5)
            if (r5 == 0) goto L4c
            r5.c(r0)
        L4c:
            r4.a = r1
            r4.b = r6
            goto L56
        L51:
            r5 = 0
            r4.a = r5
            r4.b = r5
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.fragment.settings.V0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
