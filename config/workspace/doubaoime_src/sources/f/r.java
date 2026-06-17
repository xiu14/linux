package f;

/* loaded from: classes2.dex */
public final class r implements z {
    private final e a;
    private u b;

    /* renamed from: c, reason: collision with root package name */
    private int f10055c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10056d;

    /* renamed from: e, reason: collision with root package name */
    private long f10057e;

    /* renamed from: f, reason: collision with root package name */
    private final g f10058f;

    public r(g gVar) {
        kotlin.s.c.l.g(gVar, "upstream");
        this.f10058f = gVar;
        e t = gVar.t();
        this.a = t;
        u uVar = t.a;
        this.b = uVar;
        this.f10055c = uVar != null ? uVar.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r0 == r3.b) goto L16;
     */
    @Override // f.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b0(f.e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.s.c.l.g(r9, r0)
            boolean r0 = r8.f10056d
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L76
            f.u r0 = r8.b
            r2 = 0
            if (r0 == 0) goto L24
            f.e r3 = r8.a
            f.u r3 = r3.a
            if (r0 != r3) goto L23
            int r0 = r8.f10055c
            if (r3 == 0) goto L1f
            int r3 = r3.b
            if (r0 != r3) goto L23
            goto L24
        L1f:
            kotlin.s.c.l.k()
            throw r2
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L6a
            f.g r0 = r8.f10058f
            long r3 = r8.f10057e
            long r3 = r3 + r10
            r0.T(r3)
            f.u r0 = r8.b
            if (r0 != 0) goto L45
            f.e r0 = r8.a
            f.u r0 = r0.a
            if (r0 == 0) goto L45
            r8.b = r0
            if (r0 == 0) goto L41
            int r0 = r0.b
            r8.f10055c = r0
            goto L45
        L41:
            kotlin.s.c.l.k()
            throw r2
        L45:
            f.e r0 = r8.a
            long r0 = r0.I()
            long r2 = r8.f10057e
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L5b
            r9 = -1
            return r9
        L5b:
            f.e r2 = r8.a
            long r4 = r8.f10057e
            r3 = r9
            r6 = r10
            r2.h(r3, r4, r6)
            long r0 = r8.f10057e
            long r0 = r0 + r10
            r8.f10057e = r0
            return r10
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f.r.b0(f.e, long):long");
    }

    @Override // f.z
    public A c() {
        return this.f10058f.c();
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10056d = true;
    }
}
