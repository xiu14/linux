package com.bytedance.applog.s;

import androidx.annotation.Nullable;
import com.bytedance.applog.monitor.MonitorKey;
import com.bytedance.applog.w.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements b {
    private final com.bytedance.applog.z.c a;
    private final com.bytedance.applog.q.c b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.bytedance.applog.z.b f3889c = null;

    public d(com.bytedance.applog.q.c cVar, com.bytedance.applog.z.c cVar2) {
        this.b = cVar;
        this.a = cVar2;
        int i = j.a;
    }

    public static d e(com.bytedance.applog.q.c cVar, JSONObject jSONObject, @Nullable d dVar, String str) {
        return jSONObject == null ? dVar : dVar == null ? new d(cVar, com.bytedance.applog.z.d.b(cVar.l(), str, jSONObject, null)) : new d(cVar, com.bytedance.applog.z.d.b(cVar.l(), str, jSONObject, dVar.a));
    }

    @Override // com.bytedance.applog.s.b
    public boolean a() {
        return !this.a.e();
    }

    @Override // com.bytedance.applog.s.b
    public boolean b(MonitorKey monitorKey, String str, String str2) {
        com.bytedance.applog.z.b bVar;
        if (!MonitorKey.event_v3.equals(monitorKey) && !MonitorKey.log_data.equals(monitorKey)) {
            return false;
        }
        com.bytedance.applog.z.c cVar = this.a;
        if (this.f3889c != null) {
            bVar = this.f3889c;
        } else {
            this.f3889c = new c(this);
            bVar = this.f3889c;
        }
        return cVar.f(bVar, str, str2);
    }

    public com.bytedance.applog.z.c d() {
        return this.a;
    }
}
