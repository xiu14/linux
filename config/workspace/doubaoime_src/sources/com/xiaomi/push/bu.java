package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ah;

/* loaded from: classes2.dex */
public class bu extends ah.a {
    private Context a;

    public bu(Context context) {
        this.a = context;
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.a).m26a().isPerfUploadSwitchOpen();
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo139a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                com.xiaomi.clientreport.manager.a.a(this.a).c();
                com.xiaomi.channel.commonutils.logger.c.c(this.a.getPackageName() + " perf begin upload");
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.d("fail to send perf data. " + e2);
        }
    }
}
