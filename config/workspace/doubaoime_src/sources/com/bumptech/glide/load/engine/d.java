package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.j.o;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class d implements g, d.a<Object> {
    private final List<com.bumptech.glide.load.d> a;
    private final h<?> b;

    /* renamed from: c, reason: collision with root package name */
    private final g.a f1632c;

    /* renamed from: d, reason: collision with root package name */
    private int f1633d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.d f1634e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.bumptech.glide.load.j.o<File, ?>> f1635f;

    /* renamed from: g, reason: collision with root package name */
    private int f1636g;
    private volatile o.a<?> h;
    private File i;

    d(h<?> hVar, g.a aVar) {
        List<com.bumptech.glide.load.d> c2 = hVar.c();
        this.f1633d = -1;
        this.a = c2;
        this.b = hVar;
        this.f1632c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        r8.h = null;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r8.f1636g >= r8.f1635f.size()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (r3 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r3 = r8.f1635f;
        r4 = r8.f1636g;
        r8.f1636g = r4 + 1;
        r8.h = r3.get(r4).b(r8.i, r8.b.t(), r8.b.f(), r8.b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r8.h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r8.b.u(r8.h.f1715c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r8.h.f1715c.e(r8.b.l(), r8);
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0026, code lost:
    
        r3 = false;
     */
    @Override // com.bumptech.glide.load.engine.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r8 = this;
        L0:
            java.util.List<com.bumptech.glide.load.j.o<java.io.File, ?>> r0 = r8.f1635f     // Catch: java.lang.Throwable -> Lb4
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L75
            int r3 = r8.f1636g     // Catch: java.lang.Throwable -> Lb4
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb4
            if (r3 >= r0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L14
            goto L75
        L14:
            r0 = 0
            r8.h = r0     // Catch: java.lang.Throwable -> Lb4
            r0 = r1
        L18:
            if (r0 != 0) goto L74
            int r3 = r8.f1636g     // Catch: java.lang.Throwable -> Lb4
            java.util.List<com.bumptech.glide.load.j.o<java.io.File, ?>> r4 = r8.f1635f     // Catch: java.lang.Throwable -> Lb4
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Lb4
            if (r3 >= r4) goto L26
            r3 = r2
            goto L27
        L26:
            r3 = r1
        L27:
            if (r3 == 0) goto L74
            java.util.List<com.bumptech.glide.load.j.o<java.io.File, ?>> r3 = r8.f1635f     // Catch: java.lang.Throwable -> Lb4
            int r4 = r8.f1636g     // Catch: java.lang.Throwable -> Lb4
            int r5 = r4 + 1
            r8.f1636g = r5     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.j.o r3 = (com.bumptech.glide.load.j.o) r3     // Catch: java.lang.Throwable -> Lb4
            java.io.File r4 = r8.i     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.h<?> r5 = r8.b     // Catch: java.lang.Throwable -> Lb4
            int r5 = r5.t()     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.h<?> r6 = r8.b     // Catch: java.lang.Throwable -> Lb4
            int r6 = r6.f()     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.h<?> r7 = r8.b     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.f r7 = r7.k()     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.j.o$a r3 = r3.b(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb4
            r8.h = r3     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.j.o$a<?> r3 = r8.h     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto L18
            com.bumptech.glide.load.engine.h<?> r3 = r8.b     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.j.o$a<?> r4 = r8.h     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.data.d<Data> r4 = r4.f1715c     // Catch: java.lang.Throwable -> Lb4
            java.lang.Class r4 = r4.a()     // Catch: java.lang.Throwable -> Lb4
            boolean r3 = r3.u(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto L18
            com.bumptech.glide.load.j.o$a<?> r0 = r8.h     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.data.d<Data> r0 = r0.f1715c     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.h<?> r3 = r8.b     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.Priority r3 = r3.l()     // Catch: java.lang.Throwable -> Lb4
            r0.e(r3, r8)     // Catch: java.lang.Throwable -> Lb4
            r0 = r2
            goto L18
        L74:
            return r0
        L75:
            int r0 = r8.f1633d     // Catch: java.lang.Throwable -> Lb4
            int r0 = r0 + r2
            r8.f1633d = r0     // Catch: java.lang.Throwable -> Lb4
            java.util.List<com.bumptech.glide.load.d> r2 = r8.a     // Catch: java.lang.Throwable -> Lb4
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lb4
            if (r0 < r2) goto L83
            return r1
        L83:
            java.util.List<com.bumptech.glide.load.d> r0 = r8.a     // Catch: java.lang.Throwable -> Lb4
            int r2 = r8.f1633d     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.d r0 = (com.bumptech.glide.load.d) r0     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.e r2 = new com.bumptech.glide.load.engine.e     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.h<?> r3 = r8.b     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.d r3 = r3.p()     // Catch: java.lang.Throwable -> Lb4
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.h<?> r3 = r8.b     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.C.a r3 = r3.d()     // Catch: java.lang.Throwable -> Lb4
            java.io.File r2 = r3.b(r2)     // Catch: java.lang.Throwable -> Lb4
            r8.i = r2     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L0
            r8.f1634e = r0     // Catch: java.lang.Throwable -> Lb4
            com.bumptech.glide.load.engine.h<?> r0 = r8.b     // Catch: java.lang.Throwable -> Lb4
            java.util.List r0 = r0.j(r2)     // Catch: java.lang.Throwable -> Lb4
            r8.f1635f = r0     // Catch: java.lang.Throwable -> Lb4
            r8.f1636g = r1     // Catch: java.lang.Throwable -> Lb4
            goto L0
        Lb4:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.d.b():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@NonNull Exception exc) {
        this.f1632c.a(this.f1634e, exc, this.h.f1715c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.g
    public void cancel() {
        o.a<?> aVar = this.h;
        if (aVar != null) {
            aVar.f1715c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f1632c.d(this.f1634e, obj, this.h.f1715c, DataSource.DATA_DISK_CACHE, this.f1634e);
    }

    d(List<com.bumptech.glide.load.d> list, h<?> hVar, g.a aVar) {
        this.f1633d = -1;
        this.a = list;
        this.b = hVar;
        this.f1632c = aVar;
    }
}
