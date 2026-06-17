package org.apache.http.conn.ssl;

/* loaded from: classes2.dex */
final class f {
    private final String a;
    private final int b;

    f(String str, int i) {
        d.j(str, "Value");
        this.a = str;
        if (i <= 0) {
            throw new IllegalArgumentException("Type may not be negative or zero");
        }
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}
