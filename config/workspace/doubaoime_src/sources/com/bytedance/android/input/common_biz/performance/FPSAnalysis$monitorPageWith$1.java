package com.bytedance.android.input.common_biz.performance;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes.dex */
public final class FPSAnalysis$monitorPageWith$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        kotlin.s.c.l.f(lifecycleOwner, "source");
        kotlin.s.c.l.f(event, NotificationCompat.CATEGORY_EVENT);
        int ordinal = event.ordinal();
        if (ordinal == 2) {
            throw null;
        }
        if (ordinal == 3) {
            throw null;
        }
        if (ordinal == 5) {
            throw null;
        }
    }
}
