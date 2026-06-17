package androidx.core.os;

import kotlin.o;
import kotlin.s.b.a;

/* loaded from: classes.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ a<o> $action;

    public HandlerKt$postDelayed$runnable$1(a<o> aVar) {
        this.$action = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
