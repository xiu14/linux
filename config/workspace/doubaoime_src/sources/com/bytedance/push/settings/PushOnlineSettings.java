package com.bytedance.push.settings;

import com.xiaomi.clientreport.data.Config;
import java.util.Arrays;
import java.util.List;

@com.bytedance.push.settings.k.a(storageKey = "push_multi_process_config", supportMultiProcess = Config.DEFAULT_EVENT_ENCRYPTED)
/* loaded from: classes2.dex */
public interface PushOnlineSettings extends ISettings {
    public static final List<String> a = Arrays.asList("gif_sys_permission_page_settings", "google_custom_sys_dialog_config", "sys_settings_page_dialog_config");

    boolean A();

    boolean B();

    int D();

    boolean E();

    String F();

    boolean G();

    com.bytedance.push.settings.w.j H();

    com.bytedance.push.settings.v.a.b I();

    int J();

    boolean K();

    boolean L();

    com.bytedance.push.settings.z.a.b M();

    com.bytedance.push.settings.l.a.b N();

    com.bytedance.push.settings.m.a.b O();

    int Q();

    long R();

    int S();

    int T();

    long U();

    com.bytedance.push.settings.A.a.f V();

    boolean W();

    int X();

    boolean Y();

    com.bytedance.push.settings.w.h Z();

    boolean a0();

    boolean b();

    long c();

    boolean c0();

    com.bytedance.push.settings.C.b d();

    com.bytedance.push.settings.t.a.b d0();

    com.bytedance.push.settings.p.a.b e();

    String f();

    com.bytedance.push.settings.n.a.b getClientIntelligenceSettings();

    boolean h();

    boolean i();

    boolean j();

    long k();

    boolean l();

    long n();

    long o();

    com.bytedance.push.settings.w.f p();

    boolean q();

    com.bytedance.push.settings.u.d r();

    boolean s();

    boolean t();

    boolean u();

    com.bytedance.push.settings.w.c v();

    boolean w();

    boolean x();

    boolean y();

    long z();
}
