package com.ss.ugc.effectplatform.algorithm;

import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.util.PlatformType;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8433d = new b();
    private static final d.a.b.d.e a = new d.a.b.d.e();
    private static final d.a.a.b<String, f> b = new d.a.a.b<>(false, 1);

    /* renamed from: c, reason: collision with root package name */
    private static final d.a.b.d.a f8432c = new d.a.b.d.a(false);

    private b() {
    }

    public static final void b() {
        d.a.b.d.e eVar = a;
        eVar.a();
        try {
            b.clear();
            f8432c.c(false);
        } finally {
            eVar.b();
        }
    }

    public static final void d(ModelInfo modelInfo) {
        l.g(modelInfo, "modelInfo");
        if (PlatformType.ANDROID == PlatformType.PC) {
            return;
        }
        String name = modelInfo.getName();
        l.g("", "filePath");
        com.ss.ugc.effectplatform.model.d dVar = new com.ss.ugc.effectplatform.model.d("", null);
        dVar.g(name);
        String Q = r.Q(modelInfo);
        dVar.f(Q != null ? Q : "");
        dVar.h(modelInfo.getType());
        dVar.i(modelInfo.getVersion());
        f fVar = new f(dVar, modelInfo);
        d.a.b.d.e eVar = a;
        eVar.a();
        try {
            d.a.c.b.b.a("AlgorithmModelInfoMemoryCache", "model: " + name + " write in cache!");
            b.put(name, fVar);
        } finally {
            eVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:19:0x0046, B:20:0x0050, B:22:0x0056, B:25:0x006d, B:28:0x0074, B:30:0x0080, B:38:0x0092, B:39:0x0096, B:41:0x009c, B:45:0x00af, B:49:0x00b3, B:50:0x00bf), top: B:18:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:19:0x0046, B:20:0x0050, B:22:0x0056, B:25:0x006d, B:28:0x0074, B:30:0x0080, B:38:0x0092, B:39:0x0096, B:41:0x009c, B:45:0x00af, B:49:0x00b3, B:50:0x00bf), top: B:18:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.ss.ugc.effectplatform.model.c r13, com.ss.ugc.effectplatform.e.a r14) {
        /*
            r12 = this;
            java.lang.String r0 = "serverModelInfos"
            kotlin.s.c.l.g(r13, r0)
            java.lang.String r0 = "localCache"
            kotlin.s.c.l.g(r14, r0)
            com.ss.ugc.effectplatform.util.PlatformType r0 = com.ss.ugc.effectplatform.util.PlatformType.ANDROID
            com.ss.ugc.effectplatform.util.PlatformType r1 = com.ss.ugc.effectplatform.util.PlatformType.PC
            if (r0 != r1) goto L11
            return
        L11:
            java.util.Map r13 = r13.b()
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L25
            r2 = r13
            d.a.a.b r2 = (d.a.a.b) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L23
            goto L25
        L23:
            r2 = r0
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L2e
            d.a.b.d.a r13 = com.ss.ugc.effectplatform.algorithm.b.f8432c
            r13.c(r0)
            return
        L2e:
            java.util.Map r14 = r14.m()
            r2 = r14
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L41
            d.a.b.d.a r13 = com.ss.ugc.effectplatform.algorithm.b.f8432c
            r13.c(r0)
            return
        L41:
            d.a.b.d.e r2 = com.ss.ugc.effectplatform.algorithm.b.a
            r2.a()
            d.a.a.b r13 = (d.a.a.b) r13     // Catch: java.lang.Throwable -> Ld9
            java.util.Set r13 = r13.entrySet()     // Catch: java.lang.Throwable -> Ld9
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> Ld9
        L50:
            boolean r3 = r13.hasNext()     // Catch: java.lang.Throwable -> Ld9
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r13.next()     // Catch: java.lang.Throwable -> Ld9
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Ld9
            r5 = r14
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> Ld9
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto L50
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> Ld9
            r6 = r6 ^ r1
            if (r6 == 0) goto L50
            java.lang.Object r6 = r3.getValue()     // Catch: java.lang.Throwable -> Ld9
            com.ss.ugc.effectplatform.model.algorithm.ModelInfo r6 = (com.ss.ugc.effectplatform.model.algorithm.ModelInfo) r6     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r6 = com.prolificinteractive.materialcalendarview.r.Q(r6)     // Catch: java.lang.Throwable -> Ld9
            if (r6 == 0) goto L8e
            int r7 = r6.length()     // Catch: java.lang.Throwable -> Ld9
            if (r7 != 0) goto L88
            r7 = r1
            goto L89
        L88:
            r7 = r0
        L89:
            if (r7 == 0) goto L8c
            goto L8e
        L8c:
            r7 = r0
            goto L8f
        L8e:
            r7 = r1
        L8f:
            r8 = 0
            if (r7 != 0) goto Lb1
            java.util.Iterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> Ld9
        L96:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> Ld9
            if (r9 == 0) goto Laf
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> Ld9
            r10 = r9
            com.ss.ugc.effectplatform.model.d r10 = (com.ss.ugc.effectplatform.model.d) r10     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r10 = r10.b()     // Catch: java.lang.Throwable -> Ld9
            r11 = 2
            boolean r10 = kotlin.text.a.j(r6, r10, r0, r11, r8)     // Catch: java.lang.Throwable -> Ld9
            if (r10 == 0) goto L96
            r8 = r9
        Laf:
            com.ss.ugc.effectplatform.model.d r8 = (com.ss.ugc.effectplatform.model.d) r8     // Catch: java.lang.Throwable -> Ld9
        Lb1:
            if (r8 != 0) goto Lbf
            int r6 = r5.size()     // Catch: java.lang.Throwable -> Ld9
            int r6 = r6 - r1
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> Ld9
            r8 = r5
            com.ss.ugc.effectplatform.model.d r8 = (com.ss.ugc.effectplatform.model.d) r8     // Catch: java.lang.Throwable -> Ld9
        Lbf:
            com.ss.ugc.effectplatform.algorithm.f r5 = new com.ss.ugc.effectplatform.algorithm.f     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Ld9
            com.ss.ugc.effectplatform.model.algorithm.ModelInfo r3 = (com.ss.ugc.effectplatform.model.algorithm.ModelInfo) r3     // Catch: java.lang.Throwable -> Ld9
            r5.<init>(r8, r3)     // Catch: java.lang.Throwable -> Ld9
            d.a.a.b<java.lang.String, com.ss.ugc.effectplatform.algorithm.f> r3 = com.ss.ugc.effectplatform.algorithm.b.b     // Catch: java.lang.Throwable -> Ld9
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> Ld9
            goto L50
        Ld0:
            r2.b()
            d.a.b.d.a r13 = com.ss.ugc.effectplatform.algorithm.b.f8432c
            r13.c(r1)
            return
        Ld9:
            r13 = move-exception
            r2.b()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.algorithm.b.a(com.ss.ugc.effectplatform.model.c, com.ss.ugc.effectplatform.e.a):void");
    }

    public final f c(String str) {
        l.g(str, "name");
        d.a.b.d.e eVar = a;
        eVar.a();
        try {
            return b.get(str);
        } finally {
            eVar.b();
        }
    }
}
