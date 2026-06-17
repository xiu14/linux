package kotlin;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g<A, B> implements Serializable {
    private final A a;
    private final B b;

    public g(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public final A a() {
        return this.a;
    }

    public final B b() {
        return this.b;
    }

    public final A c() {
        return this.a;
    }

    public final B d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.s.c.l.a(this.a, gVar.a) && kotlin.s.c.l.a(this.b, gVar.b);
    }

    public int hashCode() {
        A a = this.a;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}
