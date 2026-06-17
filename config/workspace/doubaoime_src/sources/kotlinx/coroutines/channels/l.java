package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.N0.D;

/* loaded from: classes2.dex */
public class l<E> extends a<E> {

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f10231d;

    /* renamed from: e, reason: collision with root package name */
    private Object f10232e;

    public l(kotlin.s.b.l<? super E, kotlin.o> lVar) {
        super(lVar);
        this.f10231d = new ReentrantLock();
        this.f10232e = b.a;
    }

    private final D D(Object obj) {
        kotlin.s.b.l<E, kotlin.o> lVar;
        Object obj2 = this.f10232e;
        D d2 = null;
        if (obj2 != b.a && (lVar = this.a) != null) {
            d2 = kotlinx.coroutines.N0.r.b(lVar, obj2, null);
        }
        this.f10232e = obj;
        return d2;
    }

    @Override // kotlinx.coroutines.channels.a
    protected Object B() {
        ReentrantLock reentrantLock = this.f10231d;
        reentrantLock.lock();
        try {
            Object obj = this.f10232e;
            kotlinx.coroutines.N0.x xVar = b.a;
            if (obj != xVar) {
                this.f10232e = xVar;
                return obj;
            }
            Object h = h();
            if (h == null) {
                h = b.f10219d;
            }
            return h;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    protected String f() {
        ReentrantLock reentrantLock = this.f10231d;
        reentrantLock.lock();
        try {
            return "(value=" + this.f10232e + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean l() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean n() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    protected Object p(E e2) {
        t<E> t;
        ReentrantLock reentrantLock = this.f10231d;
        reentrantLock.lock();
        try {
            i<?> h = h();
            if (h != null) {
                return h;
            }
            if (this.f10232e == b.a) {
                do {
                    t = t();
                    if (t != null) {
                        if (t instanceof i) {
                            return t;
                        }
                        kotlin.s.c.l.c(t);
                    }
                } while (t.i(e2, null) == null);
                reentrantLock.unlock();
                t.h(e2);
                return t.c();
            }
            D D = D(e2);
            if (D == null) {
                return b.b;
            }
            throw D;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected boolean v(r<? super E> rVar) {
        ReentrantLock reentrantLock = this.f10231d;
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
        ReentrantLock reentrantLock = this.f10231d;
        reentrantLock.lock();
        try {
            return this.f10232e == b.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.a
    protected void z(boolean z) {
        ReentrantLock reentrantLock = this.f10231d;
        reentrantLock.lock();
        try {
            D D = D(b.a);
            reentrantLock.unlock();
            super.z(z);
            if (D != null) {
                throw D;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
