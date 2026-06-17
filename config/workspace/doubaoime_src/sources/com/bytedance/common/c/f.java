package com.bytedance.common.c;

import okhttp3.B;

/* loaded from: classes.dex */
class f implements j {
    final /* synthetic */ B a;

    f(g gVar, String str, B b) {
        this.a = b;
    }

    @Override // com.bytedance.common.c.j
    public void a() {
        try {
            B b = this.a;
            if (b != null) {
                b.close();
            }
        } catch (Throwable unused) {
        }
    }
}
