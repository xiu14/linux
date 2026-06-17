package com.bytedance.apm.s;

import com.bytedance.apm.s.k.l;
import java.util.Iterator;

/* loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (a.z) {
            try {
                if (com.bytedance.apm.g.B()) {
                    com.bytedance.apm.y.d.d("<monitor><battery>", "onChangeToBack, record data");
                }
                com.bytedance.apm.y.a.b("APM-Battery", "ToBackIn");
                boolean G = this.a.G(true);
                Iterator it2 = this.a.f3474g.values().iterator();
                while (it2.hasNext()) {
                    ((l) it2.next()).b(G);
                }
            } finally {
                this.a.i = false;
            }
            this.a.i = false;
        }
    }
}
