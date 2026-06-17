package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;

/* renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0738s implements U<com.facebook.imagepipeline.image.f> {
    private final e.c.h.f.f a;
    private final e.c.h.f.f b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, e.c.h.f.f> f6645c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.h.f.g f6646d;

    /* renamed from: e, reason: collision with root package name */
    private final U<com.facebook.imagepipeline.image.f> f6647e;

    /* renamed from: f, reason: collision with root package name */
    private final com.facebook.common.memory.h f6648f;

    /* renamed from: com.facebook.imagepipeline.producers.s$b */
    private static class b extends AbstractC0735o<com.facebook.imagepipeline.image.f, com.facebook.imagepipeline.image.f> {

        /* renamed from: c, reason: collision with root package name */
        private final V f6649c;

        /* renamed from: d, reason: collision with root package name */
        private final e.c.h.f.f f6650d;

        /* renamed from: e, reason: collision with root package name */
        private final e.c.h.f.f f6651e;

        /* renamed from: f, reason: collision with root package name */
        private final HashMap<String, e.c.h.f.f> f6652f;

        /* renamed from: g, reason: collision with root package name */
        private final e.c.h.f.g f6653g;
        private final boolean h;
        private String i;
        private final com.facebook.common.memory.h j;

        b(InterfaceC0732l interfaceC0732l, V v, e.c.h.f.f fVar, e.c.h.f.f fVar2, HashMap hashMap, e.c.h.f.g gVar, boolean z, com.facebook.common.memory.h hVar, a aVar) {
            super(interfaceC0732l);
            this.f6649c = v;
            this.f6650d = fVar;
            this.f6651e = fVar2;
            this.f6652f = hashMap;
            this.f6653g = gVar;
            this.h = z;
            this.j = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #4 {all -> 0x013a, blocks: (B:17:0x0088, B:19:0x009a, B:23:0x00a6, B:26:0x00ac, B:29:0x00c7, B:30:0x00c3, B:31:0x00d2, B:33:0x00ee, B:34:0x0113, B:37:0x012e, B:38:0x012a, B:39:0x00f4, B:41:0x00fc, B:43:0x010a, B:44:0x010e), top: B:16:0x0088 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a6 A[Catch: all -> 0x013a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x013a, blocks: (B:17:0x0088, B:19:0x009a, B:23:0x00a6, B:26:0x00ac, B:29:0x00c7, B:30:0x00c3, B:31:0x00d2, B:33:0x00ee, B:34:0x0113, B:37:0x012e, B:38:0x012a, B:39:0x00f4, B:41:0x00fc, B:43:0x010a, B:44:0x010e), top: B:16:0x0088 }] */
        /* JADX WARN: Type inference failed for: r1v6, types: [e.c.c.g.a] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // com.facebook.imagepipeline.producers.AbstractC0722b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(java.lang.Object r9, int r10) {
            /*
                Method dump skipped, instructions count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C0738s.b.i(java.lang.Object, int):void");
        }
    }

    public C0738s(e.c.h.f.f fVar, e.c.h.f.f fVar2, HashMap<String, e.c.h.f.f> hashMap, e.c.h.f.g gVar, U<com.facebook.imagepipeline.image.f> u, com.facebook.common.memory.h hVar) {
        this.a = fVar;
        this.b = fVar2;
        this.f6645c = hashMap;
        this.f6646d = gVar;
        this.f6647e = u;
        this.f6648f = hVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        if (v.p().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            v.g("disk", "nil-result_write");
            interfaceC0732l.c(null, 1);
        } else {
            if (v.d().x()) {
                interfaceC0732l = new b(interfaceC0732l, v, this.a, this.b, this.f6645c, this.f6646d, v.d().x(), this.f6648f, null);
            }
            this.f6647e.b(interfaceC0732l, v);
        }
    }
}
