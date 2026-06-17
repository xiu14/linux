package kotlinx.coroutines.flow.D;

import java.util.Arrays;
import kotlinx.coroutines.flow.D.c;

/* loaded from: classes2.dex */
public abstract class a<S extends c<?>> {
    private S[] a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f10243c;

    protected final S d() {
        S s;
        synchronized (this) {
            S[] sArr = this.a;
            if (sArr == null) {
                sArr = f(2);
                this.a = sArr;
            } else if (this.b >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                kotlin.s.c.l.e(copyOf, "copyOf(this, newSize)");
                this.a = (S[]) ((c[]) copyOf);
                sArr = (S[]) ((c[]) copyOf);
            }
            int i = this.f10243c;
            do {
                s = sArr[i];
                if (s == null) {
                    s = e();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.a(this));
            this.f10243c = i;
            this.b++;
        }
        return s;
    }

    protected abstract S e();

    protected abstract S[] f(int i);

    protected final void g(S s) {
        int i;
        kotlin.r.d<kotlin.o>[] dVarArr;
        synchronized (this) {
            int i2 = this.b - 1;
            this.b = i2;
            if (i2 == 0) {
                this.f10243c = 0;
            }
            s.b(this);
            dVarArr = b.a;
        }
        for (kotlin.r.d<kotlin.o> dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(kotlin.o.a);
            }
        }
    }

    protected final S[] h() {
        return this.a;
    }
}
