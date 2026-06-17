package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0813k0 extends o0 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10292f = AtomicIntegerFieldUpdater.newUpdater(C0813k0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.s.b.l<Throwable, kotlin.o> f10293e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0813k0(kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        this.f10293e = lVar;
    }

    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ kotlin.o invoke(Throwable th) {
        y(th);
        return kotlin.o.a;
    }

    @Override // kotlinx.coroutines.AbstractC0826w
    public void y(Throwable th) {
        if (f10292f.compareAndSet(this, 0, 1)) {
            this.f10293e.invoke(th);
        }
    }
}
