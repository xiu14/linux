package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.fw;
import com.xiaomi.push.gg;
import com.xiaomi.push.gp;
import com.xiaomi.push.gu;
import com.xiaomi.push.gz;
import com.xiaomi.push.hd;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class m implements r {
    private static final int a = e.EXPLORE.f1125a;

    /* renamed from: a, reason: collision with other field name */
    private static Boolean f1113a;

    /* renamed from: a, reason: collision with other field name */
    private long f1114a;

    /* renamed from: a, reason: collision with other field name */
    private final Context f1115a;

    /* renamed from: a, reason: collision with other field name */
    private final SharedPreferences f1116a;

    /* renamed from: a, reason: collision with other field name */
    private final gp f1117a;

    /* renamed from: a, reason: collision with other field name */
    private gu f1118a;

    /* renamed from: a, reason: collision with other field name */
    private d f1119a;

    /* renamed from: a, reason: collision with other field name */
    private String f1120a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f1121a;
    private int b = -1;

    /* renamed from: b, reason: collision with other field name */
    private String f1122b;

    private class a extends d {
        a() {
            super();
            String a = m.this.a("enter_stable_state_time");
            if (m.this.f1116a.contains(a)) {
                m.this.f1116a.edit().remove(a).apply();
            }
        }

        @Override // com.xiaomi.push.service.m.d
        /* renamed from: a, reason: collision with other method in class */
        public long mo804a() {
            return m.this.d();
        }

        @Override // com.xiaomi.push.service.q
        /* renamed from: e */
        public void mo811e() {
            if (m.this.f1121a) {
                return;
            }
            long mo804a = mo804a();
            m.this.f1116a.edit().putString(m.this.a("intervals"), m.this.a(m.this.f1116a.getString(m.this.a("intervals"), ""), mo804a)).apply();
            if (mo804a == 600000) {
                m.this.a(e.STABLE, 1);
            } else {
                m.this.f1116a.edit().putLong(m.this.a("heartbeat_interval"), mo804a + 30000).apply();
            }
        }

        @Override // com.xiaomi.push.service.q
        /* renamed from: f */
        public void mo812f() {
            long mo804a = mo804a();
            m.this.f1116a.edit().putString(m.this.a("intervals"), m.this.a(m.this.f1116a.getString(m.this.a("intervals"), ""), mo804a)).apply();
            if (mo804a > 180000) {
                m.this.f1116a.edit().putLong(m.this.a("heartbeat_interval"), mo804a - 30000).apply();
            }
            m.this.a(e.STABLE, 0);
        }

        @Override // com.xiaomi.push.service.m.d
        public int a() {
            return e.EXPLORE.f1125a;
        }
    }

    private class b implements gu {
        private b() {
        }

        @Override // com.xiaomi.push.gu
        public void a(hd hdVar) {
            m.this.f1121a = true;
        }

        @Override // com.xiaomi.push.gu
        public void a(gg ggVar) {
            if ("PING".equals(ggVar.m414a())) {
                return;
            }
            m.this.f1121a = true;
        }
    }

    private abstract class d implements q {
        private d() {
        }

        public abstract int a();

        /* renamed from: a */
        public abstract long mo804a();

        @Override // com.xiaomi.push.service.q
        /* renamed from: d */
        public void mo803d() {
        }
    }

    private enum e {
        UNKNOWN(-1),
        EXPLORE(0),
        STABLE(1);


        /* renamed from: a, reason: collision with other field name */
        private final int f1125a;

        e(int i) {
            this.f1125a = i;
        }
    }

    private class f extends d {
        private final long a;

        f() {
            super();
            if (m.this.b == 0) {
                this.a = 600000L;
            } else {
                this.a = 235000L;
            }
        }

        @Override // com.xiaomi.push.service.m.d
        /* renamed from: a */
        public long mo804a() {
            return this.a;
        }

        @Override // com.xiaomi.push.service.q
        /* renamed from: e */
        public void mo811e() {
        }

        @Override // com.xiaomi.push.service.q
        /* renamed from: f */
        public void mo812f() {
        }

        @Override // com.xiaomi.push.service.m.d
        public int a() {
            return e.UNKNOWN.f1125a;
        }
    }

    m(Context context, gp gpVar) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HB", "Use dynamic heartbeat strategy.");
        this.f1115a = context;
        this.f1117a = gpVar;
        this.f1116a = context.getSharedPreferences("dynamic_heartbeat_cache", 0);
    }

    private void g() {
        a(com.xiaomi.push.ax.m110a());
    }

    private void h() {
        if (this.f1116a.contains(a(WsConstants.KEY_CONNECTION_STATE)) && this.f1116a.contains(a("heartbeat_interval"))) {
            return;
        }
        this.f1116a.edit().putInt(a(WsConstants.KEY_CONNECTION_STATE), a).putLong(a("heartbeat_interval"), 180000L).apply();
    }

    private void i() {
        if (this.f1119a instanceof c) {
            HashMap hashMap = new HashMap(8);
            hashMap.put("interval", Long.valueOf(this.f1119a.mo804a()));
            a("stable_state_interval", hashMap);
        }
    }

    private void j() {
        a("timeout_in_min_hb_interval", (Map<String, Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long j = this.f1116a.getLong(a("timeout_in_min_hb_interval_upload_time"), 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - j) >= com.heytap.mcssdk.constant.a.f6888f) {
            j();
            this.f1116a.edit().putLong(a("timeout_in_min_hb_interval_upload_time"), currentTimeMillis).apply();
        }
    }

    @Override // com.xiaomi.push.service.r, com.xiaomi.push.fq
    public int a() {
        return 1;
    }

    @Override // com.xiaomi.push.service.r
    /* renamed from: a */
    public void mo356a() {
    }

    @Override // com.xiaomi.push.service.r
    public void a(int i) {
    }

    void b(gp gpVar) {
        gu guVar = this.f1118a;
        if (guVar == null) {
            return;
        }
        gpVar.a(guVar);
        gpVar.b(this.f1118a);
        this.f1118a = null;
    }

    @Override // com.xiaomi.push.service.r
    /* renamed from: c, reason: collision with other method in class */
    public void mo802c() {
        b(this.f1117a);
    }

    @Override // com.xiaomi.push.service.q
    /* renamed from: d, reason: collision with other method in class */
    public void mo803d() {
        this.f1122b = this.f1120a;
    }

    @Override // com.xiaomi.push.service.q
    /* renamed from: e */
    public void mo811e() {
        if (TextUtils.equals(this.f1120a, this.f1122b)) {
            a().mo811e();
        }
        this.f1121a = false;
    }

    @Override // com.xiaomi.push.service.q
    /* renamed from: f */
    public void mo812f() {
        if (TextUtils.equals(this.f1120a, this.f1122b)) {
            a().mo812f();
        }
        this.f1121a = false;
    }

    private long c() {
        return this.b != 0 ? 180000L : 600000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long d() {
        return a(this.f1116a.getLong(a("heartbeat_interval"), c()));
    }

    private class c extends d {
        private long a;

        private c() {
            super();
        }

        @Override // com.xiaomi.push.service.m.d
        /* renamed from: a */
        public long mo804a() {
            if (this.a == 0) {
                long d2 = m.this.d();
                if (d2 > 180000) {
                    this.a = d2 - com.heytap.mcssdk.constant.a.r;
                } else {
                    this.a = 180000L;
                }
            }
            return this.a;
        }

        @Override // com.xiaomi.push.service.q
        /* renamed from: e */
        public void mo811e() {
            if (m.this.f1121a) {
                return;
            }
            m.this.f1116a.edit().putInt(m.this.a("timeout_count"), 0).apply();
            if (m.this.f1116a.contains(m.this.a("intervals"))) {
                m.this.f1116a.edit().remove(m.this.a("intervals")).apply();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long d2 = m.this.d();
            if (Math.abs(currentTimeMillis - m.this.f1116a.getLong(m.this.a("enter_stable_state_time"), currentTimeMillis)) < 2592000000L || d2 >= 600000) {
                return;
            }
            m.this.f1116a.edit().putString(m.this.a("intervals"), String.valueOf(mo804a())).putLong(m.this.a("heartbeat_interval"), d2 + 30000).apply();
            m.this.a(e.EXPLORE, 2);
        }

        @Override // com.xiaomi.push.service.q
        /* renamed from: f */
        public void mo812f() {
            long mo804a = mo804a();
            m.this.f1116a.edit().putString(m.this.a("intervals"), m.this.a(m.this.f1116a.getString(m.this.a("intervals"), ""), mo804a)).apply();
            int i = m.this.f1116a.getInt(m.this.a("timeout_count"), 0) + 1;
            if (i < 3) {
                m.this.f1116a.edit().putInt(m.this.a("timeout_count"), i).apply();
            } else if (mo804a <= 180000) {
                m.this.f1116a.edit().putInt(m.this.a("timeout_count"), 0).remove(m.this.a("intervals")).apply();
                m.this.k();
            } else {
                m.this.f1116a.edit().putLong(m.this.a("heartbeat_interval"), 180000L).putInt(m.this.a("timeout_count"), 0).apply();
                m.this.a(e.EXPLORE, 0);
            }
        }

        @Override // com.xiaomi.push.service.m.d
        public int a() {
            return e.STABLE.f1125a;
        }
    }

    @Override // com.xiaomi.push.service.r
    /* renamed from: b */
    public void mo357b() {
        a(this.f1117a);
        g();
        com.xiaomi.push.t.m843a();
    }

    @Override // com.xiaomi.push.fq
    /* renamed from: b, reason: collision with other method in class */
    public long mo801b() {
        return this.f1114a;
    }

    private d b() {
        if (this.f1120a == null) {
            return new f();
        }
        h();
        if (this.f1116a.getInt(a(WsConstants.KEY_CONNECTION_STATE), a) != 1) {
            return new a();
        }
        return new c();
    }

    static boolean a(Context context) {
        if (f1113a == null) {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HB", "Stop check if device can use dynamic heartbeat strategy, because context is null.");
                return false;
            }
            String m833a = v.m833a(context);
            if (m833a == null) {
                f1113a = Boolean.FALSE;
            } else {
                int length = m833a.length();
                if (length < 3 || !TextUtils.isDigitsOnly(m833a)) {
                    f1113a = Boolean.FALSE;
                } else {
                    f1113a = Boolean.valueOf(m833a.charAt(length - 3) == '0');
                }
            }
        }
        return f1113a.booleanValue();
    }

    private static long a(long j) {
        if (j > 600000) {
            return 600000L;
        }
        if (j < 180000) {
            return 180000L;
        }
        return (j / 30000) * 30000;
    }

    void a(gp gpVar) {
        if (this.f1118a == null) {
            b bVar = new b();
            this.f1118a = bVar;
            gpVar.a(bVar, (gz) null);
            gpVar.b(this.f1118a, (gz) null);
        }
    }

    @Override // com.xiaomi.push.fq
    public long a() {
        long mo804a = a().mo804a();
        com.xiaomi.channel.commonutils.logger.c.m16a("HB", "ping interval: " + mo804a);
        this.f1114a = mo804a;
        return mo804a;
    }

    @Override // com.xiaomi.push.service.ae
    public synchronized void a(com.xiaomi.push.ay ayVar) {
        com.xiaomi.channel.commonutils.logger.c.m22b("HB", "network changed: " + ayVar);
        if (ayVar == null) {
            this.b = -1;
            this.f1120a = null;
            this.f1119a = b();
            return;
        }
        int a2 = ayVar.a();
        if (a2 == 0) {
            this.b = 0;
            this.f1120a = null;
        } else {
            if (a2 != 1 && ayVar.a() != 6) {
                this.b = -1;
                this.f1120a = null;
            }
            this.b = 1;
        }
        this.f1119a = b();
    }

    @Override // com.xiaomi.push.service.ae
    /* renamed from: a, reason: collision with other method in class */
    public synchronized void mo800a(String str) {
        com.xiaomi.channel.commonutils.logger.c.m22b("HB", "wifi changed: " + str);
        if (!TextUtils.isEmpty(str)) {
            this.f1120a = "W-" + str;
        } else {
            this.f1120a = null;
        }
        this.f1119a = b();
    }

    private d a() {
        if (this.f1119a == null) {
            this.f1119a = b();
        }
        return this.f1119a;
    }

    private void a(String str, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, Integer.valueOf(this.b));
        map.put("net_name", this.f1120a);
        map.put("uuid", v.m833a(this.f1115a));
        map.put("push_vc", Integer.valueOf(BuildConfig.VERSION_CODE));
        fw.a().a(str, map);
    }

    private void a(int i, int i2, int i3) {
        long mo804a = this.f1119a.mo804a();
        String string = this.f1116a.getString(a("intervals"), "");
        if (string.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap(8, 1.0f);
        hashMap.put("intervals", a(string, mo804a));
        hashMap.put("prev_state", Integer.valueOf(i));
        hashMap.put("next_state", Integer.valueOf(i2));
        hashMap.put("reason", Integer.valueOf(i3));
        a("heartbeat_state_change", hashMap);
        this.f1116a.edit().remove(a("intervals")).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, int i) {
        d dVar = this.f1119a;
        int a2 = dVar == null ? e.UNKNOWN.f1125a : dVar.a();
        if (a2 == eVar.f1125a) {
            StringBuilder N = e.a.a.a.a.N("change to the same state from ", a2, " to ");
            N.append(eVar.f1125a);
            com.xiaomi.channel.commonutils.logger.c.m16a("HB", N.toString());
        }
        this.f1116a.edit().putInt(a(WsConstants.KEY_CONNECTION_STATE), eVar.f1125a).apply();
        this.f1119a = b();
        a(a2, eVar.f1125a, i);
        String a3 = a("enter_stable_state_time");
        if (this.f1119a instanceof c) {
            i();
            this.f1116a.edit().putLong(a3, System.currentTimeMillis()).apply();
        } else {
            this.f1116a.edit().remove(a3).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return e.a.a.a.a.K(new StringBuilder(), this.f1120a, Constants.COLON_SEPARATOR, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return String.valueOf(j);
        }
        if (TextUtils.split(str, ";").length >= 20) {
            com.xiaomi.channel.commonutils.logger.c.m16a("HB", "Don't record this interval, because the number of intervals has exceeded the maximum value.");
            return str;
        }
        return str + ";" + j;
    }
}
