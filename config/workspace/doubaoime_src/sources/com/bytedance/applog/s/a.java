package com.bytedance.applog.s;

import com.bytedance.applog.monitor.MonitorKey;

/* loaded from: classes.dex */
public class a implements b {
    private final com.bytedance.applog.c a;

    public a(com.bytedance.applog.c cVar) {
        this.a = cVar;
    }

    @Override // com.bytedance.applog.s.b
    public boolean a() {
        return this.a.v() == null;
    }

    @Override // com.bytedance.applog.s.b
    public boolean b(MonitorKey monitorKey, String str, String str2) {
        if (this.a.v() == null) {
            return false;
        }
        return !this.a.v().a(monitorKey.name(), str, str2);
    }
}
