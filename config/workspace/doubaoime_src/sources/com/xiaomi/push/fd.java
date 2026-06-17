package com.xiaomi.push;

/* loaded from: classes2.dex */
public class fd extends ew {
    @Override // com.xiaomi.push.ew
    /* renamed from: a */
    public String mo373a() {
        return "UnSupportState";
    }

    @Override // com.xiaomi.push.ew
    /* renamed from: a */
    public void mo374a() {
        try {
            if (ev.a().m371a()) {
                ev.a().b(1);
                ev.a().a(1);
                if (m372a().m366a()) {
                    a(new ex(), "init");
                } else {
                    a(new fc(), "init");
                }
            }
        } catch (Throwable th) {
            e.a.a.a.a.w0("[UnSupportState]  exception occurred in unsupported state init, exception: ", th, "HwKaMgr");
        }
    }

    @Override // com.xiaomi.push.ew
    public void a(ew ewVar) {
    }

    @Override // com.xiaomi.push.ew
    public void b(ew ewVar) {
    }

    @Override // com.xiaomi.push.ew
    public void f() {
    }
}
