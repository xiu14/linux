package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class K0<T> extends kotlinx.coroutines.N0.v<T> {

    /* renamed from: d, reason: collision with root package name */
    private ThreadLocal<kotlin.g<kotlin.r.f, Object>> f10155d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K0(kotlin.r.f r3, kotlin.r.d<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.L0 r0 = kotlinx.coroutines.L0.a
            kotlin.r.f$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            kotlin.r.f r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f10155d = r0
            kotlin.r.f r4 = r4.getContext()
            kotlin.r.e$a r0 = kotlin.r.e.F
            kotlin.r.f$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.D
            if (r4 != 0) goto L38
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.N0.z.c(r3, r4)
            kotlinx.coroutines.N0.z.a(r3, r4)
            java.lang.ThreadLocal<kotlin.g<kotlin.r.f, java.lang.Object>> r0 = r2.f10155d
            kotlin.g r1 = new kotlin.g
            r1.<init>(r3, r4)
            r0.set(r1)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.K0.<init>(kotlin.r.f, kotlin.r.d):void");
    }

    @Override // kotlinx.coroutines.N0.v, kotlinx.coroutines.AbstractC0789a
    protected void p0(Object obj) {
        kotlin.g<kotlin.r.f, Object> gVar = this.f10155d.get();
        if (gVar != null) {
            kotlinx.coroutines.N0.z.a(gVar.a(), gVar.b());
            this.f10155d.set(null);
        }
        Object g0 = com.prolificinteractive.materialcalendarview.r.g0(obj, this.f10175c);
        kotlin.r.d<T> dVar = this.f10175c;
        kotlin.r.f context = dVar.getContext();
        Object c2 = kotlinx.coroutines.N0.z.c(context, null);
        K0<?> r = c2 != kotlinx.coroutines.N0.z.a ? C0795d.r(dVar, context, c2) : null;
        try {
            this.f10175c.resumeWith(g0);
        } finally {
            if (r == null || r.s0()) {
                kotlinx.coroutines.N0.z.a(context, c2);
            }
        }
    }

    public final boolean s0() {
        if (this.f10155d.get() == null) {
            return false;
        }
        this.f10155d.set(null);
        return true;
    }

    public final void t0(kotlin.r.f fVar, Object obj) {
        this.f10155d.set(new kotlin.g<>(fVar, obj));
    }
}
