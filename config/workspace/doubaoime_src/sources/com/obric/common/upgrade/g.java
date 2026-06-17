package com.obric.common.upgrade;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public final class g {

    @SerializedName("apps")
    private final List<e> a;

    public g() {
        kotlin.collections.l lVar = kotlin.collections.l.a;
        kotlin.s.c.l.f(lVar, "apps");
        this.a = lVar;
    }

    public final List<e> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.s.c.l.a(this.a, ((g) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AppUpgradeData(apps=");
        M.append(this.a);
        M.append(')');
        return M.toString();
    }

    public g(List list, int i) {
        kotlin.collections.l lVar = (i & 1) != 0 ? kotlin.collections.l.a : null;
        kotlin.s.c.l.f(lVar, "apps");
        this.a = lVar;
    }
}
