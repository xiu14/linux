package com.bytedance.crash.resource.j;

import android.os.SystemClock;
import com.bytedance.crash.resource.j.c;

/* loaded from: classes.dex */
class a extends Thread {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, String str) {
        super(str);
        this.a = cVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        c.a aVar;
        c.a aVar2;
        c.a aVar3;
        com.bytedance.crash.resource.i.a aVar4;
        c.a aVar5;
        c.a aVar6;
        c.a aVar7;
        long j;
        long c2;
        c.a aVar8;
        long q;
        c.a aVar9;
        c.a aVar10;
        c.a aVar11;
        long j2 = this.a.h.j;
        while (true) {
            aVar = c.k;
            int i = aVar.f4684d;
            if (i == 0) {
                aVar2 = c.k;
                aVar2.f4684d = 1;
            } else if (i == 1) {
                long s = c.s(this.a.h.n);
                StringBuilder Q = e.a.a.a.a.Q("VmMonitor: growSize: ", s, ", originVmSize: ");
                j = c.i;
                Q.append(j);
                Q.append(", mwaterLine: ");
                Q.append(this.a.h.c());
                com.bytedance.android.input.k.b.a.p(Q.toString());
                if (s >= this.a.h.c()) {
                    aVar8 = c.k;
                    aVar8.f4684d = 2;
                    if (this.a.h.n) {
                        q = c.q();
                        long unused = c.j = q;
                    }
                    this.a.u(0);
                } else {
                    if (s > this.a.h.c() / 4) {
                        if (s != 0) {
                            c2 = this.a.h.c() / s;
                            j2 *= c2;
                        }
                    }
                    j2 *= 4;
                }
            } else if (i == 2) {
                long k = c.k(this.a.h.n);
                StringBuilder Q2 = e.a.a.a.a.Q("VmMonitor: leakSize: ", k, ", dumpleaksize: ");
                Q2.append(this.a.h.b());
                com.bytedance.android.input.k.b.a.p(Q2.toString());
                if (k >= (this.a.h.b() * 5) / 4) {
                    aVar9 = c.k;
                    aVar9.f4684d = 3;
                    c.l(this.a, 0);
                } else {
                    if (k >= this.a.h.b() / 4) {
                        if (k != 0) {
                            c2 = this.a.h.b() / k;
                            j2 *= c2;
                        }
                    }
                    j2 *= 4;
                }
            } else if (i == 3) {
                if (c.k(this.a.h.n) < this.a.h.b()) {
                    aVar11 = c.k;
                    aVar11.f4684d = 2;
                    this.a.u(0);
                } else {
                    aVar10 = c.k;
                    aVar10.f4684d = 4;
                    c.m(this.a, 0);
                    c.n(this.a, 0);
                }
            }
            aVar3 = c.k;
            if (aVar3.f4684d == -1) {
                break;
            }
            aVar6 = c.k;
            if (aVar6.f4684d == 4) {
                break;
            }
            aVar7 = c.k;
            if (aVar7.f4684d == 5) {
                break;
            }
            try {
                j2 = Math.max(j2, this.a.h.j);
                if (this.a.h.m) {
                    j2 = 1000;
                }
                SystemClock.sleep(j2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        aVar4 = ((com.bytedance.crash.resource.b) this.a).f4661e;
        aVar4.b();
        com.bytedance.android.input.k.b.a.X("VmMonitor: ", "Thread exit!");
        aVar5 = c.k;
        aVar5.f4683c = false;
    }
}
