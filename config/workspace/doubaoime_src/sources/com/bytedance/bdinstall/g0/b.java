package com.bytedance.bdinstall.g0;

import com.bytedance.bdinstall.g0.c;
import java.util.Iterator;

/* loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ c.b a;
    final /* synthetic */ a b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f3985c;

    b(c cVar, c.b bVar, a aVar, Object obj) {
        this.a = bVar;
        this.b = aVar;
        this.f3985c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<a> it2 = this.a.b.keySet().iterator();
        while (it2.hasNext()) {
            if (this.b == it2.next()) {
                this.b.a(this.f3985c);
                return;
            }
        }
    }
}
