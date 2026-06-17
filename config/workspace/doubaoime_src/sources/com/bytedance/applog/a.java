package com.bytedance.applog;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.bdinstall.Level;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    private static final f a = new c();
    private static volatile boolean b = false;

    public static void a(g gVar) {
        ((c) a).a(gVar);
    }

    public static String b(Context context, String str, boolean z, Level level) {
        return ((c) a).b(context, str, z, level);
    }

    public static String c() {
        return ((c) a).r();
    }

    public static String d() {
        return ((c) a).B();
    }

    public static f e() {
        return a;
    }

    public static String f() {
        return ((c) a).P();
    }

    public static String g() {
        return ((c) a).R();
    }

    public static void h(Map<String, String> map) {
        ((c) a).S(map);
    }

    public static String i() {
        return ((c) a).T();
    }

    public static void j(@NonNull Context context, @NonNull l lVar) {
        synchronized (a.class) {
            if (b) {
                Log.e("AppLog", "Default AppLog is initialized, please new a instance by `AppLog.newInstance()`");
                return;
            }
            b = true;
            if (TextUtils.isEmpty(lVar.j())) {
                lVar.y("applog_stats");
            }
            ((c) a).W(context, lVar);
        }
    }

    public static void k() {
        ((c) a).m0();
    }

    public static void l(String str, int i) {
        ((c) a).n0(str, i);
    }

    public static void m(@NonNull String str, @NonNull String str2, String str3, long j, long j2, JSONObject jSONObject) {
        ((c) a).o0(str, str2, str3, j, j2, jSONObject);
    }

    public static void n(@NonNull String str, @Nullable JSONObject jSONObject) {
        ((c) a).q0(str, jSONObject);
    }

    public static void o(boolean z) {
        ((c) a).u0(z);
    }

    public static void p(boolean z) {
        ((c) a).v0(z);
    }

    public static void q(String str) {
        ((c) a).w0(str);
    }

    public static void r(String str, Object obj) {
        ((c) a).x0(str, obj);
    }

    public static void s(boolean z) {
        ((c) a).z0(z);
    }

    public static void t() {
        ((c) a).A0();
    }

    public static void u() {
        ((c) a).B0();
    }
}
