package kotlin.v;

import java.io.Serializable;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class c {
    public static final a a = new a(null);
    private static final c b = kotlin.internal.b.a.b();

    public static final class a extends c implements Serializable {
        public a(g gVar) {
        }

        @Override // kotlin.v.c
        public int b(int i) {
            return c.b.b(i);
        }

        @Override // kotlin.v.c
        public float c() {
            return c.b.c();
        }

        @Override // kotlin.v.c
        public int d() {
            return c.b.d();
        }

        @Override // kotlin.v.c
        public int e(int i, int i2) {
            return c.b.e(i, i2);
        }
    }

    public abstract int b(int i);

    public abstract float c();

    public abstract int d();

    public int e(int i, int i2) {
        int d2;
        int i3;
        int i4;
        int d3;
        if (!(i2 > i)) {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            l.f(valueOf, "from");
            l.f(valueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
        }
        int i5 = i2 - i;
        if (i5 <= 0 && i5 != Integer.MIN_VALUE) {
            do {
                d3 = d();
            } while (!(i <= d3 && d3 < i2));
            return d3;
        }
        if (((-i5) & i5) == i5) {
            i4 = b(31 - Integer.numberOfLeadingZeros(i5));
        } else {
            do {
                d2 = d() >>> 1;
                i3 = d2 % i5;
            } while ((i5 - 1) + (d2 - i3) < 0);
            i4 = i3;
        }
        return i + i4;
    }
}
