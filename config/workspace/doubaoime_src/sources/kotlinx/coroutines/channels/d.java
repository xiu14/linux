package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.N0.D;

/* loaded from: classes2.dex */
public class d<E> extends a<E> {

    /* renamed from: d, reason: collision with root package name */
    private final int f10225d;

    /* renamed from: e, reason: collision with root package name */
    private final BufferOverflow f10226e;

    /* renamed from: f, reason: collision with root package name */
    private final ReentrantLock f10227f;

    /* renamed from: g, reason: collision with root package name */
    private Object[] f10228g;
    private int h;
    private volatile /* synthetic */ int size;

    public d(int i, BufferOverflow bufferOverflow, kotlin.s.b.l<? super E, kotlin.o> lVar) {
        super(lVar);
        this.f10225d = i;
        this.f10226e = bufferOverflow;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(e.a.a.a.a.k("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
        }
        this.f10227f = new ReentrantLock();
        int min = Math.min(i, 8);
        Object[] objArr = new Object[min];
        kotlin.collections.g.p(objArr, b.a, 0, min);
        this.f10228g = objArr;
        this.size = 0;
    }

    private final void D(int i, E e2) {
        int i2 = this.f10225d;
        if (i >= i2) {
            Object[] objArr = this.f10228g;
            int i3 = this.h;
            objArr[i3 % objArr.length] = null;
            objArr[(i + i3) % objArr.length] = e2;
            this.h = (i3 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.f10228g;
        if (i >= objArr2.length) {
            int min = Math.min(objArr2.length * 2, i2);
            Object[] objArr3 = new Object[min];
            for (int i4 = 0; i4 < i; i4++) {
                Object[] objArr4 = this.f10228g;
                objArr3[i4] = objArr4[(this.h + i4) % objArr4.length];
            }
            kotlin.collections.g.p(objArr3, b.a, i, min);
            this.f10228g = objArr3;
            this.h = 0;
        }
        Object[] objArr5 = this.f10228g;
        objArr5[(this.h + i) % objArr5.length] = e2;
    }

    @Override // kotlinx.coroutines.channels.a
    protected Object B() {
        ReentrantLock reentrantLock = this.f10227f;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object h = h();
                if (h == null) {
                    h = b.f10219d;
                }
                return h;
            }
            Object[] objArr = this.f10228g;
            int i2 = this.h;
            Object obj = objArr[i2];
            v vVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = b.f10219d;
            boolean z = false;
            if (i == this.f10225d) {
                v vVar2 = null;
                while (true) {
                    v u = u();
                    if (u == null) {
                        vVar = vVar2;
                        break;
                    }
                    kotlin.s.c.l.c(u);
                    if (u.B(null) != null) {
                        obj2 = u.z();
                        z = true;
                        vVar = u;
                        break;
                    }
                    u.C();
                    vVar2 = u;
                }
            }
            if (obj2 != b.f10219d && !(obj2 instanceof i)) {
                this.size = i;
                Object[] objArr2 = this.f10228g;
                objArr2[(this.h + i) % objArr2.length] = obj2;
            }
            this.h = (this.h + 1) % this.f10228g.length;
            if (z) {
                kotlin.s.c.l.c(vVar);
                vVar.y();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    protected Object b(v vVar) {
        ReentrantLock reentrantLock = this.f10227f;
        reentrantLock.lock();
        try {
            return super.b(vVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    protected String f() {
        StringBuilder M = e.a.a.a.a.M("(buffer:capacity=");
        M.append(this.f10225d);
        M.append(",size=");
        return e.a.a.a.a.C(M, this.size, ')');
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean l() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean n() {
        return this.size == this.f10225d && this.f10226e == BufferOverflow.SUSPEND;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    @Override // kotlinx.coroutines.channels.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object p(E r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.f10227f
            r0.lock()
            int r1 = r5.size     // Catch: java.lang.Throwable -> L6e
            kotlinx.coroutines.channels.i r2 = r5.h()     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L11
            r0.unlock()
            return r2
        L11:
            int r2 = r5.f10225d     // Catch: java.lang.Throwable -> L6e
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L1c
            int r2 = r1 + 1
            r5.size = r2     // Catch: java.lang.Throwable -> L6e
            goto L32
        L1c:
            kotlinx.coroutines.channels.BufferOverflow r2 = r5.f10226e     // Catch: java.lang.Throwable -> L6e
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L34
            if (r2 == r3) goto L32
            r3 = 2
            if (r2 != r3) goto L2c
            kotlinx.coroutines.N0.x r2 = kotlinx.coroutines.channels.b.b     // Catch: java.lang.Throwable -> L6e
            goto L36
        L2c:
            kotlin.f r6 = new kotlin.f     // Catch: java.lang.Throwable -> L6e
            r6.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r6     // Catch: java.lang.Throwable -> L6e
        L32:
            r2 = r4
            goto L36
        L34:
            kotlinx.coroutines.N0.x r2 = kotlinx.coroutines.channels.b.f10218c     // Catch: java.lang.Throwable -> L6e
        L36:
            if (r2 == 0) goto L3c
            r0.unlock()
            return r2
        L3c:
            if (r1 != 0) goto L65
        L3e:
            kotlinx.coroutines.channels.t r2 = r5.t()     // Catch: java.lang.Throwable -> L6e
            if (r2 != 0) goto L45
            goto L65
        L45:
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.i     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L4f
            r5.size = r1     // Catch: java.lang.Throwable -> L6e
            r0.unlock()
            return r2
        L4f:
            kotlin.s.c.l.c(r2)     // Catch: java.lang.Throwable -> L6e
            kotlinx.coroutines.N0.x r3 = r2.i(r6, r4)     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L3e
            r5.size = r1     // Catch: java.lang.Throwable -> L6e
            r0.unlock()
            r2.h(r6)
            java.lang.Object r6 = r2.c()
            return r6
        L65:
            r5.D(r1, r6)     // Catch: java.lang.Throwable -> L6e
            kotlinx.coroutines.N0.x r6 = kotlinx.coroutines.channels.b.b     // Catch: java.lang.Throwable -> L6e
            r0.unlock()
            return r6
        L6e:
            r6 = move-exception
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.d.p(java.lang.Object):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.a
    protected boolean v(r<? super E> rVar) {
        ReentrantLock reentrantLock = this.f10227f;
        reentrantLock.lock();
        try {
            return super.v(rVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean w() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean x() {
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.a
    public boolean y() {
        boolean z;
        ReentrantLock reentrantLock = this.f10227f;
        reentrantLock.lock();
        try {
            if (g() != null) {
                if (x()) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected void z(boolean z) {
        kotlin.s.b.l<E, kotlin.o> lVar = this.a;
        ReentrantLock reentrantLock = this.f10227f;
        reentrantLock.lock();
        try {
            int i = this.size;
            D d2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f10228g[this.h];
                if (lVar != null && obj != b.a) {
                    d2 = kotlinx.coroutines.N0.r.b(lVar, obj, d2);
                }
                Object[] objArr = this.f10228g;
                int i3 = this.h;
                objArr[i3] = b.a;
                this.h = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            reentrantLock.unlock();
            super.z(z);
            if (d2 != null) {
                throw d2;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
