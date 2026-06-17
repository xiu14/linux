package com.vv;

import com.vv.VvPushAdapter;

/* loaded from: classes2.dex */
class b implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ VvPushAdapter.a.C0406a b;

    b(VvPushAdapter.a.C0406a c0406a, String str) {
        this.b = c0406a;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        VvPushAdapter.sendToken(VvPushAdapter.a.this.b, this.a);
    }
}
