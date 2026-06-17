package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class m {

    @SerializedName("primaryTimeout")
    private int a;

    @SerializedName("secondaryTimeout")
    private int b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("llmRequestTimeout")
    private int f2119c;

    public m(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.f2119c = i3;
    }

    public final int a() {
        return this.f2119c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b && this.f2119c == mVar.f2119c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f2119c) + e.a.a.a.a.I(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("TimeOutConfig(primaryTimeout=");
        M.append(this.a);
        M.append(", secondaryTimeout=");
        M.append(this.b);
        M.append(", llmRequestTimeout=");
        return e.a.a.a.a.C(M, this.f2119c, ')');
    }
}
