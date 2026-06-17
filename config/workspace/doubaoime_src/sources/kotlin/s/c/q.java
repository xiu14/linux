package kotlin.s.c;

/* loaded from: classes2.dex */
public final class q implements InterfaceC0784d {
    private final Class<?> a;

    public q(Class<?> cls, String str) {
        l.f(cls, "jClass");
        l.f(str, "moduleName");
        this.a = cls;
    }

    @Override // kotlin.s.c.InterfaceC0784d
    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && l.a(this.a, ((q) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
