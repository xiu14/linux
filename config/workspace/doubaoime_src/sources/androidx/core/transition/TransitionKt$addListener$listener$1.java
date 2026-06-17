package androidx.core.transition;

import android.transition.Transition;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ l<Transition, o> $onCancel;
    final /* synthetic */ l<Transition, o> $onEnd;
    final /* synthetic */ l<Transition, o> $onPause;
    final /* synthetic */ l<Transition, o> $onResume;
    final /* synthetic */ l<Transition, o> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(l<? super Transition, o> lVar, l<? super Transition, o> lVar2, l<? super Transition, o> lVar3, l<? super Transition, o> lVar4, l<? super Transition, o> lVar5) {
        this.$onEnd = lVar;
        this.$onResume = lVar2;
        this.$onPause = lVar3;
        this.$onCancel = lVar4;
        this.$onStart = lVar5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        kotlin.s.c.l.f(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        kotlin.s.c.l.f(transition, "transition");
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        kotlin.s.c.l.f(transition, "transition");
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        kotlin.s.c.l.f(transition, "transition");
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        kotlin.s.c.l.f(transition, "transition");
        this.$onStart.invoke(transition);
    }
}
