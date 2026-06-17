package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class i {

    @SerializedName("input_pkg")
    private String a;

    @SerializedName("input_type")
    private int b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("input_options")
    private int f2104c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("ime_hint")
    private String f2105d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("ime_disable_hint")
    private String f2106e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("force_support")
    private boolean f2107f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("enable")
    private boolean f2108g;

    public i() {
        e.a.a.a.a.u0("", "inputPkg", "", "imeHint", "", "imeDisableHint");
        this.a = "";
        this.b = 0;
        this.f2104c = 0;
        this.f2105d = "";
        this.f2106e = "";
        this.f2107f = false;
        this.f2108g = false;
    }

    public final boolean a() {
        return this.f2108g;
    }

    public final boolean b() {
        return this.f2107f;
    }

    public final String c() {
        return this.f2106e;
    }

    public final String d() {
        return this.f2105d;
    }

    public final int e() {
        return this.f2104c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.s.c.l.a(this.a, iVar.a) && this.b == iVar.b && this.f2104c == iVar.f2104c && kotlin.s.c.l.a(this.f2105d, iVar.f2105d) && kotlin.s.c.l.a(this.f2106e, iVar.f2106e) && this.f2107f == iVar.f2107f && this.f2108g == iVar.f2108g;
    }

    public final String f() {
        return this.a;
    }

    public final int g() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int p0 = e.a.a.a.a.p0(this.f2106e, e.a.a.a.a.p0(this.f2105d, e.a.a.a.a.I(this.f2104c, e.a.a.a.a.I(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        boolean z = this.f2107f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (p0 + i) * 31;
        boolean z2 = this.f2108g;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("OneSendConfig(inputPkg=");
        M.append(this.a);
        M.append(", inputType=");
        M.append(this.b);
        M.append(", inputOptions=");
        M.append(this.f2104c);
        M.append(", imeHint=");
        M.append(this.f2105d);
        M.append(", imeDisableHint=");
        M.append(this.f2106e);
        M.append(", forceSupport=");
        M.append(this.f2107f);
        M.append(", enable=");
        return e.a.a.a.a.L(M, this.f2108g, ')');
    }
}
