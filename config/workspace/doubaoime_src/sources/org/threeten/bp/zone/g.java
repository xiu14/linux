package org.threeten.bp.zone;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class g {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicReference<g> b = new AtomicReference<>();

    static class a extends g {
        a() {
        }

        @Override // org.threeten.bp.zone.g
        protected void b() {
            Iterator it2 = ServiceLoader.load(h.class, h.class.getClassLoader()).iterator();
            while (it2.hasNext()) {
                try {
                    h.d((h) it2.next());
                } catch (ServiceConfigurationError e2) {
                    if (!(e2.getCause() instanceof SecurityException)) {
                        throw e2;
                    }
                }
            }
        }
    }

    static void a() {
        if (a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<g> atomicReference = b;
        atomicReference.compareAndSet(null, new a());
        atomicReference.get().b();
    }

    public static void c(g gVar) {
        if (a.get()) {
            throw new IllegalStateException("Already initialized");
        }
        if (!b.compareAndSet(null, gVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    protected abstract void b();
}
