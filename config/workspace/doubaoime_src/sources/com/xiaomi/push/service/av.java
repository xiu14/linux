package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.fw;
import com.xiaomi.push.ih;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class av {
    /* JADX INFO: Access modifiers changed from: private */
    public static void b(long j, Map<String, ?> map, SharedPreferences sharedPreferences) {
        if (map == null || sharedPreferences == null) {
            com.xiaomi.channel.commonutils.logger.c.c("PT-Track", "Cannot upload pass through data, because sp is null.");
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                int intValue = ((Integer) value).intValue();
                if (!"last_upload_time".equals(key) && !TextUtils.isEmpty(key)) {
                    String[] split = key.split(Constants.COLON_SEPARATOR);
                    if (split.length == 2 && ("awake".equals(split[1]) || "non_awake".equals(split[1]))) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("target_pkg", split[0]);
                        hashMap.put("awake", Boolean.valueOf("awake".equals(split[1])));
                        hashMap.put("cnt", Integer.valueOf(intValue));
                        fw.a().a("pt_stat_no_charge_and_screen_off", hashMap);
                    }
                }
            }
        }
        sharedPreferences.edit().clear().putLong("last_upload_time", j).apply();
    }

    static void a(final Context context, final String str, ih ihVar) {
        if (context == null || TextUtils.isEmpty(str) || ihVar == null || ihVar.m525a() == null) {
            return;
        }
        try {
            boolean b = com.xiaomi.push.ag.b(context);
            boolean c2 = com.xiaomi.push.ag.c(context);
            if (!b && !c2) {
                final boolean z = ihVar.m525a().containsKey("__check_alive") && Boolean.parseBoolean(ihVar.m525a().get("__awake"));
                com.xiaomi.push.ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.service.av.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            SharedPreferences sharedPreferences = context.getSharedPreferences("passthrough_stat", 0);
                            String b2 = av.b(str, z);
                            sharedPreferences.edit().putInt(b2, sharedPreferences.getInt(b2, 0) + 1).apply();
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = sharedPreferences.getLong("last_upload_time", 0L);
                            if (j == 0) {
                                sharedPreferences.edit().putLong("last_upload_time", currentTimeMillis).apply();
                            } else if (Math.abs(currentTimeMillis - j) >= com.heytap.mcssdk.constant.a.f6889g) {
                                Map<String, ?> all = sharedPreferences.getAll();
                                if (all != null && !all.isEmpty()) {
                                    av.b(currentTimeMillis, all, sharedPreferences);
                                }
                            }
                        } catch (Throwable th) {
                            e.a.a.a.a.w0("An unexpected exception occurred while record and upload pass through message: ", th, "PT-Track");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            e.a.a.a.a.w0("Failed to record pass through data: ", th, "PT-Track");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, boolean z) {
        StringBuilder S = e.a.a.a.a.S(str, Constants.COLON_SEPARATOR);
        S.append(z ? "awake" : "non_awake");
        return S.toString();
    }
}
