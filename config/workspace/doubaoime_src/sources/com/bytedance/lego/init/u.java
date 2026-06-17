package com.bytedance.lego.init;

import kotlin.s.c.z;

/* loaded from: classes.dex */
public final class u implements w {
    private com.bytedance.lego.init.model.f a;

    /* JADX WARN: Multi-variable type inference failed */
    u(z zVar) {
        this.a = (com.bytedance.lego.init.model.f) zVar.a;
    }

    @Override // com.bytedance.lego.init.w
    public com.bytedance.lego.init.model.f I() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public void run() {
        r.p.g(this.a);
    }
}
