package com.bytedance.crash.dumper;

import java.io.File;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    private static b f4582f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f4583g;
    private final JSONObject a;
    private final JSONObject b;

    /* renamed from: c, reason: collision with root package name */
    private String f4584c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4585d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4586e;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    b() {
        /*
            r4 = this;
            r4.<init>()
            android.content.Context r0 = com.bytedance.crash.C0652g.g()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1d
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "bytest_automation_info"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)     // Catch: java.lang.Throwable -> L1d
            r4.f4584c = r0     // Catch: java.lang.Throwable -> L1d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r4.f4584c     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            goto L22
        L1d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L22:
            r4.a = r0
            int r1 = r0.length()
            if (r1 == 0) goto L33
            java.lang.String r1 = "slardar_filter"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            r4.b = r1
            goto L36
        L33:
            r1 = 0
            r4.b = r1
        L36:
            org.json.JSONObject r1 = r4.b
            if (r1 == 0) goto L63
            java.lang.String r2 = "gwp_asan_switch"
            java.lang.String r1 = r1.optString(r2)
            java.lang.String r2 = "true"
            r2.equals(r1)
            org.json.JSONObject r1 = r4.b
            java.lang.String r3 = "core_dump_switch"
            java.lang.String r1 = r1.optString(r3)
            r2.equals(r1)
            org.json.JSONObject r1 = r4.b
            java.lang.String r3 = "is_all_exception_collected"
            java.lang.String r1 = r1.optString(r3)
            boolean r1 = r2.equals(r1)
            r4.f4585d = r1
            r1 = 1
            com.bytedance.crash.N.h.j(r1)
            goto L66
        L63:
            r1 = 0
            r4.f4585d = r1
        L66:
            java.lang.String r1 = "bytrace_id_prefix"
            java.lang.String r0 = r0.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            int r1 = android.os.Process.myPid()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L8e:
            r4.f4586e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.b.<init>():void");
    }

    public static void a(File file) {
        if (f4583g) {
            return;
        }
        f4583g = true;
        try {
            String str = c().f4584c;
            if (str == null) {
                return;
            }
            com.bytedance.crash.util.a.x(file, str, false);
        } catch (Throwable unused) {
        }
    }

    public static void b(JSONObject jSONObject) {
        JSONObject jSONObject2 = c().b;
        if (jSONObject2 == null || jSONObject2.length() == 0) {
            return;
        }
        com.bytedance.android.input.k.b.a.j(jSONObject, jSONObject2);
    }

    private static b c() {
        if (f4582f == null) {
            f4582f = new b();
        }
        return f4582f;
    }

    public static String d() {
        return c().f4586e;
    }

    public static boolean e() {
        return c().f4585d;
    }

    public static void f(JSONObject jSONObject, JSONObject jSONObject2) {
        Object opt;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"slardar_filter".equals(next) && (opt = jSONObject.opt(next)) != null) {
                    try {
                        jSONObject2.put(next, opt);
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }
}
