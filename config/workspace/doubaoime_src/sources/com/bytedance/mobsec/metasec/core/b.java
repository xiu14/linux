package com.bytedance.mobsec.metasec.core;

import android.text.TextUtils;
import ms.bd.c.k2;

/* loaded from: classes.dex */
public abstract class b extends c implements k2 {
    public b(String str, String str2, int i) {
        this.a = str;
        this.f5404e = str2;
        this.f5406g = i;
        if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("appID or license must be set.");
        }
    }

    protected c c() {
        if (this.f5405f != -1) {
            return this;
        }
        throw new IllegalArgumentException("MSConfig init error");
    }

    public k2 d(String str) {
        this.b = str;
        return this;
    }

    public k2 e(int i) {
        this.f5405f = i;
        return this;
    }
}
