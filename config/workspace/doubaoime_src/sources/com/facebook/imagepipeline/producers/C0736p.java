package com.facebook.imagepipeline.producers;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: com.facebook.imagepipeline.producers.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0736p implements c.c<com.facebook.imagepipeline.image.f, Void> {
    final /* synthetic */ X a;
    final /* synthetic */ V b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC0732l f6639c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ r f6640d;

    C0736p(r rVar, X x, V v, InterfaceC0732l interfaceC0732l) {
        this.f6640d = rVar;
        this.a = x;
        this.b = v;
        this.f6639c = interfaceC0732l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.c
    public Void a(c.h<com.facebook.imagepipeline.image.f> hVar) throws Exception {
        U u;
        com.facebook.imagepipeline.image.f fVar;
        com.facebook.common.memory.h hVar2;
        IOException e2;
        e.c.c.g.a aVar;
        U u2;
        e.c.c.g.a aVar2 = null;
        if (hVar.f() || (hVar.g() && (hVar.d() instanceof CancellationException))) {
            this.a.d(this.b, "DiskCacheProducer", null);
            this.f6639c.d();
        } else if (hVar.g()) {
            this.a.k(this.b, "DiskCacheProducer", hVar.d(), null);
            u2 = this.f6640d.f6643e;
            u2.b(this.f6639c, this.b);
        } else {
            com.facebook.imagepipeline.image.f e3 = hVar.e();
            if (e3 != null) {
                byte[] n = ((e.c.h.l.d) this.b.m()).n(e3.A());
                if (n != 0 && n.length > 0) {
                    hVar2 = this.f6640d.f6644f;
                    com.facebook.common.memory.j f2 = hVar2.f(n.length);
                    try {
                        try {
                            f2.write(n, 0, n.length);
                            aVar = e.c.c.g.a.z(((com.facebook.imagepipeline.memory.x) f2).d());
                            try {
                                fVar = new com.facebook.imagepipeline.image.f(aVar);
                                fVar.h(e3);
                                fVar.e0();
                                e.c.c.g.a.o(aVar);
                            } catch (IOException e4) {
                                e2 = e4;
                                e.c.c.e.a.j("DiskCacheProducer", "Construct decrypted data error", e2);
                                e.c.c.g.a.o(aVar);
                                fVar = e3;
                                fVar.Q();
                                X x = this.a;
                                V v = this.b;
                                x.j(v, "DiskCacheProducer", r.e(x, v, true, e3.I()));
                                this.a.c(this.b, "DiskCacheProducer", true);
                                this.b.l("disk");
                                this.f6639c.b(1.0f);
                                this.f6639c.c(fVar, 1);
                                e3.close();
                                fVar.close();
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            aVar2 = n;
                            e.c.c.g.a.o(aVar2);
                            throw th;
                        }
                    } catch (IOException e5) {
                        e2 = e5;
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        e.c.c.g.a.o(aVar2);
                        throw th;
                    }
                    fVar.Q();
                    X x2 = this.a;
                    V v2 = this.b;
                    x2.j(v2, "DiskCacheProducer", r.e(x2, v2, true, e3.I()));
                    this.a.c(this.b, "DiskCacheProducer", true);
                    this.b.l("disk");
                    this.f6639c.b(1.0f);
                    this.f6639c.c(fVar, 1);
                    e3.close();
                    fVar.close();
                }
                fVar = e3;
                fVar.Q();
                X x22 = this.a;
                V v22 = this.b;
                x22.j(v22, "DiskCacheProducer", r.e(x22, v22, true, e3.I()));
                this.a.c(this.b, "DiskCacheProducer", true);
                this.b.l("disk");
                this.f6639c.b(1.0f);
                this.f6639c.c(fVar, 1);
                e3.close();
                fVar.close();
            } else {
                X x3 = this.a;
                V v3 = this.b;
                x3.j(v3, "DiskCacheProducer", r.e(x3, v3, false, 0));
                u = this.f6640d.f6643e;
                u.b(this.f6639c, this.b);
            }
        }
        return null;
    }
}
