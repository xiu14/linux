package com.bytedance.applog.w;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends k {
    @Override // com.bytedance.applog.w.b, com.bytedance.applog.w.e
    public void d(String str) {
        k(0, null, "You should not set appId on global logger instance", new Object[0]);
    }

    @Override // com.bytedance.applog.w.b
    protected void y(int i, int i2, List<String> list, Throwable th, String str, Object... objArr) {
        if (i.d()) {
            return;
        }
        int i3 = g.j;
        h hVar = new h();
        hVar.c(i);
        hVar.d(i2);
        hVar.g(Thread.currentThread().getName());
        hVar.h(th);
        hVar.f(x(list));
        hVar.e(v(str, objArr));
        g b = hVar.b();
        i.a(b);
        Iterator<f> c2 = i.c();
        while (c2.hasNext()) {
            c2.next().a(b);
        }
    }
}
