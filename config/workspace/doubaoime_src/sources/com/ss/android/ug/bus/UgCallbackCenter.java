package com.ss.android.ug.bus;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class UgCallbackCenter {
    private static final Object a = new Object();
    private static final ConcurrentHashMap<Type, ConcurrentHashMap<b, Object>> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final Handler f8379c = new Handler(Looper.getMainLooper());

    static class a implements Runnable {
        final /* synthetic */ LifecycleOwner a;
        final /* synthetic */ b b;

        a(LifecycleOwner lifecycleOwner, b bVar) {
            this.a = lifecycleOwner;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            UgCallbackCenter.b(this.a, this.b);
        }
    }

    public interface b<T> {
    }

    public static <EVENT> void b(LifecycleOwner lifecycleOwner, final b<EVENT> bVar) {
        if (bVar == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            f8379c.post(new a(lifecycleOwner, bVar));
            return;
        }
        final Type type = ((ParameterizedType) bVar.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
        ConcurrentHashMap<Type, ConcurrentHashMap<b, Object>> concurrentHashMap = b;
        final ConcurrentHashMap<b, Object> concurrentHashMap2 = concurrentHashMap.get(type);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap.put(type, concurrentHashMap2);
        }
        concurrentHashMap2.put(bVar, a);
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.ss.android.ug.bus.UgCallbackCenter.2
                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                void onDestroy() {
                    concurrentHashMap2.remove(bVar);
                    if (concurrentHashMap2.isEmpty()) {
                        UgCallbackCenter.b.remove(type);
                    }
                }
            });
        }
    }
}
