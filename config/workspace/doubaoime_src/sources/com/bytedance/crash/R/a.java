package com.bytedance.crash.R;

import java.util.Set;

/* loaded from: classes.dex */
public class a {
    private boolean a;
    private Set<String> b;

    public a(boolean z, Set<String> set) {
        this.a = z;
        this.b = set;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b(String str) {
        Set<String> set = this.b;
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("BizExceptionConfig{isEnableUpload=");
        M.append(this.a);
        M.append(", sampledLogTypes=");
        M.append(this.b);
        M.append('}');
        return M.toString();
    }
}
