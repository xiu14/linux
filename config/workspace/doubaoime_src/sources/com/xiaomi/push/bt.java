package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ah;

/* loaded from: classes2.dex */
public class bt extends ah.a {
    private Context a;

    public bt(Context context) {
        this.a = context;
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.a).m26a().isEventUploadSwitchOpen();
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a, reason: collision with other method in class */
    public String mo139a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                com.xiaomi.channel.commonutils.logger.c.c(this.a.getPackageName() + " begin upload event");
                com.xiaomi.clientreport.manager.a.a(this.a).m28b();
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
        }
    }
}
