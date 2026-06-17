package androidx.core.view;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

@RequiresApi(16)
/* loaded from: classes.dex */
final class Api16Impl {
    public static final Api16Impl INSTANCE = new Api16Impl();

    private Api16Impl() {
    }

    @DoNotInline
    public static final void postOnAnimationDelayed(View view, Runnable runnable, long j) {
        l.f(view, "view");
        l.f(runnable, "action");
        view.postOnAnimationDelayed(runnable, j);
    }
}
