package com.xiaomi.push;

import com.xiaomi.push.ah;
import java.net.Socket;

/* loaded from: classes2.dex */
public class ez extends ew {
    @Override // com.xiaomi.push.ew
    /* renamed from: a */
    public String mo373a() {
        return "MonitorState";
    }

    @Override // com.xiaomi.push.ew
    public void a(Socket socket) {
        a(new ex(), "socketConnected");
    }

    @Override // com.xiaomi.push.ew
    public void b(boolean z) {
        if (z) {
            return;
        }
        a(new fc(), "configChange");
    }

    @Override // com.xiaomi.push.ew
    /* renamed from: c */
    public void mo378c() {
        a(new fa(), "socketReceiveMsg");
    }

    @Override // com.xiaomi.push.ew
    public void d(boolean z) {
        if (z) {
            a(new fc(), "fallDownChange");
        }
    }

    @Override // com.xiaomi.push.ew
    public void e() {
        a(new fc(), "stopPing");
    }

    @Override // com.xiaomi.push.ew
    public void f() {
        a(new fc(), "failTooMuch");
    }

    @Override // com.xiaomi.push.ew
    public void g() {
        a(new ex(), "startModemKeepAliveTimeOut");
    }

    @Override // com.xiaomi.push.ew
    public void a(int i, Exception exc, boolean z) {
        String str = z ? "socketClosedHasMobileNet" : "socketClosedNoMobileNet";
        a(new fc(), str);
        if (z) {
            es.a().a(i, exc, mo373a());
            es.a().b(mo373a(), str);
            es.a().e();
        }
    }

    @Override // com.xiaomi.push.ew
    public void b(ew ewVar) {
        ah.a(t.m841a()).m96a("ka_timeout");
        ah.a(t.m841a()).b(new ah.a() { // from class: com.xiaomi.push.ez.1
            @Override // com.xiaomi.push.ah.a
            /* renamed from: a */
            public String mo139a() {
                return "ka_timeout";
            }

            @Override // java.lang.Runnable
            public void run() {
                ez.this.m372a().g();
            }
        }, 15);
        h();
    }

    @Override // com.xiaomi.push.ew
    public void c(boolean z) {
        if (z) {
            return;
        }
        a(new fc(), "mobileNetworkDisconnected");
    }

    @Override // com.xiaomi.push.ew
    public void a(boolean z) {
        if (z) {
            a(new fc(), "superPowerModeChange");
        }
    }

    @Override // com.xiaomi.push.ew
    public void a(ew ewVar) {
        if ((ewVar instanceof ey) || (ewVar instanceof fa)) {
            return;
        }
        ev.a().a(1);
        ah.a(t.m841a()).m96a("ka_timeout");
    }
}
