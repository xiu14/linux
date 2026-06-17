package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class g {
    private static final ExecutorService b = ExecutorsUtils.newCachedThreadPool("GrsReqPool");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, com.huawei.hms.framework.network.grs.g.j.b> f7308c = new ConcurrentHashMap(16);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f7309d = new Object();
    private com.huawei.hms.framework.network.grs.e.a a;

    class a implements Callable<d> {
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f7310c;

        a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
            this.a = cVar;
            this.b = str;
            this.f7310c = cVar2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return new c(this.a, g.this.a).a(g.b, this.b, this.f7310c);
        }
    }

    class b implements Runnable {
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f7312c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7313d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.b f7314e;

        b(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i, com.huawei.hms.framework.network.grs.b bVar) {
            this.a = cVar;
            this.b = str;
            this.f7312c = cVar2;
            this.f7313d = i;
            this.f7314e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.a(gVar.a(this.a, this.b, this.f7312c, this.f7313d), this.f7314e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar != null) {
            if (dVar == null) {
                Logger.v("RequestController", "GrsResponse is null");
                bVar.a();
            } else {
                Logger.v("RequestController", "GrsResponse is not null");
                bVar.a(dVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        if (r3.a() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006d, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.hms.framework.network.grs.g.d a(com.huawei.hms.framework.network.grs.g.j.c r9, java.lang.String r10, com.huawei.hms.framework.network.grs.e.c r11, int r12) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "request to server with service name is: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RequestController"
            com.huawei.hms.framework.common.Logger.d(r1, r0)
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r9.b()
            android.content.Context r1 = r9.a()
            r2 = 1
            java.lang.String r0 = r0.getGrsParasKey(r2, r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "request spUrlKey: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "RequestController"
            com.huawei.hms.framework.common.Logger.v(r3, r1)
            java.lang.Object r1 = com.huawei.hms.framework.network.grs.g.g.f7309d
            monitor-enter(r1)
            android.content.Context r3 = r9.a()     // Catch: java.lang.Throwable -> Ld9
            boolean r3 = com.huawei.hms.framework.common.NetworkUtil.isNetworkAvailable(r3)     // Catch: java.lang.Throwable -> Ld9
            r4 = 0
            if (r3 != 0) goto L49
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld9
            return r4
        L49:
            com.huawei.hms.framework.network.grs.h.d$a r3 = com.huawei.hms.framework.network.grs.h.d.a(r0)     // Catch: java.lang.Throwable -> Ld9
            java.util.Map<java.lang.String, com.huawei.hms.framework.network.grs.g.j.b> r5 = com.huawei.hms.framework.network.grs.g.g.f7308c     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.Throwable -> Ld9
            com.huawei.hms.framework.network.grs.g.j.b r6 = (com.huawei.hms.framework.network.grs.g.j.b) r6     // Catch: java.lang.Throwable -> Ld9
            if (r6 == 0) goto L63
            boolean r7 = r6.b()     // Catch: java.lang.Throwable -> Ld9
            if (r7 != 0) goto L5e
            goto L63
        L5e:
            java.util.concurrent.Future r10 = r6.a()     // Catch: java.lang.Throwable -> Ld9
            goto L88
        L63:
            if (r3 == 0) goto L6e
            boolean r3 = r3.a()     // Catch: java.lang.Throwable -> Ld9
            if (r3 != 0) goto L6c
            goto L6e
        L6c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld9
            return r4
        L6e:
            java.lang.String r3 = "RequestController"
            java.lang.String r6 = "hitGrsRequestBean == null or request block is released."
            com.huawei.hms.framework.common.Logger.d(r3, r6)     // Catch: java.lang.Throwable -> Ld9
            java.util.concurrent.ExecutorService r3 = com.huawei.hms.framework.network.grs.g.g.b     // Catch: java.lang.Throwable -> Ld9
            com.huawei.hms.framework.network.grs.g.g$a r6 = new com.huawei.hms.framework.network.grs.g.g$a     // Catch: java.lang.Throwable -> Ld9
            r6.<init>(r9, r10, r11)     // Catch: java.lang.Throwable -> Ld9
            java.util.concurrent.Future r10 = r3.submit(r6)     // Catch: java.lang.Throwable -> Ld9
            com.huawei.hms.framework.network.grs.g.j.b r11 = new com.huawei.hms.framework.network.grs.g.j.b     // Catch: java.lang.Throwable -> Ld9
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Ld9
            r5.put(r0, r11)     // Catch: java.lang.Throwable -> Ld9
        L88:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld9
            r11 = -1
            if (r12 == r11) goto L8d
            goto L9e
        L8d:
            android.content.Context r9 = r9.a()
            com.huawei.hms.framework.network.grs.g.j.d r9 = com.huawei.hms.framework.network.grs.g.i.a.a(r9)
            if (r9 == 0) goto L9c
            int r12 = r9.c()
            goto L9e
        L9c:
            r12 = 10
        L9e:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r0 = 0
            r9[r0] = r11
            java.lang.String r11 = "RequestController"
            java.lang.String r0 = "use grsQueryTimeout %d"
            com.huawei.hms.framework.common.Logger.i(r11, r0, r9)
            long r11 = (long) r12
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.TimeoutException -> Lbe java.lang.InterruptedException -> Lc4 java.util.concurrent.ExecutionException -> Lca java.util.concurrent.CancellationException -> Ld0
            java.lang.Object r9 = r10.get(r11, r9)     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.TimeoutException -> Lbe java.lang.InterruptedException -> Lc4 java.util.concurrent.ExecutionException -> Lca java.util.concurrent.CancellationException -> Ld0
            com.huawei.hms.framework.network.grs.g.d r9 = (com.huawei.hms.framework.network.grs.g.d) r9     // Catch: java.lang.Exception -> Lb8 java.util.concurrent.TimeoutException -> Lbe java.lang.InterruptedException -> Lc4 java.util.concurrent.ExecutionException -> Lca java.util.concurrent.CancellationException -> Ld0
            return r9
        Lb8:
            r9 = move-exception
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find Other Exception, check others"
            goto Ld5
        Lbe:
            r9 = move-exception
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find TimeoutException, check others"
            goto Ld5
        Lc4:
            r9 = move-exception
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find InterruptedException, check others"
            goto Ld5
        Lca:
            r9 = move-exception
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find ExecutionException, check others"
            goto Ld5
        Ld0:
            r9 = move-exception
            java.lang.String r10 = "RequestController"
            java.lang.String r11 = "when check result, find CancellationException, check others"
        Ld5:
            com.huawei.hms.framework.common.Logger.w(r10, r11, r9)
            return r4
        Ld9:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld9
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.g.a(com.huawei.hms.framework.network.grs.g.j.c, java.lang.String, com.huawei.hms.framework.network.grs.e.c, int):com.huawei.hms.framework.network.grs.g.d");
    }

    public void a(com.huawei.hms.framework.network.grs.e.a aVar) {
        this.a = aVar;
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.b bVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i) {
        b.execute(new b(cVar, str, cVar2, i, bVar));
    }

    public void a(String str) {
        synchronized (f7309d) {
            f7308c.remove(str);
        }
    }
}
