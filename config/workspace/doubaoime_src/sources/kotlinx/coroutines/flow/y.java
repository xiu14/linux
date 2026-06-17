package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C0814l;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
final class y<T> extends kotlinx.coroutines.flow.D.a<A> implements t<T>, InterfaceC0803c<T>, kotlinx.coroutines.flow.D.m<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: d, reason: collision with root package name */
    private int f10285d;

    @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, TypedValues.CycleType.TYPE_ALPHA}, m = "collect")
    static final class a extends kotlin.r.h.a.c {
        Object a;
        Object b;

        /* renamed from: c, reason: collision with root package name */
        Object f10286c;

        /* renamed from: d, reason: collision with root package name */
        Object f10287d;

        /* renamed from: e, reason: collision with root package name */
        Object f10288e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f10289f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ y<T> f10290g;
        int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y<T> yVar, kotlin.r.d<? super a> dVar) {
            super(dVar);
            this.f10290g = yVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.f10289f = obj;
            this.h |= Integer.MIN_VALUE;
            return this.f10290g.a(null, this);
        }
    }

    public y(Object obj) {
        this._state = obj;
    }

    private final boolean i(Object obj, Object obj2) {
        int i;
        A[] h;
        kotlinx.coroutines.N0.x xVar;
        kotlinx.coroutines.N0.x xVar2;
        kotlinx.coroutines.N0.x xVar3;
        kotlinx.coroutines.N0.x xVar4;
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !kotlin.s.c.l.a(obj3, obj)) {
                return false;
            }
            if (kotlin.s.c.l.a(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.f10285d;
            if ((i2 & 1) != 0) {
                this.f10285d = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f10285d = i3;
            A[] h2 = h();
            while (true) {
                A[] aArr = h2;
                if (aArr != null) {
                    for (A a2 : aArr) {
                        if (a2 != null) {
                            while (true) {
                                Object obj4 = a2._state;
                                if (obj4 == null) {
                                    break;
                                }
                                xVar = z.b;
                                if (obj4 == xVar) {
                                    break;
                                }
                                xVar2 = z.a;
                                if (obj4 != xVar2) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A.a;
                                    xVar4 = z.a;
                                    if (atomicReferenceFieldUpdater.compareAndSet(a2, obj4, xVar4)) {
                                        ((C0814l) obj4).resumeWith(kotlin.o.a);
                                        break;
                                    }
                                } else {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A.a;
                                    xVar3 = z.b;
                                    if (atomicReferenceFieldUpdater2.compareAndSet(a2, obj4, xVar3)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f10285d;
                    if (i == i3) {
                        this.f10285d = i3 + 1;
                        return true;
                    }
                    h = h();
                }
                h2 = h;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (kotlin.s.c.l.a(r13, r14) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (kotlin.o.a == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (0 == 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:13:0x003c, B:14:0x00a4, B:16:0x00a8, B:19:0x00af, B:20:0x00b3, B:24:0x00b6, B:26:0x00d7, B:30:0x00f2, B:32:0x0114, B:33:0x0119, B:35:0x0121, B:40:0x0129, B:44:0x00bc, B:47:0x00c3, B:55:0x005a, B:57:0x006d, B:58:0x0095), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // kotlinx.coroutines.flow.w, kotlinx.coroutines.flow.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlinx.coroutines.flow.g<? super T> r13, kotlin.r.d<?> r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.a(kotlinx.coroutines.flow.g, kotlin.r.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.D.m
    public f<T> b(kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        return z.d(this, fVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.t
    public boolean c(T t, T t2) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.D.p.a;
        }
        if (t2 == null) {
            t2 = (T) kotlinx.coroutines.flow.D.p.a;
        }
        return i(t, t2);
    }

    @Override // kotlinx.coroutines.flow.D.a
    public A e() {
        return new A();
    }

    @Override // kotlinx.coroutines.flow.g
    public Object emit(T t, kotlin.r.d<? super kotlin.o> dVar) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.D.p.a;
        }
        i(null, t);
        return kotlin.o.a;
    }

    @Override // kotlinx.coroutines.flow.D.a
    public A[] f(int i) {
        return new A[i];
    }

    @Override // kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.x
    public T getValue() {
        kotlinx.coroutines.N0.x xVar = kotlinx.coroutines.flow.D.p.a;
        T t = (T) this._state;
        if (t == xVar) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.t
    public void setValue(T t) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.D.p.a;
        }
        i(null, t);
    }
}
