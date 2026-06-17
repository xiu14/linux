package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class h<T> {

    @Nullable
    T a;

    @Nullable
    T b;

    public void a(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        F f2 = pair.first;
        Object obj2 = this.a;
        if (!(f2 == obj2 || (f2 != 0 && f2.equals(obj2)))) {
            return false;
        }
        S s = pair.second;
        Object obj3 = this.b;
        return s == obj3 || (s != 0 && s.equals(obj3));
    }

    public int hashCode() {
        T t = this.a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Pair{");
        M.append(String.valueOf(this.a));
        M.append(" ");
        M.append(String.valueOf(this.b));
        M.append("}");
        return M.toString();
    }
}
