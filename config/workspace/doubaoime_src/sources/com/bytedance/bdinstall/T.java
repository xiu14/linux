package com.bytedance.bdinstall;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class T implements Cloneable {
    private final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private String f3964c;

    public T(String str, String str2) {
        this.f3964c = "";
        b(str);
        this.a = str;
        b(str2);
        this.b = str2;
    }

    public static T a(String str, boolean z) {
        String s = e.a.a.a.a.s(str, "/service/2/device_register/");
        String s2 = e.a.a.a.a.s(str, "/service/2/app_alert_check/");
        return z ? new T(s, s2, e.a.a.a.a.s(str, "/service/1/client_context/")) : new T(s, s2);
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("https")) {
            return str;
        }
        throw new IllegalArgumentException("url protocol should be https");
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t = (T) obj;
        return TextUtils.equals(this.b, t.b) && TextUtils.equals(this.a, t.a) && TextUtils.equals(this.f3964c, t.f3964c);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("{r='");
        e.a.a.a.a.G0(M, this.a, '\'', ", a='");
        e.a.a.a.a.G0(M, this.b, '\'', ", v='");
        return e.a.a.a.a.H(M, this.f3964c, '\'', '}');
    }

    public T(String str, String str2, String str3) {
        this.f3964c = "";
        b(str);
        this.a = str;
        b(str2);
        this.b = str2;
        b(str3);
        this.f3964c = str3;
    }
}
