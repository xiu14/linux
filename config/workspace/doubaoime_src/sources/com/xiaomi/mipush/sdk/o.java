package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.push.ah;
import com.xiaomi.push.hu;
import com.xiaomi.push.ia;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.it;
import com.xiaomi.push.je;
import com.xiaomi.push.service.aq;
import com.xiaomi.push.service.ar;

/* loaded from: classes2.dex */
public class o extends ah.a {
    private Context a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f66a = false;

    public o(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo139a() {
        return ExifInterface.GPS_MEASUREMENT_2D;
    }

    @Override // java.lang.Runnable
    public void run() {
        aq a = aq.a(this.a);
        im imVar = new im();
        if (this.f66a) {
            imVar.a(0);
            imVar.b(0);
        } else {
            imVar.a(ar.a(a, ia.MISC_CONFIG));
            imVar.b(ar.a(a, ia.PLUGIN_CONFIG));
        }
        it itVar = new it("-1", false);
        itVar.c(ie.DailyCheckClientConfig.f611a);
        itVar.a(je.a(imVar));
        com.xiaomi.channel.commonutils.logger.c.b("OcVersionCheckJob", "-->check version: checkMessage=", imVar);
        u.a(this.a).a((u) itVar, hu.Notification, (ih) null);
        try {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("mipush_oc_update_cache", 0);
            int i = sharedPreferences.getInt("oc_request_count", 0);
            if (i == Integer.MAX_VALUE) {
                com.xiaomi.channel.commonutils.logger.c.c("OcVersionCheckJob", "update request count error, count is max");
            }
            sharedPreferences.edit().putInt("oc_request_count", i + 1).apply();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.b("OcVersionCheckJob", "update request count error", e2.getMessage());
        }
    }
}
