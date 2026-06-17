package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* loaded from: classes2.dex */
class n {
    int a = 0;

    /* renamed from: a, reason: collision with other field name */
    String f65a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return !TextUtils.isEmpty(nVar.f65a) && nVar.f65a.equals(this.f65a);
    }
}
