package e.c.h.f;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class x {
    private Map<com.facebook.cache.common.b, com.facebook.imagepipeline.image.f> a = new HashMap();

    private x() {
    }

    public static x b() {
        return new x();
    }

    private synchronized void c() {
        e.c.c.e.a.n(x.class, "Count = %d", Integer.valueOf(this.a.size()));
    }

    public synchronized com.facebook.imagepipeline.image.f a(com.facebook.cache.common.b bVar) {
        Objects.requireNonNull(bVar);
        com.facebook.imagepipeline.image.f fVar = this.a.get(bVar);
        if (fVar != null) {
            synchronized (fVar) {
                if (!com.facebook.imagepipeline.image.f.c0(fVar)) {
                    this.a.remove(bVar);
                    e.c.c.e.a.v(x.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(fVar)), bVar.b(), Integer.valueOf(System.identityHashCode(bVar)));
                    return null;
                }
                fVar = com.facebook.imagepipeline.image.f.a(fVar);
            }
        }
        return fVar;
    }

    public synchronized void d(com.facebook.cache.common.b bVar, com.facebook.imagepipeline.image.f fVar) {
        e.c.c.d.h.a(com.facebook.imagepipeline.image.f.c0(fVar));
        com.facebook.imagepipeline.image.f.d(this.a.put(bVar, com.facebook.imagepipeline.image.f.a(fVar)));
        c();
    }

    public boolean e(com.facebook.cache.common.b bVar) {
        com.facebook.imagepipeline.image.f remove;
        Objects.requireNonNull(bVar);
        synchronized (this) {
            remove = this.a.remove(bVar);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.a0();
        } finally {
            remove.close();
        }
    }

    public synchronized boolean f(com.facebook.cache.common.b bVar, com.facebook.imagepipeline.image.f fVar) {
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(fVar);
        e.c.c.d.h.a(com.facebook.imagepipeline.image.f.c0(fVar));
        com.facebook.imagepipeline.image.f fVar2 = this.a.get(bVar);
        if (fVar2 == null) {
            return false;
        }
        e.c.c.g.a<com.facebook.common.memory.g> l = fVar2.l();
        e.c.c.g.a<com.facebook.common.memory.g> l2 = fVar.l();
        if (l != null && l2 != null) {
            try {
                if (l.r() == l2.r()) {
                    this.a.remove(bVar);
                    e.c.c.g.a.o(l2);
                    e.c.c.g.a.o(l);
                    com.facebook.imagepipeline.image.f.d(fVar2);
                    c();
                    return true;
                }
            } finally {
                e.c.c.g.a.o(l2);
                e.c.c.g.a.o(l);
                com.facebook.imagepipeline.image.f.d(fVar2);
            }
        }
        return false;
    }
}
