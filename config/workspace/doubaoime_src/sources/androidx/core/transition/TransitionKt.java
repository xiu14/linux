package androidx.core.transition;

import android.annotation.SuppressLint;
import android.transition.Transition;
import androidx.annotation.RequiresApi;
import kotlin.o;
import kotlin.s.b.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class TransitionKt {
    @RequiresApi(19)
    public static final Transition.TransitionListener addListener(Transition transition, l<? super Transition, o> lVar, l<? super Transition, o> lVar2, l<? super Transition, o> lVar3, l<? super Transition, o> lVar4, l<? super Transition, o> lVar5) {
        kotlin.s.c.l.f(transition, "<this>");
        kotlin.s.c.l.f(lVar, "onEnd");
        kotlin.s.c.l.f(lVar2, "onStart");
        kotlin.s.c.l.f(lVar3, "onCancel");
        kotlin.s.c.l.f(lVar4, "onResume");
        kotlin.s.c.l.f(lVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = TransitionKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = TransitionKt$addListener$2.INSTANCE;
        }
        l lVar6 = lVar2;
        if ((i & 4) != 0) {
            lVar3 = TransitionKt$addListener$3.INSTANCE;
        }
        l lVar7 = lVar3;
        if ((i & 8) != 0) {
            lVar4 = TransitionKt$addListener$4.INSTANCE;
        }
        if ((i & 16) != 0) {
            lVar5 = TransitionKt$addListener$5.INSTANCE;
        }
        kotlin.s.c.l.f(transition, "<this>");
        kotlin.s.c.l.f(lVar, "onEnd");
        kotlin.s.c.l.f(lVar6, "onStart");
        kotlin.s.c.l.f(lVar7, "onCancel");
        kotlin.s.c.l.f(lVar4, "onResume");
        kotlin.s.c.l.f(lVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar7, lVar6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnCancel(Transition transition, final l<? super Transition, o> lVar) {
        kotlin.s.c.l.f(transition, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnEnd(Transition transition, final l<? super Transition, o> lVar) {
        kotlin.s.c.l.f(transition, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnPause(Transition transition, final l<? super Transition, o> lVar) {
        kotlin.s.c.l.f(transition, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnResume(Transition transition, final l<? super Transition, o> lVar) {
        kotlin.s.c.l.f(transition, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
                l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnStart(Transition transition, final l<? super Transition, o> lVar) {
        kotlin.s.c.l.f(transition, "<this>");
        kotlin.s.c.l.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                kotlin.s.c.l.f(transition2, "transition");
                l.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
