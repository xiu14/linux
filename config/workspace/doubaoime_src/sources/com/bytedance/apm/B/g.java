package com.bytedance.apm.B;

import android.content.IntentFilter;

/* loaded from: classes.dex */
public class g {
    private float a;
    private int b;

    private static class a {
        private static final g a = new g(null);
    }

    g(f fVar) {
        new f(this);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static g c() {
        return a.a;
    }

    public int d() {
        return this.b;
    }

    public float e() {
        return this.a;
    }
}
