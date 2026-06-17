package androidx.lifecycle;

import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC0817m0;

/* loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements G {
    @Override // kotlinx.coroutines.G
    public abstract /* synthetic */ kotlin.r.f getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final InterfaceC0817m0 launchWhenCreated(p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar) {
        l.f(pVar, "block");
        return C0795d.l(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, pVar, null), 3, null);
    }

    public final InterfaceC0817m0 launchWhenResumed(p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar) {
        l.f(pVar, "block");
        return C0795d.l(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, pVar, null), 3, null);
    }

    public final InterfaceC0817m0 launchWhenStarted(p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar) {
        l.f(pVar, "block");
        return C0795d.l(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, pVar, null), 3, null);
    }
}
