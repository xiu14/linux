package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {
    private final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        l.f(savedStateHandlesProvider, "provider");
        this.provider = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l.f(lifecycleOwner, "source");
        l.f(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.provider.performRestore();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
