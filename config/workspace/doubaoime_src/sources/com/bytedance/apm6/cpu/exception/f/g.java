package com.bytedance.apm6.cpu.exception.f;

import com.bytedance.apm6.cpu.exception.StateType;

/* loaded from: classes.dex */
class g extends a {

    /* renamed from: e, reason: collision with root package name */
    private int f3708e;

    public g(com.bytedance.apm6.cpu.exception.d dVar) {
        super(dVar);
        this.f3708e = 0;
    }

    @Override // com.bytedance.apm6.cpu.exception.f.a, com.bytedance.apm6.cpu.exception.a
    public void c(boolean z) {
        if (z) {
            this.f3708e = 0;
        }
        super.c(z);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public StateType e() {
        return StateType.PROCESS_DOUBLE_DETECT;
    }

    @Override // com.bytedance.apm6.cpu.exception.f.a
    protected long g() {
        if (this.f3695d) {
            return 300000L;
        }
        return com.heytap.mcssdk.constant.a.r;
    }

    @Override // com.bytedance.apm6.cpu.exception.f.a
    protected boolean h(boolean z) {
        if (!z) {
            this.f3708e = 0;
            this.a.g();
            return true;
        }
        this.f3708e++;
        StringBuilder M = e.a.a.a.a.M("over time: ");
        M.append(this.f3708e);
        M.append(" max over time: ");
        M.append(2);
        a(M.toString());
        if (this.f3708e < 2) {
            return false;
        }
        this.f3708e = 0;
        this.a.i();
        return true;
    }
}
