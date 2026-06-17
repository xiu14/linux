package kotlin;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class k<A, B, C> implements Serializable {
    private final A a;
    private final B b;

    /* renamed from: c, reason: collision with root package name */
    private final C f10118c;

    public k(A a, B b, C c2) {
        this.a = a;
        this.b = b;
        this.f10118c = c2;
    }

    public final A a() {
        return this.a;
    }

    public final B b() {
        return this.b;
    }

    public final C c() {
        return this.f10118c;
    }

    public final A d() {
        return this.a;
    }

    public final B e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.s.c.l.a(this.a, kVar.a) && kotlin.s.c.l.a(this.b, kVar.b) && kotlin.s.c.l.a(this.f10118c, kVar.f10118c);
    }

    public final C f() {
        return this.f10118c;
    }

    public int hashCode() {
        A a = this.a;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.b;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c2 = this.f10118c;
        return hashCode2 + (c2 != null ? c2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.a + ", " + this.b + ", " + this.f10118c + ')';
    }
}
