package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.RequiresApi;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class AnimatorKt {
    public static final Animator.AnimatorListener addListener(Animator animator, l<? super Animator, o> lVar, l<? super Animator, o> lVar2, l<? super Animator, o> lVar3, l<? super Animator, o> lVar4) {
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "onEnd");
        kotlin.s.c.l.f(lVar2, "onStart");
        kotlin.s.c.l.f(lVar3, "onCancel");
        kotlin.s.c.l.f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, l lVar, l lVar2, l lVar3, l lVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = AnimatorKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = AnimatorKt$addListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            lVar3 = AnimatorKt$addListener$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            lVar4 = AnimatorKt$addListener$4.INSTANCE;
        }
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "onEnd");
        kotlin.s.c.l.f(lVar2, "onStart");
        kotlin.s.c.l.f(lVar3, "onCancel");
        kotlin.s.c.l.f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final l<? super Animator, o> lVar, final l<? super Animator, o> lVar2) {
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "onResume");
        kotlin.s.c.l.f(lVar2, "onPause");
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
                lVar2.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
                lVar.invoke(animator2);
            }
        };
        Api19Impl.addPauseListener(animator, animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, l lVar, l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = AnimatorKt$addPauseListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = AnimatorKt$addPauseListener$2.INSTANCE;
        }
        return addPauseListener(animator, lVar, lVar2);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final l<? super Animator, o> lVar) {
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final l<? super Animator, o> lVar) {
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, l<? super Animator, o> lVar) {
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        return addPauseListener$default(animator, null, lVar, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final l<? super Animator, o> lVar) {
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
                l.this.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, l<? super Animator, o> lVar) {
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        return addPauseListener$default(animator, lVar, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final l<? super Animator, o> lVar) {
        kotlin.s.c.l.f(animator, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                kotlin.s.c.l.f(animator2, "animator");
                l.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
