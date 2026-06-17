package com.bytedance.apm6.cpu.c;

import android.util.Pair;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class a implements e.b.b.m.h.a {
    private double a = -1.0d;
    private double b = -1.0d;

    private static final class b {
        private static final a a = new a(null);
    }

    a(C0136a c0136a) {
        new Pair(0L, new LinkedList());
        new Pair(0L, new LinkedList());
    }

    public static a c() {
        return b.a;
    }

    @Override // e.b.b.m.h.a
    public double a() {
        return this.a;
    }

    @Override // e.b.b.m.h.a
    public double b() {
        return this.b;
    }

    public void d(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }
}
