package com.xiaomi.push;

/* loaded from: classes2.dex */
public class fb extends ew {
    @Override // com.xiaomi.push.ew
    /* renamed from: a */
    public String mo373a() {
        return "PreMonitorState";
    }

    @Override // com.xiaomi.push.ew
    public void a(int i, Exception exc, boolean z) {
        a(new fc(), z ? "socketClosedHasMobileNet" : "socketClosedNoMobileNet");
    }

    @Override // com.xiaomi.push.ew
    public void a(ew ewVar) {
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
    public void a(boolean z) {
        if (z) {
            a(new fc(), "superPowerModeChange");
        }
    }

    @Override // com.xiaomi.push.ew
    public void b(ew ewVar) {
        int a = ev.a().a(m375b(), a(), m377c(), b(), 1);
        if (a == 0) {
            a(new ez(), "startTcpMonitorRegisterOk");
            ep.a().k();
            return;
        }
        h();
        a(new ex(), "startTcpMonitorRegisterError");
        es.a().a("startTcpMonitorRegisterError", a);
        ep.a().l();
        es.a().b(mo373a(), "startTcpMonitorRegisterError");
    }
}
