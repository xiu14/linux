package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d<E> extends AbstractList<E> implements List<E>, Object {
    protected d() {
    }

    public abstract int a();

    public abstract E b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
