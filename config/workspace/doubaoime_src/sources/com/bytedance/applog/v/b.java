package com.bytedance.applog.v;

import com.bytedance.applog.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class b implements i {
    private final com.bytedance.applog.c a;
    private final CopyOnWriteArraySet<i> b = new CopyOnWriteArraySet<>();

    public b(com.bytedance.applog.c cVar) {
        this.a = cVar;
    }

    @Override // com.bytedance.applog.i
    public void a(String str, long j, boolean z) {
        Iterator<i> it2 = this.b.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().a(str, j, z);
            } catch (Throwable th) {
                this.a.I().t(Collections.singletonList("LaunchObserverHolder"), "invoke onLaunch callback failed", th, new Object[0]);
            }
        }
    }
}
