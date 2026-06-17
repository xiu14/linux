package com.bytedance.push.g0;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.c.a;

/* loaded from: classes2.dex */
public class f {
    private static boolean a = false;
    private static int b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5702c = false;

    /* renamed from: d, reason: collision with root package name */
    private static com.bytedance.push.Q.b f5703d = new com.bytedance.push.Q.a();

    /* renamed from: e, reason: collision with root package name */
    private static String f5704e = "";

    /* renamed from: f, reason: collision with root package name */
    private static volatile a.j f5705f;

    public static void c(String str, String str2) {
        if (!f5702c) {
            if (b > 3 || !a) {
                return;
            }
            Log.i("BDPush", f5704e + " >>> " + e.a.a.a.a.t(str, "\t>>>\t", str2));
            return;
        }
        if (f5705f == null) {
            com.ss.android.c.a.l(f5704e, str + "\t>>>\t" + str2);
            return;
        }
        f5705f.b(f5704e, str + "\t>>>\t" + str2);
    }

    public static boolean d() {
        return a;
    }

    public static void e(String str, String str2) {
        if (!f5702c) {
            if (b > 6 || !a) {
                return;
            }
            Log.e("BDPush", str + "\t>>> " + str2);
            return;
        }
        if (f5705f == null) {
            com.ss.android.c.a.h(f5704e, str + "\t>>>\t" + str2);
            return;
        }
        f5705f.a(f5704e, str + "\t>>>\t" + str2);
    }

    public static void f(String str, String str2, Throwable th) {
        String str3 = f5704e;
        StringBuilder U = e.a.a.a.a.U(str, "\t>>>\t", str2);
        U.append(th.getMessage());
        e(str3, U.toString());
    }

    public static void g(String str, String str2) {
        if (!f5702c) {
            if (b > 4 || !a) {
                return;
            }
            Log.i("BDPush", f5704e + " >>> " + e.a.a.a.a.t(str, "\t>>>\t", str2));
            return;
        }
        if (f5705f == null) {
            com.ss.android.c.a.l(f5704e, str + "\t>>>\t" + str2);
            return;
        }
        f5705f.b(f5704e, str + "\t>>>\t" + str2);
    }

    public static void h(String str, String str2, Throwable th) {
        String str3 = f5704e;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\t>>>\t");
        sb.append(str2);
        sb.append("\t>>>\t");
        sb.append(th == null ? "null" : th.getMessage());
        g(str3, sb.toString());
    }

    public static void i(Context context, boolean z, String str) {
        f5702c = z;
        if (!TextUtils.isEmpty(str) && f5705f == null) {
            com.ss.android.message.e.e().f(new e(str, context), 0L);
        }
        if (TextUtils.isEmpty(f5704e)) {
            StringBuilder M = e.a.a.a.a.M("BDPush-");
            M.append(com.ss.android.message.f.a.j(context));
            f5704e = M.toString();
        }
    }

    public static void j(boolean z) {
        a = z;
    }

    public static void k(int i) {
        b = i;
    }

    public static void l(String str, String str2) {
        if (!f5702c) {
            if (b > 2 || !a) {
                return;
            }
            Log.i("BDPush", f5704e + " >>> " + e.a.a.a.a.t(str, "\t>>>\t", str2));
            return;
        }
        if (f5705f == null) {
            com.ss.android.c.a.l(f5704e, str + "\t>>>\t" + str2);
            return;
        }
        f5705f.b(f5704e, str + "\t>>>\t" + str2);
    }

    public static void m(String str, String str2) {
        if (!f5702c) {
            if (b > 5 || !a) {
                return;
            }
            Log.w("BDPush", f5704e + " >>> " + e.a.a.a.a.t(str, "\t>>>\t", str2));
            return;
        }
        if (f5705f == null) {
            com.ss.android.c.a.u(f5704e, str + "\t>>>\t" + str2);
            return;
        }
        f5705f.c(f5704e, str + "\t>>>\t" + str2);
    }
}
