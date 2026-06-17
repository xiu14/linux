package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0825v {
    public final Object a;
    public final kotlin.s.b.l<Throwable, kotlin.o> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0825v(Object obj, kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        this.a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0825v)) {
            return false;
        }
        C0825v c0825v = (C0825v) obj;
        return kotlin.s.c.l.a(this.a, c0825v.a) && kotlin.s.c.l.a(this.b, c0825v.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CompletedWithCancellation(result=");
        M.append(this.a);
        M.append(", onCancellation=");
        M.append(this.b);
        M.append(')');
        return M.toString();
    }
}
