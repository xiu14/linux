package com.bytedance.apm.util;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class k<F, S> {

    @Nullable
    public F a;

    @Nullable
    public S b;

    public k(@Nullable F f2, @Nullable S s) {
        this.a = f2;
        this.b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        F f2 = kVar.a;
        F f3 = this.a;
        if (!(f2 == f3 || (f2 != null && f2.equals(f3)))) {
            return false;
        }
        S s = kVar.b;
        S s2 = this.b;
        return s == s2 || (s != null && s.equals(s2));
    }

    public int hashCode() {
        F f2 = this.a;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Pair{");
        M.append(String.valueOf(this.a));
        M.append(" ");
        M.append(this.b);
        M.append("}");
        return M.toString();
    }
}
