package com.bytedance.apm6.hub;

import java.util.Objects;

/* loaded from: classes.dex */
final class u implements e.b.b.m.a<com.bytedance.apm.config.f> {
    final /* synthetic */ y a;

    u(y yVar) {
        this.a = yVar;
    }

    @Override // e.b.b.m.a
    public com.bytedance.apm.config.f a() {
        Objects.requireNonNull(this.a);
        return new com.bytedance.apm6.hub.z.e();
    }
}
