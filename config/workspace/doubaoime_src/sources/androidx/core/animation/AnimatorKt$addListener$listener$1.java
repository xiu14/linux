package androidx.core.animation;

import android.animation.Animator;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ l<Animator, o> $onCancel;
    final /* synthetic */ l<Animator, o> $onEnd;
    final /* synthetic */ l<Animator, o> $onRepeat;
    final /* synthetic */ l<Animator, o> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(l<? super Animator, o> lVar, l<? super Animator, o> lVar2, l<? super Animator, o> lVar3, l<? super Animator, o> lVar4) {
        this.$onRepeat = lVar;
        this.$onEnd = lVar2;
        this.$onCancel = lVar3;
        this.$onStart = lVar4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        kotlin.s.c.l.f(animator, "animator");
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        kotlin.s.c.l.f(animator, "animator");
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        kotlin.s.c.l.f(animator, "animator");
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        kotlin.s.c.l.f(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
