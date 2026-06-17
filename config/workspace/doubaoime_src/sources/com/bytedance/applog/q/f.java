package com.bytedance.applog.q;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.B.h;
import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.applog.q.c;
import com.bytedance.applog.util.k;
import com.bytedance.applog.w.j;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class f extends a {
    private static final List<String> k = Collections.singletonList("Sender");

    /* renamed from: f, reason: collision with root package name */
    private final long[] f3881f;

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.bytedance.applog.E.b> f3882g;
    private final com.bytedance.applog.y.b h;
    private final String i;
    private int j;

    f(@NonNull c cVar) {
        super(cVar);
        this.f3881f = new long[]{com.heytap.mcssdk.constant.a.q};
        this.f3882g = new ConcurrentHashMap<>();
        this.j = 0;
        this.h = null;
        this.i = "Sender";
    }

    private com.bytedance.applog.E.b i(String str) {
        if (!k.f(str)) {
            try {
                str = Uri.parse(str).getHost();
            } catch (Throwable unused) {
            }
        }
        if (!this.f3882g.containsKey(str)) {
            this.f3882g.put(str, new com.bytedance.applog.E.b(e.a.a.a.a.K(new StringBuilder(), this.i, Constants.COLON_SEPARATOR, str), this.a.k(), this.h));
        }
        com.bytedance.applog.E.b bVar = this.f3882g.get(str);
        d().I().s(k, "{} congestion for host:{} is {}", this.i, str, bVar);
        return bVar;
    }

    private boolean j(long j) {
        return false;
    }

    protected static void k(com.bytedance.applog.c cVar, h hVar, boolean z) {
        if (cVar.K().o()) {
            Iterator it2 = ((ArrayList) hVar.D()).iterator();
            while (it2.hasNext()) {
                com.bytedance.android.input.k.b.a.G0(cVar.K(), z ? EventStage.REPORT_END : EventStage.POST_FAILED, (com.bytedance.applog.monitor.v3.g) it2.next());
            }
        }
        hVar.K(cVar.K(), z);
        int i = j.a;
    }

    private c.d l(com.bytedance.applog.x.b bVar, String[] strArr, List<h> list, int i, @Nullable Map<String, String> map, long j) {
        Iterator<h> it2;
        int i2;
        int i3;
        int i4;
        String[] strArr2 = strArr;
        Map<String, String> map2 = map;
        c.d dVar = new c.d();
        Iterator<h> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            h next = it3.next();
            com.bytedance.applog.w.e I = d().I();
            List<String> list2 = k;
            int i5 = 1;
            I.n(list2, "{} work start send pack...", this.i);
            if (j(j)) {
                d().I().n(list2, "{} work is timeout, break send pack", this.i);
                break;
            }
            HashMap hashMap = new HashMap();
            if (map2 != null && !map.isEmpty()) {
                hashMap.putAll(map2);
            }
            Objects.requireNonNull(this.a.s());
            byte[] bArr = next.w;
            if (bArr == null || bArr.length == 0) {
                it2 = it3;
                dVar.a.add(next);
                d().I().f(list2, "{} send empty pack: {}", this.i, next);
            } else {
                com.bytedance.applog.y.b bVar2 = this.h;
                com.bytedance.applog.E.a b = bVar2 != null ? bVar2.b() : bVar.k();
                if (b != null && b.a(i)) {
                    d().K().i(StatsCountKeys.BACKOFF_BLOCK_REQUEST_COUNT, 1);
                    d().I().f(list2, "{} backoff request as ratio not allowed to send: {}", this.i, next);
                } else if (d().f() && next.H(this.a.q())) {
                    d().K().i(StatsCountKeys.ADJUST_TERMINATE_BLOCK_REQUEST_COUNT, 1);
                    d().I().f(list2, "{} adjust terminate not allowed to send: {}", this.i, next);
                } else {
                    d().I().n(list2, "{} send pack start: {}", this.i, next);
                    if (d().K().o()) {
                        Iterator it4 = ((ArrayList) next.D()).iterator();
                        while (it4.hasNext()) {
                            com.bytedance.android.input.k.b.a.G0(d().K(), EventStage.POST_START, (com.bytedance.applog.monitor.v3.g) it4.next());
                        }
                    }
                    int length = strArr2.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            it2 = it3;
                            i2 = 200;
                            break;
                        }
                        String str = strArr2[i7];
                        if (k.f(str) ? false : i(str).d()) {
                            int i8 = i5;
                            com.bytedance.applog.w.e I2 = d().I();
                            List<String> list3 = k;
                            Object[] objArr = new Object[3];
                            objArr[0] = this.i;
                            objArr[i8] = next;
                            objArr[2] = str;
                            I2.n(list3, "{} send pack:{} to uri: {}", objArr);
                            String[] strArr3 = new String[i8];
                            strArr3[0] = str;
                            it2 = it3;
                            i3 = length;
                            i2 = 200;
                            i4 = i7;
                            i6 = d().i().k(strArr3, next.w, this.a, next.E(), next.R, next.S, hashMap, true);
                            if (com.bytedance.applog.A.a.a(i6)) {
                                i(str).b();
                            } else if (i6 == 200) {
                                i(str).c();
                                break;
                            }
                        } else {
                            d().K().i(StatsCountKeys.CONGESTION_BLOCK_REQUEST_COUNT, i5);
                            d().I().f(k, "{} CongestionController not allowed uri:{} to send pack: {}", this.i, str, next);
                            it2 = it3;
                            i3 = length;
                            i4 = i7;
                        }
                        i7 = i4 + 1;
                        strArr2 = strArr;
                        it3 = it2;
                        length = i3;
                        i5 = 1;
                    }
                    d().I().n(k, "{} send pack end: {}, resp code: {}", this.i, next, Integer.valueOf(i6));
                    if (com.bytedance.applog.A.a.a(i6)) {
                        o(next, false);
                        k(d(), next, false);
                        d().K().i(StatsCountKeys.REPORT_REQUEST_FAILED_COUNT, 1);
                        break;
                    }
                    if (i6 == i2) {
                        o(next, true);
                        k(d(), next, true);
                        this.j++;
                    } else {
                        o(next, false);
                        k(d(), next, false);
                        com.bytedance.applog.y.b bVar3 = this.h;
                        if (bVar3 != null) {
                            bVar3.a(i6);
                        }
                        d().K().i(StatsCountKeys.REPORT_REQUEST_FAILED_COUNT, 1);
                    }
                }
            }
            strArr2 = strArr;
            map2 = map;
            it3 = it2;
        }
        return dVar;
    }

    private void m(int i, long j) {
        com.bytedance.applog.B.b m = this.a.m();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int J2 = d().J();
        if (i == 4) {
            J2 = 8;
        } else if (i == 12) {
            J2 = 16;
        }
        ArrayList<h> C = m.C(J2, this.h);
        Objects.requireNonNull(d());
        Objects.requireNonNull(d());
        Iterator<h> it2 = C.iterator();
        while (it2.hasNext()) {
            h next = it2.next();
            Objects.requireNonNull(d());
            if (next.F()) {
                arrayList2.add(next);
            } else if (next.G()) {
                arrayList3.add(next);
            } else {
                arrayList.add(next);
            }
        }
        Objects.requireNonNull(d());
        if (!arrayList3.isEmpty()) {
            arrayList2.addAll(arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll((this.j > 0 || arrayList.isEmpty()) ? 0 : 1, arrayList2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        com.bytedance.applog.x.b k2 = this.a.k();
        String[] b = d().j().b(this.a, false, this.h);
        if (!d().Z()) {
            l(k2, b, arrayList, i, null, j);
        } else {
            Objects.requireNonNull(d());
            l(k2, b, arrayList, i, new HashMap<>(), j);
        }
    }

    private void o(h hVar, boolean z) {
        com.bytedance.applog.B.b m = this.a.m();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            arrayList.add(hVar);
        } else {
            arrayList2.add(hVar);
        }
        m.M(arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1 A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0029, B:6:0x0030, B:8:0x0046, B:10:0x0050, B:16:0x006a, B:17:0x006d, B:19:0x007f, B:21:0x0091, B:24:0x0098, B:25:0x00ab, B:27:0x00b1, B:29:0x00b5, B:30:0x009e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0029, B:6:0x0030, B:8:0x0046, B:10:0x0050, B:16:0x006a, B:17:0x006d, B:19:0x007f, B:21:0x0091, B:24:0x0098, B:25:0x00ab, B:27:0x00b1, B:29:0x00b5, B:30:0x009e), top: B:2:0x0001 }] */
    @Override // com.bytedance.applog.q.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean c(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.q.c r2 = r11.a     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.q.g r2 = r2.q()     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.c r3 = r11.d()     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.w.e r3 = r3.I()     // Catch: java.lang.Throwable -> Lcb
            java.util.List<java.lang.String> r4 = com.bytedance.applog.q.f.k     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = "{} start doWork curTs={}, curSid={}, requestFrom={}"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = r11.i     // Catch: java.lang.Throwable -> Lcb
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> Lcb
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lcb
            r9 = 1
            r6[r9] = r7     // Catch: java.lang.Throwable -> Lcb
            r7 = 2
            if (r2 == 0) goto L2e
            java.lang.String r10 = r2.c()     // Catch: java.lang.Throwable -> Lcb
            goto L30
        L2e:
            java.lang.String r10 = "null"
        L30:
            r6[r7] = r10     // Catch: java.lang.Throwable -> Lcb
            r7 = 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Lcb
            r6[r7] = r10     // Catch: java.lang.Throwable -> Lcb
            r3.n(r4, r5, r6)     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.c r3 = r11.d()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = r3.l0()     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L65
            com.bytedance.applog.c r3 = r11.d()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = r3.b0()     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L65
            com.bytedance.applog.c r12 = r11.d()     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.w.e r12 = r12.I()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = "{} not send events in tourist mode"
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = r11.i     // Catch: java.lang.Throwable -> Lcb
            r1[r8] = r2     // Catch: java.lang.Throwable -> Lcb
            r12.f(r4, r0, r1)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r11)
            return r9
        L65:
            if (r2 == 0) goto L6d
            r5 = 50000(0xc350, double:2.47033E-319)
            r2.f(r0, r5)     // Catch: java.lang.Throwable -> Lcb
        L6d:
            com.bytedance.applog.q.c r2 = r11.a     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.B.b r2 = r2.m()     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.q.c r3 = r11.a     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.x.c r3 = r3.n()     // Catch: java.lang.Throwable -> Lcb
            boolean r5 = r3.k()     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto Lc9
            org.json.JSONObject r3 = r3.c()     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.android.input.k.b.a.M0(r3)     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.c r5 = r11.d()     // Catch: java.lang.Throwable -> Lcb
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.y.b r5 = r11.h     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto L9e
            boolean r5 = r5.g()     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto L98
            goto L9e
        L98:
            com.bytedance.applog.y.b r5 = r11.h     // Catch: java.lang.Throwable -> Lcb
            r2.v(r3, r5, r12)     // Catch: java.lang.Throwable -> Lcb
            goto Lab
        L9e:
            com.bytedance.applog.y.b r5 = r11.h     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.c r6 = r11.d()     // Catch: java.lang.Throwable -> Lcb
            boolean r6 = r6.g0()     // Catch: java.lang.Throwable -> Lcb
            r2.u(r3, r5, r12, r6)     // Catch: java.lang.Throwable -> Lcb
        Lab:
            boolean r2 = r11.j(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r2 != 0) goto Lb5
            r11.m(r12, r0)     // Catch: java.lang.Throwable -> Lcb
            goto Lc8
        Lb5:
            com.bytedance.applog.c r12 = r11.d()     // Catch: java.lang.Throwable -> Lcb
            com.bytedance.applog.w.e r12 = r12.I()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = "{} work is timeout, will not do send."
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = r11.i     // Catch: java.lang.Throwable -> Lcb
            r1[r8] = r2     // Catch: java.lang.Throwable -> Lcb
            r12.n(r4, r0, r1)     // Catch: java.lang.Throwable -> Lcb
        Lc8:
            r8 = r9
        Lc9:
            monitor-exit(r11)
            return r8
        Lcb:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.q.f.c(int):boolean");
    }

    @Override // com.bytedance.applog.q.a
    protected String e() {
        return this.i;
    }

    @Override // com.bytedance.applog.q.a
    protected long[] f() {
        return this.f3881f;
    }

    @Override // com.bytedance.applog.q.a
    protected boolean g() {
        return !this.f3871c;
    }

    @Override // com.bytedance.applog.q.a
    protected long h() {
        if (this.h == null) {
            return this.a.k().n();
        }
        com.bytedance.applog.y.a o = this.a.k().o();
        if (o != null && o.f()) {
            long n = this.a.k().n();
            if (n <= this.h.c()) {
                return n;
            }
        }
        return this.h.c();
    }

    void n(com.bytedance.applog.y.b bVar, int i) {
        if (bVar == null || bVar != this.h) {
            return;
        }
        Iterator<com.bytedance.applog.E.b> it2 = this.f3882g.values().iterator();
        while (it2.hasNext()) {
            it2.next().e(i);
        }
    }

    f(c cVar, @NonNull com.bytedance.applog.y.b bVar) {
        super(cVar);
        long[] jArr = {com.heytap.mcssdk.constant.a.q};
        this.f3881f = jArr;
        this.f3882g = new ConcurrentHashMap<>();
        this.j = 0;
        this.h = bVar;
        StringBuilder M = e.a.a.a.a.M("Sender_p_");
        M.append(bVar.e());
        this.i = M.toString();
        long c2 = bVar.c();
        if (c2 < com.heytap.mcssdk.constant.a.q) {
            jArr[0] = c2;
        }
    }
}
