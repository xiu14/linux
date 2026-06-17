package kotlin.x;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class o<T> implements Iterable<T>, kotlin.s.c.E.a {
    final /* synthetic */ e a;

    public o(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.a.iterator();
    }
}
