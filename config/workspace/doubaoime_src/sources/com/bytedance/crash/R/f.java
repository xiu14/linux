package com.bytedance.crash.R;

import java.util.Set;

/* loaded from: classes.dex */
public class f {
    private static boolean b;
    private Set<String> a;

    public f(Set<String> set) {
        this.a = set;
    }

    public static void b(boolean z) {
        b = z;
    }

    public boolean a(String str) {
        Set<String> set;
        return (b || (set = this.a) == null || !set.contains(str)) ? false : true;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EventConfig{sampledService=");
        M.append(this.a);
        M.append(", isAllSample=");
        M.append(false);
        M.append('}');
        return M.toString();
    }
}
