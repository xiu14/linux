package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class q {
    private static final int a = kotlinx.coroutines.N0.r.d("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);
    public static final /* synthetic */ int b = 0;

    public static f a(f fVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = a;
        }
        int i3 = i;
        if (i3 > 0) {
            return i3 == 1 ? new o(fVar) : new kotlinx.coroutines.flow.D.h(fVar, i3, null, 0, null, 28);
        }
        throw new IllegalArgumentException(e.a.a.a.a.j("Expected positive concurrency level, but had ", i3).toString());
    }
}
