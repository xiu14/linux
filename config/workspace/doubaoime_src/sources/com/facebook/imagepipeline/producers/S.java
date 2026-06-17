package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.Priority;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class S implements U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> {
    private final U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> a;
    private final e.c.h.d.b b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6572c;

    private class b extends AbstractC0735o<e.c.c.g.a<com.facebook.imagepipeline.image.d>, e.c.c.g.a<com.facebook.imagepipeline.image.d>> {

        /* renamed from: c, reason: collision with root package name */
        private final X f6573c;

        /* renamed from: d, reason: collision with root package name */
        private final V f6574d;

        /* renamed from: e, reason: collision with root package name */
        private final com.facebook.imagepipeline.request.c f6575e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6576f;

        /* renamed from: g, reason: collision with root package name */
        private e.c.c.g.a<com.facebook.imagepipeline.image.d> f6577g;
        private int h;
        private boolean i;
        private boolean j;

        class a extends C0725e {
            a(S s) {
            }

            @Override // com.facebook.imagepipeline.producers.W
            public void a() {
                b.o(b.this);
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.S$b$b, reason: collision with other inner class name */
        class C0328b extends e.c.c.b.a {
            C0328b(int i) {
                super(i);
            }

            @Override // java.lang.Runnable
            public void run() {
                e.c.c.g.a aVar;
                int i;
                synchronized (b.this) {
                    aVar = b.this.f6577g;
                    i = b.this.h;
                    b.q(b.this, null);
                    b.this.i = false;
                }
                if (e.c.c.g.a.x(aVar)) {
                    try {
                        b.t(b.this, aVar, i);
                        aVar.close();
                    } catch (Throwable th) {
                        if (aVar != null) {
                            aVar.close();
                        }
                        throw th;
                    }
                }
                b.u(b.this);
            }
        }

        public b(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, X x, com.facebook.imagepipeline.request.c cVar, V v) {
            super(interfaceC0732l);
            this.f6577g = null;
            this.h = 0;
            this.i = false;
            this.j = false;
            this.f6573c = x;
            this.f6575e = cVar;
            this.f6574d = v;
            v.e(new a(S.this));
        }

        private void A() {
            S.this.f6572c.execute(new C0328b(Priority.getIntPriorityValue(this.f6574d.a())));
        }

        static void o(b bVar) {
            if (bVar.v()) {
                bVar.n().d();
            }
        }

        static /* synthetic */ e.c.c.g.a q(b bVar, e.c.c.g.a aVar) {
            bVar.f6577g = null;
            return null;
        }

        static void t(b bVar, e.c.c.g.a aVar, int i) {
            Objects.requireNonNull(bVar);
            e.c.c.d.h.a(e.c.c.g.a.x(aVar));
            if (!(((com.facebook.imagepipeline.image.d) aVar.r()) instanceof com.facebook.imagepipeline.image.e)) {
                bVar.x(aVar, i);
                return;
            }
            HashMap hashMap = new HashMap();
            bVar.f6573c.e(bVar.f6574d, "PostprocessorProducer");
            e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = null;
            try {
                try {
                    aVar2 = bVar.y((com.facebook.imagepipeline.image.d) aVar.r(), hashMap);
                    X x = bVar.f6573c;
                    V v = bVar.f6574d;
                    x.j(v, "PostprocessorProducer", bVar.w(x, v, bVar.f6575e, hashMap));
                    bVar.x(aVar2, i);
                } catch (Exception e2) {
                    X x2 = bVar.f6573c;
                    V v2 = bVar.f6574d;
                    x2.k(v2, "PostprocessorProducer", e2, bVar.w(x2, v2, bVar.f6575e, hashMap));
                    if (bVar.v()) {
                        bVar.n().a(e2);
                    }
                }
            } finally {
                if (aVar2 != null) {
                    aVar2.close();
                }
            }
        }

        static void u(b bVar) {
            boolean z;
            synchronized (bVar) {
                bVar.j = false;
                z = bVar.z();
            }
            if (z) {
                bVar.A();
            }
        }

        private boolean v() {
            synchronized (this) {
                if (this.f6576f) {
                    return false;
                }
                e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = this.f6577g;
                this.f6577g = null;
                this.f6576f = true;
                e.c.c.g.a.o(aVar);
                return true;
            }
        }

        private Map<String, String> w(X x, V v, com.facebook.imagepipeline.request.c cVar, Map<String, String> map) {
            if (!x.g(v, "PostprocessorProducer")) {
                return null;
            }
            map.put("Postprocessor", cVar.getName());
            return Collections.unmodifiableMap(map);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
        
            if (r1 != false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void x(e.c.c.g.a<com.facebook.imagepipeline.image.d> r3, int r4) {
            /*
                r2 = this;
                boolean r0 = com.facebook.imagepipeline.producers.AbstractC0722b.e(r4)
                if (r0 != 0) goto L10
                monitor-enter(r2)
                boolean r1 = r2.f6576f     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r2)
                if (r1 == 0) goto L18
                goto L10
            Ld:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            L10:
                if (r0 == 0) goto L1f
                boolean r0 = r2.v()
                if (r0 == 0) goto L1f
            L18:
                com.facebook.imagepipeline.producers.l r0 = r2.n()
                r0.c(r3, r4)
            L1f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.S.b.x(e.c.c.g.a, int):void");
        }

        private e.c.c.g.a<com.facebook.imagepipeline.image.d> y(com.facebook.imagepipeline.image.d dVar, Map<String, String> map) {
            com.facebook.imagepipeline.image.e eVar = (com.facebook.imagepipeline.image.e) dVar;
            Bitmap s = eVar.s();
            com.facebook.imagepipeline.request.c cVar = this.f6575e;
            e.c.c.g.a<Bitmap> b = cVar instanceof com.facebook.imagepipeline.request.a ? ((com.facebook.imagepipeline.request.a) cVar).b(s, S.this.b) : cVar.b(s, S.this.b);
            try {
                com.facebook.imagepipeline.image.e eVar2 = new com.facebook.imagepipeline.image.e(b, dVar.l(), eVar.A(), eVar.x(), eVar.z(), eVar.G(), eVar.D());
                eVar2.r(eVar.getExtras());
                e.c.c.g.a<com.facebook.imagepipeline.image.d> z = e.c.c.g.a.z(eVar2);
                if (b != null) {
                    b.close();
                }
                return z;
            } catch (Throwable th) {
                int i = e.c.c.g.a.h;
                if (b != null) {
                    b.close();
                }
                throw th;
            }
        }

        private synchronized boolean z() {
            if (this.f6576f || !this.i || this.j || !e.c.c.g.a.x(this.f6577g)) {
                return false;
            }
            this.j = true;
            return true;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void g() {
            if (v()) {
                n().d();
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void h(Throwable th) {
            if (v()) {
                n().a(th);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(Object obj, int i) {
            e.c.c.g.a aVar = (e.c.c.g.a) obj;
            if (!e.c.c.g.a.x(aVar)) {
                if (AbstractC0722b.e(i)) {
                    x(null, i);
                    return;
                }
                return;
            }
            synchronized (this) {
                if (!this.f6576f) {
                    e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = this.f6577g;
                    this.f6577g = e.c.c.g.a.h(aVar);
                    this.h = i;
                    this.i = true;
                    boolean z = z();
                    e.c.c.g.a.o(aVar2);
                    if (z) {
                        A();
                    }
                }
            }
        }
    }

    class c extends AbstractC0735o<e.c.c.g.a<com.facebook.imagepipeline.image.d>, e.c.c.g.a<com.facebook.imagepipeline.image.d>> implements com.facebook.imagepipeline.request.e {

        /* renamed from: c, reason: collision with root package name */
        private boolean f6578c;

        /* renamed from: d, reason: collision with root package name */
        private e.c.c.g.a<com.facebook.imagepipeline.image.d> f6579d;

        c(S s, b bVar, com.facebook.imagepipeline.request.d dVar, V v, a aVar) {
            super(bVar);
            this.f6578c = false;
            this.f6579d = null;
            dVar.a(this);
            v.e(new T(this, s));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            synchronized (this) {
                if (this.f6578c) {
                    return false;
                }
                e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = this.f6579d;
                this.f6579d = null;
                this.f6578c = true;
                e.c.c.g.a.o(aVar);
                return true;
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void g() {
            if (p()) {
                n().d();
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0735o, com.facebook.imagepipeline.producers.AbstractC0722b
        protected void h(Throwable th) {
            if (p()) {
                n().a(th);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(Object obj, int i) {
            e.c.c.g.a aVar = (e.c.c.g.a) obj;
            if (AbstractC0722b.f(i)) {
                return;
            }
            synchronized (this) {
                if (!this.f6578c) {
                    e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar2 = this.f6579d;
                    this.f6579d = e.c.c.g.a.h(aVar);
                    e.c.c.g.a.o(aVar2);
                }
            }
            synchronized (this) {
                if (!this.f6578c) {
                    e.c.c.g.a<com.facebook.imagepipeline.image.d> h = e.c.c.g.a.h(this.f6579d);
                    try {
                        n().c(h, 0);
                    } finally {
                        e.c.c.g.a.o(h);
                    }
                }
            }
        }
    }

    class d extends AbstractC0735o<e.c.c.g.a<com.facebook.imagepipeline.image.d>, e.c.c.g.a<com.facebook.imagepipeline.image.d>> {
        d(S s, b bVar, a aVar) {
            super(bVar);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        protected void i(Object obj, int i) {
            e.c.c.g.a<com.facebook.imagepipeline.image.d> aVar = (e.c.c.g.a) obj;
            if (AbstractC0722b.f(i)) {
                return;
            }
            n().c(aVar, i);
        }
    }

    public S(U<e.c.c.g.a<com.facebook.imagepipeline.image.d>> u, e.c.h.d.b bVar, Executor executor) {
        Objects.requireNonNull(u);
        this.a = u;
        this.b = bVar;
        Objects.requireNonNull(executor);
        this.f6572c = executor;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<e.c.c.g.a<com.facebook.imagepipeline.image.d>> interfaceC0732l, V v) {
        X n = v.n();
        com.facebook.imagepipeline.request.c k = v.d().k();
        b bVar = new b(interfaceC0732l, n, k, v);
        this.a.b(k instanceof com.facebook.imagepipeline.request.d ? new c(this, bVar, (com.facebook.imagepipeline.request.d) k, v, null) : new d(this, bVar, null), v);
    }
}
