package kotlinx.coroutines.N0;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.N0.B;
import kotlinx.coroutines.Z;

/* loaded from: classes2.dex */
public class A<T extends B & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    private T[] a;

    private final void f(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            kotlin.s.c.l.c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            kotlin.s.c.l.c(t);
            T t2 = tArr[i];
            kotlin.s.c.l.c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            g(i, i2);
            i = i2;
        }
    }

    private final void g(int i, int i2) {
        T[] tArr = this.a;
        kotlin.s.c.l.c(tArr);
        T t = tArr[i2];
        kotlin.s.c.l.c(t);
        T t2 = tArr[i];
        kotlin.s.c.l.c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.d(i);
        t2.d(i2);
    }

    public final void a(T t) {
        Z.c cVar = (Z.c) t;
        cVar.a(this);
        T[] tArr = this.a;
        if (tArr == null) {
            tArr = (T[]) new B[4];
            this.a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            kotlin.s.c.l.e(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((B[]) copyOf);
            this.a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t;
        cVar.d(i);
        f(i);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final boolean c() {
        return this._size == 0;
    }

    public final T d(int i) {
        T[] tArr = this.a;
        kotlin.s.c.l.c(tArr);
        this._size--;
        if (i < this._size) {
            g(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                kotlin.s.c.l.c(t);
                T t2 = tArr[i2];
                kotlin.s.c.l.c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    g(i, i2);
                    f(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= this._size) {
                    break;
                }
                T[] tArr2 = this.a;
                kotlin.s.c.l.c(tArr2);
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t3 = tArr2[i4];
                    kotlin.s.c.l.c(t3);
                    T t4 = tArr2[i3];
                    kotlin.s.c.l.c(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                kotlin.s.c.l.c(t5);
                T t6 = tArr2[i3];
                kotlin.s.c.l.c(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                g(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[this._size];
        kotlin.s.c.l.c(t7);
        t7.a(null);
        t7.d(-1);
        tArr[this._size] = null;
        return t7;
    }

    public final T e() {
        T d2;
        synchronized (this) {
            d2 = this._size > 0 ? d(0) : null;
        }
        return d2;
    }
}
