package com.bytedance.apm6.consumer.slardar.send;

import com.mammon.audiosdk.SAMICoreCode;
import com.ss.ttuploader.TTUploadResolver;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class b {
    private static final long[] n = {120000, 300000, 600000, 1800000, 3600000};
    private volatile int a;
    private volatile int b;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f3630d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f3631e;
    private e.b.b.e.a.h.a l;
    private volatile boolean m;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f3629c = 0;
    private volatile boolean i = true;

    /* renamed from: f, reason: collision with root package name */
    private List<String> f3632f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private List<String> f3633g = new ArrayList();
    private List<String> h = new ArrayList();
    private AtomicLong j = new AtomicLong(0);
    private AtomicLong k = new AtomicLong();

    /* renamed from: com.bytedance.apm6.consumer.slardar.send.b$b, reason: collision with other inner class name */
    static class C0133b {
        static b a = new b(null);
    }

    b(a aVar) {
    }

    private long c() {
        long j = this.b > this.f3630d ? this.b : this.f3630d;
        return j > ((long) this.f3631e) ? j : this.f3631e;
    }

    public static b e() {
        return C0133b.a;
    }

    private void o() {
        this.i = false;
        this.j.set(System.currentTimeMillis());
    }

    void a(long j) {
        this.f3631e = (int) (j * 1000);
        o();
    }

    void b() {
        l();
        this.m = true;
        this.k.set(System.currentTimeMillis());
    }

    List<String> d() {
        e.b.b.e.a.h.a aVar = this.l;
        return (aVar == null || com.bytedance.android.input.k.b.a.e0(aVar.b())) ? this.h : this.l.b();
    }

    List<String> f() {
        e.b.b.e.a.h.a aVar = this.l;
        return (aVar == null || com.bytedance.android.input.k.b.a.e0(aVar.h())) ? this.f3632f : this.l.h();
    }

    long g(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return 0L;
        }
        long[] jArr = n;
        return i2 >= jArr.length ? jArr[jArr.length - 1] : jArr[i2];
    }

    List<String> h() {
        e.b.b.e.a.h.a aVar = this.l;
        return (aVar == null || com.bytedance.android.input.k.b.a.e0(aVar.i())) ? this.f3633g : this.l.i();
    }

    boolean i() {
        e.b.b.e.a.h.a aVar = this.l;
        if (aVar != null) {
            return aVar.j();
        }
        return true;
    }

    boolean j() {
        return this.i || System.currentTimeMillis() - this.j.get() > c();
    }

    boolean k() {
        return this.m ? System.currentTimeMillis() - this.k.get() <= c() : this.m;
    }

    void l() {
        if (this.a == 0) {
            this.a = 1;
            this.b = 300000;
        } else if (this.a == 1) {
            this.a = 2;
            this.b = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
        } else if (this.a == 2) {
            this.a = 3;
            this.b = 1800000;
        } else {
            this.a = 4;
            this.b = 1800000;
        }
        if (e.b.b.n.a.b()) {
            List<String> list = e.b.b.e.a.a.a;
            StringBuilder M = e.a.a.a.a.M("longBackOff:");
            M.append(this.b);
            M.append(" netFailCount:");
            M.append(this.a);
            e.b.b.n.g.b.a("APM-Slardar", M.toString());
        }
        o();
    }

    void m() {
        this.m = false;
    }

    void n() {
        this.i = true;
        this.m = false;
        this.a = 0;
        this.b = 0;
        this.f3629c = 0;
        this.f3630d = 0;
        this.f3631e = 0;
        this.k.set(0L);
        this.j.set(0L);
    }

    public void p(List<String> list) {
        if (com.bytedance.android.input.k.b.a.e0(list)) {
            return;
        }
        this.h.clear();
        this.h.addAll(list);
    }

    public void q(List<String> list) {
        if (com.bytedance.android.input.k.b.a.e0(list)) {
            return;
        }
        this.f3632f.clear();
        this.f3632f.addAll(list);
    }

    public void r(List<String> list) {
        if (com.bytedance.android.input.k.b.a.e0(list)) {
            return;
        }
        this.f3633g.clear();
        this.f3633g.addAll(list);
    }

    void s() {
        if (this.f3629c == 0) {
            this.f3629c = 1;
            this.f3630d = 30000;
        } else if (this.f3629c == 1) {
            this.f3629c = 2;
            this.f3630d = TTUploadResolver.HOST_MAX_CACHE_TIME;
        } else if (this.f3629c == 2) {
            this.f3629c = 3;
            this.f3630d = SAMICoreCode.SAMI_EXTRACTOR_BASE;
        } else if (this.f3629c == 3) {
            this.f3629c = 4;
            this.f3630d = 240000;
        } else {
            this.f3629c = 5;
            this.f3630d = 300000;
        }
        if (e.b.b.n.a.b()) {
            List<String> list = e.b.b.e.a.a.a;
            StringBuilder M = e.a.a.a.a.M("shortStopInterval:");
            M.append(this.f3630d);
            M.append(" shortFailCount:");
            M.append(this.f3629c);
            e.b.b.n.g.b.a("APM-Slardar", M.toString());
        }
        o();
    }

    public void t(e.b.b.e.a.h.a aVar) {
        this.l = aVar;
    }
}
