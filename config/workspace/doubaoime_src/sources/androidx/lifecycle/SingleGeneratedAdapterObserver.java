package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    private final GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        l.f(generatedAdapter, "generatedAdapter");
        this.generatedAdapter = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l.f(lifecycleOwner, "source");
        l.f(event, NotificationCompat.CATEGORY_EVENT);
        this.generatedAdapter.callMethods(lifecycleOwner, event, false, null);
        this.generatedAdapter.callMethods(lifecycleOwner, event, true, null);
    }
}
