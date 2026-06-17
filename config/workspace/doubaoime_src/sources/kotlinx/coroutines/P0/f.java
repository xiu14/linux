package kotlinx.coroutines.P0;

import kotlinx.coroutines.N0.x;

/* loaded from: classes2.dex */
public final class f {
    private static final x a = new x("UNLOCK_FAIL");
    private static final x b;

    /* renamed from: c, reason: collision with root package name */
    private static final x f10185c;

    /* renamed from: d, reason: collision with root package name */
    private static final b f10186d;

    /* renamed from: e, reason: collision with root package name */
    private static final b f10187e;

    static {
        x xVar = new x("LOCKED");
        b = xVar;
        x xVar2 = new x("UNLOCKED");
        f10185c = xVar2;
        f10186d = new b(xVar);
        f10187e = new b(xVar2);
    }

    public static c a(boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return new d(z);
    }
}
