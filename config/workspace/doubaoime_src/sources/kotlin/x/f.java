package kotlin.x;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
final class f<T> extends g<T> implements Iterator<T>, kotlin.r.d<kotlin.o>, kotlin.s.c.E.a {
    private int a;
    private T b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator<? extends T> f10148c;

    /* renamed from: d, reason: collision with root package name */
    private kotlin.r.d<? super kotlin.o> f10149d;

    private final Throwable d() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder M = e.a.a.a.a.M("Unexpected state of the iterator: ");
        M.append(this.a);
        return new IllegalStateException(M.toString());
    }

    @Override // kotlin.x.g
    public Object a(T t, kotlin.r.d<? super kotlin.o> dVar) {
        this.b = t;
        this.a = 3;
        this.f10149d = dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (coroutineSingletons == coroutineSingletons) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return coroutineSingletons == coroutineSingletons ? coroutineSingletons : kotlin.o.a;
    }

    @Override // kotlin.x.g
    public Object c(Iterator<? extends T> it2, kotlin.r.d<? super kotlin.o> dVar) {
        if (!it2.hasNext()) {
            return kotlin.o.a;
        }
        this.f10148c = it2;
        this.a = 2;
        this.f10149d = dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (coroutineSingletons == coroutineSingletons) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return coroutineSingletons == coroutineSingletons ? coroutineSingletons : kotlin.o.a;
    }

    public final void e(kotlin.r.d<? super kotlin.o> dVar) {
        this.f10149d = dVar;
    }

    @Override // kotlin.r.d
    public kotlin.r.f getContext() {
        return kotlin.r.g.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator<? extends T> it2 = this.f10148c;
                kotlin.s.c.l.c(it2);
                if (it2.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.f10148c = null;
            }
            this.a = 5;
            kotlin.r.d<? super kotlin.o> dVar = this.f10149d;
            kotlin.s.c.l.c(dVar);
            this.f10149d = null;
            dVar.resumeWith(kotlin.o.a);
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.a = 1;
            Iterator<? extends T> it2 = this.f10148c;
            kotlin.s.c.l.c(it2);
            return it2.next();
        }
        if (i != 3) {
            throw d();
        }
        this.a = 0;
        T t = this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.r.d
    public void resumeWith(Object obj) {
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        this.a = 4;
    }
}
