package com.bytedance.applog.util;

import com.bytedance.applog.m;
import com.bytedance.bdinstall.C0641v;

/* loaded from: classes.dex */
public class j {
    private static final m a;

    static {
        m.b bVar = new m.b();
        bVar.g(C0641v.h);
        bVar.j(new String[]{"https://log.zijieapi.com/service/2/app_log/", "https://applog.zijieapi.com/service/2/app_log/"});
        bVar.h("https://log.zijieapi.com/service/2/app_log_monitor/");
        bVar.i(new String[]{"https://rtlog.zijieapi.com/service/2/app_log/"});
        bVar.k("https://log.zijieapi.com/service/2/log_settings/");
        a = bVar.f();
    }

    public static final m a() {
        return a;
    }
}
