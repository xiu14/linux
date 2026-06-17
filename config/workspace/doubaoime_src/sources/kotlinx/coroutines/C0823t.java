package kotlinx.coroutines;

import java.util.Objects;

/* renamed from: kotlinx.coroutines.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0823t {
    public final Object a;
    public final AbstractC0808i b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.s.b.l<Throwable, kotlin.o> f10336c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10337d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f10338e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0823t(Object obj, AbstractC0808i abstractC0808i, kotlin.s.b.l<? super Throwable, kotlin.o> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = abstractC0808i;
        this.f10336c = lVar;
        this.f10337d = obj2;
        this.f10338e = th;
    }

    public static C0823t a(C0823t c0823t, Object obj, AbstractC0808i abstractC0808i, kotlin.s.b.l lVar, Object obj2, Throwable th, int i) {
        Object obj3 = (i & 1) != 0 ? c0823t.a : null;
        if ((i & 2) != 0) {
            abstractC0808i = c0823t.b;
        }
        AbstractC0808i abstractC0808i2 = abstractC0808i;
        kotlin.s.b.l<Throwable, kotlin.o> lVar2 = (i & 4) != 0 ? c0823t.f10336c : null;
        Object obj4 = (i & 8) != 0 ? c0823t.f10337d : null;
        if ((i & 16) != 0) {
            th = c0823t.f10338e;
        }
        Objects.requireNonNull(c0823t);
        return new C0823t(obj3, abstractC0808i2, lVar2, obj4, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0823t)) {
            return false;
        }
        C0823t c0823t = (C0823t) obj;
        return kotlin.s.c.l.a(this.a, c0823t.a) && kotlin.s.c.l.a(this.b, c0823t.b) && kotlin.s.c.l.a(this.f10336c, c0823t.f10336c) && kotlin.s.c.l.a(this.f10337d, c0823t.f10337d) && kotlin.s.c.l.a(this.f10338e, c0823t.f10338e);
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0808i abstractC0808i = this.b;
        int hashCode2 = (hashCode + (abstractC0808i == null ? 0 : abstractC0808i.hashCode())) * 31;
        kotlin.s.b.l<Throwable, kotlin.o> lVar = this.f10336c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f10337d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f10338e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CompletedContinuation(result=");
        M.append(this.a);
        M.append(", cancelHandler=");
        M.append(this.b);
        M.append(", onCancellation=");
        M.append(this.f10336c);
        M.append(", idempotentResume=");
        M.append(this.f10337d);
        M.append(", cancelCause=");
        M.append(this.f10338e);
        M.append(')');
        return M.toString();
    }

    public C0823t(Object obj, AbstractC0808i abstractC0808i, kotlin.s.b.l lVar, Object obj2, Throwable th, int i) {
        abstractC0808i = (i & 2) != 0 ? null : abstractC0808i;
        lVar = (i & 4) != 0 ? null : lVar;
        obj2 = (i & 8) != 0 ? null : obj2;
        th = (i & 16) != 0 ? null : th;
        this.a = obj;
        this.b = abstractC0808i;
        this.f10336c = lVar;
        this.f10337d = obj2;
        this.f10338e = th;
    }
}
