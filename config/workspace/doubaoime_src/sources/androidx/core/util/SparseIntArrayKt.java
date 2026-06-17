package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SparseIntArrayKt {
    public static final boolean contains(SparseIntArray sparseIntArray, int i) {
        l.f(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i) {
        l.f(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i) {
        l.f(sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(i) >= 0;
    }

    public static final void forEach(SparseIntArray sparseIntArray, p<? super Integer, ? super Integer, o> pVar) {
        l.f(sparseIntArray, "<this>");
        l.f(pVar, "action");
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i, int i2) {
        l.f(sparseIntArray, "<this>");
        return sparseIntArray.get(i, i2);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i, kotlin.s.b.a<Integer> aVar) {
        l.f(sparseIntArray, "<this>");
        l.f(aVar, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aVar.invoke().intValue();
    }

    public static final int getSize(SparseIntArray sparseIntArray) {
        l.f(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        l.f(sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        l.f(sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }

    public static final kotlin.collections.o keyIterator(final SparseIntArray sparseIntArray) {
        l.f(sparseIntArray, "<this>");
        return new kotlin.collections.o() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // kotlin.collections.o
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i = this.index;
                this.index = i + 1;
                return sparseIntArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        l.f(sparseIntArray, "<this>");
        l.f(sparseIntArray2, "other");
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray2.size() + sparseIntArray.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        l.f(sparseIntArray, "<this>");
        l.f(sparseIntArray2, "other");
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i, int i2) {
        l.f(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 || i2 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(SparseIntArray sparseIntArray, int i, int i2) {
        l.f(sparseIntArray, "<this>");
        sparseIntArray.put(i, i2);
    }

    public static final kotlin.collections.o valueIterator(final SparseIntArray sparseIntArray) {
        l.f(sparseIntArray, "<this>");
        return new kotlin.collections.o() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // kotlin.collections.o
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i = this.index;
                this.index = i + 1;
                return sparseIntArray2.valueAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }
}
