package com.bytedance.android.input.basic.d;

import android.os.Build;
import android.text.TextUtils;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class g {
    private static boolean a;
    private static boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static String f2056c;

    /* renamed from: d, reason: collision with root package name */
    private static String f2057d;

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0067: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:25:0x0067 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.lang.String r6) {
        /*
            java.lang.String r0 = "name"
            kotlin.s.c.l.f(r6, r0)
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r2.append(r6)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r1 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.lang.String r1 = r2.readLine()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L66
            r2.close()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L66
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r6 = move-exception
            r6.printStackTrace()
        L3e:
            return r1
        L3f:
            r1 = move-exception
            goto L45
        L41:
            r6 = move-exception
            goto L68
        L43:
            r1 = move-exception
            r2 = r0
        L45:
            java.lang.String r3 = "RomUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r4.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.String r5 = "Unable to read prop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L66
            r4.append(r6)     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L66
            android.util.Log.e(r3, r6, r1)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r6 = move-exception
            r6.printStackTrace()
        L65:
            return r0
        L66:
            r6 = move-exception
            r0 = r2
        L68:
            if (r0 == 0) goto L72
            r0.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.d.g.a(java.lang.String):java.lang.String");
    }

    public static final boolean b() {
        if (!b) {
            try {
                Class.forName("miui.os.Build");
                a = true;
                b = true;
                return true;
            } catch (Exception unused) {
                b = true;
            }
        }
        return a;
    }

    public static final boolean c() {
        l.f("OPPO", "rom");
        String str = f2056c;
        if (str != null) {
            return l.a(str, "OPPO");
        }
        if (!TextUtils.isEmpty(a("ro.miui.ui.version.name"))) {
            f2056c = "MIUI";
        } else if (!TextUtils.isEmpty(a("ro.build.version.emui"))) {
            f2056c = "EMUI";
        } else if (!TextUtils.isEmpty(a("ro.build.version.opporom"))) {
            f2056c = "OPPO";
        } else if (TextUtils.isEmpty(a("ro.vivo.os.version"))) {
            String str2 = Build.DISPLAY;
            f2057d = str2;
            l.c(str2);
            String upperCase = str2.toUpperCase();
            l.e(upperCase, "this as java.lang.String).toUpperCase()");
            if (kotlin.text.a.d(upperCase, "FLYME", false, 2, null)) {
                f2056c = "FLYME";
            } else {
                f2057d = "unknown";
                String str3 = Build.MANUFACTURER;
                l.e(str3, "MANUFACTURER");
                String upperCase2 = str3.toUpperCase();
                l.e(upperCase2, "this as java.lang.String).toUpperCase()");
                f2056c = upperCase2;
            }
        } else {
            f2056c = "VIVO";
        }
        return l.a(f2056c, "OPPO");
    }
}
