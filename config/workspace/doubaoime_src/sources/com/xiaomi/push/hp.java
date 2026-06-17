package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* loaded from: classes2.dex */
public class hp implements XMPushService.n {
    private static boolean a = false;

    /* renamed from: a, reason: collision with other field name */
    private int f568a;

    /* renamed from: a, reason: collision with other field name */
    private Context f569a;
    private boolean b;

    public hp(Context context) {
        this.f569a = context;
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* renamed from: a, reason: collision with other method in class */
    public void mo487a() {
        a(this.f569a);
        if (this.b && a()) {
            StringBuilder M = e.a.a.a.a.M("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:");
            M.append(System.currentTimeMillis());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            ht a2 = hs.a(this.f569a).a();
            if (a(a2)) {
                a = true;
                hq.a(this.f569a, a2);
            } else {
                StringBuilder M2 = e.a.a.a.a.M("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:");
                M2.append(System.currentTimeMillis());
                com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
            }
        }
    }

    private void a(Context context) {
        this.b = com.xiaomi.push.service.aq.a(context).a(hz.TinyDataUploadSwitch.a(), true);
        int a2 = com.xiaomi.push.service.aq.a(context).a(hz.TinyDataUploadFrequency.a(), 7200);
        this.f568a = a2;
        this.f568a = Math.max(60, a2);
    }

    private boolean a() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f569a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1L)) > ((long) this.f568a);
    }

    private boolean a(ht htVar) {
        if (!ax.m117a(this.f569a) || htVar == null || TextUtils.isEmpty(a(this.f569a.getPackageName())) || !new File(this.f569a.getFilesDir(), "tiny_data.data").exists() || a) {
            return false;
        }
        return !com.xiaomi.push.service.aq.a(this.f569a).a(hz.ScreenOnOrChargingTinyDataUploadSwitch.a(), false) || j.m616a(this.f569a) || j.m619b(this.f569a);
    }

    private String a(String str) {
        if ("com.xiaomi.xmsf".equals(str)) {
            return com.xiaomi.push.service.v.f1157a;
        }
        return this.f569a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    public static void a(boolean z) {
        a = z;
    }
}
