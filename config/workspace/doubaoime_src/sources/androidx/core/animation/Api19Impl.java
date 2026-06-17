package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

@RequiresApi(19)
/* loaded from: classes.dex */
final class Api19Impl {
    public static final Api19Impl INSTANCE = new Api19Impl();

    private Api19Impl() {
    }

    @DoNotInline
    public static final void addPauseListener(Animator animator, Animator.AnimatorPauseListener animatorPauseListener) {
        l.f(animator, "animator");
        l.f(animatorPauseListener, "listener");
        animator.addPauseListener(animatorPauseListener);
    }
}
