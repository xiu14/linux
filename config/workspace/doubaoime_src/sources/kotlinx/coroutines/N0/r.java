package kotlinx.coroutines.N0;

import androidx.core.location.LocationRequestCompat;

/* loaded from: classes2.dex */
public final class r {

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<Throwable, kotlin.o> {
        final /* synthetic */ kotlin.s.b.l<E, kotlin.o> a;
        final /* synthetic */ E b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.r.f f10174c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.s.b.l<? super E, kotlin.o> lVar, E e2, kotlin.r.f fVar) {
            super(1);
            this.a = lVar;
            this.b = e2;
            this.f10174c = fVar;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Throwable th) {
            kotlin.s.b.l<E, kotlin.o> lVar = this.a;
            E e2 = this.b;
            kotlin.r.f fVar = this.f10174c;
            D b = r.b(lVar, e2, null);
            if (b != null) {
                com.prolificinteractive.materialcalendarview.r.T(fVar, b);
            }
            return kotlin.o.a;
        }
    }

    public static final <E> kotlin.s.b.l<Throwable, kotlin.o> a(kotlin.s.b.l<? super E, kotlin.o> lVar, E e2, kotlin.r.f fVar) {
        return new a(lVar, e2, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> D b(kotlin.s.b.l<? super E, kotlin.o> lVar, E e2, D d2) {
        try {
            lVar.invoke(e2);
        } catch (Throwable th) {
            if (d2 == null || d2.getCause() == th) {
                return new D(e.a.a.a.a.q("Exception in undelivered element handler for ", e2), th);
            }
            kotlin.a.a(d2, th);
        }
        return d2;
    }

    public static final int c() {
        return y.a();
    }

    public static final int d(String str, int i, int i2, int i3) {
        return (int) e(str, i, i2, i3);
    }

    public static final long e(String str, long j, long j2, long j3) {
        String f2 = f(str);
        if (f2 == null) {
            return j;
        }
        Long T = kotlin.text.a.T(f2);
        if (T == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + f2 + '\'').toString());
        }
        long longValue = T.longValue();
        boolean z = false;
        if (j2 <= longValue && longValue <= j3) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static final String f(String str) {
        int i = y.b;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final boolean g(String str, boolean z) {
        String f2 = f(str);
        return f2 != null ? Boolean.parseBoolean(f2) : z;
    }

    public static /* synthetic */ int h(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return d(str, i, i2, i3);
    }

    public static /* synthetic */ long i(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return e(str, j, j4, j3);
    }
}
