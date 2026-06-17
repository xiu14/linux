package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.collections.j;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SparseBooleanArrayKt {
    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i) {
        l.f(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i) {
        l.f(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z) {
        l.f(sparseBooleanArray, "<this>");
        return sparseBooleanArray.indexOfValue(z) >= 0;
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, p<? super Integer, ? super Boolean, o> pVar) {
        l.f(sparseBooleanArray, "<this>");
        l.f(pVar, "action");
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        l.f(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i, kotlin.s.b.a<Boolean> aVar) {
        l.f(sparseBooleanArray, "<this>");
        l.f(aVar, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : aVar.invoke().booleanValue();
    }

    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        l.f(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        l.f(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        l.f(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size() != 0;
    }

    public static final kotlin.collections.o keyIterator(final SparseBooleanArray sparseBooleanArray) {
        l.f(sparseBooleanArray, "<this>");
        return new kotlin.collections.o() { // from class: androidx.core.util.SparseBooleanArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // kotlin.collections.o
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = i + 1;
                return sparseBooleanArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        l.f(sparseBooleanArray, "<this>");
        l.f(sparseBooleanArray2, "other");
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray2.size() + sparseBooleanArray.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        l.f(sparseBooleanArray, "<this>");
        l.f(sparseBooleanArray2, "other");
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        l.f(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey < 0 || z != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        l.f(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i, z);
    }

    public static final j valueIterator(final SparseBooleanArray sparseBooleanArray) {
        l.f(sparseBooleanArray, "<this>");
        return new j() { // from class: androidx.core.util.SparseBooleanArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // kotlin.collections.j
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = i + 1;
                return sparseBooleanArray2.valueAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }
}
