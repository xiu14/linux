package com.bytedance.apm.B.l;

import android.os.Build;

/* loaded from: classes.dex */
public class j {
    private d a;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static j a = new j(null);
    }

    j(a aVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new f();
        } else {
            this.a = new g();
        }
        this.a.init();
    }

    public static j e() {
        return b.a;
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return this.a.e();
    }

    public long c() {
        return this.a.h();
    }

    public long d() {
        return this.a.j();
    }

    public long f() {
        return this.a.b();
    }

    public long g() {
        return this.a.g();
    }

    public long h() {
        return this.a.c();
    }

    public long i() {
        return this.a.i();
    }

    public long j() {
        return this.a.f();
    }

    void k(boolean z) {
        this.a.d(z);
    }
}
