package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class P implements U<com.facebook.imagepipeline.image.f> {
    private final e.c.h.f.f a;
    private final e.c.h.f.g b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.common.memory.h f6559c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.common.memory.a f6560d;

    /* renamed from: e, reason: collision with root package name */
    private final U<com.facebook.imagepipeline.image.f> f6561e;

    private static class a extends AbstractC0735o<com.facebook.imagepipeline.image.f, com.facebook.imagepipeline.image.f> {

        /* renamed from: c, reason: collision with root package name */
        private final e.c.h.f.f f6562c;

        /* renamed from: d, reason: collision with root package name */
        private final com.facebook.cache.common.b f6563d;

        /* renamed from: e, reason: collision with root package name */
        private final com.facebook.common.memory.h f6564e;

        /* renamed from: f, reason: collision with root package name */
        private final com.facebook.common.memory.a f6565f;

        /* renamed from: g, reason: collision with root package name */
        private final com.facebook.imagepipeline.image.f f6566g;

        a(InterfaceC0732l interfaceC0732l, e.c.h.f.f fVar, com.facebook.cache.common.b bVar, com.facebook.common.memory.h hVar, com.facebook.common.memory.a aVar, com.facebook.imagepipeline.image.f fVar2, N n) {
            super(interfaceC0732l);
            this.f6562c = fVar;
            this.f6563d = bVar;
            this.f6564e = hVar;
            this.f6565f = aVar;
            this.f6566g = fVar2;
        }

        private void o(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = this.f6565f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } finally {
                    this.f6565f.release(bArr);
                }
            }
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }

        private com.facebook.common.memory.j p(com.facebook.imagepipeline.image.f fVar, com.facebook.imagepipeline.image.f fVar2) throws IOException {
            com.facebook.common.memory.j f2 = this.f6564e.f(fVar2.I() + fVar2.o().a);
            o(fVar.A(), f2, fVar2.o().a);
            o(fVar2.A(), f2, fVar2.I());
            return f2;
        }

        private void q(com.facebook.common.memory.j jVar) {
            com.facebook.imagepipeline.image.f fVar;
            Throwable th;
            e.c.c.g.a z = e.c.c.g.a.z(((com.facebook.imagepipeline.memory.x) jVar).d());
            try {
                fVar = new com.facebook.imagepipeline.image.f(z);
                try {
                    fVar.e0();
                    n().c(fVar, 1);
                    com.facebook.imagepipeline.image.f.d(fVar);
                    e.c.c.g.a.o(z);
                } catch (Throwable th2) {
                    th = th2;
                    com.facebook.imagepipeline.image.f.d(fVar);
                    e.c.c.g.a.o(z);
                    throw th;
                }
            } catch (Throwable th3) {
                fVar = null;
                th = th3;
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        public void i(Object obj, int i) {
            com.facebook.imagepipeline.image.f fVar = (com.facebook.imagepipeline.image.f) obj;
            if (AbstractC0722b.f(i)) {
                return;
            }
            if (this.f6566g == null || fVar.o() == null) {
                if (!AbstractC0722b.m(i, 8) || !AbstractC0722b.e(i) || fVar.z() == e.c.g.d.b) {
                    n().c(fVar, i);
                    return;
                } else {
                    this.f6562c.o(this.f6563d, fVar);
                    n().c(fVar, i);
                    return;
                }
            }
            try {
                try {
                    q(p(this.f6566g, fVar));
                } catch (IOException e2) {
                    e.c.c.e.a.j("PartialDiskCacheProducer", "Error while merging image data", e2);
                    n().a(e2);
                }
                fVar.close();
                this.f6566g.close();
                this.f6562c.p(this.f6563d);
            } catch (Throwable th) {
                fVar.close();
                this.f6566g.close();
                throw th;
            }
        }
    }

    public P(e.c.h.f.f fVar, e.c.h.f.g gVar, com.facebook.common.memory.h hVar, com.facebook.common.memory.a aVar, U<com.facebook.imagepipeline.image.f> u) {
        this.a = fVar;
        this.b = gVar;
        this.f6559c = hVar;
        this.f6560d = aVar;
        this.f6561e = u;
    }

    static void c(P p, InterfaceC0732l interfaceC0732l, V v, com.facebook.cache.common.b bVar, com.facebook.imagepipeline.image.f fVar) {
        p.f6561e.b(new a(interfaceC0732l, p.a, bVar, p.f6559c, p.f6560d, fVar, null), v);
    }

    static Map<String, String> d(X x, V v, boolean z, int i) {
        if (x.g(v, "PartialDiskCacheProducer")) {
            return z ? e.c.c.d.f.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : e.c.c.d.f.of("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        ImageRequest d2 = v.d();
        if (!d2.x()) {
            this.f6561e.b(interfaceC0732l, v);
            return;
        }
        v.n().e(v, "PartialDiskCacheProducer");
        Uri build = d2.v().buildUpon().appendQueryParameter("fresco_partial", "true").build();
        e.c.h.f.g gVar = this.b;
        v.b();
        Objects.requireNonNull((e.c.h.f.l) gVar);
        com.facebook.cache.common.h hVar = new com.facebook.cache.common.h(build.toString());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a.l(hVar, atomicBoolean).b(new N(this, v.n(), v, interfaceC0732l, hVar));
        v.e(new O(this, atomicBoolean));
    }
}
