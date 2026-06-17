package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.gq;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class v {
    private static u a;

    /* renamed from: a, reason: collision with other field name */
    private static a f1156a;

    /* renamed from: a, reason: collision with other field name */
    public static final String f1157a = new String("1000271".getBytes(), StandardCharsets.UTF_8);
    public static final String b = new String("420100086271".getBytes(), StandardCharsets.UTF_8);

    /* renamed from: c, reason: collision with root package name */
    private static final String f9353c = new String("cn.register.xmpush.xiaomi.com".getBytes(), StandardCharsets.UTF_8);

    public interface a {
        void a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized u m832a(Context context) {
        synchronized (v.class) {
            u uVar = a;
            if (uVar != null) {
                return uVar;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
            String string = sharedPreferences.getString("uuid", null);
            String string2 = sharedPreferences.getString("token", null);
            String string3 = sharedPreferences.getString("security", null);
            String string4 = sharedPreferences.getString("app_id", null);
            String string5 = sharedPreferences.getString("app_token", null);
            String string6 = sharedPreferences.getString(Constants.PACKAGE_NAME, null);
            int i = sharedPreferences.getInt("env_type", 1);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return null;
            }
            u uVar2 = new u(string, string2, string3, string4, string5, string6, i);
            a = uVar2;
            return uVar2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:3|4|(2:8|(24:10|11|(1:13)(1:118)|14|(1:16)(1:117)|17|(1:19)(1:116)|20|21|22|23|(1:25)(1:112)|26|(6:28|(1:30)|31|(1:35)|36|(1:38))|39|(1:41)|42|(6:45|46|47|49|50|43)|54|55|(3:60|61|(2:63|64)(9:(1:67)|68|69|(2:73|(4:75|76|77|(7:79|(1:81)|82|83|84|85|86)(6:88|89|(1:93)|94|95|96)))|106|(2:91|93)|94|95|96))|111|61|(0)(0)))|119|11|(0)(0)|14|(0)(0)|17|(0)(0)|20|21|22|23|(0)(0)|26|(0)|39|(0)|42|(1:43)|54|55|(4:57|60|61|(0)(0))|111|61|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0084, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0085, code lost:
    
        com.xiaomi.channel.commonutils.logger.c.m18a((java.lang.Throwable) r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x032e, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0044, B:13:0x0051, B:14:0x0057, B:16:0x005d, B:17:0x0063, B:20:0x006f, B:22:0x0079, B:25:0x008d, B:26:0x0096, B:28:0x00c0, B:30:0x00cc, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0103, B:38:0x0109, B:39:0x010e, B:41:0x0133, B:42:0x013c, B:43:0x0173, B:45:0x0179, B:47:0x0180, B:52:0x018f, B:55:0x01c0, B:57:0x01e0, B:60:0x01e7, B:61:0x01fe, B:69:0x020d, B:71:0x022b, B:73:0x0231, B:101:0x02e8, B:91:0x0319, B:93:0x031f, B:94:0x0327, B:99:0x0300, B:110:0x0214, B:115:0x0085), top: B:3:0x0005, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x032e, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0044, B:13:0x0051, B:14:0x0057, B:16:0x005d, B:17:0x0063, B:20:0x006f, B:22:0x0079, B:25:0x008d, B:26:0x0096, B:28:0x00c0, B:30:0x00cc, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0103, B:38:0x0109, B:39:0x010e, B:41:0x0133, B:42:0x013c, B:43:0x0173, B:45:0x0179, B:47:0x0180, B:52:0x018f, B:55:0x01c0, B:57:0x01e0, B:60:0x01e7, B:61:0x01fe, B:69:0x020d, B:71:0x022b, B:73:0x0231, B:101:0x02e8, B:91:0x0319, B:93:0x031f, B:94:0x0327, B:99:0x0300, B:110:0x0214, B:115:0x0085), top: B:3:0x0005, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[Catch: all -> 0x032e, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0044, B:13:0x0051, B:14:0x0057, B:16:0x005d, B:17:0x0063, B:20:0x006f, B:22:0x0079, B:25:0x008d, B:26:0x0096, B:28:0x00c0, B:30:0x00cc, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0103, B:38:0x0109, B:39:0x010e, B:41:0x0133, B:42:0x013c, B:43:0x0173, B:45:0x0179, B:47:0x0180, B:52:0x018f, B:55:0x01c0, B:57:0x01e0, B:60:0x01e7, B:61:0x01fe, B:69:0x020d, B:71:0x022b, B:73:0x0231, B:101:0x02e8, B:91:0x0319, B:93:0x031f, B:94:0x0327, B:99:0x0300, B:110:0x0214, B:115:0x0085), top: B:3:0x0005, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[Catch: all -> 0x032e, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0044, B:13:0x0051, B:14:0x0057, B:16:0x005d, B:17:0x0063, B:20:0x006f, B:22:0x0079, B:25:0x008d, B:26:0x0096, B:28:0x00c0, B:30:0x00cc, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0103, B:38:0x0109, B:39:0x010e, B:41:0x0133, B:42:0x013c, B:43:0x0173, B:45:0x0179, B:47:0x0180, B:52:0x018f, B:55:0x01c0, B:57:0x01e0, B:60:0x01e7, B:61:0x01fe, B:69:0x020d, B:71:0x022b, B:73:0x0231, B:101:0x02e8, B:91:0x0319, B:93:0x031f, B:94:0x0327, B:99:0x0300, B:110:0x0214, B:115:0x0085), top: B:3:0x0005, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133 A[Catch: all -> 0x032e, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0044, B:13:0x0051, B:14:0x0057, B:16:0x005d, B:17:0x0063, B:20:0x006f, B:22:0x0079, B:25:0x008d, B:26:0x0096, B:28:0x00c0, B:30:0x00cc, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0103, B:38:0x0109, B:39:0x010e, B:41:0x0133, B:42:0x013c, B:43:0x0173, B:45:0x0179, B:47:0x0180, B:52:0x018f, B:55:0x01c0, B:57:0x01e0, B:60:0x01e7, B:61:0x01fe, B:69:0x020d, B:71:0x022b, B:73:0x0231, B:101:0x02e8, B:91:0x0319, B:93:0x031f, B:94:0x0327, B:99:0x0300, B:110:0x0214, B:115:0x0085), top: B:3:0x0005, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179 A[Catch: all -> 0x032e, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0044, B:13:0x0051, B:14:0x0057, B:16:0x005d, B:17:0x0063, B:20:0x006f, B:22:0x0079, B:25:0x008d, B:26:0x0096, B:28:0x00c0, B:30:0x00cc, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0103, B:38:0x0109, B:39:0x010e, B:41:0x0133, B:42:0x013c, B:43:0x0173, B:45:0x0179, B:47:0x0180, B:52:0x018f, B:55:0x01c0, B:57:0x01e0, B:60:0x01e7, B:61:0x01fe, B:69:0x020d, B:71:0x022b, B:73:0x0231, B:101:0x02e8, B:91:0x0319, B:93:0x031f, B:94:0x0327, B:99:0x0300, B:110:0x0214, B:115:0x0085), top: B:3:0x0005, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0208 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0319 A[Catch: all -> 0x032e, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:11:0x0044, B:13:0x0051, B:14:0x0057, B:16:0x005d, B:17:0x0063, B:20:0x006f, B:22:0x0079, B:25:0x008d, B:26:0x0096, B:28:0x00c0, B:30:0x00cc, B:31:0x00df, B:33:0x00e9, B:35:0x00ef, B:36:0x0103, B:38:0x0109, B:39:0x010e, B:41:0x0133, B:42:0x013c, B:43:0x0173, B:45:0x0179, B:47:0x0180, B:52:0x018f, B:55:0x01c0, B:57:0x01e0, B:60:0x01e7, B:61:0x01fe, B:69:0x020d, B:71:0x022b, B:73:0x0231, B:101:0x02e8, B:91:0x0319, B:93:0x031f, B:94:0x0327, B:99:0x0300, B:110:0x0214, B:115:0x0085), top: B:3:0x0005, inners: #3, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.xiaomi.push.service.u a(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.v.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.u");
    }

    private static String a(Context context, boolean z) {
        String a2 = c.a(context).a();
        String str = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (com.xiaomi.push.z.b()) {
            return e.a.a.a.a.K(e.a.a.a.a.M("http://"), gq.b, ":9085", str);
        }
        if (com.xiaomi.push.o.China.name().equals(a2)) {
            return e.a.a.a.a.J(e.a.a.a.a.M("https://"), f9353c, str);
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m835a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    private static void a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putInt("enc_req_fail_count", i);
        edit.commit();
    }

    private static int a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    public static void a(Context context, u uVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putString("uuid", uVar.f1155a);
        edit.putString("security", uVar.f9349c);
        edit.putString("token", uVar.b);
        edit.putString("app_id", uVar.f9350d);
        edit.putString(Constants.PACKAGE_NAME, uVar.f9352f);
        edit.putString("app_token", uVar.f9351e);
        edit.putInt("env_type", uVar.a);
        edit.commit();
        u.a(uVar.f1155a);
        a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m834a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        a = null;
        u.a("-1");
        a();
    }

    public static void a(a aVar) {
        f1156a = aVar;
    }

    public static void a() {
        a aVar = f1156a;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m833a(Context context) {
        u m832a = m832a(context);
        if (m832a != null && !TextUtils.isEmpty(m832a.f1155a)) {
            String[] split = m832a.f1155a.split("@");
            if (split.length > 0) {
                return split[0];
            }
        }
        return null;
    }
}
