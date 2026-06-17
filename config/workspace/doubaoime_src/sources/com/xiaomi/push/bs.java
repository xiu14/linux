package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes2.dex */
public class bs implements Runnable {
    private bs() {
    }

    public static void a(Context context) {
        if (context == null || !"com.xiaomi.xmsf".equals(context.getPackageName())) {
            return;
        }
        a aVar = new a(context);
        if (aVar.m138a()) {
            new Thread(new bs()).start();
            aVar.m137a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x019b A[Catch: Exception -> 0x01cb, TRY_LEAVE, TryCatch #0 {Exception -> 0x01cb, blocks: (B:54:0x0193, B:56:0x019b), top: B:53:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bs.run():void");
    }

    private static class a {
        public SharedPreferences a;

        /* renamed from: a, reason: collision with other field name */
        private final String f155a = "dc_job_result_time_26";

        public a(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
            this.a = sharedPreferences;
            long j = sharedPreferences.getLong("dc_job_result_time_26", 0L);
            if (j <= 0 || j - System.currentTimeMillis() > 259200000) {
                this.a.edit().putLong("dc_job_result_time_26", a()).apply();
            }
        }

        private long a() {
            long currentTimeMillis = System.currentTimeMillis();
            Random random = new Random(currentTimeMillis);
            return (((currentTimeMillis / com.heytap.mcssdk.constant.a.f6888f) + 1) * com.heytap.mcssdk.constant.a.f6888f) + (random.nextInt(3) * 86400000) + random.nextInt(46800000);
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m138a() {
            return System.currentTimeMillis() - this.a.getLong("dc_job_result_time_26", 0L) > 0;
        }

        private a() {
        }

        /* renamed from: a, reason: collision with other method in class */
        public void m137a() {
            long j = this.a.getLong("dc_job_result_time_26", 0L);
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (currentTimeMillis >= 0) {
                this.a.edit().putLong("dc_job_result_time_26", (((currentTimeMillis / 259200000) + 1) * 259200000) + j).apply();
            }
        }
    }

    private void a(bo boVar, bn bnVar, Exception exc) {
        HashMap hashMap = new HashMap();
        String m833a = com.xiaomi.push.service.v.m833a(t.m841a());
        if (!TextUtils.isEmpty(m833a)) {
            hashMap.put("uuid", m833a);
        }
        hashMap.put("appCount", Long.valueOf(boVar.m135a()));
        hashMap.put("channels", Long.valueOf(boVar.b()));
        hashMap.put("packCount", Long.valueOf(boVar.c()));
        hashMap.put("totalSize", Long.valueOf(boVar.d()));
        hashMap.put("isBatch", Integer.valueOf(boVar.a()));
        hashMap.put("maxCallTime", Long.valueOf(bnVar.a()));
        hashMap.put("minCallTime", Long.valueOf(bnVar.b()));
        hashMap.put("callAvg", Long.valueOf(bnVar.c()));
        hashMap.put("duration", Long.valueOf(bnVar.d()));
        if (exc != null) {
            hashMap.put("exception", exc.toString());
        }
        fw.a().a("app_switch_upload", hashMap);
    }

    private void a(Context context, br brVar, bo boVar) {
        hy hyVar = new hy();
        hyVar.d("category_app_channel_info");
        hyVar.c("app_channel_info");
        hyVar.b(brVar.toString());
        hyVar.a(false);
        hyVar.a(1L);
        hyVar.a("xmsf_channel");
        hyVar.b(System.currentTimeMillis());
        hyVar.g("com.xiaomi.xmsf");
        hyVar.e("com.xiaomi.xmsf");
        hyVar.f(com.xiaomi.push.service.bl.a());
        com.xiaomi.push.service.bm.a(context, hyVar);
    }
}
