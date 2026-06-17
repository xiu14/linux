package com.bytedance.android.input.basic.applog.impl;

import com.bytedance.android.input.basic.applog.api.AppDidChange;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.applog.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements g {
    public static final d a = new d();
    private static final List<com.bytedance.android.input.basic.applog.api.b> b = new CopyOnWriteArrayList();

    private d() {
    }

    @Override // com.bytedance.applog.g
    public void a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!z) {
            if (str2 == null || str2.length() == 0) {
                if (str4 == null || str4.length() == 0) {
                    if (str6 == null || str6.length() == 0) {
                        return;
                    }
                }
            }
        }
        Iterator<T> it2 = b.iterator();
        while (it2.hasNext()) {
            ((com.bytedance.android.input.basic.applog.api.b) it2.next()).a(str2, str4, str6);
        }
        AppDidChange.INSTANCE.notifyConfigChange(true);
    }

    @Override // com.bytedance.applog.g
    public void b(String str, String str2, String str3) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            if (str2 == null || str2.length() == 0) {
                if (str3 != null && str3.length() != 0) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
        }
        Iterator<T> it2 = b.iterator();
        while (it2.hasNext()) {
            ((com.bytedance.android.input.basic.applog.api.b) it2.next()).a(str, str2, str3);
        }
        AppDidChange.INSTANCE.notifyConfigChange(false);
    }

    @Override // com.bytedance.applog.g
    public void c(boolean z, JSONObject jSONObject) {
    }

    public final void d(com.bytedance.android.input.basic.applog.api.b bVar) {
        l.f(bVar, "listener");
        b.add(bVar);
        IAppLog.a aVar = IAppLog.a;
        String deviceId = aVar.getDeviceId();
        String h = aVar.h();
        String n = aVar.n();
        if (deviceId.length() == 0) {
            if (h.length() == 0) {
                if (n.length() == 0) {
                    return;
                }
            }
        }
        bVar.a(deviceId, h, n);
    }

    public final void e(com.bytedance.android.input.basic.applog.api.b bVar) {
        l.f(bVar, "listener");
        b.remove(bVar);
    }
}
