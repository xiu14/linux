package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.memory.MemoryTrimType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0719b<V> implements com.facebook.common.memory.e<V> {
    private final Class<?> a;
    final com.facebook.common.memory.c b;

    /* renamed from: c, reason: collision with root package name */
    final B f6492c;

    /* renamed from: d, reason: collision with root package name */
    final SparseArray<g<V>> f6493d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<V> f6494e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6495f;

    /* renamed from: g, reason: collision with root package name */
    final a f6496g;
    final a h;
    private final C i;
    private boolean j;

    /* renamed from: com.facebook.imagepipeline.memory.b$a */
    static class a {
        int a;
        int b;

        a() {
        }

        public void a(int i) {
            int i2;
            int i3 = this.b;
            if (i3 < i || (i2 = this.a) <= 0) {
                e.c.c.e.a.z("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.b), Integer.valueOf(this.a));
            } else {
                this.a = i2 - 1;
                this.b = i3 - i;
            }
        }

        public void b(int i) {
            this.a++;
            this.b += i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$b, reason: collision with other inner class name */
    public static class C0327b extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0327b(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Invalid size: "
                java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.AbstractC0719b.C0327b.<init>(java.lang.Object):void");
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.b$c */
    public static class c extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(int r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                java.lang.String r0 = "Pool hard cap violation? Hard cap = "
                java.lang.String r1 = " Used size = "
                java.lang.String r2 = " Free size = "
                java.lang.StringBuilder r4 = e.a.a.a.a.O(r0, r4, r1, r5, r2)
                r4.append(r6)
                java.lang.String r5 = " Request size = "
                r4.append(r5)
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.AbstractC0719b.c.<init>(int, int, int, int):void");
        }
    }

    public AbstractC0719b(com.facebook.common.memory.c cVar, B b, C c2) {
        this.a = getClass();
        Objects.requireNonNull(cVar);
        this.b = cVar;
        Objects.requireNonNull(b);
        this.f6492c = b;
        Objects.requireNonNull(c2);
        this.i = c2;
        this.f6493d = new SparseArray<>();
        m(new SparseIntArray(0));
        this.f6494e = Collections.newSetFromMap(new IdentityHashMap());
        this.h = new a();
        this.f6496g = new a();
    }

    private synchronized void m(SparseIntArray sparseIntArray) {
        this.f6493d.clear();
        SparseIntArray sparseIntArray2 = this.f6492c.f6488c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                int valueAt = sparseIntArray2.valueAt(i);
                int i2 = sparseIntArray.get(keyAt, 0);
                SparseArray<g<V>> sparseArray = this.f6493d;
                int h = h(keyAt);
                Objects.requireNonNull(this.f6492c);
                sparseArray.put(keyAt, new g<>(h, valueAt, i2, false));
            }
            this.f6495f = false;
        } else {
            this.f6495f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void n() {
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.q(this.a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f6496g.a), Integer.valueOf(this.f6496g.b), Integer.valueOf(this.h.a), Integer.valueOf(this.h.b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.common.memory.b
    public void a(MemoryTrimType memoryTrimType) {
        ArrayList arrayList;
        int i;
        synchronized (this) {
            Objects.requireNonNull(this.f6492c);
            arrayList = new ArrayList(this.f6493d.size());
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (int i2 = 0; i2 < this.f6493d.size(); i2++) {
                g<V> valueAt = this.f6493d.valueAt(i2);
                if (valueAt.d() > 0) {
                    arrayList.add(valueAt);
                }
                sparseIntArray.put(this.f6493d.keyAt(i2), valueAt.e());
            }
            m(sparseIntArray);
            a aVar = this.h;
            aVar.a = 0;
            aVar.b = 0;
            n();
        }
        for (i = 0; i < arrayList.size(); i++) {
            g gVar = (g) arrayList.get(i);
            while (true) {
                Object h = gVar.h();
                if (h == null) {
                    break;
                } else {
                    d(h);
                }
            }
        }
    }

    protected abstract V b(int i);

    synchronized boolean c(int i) {
        if (this.j) {
            return true;
        }
        B b = this.f6492c;
        int i2 = b.a;
        int i3 = this.f6496g.b;
        if (i > i2 - i3) {
            this.i.f();
            return false;
        }
        int i4 = b.b;
        if (i > i4 - (i3 + this.h.b)) {
            p(i4 - i);
        }
        if (i <= i2 - (this.f6496g.b + this.h.b)) {
            return true;
        }
        this.i.f();
        return false;
    }

    protected abstract void d(V v);

    synchronized g<V> e(int i) {
        g<V> gVar = this.f6493d.get(i);
        if (gVar == null && this.f6495f) {
            if (e.c.c.e.a.m(2)) {
                e.c.c.e.a.n(this.a, "creating new bucket %s", Integer.valueOf(i));
            }
            g<V> o = o(i);
            this.f6493d.put(i, o);
            return o;
        }
        return gVar;
    }

    protected abstract int f(int i);

    protected abstract int g(V v);

    @Override // com.facebook.common.memory.e
    public V get(int i) {
        boolean z;
        V i2;
        synchronized (this) {
            if (k() && this.h.b != 0) {
                z = false;
                e.c.c.d.h.f(z);
            }
            z = true;
            e.c.c.d.h.f(z);
        }
        int f2 = f(i);
        synchronized (this) {
            g<V> e2 = e(f2);
            if (e2 != null && (i2 = i(e2)) != null) {
                e.c.c.d.h.f(this.f6494e.add(i2));
                int g2 = g(i2);
                int h = h(g2);
                this.f6496g.b(h);
                this.h.a(h);
                this.i.b(h);
                n();
                if (e.c.c.e.a.m(2)) {
                    e.c.c.e.a.o(this.a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(i2)), Integer.valueOf(g2));
                }
                return i2;
            }
            int h2 = h(f2);
            if (!c(h2)) {
                throw new c(this.f6492c.a, this.f6496g.b, this.h.b, h2);
            }
            this.f6496g.b(h2);
            if (e2 != null) {
                e2.f();
            }
            V v = null;
            try {
                v = b(f2);
            } catch (Throwable th) {
                synchronized (this) {
                    this.f6496g.a(h2);
                    g<V> e3 = e(f2);
                    if (e3 != null) {
                        e3.b();
                    }
                    e.c.c.d.h.j(th);
                }
            }
            synchronized (this) {
                e.c.c.d.h.f(this.f6494e.add(v));
                synchronized (this) {
                    if (k()) {
                        p(this.f6492c.b);
                    }
                }
                return v;
            }
            this.i.a(h2);
            n();
            if (e.c.c.e.a.m(2)) {
                e.c.c.e.a.o(this.a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(f2));
            }
            return v;
        }
    }

    protected abstract int h(int i);

    protected synchronized V i(g<V> gVar) {
        return gVar.c();
    }

    protected void j() {
        this.b.a(this);
        this.i.c(this);
    }

    synchronized boolean k() {
        boolean z;
        z = this.f6496g.b + this.h.b > this.f6492c.b;
        if (z) {
            this.i.d();
        }
        return z;
    }

    protected boolean l(V v) {
        return true;
    }

    g<V> o(int i) {
        int h = h(i);
        Objects.requireNonNull(this.f6492c);
        return new g<>(h, Integer.MAX_VALUE, 0, false);
    }

    synchronized void p(int i) {
        int i2 = this.f6496g.b;
        int i3 = this.h.b;
        int min = Math.min((i2 + i3) - i, i3);
        if (min <= 0) {
            return;
        }
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.p(this.a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f6496g.b + this.h.b), Integer.valueOf(min));
        }
        n();
        for (int i4 = 0; i4 < this.f6493d.size() && min > 0; i4++) {
            g<V> valueAt = this.f6493d.valueAt(i4);
            while (min > 0) {
                V h = valueAt.h();
                if (h == null) {
                    break;
                }
                d(h);
                int i5 = valueAt.a;
                min -= i5;
                this.h.a(i5);
            }
        }
        n();
        if (e.c.c.e.a.m(2)) {
            e.c.c.e.a.o(this.a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f6496g.b + this.h.b));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r2.b();
     */
    @Override // com.facebook.common.memory.e, e.c.c.g.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void release(V r8) {
        /*
            r7 = this;
            java.util.Objects.requireNonNull(r8)
            int r0 = r7.g(r8)
            int r1 = r7.h(r0)
            monitor-enter(r7)
            monitor-enter(r7)     // Catch: java.lang.Throwable -> Lb4
            android.util.SparseArray<com.facebook.imagepipeline.memory.g<V>> r2 = r7.f6493d     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> Lb6
            com.facebook.imagepipeline.memory.g r2 = (com.facebook.imagepipeline.memory.g) r2     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb4
            java.util.Set<V> r3 = r7.f6494e     // Catch: java.lang.Throwable -> Lb4
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lb4
            r4 = 2
            if (r3 != 0) goto L43
            java.lang.Class<?> r2 = r7.a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lb4
            r5 = 0
            int r6 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lb4
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lb4
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lb4
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lb4
            e.c.c.e.a.g(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb4
            r7.d(r8)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.imagepipeline.memory.C r8 = r7.i     // Catch: java.lang.Throwable -> Lb4
            r8.e(r1)     // Catch: java.lang.Throwable -> Lb4
            goto Laf
        L43:
            if (r2 == 0) goto L84
            boolean r3 = r2.g()     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto L84
            boolean r3 = r7.k()     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto L84
            boolean r3 = r7.l(r8)     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto L58
            goto L84
        L58:
            r2.i(r8)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.imagepipeline.memory.b$a r2 = r7.h     // Catch: java.lang.Throwable -> Lb4
            r2.b(r1)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.imagepipeline.memory.b$a r2 = r7.f6496g     // Catch: java.lang.Throwable -> Lb4
            r2.a(r1)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.imagepipeline.memory.C r2 = r7.i     // Catch: java.lang.Throwable -> Lb4
            r2.g(r1)     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = e.c.c.e.a.m(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto Laf
            java.lang.Class<?> r1 = r7.a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lb4
            e.c.c.e.a.o(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lb4
            goto Laf
        L84:
            if (r2 == 0) goto L89
            r2.b()     // Catch: java.lang.Throwable -> Lb4
        L89:
            boolean r2 = e.c.c.e.a.m(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto La2
            java.lang.Class<?> r2 = r7.a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lb4
            e.c.c.e.a.o(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lb4
        La2:
            r7.d(r8)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.imagepipeline.memory.b$a r8 = r7.f6496g     // Catch: java.lang.Throwable -> Lb4
            r8.a(r1)     // Catch: java.lang.Throwable -> Lb4
            com.facebook.imagepipeline.memory.C r8 = r7.i     // Catch: java.lang.Throwable -> Lb4
            r8.e(r1)     // Catch: java.lang.Throwable -> Lb4
        Laf:
            r7.n()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb4
            return
        Lb4:
            r8 = move-exception
            goto Lb9
        Lb6:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb4
            throw r8     // Catch: java.lang.Throwable -> Lb4
        Lb9:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb4
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.AbstractC0719b.release(java.lang.Object):void");
    }

    public AbstractC0719b(com.facebook.common.memory.c cVar, B b, C c2, boolean z) {
        this(cVar, b, c2);
        this.j = z;
    }
}
