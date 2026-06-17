package com.bytedance.apm6.cpu.exception.f;

import java.util.Comparator;

/* loaded from: classes.dex */
class i implements Comparator<com.bytedance.apm6.cpu.exception.e> {
    i(h hVar) {
    }

    @Override // java.util.Comparator
    public int compare(com.bytedance.apm6.cpu.exception.e eVar, com.bytedance.apm6.cpu.exception.e eVar2) {
        return (int) ((eVar2.a() * 100.0d) - (eVar.a() * 100.0d));
    }
}
