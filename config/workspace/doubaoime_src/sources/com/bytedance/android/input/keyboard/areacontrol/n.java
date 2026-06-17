package com.bytedance.android.input.keyboard.areacontrol;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class n {
    public static final n a = null;
    private static final CopyOnWriteArrayList<p> b = new CopyOnWriteArrayList<>();

    public static final void a(p pVar) {
        kotlin.s.c.l.f(pVar, "listener");
        CopyOnWriteArrayList<p> copyOnWriteArrayList = b;
        if (copyOnWriteArrayList.contains(pVar)) {
            return;
        }
        copyOnWriteArrayList.add(pVar);
    }

    public static final void b(int i, int i2, int i3, int i4, boolean z) {
        Iterator<p> it2 = b.iterator();
        while (it2.hasNext()) {
            it2.next().a(i, i2, i3, i4, z);
        }
    }
}
