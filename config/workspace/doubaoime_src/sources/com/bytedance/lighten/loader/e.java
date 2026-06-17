package com.bytedance.lighten.loader;

import e.c.h.f.t;

/* loaded from: classes.dex */
public class e implements e.c.c.d.j<t> {
    private int a;

    public e(int i) {
        this.a = i;
    }

    @Override // e.c.c.d.j
    public t get() {
        int i = this.a;
        if (i <= 0) {
            int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            i = min < 16777216 ? 1048576 : min < 33554432 ? 2097152 : 4194304;
        }
        int i2 = i;
        return new t(i2, Integer.MAX_VALUE, i2, Integer.MAX_VALUE, i2 / 8);
    }
}
