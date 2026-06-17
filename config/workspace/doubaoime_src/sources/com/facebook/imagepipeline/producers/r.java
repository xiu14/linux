package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class r implements U<com.facebook.imagepipeline.image.f> {
    private final e.c.h.f.f a;
    private final e.c.h.f.f b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, e.c.h.f.f> f6641c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.h.f.g f6642d;

    /* renamed from: e, reason: collision with root package name */
    private final U<com.facebook.imagepipeline.image.f> f6643e;

    /* renamed from: f, reason: collision with root package name */
    private final com.facebook.common.memory.h f6644f;

    public r(e.c.h.f.f fVar, e.c.h.f.f fVar2, HashMap<String, e.c.h.f.f> hashMap, e.c.h.f.g gVar, U<com.facebook.imagepipeline.image.f> u, com.facebook.common.memory.h hVar) {
        this.a = fVar;
        this.b = fVar2;
        this.f6641c = hashMap;
        this.f6642d = gVar;
        this.f6643e = u;
        this.f6644f = hVar;
    }

    static Map<String, String> e(X x, V v, boolean z, int i) {
        if (x.g(v, "DiskCacheProducer")) {
            return z ? e.c.c.d.f.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : e.c.c.d.f.of("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        ImageRequest d2 = v.d();
        if (!f(v)) {
            if (v.p().getValue() < ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
                this.f6643e.b(interfaceC0732l, v);
                return;
            } else {
                v.g("disk", "nil-result_read");
                interfaceC0732l.c(null, 1);
                return;
            }
        }
        v.n().e(v, "DiskCacheProducer");
        com.facebook.cache.common.b b = ((e.c.h.f.l) this.f6642d).b(d2, v.b());
        v.n().e(v, "DiskCacheProducer");
        boolean z = d2.d() == ImageRequest.CacheChoice.SMALL;
        e.c.h.f.f fVar = d2.d() == ImageRequest.CacheChoice.CUSTOM ? this.f6641c.get(d2.e()) : null;
        if (fVar == null) {
            fVar = z ? this.b : this.a;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        fVar.l(b, atomicBoolean).b(new C0736p(this, v.n(), v, interfaceC0732l));
        v.e(new C0737q(this, atomicBoolean));
    }

    protected boolean f(V v) {
        return v.d().x();
    }
}
