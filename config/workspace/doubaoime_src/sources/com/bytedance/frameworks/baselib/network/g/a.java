package com.bytedance.frameworks.baselib.network.g;

import java.util.Arrays;

/* loaded from: classes.dex */
public class a {
    private String[] a;

    public a(String[] strArr) {
        this.a = strArr;
    }

    public String[] a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((a) obj).a);
    }
}
