package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.xiaomi.push.dg;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes2.dex */
public class dd {
    private static int a = -1;

    /* renamed from: a, reason: collision with other field name */
    private static dg.a f239a;

    /* renamed from: a, reason: collision with other field name */
    private static dh f240a;

    /* renamed from: a, reason: collision with other field name */
    private static String f241a;

    public static void a(XMPushService xMPushService, gp gpVar) {
        if (m229a((Context) xMPushService)) {
            if (f240a == null) {
                f240a = new dh(xMPushService);
            }
            gpVar.a(f240a);
            if (f239a == null) {
                f239a = new dg.a(xMPushService);
            }
            xMPushService.a(f239a);
            a("startStats");
        }
    }

    public static void b(XMPushService xMPushService, gp gpVar) {
        dh dhVar = f240a;
        if (dhVar != null) {
            gpVar.b(dhVar);
            f240a = null;
        }
        dg.a aVar = f239a;
        if (aVar != null) {
            xMPushService.b(aVar);
            f239a = null;
        }
        a("stopStats");
    }

    public static void b(Context context) {
        dg.m239a(context);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m229a(Context context) {
        return cz.a(context) || "com.mitv.tvhome".equals(context.getPackageName()) || "com.xiaomi.micolauncher".equals(context.getPackageName());
    }

    private static synchronized void b(String str) {
        synchronized (dd.class) {
            if ("WIFI-ID-UNKNOWN".equals(str)) {
                String str2 = f241a;
                if (str2 == null || !str2.startsWith("W-")) {
                    f241a = null;
                }
            } else {
                f241a = str;
            }
            a("updateNetId new networkId = " + str + ", finally netId = " + f241a);
        }
    }

    public static void a(Context context, String str, int i) {
        if (!m229a(context)) {
            a("onDisconnection shouldSampling = false");
            return;
        }
        dg.a(context, str, ax.b(context), System.currentTimeMillis(), i, fk.a(), com.xiaomi.push.service.p.a(context).m813a(), a(context), m227a(), a);
        a("onDisconnection");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m228a(Context context) {
        if (!m229a(context)) {
            a("onReconnection shouldSampling = false");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a = a(context);
        dg.a(context, currentTimeMillis);
        a("onReconnection connectedNetworkType = " + a);
    }

    public static void a(Context context, String str) {
        if (!m229a(context)) {
            a("onWifiChanged shouldSampling = false");
            return;
        }
        a(e.a.a.a.a.s("onWifiChanged wifiDigest = ", str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b(e.a.a.a.a.s("W-", str));
    }

    static int a() {
        return a;
    }

    static int a(Context context) {
        String str;
        try {
            ay m110a = ax.m110a();
            if (m110a != null) {
                if (m110a.a() == 0) {
                    String m124b = m110a.m124b();
                    if (TextUtils.isEmpty(m124b) || GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(m124b)) {
                        str = null;
                    } else {
                        str = "M-" + m124b;
                    }
                    b(str);
                    return 0;
                }
                if (m110a.a() != 1 && m110a.a() != 6) {
                    b((String) null);
                    return -1;
                }
                b("WIFI-ID-UNKNOWN");
                return 1;
            }
            b((String) null);
            return -1;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("DisconnectStatsHelper getNetType occurred error: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.d(M.toString());
            b((String) null);
            return -1;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static synchronized String m227a() {
        String str;
        synchronized (dd.class) {
            str = f241a;
        }
        return str;
    }

    static void a(String str) {
        cz.a("Push-DiscntStats", str);
    }
}
