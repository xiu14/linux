package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArray<T> sparseArray, int i) {
        l.f(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i) {
        l.f(sparseArray, "<this>");
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t) {
        l.f(sparseArray, "<this>");
        return sparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, p<? super Integer, ? super T, o> pVar) {
        l.f(sparseArray, "<this>");
        l.f(pVar, "action");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i, T t) {
        l.f(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i, kotlin.s.b.a<? extends T> aVar) {
        l.f(sparseArray, "<this>");
        l.f(aVar, "defaultValue");
        T t = sparseArray.get(i);
        return t == null ? aVar.invoke() : t;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        l.f(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        l.f(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        l.f(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    public static final <T> kotlin.collections.o keyIterator(final SparseArray<T> sparseArray) {
        l.f(sparseArray, "<this>");
        return new kotlin.collections.o() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // kotlin.collections.o
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i = this.index;
                this.index = i + 1;
                return sparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        l.f(sparseArray, "<this>");
        l.f(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray2.size() + sparseArray.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        l.f(sparseArray, "<this>");
        l.f(sparseArray2, "other");
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i, T t) {
        l.f(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !l.a(t, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i, T t) {
        l.f(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        l.f(sparseArray, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }
}
