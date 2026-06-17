package com.bytedance.apm6.cpu.collect;

import e.b.b.m.h.a;
import java.util.Comparator;

/* loaded from: classes.dex */
class d implements Comparator<a.C0428a> {
    d(e eVar) {
    }

    @Override // java.util.Comparator
    public int compare(a.C0428a c0428a, a.C0428a c0428a2) {
        return (int) ((c0428a2.a() * 100.0d) - (c0428a.a() * 100.0d));
    }
}
