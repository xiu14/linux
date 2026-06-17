package e.c.h.f;

import android.os.SystemClock;
import com.facebook.common.memory.MemoryTrimType;
import e.c.h.f.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class j<K, V> implements s<K, V>, com.facebook.common.memory.b {
    private final c<K> a;
    final h<K, b<K, V>> b;

    /* renamed from: c, reason: collision with root package name */
    final h<K, b<K, V>> f9870c;

    /* renamed from: d, reason: collision with root package name */
    private final y<V> f9871d;

    /* renamed from: e, reason: collision with root package name */
    private final s.a f9872e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.c.d.j<t> f9873f;

    /* renamed from: g, reason: collision with root package name */
    protected t f9874g;
    private long h;

    class a implements e.c.c.g.d<V> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // e.c.c.g.d
        public void release(V v) {
            j.c(j.this, this.a);
        }
    }

    public static class b<K, V> {
        public final K a;
        public final e.c.c.g.a<V> b;

        /* renamed from: c, reason: collision with root package name */
        public int f9875c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9876d;

        /* renamed from: e, reason: collision with root package name */
        public final c<K> f9877e;

        private b(K k, e.c.c.g.a<V> aVar, c<K> cVar) {
            Objects.requireNonNull(k);
            this.a = k;
            e.c.c.g.a<V> h = e.c.c.g.a.h(aVar);
            Objects.requireNonNull(h);
            this.b = h;
            this.f9875c = 0;
            this.f9876d = false;
            this.f9877e = cVar;
        }

        static <K, V> b<K, V> a(K k, e.c.c.g.a<V> aVar, c<K> cVar) {
            return new b<>(k, aVar, cVar);
        }
    }

    public interface c<K> {
        void a(K k, boolean z);
    }

    public j(y<V> yVar, s.a aVar, e.c.c.d.j<t> jVar, c<K> cVar) {
        new WeakHashMap();
        this.f9871d = yVar;
        this.b = new h<>(new i(this, yVar));
        this.f9870c = new h<>(new i(this, yVar));
        this.f9872e = aVar;
        this.f9873f = jVar;
        this.f9874g = jVar.get();
        this.h = SystemClock.uptimeMillis();
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void c(e.c.h.f.j r3, e.c.h.f.j.b r4) {
        /*
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r4)
            monitor-enter(r3)
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L52
            int r0 = r4.f9875c     // Catch: java.lang.Throwable -> L4f
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            e.c.c.d.h.f(r0)     // Catch: java.lang.Throwable -> L4f
            int r0 = r4.f9875c     // Catch: java.lang.Throwable -> L4f
            int r0 = r0 - r2
            r4.f9875c = r0     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L52
            boolean r0 = r4.f9876d     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L2d
            int r0 = r4.f9875c     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L2d
            e.c.h.f.h<K, e.c.h.f.j$b<K, V>> r0 = r3.b     // Catch: java.lang.Throwable -> L4c
            K r1 = r4.a     // Catch: java.lang.Throwable -> L4c
            r0.h(r1, r4)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            r1 = r2
            goto L2e
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
        L2e:
            e.c.c.g.a r0 = r3.p(r4)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            e.c.c.g.a.o(r0)
            if (r1 == 0) goto L39
            goto L3a
        L39:
            r4 = 0
        L3a:
            if (r4 == 0) goto L45
            e.c.h.f.j$c<K> r0 = r4.f9877e
            if (r0 == 0) goto L45
            K r4 = r4.a
            r0.a(r4, r2)
        L45:
            r3.n()
            r3.k()
            return
        L4c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            throw r4     // Catch: java.lang.Throwable -> L52
        L4f:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            throw r4     // Catch: java.lang.Throwable -> L52
        L52:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.h.f.j.c(e.c.h.f.j, e.c.h.f.j$b):void");
    }

    private synchronized void i(b<K, V> bVar) {
        Objects.requireNonNull(bVar);
        e.c.c.d.h.f(!bVar.f9876d);
        bVar.f9876d = true;
    }

    private void j(ArrayList<b<K, V>> arrayList) {
        Iterator<b<K, V>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e.c.c.g.a<V> p = p(it2.next());
            int i = e.c.c.g.a.h;
            if (p != null) {
                p.close();
            }
        }
    }

    private void k() {
        synchronized (this) {
            t tVar = this.f9874g;
            int min = Math.min(tVar.f9879d, tVar.b - g());
            t tVar2 = this.f9874g;
            s(min, Math.min(tVar2.f9878c, tVar2.a - h()));
        }
    }

    private static <K, V> void l(b<K, V> bVar) {
        c<K> cVar;
        if (bVar == null || (cVar = bVar.f9877e) == null) {
            return;
        }
        cVar.a(bVar.a, false);
    }

    private void m(ArrayList<b<K, V>> arrayList) {
        Iterator<b<K, V>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l(it2.next());
        }
    }

    private synchronized void n() {
        if (this.h + this.f9874g.f9881f > SystemClock.uptimeMillis()) {
            return;
        }
        this.h = SystemClock.uptimeMillis();
        this.f9874g = this.f9873f.get();
    }

    private synchronized e.c.c.g.a<V> o(b<K, V> bVar) {
        synchronized (this) {
            e.c.c.d.h.f(!bVar.f9876d);
            bVar.f9875c++;
        }
        return e.c.c.g.a.D(bVar.b.r(), new a(bVar));
        return e.c.c.g.a.D(bVar.b.r(), new a(bVar));
    }

    private synchronized e.c.c.g.a<V> p(b<K, V> bVar) {
        Objects.requireNonNull(bVar);
        return (bVar.f9876d && bVar.f9875c == 0) ? bVar.b : null;
    }

    private synchronized void s(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.b.d() <= max && this.b.f() <= max2) {
            return;
        }
        while (true) {
            if (this.b.d() <= max && this.b.f() <= max2) {
                return;
            }
            K e2 = this.b.e();
            if (e2 == null) {
                return;
            }
            this.b.i(e2);
            b<K, V> i3 = this.f9870c.i(e2);
            if (i3 != null) {
                i(i3);
                e.c.c.g.a.o(p(i3));
                l(i3);
            }
        }
    }

    @Override // com.facebook.common.memory.b
    public void a(MemoryTrimType memoryTrimType) {
        double a2 = this.f9872e.a(memoryTrimType);
        synchronized (this) {
            s(Integer.MAX_VALUE, Math.max(0, ((int) ((1.0d - a2) * this.f9870c.f())) - h()));
        }
        n();
        k();
    }

    @Override // e.c.h.f.s
    public e.c.c.g.a<V> b(K k, e.c.c.g.a<V> aVar) {
        return d(k, aVar, this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (h() <= (r7.f9874g.a - r3)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e.c.c.g.a<V> d(K r8, e.c.c.g.a<V> r9, e.c.h.f.j.c<K> r10) {
        /*
            r7 = this;
            java.util.Objects.requireNonNull(r8)
            java.util.Objects.requireNonNull(r9)
            r7.n()
            monitor-enter(r7)
            e.c.h.f.h<K, e.c.h.f.j$b<K, V>> r0 = r7.b     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r0.i(r8)     // Catch: java.lang.Throwable -> L6e
            e.c.h.f.j$b r0 = (e.c.h.f.j.b) r0     // Catch: java.lang.Throwable -> L6e
            e.c.h.f.h<K, e.c.h.f.j$b<K, V>> r1 = r7.f9870c     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r1.i(r8)     // Catch: java.lang.Throwable -> L6e
            e.c.h.f.j$b r1 = (e.c.h.f.j.b) r1     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            if (r1 == 0) goto L25
            r7.i(r1)     // Catch: java.lang.Throwable -> L6e
            e.c.c.g.a r1 = r7.p(r1)     // Catch: java.lang.Throwable -> L6e
            goto L26
        L25:
            r1 = r2
        L26:
            java.lang.Object r3 = r9.r()     // Catch: java.lang.Throwable -> L6e
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L6e
            e.c.h.f.y<V> r4 = r7.f9871d     // Catch: java.lang.Throwable -> L6b
            int r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L6b
            e.c.h.f.t r4 = r7.f9874g     // Catch: java.lang.Throwable -> L6b
            int r4 = r4.f9880e     // Catch: java.lang.Throwable -> L6b
            r5 = 1
            if (r3 > r4) goto L4f
            int r4 = r7.g()     // Catch: java.lang.Throwable -> L6b
            e.c.h.f.t r6 = r7.f9874g     // Catch: java.lang.Throwable -> L6b
            int r6 = r6.b     // Catch: java.lang.Throwable -> L6b
            int r6 = r6 - r5
            if (r4 > r6) goto L4f
            int r4 = r7.h()     // Catch: java.lang.Throwable -> L6b
            e.c.h.f.t r6 = r7.f9874g     // Catch: java.lang.Throwable -> L6b
            int r6 = r6.a     // Catch: java.lang.Throwable -> L6b
            int r6 = r6 - r3
            if (r4 > r6) goto L4f
            goto L50
        L4f:
            r5 = 0
        L50:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L60
            e.c.h.f.j$b r9 = e.c.h.f.j.b.a(r8, r9, r10)     // Catch: java.lang.Throwable -> L6e
            e.c.h.f.h<K, e.c.h.f.j$b<K, V>> r10 = r7.f9870c     // Catch: java.lang.Throwable -> L6e
            r10.h(r8, r9)     // Catch: java.lang.Throwable -> L6e
            e.c.c.g.a r2 = r7.o(r9)     // Catch: java.lang.Throwable -> L6e
        L60:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            e.c.c.g.a.o(r1)
            l(r0)
            r7.k()
            return r2
        L6b:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            throw r8     // Catch: java.lang.Throwable -> L6e
        L6e:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.h.f.j.d(java.lang.Object, e.c.c.g.a, e.c.h.f.j$c):e.c.c.g.a");
    }

    public void e() {
        synchronized (this) {
            ArrayList<b<K, V>> a2 = this.b.a();
            ArrayList<b<K, V>> a3 = this.f9870c.a();
            synchronized (this) {
                Iterator<b<K, V>> it2 = a3.iterator();
                while (it2.hasNext()) {
                    i(it2.next());
                }
            }
            j(a3);
            m(a2);
            n();
        }
        j(a3);
        m(a2);
        n();
    }

    public synchronized boolean f(K k) {
        return this.f9870c.b(k);
    }

    public synchronized int g() {
        return this.f9870c.d() - this.b.d();
    }

    @Override // e.c.h.f.s
    public e.c.c.g.a<V> get(K k) {
        b<K, V> i;
        e.c.c.g.a<V> o;
        Objects.requireNonNull(k);
        synchronized (this) {
            i = this.b.i(k);
            b<K, V> c2 = this.f9870c.c(k);
            o = c2 != null ? o(c2) : null;
        }
        l(i);
        n();
        k();
        return o;
    }

    public synchronized int h() {
        return this.f9870c.f() - this.b.f();
    }

    public int q(e.c.c.d.i<K> iVar) {
        ArrayList<b<K, V>> j;
        ArrayList<b<K, V>> arrayList = new ArrayList<>();
        synchronized (this) {
            j = this.b.j(iVar);
            for (int i = 0; i < j.size(); i++) {
                arrayList.add(this.f9870c.i(j.get(i).a));
            }
        }
        j(arrayList);
        m(j);
        n();
        k();
        return arrayList.size();
    }

    public e.c.c.g.a<V> r(K k) {
        b<K, V> i;
        boolean z;
        e.c.c.g.a<V> aVar;
        Objects.requireNonNull(k);
        synchronized (this) {
            i = this.b.i(k);
            z = true;
            if (i != null) {
                b<K, V> i2 = this.f9870c.i(k);
                Objects.requireNonNull(i2);
                e.c.c.d.h.f(i2.f9875c == 0);
                aVar = i2.b;
            } else {
                aVar = null;
                z = false;
            }
        }
        if (z) {
            l(i);
        }
        return aVar;
    }
}
