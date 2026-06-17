package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.LongSparseArray;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class LongSparseArrayKt {
    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        l.f(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j) {
        l.f(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j) >= 0;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t) {
        l.f(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(t) >= 0;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> void forEach(LongSparseArray<T> longSparseArray, p<? super Long, ? super T, o> pVar) {
        l.f(longSparseArray, "<this>");
        l.f(pVar, "action");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t) {
        l.f(longSparseArray, "<this>");
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, kotlin.s.b.a<? extends T> aVar) {
        l.f(longSparseArray, "<this>");
        l.f(aVar, "defaultValue");
        T t = longSparseArray.get(j);
        return t == null ? aVar.invoke() : t;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        l.f(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        l.f(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        l.f(longSparseArray, "<this>");
        return longSparseArray.size() != 0;
    }

    @RequiresApi(16)
    public static final <T> kotlin.collections.p keyIterator(final LongSparseArray<T> longSparseArray) {
        l.f(longSparseArray, "<this>");
        return new kotlin.collections.p() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            @SuppressLint({"ClassVerificationFailure"})
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // kotlin.collections.p
            @SuppressLint({"ClassVerificationFailure"})
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        l.f(longSparseArray, "<this>");
        l.f(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray2.size() + longSparseArray.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    @RequiresApi(16)
    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        l.f(longSparseArray, "<this>");
        l.f(longSparseArray2, "other");
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j, T t) {
        l.f(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !l.a(t, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    @RequiresApi(16)
    @SuppressLint({"ClassVerificationFailure"})
    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t) {
        l.f(longSparseArray, "<this>");
        longSparseArray.put(j, t);
    }

    @RequiresApi(16)
    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        l.f(longSparseArray, "<this>");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
