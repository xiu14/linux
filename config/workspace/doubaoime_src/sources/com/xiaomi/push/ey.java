package com.xiaomi.push;

import java.net.Socket;

/* loaded from: classes2.dex */
public class ey extends ew {
    @Override // com.xiaomi.push.ew
    /* renamed from: a */
    public String mo373a() {
        return "KeepAliveState";
    }

    @Override // com.xiaomi.push.ew
    public void a(Socket socket) {
        a(new ex(), "socketConnected");
    }

    @Override // com.xiaomi.push.ew
    /* renamed from: b */
    public void mo376b() {
        a(new ex(), "socketSendMsg");
    }

    @Override // com.xiaomi.push.ew
    public void b(ew ewVar) {
    }

    @Override // com.xiaomi.push.ew
    /* renamed from: c */
    public void mo378c() {
        a(new ex(), "socketReceiveMsg");
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
    public void a(int i, Exception exc, boolean z) {
        String str = z ? "socketClosedHasMobileNet" : "socketClosedNoMobileNet";
        a(new fc(), str);
        if (z) {
            es.a().a(i, exc, mo373a());
            es.a().b(mo373a(), str);
            es.a().e();
            ep.a().d();
        }
    }

    @Override // com.xiaomi.push.ew
    public void b(boolean z) {
        if (z) {
            return;
        }
        a(new fc(), "configChange");
    }

    @Override // com.xiaomi.push.ew
    public void c(boolean z) {
        if (z) {
            return;
        }
        a(new fc(), "mobileNetworkDisconnected");
    }

    @Override // com.xiaomi.push.ew
    public void b(String str) {
        h();
        a(new ex(), "modemKeepAliveCallbackError");
    }

    @Override // com.xiaomi.push.ew
    public void a(boolean z) {
        if (z) {
            a(new fc(), "superPowerModeChange");
        }
    }

    @Override // com.xiaomi.push.ew
    public void a(ew ewVar) {
        ev.a().b(1);
        ev.a().a(1);
    }
}
