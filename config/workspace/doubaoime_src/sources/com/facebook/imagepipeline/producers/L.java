package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.C0745z;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class L implements U<com.facebook.imagepipeline.image.f> {
    private final com.facebook.common.memory.h a;
    private final com.facebook.common.memory.a b;

    /* renamed from: c, reason: collision with root package name */
    private final M f6552c;

    class a implements M.a {
        final /* synthetic */ C0742w a;

        a(C0742w c0742w) {
            this.a = c0742w;
        }
    }

    public L(com.facebook.common.memory.h hVar, com.facebook.common.memory.a aVar, M m) {
        this.a = hVar;
        this.b = aVar;
        this.f6552c = m;
    }

    static void c(L l, C0742w c0742w, Throwable th) {
        String str;
        Map<String, String> e2 = l.e(c0742w, -1);
        if (e2 == null) {
            e2 = new HashMap<>(1);
        }
        if (l.f6552c == null) {
            str = "null";
        } else {
            str = l.f6552c.getClass().getName() + ", " + l.f6552c.toString();
        }
        e2.put("NetworkFetcher", str);
        c0742w.e().k(c0742w.b(), "NetworkFetchProducer", th, e2);
        c0742w.e().c(c0742w.b(), "NetworkFetchProducer", false);
        c0742w.b().l("network");
        c0742w.a().a(th);
    }

    static void d(L l, C0742w c0742w) {
        c0742w.e().d(c0742w.b(), "NetworkFetchProducer", l.e(c0742w, -1));
        c0742w.a().d();
    }

    private Map<String, String> e(C0742w c0742w, int i) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (!c0742w.e().g(c0742w.b(), "NetworkFetchProducer")) {
            return null;
        }
        Objects.requireNonNull((C0745z) this.f6552c);
        C0745z.a aVar = (C0745z.a) c0742w;
        HashMap hashMap = new HashMap(4);
        j = aVar.f6674f;
        j2 = aVar.f6673e;
        hashMap.put("queue_time", Long.toString(j - j2));
        j3 = aVar.f6675g;
        j4 = aVar.f6674f;
        hashMap.put("fetch_time", Long.toString(j3 - j4));
        j5 = aVar.f6675g;
        j6 = aVar.f6673e;
        hashMap.put("total_time", Long.toString(j5 - j6));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    protected static void g(com.facebook.common.memory.j jVar, int i, com.facebook.imagepipeline.common.a aVar, InterfaceC0732l interfaceC0732l, Map map) {
        e.c.c.g.a z = e.c.c.g.a.z(((com.facebook.imagepipeline.memory.x) jVar).d());
        com.facebook.imagepipeline.image.f fVar = null;
        try {
            com.facebook.imagepipeline.image.f fVar2 = new com.facebook.imagepipeline.image.f(z);
            try {
                fVar2.o0(map);
                fVar2.j0(null);
                fVar2.e0();
                fVar2.s0();
                interfaceC0732l.c(fVar2, i);
                com.facebook.imagepipeline.image.f.d(fVar2);
                z.close();
            } catch (Throwable th) {
                th = th;
                fVar = fVar2;
                com.facebook.imagepipeline.image.f.d(fVar);
                if (z != null) {
                    z.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        v.n().e(v, "NetworkFetchProducer");
        Objects.requireNonNull((C0745z) this.f6552c);
        C0745z.a aVar = new C0745z.a(interfaceC0732l, v);
        ((C0745z) this.f6552c).b(aVar, new a(aVar));
    }

    protected void f(com.facebook.common.memory.j jVar, C0742w c0742w) {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        ImageRequest d2 = c0742w.b().d();
        if (c0742w.b().o()) {
            Objects.requireNonNull(this.f6552c);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (uptimeMillis - c0742w.d() >= (d2.A() ? 10L : 100L)) {
                c0742w.h(uptimeMillis);
                c0742w.e().a(c0742w.b(), "NetworkFetchProducer", "intermediate_result");
                g(jVar, 0, null, c0742w.a(), c0742w.c());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[EDGE_INSN: B:30:0x00c2->B:31:0x00c2 BREAK  A[LOOP:0: B:14:0x008b->B:27:0x008b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: all -> 0x0151, TryCatch #1 {all -> 0x0151, blocks: (B:15:0x008b, B:19:0x0093, B:21:0x0098, B:22:0x009b, B:24:0x00a4, B:25:0x00ba, B:28:0x00a8, B:32:0x00c4, B:34:0x00d1, B:36:0x00d9, B:38:0x00dc, B:41:0x00e6, B:43:0x00ec, B:45:0x0102, B:46:0x0107, B:47:0x010d), top: B:14:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void h(com.facebook.imagepipeline.producers.C0742w r19, java.io.InputStream r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.L.h(com.facebook.imagepipeline.producers.w, java.io.InputStream, int):void");
    }
}
