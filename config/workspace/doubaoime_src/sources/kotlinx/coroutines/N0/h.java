package kotlinx.coroutines.N0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C0814l;
import kotlinx.coroutines.C0825v;
import kotlinx.coroutines.F0;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC0812k;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.Y;

/* loaded from: classes2.dex */
public final class h<T> extends Q<T> implements kotlin.r.h.a.d, kotlin.r.d<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.D f10159d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.r.d<T> f10160e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10161f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10162g;

    /* JADX WARN: Multi-variable type inference failed */
    public h(kotlinx.coroutines.D d2, kotlin.r.d<? super T> dVar) {
        super(-1);
        x xVar;
        this.f10159d = d2;
        this.f10160e = dVar;
        xVar = i.a;
        this.f10161f = xVar;
        this.f10162g = z.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // kotlinx.coroutines.Q
    public void a(Object obj, Throwable th) {
        if (obj instanceof C0825v) {
            ((C0825v) obj).b.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.Q
    public kotlin.r.d<T> c() {
        return this;
    }

    @Override // kotlin.r.h.a.d
    public kotlin.r.h.a.d getCallerFrame() {
        kotlin.r.d<T> dVar = this.f10160e;
        if (dVar instanceof kotlin.r.h.a.d) {
            return (kotlin.r.h.a.d) dVar;
        }
        return null;
    }

    @Override // kotlin.r.d
    public kotlin.r.f getContext() {
        return this.f10160e.getContext();
    }

    @Override // kotlinx.coroutines.Q
    public Object k() {
        x xVar;
        Object obj = this.f10161f;
        xVar = i.a;
        this.f10161f = xVar;
        return obj;
    }

    public final C0814l<T> l() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = i.b;
                return null;
            }
            if (obj instanceof C0814l) {
                if (h.compareAndSet(this, obj, i.b)) {
                    return (C0814l) obj;
                }
            } else if (obj != i.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(e.a.a.a.a.r("Inconsistent state ", obj));
            }
        }
    }

    public final boolean m() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean o(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            x xVar = i.b;
            if (kotlin.s.c.l.a(obj, xVar)) {
                if (h.compareAndSet(this, xVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (h.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        while (this._reusableCancellableContinuation == i.b) {
        }
        Object obj = this._reusableCancellableContinuation;
        C0814l c0814l = obj instanceof C0814l ? (C0814l) obj : null;
        if (c0814l != null) {
            c0814l.q();
        }
    }

    public final Throwable q(InterfaceC0812k<?> interfaceC0812k) {
        x xVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            xVar = i.b;
            if (obj != xVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(e.a.a.a.a.r("Inconsistent state ", obj));
                }
                if (h.compareAndSet(this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!h.compareAndSet(this, xVar, interfaceC0812k));
        return null;
    }

    @Override // kotlin.r.d
    public void resumeWith(Object obj) {
        kotlin.r.f context;
        Object c2;
        kotlin.r.f context2 = this.f10160e.getContext();
        Object l0 = com.prolificinteractive.materialcalendarview.r.l0(obj, null);
        if (this.f10159d.isDispatchNeeded(context2)) {
            this.f10161f = l0;
            this.f10198c = 0;
            this.f10159d.dispatch(context2, this);
            return;
        }
        F0 f0 = F0.a;
        Y a = F0.a();
        if (a.f0()) {
            this.f10161f = l0;
            this.f10198c = 0;
            a.a0(this);
            return;
        }
        a.e0(true);
        try {
            context = getContext();
            c2 = z.c(context, this.f10162g);
        } finally {
            try {
            } finally {
            }
        }
        try {
            this.f10160e.resumeWith(obj);
            while (a.n0()) {
            }
        } finally {
            z.a(context, c2);
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DispatchedContinuation[");
        M.append(this.f10159d);
        M.append(", ");
        M.append(I.c(this.f10160e));
        M.append(']');
        return M.toString();
    }
}
