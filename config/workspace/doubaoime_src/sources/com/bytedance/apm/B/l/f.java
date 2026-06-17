package com.bytedance.apm.B.l;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;

/* loaded from: classes.dex */
public class f implements d {
    private volatile long[] b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long[] f3274c;
    private NetworkStatsManager n;
    private boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f3275d = 0;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f3276e = 0;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f3277f = 0;

    /* renamed from: g, reason: collision with root package name */
    private volatile long f3278g = 0;
    private volatile long h = 0;
    private volatile long i = 0;
    private volatile long j = 0;
    private volatile long k = 0;
    private volatile long l = -1;
    private volatile boolean m = true;
    private int o = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.o();
        }
    }

    class b implements Runnable {
        final /* synthetic */ boolean a;

        b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.p();
            f.this.m = !this.a;
        }
    }

    @RequiresApi(api = 23)
    private long[] n(long j, long j2, int i) {
        Context h = com.bytedance.apm.g.h();
        if (this.n == null) {
            this.n = (NetworkStatsManager) h.getApplicationContext().getSystemService("netstats");
        }
        if (this.n == null) {
            return new long[]{0, 0};
        }
        NetworkStats networkStats = null;
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        long j3 = 0;
        try {
            networkStats = this.n.querySummary(i, null, j, j2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (networkStats != null && networkStats.hasNextBucket()) {
            networkStats.getNextBucket(bucket);
            int uid = bucket.getUid();
            if (this.o == -1) {
                try {
                    PackageInfo packageInfo = h.getApplicationContext().getPackageManager().getPackageInfo(h.getApplicationContext().getPackageName(), 128);
                    if (packageInfo != null) {
                        this.o = packageInfo.applicationInfo.uid;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    e3.printStackTrace();
                }
            }
            if (this.o == uid) {
                long rxBytes = bucket.getRxBytes() + j3;
                long txBytes = bucket.getTxBytes() + j4;
                long rxPackets = bucket.getRxPackets() + j5;
                j6 = bucket.getTxPackets() + j6;
                j5 = rxPackets;
                j4 = txBytes;
                j3 = rxBytes;
            }
        }
        if (networkStats != null) {
            networkStats.close();
        }
        return new long[]{j3 + j4, j5 + j6};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 23)
    @WorkerThread
    public void o() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = n(0L, 4611686018427387903L, 1);
        this.f3274c = n(0L, 4611686018427387903L, 0);
        this.l = SystemClock.elapsedRealtime();
        if (com.bytedance.apm.g.B()) {
            StringBuilder M = e.a.a.a.a.M("initTrafficData: mTotalWifiBytes:");
            M.append(this.b[0]);
            M.append(" mTotalWifiPackets:");
            M.append(this.b[1]);
            M.append(" mTotalMobileBytes:");
            M.append(this.f3274c[0]);
            M.append(" mTotalMobilePackets:");
            M.append(this.f3274c[1]);
            e.b.b.n.g.b.a("NewTrafficStatisticsImp", M.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 23)
    public void p() {
        long j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.l < 1000 || this.l == -1) {
            return;
        }
        long[] n = n(0L, 4611686018427387903L, 1);
        long[] n2 = n(0L, 4611686018427387903L, 0);
        long j2 = n2[0] - this.f3274c[0];
        long j3 = n2[1] - this.f3274c[1];
        this.f3274c = n2;
        long j4 = n[0] - this.b[0];
        long j5 = n[1] - this.b[1];
        this.b = n;
        if (com.bytedance.apm.g.B()) {
            StringBuilder M = e.a.a.a.a.M("mTotalWifiBytes:");
            j = elapsedRealtime;
            M.append(this.b[0]);
            M.append(" mTotalWifiPackets:");
            M.append(this.b[1]);
            M.append(" mTotalMobileBytes:");
            M.append(this.f3274c[0]);
            M.append(" mTotalMobilePackets:");
            M.append(this.f3274c[1]);
            e.b.b.n.g.b.a("NewTrafficStatisticsImp", M.toString());
        } else {
            j = elapsedRealtime;
        }
        if (this.m) {
            this.f3278g += j2;
            this.k += j3;
            this.f3277f += j4;
            this.j += j5;
        } else {
            this.f3276e += j2;
            this.i += j3;
            this.f3275d += j4;
            this.h += j5;
        }
        if (com.bytedance.apm.g.B()) {
            StringBuilder Q = e.a.a.a.a.Q("periodWifiBytes", j4, " periodMobileBytes:");
            Q.append(j2);
            Q.append(" mMobileBackBytes:");
            Q.append(this.f3276e);
            Q.append(" mWifiBackBytes:");
            Q.append(this.f3275d);
            e.b.b.n.g.b.a("NewTrafficStatisticsImp", Q.toString());
        }
        this.l = j;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long a() {
        p();
        return this.f3276e + this.f3275d;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long b() {
        p();
        return this.f3276e;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long c() {
        p();
        long j = this.f3276e + this.f3278g;
        p();
        return j + this.f3275d + this.f3277f;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public void d(boolean z) {
        com.bytedance.apm.F.b.e().c(new b(z));
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long e() {
        p();
        return this.i + this.h;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long f() {
        p();
        return this.f3277f;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long g() {
        p();
        return this.f3278g;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long h() {
        p();
        return this.f3278g + this.f3277f;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long i() {
        p();
        return this.f3275d;
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public void init() {
        if (com.bytedance.apm.F.b.e().f()) {
            o();
        } else {
            com.bytedance.apm.F.b.e().h(new a());
        }
    }

    @Override // com.bytedance.apm.B.l.d
    @RequiresApi(api = 23)
    public long j() {
        p();
        return this.k + this.j;
    }
}
