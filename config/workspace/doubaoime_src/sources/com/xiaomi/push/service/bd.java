package com.xiaomi.push.service;

import com.xiaomi.push.gd;
import com.xiaomi.push.service.XMPushService.e;
import java.util.Objects;

/* loaded from: classes2.dex */
class bd {

    /* renamed from: d, reason: collision with root package name */
    private static int f9333d = 300000;

    /* renamed from: a, reason: collision with other field name */
    private final long f1075a;

    /* renamed from: a, reason: collision with other field name */
    private XMPushService f1076a;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f9334c = 0;
    private int a = 500;

    /* renamed from: b, reason: collision with other field name */
    private long f1077b = 0;

    public bd(XMPushService xMPushService) {
        this.f1076a = xMPushService;
        if ("com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
            this.f1075a = 230000L;
            return;
        }
        if (com.xiaomi.push.t.m848d()) {
            this.f1075a = 175000L;
        } else if (com.xiaomi.push.t.m847c()) {
            this.f1075a = 175000L;
        } else {
            this.f1075a = 310000L;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m778a() {
        this.f1077b = System.currentTimeMillis();
        this.f1076a.a(1);
        this.b = 0;
    }

    public void a(boolean z) {
        if (!this.f1076a.m693a()) {
            com.xiaomi.channel.commonutils.logger.c.c("should not reconnect as no client or network.");
            return;
        }
        if (z) {
            if (!this.f1076a.m694a(1)) {
                this.b++;
            }
            this.f1076a.a(1);
            com.xiaomi.channel.commonutils.logger.c.m16a("ReconnectionManager", "-->tryReconnect(): exec ConnectJob");
            XMPushService xMPushService = this.f1076a;
            Objects.requireNonNull(xMPushService);
            xMPushService.a(xMPushService.new e());
            return;
        }
        if (this.f1076a.m694a(1)) {
            return;
        }
        int a = a();
        this.b++;
        com.xiaomi.channel.commonutils.logger.c.m15a("schedule reconnect in " + a + "ms");
        XMPushService xMPushService2 = this.f1076a;
        Objects.requireNonNull(xMPushService2);
        xMPushService2.a(xMPushService2.new e(), (long) a);
        if (this.b == 2 && gd.m406a().m411a()) {
            af.b();
        }
        if (this.b == 3) {
            af.a();
        }
    }

    private int a() {
        double d2;
        if (this.b > 8) {
            return 300000;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        int i = this.b;
        if (i > 4) {
            d2 = 60000.0d;
        } else {
            if (i <= 1) {
                if (this.f1077b == 0) {
                    return 0;
                }
                if (System.currentTimeMillis() - this.f1077b < this.f1075a) {
                    int i2 = this.a;
                    int i3 = f9333d;
                    if (i2 >= i3) {
                        return i2;
                    }
                    int i4 = this.f9334c + 1;
                    this.f9334c = i4;
                    if (i4 >= 4) {
                        return i3;
                    }
                    this.a = (int) (i2 * 1.5d);
                    return i2;
                }
                this.a = 1000;
                this.f9334c = 0;
                return 0;
            }
            d2 = 10000.0d;
        }
        return (int) (random * d2);
    }
}
