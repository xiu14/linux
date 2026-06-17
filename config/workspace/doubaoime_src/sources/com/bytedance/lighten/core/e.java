package com.bytedance.lighten.core;

import java.util.Locale;

/* loaded from: classes.dex */
public class e {
    private int a;
    private int b;

    public e(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public String toString() {
        return String.format(Locale.US, "image width=%d, height=%d", Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
