package com.bytedance.crash.R;

import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    private static boolean f4484e;
    private Set<String> a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f4485c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4486d;

    public c(Set<String> set, JSONObject jSONObject, boolean z) {
        this.a = set;
        this.b = z;
        if (jSONObject != null) {
            this.f4485c = jSONObject;
        } else {
            this.f4485c = new JSONObject();
        }
    }

    public static void e(boolean z) {
        f4484e = z;
    }

    public boolean a(String str) {
        JSONObject jSONObject;
        if (this.f4486d || (jSONObject = this.f4485c) == null) {
            return true;
        }
        return Math.random() <= jSONObject.optDouble(str, 1.0d);
    }

    public boolean b(String str) {
        if (f4484e) {
            return false;
        }
        if (this.f4486d) {
            return true;
        }
        if ("core_exception_monitor".equals(str)) {
            return this.b;
        }
        Set<String> set = this.a;
        return set != null && set.contains(str);
    }

    public boolean c(String str, String str2) {
        if (!f4484e && b(str)) {
            return a(str2);
        }
        return false;
    }

    public boolean d() {
        return this.f4486d || this.b;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EnsureConfig{sampledLogType=");
        M.append(this.a);
        M.append(", isCoreExceptionEnable=");
        M.append(this.b);
        M.append(", exceptionMessage=");
        M.append(this.f4485c);
        M.append(", isAllEnable=");
        return e.a.a.a.a.L(M, this.f4486d, '}');
    }

    public c(boolean z) {
        this.f4486d = z;
    }
}
