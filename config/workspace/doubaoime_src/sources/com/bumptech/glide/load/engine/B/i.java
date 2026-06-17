package com.bumptech.glide.load.engine.B;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements com.bumptech.glide.load.engine.B.b {
    private final g<a, Object> a = new g<>();
    private final b b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f1589c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.engine.B.a<?>> f1590d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f1591e;

    /* renamed from: f, reason: collision with root package name */
    private int f1592f;

    private static final class a implements l {
        private final b a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f1593c;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.B.l
        public void a() {
            this.a.c(this);
        }

        void b(int i, Class<?> cls) {
            this.b = i;
            this.f1593c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.f1593c == aVar.f1593c;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.f1593c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Key{size=");
            M.append(this.b);
            M.append("array=");
            M.append(this.f1593c);
            M.append('}');
            return M.toString();
        }
    }

    private static final class b extends c<a> {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.B.c
        protected a a() {
            return new a(this);
        }

        a d(int i, Class<?> cls) {
            a b = b();
            b.b(i, cls);
            return b;
        }
    }

    public i(int i) {
        this.f1591e = i;
    }

    private void d(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> h = h(cls);
        Integer num = (Integer) h.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                h.remove(Integer.valueOf(i));
                return;
            } else {
                h.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    private void e(int i) {
        while (this.f1592f > i) {
            Object c2 = this.a.c();
            Objects.requireNonNull(c2, "Argument must not be null");
            com.bumptech.glide.load.engine.B.a f2 = f(c2.getClass());
            this.f1592f -= f2.c(c2) * f2.b();
            d(f2.c(c2), c2.getClass());
            if (Log.isLoggable(f2.a(), 2)) {
                String a2 = f2.a();
                StringBuilder M = e.a.a.a.a.M("evicted: ");
                M.append(f2.c(c2));
                Log.v(a2, M.toString());
            }
        }
    }

    private <T> com.bumptech.glide.load.engine.B.a<T> f(Class<T> cls) {
        com.bumptech.glide.load.engine.B.a<T> aVar = (com.bumptech.glide.load.engine.B.a) this.f1590d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    StringBuilder M = e.a.a.a.a.M("No array pool found for: ");
                    M.append(cls.getSimpleName());
                    throw new IllegalArgumentException(M.toString());
                }
                aVar = new f();
            }
            this.f1590d.put(cls, aVar);
        }
        return aVar;
    }

    private <T> T g(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.B.a<T> f2 = f(cls);
        T t = (T) this.a.a(aVar);
        if (t != null) {
            this.f1592f -= f2.c(t) * f2.b();
            d(f2.c(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(f2.a(), 2)) {
            String a2 = f2.a();
            StringBuilder M = e.a.a.a.a.M("Allocated ");
            M.append(aVar.b);
            M.append(" bytes");
            Log.v(a2, M.toString());
        }
        return f2.newArray(aVar.b);
    }

    private NavigableMap<Integer, Integer> h(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f1589c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1589c.put(cls, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.B.b
    public synchronized void a() {
        e(0);
    }

    @Override // com.bumptech.glide.load.engine.B.b
    public synchronized <T> T b(int i, Class<T> cls) {
        a b2;
        b2 = this.b.b();
        b2.b(i, cls);
        return (T) g(b2, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0046, B:22:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0046, B:22:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0046, B:22:0x003a), top: B:2:0x0001 }] */
    @Override // com.bumptech.glide.load.engine.B.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T> T c(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.h(r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L4c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            int r3 = r5.f1592f     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L20
            int r4 = r5.f1591e     // Catch: java.lang.Throwable -> L4c
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L1e
            goto L20
        L1e:
            r3 = r2
            goto L21
        L20:
            r3 = r1
        L21:
            if (r3 != 0) goto L2d
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L4c
            int r4 = r6 * 8
            if (r3 > r4) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            if (r1 == 0) goto L3a
            com.bumptech.glide.load.engine.B.i$b r6 = r5.b     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.load.engine.B.i$a r6 = r6.d(r0, r7)     // Catch: java.lang.Throwable -> L4c
            goto L46
        L3a:
            com.bumptech.glide.load.engine.B.i$b r0 = r5.b     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.load.engine.B.l r0 = r0.b()     // Catch: java.lang.Throwable -> L4c
            com.bumptech.glide.load.engine.B.i$a r0 = (com.bumptech.glide.load.engine.B.i.a) r0     // Catch: java.lang.Throwable -> L4c
            r0.b(r6, r7)     // Catch: java.lang.Throwable -> L4c
            r6 = r0
        L46:
            java.lang.Object r6 = r5.g(r6, r7)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r5)
            return r6
        L4c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.B.i.c(int, java.lang.Class):java.lang.Object");
    }

    @Override // com.bumptech.glide.load.engine.B.b
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        com.bumptech.glide.load.engine.B.a<T> f2 = f(cls);
        int c2 = f2.c(t);
        int b2 = f2.b() * c2;
        int i = 1;
        if (b2 <= this.f1591e / 2) {
            a d2 = this.b.d(c2, cls);
            this.a.b(d2, t);
            NavigableMap<Integer, Integer> h = h(cls);
            Integer num = (Integer) h.get(Integer.valueOf(d2.b));
            Integer valueOf = Integer.valueOf(d2.b);
            if (num != null) {
                i = 1 + num.intValue();
            }
            h.put(valueOf, Integer.valueOf(i));
            this.f1592f += b2;
            e(this.f1591e);
        }
    }

    @Override // com.bumptech.glide.load.engine.B.b
    public synchronized void trimMemory(int i) {
        if (i >= 40) {
            synchronized (this) {
                e(0);
            }
        } else if (i >= 20 || i == 15) {
            e(this.f1591e / 2);
        }
    }
}
