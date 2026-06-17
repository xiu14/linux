package com.bytedance.applog.util;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {
    private static String a;

    public static boolean a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str) || "Null".equalsIgnoreCase(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            if (str.charAt(i) != '0') {
                break;
            }
            i++;
        }
        return !z;
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (JSONException e2) {
                com.bytedance.applog.w.k.z().i("copy failed", e2, new Object[0]);
            }
        }
        return jSONObject;
    }

    public static JSONObject c(JSONObject jSONObject) {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e2) {
            com.bytedance.applog.w.k.z().i("copyJson failed", e2, new Object[0]);
            return jSONObject;
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        try {
            if (sQLiteDatabase.inTransaction()) {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            com.bytedance.applog.w.k.z().i("end transaction failed", th, new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        com.bytedance.applog.util.k.a = r1.processName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(android.content.Context r5) {
        /*
            java.lang.String r0 = com.bytedance.applog.util.k.a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L9
            return r0
        L9:
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "activity"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: java.lang.Exception -> L32
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Exception -> L32
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch: java.lang.Exception -> L32
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L32
        L1d:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L32
            if (r1 == 0) goto L36
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L32
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L32
            int r2 = r1.pid     // Catch: java.lang.Exception -> L32
            if (r2 != r0) goto L1d
            java.lang.String r5 = r1.processName     // Catch: java.lang.Exception -> L32
            com.bytedance.applog.util.k.a = r5     // Catch: java.lang.Exception -> L32
            goto L36
        L32:
            r5 = move-exception
            r5.printStackTrace()
        L36:
            r5 = 0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7a
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L7a
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "/cmdline"
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "iso-8859-1"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r1.<init>()     // Catch: java.lang.Throwable -> L7b
        L67:
            int r2 = r0.read()     // Catch: java.lang.Throwable -> L7b
            if (r2 <= 0) goto L72
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7b
            r1.append(r2)     // Catch: java.lang.Throwable -> L7b
            goto L67
        L72:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L7b
        L76:
            r0.close()     // Catch: java.lang.Exception -> L7e
            goto L7e
        L7a:
            r0 = r5
        L7b:
            if (r0 == 0) goto L7e
            goto L76
        L7e:
            com.bytedance.applog.util.k.a = r5
            com.bytedance.applog.w.e r5 = com.bytedance.applog.w.k.z()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = com.bytedance.applog.util.k.a
            r0[r1] = r2
            java.lang.String r1 = "getProcessName: {}"
            r5.h(r1, r0)
            java.lang.String r5 = com.bytedance.applog.util.k.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.util.k.e(android.content.Context):java.lang.String");
    }

    public static boolean f(String str) {
        return !g(str);
    }

    public static boolean g(String str) {
        return str != null && str.length() > 0;
    }

    public static long h(JSONObject jSONObject, String str) {
        try {
            return Long.parseLong(jSONObject.optString(str));
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
