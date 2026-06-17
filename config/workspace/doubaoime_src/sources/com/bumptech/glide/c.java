package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.n;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    @GuardedBy("Glide.class")
    private static volatile c i;
    private static volatile boolean j;
    private final com.bumptech.glide.load.engine.B.d a;
    private final com.bumptech.glide.load.engine.C.i b;

    /* renamed from: c, reason: collision with root package name */
    private final e f1533c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.B.b f1534d;

    /* renamed from: e, reason: collision with root package name */
    private final n f1535e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f1536f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("managers")
    private final List<k> f1537g = new ArrayList();
    private final a h;

    public interface a {
        @NonNull
        com.bumptech.glide.request.h build();
    }

    c(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.k kVar, @NonNull com.bumptech.glide.load.engine.C.i iVar, @NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull com.bumptech.glide.load.engine.B.b bVar, @NonNull n nVar, @NonNull com.bumptech.glide.manager.c cVar, int i2, @NonNull a aVar, @NonNull Map<Class<?>, l<?, ?>> map, @NonNull List<com.bumptech.glide.request.g<Object>> list, @NonNull List<com.bumptech.glide.o.b> list2, @Nullable com.bumptech.glide.o.a aVar2, @NonNull f fVar) {
        MemoryCategory memoryCategory = MemoryCategory.NORMAL;
        this.a = dVar;
        this.f1534d = bVar;
        this.b = iVar;
        this.f1535e = nVar;
        this.f1536f = cVar;
        this.h = aVar;
        this.f1533c = new e(context, bVar, new h(this, list2, aVar2), new com.bumptech.glide.request.k.f(), aVar, map, list, kVar, fVar, i2);
    }

    @NonNull
    public static c b(@NonNull Context context) {
        if (i == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e2) {
                l(e2);
                throw null;
            } catch (InstantiationException e3) {
                l(e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                l(e4);
                throw null;
            } catch (InvocationTargetException e5) {
                l(e5);
                throw null;
            }
            synchronized (c.class) {
                if (i == null) {
                    if (j) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    j = true;
                    try {
                        i(context, generatedAppGlideModule);
                        j = false;
                    } catch (Throwable th) {
                        j = false;
                        throw th;
                    }
                }
            }
        }
        return i;
    }

    @GuardedBy("Glide.class")
    private static void i(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        d dVar = new d();
        Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.o.b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new com.bumptech.glide.o.d(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d2 = generatedAppGlideModule.d();
            Iterator<com.bumptech.glide.o.b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                com.bumptech.glide.o.b next = it2.next();
                if (d2.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it2.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (com.bumptech.glide.o.b bVar : emptyList) {
                StringBuilder M = e.a.a.a.a.M("Discovered GlideModule from manifest: ");
                M.append(bVar.getClass());
                Log.d("Glide", M.toString());
            }
        }
        dVar.e(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<com.bumptech.glide.o.b> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c a2 = dVar.a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a2);
        i = a2;
    }

    private static void l(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    public static k n(@NonNull Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f1535e.b(context);
    }

    public void a() {
        com.bumptech.glide.util.j.a();
        this.b.a();
        this.a.a();
        this.f1534d.a();
    }

    @NonNull
    public com.bumptech.glide.load.engine.B.b c() {
        return this.f1534d;
    }

    @NonNull
    public com.bumptech.glide.load.engine.B.d d() {
        return this.a;
    }

    com.bumptech.glide.manager.c e() {
        return this.f1536f;
    }

    @NonNull
    public Context f() {
        return this.f1533c.getBaseContext();
    }

    @NonNull
    e g() {
        return this.f1533c;
    }

    @NonNull
    public g h() {
        return this.f1533c.i();
    }

    void j(k kVar) {
        synchronized (this.f1537g) {
            if (this.f1537g.contains(kVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f1537g.add(kVar);
        }
    }

    boolean k(@NonNull com.bumptech.glide.request.k.h<?> hVar) {
        synchronized (this.f1537g) {
            Iterator<k> it2 = this.f1537g.iterator();
            while (it2.hasNext()) {
                if (it2.next().w(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    void m(k kVar) {
        synchronized (this.f1537g) {
            if (!this.f1537g.contains(kVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f1537g.remove(kVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        com.bumptech.glide.util.j.a();
        this.b.a();
        this.a.a();
        this.f1534d.a();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        com.bumptech.glide.util.j.a();
        synchronized (this.f1537g) {
            Iterator<k> it2 = this.f1537g.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
        this.b.trimMemory(i2);
        this.a.trimMemory(i2);
        this.f1534d.trimMemory(i2);
    }
}
