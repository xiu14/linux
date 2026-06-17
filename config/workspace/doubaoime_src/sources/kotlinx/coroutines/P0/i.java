package kotlinx.coroutines.P0;

import kotlinx.coroutines.N0.r;
import kotlinx.coroutines.N0.x;

/* loaded from: classes2.dex */
public final class i {
    private static final int a = r.h("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
    private static final x b = new x("PERMIT");

    /* renamed from: c, reason: collision with root package name */
    private static final x f10193c = new x("TAKEN");

    /* renamed from: d, reason: collision with root package name */
    private static final x f10194d = new x("BROKEN");

    /* renamed from: e, reason: collision with root package name */
    private static final x f10195e = new x("CANCELLED");

    /* renamed from: f, reason: collision with root package name */
    private static final int f10196f = r.h("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static g a(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return new h(i, i2);
    }
}
