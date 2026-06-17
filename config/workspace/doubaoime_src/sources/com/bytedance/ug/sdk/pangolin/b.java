package com.bytedance.ug.sdk.pangolin;

/* loaded from: classes2.dex */
public final class b<A, B> {
    private final A a;
    private final B b;

    private b(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public static <A, B> b<A, B> b(A a, B b) {
        return new b<>(a, b);
    }

    public A a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        A a = this.a;
        if (a == null) {
            if (bVar.a != null) {
                return false;
            }
        } else if (!a.equals(bVar.a)) {
            return false;
        }
        B b = this.b;
        if (b == null) {
            if (bVar.b != null) {
                return false;
            }
        } else if (!b.equals(bVar.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.a;
        int hashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }
}
