package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.C0779r;
import com.xiaomi.push.service.ax;
import com.xiaomi.push.u;
import java.util.Locale;

/* loaded from: classes2.dex */
public class u {
    public final int a;

    /* renamed from: a, reason: collision with other field name */
    public final String f1155a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9349c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9350d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9351e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9352f;

    public u(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f1155a = str;
        this.b = str2;
        this.f9349c = str3;
        this.f9350d = str4;
        this.f9351e = str5;
        this.f9352f = str6;
        this.a = i;
    }

    private static boolean b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    public ax.b a(XMPushService xMPushService) {
        ax.b bVar = new ax.b(xMPushService);
        a(bVar, xMPushService, xMPushService.m695b(), "c");
        return bVar;
    }

    public ax.b a(ax.b bVar, Context context, i iVar, String str) {
        bVar.f1060a = context.getPackageName();
        bVar.f1063b = this.f1155a;
        bVar.h = this.f9349c;
        bVar.f9318c = this.b;
        bVar.f9322g = "5";
        bVar.f9319d = "XMPUSH-PASS";
        bVar.f1062a = false;
        u.a aVar = new u.a();
        aVar.a(HiAnalyticsConstant.BI_KEY_SDK_VER, Integer.valueOf(f.a())).a("cpvn", BuildConfig.VERSION_NAME).a("cpvc", Integer.valueOf(BuildConfig.VERSION_CODE)).a("country_code", c.a(context).b()).a("region", c.a(context).a()).a("miui_vn", com.xiaomi.push.k.f()).a("miui_vc", Integer.valueOf(com.xiaomi.push.k.a(context))).a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).a("n_belong_to_app", Boolean.valueOf(an.m744a(context))).a("systemui_vc", Integer.valueOf(com.xiaomi.push.s.a(context))).a("xmsf_vc", Integer.valueOf(com.xiaomi.push.k.b(context))).a("push_bundle_vc", Integer.valueOf(com.xiaomi.push.h.a(context))).a("lbs_support", Boolean.valueOf(aa.m708b())).a("callkit_support", Boolean.valueOf(aa.m705a()));
        if (com.xiaomi.push.k.m663f()) {
            aVar.a("os_vm", com.xiaomi.push.k.c());
            aVar.a("os_vc", Integer.valueOf(com.xiaomi.push.k.b()));
            aVar.a("os_vi", com.xiaomi.push.k.d());
        }
        String a = a(context);
        if (!TextUtils.isEmpty(a)) {
            aVar.a("latest_country_code", a);
        }
        String g2 = com.xiaomi.push.k.g();
        if (!TextUtils.isEmpty(g2)) {
            aVar.a("device_ch", g2);
        }
        String h = com.xiaomi.push.k.h();
        if (!TextUtils.isEmpty(h)) {
            aVar.a("device_mfr", h);
        }
        bVar.f9320e = aVar.toString();
        String str2 = b(context) ? v.f1157a : this.f9350d;
        u.a aVar2 = new u.a();
        aVar2.a(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str2).a("locale", Locale.getDefault().toString()).a("sync", 1);
        if (m831a(context)) {
            aVar2.a("ab", str);
        }
        bVar.f9321f = aVar2.toString();
        bVar.f1059a = iVar;
        return bVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m831a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && m830a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m830a() {
        try {
            return com.xiaomi.push.t.a(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    private static String a(Context context) {
        if ("com.xiaomi.xmsf".equals(context)) {
            if (!TextUtils.isEmpty(null)) {
                return null;
            }
            String m652a = com.xiaomi.push.k.m652a("ro.miui.region");
            return TextUtils.isEmpty(m652a) ? com.xiaomi.push.k.m652a("ro.product.locale.region") : m652a;
        }
        return com.xiaomi.push.k.m657b();
    }

    public static void a(String str) {
        C0779r.m667a("persist.sys.mipush.utag", str);
    }

    public static String a() {
        return C0779r.a("persist.sys.mipush.utag");
    }
}
