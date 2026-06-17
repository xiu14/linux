package e.b.b.d.b;

import java.util.Set;

/* loaded from: classes.dex */
public class a {
    private Set<String> a;
    private Set<String> b;

    public a(Set<String> set, Set<String> set2) {
        this.a = set;
        this.b = set2;
    }

    public boolean a(String str) {
        Set<String> set = this.b;
        return set != null && set.contains(str);
    }

    public boolean b(String str) {
        Set<String> set = this.a;
        return set != null && set.contains(str);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CommonEventConfig{sampledService=");
        M.append(this.a);
        M.append(", sampledLogType=");
        M.append(this.b);
        M.append('}');
        return M.toString();
    }
}
