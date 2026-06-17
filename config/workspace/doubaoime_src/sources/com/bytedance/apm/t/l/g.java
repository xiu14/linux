package com.bytedance.apm.t.l;

import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes.dex */
public class g {
    public int a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public long f3575c;

    /* renamed from: d, reason: collision with root package name */
    public int f3576d;

    /* renamed from: e, reason: collision with root package name */
    public int f3577e = 1;

    public g(int i, int i2, long j, int i3) {
        this.a = i;
        this.b = i2;
        this.f3576d = i3;
        this.f3575c = j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.a == this.a && gVar.f3576d == this.f3576d;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return this.f3576d + Constants.ACCEPT_TIME_SEPARATOR_SP + this.a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f3577e + Constants.ACCEPT_TIME_SEPARATOR_SP + this.b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f3575c;
    }
}
