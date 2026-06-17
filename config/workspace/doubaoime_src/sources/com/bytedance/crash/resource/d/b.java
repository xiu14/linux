package com.bytedance.crash.resource.d;

import com.bytedance.crash.N.h;
import com.bytedance.crash.resource.c;

/* loaded from: classes.dex */
public class b extends c {
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected int k;
    protected int l;
    protected int m;
    protected long n;

    public b(boolean z, boolean z2, int i, int i2, long j, int i3) {
        super(21, 33, 2);
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = 500;
        this.l = 1000;
        this.m = 10;
        this.n = com.heytap.mcssdk.constant.a.f6886d;
        if (!h.g()) {
            this.h = z;
            this.i = z2;
            this.k = i;
            this.l = i2;
            this.n = Math.max(1000L, j);
            this.m = i3;
            return;
        }
        this.h = true;
        this.i = true;
        this.k = 200;
        this.l = 400;
        this.n = 1000L;
        this.m = 10;
        this.j = true;
    }

    @Override // com.bytedance.crash.resource.c
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("fdTrackEnable=");
        M.append(this.h);
        M.append("\nwaterLine=");
        M.append(this.k);
        M.append("\ndumpLine=");
        M.append(this.l);
        M.append("\nloopMonitorEnable=");
        M.append(this.i);
        M.append("\nmSleepTime=");
        M.append(this.n);
        M.append("\nmBacktraceLimit=");
        M.append(this.m);
        M.append("\ndebug=");
        M.append(this.j);
        M.append("\n");
        return M.toString();
    }
}
