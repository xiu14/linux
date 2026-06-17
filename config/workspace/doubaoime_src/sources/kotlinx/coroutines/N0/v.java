package kotlinx.coroutines.N0;

import kotlinx.coroutines.AbstractC0789a;

/* loaded from: classes2.dex */
public class v<T> extends AbstractC0789a<T> implements kotlin.r.h.a.d {

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.r.d<T> f10175c;

    /* JADX WARN: Multi-variable type inference failed */
    public v(kotlin.r.f fVar, kotlin.r.d<? super T> dVar) {
        super(fVar, true, true);
        this.f10175c = dVar;
    }

    @Override // kotlinx.coroutines.r0
    protected void A(Object obj) {
        i.c(kotlin.coroutines.intrinsics.a.d(this.f10175c), com.prolificinteractive.materialcalendarview.r.g0(obj, this.f10175c), null, 2);
    }

    @Override // kotlinx.coroutines.r0
    protected final boolean b0() {
        return true;
    }

    @Override // kotlin.r.h.a.d
    public final kotlin.r.h.a.d getCallerFrame() {
        kotlin.r.d<T> dVar = this.f10175c;
        if (dVar instanceof kotlin.r.h.a.d) {
            return (kotlin.r.h.a.d) dVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC0789a
    protected void p0(Object obj) {
        kotlin.r.d<T> dVar = this.f10175c;
        dVar.resumeWith(com.prolificinteractive.materialcalendarview.r.g0(obj, dVar));
    }
}
