package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.bumptech.glide.j<android.graphics.drawable.Drawable>>] */
/* loaded from: classes.dex */
public class k implements ComponentCallbacks2, com.bumptech.glide.manager.k {
    private static final com.bumptech.glide.request.h k = new com.bumptech.glide.request.h().d(Bitmap.class).K();
    protected final c a;
    protected final Context b;

    /* renamed from: c, reason: collision with root package name */
    final com.bumptech.glide.manager.j f1556c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private final p f1557d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    private final o f1558e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private final s f1559f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f1560g;
    private final com.bumptech.glide.manager.b h;
    private final CopyOnWriteArrayList<com.bumptech.glide.request.g<Object>> i;

    @GuardedBy("this")
    private com.bumptech.glide.request.h j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f1556c.a(kVar);
        }
    }

    private class b implements b.a {

        @GuardedBy("RequestManager.this")
        private final p a;

        b(@NonNull p pVar) {
            this.a = pVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z) {
            if (z) {
                synchronized (k.this) {
                    this.a.d();
                }
            }
        }
    }

    static {
        new com.bumptech.glide.request.h().d(GifDrawable.class).K();
        new com.bumptech.glide.request.h().e(com.bumptech.glide.load.engine.j.b).S(Priority.LOW).W(true);
    }

    public k(@NonNull c cVar, @NonNull com.bumptech.glide.manager.j jVar, @NonNull o oVar, @NonNull Context context) {
        p pVar = new p();
        com.bumptech.glide.manager.c e2 = cVar.e();
        this.f1559f = new s();
        a aVar = new a();
        this.f1560g = aVar;
        this.a = cVar;
        this.f1556c = jVar;
        this.f1558e = oVar;
        this.f1557d = pVar;
        this.b = context;
        com.bumptech.glide.manager.b a2 = ((com.bumptech.glide.manager.e) e2).a(context.getApplicationContext(), new b(pVar));
        this.h = a2;
        cVar.j(this);
        if (com.bumptech.glide.util.j.h()) {
            com.bumptech.glide.util.j.k(aVar);
        } else {
            jVar.a(this);
        }
        jVar.a(a2);
        this.i = new CopyOnWriteArrayList<>(cVar.g().c());
        u(cVar.g().d());
    }

    private synchronized void o() {
        Iterator it2 = ((ArrayList) this.f1559f.g()).iterator();
        while (it2.hasNext()) {
            n((com.bumptech.glide.request.k.h) it2.next());
        }
        this.f1559f.d();
    }

    @NonNull
    @CheckResult
    public <ResourceType> j<ResourceType> d(@NonNull Class<ResourceType> cls) {
        return new j<>(this.a, this, cls, this.b);
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void f() {
        this.f1559f.f();
        synchronized (this) {
            this.f1557d.c();
        }
    }

    @NonNull
    @CheckResult
    public j<Bitmap> g() {
        return d(Bitmap.class).a(k);
    }

    @NonNull
    @CheckResult
    public j<Drawable> l() {
        return d(Drawable.class);
    }

    @NonNull
    @CheckResult
    public j<File> m() {
        return d(File.class).a(com.bumptech.glide.request.h.c0(true));
    }

    public void n(@Nullable com.bumptech.glide.request.k.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        boolean w = w(hVar);
        com.bumptech.glide.request.e i = hVar.i();
        if (w || this.a.k(hVar) || i == null) {
            return;
        }
        hVar.c(null);
        i.clear();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onDestroy() {
        this.f1559f.onDestroy();
        o();
        this.f1557d.b();
        this.f1556c.b(this);
        this.f1556c.b(this.h);
        com.bumptech.glide.util.j.l(this.f1560g);
        this.a.m(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onStart() {
        synchronized (this) {
            this.f1557d.e();
        }
        this.f1559f.onStart();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    List<com.bumptech.glide.request.g<Object>> p() {
        return this.i;
    }

    synchronized com.bumptech.glide.request.h q() {
        return this.j;
    }

    @NonNull
    @CheckResult
    public j<Drawable> r(@Nullable String str) {
        return l().m0(str);
    }

    public synchronized void s() {
        this.f1557d.c();
    }

    public synchronized void t() {
        this.f1557d.e();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f1557d + ", treeNode=" + this.f1558e + "}";
    }

    protected synchronized void u(@NonNull com.bumptech.glide.request.h hVar) {
        this.j = hVar.clone().b();
    }

    synchronized void v(@NonNull com.bumptech.glide.request.k.h<?> hVar, @NonNull com.bumptech.glide.request.e eVar) {
        this.f1559f.l(hVar);
        this.f1557d.f(eVar);
    }

    synchronized boolean w(@NonNull com.bumptech.glide.request.k.h<?> hVar) {
        com.bumptech.glide.request.e i = hVar.i();
        if (i == null) {
            return true;
        }
        if (!this.f1557d.a(i)) {
            return false;
        }
        this.f1559f.m(hVar);
        hVar.c(null);
        return true;
    }
}
