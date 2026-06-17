package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

/* loaded from: classes2.dex */
public class d {
    private final Pair<Integer, Integer> a;
    private final ColorSpace b;

    public d(int i, int i2, ColorSpace colorSpace) {
        this.a = (i == -1 || i2 == -1) ? null : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.b = colorSpace;
    }

    public ColorSpace a() {
        return this.b;
    }

    public Pair<Integer, Integer> b() {
        return this.a;
    }
}
