package kotlinx.coroutines.N0;

import kotlinx.coroutines.E0;

/* loaded from: classes2.dex */
final class C {
    public final kotlin.r.f a;
    private final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    private final E0<Object>[] f10156c;

    /* renamed from: d, reason: collision with root package name */
    private int f10157d;

    public C(kotlin.r.f fVar, int i) {
        this.a = fVar;
        this.b = new Object[i];
        this.f10156c = new E0[i];
    }

    public final void a(E0<?> e0, Object obj) {
        Object[] objArr = this.b;
        int i = this.f10157d;
        objArr[i] = obj;
        E0<Object>[] e0Arr = this.f10156c;
        this.f10157d = i + 1;
        e0Arr[i] = e0;
    }

    public final void b(kotlin.r.f fVar) {
        int length = this.f10156c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            E0<Object> e0 = this.f10156c[length];
            kotlin.s.c.l.c(e0);
            e0.H(fVar, this.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
