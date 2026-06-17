package e.c.h.f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class f {
    private final com.facebook.cache.disk.i a;
    private final com.facebook.common.memory.h b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.common.memory.k f9862c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f9863d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f9864e;

    /* renamed from: f, reason: collision with root package name */
    private final x f9865f = x.b();

    /* renamed from: g, reason: collision with root package name */
    private final p f9866g;
    private boolean h;
    private boolean i;

    class a implements Callable<com.facebook.imagepipeline.image.f> {
        final /* synthetic */ AtomicBoolean a;
        final /* synthetic */ com.facebook.cache.common.b b;

        a(Object obj, AtomicBoolean atomicBoolean, com.facebook.cache.common.b bVar) {
            this.a = atomicBoolean;
            this.b = bVar;
        }

        @Override // java.util.concurrent.Callable
        public com.facebook.imagepipeline.image.f call() throws Exception {
            Map<String, String> c2;
            com.facebook.common.memory.g h;
            try {
                if (this.a.get()) {
                    throw new CancellationException();
                }
                com.facebook.imagepipeline.image.f a = f.this.f9865f.a(this.b);
                if (a != null) {
                    e.c.c.e.a.n(f.class, "Found image for %s in staging area", this.b.b());
                    Objects.requireNonNull((w) f.this.f9866g);
                } else {
                    e.c.c.e.a.n(f.class, "Did not find image for %s in staging area", this.b.b());
                    Objects.requireNonNull((w) f.this.f9866g);
                    a = null;
                    try {
                        c2 = f.this.a.c(this.b);
                        if (f.this.h) {
                            h = f.g(f.this, this.b, c2.get(this.b.b()));
                        } else {
                            h = f.h(f.this, this.b);
                        }
                    } catch (Exception unused) {
                    }
                    if (h == null) {
                        return a;
                    }
                    e.c.c.g.a z = e.c.c.g.a.z(h);
                    try {
                        com.facebook.imagepipeline.image.f fVar = new com.facebook.imagepipeline.image.f(z);
                        fVar.o0(c2);
                        z.close();
                        a = fVar;
                    } catch (Throwable th) {
                        if (z != null) {
                            z.close();
                        }
                        throw th;
                    }
                }
                if (Thread.interrupted()) {
                    int i = e.c.c.e.a.a;
                    e.c.c.e.b bVar = e.c.c.e.b.b;
                    if (bVar.e(2)) {
                        bVar.i(f.class.getSimpleName(), "Host thread was interrupted, decreasing reference count");
                    }
                    a.close();
                    throw new InterruptedException();
                }
                return a;
            } finally {
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ com.facebook.cache.common.b a;
        final /* synthetic */ com.facebook.imagepipeline.image.f b;

        b(Object obj, com.facebook.cache.common.b bVar, com.facebook.imagepipeline.image.f fVar) {
            this.a = bVar;
            this.b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.c.h.m.b.b();
                if (f.this.i) {
                    f.j(f.this, this.a, this.b);
                } else {
                    f.this.s(this.a, this.b);
                }
            } finally {
                f.this.f9865f.f(this.a, this.b);
                com.facebook.imagepipeline.image.f.d(this.b);
            }
        }
    }

    class c implements Callable<Void> {
        final /* synthetic */ com.facebook.cache.common.b a;

        c(Object obj, com.facebook.cache.common.b bVar) {
            this.a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            try {
                f.this.f9865f.e(this.a);
                f.this.a.g(this.a);
                return null;
            } finally {
            }
        }
    }

    class d implements com.facebook.cache.common.i {
        final /* synthetic */ com.facebook.imagepipeline.image.f a;

        d(com.facebook.imagepipeline.image.f fVar) {
            this.a = fVar;
        }

        @Override // com.facebook.cache.common.i
        public void a(OutputStream outputStream) throws IOException {
            f.this.f9862c.a(this.a.A(), outputStream);
        }
    }

    public f(com.facebook.cache.disk.i iVar, com.facebook.common.memory.h hVar, com.facebook.common.memory.k kVar, Executor executor, Executor executor2, p pVar) {
        this.a = iVar;
        this.b = hVar;
        this.f9862c = kVar;
        this.f9863d = executor;
        this.f9864e = executor2;
        this.f9866g = pVar;
    }

    static com.facebook.common.memory.g g(f fVar, com.facebook.cache.common.b bVar, String str) throws IOException {
        Objects.requireNonNull(fVar);
        try {
            e.c.c.e.a.o(f.class, "Disk cache read for %s, compare to md5:%s", bVar.b(), str);
            e.c.a.a d2 = fVar.a.d(bVar);
            if (d2 == null) {
                e.c.c.e.a.n(f.class, "Disk cache miss for %s", bVar.b());
                Objects.requireNonNull((w) fVar.f9866g);
                return null;
            }
            e.c.c.e.a.n(f.class, "Found entry in disk cache for %s", bVar.b());
            Objects.requireNonNull((w) fVar.f9866g);
            InputStream c2 = d2.c();
            try {
                com.facebook.common.memory.g c3 = fVar.b.c(c2, (int) d2.d(), str);
                if (c3 == null) {
                    e.c.c.e.a.n(f.class, "Failed read from disk cache or MD5 did not match for %s", bVar.b());
                    Objects.requireNonNull((w) fVar.f9866g);
                } else {
                    e.c.c.e.a.n(f.class, "Successful read from disk cache for %s", bVar.b());
                    Objects.requireNonNull((w) fVar.f9866g);
                }
                return c3;
            } finally {
                c2.close();
            }
        } catch (IOException e2) {
            e.c.c.e.a.w(f.class, e2, "Exception reading from cache for %s", bVar.b());
            Objects.requireNonNull((w) fVar.f9866g);
            throw e2;
        }
    }

    static com.facebook.common.memory.g h(f fVar, com.facebook.cache.common.b bVar) throws Exception {
        Objects.requireNonNull(fVar);
        try {
            e.c.c.e.a.o(f.class, "Disk cache read for %s needEncrypt = %s", bVar.b(), Boolean.valueOf(fVar.i));
            e.c.a.a d2 = fVar.a.d(bVar);
            com.facebook.common.memory.g gVar = null;
            if (d2 == null) {
                e.c.c.e.a.n(f.class, "Disk cache miss for %s", bVar.b());
                Objects.requireNonNull((w) fVar.f9866g);
            } else {
                e.c.c.e.a.n(f.class, "Found entry in disk cache for %s", bVar.b());
                Objects.requireNonNull((w) fVar.f9866g);
                InputStream c2 = d2.c();
                try {
                    if (fVar.i) {
                        byte[] a2 = q.a(c2);
                        if (a2 != null) {
                            gVar = fVar.b.b(a2);
                        }
                    } else {
                        gVar = fVar.b.e(c2, (int) d2.d());
                    }
                    c2.close();
                    e.c.c.e.a.o(f.class, "Successful read from disk cache for %s needEncrypt = %s", bVar.b(), Boolean.valueOf(fVar.i));
                } catch (Throwable th) {
                    c2.close();
                    throw th;
                }
            }
            return gVar;
        } catch (Exception e2) {
            e.c.c.e.a.w(f.class, e2, "Exception reading from cache for %s needEncrypt = %s", bVar.b(), Boolean.valueOf(fVar.i));
            Objects.requireNonNull((w) fVar.f9866g);
            throw e2;
        }
    }

    static void j(f fVar, com.facebook.cache.common.b bVar, com.facebook.imagepipeline.image.f fVar2) {
        com.facebook.imagepipeline.image.f fVar3;
        Objects.requireNonNull(fVar);
        e.c.c.e.a.n(f.class, "About to write to disk-cache encrypt for key %s", bVar.b());
        com.facebook.imagepipeline.image.f fVar4 = null;
        try {
            try {
                byte[] b2 = q.b(fVar2.A());
                if (b2 != null) {
                    fVar3 = new com.facebook.imagepipeline.image.f(e.c.c.g.a.z(fVar.b.b(b2)));
                    try {
                        fVar3.h(fVar2);
                        fVar.s(bVar, fVar3);
                        fVar4 = fVar3;
                    } catch (Exception e2) {
                        e = e2;
                        fVar4 = fVar3;
                        e.c.c.e.a.w(f.class, e, "Failed to write to disk-cache encrypt for key %s", bVar.b());
                        com.facebook.imagepipeline.image.f.d(fVar4);
                    } catch (Throwable th) {
                        th = th;
                        com.facebook.imagepipeline.image.f.d(fVar3);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fVar3 = fVar4;
            }
        } catch (Exception e3) {
            e = e3;
        }
        com.facebook.imagepipeline.image.f.d(fVar4);
    }

    private c.h<com.facebook.imagepipeline.image.f> m(com.facebook.cache.common.b bVar, AtomicBoolean atomicBoolean) {
        try {
            return c.h.a(new a(null, atomicBoolean, bVar), this.f9863d);
        } catch (Exception e2) {
            e.c.c.e.a.w(f.class, e2, "Failed to schedule disk-cache read for %s", bVar.b());
            ExecutorService executorService = c.h.h;
            c.i iVar = new c.i();
            iVar.c(e2);
            return iVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(com.facebook.cache.common.b bVar, com.facebook.imagepipeline.image.f fVar) {
        e.c.c.e.a.n(f.class, "About to write to disk-cache for key %s", bVar.b());
        try {
            this.a.i(new com.facebook.cache.disk.e(bVar, fVar.s()), new d(fVar));
            Objects.requireNonNull((w) this.f9866g);
            e.c.c.e.a.n(f.class, "Successful disk-cache write for key %s", bVar.b());
        } catch (IOException e2) {
            e.c.c.e.a.w(f.class, e2, "Failed to write to disk-cache for key %s", bVar.b());
        }
    }

    public void k(com.facebook.cache.common.b bVar) {
        this.a.b(bVar);
    }

    public c.h<com.facebook.imagepipeline.image.f> l(com.facebook.cache.common.b bVar, AtomicBoolean atomicBoolean) {
        try {
            e.c.h.m.b.b();
            com.facebook.imagepipeline.image.f a2 = this.f9865f.a(bVar);
            if (a2 == null) {
                return m(bVar, atomicBoolean);
            }
            e.c.c.e.a.n(f.class, "Found image for %s in staging area", ((com.facebook.cache.common.h) bVar).b());
            Objects.requireNonNull((w) this.f9866g);
            return c.h.c(a2);
        } finally {
            e.c.h.m.b.b();
        }
    }

    public boolean n() {
        return this.h;
    }

    public void o(com.facebook.cache.common.b bVar, com.facebook.imagepipeline.image.f fVar) {
        try {
            e.c.h.m.b.b();
            Objects.requireNonNull(bVar);
            e.c.c.d.h.a(com.facebook.imagepipeline.image.f.c0(fVar));
            this.f9865f.d(bVar, fVar);
            com.facebook.imagepipeline.image.f a2 = com.facebook.imagepipeline.image.f.a(fVar);
            try {
                this.f9864e.execute(new b(null, bVar, a2));
            } catch (Exception e2) {
                e.c.c.e.a.w(f.class, e2, "Failed to schedule disk-cache write for %s", bVar.b());
                this.f9865f.f(bVar, fVar);
                com.facebook.imagepipeline.image.f.d(a2);
            }
        } finally {
            e.c.h.m.b.b();
        }
    }

    public c.h<Void> p(com.facebook.cache.common.b bVar) {
        Objects.requireNonNull(bVar);
        this.f9865f.e(bVar);
        try {
            return c.h.a(new c(null, bVar), this.f9864e);
        } catch (Exception e2) {
            e.c.c.e.a.w(f.class, e2, "Failed to schedule disk-cache remove for %s", bVar.b());
            ExecutorService executorService = c.h.h;
            c.i iVar = new c.i();
            iVar.c(e2);
            return iVar.a();
        }
    }

    public void q(boolean z) {
        this.i = z;
    }

    public void r(boolean z) {
        this.h = z;
    }
}
