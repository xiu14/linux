package com.facebook.imagepipeline.producers;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.M;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.imagepipeline.producers.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0745z extends AbstractC0723c<a> {
    private int a;
    private final ExecutorService b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.common.time.b f6672c;

    /* renamed from: com.facebook.imagepipeline.producers.z$a */
    public static class a extends C0742w {

        /* renamed from: e, reason: collision with root package name */
        private long f6673e;

        /* renamed from: f, reason: collision with root package name */
        private long f6674f;

        /* renamed from: g, reason: collision with root package name */
        private long f6675g;

        public a(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
            super(interfaceC0732l, v);
        }
    }

    public C0745z(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.b = Executors.newFixedThreadPool(3);
        this.f6672c = realtimeSinceBootClock;
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection a(android.net.Uri r8, int r9) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = com.facebook.common.util.c.b
            r0 = 0
            if (r8 != 0) goto L7
            r1 = r0
            goto L10
        L7:
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> Lb8
            java.lang.String r2 = r8.toString()     // Catch: java.net.MalformedURLException -> Lb8
            r1.<init>(r2)     // Catch: java.net.MalformedURLException -> Lb8
        L10:
            java.net.URLConnection r1 = r1.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            int r2 = r7.a
            r1.setConnectTimeout(r2)
            int r2 = r1.getResponseCode()
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L2b
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 >= r3) goto L2b
            r3 = r5
            goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r3 == 0) goto L2f
            return r1
        L2f:
            r3 = 307(0x133, float:4.3E-43)
            if (r2 == r3) goto L3c
            r3 = 308(0x134, float:4.32E-43)
            if (r2 == r3) goto L3c
            switch(r2) {
                case 300: goto L3c;
                case 301: goto L3c;
                case 302: goto L3c;
                case 303: goto L3c;
                default: goto L3a;
            }
        L3a:
            r3 = r4
            goto L3d
        L3c:
            r3 = r5
        L3d:
            r6 = 2
            if (r3 == 0) goto L9b
            java.lang.String r3 = "Location"
            java.lang.String r3 = r1.getHeaderField(r3)
            r1.disconnect()
            if (r3 != 0) goto L4c
            goto L50
        L4c:
            android.net.Uri r0 = android.net.Uri.parse(r3)
        L50:
            java.lang.String r1 = r8.getScheme()
            if (r9 <= 0) goto L68
            if (r0 == 0) goto L68
            java.lang.String r3 = r0.getScheme()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L68
            int r9 = r9 - r5
            java.net.HttpURLConnection r8 = r7.a(r0, r9)
            return r8
        L68:
            if (r9 != 0) goto L7d
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r8 = r8.toString()
            r9[r4] = r8
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r0 = "URL %s follows too many redirects"
            java.lang.String r8 = java.lang.String.format(r8, r0, r9)
            goto L95
        L7d:
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r8 = r8.toString()
            r9[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9[r5] = r8
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r0 = "URL %s returned %d without a valid redirect"
            java.lang.String r8 = java.lang.String.format(r8, r0, r9)
        L95:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r8)
            throw r9
        L9b:
            r1.disconnect()
            java.io.IOException r9 = new java.io.IOException
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r8 = r8.toString()
            r0[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r0[r5] = r8
            java.lang.String r8 = "Image URL %s returned HTTP code %d"
            java.lang.String r8 = java.lang.String.format(r8, r0)
            r9.<init>(r8)
            throw r9
        Lb8:
            r8 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C0745z.a(android.net.Uri, int):java.net.HttpURLConnection");
    }

    public void b(C0742w c0742w, M.a aVar) {
        a aVar2 = (a) c0742w;
        aVar2.f6673e = this.f6672c.now();
        aVar2.b().e(new C0744y(this, this.b.submit(new RunnableC0743x(this, aVar2, aVar)), aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.InputStream, java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.imagepipeline.producers.L] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void c(com.facebook.imagepipeline.producers.C0745z.a r5, com.facebook.imagepipeline.producers.M.a r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.f()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3d
            r2 = 5
            java.net.HttpURLConnection r1 = r4.a(r1, r2)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3d
            com.facebook.common.time.b r2 = r4.f6672c     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            long r2 = r2.now()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            com.facebook.imagepipeline.producers.C0745z.a.l(r5, r2)     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            if (r1 == 0) goto L30
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            r5 = -1
            r2 = r6
            com.facebook.imagepipeline.producers.L$a r2 = (com.facebook.imagepipeline.producers.L.a) r2     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            java.util.Objects.requireNonNull(r2)     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            e.c.h.m.b.b()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            com.facebook.imagepipeline.producers.L r3 = r2.b     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            com.facebook.imagepipeline.producers.w r2 = r2.a     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            r3.h(r2, r0, r5)     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            e.c.h.m.b.b()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            goto L30
        L2e:
            r5 = move-exception
            goto L3f
        L30:
            if (r0 == 0) goto L35
            r0.close()     // Catch: java.io.IOException -> L35
        L35:
            if (r1 == 0) goto L52
            goto L4f
        L38:
            r5 = move-exception
            goto L53
        L3a:
            r5 = move-exception
            r1 = r0
            goto L53
        L3d:
            r5 = move-exception
            r1 = r0
        L3f:
            com.facebook.imagepipeline.producers.L$a r6 = (com.facebook.imagepipeline.producers.L.a) r6     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.producers.L r2 = r6.b     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.producers.w r6 = r6.a     // Catch: java.lang.Throwable -> L38
            com.facebook.imagepipeline.producers.L.c(r2, r6, r5)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            r0.close()     // Catch: java.io.IOException -> L4d
        L4d:
            if (r1 == 0) goto L52
        L4f:
            r1.disconnect()
        L52:
            return
        L53:
            if (r0 == 0) goto L58
            r0.close()     // Catch: java.io.IOException -> L58
        L58:
            if (r1 == 0) goto L5d
            r1.disconnect()
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C0745z.c(com.facebook.imagepipeline.producers.z$a, com.facebook.imagepipeline.producers.M$a):void");
    }

    public void d(C0742w c0742w, int i) {
        ((a) c0742w).f6675g = this.f6672c.now();
    }
}
