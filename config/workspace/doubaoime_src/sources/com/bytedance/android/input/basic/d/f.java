package com.bytedance.android.input.basic.d;

import android.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class f<T> {
    private final LinkedList<T> a = new LinkedList<>();

    public final synchronized void a(l<? super T, Boolean> lVar) {
        kotlin.s.c.l.f(lVar, "action");
        Object clone = this.a.clone();
        kotlin.s.c.l.d(clone, "null cannot be cast to non-null type java.util.LinkedList<T of com.bytedance.android.input.basic.tools.ListenerManager>");
        Iterator it2 = ((LinkedList) clone).iterator();
        while (it2.hasNext()) {
            R.array arrayVar = (Object) it2.next();
            lVar.invoke(arrayVar);
            if (Boolean.FALSE.booleanValue()) {
                synchronized (this) {
                    this.a.remove(arrayVar);
                }
            }
        }
    }

    public final synchronized void b(T t) {
        this.a.addFirst(t);
    }

    public final synchronized void c(T t) {
        this.a.remove(t);
    }
}
