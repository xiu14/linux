package com.bytedance.bdinstall.g0;

import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.bytedance.bdinstall.C0643x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {
    private final Object a = new Object();
    private final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<Type, b> f3986c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    public final ConcurrentHashMap<d, Object> f3987d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private String f3988e = null;

    class a implements Runnable {
        final /* synthetic */ Object a;

        a(Object obj) {
            this.a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b(this.a);
        }
    }

    public void a(String str) {
        this.f3988e = str;
    }

    @MainThread
    public <Event> void b(Event event) {
        b bVar;
        if (Looper.myLooper() != C0643x.f(this.f3988e)) {
            C0643x.h(this.f3988e, new a(event));
            return;
        }
        synchronized (this.a) {
            bVar = this.f3986c.get(event.getClass());
            if (bVar == null) {
                bVar = new b(null);
                this.f3986c.put(event.getClass(), bVar);
            }
        }
        bVar.a = event;
        for (com.bytedance.bdinstall.g0.a aVar : bVar.b.keySet()) {
            if (aVar != null) {
                aVar.a(event);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <EVENT> void c(boolean z, com.bytedance.bdinstall.g0.a<EVENT> aVar) {
        Object obj;
        Type type = ((ParameterizedType) aVar.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
        synchronized (this.a) {
            b bVar = this.f3986c.get(type);
            if (bVar == null) {
                bVar = new b(null);
                this.f3986c.put(type, bVar);
            }
            bVar.b.put(aVar, this.b);
            this.f3987d.put((d) aVar, this.b);
            if (z && (obj = bVar.a) != null) {
                C0643x.h(this.f3988e, new com.bytedance.bdinstall.g0.b(this, bVar, aVar, obj));
            }
        }
    }

    public void d(Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (this.a) {
            d dVar = null;
            Iterator<d> it2 = this.f3987d.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                d next = it2.next();
                if (next.b() == obj) {
                    dVar = next;
                    break;
                }
            }
            if (dVar != null) {
                d(dVar);
                this.f3987d.remove(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        Object a;
        ConcurrentHashMap<com.bytedance.bdinstall.g0.a, Object> b = new ConcurrentHashMap<>();

        private b() {
        }

        b(com.bytedance.bdinstall.g0.b bVar) {
        }
    }
}
