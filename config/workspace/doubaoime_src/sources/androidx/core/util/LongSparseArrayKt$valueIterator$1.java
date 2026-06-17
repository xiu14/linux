package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class LongSparseArrayKt$valueIterator$1<T> implements Iterator<T>, kotlin.s.c.E.a {
    final /* synthetic */ LongSparseArray<T> $this_valueIterator;
    private int index;

    LongSparseArrayKt$valueIterator$1(LongSparseArray<T> longSparseArray) {
        this.$this_valueIterator = longSparseArray;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    @SuppressLint({"ClassVerificationFailure"})
    public boolean hasNext() {
        return this.index < this.$this_valueIterator.size();
    }

    @Override // java.util.Iterator
    @SuppressLint({"ClassVerificationFailure"})
    public T next() {
        LongSparseArray<T> longSparseArray = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return longSparseArray.valueAt(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
