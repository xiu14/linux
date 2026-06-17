package kotlinx.coroutines.N0;

import java.util.Objects;

/* renamed from: kotlinx.coroutines.N0.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0785a<T> {
    private Object[] a = new Object[16];
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f10158c;

    public final void a(T t) {
        Object[] objArr = this.a;
        int i = this.f10158c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f10158c = length;
        int i2 = this.b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            kotlin.collections.g.j(objArr, objArr2, 0, i2, 0, 10, null);
            Object[] objArr3 = this.a;
            int length3 = objArr3.length;
            int i3 = this.b;
            kotlin.collections.g.j(objArr3, objArr2, length3 - i3, 0, i3, 4, null);
            this.a = objArr2;
            this.b = 0;
            this.f10158c = length2;
        }
    }

    public final boolean b() {
        return this.b == this.f10158c;
    }

    public final T c() {
        int i = this.b;
        if (i == this.f10158c) {
            return null;
        }
        Object[] objArr = this.a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.b = (i + 1) & (objArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
