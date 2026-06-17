package androidx.core.transition;

import android.transition.Transition;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class TransitionKt$addListener$5 extends m implements l<Transition, o> {
    public static final TransitionKt$addListener$5 INSTANCE = new TransitionKt$addListener$5();

    public TransitionKt$addListener$5() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ o invoke(Transition transition) {
        invoke2(transition);
        return o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Transition transition) {
        kotlin.s.c.l.f(transition, "it");
    }
}
