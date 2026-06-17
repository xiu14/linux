package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class a0 implements U<com.facebook.imagepipeline.image.f> {
    private final Executor a;
    private final com.facebook.common.memory.h b;

    /* renamed from: c, reason: collision with root package name */
    private final U<com.facebook.imagepipeline.image.f> f6581c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6582d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.h.n.d f6583e;

    private class a extends AbstractC0735o<com.facebook.imagepipeline.image.f, com.facebook.imagepipeline.image.f> {

        /* renamed from: c, reason: collision with root package name */
        private final boolean f6584c;

        /* renamed from: d, reason: collision with root package name */
        private final e.c.h.n.d f6585d;

        /* renamed from: e, reason: collision with root package name */
        private final V f6586e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6587f;

        /* renamed from: g, reason: collision with root package name */
        private final JobScheduler f6588g;

        /* renamed from: com.facebook.imagepipeline.producers.a0$a$a, reason: collision with other inner class name */
        class C0330a extends JobScheduler.e {
            C0330a(Priority priority, a0 a0Var) {
                super(priority);
            }

            @Override // com.facebook.imagepipeline.producers.JobScheduler.c
            public void a(com.facebook.imagepipeline.image.f fVar, int i) {
                a aVar = a.this;
                e.c.h.n.c createImageTranscoder = aVar.f6585d.createImageTranscoder(fVar == null ? e.c.g.d.b : fVar.z(), a.this.f6584c);
                Objects.requireNonNull(createImageTranscoder);
                a.q(aVar, fVar, i, createImageTranscoder);
            }
        }

        class b extends C0725e {
            final /* synthetic */ InterfaceC0732l a;

            b(a0 a0Var, InterfaceC0732l interfaceC0732l) {
                this.a = interfaceC0732l;
            }

            @Override // com.facebook.imagepipeline.producers.W
            public void a() {
                a.this.f6588g.c();
                a.this.f6587f = true;
                this.a.d();
            }

            @Override // com.facebook.imagepipeline.producers.C0725e, com.facebook.imagepipeline.producers.W
            public void b() {
                if (a.this.f6586e.o()) {
                    a.this.f6588g.g();
                }
            }
        }

        a(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v, boolean z, e.c.h.n.d dVar) {
            super(interfaceC0732l);
            this.f6587f = false;
            this.f6586e = v;
            Objects.requireNonNull(v.d());
            this.f6584c = z;
            this.f6585d = dVar;
            this.f6588g = new JobScheduler(a0.this.a, new C0330a(v.a(), a0.this), 100);
            v.e(new b(a0.this, interfaceC0732l));
        }

        static void q(a aVar, com.facebook.imagepipeline.image.f fVar, int i, e.c.h.n.c cVar) {
            e.c.h.n.b d2;
            aVar.f6586e.n().e(aVar.f6586e, "ResizeAndRotateProducer");
            ImageRequest d3 = aVar.f6586e.d();
            com.facebook.common.memory.j a = a0.this.b.a();
            try {
                try {
                    d2 = cVar.d(fVar, a, d3.t(), d3.s(), null, 85);
                } finally {
                    a.close();
                }
            } catch (Exception e2) {
                aVar.f6586e.n().k(aVar.f6586e, "ResizeAndRotateProducer", e2, null);
                if (AbstractC0722b.e(i)) {
                    aVar.n().a(e2);
                }
            }
            if (d2.a() == 2) {
                throw new RuntimeException("Error while transcoding the image");
            }
            Map<String, String> u = aVar.u(fVar, d3.s(), d2, cVar.b());
            e.c.c.g.a z = e.c.c.g.a.z(((com.facebook.imagepipeline.memory.x) a).d());
            try {
                com.facebook.imagepipeline.image.f fVar2 = new com.facebook.imagepipeline.image.f(z);
                fVar2.q0(e.c.g.c.a);
                try {
                    fVar2.e0();
                    aVar.f6586e.n().j(aVar.f6586e, "ResizeAndRotateProducer", u);
                    if (d2.a() != 1) {
                        i |= 16;
                    }
                    aVar.n().c(fVar2, i);
                    z.close();
                } finally {
                    com.facebook.imagepipeline.image.f.d(fVar2);
                }
            } catch (Throwable th) {
                if (z != null) {
                    z.close();
                }
                throw th;
            }
        }

        private Map<String, String> u(com.facebook.imagepipeline.image.f fVar, com.facebook.imagepipeline.common.e eVar, e.c.h.n.b bVar, String str) {
            String str2;
            if (!this.f6586e.n().g(this.f6586e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = fVar.N() + "x" + fVar.x();
            if (eVar != null) {
                str2 = eVar.a + "x" + eVar.b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(fVar.z()));
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f6588g.e()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(bVar));
            return e.c.c.d.f.a(hashMap);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x0079, code lost:
        
            if (r5 != false) goto L27;
         */
        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void i(java.lang.Object r9, int r10) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.a0.a.i(java.lang.Object, int):void");
        }
    }

    public a0(Executor executor, com.facebook.common.memory.h hVar, U<com.facebook.imagepipeline.image.f> u, boolean z, e.c.h.n.d dVar) {
        Objects.requireNonNull(executor);
        this.a = executor;
        Objects.requireNonNull(hVar);
        this.b = hVar;
        Objects.requireNonNull(u);
        this.f6581c = u;
        Objects.requireNonNull(dVar);
        this.f6583e = dVar;
        this.f6582d = z;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        this.f6581c.b(new a(interfaceC0732l, v, this.f6582d, this.f6583e), v);
    }
}
