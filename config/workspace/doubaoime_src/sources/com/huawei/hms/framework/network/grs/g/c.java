package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.h.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class c {
    private static final String l = "c";
    private final GrsBaseInfo a;
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f7297c;

    /* renamed from: d, reason: collision with root package name */
    private d f7298d;
    private final com.huawei.hms.framework.network.grs.g.j.c i;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Future<d>> f7299e = new ConcurrentHashMap(16);

    /* renamed from: f, reason: collision with root package name */
    private final List<d> f7300f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final JSONArray f7301g = new JSONArray();
    private final List<String> h = new CopyOnWriteArrayList();
    private String j = "";
    private long k = 1;

    public c(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.i = cVar;
        this.a = cVar.b();
        this.b = cVar.a();
        this.f7297c = aVar;
        b();
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0099 A[LOOP:0: B:2:0x0006->B:13:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.framework.network.grs.g.d a(java.util.concurrent.ExecutorService r17, java.util.List<java.lang.String> r18, java.lang.String r19, com.huawei.hms.framework.network.grs.e.c r20) {
        /*
            r16 = this;
            r9 = r16
            r10 = 0
            r0 = 0
            r11 = r0
            r12 = r10
        L6:
            int r0 = r18.size()
            if (r12 >= r0) goto L9d
            r13 = r18
            java.lang.Object r0 = r13.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r14 = 1
            if (r1 != 0) goto L8c
            com.huawei.hms.framework.network.grs.g.a r15 = new com.huawei.hms.framework.network.grs.g.a
            android.content.Context r5 = r9.b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r7 = r9.a
            r1 = r15
            r2 = r0
            r3 = r12
            r4 = r16
            r6 = r19
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Callable r1 = r15.g()
            r2 = r17
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r3 = r9.f7299e
            r3.put(r0, r1)
            long r3 = r9.k     // Catch: java.util.concurrent.TimeoutException -> L6a java.lang.InterruptedException -> L72 java.util.concurrent.ExecutionException -> L7b java.util.concurrent.CancellationException -> L84
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L6a java.lang.InterruptedException -> L72 java.util.concurrent.ExecutionException -> L7b java.util.concurrent.CancellationException -> L84
            java.lang.Object r0 = r1.get(r3, r0)     // Catch: java.util.concurrent.TimeoutException -> L6a java.lang.InterruptedException -> L72 java.util.concurrent.ExecutionException -> L7b java.util.concurrent.CancellationException -> L84
            r1 = r0
            com.huawei.hms.framework.network.grs.g.d r1 = (com.huawei.hms.framework.network.grs.g.d) r1     // Catch: java.util.concurrent.TimeoutException -> L6a java.lang.InterruptedException -> L72 java.util.concurrent.ExecutionException -> L7b java.util.concurrent.CancellationException -> L84
            if (r1 == 0) goto L68
            boolean r0 = r1.o()     // Catch: java.util.concurrent.TimeoutException -> L5e java.lang.InterruptedException -> L60 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.CancellationException -> L66
            if (r0 != 0) goto L55
            boolean r0 = r1.m()     // Catch: java.util.concurrent.TimeoutException -> L5e java.lang.InterruptedException -> L60 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.CancellationException -> L66
            if (r0 == 0) goto L68
        L55:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l     // Catch: java.util.concurrent.TimeoutException -> L5e java.lang.InterruptedException -> L60 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.CancellationException -> L66
            java.lang.String r3 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.i(r0, r3)     // Catch: java.util.concurrent.TimeoutException -> L5e java.lang.InterruptedException -> L60 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.CancellationException -> L66
            r11 = r1
            goto L8f
        L5e:
            r11 = r1
            goto L6a
        L60:
            r0 = move-exception
            r11 = r1
            goto L73
        L63:
            r0 = move-exception
            r11 = r1
            goto L7c
        L66:
            r11 = r1
            goto L84
        L68:
            r11 = r1
            goto L8e
        L6a:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r1 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L8e
        L72:
            r0 = move-exception
        L73:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r3 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.w(r1, r3, r0)
            goto L8f
        L7b:
            r0 = move-exception
        L7c:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r3 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.w(r1, r3, r0)
            goto L8e
        L84:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r1 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            goto L8f
        L8c:
            r2 = r17
        L8e:
            r14 = r10
        L8f:
            if (r14 == 0) goto L99
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.l
            java.lang.String r1 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            goto L9d
        L99:
            int r12 = r12 + 1
            goto L6
        L9d:
            com.huawei.hms.framework.network.grs.g.d r0 = r9.b(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.c.a(java.util.concurrent.ExecutorService, java.util.List, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    private void a(String str, String str2) {
        StringBuilder S = e.a.a.a.a.S(str2, str);
        String grsReqParamJoint = this.a.getGrsReqParamJoint(false, false, d(), this.b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            S.append("?");
            S.append(grsReqParamJoint);
        }
        this.h.add(S.toString());
    }

    private d b(d dVar) {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.f7299e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e = e2;
                str = l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e3) {
                e = e3;
                str = l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    private void b() {
        com.huawei.hms.framework.network.grs.g.j.d a = com.huawei.hms.framework.network.grs.g.i.a.a(this.b);
        if (a == null) {
            Logger.w(l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(a);
        List<String> a2 = a.a();
        if (a2 == null || a2.size() <= 0) {
            Logger.v(l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (a2.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String b = a.b();
        if (a2.size() > 0) {
            for (String str : a2) {
                if (str.startsWith("https://")) {
                    a(b, str);
                } else {
                    Logger.w(l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.v(l, "request to GRS server url is {%s}", this.h);
    }

    private void c() {
        String grsParasKey = this.a.getGrsParasKey(true, true, this.b);
        this.j = this.f7297c.a().a(grsParasKey + "ETag", "");
    }

    private String d() {
        com.huawei.hms.framework.network.grs.f.b a = com.huawei.hms.framework.network.grs.f.b.a(this.b.getPackageName());
        com.huawei.hms.framework.network.grs.local.model.a a2 = a != null ? a.a() : null;
        if (a2 == null) {
            return "";
        }
        String a3 = a2.a();
        Logger.v(l, "get appName from local assets is{%s}", a3);
        return a3;
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        if (this.h.isEmpty()) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d a = a(executorService, this.h, str, cVar);
        Logger.i(l, "use 2.0 interface return http's code is：{%d}", Integer.valueOf(a == null ? 0 : a.b()));
        e.a(new ArrayList(this.f7300f), SystemClock.elapsedRealtime() - elapsedRealtime, this.f7301g, this.b);
        this.f7300f.clear();
        return a;
    }

    public String a() {
        return this.j;
    }

    public synchronized void a(d dVar) {
        this.f7300f.add(dVar);
        d dVar2 = this.f7298d;
        if (dVar2 != null && (dVar2.o() || this.f7298d.m())) {
            Logger.v(l, "grsResponseResult is ok");
            return;
        }
        if (dVar.n()) {
            Logger.i(l, "GRS server open 503 limiting strategy.");
            com.huawei.hms.framework.network.grs.h.d.a(this.a.getGrsParasKey(true, true, this.b), new d.a(dVar.k(), SystemClock.elapsedRealtime()));
            return;
        }
        if (dVar.m()) {
            Logger.i(l, "GRS server open 304 Not Modified.");
        }
        if (!dVar.o() && !dVar.m()) {
            Logger.v(l, "grsResponseResult has exception so need return");
            return;
        }
        this.f7298d = dVar;
        this.f7297c.a(this.a, dVar, this.b, this.i);
        for (Map.Entry<String, Future<d>> entry : this.f7299e.entrySet()) {
            if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                Logger.i(l, "future cancel");
                entry.getValue().cancel(true);
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.d dVar) {
    }
}
