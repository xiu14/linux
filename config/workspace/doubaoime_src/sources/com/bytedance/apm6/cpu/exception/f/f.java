package com.bytedance.apm6.cpu.exception.f;

import com.bytedance.apm6.cpu.exception.StateType;
import java.util.Objects;

/* loaded from: classes.dex */
class f extends a {
    public f(com.bytedance.apm6.cpu.exception.d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public StateType e() {
        return StateType.PROCESS_DETECT;
    }

    @Override // com.bytedance.apm6.cpu.exception.f.a
    protected long g() {
        if (this.b == null) {
            return this.f3695d ? 600000L : 30000L;
        }
        if (this.f3695d) {
            return 600000L;
        }
        return r0.g() * 1000;
    }

    @Override // com.bytedance.apm6.cpu.exception.f.a
    protected boolean h(boolean z) {
        if (z) {
            Objects.requireNonNull(com.bytedance.apm6.cpu.exception.c.a());
            this.a.h();
        }
        return z;
    }
}
