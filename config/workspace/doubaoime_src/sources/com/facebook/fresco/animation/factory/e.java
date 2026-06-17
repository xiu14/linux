package com.facebook.fresco.animation.factory;

import android.graphics.Rect;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.image.i;
import e.c.h.f.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class e implements e.c.h.k.a {
    private final com.facebook.imagepipeline.animated.impl.b a;
    private final ScheduledExecutorService b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f6432c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.common.time.b f6433d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.h.d.b f6434e;

    /* renamed from: f, reason: collision with root package name */
    private final j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> f6435f;

    /* renamed from: g, reason: collision with root package name */
    private final e.c.c.d.j<Integer> f6436g;
    private final e.c.c.d.j<Integer> h;

    public static class a implements com.facebook.cache.common.b {
        private final String a;

        public a(int i) {
            this.a = e.a.a.a.a.j("anim://", i);
        }

        @Override // com.facebook.cache.common.b
        public String b() {
            return this.a;
        }

        @Override // com.facebook.cache.common.b
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            String str = this.a;
            String str2 = ((a) obj).a;
            return str != null ? str.equals(str2) : str2 == null;
        }

        @Override // com.facebook.cache.common.b
        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // com.facebook.cache.common.b
        public String toString() {
            return this.a;
        }
    }

    public e(com.facebook.imagepipeline.animated.impl.b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, com.facebook.common.time.b bVar2, e.c.h.d.b bVar3, j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> jVar, e.c.c.d.j<Integer> jVar2, e.c.c.d.j<Integer> jVar3) {
        this.a = bVar;
        this.b = scheduledExecutorService;
        this.f6432c = executorService;
        this.f6433d = bVar2;
        this.f6434e = bVar3;
        this.f6435f = jVar;
        this.f6436g = jVar2;
        this.h = jVar3;
    }

    private com.facebook.imagepipeline.animated.base.a d(com.facebook.imagepipeline.animated.base.d dVar) {
        com.facebook.imagepipeline.animated.base.b e2 = dVar.e();
        return this.a.a(dVar, new Rect(0, 0, e2.getWidth(), e2.getHeight()));
    }

    private com.facebook.imagepipeline.animated.impl.c e(com.facebook.imagepipeline.animated.base.d dVar) {
        com.facebook.imagepipeline.animated.impl.c cVar = new com.facebook.imagepipeline.animated.impl.c(new a(dVar.hashCode()), this.f6435f);
        int d2 = dVar.d();
        if (d2 > 0) {
            for (int i = 0; i < d2; i++) {
                if (dVar.f(i)) {
                    e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = null;
                    try {
                        aVar = e.c.c.g.a.z(new com.facebook.imagepipeline.image.e(dVar.c(i), i.f6481d, 0));
                        cVar.b(i, aVar);
                        if (aVar != null) {
                            aVar.close();
                        }
                    } catch (Throwable th) {
                        int i2 = e.c.c.g.a.h;
                        if (aVar != null) {
                            aVar.close();
                        }
                        throw th;
                    }
                }
            }
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    @Override // e.c.h.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable a(com.facebook.imagepipeline.image.d r11, android.graphics.drawable.Drawable r12) {
        /*
            r10 = this;
            r0 = r11
            com.facebook.imagepipeline.image.a r0 = (com.facebook.imagepipeline.image.a) r0
            com.facebook.imagepipeline.animated.base.d r1 = r0.w()
            com.facebook.imagepipeline.animated.base.b r2 = r1.e()
            int r2 = r2.i()
            com.facebook.imagepipeline.animated.base.b r3 = r1.e()
            int r3 = r3.a()
            if (r3 > 0) goto L1a
            return r12
        L1a:
            boolean r3 = r12 instanceof com.facebook.fresco.animation.drawable.AnimatedDrawable2
            if (r3 == 0) goto Lca
            r3 = 2
            if (r2 == r3) goto L24
            r3 = 3
            if (r2 != r3) goto Lca
        L24:
            com.facebook.fresco.animation.drawable.AnimatedDrawable2 r12 = (com.facebook.fresco.animation.drawable.AnimatedDrawable2) r12
            e.c.f.a.b.b r5 = r12.e()
            com.facebook.imagepipeline.animated.base.b r3 = r1.e()
            e.c.f.a.a.a r4 = r12.d()
            boolean r6 = r4 instanceof e.c.f.a.a.b
            if (r6 == 0) goto L63
            e.c.f.a.a.b r4 = (e.c.f.a.a.b) r4
            e.c.f.a.a.a r4 = r4.d()
            boolean r6 = r4 instanceof e.c.f.a.b.a
            if (r6 == 0) goto L63
            e.c.f.a.b.a r4 = (e.c.f.a.b.a) r4
            e.c.f.a.a.d r4 = r4.n()
            e.c.f.a.b.f.a r4 = (e.c.f.a.b.f.a) r4
            com.facebook.imagepipeline.animated.base.a r4 = r4.d()
            com.facebook.imagepipeline.animated.impl.a r4 = (com.facebook.imagepipeline.animated.impl.a) r4
            com.facebook.imagepipeline.animated.base.d r4 = r4.b()
            if (r4 == 0) goto L63
            com.facebook.imagepipeline.animated.base.b r4 = r4.e()
            if (r4 == 0) goto L63
            if (r3 == 0) goto L63
            if (r3 == r4) goto L63
            r4.b()
            r3 = 1
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 != 0) goto L67
            return r12
        L67:
            com.facebook.imagepipeline.animated.base.a r1 = r10.d(r1)
            e.c.f.a.b.f.b r7 = new e.c.f.a.b.f.b
            r7.<init>(r5, r1)
            e.c.c.d.j<java.lang.Integer> r3 = r10.h
            java.lang.Object r3 = r3.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 0
            if (r3 <= 0) goto La0
            e.c.g.d r11 = r11.h()
            boolean r11 = e.c.g.c.b(r11)
            if (r11 != 0) goto La0
            e.c.f.a.b.e.d r11 = new e.c.f.a.b.e.d
            r11.<init>(r3)
            com.facebook.imagepipeline.common.c r3 = r0.x()
            android.graphics.Bitmap$Config r3 = r3.h
            e.c.f.a.b.e.c r4 = new e.c.f.a.b.e.c
            e.c.h.d.b r6 = r10.f6434e
            java.util.concurrent.ExecutorService r8 = r10.f6432c
            r4.<init>(r6, r7, r3, r8)
            r8 = r11
            r9 = r4
            goto La2
        La0:
            r8 = r4
            r9 = r8
        La2:
            e.c.f.a.b.a r11 = new e.c.f.a.b.a
            e.c.h.d.b r4 = r10.f6434e
            e.c.f.a.b.f.a r6 = new e.c.f.a.b.f.a
            r6.<init>(r1)
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.facebook.imagepipeline.common.c r1 = r0.x()
            android.graphics.Bitmap$Config r1 = r1.h
            r11.p(r1)
            com.facebook.common.time.b r1 = r10.f6433d
            java.util.concurrent.ScheduledExecutorService r3 = r10.b
            e.c.f.a.a.b r11 = e.c.f.a.a.c.p(r11, r1, r3)
            com.facebook.imagepipeline.common.c r0 = r0.x()
            java.lang.Object r0 = r0.m
            r12.g(r11, r0, r2)
            return r12
        Lca:
            com.facebook.fresco.animation.drawable.AnimatedDrawable2 r11 = r10.c(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.factory.e.a(com.facebook.imagepipeline.image.d, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    @Override // e.c.h.k.a
    public boolean b(com.facebook.imagepipeline.image.d dVar) {
        return dVar instanceof com.facebook.imagepipeline.image.a;
    }

    @Override // e.c.h.k.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AnimatedDrawable2 c(com.facebook.imagepipeline.image.d dVar) {
        e.c.f.a.b.e.d dVar2;
        e.c.f.a.b.e.c cVar;
        com.facebook.imagepipeline.image.a aVar = (com.facebook.imagepipeline.image.a) dVar;
        com.facebook.imagepipeline.animated.base.d w = aVar.w();
        if (w.e().a() <= 0) {
            return null;
        }
        int intValue = this.f6436g.get().intValue();
        e.c.f.a.b.b cVar2 = intValue != 1 ? intValue != 2 ? intValue != 3 ? new e.c.f.a.b.d.c() : new e.c.f.a.b.d.b() : new e.c.f.a.b.d.a(e(w), false) : new e.c.f.a.b.d.a(e(w), true);
        int i = w.e().i();
        com.facebook.imagepipeline.animated.base.a d2 = d(aVar.w());
        e.c.f.a.b.f.b bVar = new e.c.f.a.b.f.b(cVar2, d2);
        int i2 = aVar.x().f6453d;
        if (i2 <= 0) {
            i2 = this.h.get().intValue();
        }
        if (i2 <= 0 || e.c.g.c.b(aVar.h())) {
            dVar2 = null;
            cVar = null;
        } else {
            dVar2 = new e.c.f.a.b.e.d(i2);
            cVar = new e.c.f.a.b.e.c(this.f6434e, bVar, aVar.x().h, this.f6432c);
        }
        e.c.f.a.b.a aVar2 = new e.c.f.a.b.a(this.f6434e, cVar2, new e.c.f.a.b.f.a(d2), bVar, dVar2, cVar);
        aVar2.p(aVar.x().h);
        return new AnimatedDrawable2(e.c.f.a.a.c.q(aVar.s().d(), aVar2, this.f6433d, this.b), aVar.x().m, cVar2, i, w.e().d());
    }
}
