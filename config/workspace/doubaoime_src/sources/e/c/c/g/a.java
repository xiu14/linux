package e.c.c.g;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.PropagatesNullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class a<T> implements Cloneable, Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static Class<a> f9754e = a.class;

    /* renamed from: f, reason: collision with root package name */
    private static final d<Closeable> f9755f = new C0447a();

    /* renamed from: g, reason: collision with root package name */
    private static final c f9756g = new b();
    public static final /* synthetic */ int h = 0;
    protected boolean a = false;
    protected final e<T> b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f9757c;

    /* renamed from: d, reason: collision with root package name */
    protected final Throwable f9758d;

    /* renamed from: e.c.c.g.a$a, reason: collision with other inner class name */
    static class C0447a implements d<Closeable> {
        C0447a() {
        }

        @Override // e.c.c.g.d
        public void release(Closeable closeable) {
            try {
                e.c.c.d.a.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    static class b implements c {
        b() {
        }

        @Override // e.c.c.g.a.c
        public void a(e<Object> eVar, Throwable th) {
        }

        @Override // e.c.c.g.a.c
        public boolean b() {
            return false;
        }
    }

    public interface c {
        void a(e<Object> eVar, Throwable th);

        boolean b();
    }

    protected a(e<T> eVar, c cVar, Throwable th) {
        Objects.requireNonNull(eVar);
        this.b = eVar;
        eVar.a();
        this.f9757c = cVar;
        this.f9758d = th;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Le/c/c/g/a$c;)Le/c/c/g/a<TT;>; */
    public static a A(@PropagatesNullable Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        d<Closeable> dVar = f9755f;
        Throwable th = cVar.b() ? new Throwable() : null;
        if (!(closeable instanceof Bitmap)) {
            boolean z = closeable instanceof e.c.c.g.c;
        }
        return new e.c.c.g.b(closeable, dVar, cVar, th);
    }

    public static <T> a<T> D(@PropagatesNullable T t, d<T> dVar) {
        return G(t, dVar, f9756g);
    }

    public static <T> a<T> G(@PropagatesNullable T t, d<T> dVar, c cVar) {
        if (t == null) {
            return null;
        }
        Throwable th = cVar.b() ? new Throwable() : null;
        if (!(t instanceof Bitmap)) {
            boolean z = t instanceof e.c.c.g.c;
        }
        return new e.c.c.g.b(t, dVar, cVar, th);
    }

    public static <T> a<T> h(a<T> aVar) {
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    public static <T> List<a<T>> l(@PropagatesNullable Collection<a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<a<T>> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(h(it2.next()));
        }
        return arrayList;
    }

    public static void o(a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static void p(Iterable<? extends a<?>> iterable) {
        if (iterable != null) {
            for (a<?> aVar : iterable) {
                if (aVar != null) {
                    aVar.close();
                }
            }
        }
    }

    public static boolean x(a<?> aVar) {
        return aVar != null && aVar.w();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Le/c/c/g/a<TT;>; */
    public static a z(@PropagatesNullable Closeable closeable) {
        return D(closeable, f9755f);
    }

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract a<T> clone();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b.b();
        }
    }

    public synchronized a<T> d() {
        if (!w()) {
            return null;
        }
        return clone();
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.a) {
                    return;
                }
                this.f9757c.a(this.b, this.f9758d);
                e.c.c.e.a.b(f9754e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.b)), this.b.d().getClass().getName());
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized T r() {
        return this.b.d();
    }

    public int s() {
        if (w()) {
            return System.identityHashCode(this.b.d());
        }
        return 0;
    }

    public synchronized boolean w() {
        return !this.a;
    }

    protected a(T t, d<T> dVar, c cVar, Throwable th) {
        this.b = new e<>(t, dVar);
        this.f9757c = cVar;
        this.f9758d = th;
    }
}
