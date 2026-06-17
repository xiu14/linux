package e.c.h.f;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class e<E> {
    private int a;
    private LinkedHashSet<E> b;

    public e(int i) {
        this.b = new LinkedHashSet<>(i);
        this.a = i;
    }

    public synchronized boolean a(E e2) {
        if (this.b.size() == this.a) {
            LinkedHashSet<E> linkedHashSet = this.b;
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        this.b.remove(e2);
        return this.b.add(e2);
    }

    public synchronized boolean b(E e2) {
        return this.b.contains(e2);
    }
}
