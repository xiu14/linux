package com.bytedance.push.notification;

import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes2.dex */
class c {
    private long a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f5764c;

    c() {
    }

    boolean a(String str, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f5764c == i && elapsedRealtime - this.a <= 1000 && TextUtils.equals(this.b, str)) {
            return true;
        }
        this.b = str;
        this.f5764c = i;
        this.a = elapsedRealtime;
        return false;
    }
}
