package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.N0.r;

/* loaded from: classes2.dex */
public final class k {
    public static final long a = r.i("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    public static final int b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10328c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f10329d;

    /* renamed from: e, reason: collision with root package name */
    public static f f10330e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f10331f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f10332g;

    static {
        int c2 = r.c();
        b = r.h("kotlinx.coroutines.scheduler.core.pool.size", c2 < 2 ? 2 : c2, 1, 0, 8, null);
        f10328c = r.h("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f10329d = TimeUnit.SECONDS.toNanos(r.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f10330e = d.a;
        f10331f = new i(0);
        f10332g = new i(1);
    }
}
