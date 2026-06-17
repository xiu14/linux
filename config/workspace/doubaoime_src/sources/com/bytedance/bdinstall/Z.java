package com.bytedance.bdinstall;

/* loaded from: classes.dex */
public class Z extends Exception {
    private int a;

    public Z(int i, String str) {
        super(str);
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
