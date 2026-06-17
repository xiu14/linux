package com.bytedance.android.input.basic.settings.api.c;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    @SerializedName("dis_displayed_config")
    private List<f> a;

    @SerializedName("enable")
    private boolean b;

    public g() {
        this(null, false, 3);
    }

    public g(List list, boolean z, int i) {
        kotlin.collections.l lVar = (i & 1) != 0 ? kotlin.collections.l.a : null;
        z = (i & 2) != 0 ? true : z;
        kotlin.s.c.l.f(lVar, "disDisplayedConfig");
        this.a = lVar;
        this.b = z;
    }

    public final List<f> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.s.c.l.a(this.a, gVar.a) && this.b == gVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("InterceptPreDisplayedConfig(disDisplayedConfig=");
        M.append(this.a);
        M.append(", isEnable=");
        return e.a.a.a.a.L(M, this.b, ')');
    }
}
