package com.ss.android.c;

/* loaded from: classes2.dex */
class f implements com.bytedance.android.alog.b {
    f() {
    }

    @Override // com.bytedance.android.alog.b
    public void loadLibrary(String str) {
        try {
            e.b.h.a.a("alog", a.b.e());
        } catch (Throwable unused) {
            System.loadLibrary("alog");
        }
    }
}
