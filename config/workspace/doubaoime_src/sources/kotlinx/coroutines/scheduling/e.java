package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.AbstractC0796d0;

/* loaded from: classes2.dex */
public class e extends AbstractC0796d0 {
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10324c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10325d;

    /* renamed from: e, reason: collision with root package name */
    private CoroutineScheduler f10326e;

    public e(int i, int i2, long j, String str) {
        this.a = i;
        this.b = i2;
        this.f10324c = j;
        this.f10325d = str;
        this.f10326e = new CoroutineScheduler(i, i2, j, str);
    }

    public final void U(Runnable runnable, h hVar, boolean z) {
        this.f10326e.h(runnable, hVar, z);
    }

    @Override // kotlinx.coroutines.D
    public void dispatch(kotlin.r.f fVar, Runnable runnable) {
        CoroutineScheduler.l(this.f10326e, runnable, null, false, 6);
    }

    @Override // kotlinx.coroutines.D
    public void dispatchYield(kotlin.r.f fVar, Runnable runnable) {
        CoroutineScheduler.l(this.f10326e, runnable, null, true, 2);
    }
}
