package com.xiaomi.push;

import java.net.Socket;

/* loaded from: classes2.dex */
public class fc extends ew {
    @Override // com.xiaomi.push.ew
    /* renamed from: a */
    public String mo373a() {
        return "UnAvailableState";
    }

    @Override // com.xiaomi.push.ew
    public void a(ew ewVar) {
    }

    @Override // com.xiaomi.push.ew
    public void a(Socket socket) {
        if (m372a().m366a()) {
            a(new ex(), "socketConnected");
        }
    }

    @Override // com.xiaomi.push.ew
    public void b(ew ewVar) {
    }

    @Override // com.xiaomi.push.ew
    public void b(boolean z) {
        if (z && m372a().m366a()) {
            a(new ex(), "configChange");
        }
    }

    @Override // com.xiaomi.push.ew
    public void c(boolean z) {
        if (z && m372a().m366a()) {
            a(new ex(), "mobileNetworkConnected");
        }
    }

    @Override // com.xiaomi.push.ew
    public void d() {
        if (m372a().m366a()) {
            a(new ex(), "startPing");
        }
    }

    @Override // com.xiaomi.push.ew
    public void a(boolean z) {
        if (z || !m372a().m366a()) {
            return;
        }
        a(new ex(), "superPowerModeChange");
    }

    @Override // com.xiaomi.push.ew
    public void d(boolean z) {
        if (z || !m372a().m366a()) {
            return;
        }
        a(new ex(), "fallDownChange");
    }
}
