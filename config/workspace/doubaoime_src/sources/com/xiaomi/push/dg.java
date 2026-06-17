package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.common.wschannel.WsConstants;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class dg {
    private static int a;
    private static int b;

    public static class a implements XMPushService.n {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.xiaomi.push.service.XMPushService.n
        /* renamed from: a */
        public void mo487a() {
            dg.m239a(this.a);
        }
    }

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(Context context, long j) {
        synchronized (dg.class) {
            SharedPreferences m240b = m240b(context);
            long j2 = m240b.getLong("start_time_for_day", 0L);
            if (j2 == 0) {
                m240b.edit().putLong("start_time_for_day", j).putLong("last_discnt_time", 0L).putInt("discnt_count_in_day", 0).putInt("discnt_count", 0).putInt("cnt_count", 0).putLong("last_cnt_time", j).apply();
                return;
            }
            int i = m240b.getInt("cnt_count", 0);
            int i2 = m240b.getInt("discnt_count", 0);
            long j3 = m240b.getLong("last_cnt_time", 0L);
            long j4 = m240b.getLong("last_discnt_time", 0L);
            long j5 = m240b.getLong("last_heartbeat_time", j3);
            if (i2 == i && j5 > j4 && j5 - j4 > com.heytap.mcssdk.constant.a.f6886d) {
                long a2 = fk.a() >> 1;
                j4 = j - j5 <= a2 ? (j5 + j) >> 1 : j5 + a2;
                c(context, "unknown", true, j4, 25, -1L, -1, -1, "null", -1);
                i2 = m240b.getInt("discnt_count", i2);
            }
            if (i >= i2) {
                return;
            }
            int i3 = i2;
            m240b.edit().putString("online_duration", a(m240b.getString("online_duration", null), j4 - j3)).putString("offline_duration", a(m240b.getString("offline_duration", null), j - j4)).putLong("last_cnt_time", j).putString("connected_time", a(m240b.getString("connected_time", null), j)).putInt("cnt_count", i + 1).apply();
            if (j - j2 >= com.heytap.mcssdk.constant.a.f6888f) {
                m240b.edit().putLong("start_time_for_day", j).putInt("discnt_count_in_day", 0).apply();
                c(context);
            } else if (i3 >= 10) {
                c(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, long j) {
        SharedPreferences m240b = m240b(context);
        long j2 = m240b.getLong("last_cnt_time", 0L);
        if (j2 == 0) {
            return;
        }
        de deVar = new de();
        deVar.a(0);
        deVar.a("unknown");
        deVar.b(a(true));
        deVar.c(0);
        deVar.a(fk.a());
        deVar.d(com.xiaomi.push.service.p.a(context).m813a());
        deVar.e(dd.a(context));
        deVar.b("null");
        deVar.f(dd.a());
        deVar.e(j2);
        deVar.d(-1L);
        deVar.c(j - j2);
        deVar.b(0L);
        deVar.h(a(context));
        deVar.g(b(context));
        deVar.i(Build.VERSION.SDK_INT);
        deVar.j(h.a(context));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(deVar);
        new df().a(context, arrayList);
        m240b.edit().putLong("last_cnt_time", j).apply();
    }

    public static void a(final Context context, final String str, final boolean z, final long j, final int i, final long j2, final int i2, final int i3, final String str2, final int i4) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.dg.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dg.c(context, str, z, j, i, j2, i2, i3, str2, i4);
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("DisconnectStatsSP onDisconnection exception: ");
                    M.append(e2.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, String str, boolean z, long j, int i, long j2, int i2, int i3, String str2, int i4) {
        synchronized (dg.class) {
            SharedPreferences m240b = m240b(context);
            long j3 = m240b.getLong("start_time_for_day", 0L);
            if (j3 == 0) {
                dd.a("recordDisconnection not initialized");
                return;
            }
            if (j - m240b.getLong("last_discnt_time", 0L) < com.heytap.mcssdk.constant.a.f6886d) {
                dd.a("recordDisconnection anti-shake");
                return;
            }
            if (j - j3 < com.heytap.mcssdk.constant.a.f6888f) {
                int i5 = m240b.getInt("discnt_count_in_day", 0);
                if (i5 > 100) {
                    dd.a("recordDisconnection count > 100 in 24H cycle,abandon.");
                    return;
                } else {
                    m240b.edit().putInt("discnt_count_in_day", i5 + 1).apply();
                }
            } else {
                dd.a("recordDisconnection with the current time exceeds 24H cycle, go on.");
            }
            int i6 = m240b.getInt("discnt_count", 0);
            if (i6 == m240b.getInt("cnt_count", 0)) {
                a(context, str, a(z), j, i, j2, i2, i3, str2, i4);
                m240b.edit().putLong("last_discnt_time", j).putInt("discnt_count", i6 + 1).apply();
            }
            dd.a("recordDisconnection complete");
        }
    }

    public static void a(final Context context, final long j) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.dg.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dg.d(context, j);
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("DisconnectStatsSP onReconnection exception: ");
                    M.append(e2.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                }
            }
        });
    }

    private static void a(Context context, String str, int i, long j, int i2, long j2, int i3, int i4, String str2, int i5) {
        dd.a(String.format(Locale.US, "recordDisconnectInfo host=%s, netState=%d, currentTimeMillis=%d, reason=%d, pingInterval=%d, heartbeatStrategy=%d, netType=%d, wifiDigest=%s, connectedNetType=%d", str, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5)));
        SharedPreferences m240b = m240b(context);
        String string = m240b.getString("host", null);
        String string2 = m240b.getString(WsConstants.KEY_NETWORK_STATE, null);
        String string3 = m240b.getString("reason", null);
        String string4 = m240b.getString("ping_interval", null);
        String string5 = m240b.getString("hb_strategy", null);
        String string6 = m240b.getString("network_type", null);
        String string7 = m240b.getString("wifi_digest", null);
        String string8 = m240b.getString("connected_network_type", null);
        String string9 = m240b.getString("disconnect_time", null);
        String string10 = m240b.getString("xmsf_vc", null);
        String string11 = m240b.getString("app_vc", null);
        String string12 = m240b.getString("android_vc", null);
        String string13 = m240b.getString("push_bundle_vc", null);
        String a2 = a(string, str);
        String a3 = a(string2, i);
        String a4 = a(string3, i2);
        String a5 = a(string4, j2);
        String a6 = a(string5, i3);
        String a7 = a(string6, i4);
        String a8 = a(string7, str2);
        String a9 = a(string8, i5);
        String a10 = a(string9, j);
        String a11 = a(string10, a(context));
        m240b.edit().putString("host", a2).putString(WsConstants.KEY_NETWORK_STATE, a3).putString("reason", a4).putString("ping_interval", a5).putString("hb_strategy", a6).putString("network_type", a7).putString("wifi_digest", a8).putString("connected_network_type", a9).putString("disconnect_time", a10).putString("xmsf_vc", a11).putString("push_bundle_vc", a(string13, h.a(context))).putString("app_vc", a(string11, b(context))).putString("android_vc", a(string12, Build.VERSION.SDK_INT)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: collision with other method in class */
    public static SharedPreferences m240b(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }

    private static int b(Context context) {
        if (b <= 0) {
            try {
                b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("Can't get version code of ");
                M.append(context.getPackageName());
                M.append(e2);
                com.xiaomi.channel.commonutils.logger.c.m16a("CONN", M.toString());
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        dd.a("upload");
        new df().a(context, m238a(context));
        d(context);
    }

    private static void d(Context context) {
        dd.a("resetAfterUpload");
        m240b(context).edit().putString("host", null).putString(WsConstants.KEY_NETWORK_STATE, null).putString("reason", null).putString("ping_interval", null).putString("hb_strategy", null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("online_duration", null).putString("offline_duration", null).putString("xmsf_vc", null).putString("push_bundle_vc", null).putString("app_vc", null).putString("android_vc", null).apply();
    }

    private static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = "null";
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        return str + ";" + str2;
    }

    private static String a(String str, int i) {
        return a(str, String.valueOf(i));
    }

    private static String a(String str, long j) {
        return a(str, String.valueOf(j));
    }

    /* renamed from: a, reason: collision with other method in class */
    private static List<de> m238a(Context context) {
        SharedPreferences m240b = m240b(context);
        String[] a2 = a(m240b.getString("host", null));
        if (a2 != null && a2.length > 0) {
            String[] a3 = a(m240b.getString(WsConstants.KEY_NETWORK_STATE, null));
            String[] a4 = a(m240b.getString("reason", null));
            String[] a5 = a(m240b.getString("ping_interval", null));
            String[] a6 = a(m240b.getString("hb_strategy", null));
            String[] a7 = a(m240b.getString("network_type", null));
            String[] a8 = a(m240b.getString("wifi_digest", null));
            String[] a9 = a(m240b.getString("connected_network_type", null));
            String[] a10 = a(m240b.getString("disconnect_time", null));
            String[] a11 = a(m240b.getString("connected_time", null));
            String[] a12 = a(m240b.getString("online_duration", null));
            String[] a13 = a(m240b.getString("offline_duration", null));
            String[] a14 = a(m240b.getString("xmsf_vc", null));
            String[] a15 = a(m240b.getString("app_vc", null));
            String[] a16 = a(m240b.getString("android_vc", null));
            String[] a17 = a(m240b.getString("push_bundle_vc", null));
            if (a3 != null && a4 != null && a6 != null && a5 != null && a7 != null && a8 != null && a9 != null && a10 != null && a11 != null && a15 != null && a14 != null && a16 != null && a12 != null && a13 != null && a17 != null) {
                String[] strArr = a2;
                if (strArr.length == a3.length && strArr.length == a4.length && strArr.length == a5.length && strArr.length == a6.length && strArr.length == a7.length && strArr.length == a8.length && strArr.length == a9.length && strArr.length == a10.length && strArr.length == a11.length && strArr.length == a12.length && strArr.length == a13.length && strArr.length == a14.length && strArr.length == a15.length && strArr.length == a16.length) {
                    String[] strArr2 = a17;
                    if (strArr.length == strArr2.length) {
                        ArrayList arrayList = new ArrayList(strArr.length);
                        int i = 0;
                        while (i < strArr.length) {
                            de deVar = new de();
                            String[] strArr3 = strArr2;
                            deVar.a(1);
                            deVar.a(strArr[i]);
                            deVar.b(u.a(a3[i], -1));
                            deVar.c(u.a(a4[i], -1));
                            deVar.a(u.a(a5[i], -1L));
                            deVar.d(u.a(a6[i], -1));
                            deVar.e(u.a(a7[i], -1));
                            deVar.b(a8[i]);
                            deVar.f(u.a(a9[i], -1));
                            deVar.e(u.a(a11[i], -1L));
                            deVar.d(u.a(a10[i], -1L));
                            deVar.c(u.a(a12[i], -1L));
                            deVar.b(u.a(a13[i], -1L));
                            deVar.h(u.a(a14[i], -1));
                            deVar.g(u.a(a15[i], -1));
                            deVar.i(u.a(a16[i], -1));
                            deVar.j(u.a(strArr3[i], 0));
                            arrayList.add(deVar);
                            i++;
                            strArr2 = strArr3;
                            a3 = a3;
                            a4 = a4;
                            strArr = strArr;
                        }
                        return arrayList;
                    }
                }
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("DisconnectStatsSP Cached data incorrect,drop.");
            return null;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("DisconnectStatsSP Cached hosts data is empty,drop.");
        return null;
    }

    private static String[] a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(";");
    }

    private static int a(Context context) {
        if (a <= 0) {
            a = k.b(context);
        }
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m239a(final Context context) {
        final long currentTimeMillis = System.currentTimeMillis();
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.dg.3
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences m240b = dg.m240b(context);
                m240b.edit().putLong("last_heartbeat_time", currentTimeMillis).apply();
                long j = m240b.getLong("start_time_for_day", 0L);
                if (j <= 0 || currentTimeMillis - j <= com.heytap.mcssdk.constant.a.f6888f) {
                    return;
                }
                m240b.edit().putLong("start_time_for_day", currentTimeMillis).putInt("discnt_count_in_day", 0).apply();
                dg.c(context);
                dg.e(context, currentTimeMillis);
            }
        });
    }
}
