package com.obric.oui.window.listener;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class WindowConfigChangeListener$Companion$addListener$1 implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        concurrentHashMap = WindowConfigChangeListener.b;
        if (concurrentHashMap.containsKey(0)) {
            concurrentHashMap2 = WindowConfigChangeListener.b;
            concurrentHashMap2.remove(0);
        }
    }
}
