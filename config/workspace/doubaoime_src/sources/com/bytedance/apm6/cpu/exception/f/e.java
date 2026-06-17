package com.bytedance.apm6.cpu.exception.f;

import com.bytedance.apm6.cpu.exception.StateType;

/* loaded from: classes.dex */
public class e extends com.bytedance.apm6.cpu.exception.a {
    public e(com.bytedance.apm6.cpu.exception.d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void b(com.bytedance.apm6.cpu.b.c cVar, boolean z) {
        super.b(cVar, z);
        this.a.g();
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void c(boolean z) {
        super.c(z);
        a(e.a.a.a.a.A("life cycle change when state is idle, lifecycle change to back?: ", z));
        this.a.g();
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void d() {
        super.d();
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public StateType e() {
        return StateType.IDLE;
    }
}
