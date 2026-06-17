package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.net.Socket;

/* loaded from: classes2.dex */
public abstract class ew {
    /* renamed from: a, reason: collision with other method in class */
    public abstract String mo373a();

    /* renamed from: a, reason: collision with other method in class */
    public void mo374a() {
    }

    public void a(int i, Exception exc, boolean z) {
    }

    public abstract void a(ew ewVar);

    public void a(ew ewVar, String str) {
        if (ewVar != null && !TextUtils.isEmpty(str)) {
            m372a().a(this, ewVar, str);
            return;
        }
        StringBuilder M = e.a.a.a.a.M("[");
        M.append(mo373a());
        M.append("] next state or event is null when setting state");
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", M.toString());
    }

    public void a(String str) {
    }

    public void a(Socket socket) {
    }

    public void a(boolean z) {
    }

    /* renamed from: b, reason: collision with other method in class */
    String m375b() {
        return eu.a().m367b();
    }

    /* renamed from: b, reason: collision with other method in class */
    public void mo376b() {
    }

    public abstract void b(ew ewVar);

    public void b(String str) {
    }

    public void b(boolean z) {
    }

    /* renamed from: c, reason: collision with other method in class */
    String m377c() {
        return eu.a().c();
    }

    /* renamed from: c, reason: collision with other method in class */
    public void mo378c() {
    }

    public void c(boolean z) {
    }

    public void d() {
    }

    public void d(boolean z) {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
        Context m841a = t.m841a();
        if (m841a == null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("[");
        M.append(mo373a());
        M.append("]  trigger a ping package");
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", M.toString());
        Intent intent = new Intent();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", "com.xiaomi.xmsf.push.service.XMPushService");
        intent.putExtra("mipush_app_package", "com.xiaomi.xmsf");
        intent.setAction(com.xiaomi.push.service.ay.r);
        m841a.startService(intent);
    }

    public static int c() {
        int b = gv.b();
        Context m841a = t.m841a();
        if (m841a == null) {
            return b;
        }
        int a = com.xiaomi.push.service.aq.a(m841a).a(hz.HWHeartbeatInterval.a(), b);
        if (210000 <= a && a <= b) {
            return a;
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "illegal ping interval. configInterval:" + a);
        return b;
    }

    int b() {
        return eu.a().b();
    }

    /* renamed from: a, reason: collision with other method in class */
    public eu m372a() {
        return eu.a();
    }

    int a() {
        return eu.a().m363a();
    }
}
