package androidx.core.animation;

import android.animation.Animator;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class AnimatorKt$addListener$2 extends m implements l<Animator, o> {
    public static final AnimatorKt$addListener$2 INSTANCE = new AnimatorKt$addListener$2();

    public AnimatorKt$addListener$2() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ o invoke(Animator animator) {
        invoke2(animator);
        return o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Animator animator) {
        kotlin.s.c.l.f(animator, "it");
    }
}
