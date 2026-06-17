package com.ttnet.org.chromium.net;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class v {
    private static volatile v b;
    private a a;

    public interface a {
    }

    public static v a() {
        if (b == null) {
            synchronized (v.class) {
                if (b == null) {
                    b = new v();
                }
            }
        }
        return b;
    }

    public String b() {
        a aVar = this.a;
        if (aVar == null) {
            return "";
        }
        Objects.requireNonNull((org.chromium.g) aVar);
        return org.chromium.d.U().x();
    }

    public String c() {
        a aVar = this.a;
        if (aVar == null) {
            return "";
        }
        Objects.requireNonNull((org.chromium.g) aVar);
        return org.chromium.d.U().G();
    }

    public int d() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        Objects.requireNonNull((org.chromium.g) aVar);
        return org.chromium.d.U().S();
    }

    public int e() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        Objects.requireNonNull((org.chromium.g) aVar);
        return org.chromium.d.U().T();
    }

    public void f(a aVar) {
        this.a = aVar;
    }
}
