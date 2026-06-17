package com.bytedance.push.settings;

import com.xiaomi.clientreport.data.Config;
import java.util.Map;

@com.bytedance.push.settings.k.a(storageKey = "push_multi_process_config", supportMultiProcess = Config.DEFAULT_EVENT_ENCRYPTED)
/* loaded from: classes2.dex */
public interface LocalSettings extends ILocalSettings {
    boolean A();

    int B0();

    long C();

    void C0(long j);

    void D(Map<String, com.bytedance.push.settings.w.d> map);

    boolean G();

    void I(int i);

    long J();

    boolean O();

    String P();

    Map<String, com.bytedance.push.settings.w.d> U();

    void V(com.bytedance.push.settings.l.a.c cVar);

    com.bytedance.push.settings.A.a.c X();

    int a();

    void b0(boolean z);

    void d0(boolean z);

    void f0(long j);

    String h0();

    boolean i();

    int j();

    void k(int i);

    void k0(String str);

    void l(boolean z);

    void m(int i);

    String m0();

    String n();

    void n0(long j);

    void o0(com.bytedance.push.settings.A.a.c cVar);

    void p(String str);

    long p0();

    boolean r();

    void t0(String str);

    boolean v0();

    void w(String str);

    void x0(int i);

    com.bytedance.push.settings.l.a.c y();
}
