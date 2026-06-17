package com.bytedance.push.S.a;

import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes2.dex */
class a {
    private long a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f5592c;

    a() {
    }

    boolean a(String str, String str2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (TextUtils.equals(this.f5592c, str2) && elapsedRealtime - this.a <= 1000 && TextUtils.equals(this.b, str)) {
            return true;
        }
        this.b = str;
        this.f5592c = str2;
        this.a = elapsedRealtime;
        return false;
    }
}
