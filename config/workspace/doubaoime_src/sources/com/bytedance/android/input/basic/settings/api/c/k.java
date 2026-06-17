package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class k {

    @SerializedName("input_pkg")
    private String a;

    @SerializedName("input_type")
    private int b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("input_options")
    private int f2114c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("ime_hint")
    private String f2115d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("force_support")
    private boolean f2116e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("enable")
    private boolean f2117f;

    public k() {
        this(null, 0, 0, null, false, false, 63);
    }

    public k(String str, int i, int i2, String str2, boolean z, boolean z2, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        String str3 = (i3 & 8) == 0 ? null : "";
        z = (i3 & 16) != 0 ? false : z;
        z2 = (i3 & 32) != 0 ? false : z2;
        kotlin.s.c.l.f(str, "inputPkg");
        kotlin.s.c.l.f(str3, "imeHint");
        this.a = str;
        this.b = i;
        this.f2114c = i2;
        this.f2115d = str3;
        this.f2116e = z;
        this.f2117f = z2;
    }

    public final boolean a() {
        return this.f2117f;
    }

    public final boolean b() {
        return this.f2116e;
    }

    public final String c() {
        return this.f2115d;
    }

    public final int d() {
        return this.f2114c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.s.c.l.a(this.a, kVar.a) && this.b == kVar.b && this.f2114c == kVar.f2114c && kotlin.s.c.l.a(this.f2115d, kVar.f2115d) && this.f2116e == kVar.f2116e && this.f2117f == kVar.f2117f;
    }

    public final int f() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int p0 = e.a.a.a.a.p0(this.f2115d, e.a.a.a.a.I(this.f2114c, e.a.a.a.a.I(this.b, this.a.hashCode() * 31, 31), 31), 31);
        boolean z = this.f2116e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (p0 + i) * 31;
        boolean z2 = this.f2117f;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("SearchConfig(inputPkg=");
        M.append(this.a);
        M.append(", inputType=");
        M.append(this.b);
        M.append(", inputOptions=");
        M.append(this.f2114c);
        M.append(", imeHint=");
        M.append(this.f2115d);
        M.append(", forceSupport=");
        M.append(this.f2116e);
        M.append(", enable=");
        return e.a.a.a.a.L(M, this.f2117f, ')');
    }
}
