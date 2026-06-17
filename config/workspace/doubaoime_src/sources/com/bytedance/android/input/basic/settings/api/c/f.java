package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class f {

    @SerializedName("pkg")
    private String a;

    @SerializedName("min_ver")
    private long b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("spec_ver")
    private String f2101c;

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.f2101c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.s.c.l.a(this.a, fVar.a) && this.b == fVar.b && kotlin.s.c.l.a(this.f2101c, fVar.f2101c);
    }

    public int hashCode() {
        return this.f2101c.hashCode() + ((Long.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DisDisplayedConfig(pkg=");
        M.append(this.a);
        M.append(", minVer=");
        M.append(this.b);
        M.append(", specVer=");
        return e.a.a.a.a.G(M, this.f2101c, ')');
    }
}
