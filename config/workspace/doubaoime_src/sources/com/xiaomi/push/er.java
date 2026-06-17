package com.xiaomi.push;

import com.xiaomi.push.ev;
import com.xiaomi.push.service.aq;
import java.net.Socket;

/* loaded from: classes2.dex */
public class er {

    private static class a {
        private static final er a = new er();
    }

    public static er a() {
        return a.a;
    }

    public void b() {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[socket] receive message");
        eu.a().m369c();
    }

    public void c() {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[ping] start ping action");
        eu.a().d();
    }

    public void d() {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[ping] stop ping action");
        eu.a().e();
    }

    public void e() {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "modem keep alive function fail too much.");
        eu.a().f();
    }

    public void f() {
        es.a().c();
    }

    private er() {
        try {
            boolean m371a = ev.a().m371a();
            if (m371a) {
                ev.a().a(new ev.b() { // from class: com.xiaomi.push.er.1
                    @Override // com.xiaomi.push.ev.b
                    public void a(String str) {
                        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Modem Callback] onTcpKaInd, result=" + str);
                        if ("KEEP_ALIVE_RESULT_OK".equals(str)) {
                            eu.a().a(str);
                            es.a().d();
                        } else {
                            String m364a = eu.a().m364a();
                            eu.a().b(str);
                            es.a().a(str, m364a);
                            es.a().b(m364a, "modemKeepAliveCallbackError");
                            es.a().e();
                        }
                        ep.a().a(str);
                    }
                });
                com.xiaomi.push.service.aq.a(t.m841a()).a(new aq.a(hz.MdKaSwitch.a(), "MdKaSwitch") { // from class: com.xiaomi.push.er.2
                    @Override // com.xiaomi.push.service.aq.a
                    protected void onCallback() {
                        boolean b = et.b();
                        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[config] config is change. isMdKaCloudEnabled:" + b);
                        eu.a().b(b);
                    }
                });
                eu.a().m365a();
                a(ax.m110a());
            }
            es.a().a(m371a);
        } catch (Throwable th) {
            e.a.a.a.a.w0("[init]  exception occurred when HwKaManager init, exception: ", th, "HwKaMgr");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m358a() {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[socket] send message");
        eu.a().m368b();
    }

    public void b(boolean z) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "update fall down state: " + z);
        eu.a().d(z);
    }

    public void a(Socket socket) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[socket] socket connected");
        eu.a().a(socket);
    }

    public void a(int i, Exception exc) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[socket] socket is closed.reason:" + i + " exception:" + exc);
        eu.a().a(i, exc, ax.m116a());
    }

    public void a(ay ayVar) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[network] network change");
        eu.a().a(ayVar);
    }

    public void a(boolean z) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "super power mode is changed. enable:" + z);
        eu.a().a(z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m359a() {
        return eu.a().m366a();
    }
}
