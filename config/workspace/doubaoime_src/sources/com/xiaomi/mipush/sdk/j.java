package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class j {
    private static volatile j a;

    /* renamed from: a, reason: collision with other field name */
    private final Context f62a;

    private j(Context context) {
        this.f62a = context.getApplicationContext();
    }

    private static j a(Context context) {
        if (a == null) {
            synchronized (j.class) {
                if (a == null) {
                    a = new j(context);
                }
            }
        }
        return a;
    }

    public static void b(Context context, iq iqVar, Intent intent, boolean z) {
        a(context).a(iqVar, intent, 2, z);
    }

    public static void c(Context context, iq iqVar, Intent intent, boolean z) {
        a(context).a(iqVar, intent, 3, z);
    }

    public static void d(Context context, iq iqVar, Intent intent, boolean z) {
        a(context).a(iqVar, intent, 4, z);
    }

    public static void e(Context context, iq iqVar, Intent intent, boolean z) {
        a(context).a(iqVar, intent, 8, z);
    }

    public static void f(Context context, iq iqVar, Intent intent, boolean z) {
        b m41a = b.m41a(context);
        if (TextUtils.isEmpty(m41a.m49c()) || TextUtils.isEmpty(m41a.d())) {
            a(context).a(iqVar, intent, 6, z);
        } else if (m41a.m53f()) {
            a(context).a(iqVar, intent, 7, z);
        } else {
            a(context).a(iqVar, intent, 5, z);
        }
    }

    public static void a(Context context, iq iqVar, Intent intent, boolean z) {
        a(context).a(iqVar, intent, 1, z);
    }

    public static void a(Context context, String str, Intent intent, int i, boolean z, Throwable th) {
        a(context).a(str, intent, i, z, th, System.currentTimeMillis());
    }

    public static void a(Context context, Intent intent, int i, Throwable th) {
        if (intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
        a(context).a(intent.getStringExtra("messageId"), intent, i, booleanExtra, th, System.currentTimeMillis());
    }

    public static void a(Context context, iq iqVar, Intent intent, long j) {
        a(context).a(iqVar, intent, 0, true, j);
    }

    private void a(iq iqVar, Intent intent, int i, boolean z) {
        a(iqVar, intent, i, z, System.currentTimeMillis());
    }

    private void a(iq iqVar, Intent intent, int i, boolean z, long j) {
        if (com.xiaomi.push.k.m655a(this.f62a) || !com.xiaomi.push.k.m654a() || iqVar == null || iqVar.f731a != hu.SendMessage || iqVar.m558a() == null || !z) {
            return;
        }
        a(iqVar.m558a().m524a(), iqVar.f738b, iqVar.m559a(), intent, i, null, j);
    }

    private void a(String str, Intent intent, int i, boolean z, Throwable th, long j) {
        if (this.f62a == null || TextUtils.isEmpty(str) || com.xiaomi.push.k.m655a(this.f62a) || !com.xiaomi.push.k.m654a() || !z) {
            return;
        }
        a(str, this.f62a.getPackageName(), b.m41a(this.f62a).m42a(), intent, i, th, j);
    }

    private void a(String str, String str2, String str3, Intent intent, int i, Throwable th, long j) {
        try {
            com.xiaomi.channel.commonutils.logger.c.m15a("click to start activity result:" + i);
            it itVar = new it(str, false);
            itVar.c(ie.SDK_START_ACTIVITY.f611a);
            itVar.b(str3);
            itVar.d(str2);
            HashMap hashMap = new HashMap();
            itVar.f750a = hashMap;
            hashMap.put("result", String.valueOf(i));
            itVar.f750a.put(CrashHianalyticsData.TIME, String.valueOf(j));
            itVar.f750a.put("sdk_vc", String.valueOf(BuildConfig.VERSION_CODE));
            if (th != null) {
                itVar.f750a.put("sdk_pull_exception", String.valueOf(th));
            }
            if (intent != null) {
                long longExtra = intent.getLongExtra("nca_create_time", 0L);
                if (longExtra > 0) {
                    itVar.f750a.put("nca_create_time", String.valueOf(longExtra));
                }
                long longExtra2 = intent.getLongExtra("nca_resume_time", 0L);
                if (longExtra2 > 0) {
                    itVar.f750a.put("nca_resume_time", String.valueOf(longExtra2));
                }
                long longExtra3 = intent.getLongExtra("pmh_handle_time", 0L);
                if (longExtra3 > 0) {
                    itVar.f750a.put("pmh_handle_time", String.valueOf(longExtra3));
                }
            }
            try {
                u.a(this.f62a).a(itVar, hu.Notification, false, false, null, true, str2, str3, true, false);
            } catch (Throwable th2) {
                th = th2;
                com.xiaomi.channel.commonutils.logger.c.d("exception occurred in report pull result, exception: " + th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
