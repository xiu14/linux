package androidx.lifecycle;

import kotlin.o;
import kotlin.r.g;
import kotlin.s.b.l;
import kotlin.s.c.m;
import kotlinx.coroutines.D;

/* loaded from: classes.dex */
final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 extends m implements l<Throwable, o> {
    final /* synthetic */ D $lifecycleDispatcher;
    final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 $observer;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(D d2, Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        super(1);
        this.$lifecycleDispatcher = d2;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$observer = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ o invoke(Throwable th) {
        invoke2(th);
        return o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        D d2 = this.$lifecycleDispatcher;
        g gVar = g.a;
        if (!d2.isDispatchNeeded(gVar)) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this.$observer);
            return;
        }
        D d3 = this.$lifecycleDispatcher;
        final Lifecycle lifecycle = this.$this_suspendWithStateAtLeastUnchecked;
        final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.$observer;
        d3.dispatch(gVar, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
            @Override // java.lang.Runnable
            public final void run() {
                Lifecycle.this.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
            }
        });
    }
}
