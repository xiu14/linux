package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes2.dex */
public abstract class gw extends gp {
    protected Exception a;

    /* renamed from: a, reason: collision with other field name */
    protected Socket f527a;
    protected XMPushService b;

    /* renamed from: c, reason: collision with root package name */
    private int f9119c;

    /* renamed from: c, reason: collision with other field name */
    String f528c;

    /* renamed from: d, reason: collision with root package name */
    private String f9120d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile long f9121e;

    /* renamed from: f, reason: collision with root package name */
    protected volatile long f9122f;

    /* renamed from: g, reason: collision with root package name */
    protected volatile long f9123g;
    private long h;

    public gw(XMPushService xMPushService, gq gqVar) {
        super(xMPushService, gqVar);
        this.a = null;
        this.f528c = null;
        this.f9121e = 0L;
        this.f9122f = 0L;
        this.f9123g = 0L;
        this.h = 0L;
        this.b = xMPushService;
    }

    public Context a() {
        return this.b;
    }

    /* renamed from: a */
    protected abstract void mo430a(boolean z);

    @Override // com.xiaomi.push.gp
    public void b(boolean z) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long currentTimeMillis = System.currentTimeMillis();
        mo430a(z);
        com.xiaomi.push.service.p.a(this.b).m816a();
        if (z) {
            return;
        }
        this.b.a(new XMPushService.j(13) { // from class: com.xiaomi.push.gw.1
            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                Thread.yield();
                if (!gw.this.m444d() || gw.this.a(elapsedRealtime)) {
                    return;
                }
                com.xiaomi.push.service.p.a(gw.this.b).c();
                dd.b(gw.this.b);
                gw.this.b.a(22, (Exception) null);
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                StringBuilder M = e.a.a.a.a.M("check the ping-pong.");
                M.append(currentTimeMillis);
                return M.toString();
            }
        }, com.heytap.mcssdk.constant.a.q);
    }

    public String c() {
        return ((gp) this).f512a;
    }

    public synchronized void e() {
        try {
            if (!m444d() && !m443c()) {
                a(0, 0, (Exception) null);
                a(((gp) this).f509a);
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("WARNING: current xmpp has connected");
        } catch (IOException e2) {
            throw new gx(e2);
        }
    }

    public void f() {
        this.f9121e = SystemClock.elapsedRealtime();
    }

    public void g() {
        this.f9122f = SystemClock.elapsedRealtime();
    }

    @Override // com.xiaomi.push.gp
    /* renamed from: a */
    public String mo438a() {
        return this.f9120d;
    }

    public void c(final int i, final Exception exc) {
        ax.m119b();
        this.b.a(new XMPushService.j(2) { // from class: com.xiaomi.push.gw.2
            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                gw.this.b.a(i, exc);
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                StringBuilder M = e.a.a.a.a.M("shutdown the connection. ");
                M.append(i);
                M.append(", ");
                M.append(exc);
                return M.toString();
            }
        });
    }

    protected synchronized void a(int i, Exception exc) {
        if (b() == 2) {
            return;
        }
        a(2, i, exc);
        ((gp) this).f512a = "";
        try {
            this.f527a.close();
        } catch (Throwable unused) {
        }
        this.f9121e = 0L;
        this.f9122f = 0L;
    }

    @Override // com.xiaomi.push.gp
    public void b(int i, Exception exc) {
        a(i, exc);
        if ((exc != null || i == 18) && this.f9123g != 0) {
            a(exc);
        }
    }

    protected void a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f9123g < 300000) {
            if (ax.m117a((Context) this.b)) {
                int i = this.f9119c + 1;
                this.f9119c = i;
                if (i >= 2) {
                    String mo438a = mo438a();
                    com.xiaomi.channel.commonutils.logger.c.m15a("max short conn time reached, sink down current host:" + mo438a);
                    a(mo438a, 0L, exc);
                    this.f9119c = 0;
                    return;
                }
                return;
            }
            return;
        }
        this.f9119c = 0;
    }

    protected void a(String str, long j, Exception exc) {
        cp a = ct.a().a(gq.a(), false);
        if (a != null) {
            a.b(str, j, 0L, exc);
            ct.a().m185c();
        }
    }

    @Override // com.xiaomi.push.gp
    public void a(gg[] ggVarArr) {
        throw new gx("Don't support send Blob");
    }

    private void a(gq gqVar) {
        a(gqVar.c(), gqVar.m445a());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gw.a(java.lang.String, int):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    protected synchronized void mo451a() {
    }

    /* renamed from: a, reason: collision with other method in class */
    public Socket m450a() {
        return new Socket();
    }

    cp a(final String str) {
        cp a = ct.a().a(str, false);
        if (!a.b()) {
            hn.a(new Runnable() { // from class: com.xiaomi.push.gw.3
                @Override // java.lang.Runnable
                public void run() {
                    ct.a().a(str, true);
                }
            });
        }
        return a;
    }
}
