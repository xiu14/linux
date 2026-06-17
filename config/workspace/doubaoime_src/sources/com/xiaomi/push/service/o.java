package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.gv;
import com.xiaomi.push.hs;
import com.xiaomi.push.hy;
import com.xiaomi.push.hz;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o implements r {

    /* renamed from: a, reason: collision with other field name */
    private long f1127a;

    /* renamed from: a, reason: collision with other field name */
    private final Context f1128a;

    /* renamed from: a, reason: collision with other field name */
    private final SharedPreferences f1129a;

    /* renamed from: b, reason: collision with other field name */
    private final boolean f1135b;

    /* renamed from: c, reason: collision with other field name */
    private final boolean f1136c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9344d;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicInteger f1131a = new AtomicInteger(0);

    /* renamed from: a, reason: collision with other field name */
    private String f1130a = null;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f1132a = false;

    /* renamed from: b, reason: collision with other field name */
    private String f1133b = null;

    /* renamed from: b, reason: collision with other field name */
    private final AtomicInteger f1134b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f9343c = new AtomicInteger(0);
    private int a = -1;
    private long b = -1;

    private static class a {
        public static String a() {
            return "support_wifi_digest";
        }

        public static String a(String str) {
            return String.format("HB_%s", str);
        }

        public static String b() {
            return "record_support_wifi_digest_reported_time";
        }

        public static String b(String str) {
            return String.format("HB_dead_time_%s", str);
        }

        public static String c() {
            return "record_hb_count_start";
        }

        public static String d() {
            return "record_short_hb_count";
        }

        public static String e() {
            return "record_long_hb_count";
        }

        public static String f() {
            return "record_hb_change";
        }

        public static String g() {
            return "record_mobile_ptc";
        }

        public static String h() {
            return "record_wifi_ptc";
        }

        public static String i() {
            return "record_ptc_start";
        }

        public static String j() {
            return "keep_short_hb_effective_time";
        }
    }

    o(Context context) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HB", "Use stable strategy.");
        this.f1128a = context;
        this.f1136c = com.xiaomi.push.k.m655a(context);
        this.f1135b = aq.a(context).a(hz.IntelligentHeartbeatSwitchBoolean.a(), true);
        this.f9344d = m808g();
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f1129a = sharedPreferences;
        long currentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(a.c(), -1L) == -1) {
            sharedPreferences.edit().putLong(a.c(), currentTimeMillis).apply();
        }
        long j = sharedPreferences.getLong(a.i(), -1L);
        this.f1127a = j;
        if (j == -1) {
            this.f1127a = currentTimeMillis;
            sharedPreferences.edit().putLong(a.i(), currentTimeMillis).apply();
        }
    }

    private void b(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = this.f1130a;
            if (str2 == null || !str2.startsWith("W-")) {
                if (this.f9344d) {
                    this.f1130a = "W-NETWORK_ID_WIFI_DEFAULT";
                } else {
                    this.f1130a = null;
                }
            }
        } else {
            this.f1130a = str;
        }
        int i = this.f1129a.getInt(a.a(this.f1130a), -1);
        long j = this.f1129a.getLong(a.b(this.f1130a), -1L);
        long currentTimeMillis = System.currentTimeMillis();
        if (i != -1) {
            if (j == -1) {
                this.f1129a.edit().putLong(a.b(this.f1130a), currentTimeMillis + f()).apply();
            } else if (currentTimeMillis > j) {
                this.f1129a.edit().remove(a.a(this.f1130a)).remove(a.b(this.f1130a)).apply();
            }
        }
        this.f1131a.getAndSet(0);
        if (TextUtils.isEmpty(this.f1130a) || b() != -1) {
            this.f1132a = false;
        } else {
            this.f1132a = true;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a(String.format("[HB] network changed, netid:%s, %s", this.f1130a, Boolean.valueOf(this.f1132a)));
    }

    private void g() {
        if (this.f1129a.getBoolean(a.a(), false)) {
            return;
        }
        this.f1129a.edit().putBoolean(a.a(), true).apply();
    }

    private void h() {
        int i = this.a;
        String h = i != 0 ? i != 1 ? null : a.h() : a.g();
        if (TextUtils.isEmpty(h)) {
            return;
        }
        if (this.f1129a.getLong(a.i(), -1L) == -1) {
            this.f1127a = System.currentTimeMillis();
            this.f1129a.edit().putLong(a.i(), this.f1127a).apply();
        }
        this.f1129a.edit().putInt(h, this.f1129a.getInt(h, 0) + 1).apply();
    }

    private void i() {
        int i;
        String[] split;
        String[] split2;
        if (c()) {
            String string = this.f1129a.getString(a.f(), null);
            char c2 = 1;
            char c3 = 0;
            if (!TextUtils.isEmpty(string) && (split = string.split("###")) != null) {
                int i2 = 0;
                while (i2 < split.length) {
                    if (!TextUtils.isEmpty(split[i2]) && (split2 = split[i2].split(":::")) != null && split2.length >= 4) {
                        String str = split2[c3];
                        String str2 = split2[c2];
                        String str3 = split2[2];
                        String str4 = split2[3];
                        HashMap hashMap = new HashMap();
                        hashMap.put(NotificationCompat.CATEGORY_EVENT, "change");
                        hashMap.put("model", com.xiaomi.push.l.a());
                        hashMap.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, str2);
                        hashMap.put("net_name", str);
                        hashMap.put("interval", str3);
                        hashMap.put("timestamp", str4);
                        a("category_hb_change", null, hashMap);
                        com.xiaomi.channel.commonutils.logger.c.m15a("[HB] report hb changed events.");
                    }
                    i2++;
                    c2 = 1;
                    c3 = 0;
                }
                this.f1129a.edit().remove(a.f()).apply();
            }
            if (this.f1129a.getBoolean(a.a(), false)) {
                long j = this.f1129a.getLong(a.b(), 0L);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - j > 1296000000) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(NotificationCompat.CATEGORY_EVENT, "support");
                    hashMap2.put("model", com.xiaomi.push.l.a());
                    hashMap2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                    a("category_hb_change", null, hashMap2);
                    com.xiaomi.channel.commonutils.logger.c.m15a("[HB] report support wifi digest events.");
                    this.f1129a.edit().putLong(a.b(), currentTimeMillis).apply();
                }
            }
            if (m806e()) {
                int i3 = this.f1129a.getInt(a.d(), 0);
                int i4 = this.f1129a.getInt(a.e(), 0);
                if (i3 > 0 || i4 > 0) {
                    long j2 = this.f1129a.getLong(a.c(), -1L);
                    String valueOf = String.valueOf(235000);
                    String valueOf2 = String.valueOf(j2);
                    String valueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("interval", valueOf);
                        jSONObject.put("c_short", String.valueOf(i3));
                        jSONObject.put("c_long", String.valueOf(i4));
                        jSONObject.put("count", String.valueOf(i3 + i4));
                        jSONObject.put("start_time", valueOf2);
                        jSONObject.put("end_time", valueOf3);
                        String jSONObject2 = jSONObject.toString();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(NotificationCompat.CATEGORY_EVENT, "long_and_short_hb_count");
                        a("category_hb_count", jSONObject2, hashMap3);
                        com.xiaomi.channel.commonutils.logger.c.m15a("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f1129a.edit().putInt(a.d(), 0).putInt(a.e(), 0).putLong(a.c(), System.currentTimeMillis()).apply();
            }
            if (m807f()) {
                String valueOf4 = String.valueOf(this.f1127a);
                String valueOf5 = String.valueOf(System.currentTimeMillis());
                int i5 = this.f1129a.getInt(a.g(), 0);
                if (i5 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, "M");
                        jSONObject3.put("ptc", i5);
                        jSONObject3.put("start_time", valueOf4);
                        jSONObject3.put("end_time", valueOf5);
                        String jSONObject4 = jSONObject3.toString();
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put(NotificationCompat.CATEGORY_EVENT, "ptc_event");
                        a("category_lc_ptc", jSONObject4, hashMap4);
                        com.xiaomi.channel.commonutils.logger.c.m15a("[HB] report ping timeout count events of mobile network.");
                        this.f1129a.edit().putInt(a.g(), 0).apply();
                    } catch (Throwable unused2) {
                        i = 0;
                        this.f1129a.edit().putInt(a.g(), 0).apply();
                    }
                }
                i = 0;
                int i6 = this.f1129a.getInt(a.h(), i);
                if (i6 > 0) {
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, ExifInterface.LONGITUDE_WEST);
                        jSONObject5.put("ptc", i6);
                        jSONObject5.put("start_time", valueOf4);
                        jSONObject5.put("end_time", valueOf5);
                        String jSONObject6 = jSONObject5.toString();
                        HashMap hashMap5 = new HashMap();
                        hashMap5.put(NotificationCompat.CATEGORY_EVENT, "ptc_event");
                        a("category_lc_ptc", jSONObject6, hashMap5);
                        com.xiaomi.channel.commonutils.logger.c.m15a("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f1129a.edit().putInt(a.h(), 0).apply();
                }
                this.f1127a = System.currentTimeMillis();
                this.f1129a.edit().putLong(a.i(), this.f1127a).apply();
            }
        }
    }

    private void j() {
        a(com.xiaomi.push.ax.m110a());
    }

    @Override // com.xiaomi.push.service.r, com.xiaomi.push.fq
    public int a() {
        return 0;
    }

    @Override // com.xiaomi.push.service.r
    /* renamed from: a */
    public void mo356a() {
    }

    @Override // com.xiaomi.push.service.ae
    public synchronized void a(com.xiaomi.push.ay ayVar) {
        if (d()) {
            String str = null;
            if (ayVar == null) {
                b(null);
                this.a = -1;
            } else if (ayVar.a() == 0) {
                String m124b = ayVar.m124b();
                if (!TextUtils.isEmpty(m124b) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(m124b)) {
                    str = "M-" + m124b;
                }
                b(str);
                this.a = 0;
            } else {
                if (ayVar.a() != 1 && ayVar.a() != 6) {
                    b(null);
                    this.a = -1;
                }
                b("WIFI-ID-UNKNOWN");
                this.a = 1;
            }
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public long m809c() {
        int b;
        long b2 = gv.b();
        if (this.f1136c && !m805b() && ((aq.a(this.f1128a).a(hz.IntelligentHeartbeatSwitchBoolean.a(), true) || e() >= System.currentTimeMillis()) && (b = b()) != -1)) {
            b2 = b;
        }
        if (!TextUtils.isEmpty(this.f1130a) && !"WIFI-ID-UNKNOWN".equals(this.f1130a) && this.a == 1) {
            a(b2 < 300000);
        }
        this.b = b2;
        com.xiaomi.channel.commonutils.logger.c.m15a("[HB] ping interval:" + b2);
        return b2;
    }

    @Override // com.xiaomi.push.service.r
    /* renamed from: c */
    public void mo802c() {
    }

    @Override // com.xiaomi.push.service.q
    /* renamed from: d */
    public void mo803d() {
        if (d()) {
            this.f1133b = this.f1130a;
        }
    }

    @Override // com.xiaomi.push.service.q
    /* renamed from: e, reason: collision with other method in class */
    public void mo811e() {
        if (d()) {
            i();
            if (this.f1132a) {
                this.f1131a.getAndSet(0);
            }
        }
    }

    @Override // com.xiaomi.push.service.q
    /* renamed from: f, reason: collision with other method in class */
    public void mo812f() {
        if (d()) {
            h();
            if (this.f1132a && !TextUtils.isEmpty(this.f1130a) && this.f1130a.equals(this.f1133b)) {
                this.f1131a.getAndIncrement();
                com.xiaomi.channel.commonutils.logger.c.m15a("[HB] ping timeout count:" + this.f1131a);
                if (a()) {
                    StringBuilder M = e.a.a.a.a.M("[HB] change hb interval for net:");
                    M.append(this.f1130a);
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                    c(this.f1130a);
                    this.f1132a = false;
                    this.f1131a.getAndSet(0);
                    d(this.f1130a);
                }
            }
        }
    }

    /* renamed from: g, reason: collision with other method in class */
    private boolean m808g() {
        return aq.a(this.f1128a).a(hz.IntelligentHeartbeatForUnsupportWifiDigestBoolean.a(), true);
    }

    /* renamed from: d, reason: collision with other method in class */
    public long m810d() {
        return this.b;
    }

    private void d(String str) {
        String str2;
        String sb;
        if (c() && !TextUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = ExifInterface.LONGITUDE_WEST;
            } else if (!str.startsWith("M-")) {
                return;
            } else {
                str2 = "M";
            }
            String valueOf = String.valueOf(235000);
            String valueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder W = e.a.a.a.a.W(str, ":::", str2, ":::", valueOf);
            W.append(":::");
            W.append(valueOf2);
            String string = this.f1129a.getString(a.f(), null);
            if (TextUtils.isEmpty(string)) {
                sb = W.toString();
            } else {
                StringBuilder S = e.a.a.a.a.S(string, "###");
                S.append(W.toString());
                sb = S.toString();
            }
            this.f1129a.edit().putString(a.f(), sb).apply();
        }
    }

    private long e() {
        return this.f1129a.getLong(a.j(), -1L);
    }

    /* renamed from: e, reason: collision with other method in class */
    private boolean m806e() {
        long j = this.f1129a.getLong(a.c(), -1L);
        if (j == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j > currentTimeMillis || currentTimeMillis - j >= 259200000;
    }

    private void c(String str) {
        if (a(str)) {
            this.f1129a.edit().putInt(a.a(str), 235000).apply();
            this.f1129a.edit().putLong(a.b(this.f1130a), System.currentTimeMillis() + f()).apply();
        }
    }

    private long f() {
        return aq.a(this.f1128a).a(hz.ShortHeartbeatEffectivePeriodMsLong.a(), 7776000000L);
    }

    /* renamed from: f, reason: collision with other method in class */
    private boolean m807f() {
        if (this.f1127a == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f1127a;
        return j > currentTimeMillis || currentTimeMillis - j >= 259200000;
    }

    @Override // com.xiaomi.push.service.ae
    /* renamed from: a */
    public synchronized void mo800a(String str) {
        if (!TextUtils.isEmpty(str)) {
            g();
        }
        if (d() && !TextUtils.isEmpty(str)) {
            b("W-" + str);
        }
    }

    private boolean c() {
        return d() && aq.a(this.f1128a).a(hz.IntelligentHeartbeatDataCollectSwitchBoolean.a(), true) && com.xiaomi.push.o.China.name().equals(c.a(this.f1128a).a());
    }

    private boolean d() {
        return this.f1136c && (this.f1135b || this.f9344d || ((e() > System.currentTimeMillis() ? 1 : (e() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    /* renamed from: b, reason: collision with other method in class */
    private boolean m805b() {
        if (!TextUtils.isEmpty(this.f1130a)) {
            if (this.f1130a.startsWith("M-")) {
                if (!aq.a(this.f1128a).a(hz.IntelligentHeartbeatUseInMobileNetworkBoolean.a(), false)) {
                    return true;
                }
            } else if (this.f1130a.equals("W-NETWORK_ID_WIFI_DEFAULT") && !m808g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.push.service.r
    public void a(int i) {
        this.f1129a.edit().putLong(a.j(), System.currentTimeMillis() + (i * 1000)).apply();
    }

    private boolean a() {
        return this.f1131a.get() >= Math.max(aq.a(this.f1128a).a(hz.IntelligentHeartbeatNATCountInt.a(), 3), 3);
    }

    private int b() {
        if (TextUtils.isEmpty(this.f1130a)) {
            return -1;
        }
        try {
            return this.f1129a.getInt(a.a(this.f1130a), -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.xiaomi.push.service.r
    /* renamed from: b */
    public void mo357b() {
        j();
        com.xiaomi.push.t.m843a();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    @Override // com.xiaomi.push.fq
    /* renamed from: b */
    public long mo801b() {
        return m810d();
    }

    private void a(boolean z) {
        String e2;
        if (c()) {
            int incrementAndGet = (z ? this.f1134b : this.f9343c).incrementAndGet();
            Object[] objArr = new Object[2];
            objArr[0] = z ? "short" : "long";
            objArr[1] = Integer.valueOf(incrementAndGet);
            com.xiaomi.channel.commonutils.logger.c.b(String.format("[HB] %s ping interval count: %s", objArr));
            if (incrementAndGet >= 5) {
                if (z) {
                    e2 = a.d();
                } else {
                    e2 = a.e();
                }
                int i = this.f1129a.getInt(e2, 0) + incrementAndGet;
                this.f1129a.edit().putInt(e2, i).apply();
                Object[] objArr2 = new Object[2];
                objArr2[0] = z ? "short" : "long";
                objArr2[1] = Integer.valueOf(i);
                com.xiaomi.channel.commonutils.logger.c.m15a(String.format("[HB] accumulate %s hb count(%s) and write to file. ", objArr2));
                if (z) {
                    this.f1134b.set(0);
                } else {
                    this.f9343c.set(0);
                }
            }
        }
    }

    private void a(String str, String str2, Map<String, String> map) {
        hy hyVar = new hy();
        hyVar.d(str);
        hyVar.c("hb_name");
        hyVar.a("hb_channel");
        hyVar.a(1L);
        hyVar.b(str2);
        hyVar.a(false);
        hyVar.b(System.currentTimeMillis());
        hyVar.g(this.f1128a.getPackageName());
        hyVar.e("com.xiaomi.xmsf");
        if (map == null) {
            map = new HashMap<>();
        }
        String str3 = null;
        u m832a = v.m832a(this.f1128a);
        if (m832a != null && !TextUtils.isEmpty(m832a.f1155a)) {
            String[] split = m832a.f1155a.split("@");
            if (split.length > 0) {
                str3 = split[0];
            }
        }
        map.put("uuid", str3);
        map.put("model", com.xiaomi.push.l.a());
        map.put("avc", String.valueOf(com.xiaomi.push.k.b(this.f1128a)));
        map.put("pushBundleVc", String.valueOf(com.xiaomi.push.h.a(this.f1128a)));
        map.put("pvc", String.valueOf(BuildConfig.VERSION_CODE));
        map.put("cvc", String.valueOf(f.a()));
        hyVar.a(map);
        hs a2 = hs.a(this.f1128a);
        if (a2 != null) {
            a2.a(hyVar, this.f1128a.getPackageName());
        }
    }

    @Override // com.xiaomi.push.fq
    public long a() {
        return m809c();
    }
}
