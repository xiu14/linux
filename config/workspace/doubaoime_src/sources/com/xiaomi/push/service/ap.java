package com.xiaomi.push.service;

import android.content.Context;
import android.util.Pair;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ah;
import com.xiaomi.push.ia;
import java.util.List;

/* loaded from: classes2.dex */
public class ap extends ah.a {
    private final Context a;

    public ap(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo139a() {
        return "28";
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = this.a;
        if (context == null) {
            return;
        }
        if (!com.xiaomi.push.k.m655a(context)) {
            com.xiaomi.channel.commonutils.logger.c.m19a("OcUpdateReportJob", "not xmsf package, not run");
            return;
        }
        aq.a(this.a).a(0, (List<Pair<ia, Integer>>) null, -1);
        try {
            this.a.getSharedPreferences("mipush_oc_update_cache", 0).edit().putLong("oc_last_schedule_report_time", System.currentTimeMillis()).apply();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.b("OcUpdateReportJob", "update oc schedule report time error", e2.getMessage());
        }
        com.xiaomi.push.ah.a(this.a).m96a(mo139a());
        com.xiaomi.push.ah.a(this.a).b(this, RemoteMessageConst.MAX_TTL);
    }
}
