package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.ah;
import com.xiaomi.push.fw;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class au {
    private static final Object a = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Context context, String str, String str2, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("report_time", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("uuid", v.m833a(context));
        hashMap.put("s_count", Integer.valueOf(i));
        hashMap.put("s_msg_ids", str);
        hashMap.put("not_sure_msg_ids", str2);
        hashMap.put("not_sure_count", Integer.valueOf(i2));
        return hashMap;
    }

    static void a(final Context context, final int i, final String str, final String str2) {
        if (context == null) {
            return;
        }
        com.xiaomi.push.ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.service.au.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    synchronized (au.a) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("passthrough_wake", 0);
                        int i2 = sharedPreferences.getInt("success_count", 0);
                        String string = sharedPreferences.getString("success_msg_ids", "");
                        String string2 = sharedPreferences.getString("not_sure_msg_ids", "");
                        int i3 = sharedPreferences.getInt("not_sure_count", 0);
                        int i4 = i;
                        if (i4 == -1) {
                            Map<String, Object> b = au.b(context, string, string2, i2, i3);
                            au.b(b, context, str, str2);
                            fw.a().a("passthrough_wake", b);
                            sharedPreferences.edit().clear().apply();
                        } else if (i2 + i3 + 1 >= 20) {
                            if (i4 == 1) {
                                i2++;
                                string = string + str2 + ";";
                            } else if (i4 == 0) {
                                i3++;
                                string2 = string2 + str2 + ";";
                            }
                            fw.a().a("passthrough_wake", au.b(context, string, string2, i2, i3));
                            sharedPreferences.edit().clear().apply();
                        } else {
                            if (i4 == 1) {
                                i2++;
                                string = string + str2 + ";";
                            } else {
                                i3++;
                                string2 = string2 + str2 + ";";
                            }
                            sharedPreferences.edit().putString("success_msg_ids", string).putString("not_sure_msg_ids", string2).putInt("success_count", i2).putInt("not_sure_count", i3).apply();
                        }
                    }
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.c.b("PAT-Track", "Failed to record pass through awake data:", th);
                }
            }
        });
    }

    public static void a(final Context context) {
        if (context == null || com.xiaomi.push.ah.a(context).a(new ah.a() { // from class: com.xiaomi.push.service.au.2
            @Override // com.xiaomi.push.ah.a
            /* renamed from: a */
            public String mo139a() {
                return "awake_hour_job";
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (au.a) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("passthrough_wake", 0);
                    int i = sharedPreferences.getInt("success_count", 0);
                    String string = sharedPreferences.getString("success_msg_ids", "");
                    String string2 = sharedPreferences.getString("not_sure_msg_ids", "");
                    int i2 = sharedPreferences.getInt("not_sure_count", 0);
                    if (i != 0 || i2 != 0) {
                        fw.a().a("passthrough_wake", au.b(context, string, string2, i, i2));
                        sharedPreferences.edit().clear().apply();
                    }
                }
            }
        }, 3600)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.c("PAT-Track", "Failed to add passthrough repeat job");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Map<String, Object> map, Context context, String str, String str2) {
        if (str2 == null || context == null) {
            return;
        }
        map.put("failed_pkg", str);
        map.put("failed_permission", Integer.valueOf(com.xiaomi.push.h.a(str, context)));
        map.put("f_msg_id", str2);
    }
}
