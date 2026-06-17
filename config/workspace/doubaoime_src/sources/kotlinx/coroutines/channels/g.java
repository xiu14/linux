package kotlinx.coroutines.channels;

/* loaded from: classes2.dex */
public final class g<T> {
    public static final b b = new b(null);
    private final Object a;

    public static final class a extends c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.s.c.l.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Closed(");
            M.append(this.a);
            M.append(')');
            return M.toString();
        }
    }

    public static final class b {
        public b(kotlin.s.c.g gVar) {
        }
    }

    public static class c {
    }

    private /* synthetic */ g(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ g a(Object obj) {
        return new g(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T b(Object obj) {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if (!(obj instanceof a) || (th = ((a) obj).a) == null) {
            throw new IllegalStateException(e.a.a.a.a.r("Trying to call 'getOrThrow' on a failed channel result: ", obj));
        }
        throw th;
    }

    public final /* synthetic */ Object c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && kotlin.s.c.l.a(this.a, ((g) obj).a);
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
        return "Value(" + obj + ')';
    }
}
