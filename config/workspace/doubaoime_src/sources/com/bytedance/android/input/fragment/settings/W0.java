package com.bytedance.android.input.fragment.settings;

import android.view.View;

/* loaded from: classes.dex */
public final class W0 implements com.bytedance.android.input.fragment.custom_symbol.n.a {
    final /* synthetic */ KeyCustomSymbolFragment a;

    W0(KeyCustomSymbolFragment keyCustomSymbolFragment) {
        this.a = keyCustomSymbolFragment;
    }

    @Override // com.bytedance.android.input.fragment.custom_symbol.n.a
    public void a(int i, String str, String str2) {
        kotlin.s.c.l.f(str, "beforeText");
        kotlin.s.c.l.f(str2, "afterText");
        KeyCustomSymbolFragment keyCustomSymbolFragment = this.a;
        StringBuilder P = e.a.a.a.a.P("onTextUpdate, position = ", i, ", beforeText = ", str, ", afterText = ");
        P.append(str2);
        keyCustomSymbolFragment.T(P.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r0 = r0.f2382e;
     */
    @Override // com.bytedance.android.input.fragment.custom_symbol.n.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r4, com.bytedance.android.input.fragment.custom_symbol.m.a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "symbolItem"
            kotlin.s.c.l.f(r5, r0)
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r0 = r3.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onDelete position = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", symbolItem = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.B(r0, r1)
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r0 = r3.a
            com.bytedance.android.input.fragment.custom_symbol.KeyCustomSymbolAdapter r0 = com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.w(r0)
            if (r0 == 0) goto L30
            int r0 = r0.getItemCount()
            goto L31
        L30:
            r0 = 0
        L31:
            int r0 = r0 + (-1)
            if (r4 > r0) goto L75
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r0 = r3.a
            com.bytedance.android.input.fragment.custom_symbol.KeyCustomSymbolAdapter r0 = com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.w(r0)
            if (r0 == 0) goto L46
            java.util.ArrayList r0 = r0.e()
            if (r0 == 0) goto L46
            r0.remove(r5)
        L46:
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r5 = r3.a
            com.bytedance.android.input.fragment.custom_symbol.KeyCustomSymbolAdapter r5 = com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.w(r5)
            if (r5 == 0) goto L51
            r5.notifyItemRemoved(r4)
        L51:
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r5 = r3.a
            com.bytedance.android.input.fragment.custom_symbol.KeyCustomSymbolAdapter r5 = com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.w(r5)
            if (r5 == 0) goto L70
            java.util.ArrayList r5 = r5.e()
            if (r5 == 0) goto L70
            int r5 = r5.size()
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r0 = r3.a
            if (r5 <= 0) goto L70
            com.bytedance.android.input.fragment.custom_symbol.KeyCustomSymbolAdapter r0 = com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.w(r0)
            if (r0 == 0) goto L70
            r0.notifyItemRangeChanged(r4, r5)
        L70:
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment r4 = r3.a
            com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment.t(r4)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.fragment.settings.W0.b(int, com.bytedance.android.input.fragment.custom_symbol.m.a):void");
    }

    @Override // com.bytedance.android.input.fragment.custom_symbol.n.a
    public void c(View view, boolean z, int i, com.bytedance.android.input.fragment.custom_symbol.m.a aVar) {
        kotlin.s.c.l.f(aVar, "symbolItem");
        if (!z) {
            this.a.l = -1;
            this.a.m = null;
            return;
        }
        this.a.l = i;
        this.a.m = view;
        this.a.T("onFocusChange focusPosition = " + i + ", v = " + view);
    }

    @Override // com.bytedance.android.input.fragment.custom_symbol.n.a
    public void d() {
        this.a.T("onSwipeFinish");
    }
}
