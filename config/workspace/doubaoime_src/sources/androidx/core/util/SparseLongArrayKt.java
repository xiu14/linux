package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import androidx.annotation.RequiresApi;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SparseLongArrayKt {
    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean contains(SparseLongArray sparseLongArray, int i) {
        l.f(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean containsKey(SparseLongArray sparseLongArray, int i) {
        l.f(sparseLongArray, "<this>");
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean containsValue(SparseLongArray sparseLongArray, long j) {
        l.f(sparseLongArray, "<this>");
        return sparseLongArray.indexOfValue(j) >= 0;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void forEach(SparseLongArray sparseLongArray, p<? super Integer, ? super Long, o> pVar) {
        l.f(sparseLongArray, "<this>");
        l.f(pVar, "action");
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long getOrDefault(SparseLongArray sparseLongArray, int i, long j) {
        l.f(sparseLongArray, "<this>");
        return sparseLongArray.get(i, j);
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long getOrElse(SparseLongArray sparseLongArray, int i, kotlin.s.b.a<Long> aVar) {
        l.f(sparseLongArray, "<this>");
        l.f(aVar, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : aVar.invoke().longValue();
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int getSize(SparseLongArray sparseLongArray) {
        l.f(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        l.f(sparseLongArray, "<this>");
        return sparseLongArray.size() == 0;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        l.f(sparseLongArray, "<this>");
        return sparseLongArray.size() != 0;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final kotlin.collections.o keyIterator(final SparseLongArray sparseLongArray) {
        l.f(sparseLongArray, "<this>");
        return new kotlin.collections.o() { // from class: androidx.core.util.SparseLongArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // kotlin.collections.o
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = i + 1;
                return sparseLongArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        l.f(sparseLongArray, "<this>");
        l.f(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray2.size() + sparseLongArray.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        l.f(sparseLongArray, "<this>");
        l.f(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean remove(SparseLongArray sparseLongArray, int i, long j) {
        l.f(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey < 0 || j != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final void set(SparseLongArray sparseLongArray, int i, long j) {
        l.f(sparseLongArray, "<this>");
        sparseLongArray.put(i, j);
    }

    @RequiresApi(18)
    @SuppressLint({"ClassVerificationFailure"})
    public static final kotlin.collections.p valueIterator(final SparseLongArray sparseLongArray) {
        l.f(sparseLongArray, "<this>");
        return new kotlin.collections.p() { // from class: androidx.core.util.SparseLongArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // kotlin.collections.p
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = i + 1;
                return sparseLongArray2.valueAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }
}
