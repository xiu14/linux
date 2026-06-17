package com.bytedance.bdinstall.util;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class s {
    private com.bytedance.bdinstall.q0.a a;
    private volatile String b;

    public List<Pair<String, String>> a(String str, boolean z, boolean z2) {
        if (this.a == null) {
            return new ArrayList();
        }
        this.b = UUID.randomUUID().toString();
        return this.a.a(str, z, z2, this.b);
    }
}
