package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.s.c.l;
import kotlinx.coroutines.flow.h;

/* loaded from: classes.dex */
public final class FlowExtKt {
    public static final <T> kotlinx.coroutines.flow.f<T> flowWithLifecycle(kotlinx.coroutines.flow.f<? extends T> fVar, Lifecycle lifecycle, Lifecycle.State state) {
        l.f(fVar, "<this>");
        l.f(lifecycle, "lifecycle");
        l.f(state, "minActiveState");
        return h.d(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, fVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.f flowWithLifecycle$default(kotlinx.coroutines.flow.f fVar, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(fVar, lifecycle, state);
    }
}
