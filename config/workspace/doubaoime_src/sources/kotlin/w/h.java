package kotlin.w;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class h extends i {
    public static float a(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static long b(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static float c(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static long d(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static float e(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int f(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static b g(b bVar) {
        l.f(bVar, "<this>");
        return new b(bVar.b(), bVar.a(), -bVar.c());
    }

    public static b h(b bVar, int i) {
        l.f(bVar, "<this>");
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        l.f(valueOf, "step");
        if (z) {
            int a = bVar.a();
            int b = bVar.b();
            if (bVar.c() <= 0) {
                i = -i;
            }
            return new b(a, b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static d i(int i, int i2) {
        d dVar;
        if (i2 > Integer.MIN_VALUE) {
            return new d(i, i2 - 1);
        }
        d dVar2 = d.f10139d;
        dVar = d.f10140e;
        return dVar;
    }
}
