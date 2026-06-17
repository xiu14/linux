package com.bytedance.applog.q;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.B.i;
import com.bytedance.applog.B.j;
import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.common.utility.NetworkUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class g {
    private static final List<String> s = Collections.singletonList("Session");
    private static a t;
    public static final /* synthetic */ int u = 0;
    private volatile long a;

    /* renamed from: f, reason: collision with root package name */
    private final c f3886f;

    /* renamed from: g, reason: collision with root package name */
    private i f3887g;
    private i h;
    private String i;
    private volatile long k;
    private volatile boolean m;
    private long n;
    private int o;
    private String p;
    private volatile String q;
    private volatile long r;
    public volatile long b = 0;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f3883c = 0;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f3884d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f3885e = 0;
    private final AtomicLong j = new AtomicLong(1000);
    private long l = -1;

    static class a extends j {
        a() {
        }
    }

    g(c cVar) {
        this.f3886f = cVar;
        this.r = cVar.k().u();
    }

    static a g() {
        if (t == null) {
            t = new a();
        }
        t.u(0L);
        return t;
    }

    static boolean j(com.bytedance.applog.B.a aVar) {
        if (aVar instanceof i) {
            return ((i) aVar).C();
        }
        return false;
    }

    public void a(com.bytedance.applog.B.a aVar) {
        if (aVar != null) {
            b(aVar, this.a);
            aVar.s(this.f3886f.h().k());
            aVar.f3735g = this.f3886f.h().U();
            aVar.f3732d = this.i;
            aVar.f3731c = k();
            aVar.i = NetworkUtils.f(this.f3886f.l()).getValue();
        }
    }

    public void b(com.bytedance.applog.B.a aVar, long j) {
        Objects.requireNonNull(this.f3886f.h());
        this.f3886f.h().s();
        aVar.f3733e = j;
        aVar.h = this.f3886f.h().e(String.valueOf(aVar.f3733e));
    }

    public String c() {
        return this.i;
    }

    public String d() {
        return this.q;
    }

    public long e() {
        return this.r;
    }

    synchronized Bundle f(long j, long j2) {
        this.f3886f.k().H();
        return null;
    }

    public long h() {
        return this.a;
    }

    public boolean i() {
        return this.m;
    }

    public long k() {
        return this.j.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(com.bytedance.applog.B.a r14, java.util.ArrayList<com.bytedance.applog.B.a> r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.q.g.l(com.bytedance.applog.B.a, java.util.ArrayList):boolean");
    }

    public void m(long j) {
        this.a = j;
    }

    synchronized com.bytedance.applog.B.g n(com.bytedance.applog.B.a aVar, ArrayList<com.bytedance.applog.B.a> arrayList, boolean z) {
        long j;
        com.bytedance.applog.B.g gVar;
        if (aVar != null) {
            try {
                j = aVar instanceof a ? -1L : aVar.b;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = 0;
        }
        this.i = UUID.randomUUID().toString();
        if (z) {
            this.r = j;
            this.f3886f.k().U(this.r);
            Objects.requireNonNull(this.f3886f);
            if (TextUtils.isEmpty(this.q)) {
                this.q = this.i;
            }
        }
        this.j.set(com.heytap.mcssdk.constant.a.q);
        this.l = j;
        this.m = z;
        this.n = 0L;
        this.k = 0L;
        if (z) {
            Calendar calendar = Calendar.getInstance();
            String str = "" + calendar.get(1) + calendar.get(2) + calendar.get(5);
            com.bytedance.applog.x.b k = this.f3886f.k();
            if (TextUtils.isEmpty(this.p)) {
                this.p = k.t();
                this.o = k.y();
            }
            if (str.equals(this.p)) {
                this.o++;
            } else {
                this.p = str;
                this.o = 1;
            }
            k.T(str, this.o);
            this.k = j;
        }
        gVar = null;
        if (j != -1) {
            gVar = new com.bytedance.applog.B.g();
            gVar.s(this.f3886f.h().k());
            gVar.f3732d = this.i;
            gVar.y = !this.m;
            gVar.f3731c = k();
            gVar.u(this.l);
            gVar.x = this.f3886f.n().i();
            gVar.w = this.f3886f.n().h();
            b(gVar, this.a);
            gVar.f3735g = this.f3886f.h().U();
            gVar.s = com.bytedance.android.input.k.b.a.S(this.f3886f.h().K(), gVar);
            arrayList.add(gVar);
            if (gVar.s > 0) {
                com.bytedance.android.input.k.b.a.H0(this.f3886f.h().K(), EventStage.COLLECTED, gVar);
            }
            this.f3886f.h().K().i(StatsCountKeys.COLLECT_LAUNCH_COUNT, 1);
            if (this.m) {
                this.f3886f.h().K().i(StatsCountKeys.COLLECT_FRONT_LAUNCH_COUNT, 1);
            }
            this.f3886f.h().E().a(gVar.f3732d, gVar.b, gVar.y);
        }
        if (this.f3886f.h().D() <= 0) {
            this.f3886f.h().y0(6);
        }
        com.bytedance.applog.w.e I = this.f3886f.h().I();
        List<String> list = s;
        StringBuilder sb = new StringBuilder();
        sb.append("startSession, ");
        sb.append(this.m ? "fg" : "bg");
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(j);
        I.s(list, sb.toString(), new Object[0]);
        return gVar;
    }
}
