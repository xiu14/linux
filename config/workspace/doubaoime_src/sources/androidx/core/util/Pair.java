package androidx.core.util;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f2, S s) {
        this.first = f2;
        this.second = s;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(A a, B b) {
        return new Pair<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f2 = this.first;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.second;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Pair{");
        M.append(this.first);
        M.append(" ");
        M.append(this.second);
        M.append("}");
        return M.toString();
    }
}
