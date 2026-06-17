package com.obric.oui.window.listener;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class WindowConfigChangeListener$Companion$addListener$2 implements LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = WindowConfigChangeListener.b;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) concurrentHashMap.get(0);
        if (concurrentLinkedQueue != null) {
            Iterator it2 = concurrentLinkedQueue.iterator();
            l.e(it2, "it.iterator()");
            while (it2.hasNext()) {
                if (l.a((Fragment) ((WeakReference) it2.next()).get(), null)) {
                    it2.remove();
                }
            }
        }
    }
}
