package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import e.c.h.f.t;

/* loaded from: classes.dex */
public class c implements e.c.c.d.j<t> {
    private final ActivityManager a;
    private int b;

    public c(ActivityManager activityManager, int i) {
        this.a = activityManager;
        this.b = i;
    }

    @Override // e.c.c.d.j
    public t get() {
        int i = this.b;
        if (i <= 0) {
            int min = Math.min(this.a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
            i = min < 33554432 ? 4194304 : min < 67108864 ? 6291456 : min / 8;
        }
        return new t(i, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
