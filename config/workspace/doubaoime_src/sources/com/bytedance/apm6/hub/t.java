package com.bytedance.apm6.hub;

import java.util.Objects;

/* loaded from: classes.dex */
final class t implements e.b.b.m.a<com.bytedance.apm6.cpu.b.b> {
    final /* synthetic */ y a;

    t(y yVar) {
        this.a = yVar;
    }

    @Override // e.b.b.m.a
    public com.bytedance.apm6.cpu.b.b a() {
        Objects.requireNonNull(this.a);
        return new com.bytedance.apm6.hub.z.b();
    }
}
