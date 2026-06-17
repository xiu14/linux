package kotlin;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h<T> implements Serializable {
    private final Object a;

    public static final class a implements Serializable {
        public final Throwable a;

        public a(Throwable th) {
            kotlin.s.c.l.f(th, "exception");
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.s.c.l.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Failure(");
            M.append(this.a);
            M.append(')');
            return M.toString();
        }
    }

    private /* synthetic */ h(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ h a(Object obj) {
        return new h(obj);
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && kotlin.s.c.l.a(this.a, ((h) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        Object obj = this.a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
