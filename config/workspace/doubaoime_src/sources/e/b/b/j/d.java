package e.b.b.j;

import android.os.Debug;

/* loaded from: classes.dex */
class d {
    private long a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f9469c;

    /* renamed from: d, reason: collision with root package name */
    private long f9470d;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        private static final d a = new d();
    }

    d() {
    }

    private long b() {
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
        long j = parseLong - this.f9469c;
        this.f9469c = parseLong;
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("blockingGcCount:");
            M.append(this.f9469c);
            e.b.b.n.g.b.a("APM-Memory", M.toString());
        }
        return j;
    }

    private long c() {
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
        long j = parseLong - this.f9470d;
        this.f9470d = parseLong;
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("blockingGcTime:");
            M.append(this.f9470d);
            e.b.b.n.g.b.a("APM-Memory", M.toString());
        }
        return j;
    }

    private long d() {
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
        long j = parseLong - this.a;
        this.a = parseLong;
        if (e.b.b.n.a.b()) {
            e.b.b.n.g.b.a("APM-Memory", "gcCount:" + parseLong);
        }
        return j;
    }

    private long e() {
        long parseLong = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
        long j = parseLong - this.b;
        this.b = parseLong;
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("gcTime:");
            M.append(this.b);
            e.b.b.n.g.b.a("APM-Memory", M.toString());
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    e.b.b.j.i.a a(e.b.b.j.g.a r38) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.j.d.a(e.b.b.j.g.a):e.b.b.j.i.a");
    }

    void f() {
        d();
        e();
        b();
        c();
    }
}
