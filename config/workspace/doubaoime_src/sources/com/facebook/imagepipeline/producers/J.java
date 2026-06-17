package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class J<K, T extends Closeable> implements U<T> {
    final Map<K, J<K, T>.b> a;
    private final U<T> b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6539c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6540d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6541e;

    /* JADX WARN: Field signature parse error: a
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TK at position 1 ('K'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:160)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
     */
    class b {
        private final Object a;
        private final CopyOnWriteArraySet<Pair<InterfaceC0732l<T>, V>> b = new CopyOnWriteArraySet<>();

        /* renamed from: c, reason: collision with root package name */
        private T f6542c;

        /* renamed from: d, reason: collision with root package name */
        private float f6543d;

        /* renamed from: e, reason: collision with root package name */
        private int f6544e;

        /* renamed from: f, reason: collision with root package name */
        private C0724d f6545f;

        /* renamed from: g, reason: collision with root package name */
        private J<K, T>.b.a f6546g;

        private class a extends AbstractC0722b<T> {
            a(a aVar) {
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0722b
            protected void g() {
                try {
                    e.c.h.m.b.b();
                    b.this.l(this);
                } finally {
                    e.c.h.m.b.b();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0722b
            protected void h(Throwable th) {
                try {
                    e.c.h.m.b.b();
                    b.this.m(this, th);
                } finally {
                    e.c.h.m.b.b();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.imagepipeline.producers.AbstractC0722b
            protected void i(Object obj, int i) {
                Closeable closeable = (Closeable) obj;
                try {
                    e.c.h.m.b.b();
                    b.this.n(this, closeable, i);
                } finally {
                    e.c.h.m.b.b();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0722b
            protected void j(float f2) {
                try {
                    e.c.h.m.b.b();
                    b.this.o(this, f2);
                } finally {
                    e.c.h.m.b.b();
                }
            }
        }

        public b(K k) {
            this.a = k;
        }

        private void h(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        private synchronized boolean i() {
            Iterator<Pair<InterfaceC0732l<T>, V>> it2 = this.b.iterator();
            while (it2.hasNext()) {
                if (((V) it2.next().second).o()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean j() {
            Iterator<Pair<InterfaceC0732l<T>, V>> it2 = this.b.iterator();
            while (it2.hasNext()) {
                if (!((V) it2.next().second).i()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized Priority k() {
            Priority priority;
            priority = Priority.LOW;
            Iterator<Pair<InterfaceC0732l<T>, V>> it2 = this.b.iterator();
            while (it2.hasNext()) {
                priority = Priority.getHigherPriority(priority, ((V) it2.next().second).a());
            }
            return priority;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void p(TriState triState) {
            synchronized (this) {
                boolean z = true;
                e.c.c.d.h.a(this.f6545f == null);
                if (this.f6546g != null) {
                    z = false;
                }
                e.c.c.d.h.a(z);
                if (this.b.isEmpty()) {
                    J.this.k(this.a, this);
                    return;
                }
                V v = (V) this.b.iterator().next().second;
                C0724d c0724d = new C0724d(v.d(), v.getId(), v.n(), v.m(), v.b(), v.p(), j(), i(), k(), v.f());
                this.f6545f = c0724d;
                c0724d.h(v.getExtras());
                if (triState.isSet()) {
                    this.f6545f.c("started_as_prefetch", Boolean.valueOf(triState.asBoolean()));
                }
                J<K, T>.b.a aVar = new a(null);
                this.f6546g = aVar;
                J.this.b.b(aVar, this.f6545f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<W> q() {
            C0724d c0724d = this.f6545f;
            if (c0724d == null) {
                return null;
            }
            return c0724d.u(i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<W> r() {
            C0724d c0724d = this.f6545f;
            if (c0724d == null) {
                return null;
            }
            return c0724d.v(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<W> s() {
            C0724d c0724d = this.f6545f;
            if (c0724d == null) {
                return null;
            }
            return c0724d.w(k());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean g(InterfaceC0732l<T> interfaceC0732l, V v) {
            J<K, T>.b bVar;
            Pair<InterfaceC0732l<T>, V> create = Pair.create(interfaceC0732l, v);
            synchronized (this) {
                J j = J.this;
                Object obj = this.a;
                synchronized (j) {
                    bVar = j.a.get(obj);
                }
                if (bVar != this) {
                    return false;
                }
                this.b.add(create);
                List<W> r = r();
                List<W> s = s();
                List<W> q = q();
                Closeable closeable = this.f6542c;
                float f2 = this.f6543d;
                int i = this.f6544e;
                C0724d.r(r);
                C0724d.s(s);
                C0724d.q(q);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f6542c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = J.this.g(closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f2 > 0.0f) {
                            interfaceC0732l.b(f2);
                        }
                        interfaceC0732l.c(closeable, i);
                        h(closeable);
                    }
                }
                v.e(new K(this, create));
                return true;
            }
        }

        public void l(J<K, T>.b.a aVar) {
            synchronized (this) {
                if (this.f6546g != aVar) {
                    return;
                }
                this.f6546g = null;
                this.f6545f = null;
                h(this.f6542c);
                this.f6542c = null;
                p(TriState.UNSET);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void m(J<K, T>.b.a aVar, Throwable th) {
            synchronized (this) {
                if (this.f6546g != aVar) {
                    return;
                }
                Iterator<Pair<InterfaceC0732l<T>, V>> it2 = this.b.iterator();
                this.b.clear();
                J.this.k(this.a, this);
                h(this.f6542c);
                this.f6542c = null;
                while (it2.hasNext()) {
                    Pair<InterfaceC0732l<T>, V> next = it2.next();
                    synchronized (next) {
                        ((V) next.second).n().k((V) next.second, J.this.f6540d, th, null);
                        ((InterfaceC0732l) next.first).a(th);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void n(com.facebook.imagepipeline.producers.J<K, T>.b.a r9, T r10, int r11) {
            /*
                r8 = this;
                monitor-enter(r8)
                com.facebook.imagepipeline.producers.J<K, T>$b$a r0 = r8.f6546g     // Catch: java.lang.Throwable -> Lc9
                if (r0 == r9) goto L7
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc9
                return
            L7:
                T extends java.io.Closeable r9 = r8.f6542c     // Catch: java.lang.Throwable -> Lc9
                r8.h(r9)     // Catch: java.lang.Throwable -> Lc9
                r9 = 0
                r8.f6542c = r9     // Catch: java.lang.Throwable -> Lc9
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T extends java.io.Closeable>, com.facebook.imagepipeline.producers.V>> r0 = r8.b     // Catch: java.lang.Throwable -> Lc9
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc9
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T extends java.io.Closeable>, com.facebook.imagepipeline.producers.V>> r1 = r8.b     // Catch: java.lang.Throwable -> Lc9
                int r1 = r1.size()     // Catch: java.lang.Throwable -> Lc9
                boolean r2 = com.facebook.imagepipeline.producers.AbstractC0722b.f(r11)     // Catch: java.lang.Throwable -> Lc9
                if (r2 == 0) goto L2c
                com.facebook.imagepipeline.producers.J r2 = com.facebook.imagepipeline.producers.J.this     // Catch: java.lang.Throwable -> Lc9
                java.io.Closeable r2 = r2.g(r10)     // Catch: java.lang.Throwable -> Lc9
                r8.f6542c = r2     // Catch: java.lang.Throwable -> Lc9
                r8.f6544e = r11     // Catch: java.lang.Throwable -> Lc9
                goto L38
            L2c:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T extends java.io.Closeable>, com.facebook.imagepipeline.producers.V>> r2 = r8.b     // Catch: java.lang.Throwable -> Lc9
                r2.clear()     // Catch: java.lang.Throwable -> Lc9
                com.facebook.imagepipeline.producers.J r2 = com.facebook.imagepipeline.producers.J.this     // Catch: java.lang.Throwable -> Lc9
                java.lang.Object r3 = r8.a     // Catch: java.lang.Throwable -> Lc9
                r2.k(r3, r8)     // Catch: java.lang.Throwable -> Lc9
            L38:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc9
                r2 = 0
                r3 = r2
            L3b:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto Lc8
                java.lang.Object r4 = r0.next()
                android.util.Pair r4 = (android.util.Pair) r4
                monitor-enter(r4)
                boolean r5 = com.facebook.imagepipeline.producers.AbstractC0722b.e(r11)     // Catch: java.lang.Throwable -> Lc5
                if (r5 == 0) goto Lbb
                java.lang.Object r5 = r4.second     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.V r5 = (com.facebook.imagepipeline.producers.V) r5     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.X r5 = r5.n()     // Catch: java.lang.Throwable -> Lc5
                java.lang.Object r6 = r4.second     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.V r6 = (com.facebook.imagepipeline.producers.V) r6     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.J r7 = com.facebook.imagepipeline.producers.J.this     // Catch: java.lang.Throwable -> Lc5
                java.lang.String r7 = com.facebook.imagepipeline.producers.J.f(r7)     // Catch: java.lang.Throwable -> Lc5
                r5.j(r6, r7, r9)     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.d r5 = r8.f6545f     // Catch: java.lang.Throwable -> Lc5
                if (r5 == 0) goto L72
                java.lang.Object r6 = r4.second     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.V r6 = (com.facebook.imagepipeline.producers.V) r6     // Catch: java.lang.Throwable -> Lc5
                java.util.Map r5 = r5.getExtras()     // Catch: java.lang.Throwable -> Lc5
                r6.h(r5)     // Catch: java.lang.Throwable -> Lc5
            L72:
                java.lang.Object r5 = r4.second     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.V r5 = (com.facebook.imagepipeline.producers.V) r5     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.J r6 = com.facebook.imagepipeline.producers.J.this     // Catch: java.lang.Throwable -> Lc5
                java.lang.String r6 = com.facebook.imagepipeline.producers.J.c(r6)     // Catch: java.lang.Throwable -> Lc5
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lc5
                r5.c(r6, r7)     // Catch: java.lang.Throwable -> Lc5
                int r5 = r3 + 1
                if (r3 != 0) goto L88
                goto Lb4
            L88:
                com.facebook.imagepipeline.producers.J r3 = com.facebook.imagepipeline.producers.J.this     // Catch: java.lang.Throwable -> Lc5
                e.c.g.d r3 = r3.i(r10)     // Catch: java.lang.Throwable -> Lc5
                e.c.g.d r6 = com.facebook.imageutils.c.c()     // Catch: java.lang.Throwable -> Lc5
                if (r3 != r6) goto L9b
                com.facebook.imagepipeline.producers.J r3 = com.facebook.imagepipeline.producers.J.this     // Catch: java.lang.Throwable -> Lc5
                java.io.Closeable r3 = r3.h(r10)     // Catch: java.lang.Throwable -> Lc5
                goto L9c
            L9b:
                r3 = r9
            L9c:
                if (r3 == 0) goto Laf
                java.lang.Object r6 = r4.first     // Catch: java.lang.Throwable -> Laa
                com.facebook.imagepipeline.producers.l r6 = (com.facebook.imagepipeline.producers.InterfaceC0732l) r6     // Catch: java.lang.Throwable -> Laa
                r6.c(r3, r11)     // Catch: java.lang.Throwable -> Laa
                r8.h(r3)     // Catch: java.lang.Throwable -> Lc5
                r3 = 1
                goto Lb5
            Laa:
                r9 = move-exception
                r8.h(r3)     // Catch: java.lang.Throwable -> Lc5
                throw r9     // Catch: java.lang.Throwable -> Lc5
            Laf:
                if (r3 == 0) goto Lb4
                r8.h(r3)     // Catch: java.lang.Throwable -> Lc5
            Lb4:
                r3 = r2
            Lb5:
                if (r3 == 0) goto Lba
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc5
                r3 = r5
                goto L3b
            Lba:
                r3 = r5
            Lbb:
                java.lang.Object r5 = r4.first     // Catch: java.lang.Throwable -> Lc5
                com.facebook.imagepipeline.producers.l r5 = (com.facebook.imagepipeline.producers.InterfaceC0732l) r5     // Catch: java.lang.Throwable -> Lc5
                r5.c(r10, r11)     // Catch: java.lang.Throwable -> Lc5
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc5
                goto L3b
            Lc5:
                r9 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc5
                throw r9
            Lc8:
                return
            Lc9:
                r9 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc9
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.J.b.n(com.facebook.imagepipeline.producers.J$b$a, java.io.Closeable, int):void");
        }

        public void o(J<K, T>.b.a aVar, float f2) {
            synchronized (this) {
                if (this.f6546g != aVar) {
                    return;
                }
                this.f6543d = f2;
                Iterator<Pair<InterfaceC0732l<T>, V>> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    Pair<InterfaceC0732l<T>, V> next = it2.next();
                    synchronized (next) {
                        ((InterfaceC0732l) next.first).b(f2);
                    }
                }
            }
        }
    }

    protected J(U<T> u, String str, String str2) {
        this.b = u;
        this.a = new HashMap();
        this.f6539c = false;
        this.f6540d = str;
        this.f6541e = str2;
    }

    @Override // com.facebook.imagepipeline.producers.U
    public void b(InterfaceC0732l<T> interfaceC0732l, V v) {
        boolean z;
        J<K, T>.b bVar;
        try {
            e.c.h.m.b.b();
            v.n().e(v, this.f6540d);
            K j = j(v);
            do {
                z = false;
                synchronized (this) {
                    synchronized (this) {
                        bVar = this.a.get(j);
                    }
                }
                if (bVar == null) {
                    synchronized (this) {
                        bVar = new b(j);
                        this.a.put(j, bVar);
                        z = true;
                    }
                }
            } while (!bVar.g(interfaceC0732l, v));
            if (z) {
                bVar.p(TriState.valueOf(v.i()));
            }
        } finally {
            e.c.h.m.b.b();
        }
    }

    protected abstract T g(T t);

    protected T h(T t) {
        return null;
    }

    protected abstract e.c.g.d i(T t);

    protected abstract K j(V v);

    protected synchronized void k(K k, J<K, T>.b bVar) {
        if (this.a.get(k) == bVar) {
            this.a.remove(k);
        }
    }

    protected J(U<T> u, String str, String str2, boolean z) {
        this.b = u;
        this.a = new HashMap();
        this.f6539c = z;
        this.f6540d = str;
        this.f6541e = str2;
    }
}
