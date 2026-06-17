package androidx.lifecycle;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner lifecycleOwner) {
        l.f(lifecycleOwner, "owner");
    }

    default void onDestroy(LifecycleOwner lifecycleOwner) {
        l.f(lifecycleOwner, "owner");
    }

    default void onPause(LifecycleOwner lifecycleOwner) {
        l.f(lifecycleOwner, "owner");
    }

    default void onResume(LifecycleOwner lifecycleOwner) {
        l.f(lifecycleOwner, "owner");
    }

    default void onStart(LifecycleOwner lifecycleOwner) {
        l.f(lifecycleOwner, "owner");
    }

    default void onStop(LifecycleOwner lifecycleOwner) {
        l.f(lifecycleOwner, "owner");
    }
}
