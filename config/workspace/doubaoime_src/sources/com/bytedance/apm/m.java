package com.bytedance.apm;

import com.bytedance.apm.n;
import com.bytedance.monitor.util.thread.d;

/* loaded from: classes.dex */
class m implements d.a {
    final /* synthetic */ n a;

    m(n nVar) {
        this.a = nVar;
    }

    @Override // com.bytedance.monitor.util.thread.d.a
    public void a(Throwable th, String str) {
        n.a aVar;
        n.a aVar2;
        aVar = this.a.a;
        if (aVar != null) {
            aVar2 = this.a.a;
            aVar2.a(th, str);
        }
    }
}
