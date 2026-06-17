package com.xiaomi.push;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes2.dex */
public class gc implements gs {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    gp f463a;

    /* renamed from: a, reason: collision with other field name */
    XMPushService f464a;

    /* renamed from: a, reason: collision with other field name */
    private Exception f465a;

    /* renamed from: e, reason: collision with root package name */
    private long f9108e;

    /* renamed from: f, reason: collision with root package name */
    private long f9109f;

    /* renamed from: a, reason: collision with other field name */
    private long f462a = 0;
    private long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f9106c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f9107d = 0;

    /* renamed from: a, reason: collision with other field name */
    private String f466a = "";

    gc(XMPushService xMPushService) {
        this.f9108e = 0L;
        this.f9109f = 0L;
        this.f464a = xMPushService;
        b();
        int myUid = Process.myUid();
        try {
            this.f9109f = TrafficStats.getUidRxBytes(myUid);
            this.f9108e = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("Failed to obtain traffic data during initialization: " + e2);
            this.f9109f = -1L;
            this.f9108e = -1L;
        }
    }

    private void b() {
        this.b = 0L;
        this.f9107d = 0L;
        this.f462a = 0L;
        this.f9106c = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ax.m117a((Context) this.f464a)) {
            this.f462a = elapsedRealtime;
        }
        if (this.f464a.m698c()) {
            this.f9106c = elapsedRealtime;
        }
    }

    private synchronized void c() {
        com.xiaomi.channel.commonutils.logger.c.c("stat connpt = " + this.f466a + " netDuration = " + this.b + " ChannelDuration = " + this.f9107d + " channelConnectedTime = " + this.f9106c);
        fy fyVar = new fy();
        fyVar.f441a = (byte) 0;
        fyVar.a(fx.CHANNEL_ONLINE_RATE.a());
        fyVar.a(this.f466a);
        fyVar.d((int) (System.currentTimeMillis() / 1000));
        fyVar.b((int) (this.b / 1000));
        fyVar.c((int) (this.f9107d / 1000));
        gd.m406a().a(fyVar);
        b();
    }

    Exception a() {
        return this.f465a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m405a() {
        XMPushService xMPushService = this.f464a;
        if (xMPushService == null) {
            return;
        }
        String m112a = ax.m112a((Context) xMPushService);
        boolean b = ax.b(this.f464a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f462a;
        if (j > 0) {
            this.b = (elapsedRealtime - j) + this.b;
            this.f462a = 0L;
        }
        long j2 = this.f9106c;
        if (j2 != 0) {
            this.f9107d = (elapsedRealtime - j2) + this.f9107d;
            this.f9106c = 0L;
        }
        if (b) {
            if ((!TextUtils.equals(this.f466a, m112a) && this.b > 30000) || this.b > 5400000) {
                c();
            }
            this.f466a = m112a;
            if (this.f462a == 0) {
                this.f462a = elapsedRealtime;
            }
            if (this.f464a.m698c()) {
                this.f9106c = elapsedRealtime;
            }
        }
    }

    @Override // com.xiaomi.push.gs
    public void b(gp gpVar) {
        m405a();
        this.f9106c = SystemClock.elapsedRealtime();
        ge.a(0, fx.CONN_SUCCESS.a(), gpVar.mo438a(), gpVar.a());
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar) {
        this.a = 0;
        this.f465a = null;
        this.f463a = gpVar;
        this.f466a = ax.m112a((Context) this.f464a);
        ge.a(0, fx.CONN_SUCCESS.a());
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar, int i, Exception exc) {
        long j;
        if (this.a == 0 && this.f465a == null) {
            this.a = i;
            this.f465a = exc;
            ge.b(gpVar.mo438a(), exc);
        }
        if (i == 22 && this.f9106c != 0) {
            long m436a = gpVar.m436a() - this.f9106c;
            if (m436a < 0) {
                m436a = 0;
            }
            this.f9107d += m436a + (gv.b() / 2);
            this.f9106c = 0L;
        }
        m405a();
        int myUid = Process.myUid();
        long j2 = -1;
        try {
            j2 = TrafficStats.getUidRxBytes(myUid);
            j = TrafficStats.getUidTxBytes(myUid);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("Failed to obtain traffic data: " + e2);
            j = -1L;
        }
        StringBuilder M = e.a.a.a.a.M("Stats rx=");
        M.append(j2 - this.f9109f);
        M.append(", tx=");
        M.append(j - this.f9108e);
        com.xiaomi.channel.commonutils.logger.c.c(M.toString());
        this.f9109f = j2;
        this.f9108e = j;
    }

    @Override // com.xiaomi.push.gs
    public void a(gp gpVar, Exception exc) {
        ge.a(0, fx.CHANNEL_CON_FAIL.a(), 1, gpVar.mo438a(), ax.b(this.f464a) ? 1 : 0);
        m405a();
    }
}
