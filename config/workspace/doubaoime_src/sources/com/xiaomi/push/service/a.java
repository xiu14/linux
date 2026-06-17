package com.xiaomi.push.service;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.fw;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.il;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.je;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private long f990a;

    /* renamed from: a, reason: collision with other field name */
    private final SharedPreferences f991a;

    /* renamed from: a, reason: collision with other field name */
    private AtomicBoolean f992a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f993a;
    private int b;

    /* renamed from: b, reason: collision with other field name */
    private boolean f994b;

    /* renamed from: c, reason: collision with root package name */
    private int f9308c;

    /* renamed from: com.xiaomi.push.service.a$a, reason: collision with other inner class name */
    private static class C0413a {
        private static final a a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(XMPushService xMPushService) {
        if (m701a()) {
            this.f9308c = 0;
            SharedPreferences.Editor edit = this.f991a.edit();
            int i = this.b + 1;
            this.b = i;
            edit.putInt("info_restore_retry_cnt", i).apply();
            this.a = 0;
            a(xMPushService, "");
        }
    }

    public void b(XMPushService xMPushService) {
        c(xMPushService);
    }

    private a() {
        this.f992a = new AtomicBoolean();
        SharedPreferences sharedPreferences = com.xiaomi.push.t.m841a().getSharedPreferences("mipush", 0);
        this.f991a = sharedPreferences;
        this.f992a.set(sharedPreferences.getBoolean("app_info_restored", false));
        this.f990a = sharedPreferences.getLong("info_restore_last_req_time", 0L);
        this.b = sharedPreferences.getInt("info_restore_retry_cnt", 0);
        this.f993a = sharedPreferences.getBoolean("info_restore_partial_fail", false);
        this.f994b = sharedPreferences.getBoolean("info_restore_full_fail", false);
    }

    public static a a() {
        return C0413a.a;
    }

    private void b() {
        com.xiaomi.channel.commonutils.logger.c.c("AppInfoRestorer", "reportPartialFailEvent");
        fw.a().a("info_restore", a("partial_fail"));
    }

    public void a(final XMPushService xMPushService) {
        com.xiaomi.push.ah.a(xMPushService).a(new Runnable() { // from class: com.xiaomi.push.service.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.c(xMPushService);
                aa.b();
            }
        }, 5);
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m701a() {
        if (this.f992a.get()) {
            return false;
        }
        int i = this.b;
        if (i >= 10) {
            com.xiaomi.channel.commonutils.logger.c.c("AppInfoRestorer", "requestAppInfo, retry too much,  stop request");
            if (!this.f994b) {
                c();
                this.f994b = true;
                this.f991a.edit().putBoolean("info_restore_full_fail", true).apply();
            }
            return false;
        }
        if (i >= 5) {
            if (!this.f993a) {
                b();
                this.f993a = true;
                this.f991a.edit().putBoolean("info_restore_partial_fail", true).apply();
            }
            if (Math.abs(System.currentTimeMillis() - this.f990a) < com.heytap.mcssdk.constant.a.f6888f) {
                return false;
            }
        }
        return true;
    }

    private void b(il ilVar) {
        com.xiaomi.channel.commonutils.logger.c.c("AppInfoRestorer", "onRestoreLoopTooMuch");
        Map<String, Object> a = a("loop_too_much");
        a.put("message", ilVar == null ? "empty" : ilVar.toString());
        fw.a().a("info_restore", a);
    }

    private void c() {
        com.xiaomi.channel.commonutils.logger.c.c("AppInfoRestorer", "reportFullFailEvent");
        fw.a().a("info_restore", a("full_fail"));
    }

    private void a(XMPushService xMPushService, String str) {
        StringBuilder U = e.a.a.a.a.U("requestAppInfo, offsetFlag=", str, ", retryTimes=");
        U.append(this.b);
        com.xiaomi.channel.commonutils.logger.c.c("AppInfoRestorer", U.toString());
        this.f990a = System.currentTimeMillis();
        this.f991a.edit().putLong("info_restore_last_req_time", this.f990a).apply();
        it itVar = new it();
        itVar.c(ie.PushDataRecover.f611a);
        itVar.a(as.a());
        HashMap hashMap = new HashMap();
        itVar.f750a = hashMap;
        hashMap.put(TypedValues.CycleType.S_WAVE_OFFSET, str);
        int i = this.b;
        if (i > 1) {
            itVar.f750a.put("retry_times", String.valueOf(i - 1));
        }
        iq a = ab.a("com.xiaomi.xmsf", v.f1157a, itVar, hu.Notification);
        a.b(true);
        xMPushService.a("com.xiaomi.xmsf", je.a(a), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.xiaomi.push.service.XMPushService r8, com.xiaomi.push.il r9) {
        /*
            r7 = this;
            java.lang.String r0 = "onAppInfoRestored, notification id="
            java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
            java.lang.String r1 = r9.f694b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AppInfoRestorer"
            com.xiaomi.channel.commonutils.logger.c.m22b(r1, r0)
            int r0 = r7.f9308c
            r2 = 1
            int r0 = r0 + r2
            r7.f9308c = r0
            java.util.Map r0 = r9.m539a()
            r3 = 0
            if (r0 == 0) goto L86
            java.lang.String r4 = "offset"
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "data"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4b
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L4b
            boolean r0 = r7.m702a(r0)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = "onAppInfoRestored, mergeAppInfo result="
            java.lang.String r6 = e.a.a.a.a.A(r6, r0)
            r5[r3] = r6
            com.xiaomi.channel.commonutils.logger.c.c(r1, r5)
            goto L51
        L4b:
            java.lang.String r0 = "onAppInfoRestored, infoString or offset flag is null"
            com.xiaomi.channel.commonutils.logger.c.m16a(r1, r0)
            r0 = r3
        L51:
            if (r0 == 0) goto L86
            java.lang.String r0 = "END"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L78
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f992a
            r8.set(r2)
            android.content.SharedPreferences r8 = r7.f991a
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r0 = "app_info_restored"
            android.content.SharedPreferences$Editor r8 = r8.putBoolean(r0, r2)
            r8.apply()
            r7.m700a()
            java.lang.String r8 = "app info restore done"
            com.xiaomi.channel.commonutils.logger.c.m16a(r1, r8)
            goto L87
        L78:
            int r0 = r7.f9308c
            r1 = 100
            if (r0 < r1) goto L82
            r7.b(r9)
            goto L87
        L82:
            r7.a(r8, r4)
            goto L87
        L86:
            r2 = r3
        L87:
            if (r2 != 0) goto L8c
            r7.a(r9)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.a.a(com.xiaomi.push.service.XMPushService, com.xiaomi.push.il):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m702a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            SharedPreferences sharedPreferences = com.xiaomi.push.t.m841a().getSharedPreferences("mipush_apps_scrt", 0);
            SharedPreferences sharedPreferences2 = com.xiaomi.push.t.m841a().getSharedPreferences("pref_registered_pkg_names", 0);
            this.a += jSONArray.length();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(Constants.PACKAGE_NAME);
                String string2 = jSONObject.getString("secret");
                String string3 = jSONObject.getString("app_id");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                    if (TextUtils.isEmpty(sharedPreferences.getString(string, null))) {
                        sharedPreferences.edit().putString(string, string2).apply();
                    }
                    if (TextUtils.isEmpty(sharedPreferences2.getString(string, null))) {
                        sharedPreferences2.edit().putString(string, string3).apply();
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            com.xiaomi.channel.commonutils.logger.c.m16a("AppInfoRestorer", "failed to parse app info");
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m700a() {
        com.xiaomi.channel.commonutils.logger.c.c("AppInfoRestorer", "onRestoreSuccess");
        fw.a().a("info_restore", a("success"));
    }

    private void a(il ilVar) {
        com.xiaomi.channel.commonutils.logger.c.c("AppInfoRestorer", "onRestoreDataInvalid");
        Map<String, Object> a = a("invalid_data");
        a.put("message", ilVar == null ? "empty" : ilVar.toString());
        fw.a().a("info_restore", a);
    }

    private Map<String, Object> a(String str) {
        StringBuilder U = e.a.a.a.a.U("generateParamMap, eventType=", str, ", mRetryCnt=");
        U.append(this.b);
        U.append(", mLoopCnt=");
        U.append(this.f9308c);
        U.append(", mDataCnt=");
        U.append(this.a);
        com.xiaomi.channel.commonutils.logger.c.m16a("AppInfoRestorer", U.toString());
        HashMap hashMap = new HashMap();
        hashMap.put("type_str", str);
        hashMap.put("retry_cnt", Integer.valueOf(this.b));
        hashMap.put("loop_cnt", Integer.valueOf(this.f9308c));
        hashMap.put("data_cnt", Integer.valueOf(this.a));
        return hashMap;
    }
}
