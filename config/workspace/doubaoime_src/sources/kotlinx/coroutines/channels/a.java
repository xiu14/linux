package kotlinx.coroutines.channels;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC0797e;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0814l;
import kotlinx.coroutines.C0816m;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC0812k;
import kotlinx.coroutines.N0.m;
import kotlinx.coroutines.channels.g;

/* loaded from: classes2.dex */
public abstract class a<E> extends kotlinx.coroutines.channels.c<E> implements kotlinx.coroutines.channels.e<E> {

    /* renamed from: kotlinx.coroutines.channels.a$a, reason: collision with other inner class name */
    private static class C0477a<E> extends r<E> {

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC0812k<Object> f10213d;

        /* renamed from: e, reason: collision with root package name */
        public final int f10214e;

        public C0477a(InterfaceC0812k<Object> interfaceC0812k, int i) {
            this.f10213d = interfaceC0812k;
            this.f10214e = i;
        }

        @Override // kotlinx.coroutines.channels.t
        public void h(E e2) {
            this.f10213d.t(C0816m.a);
        }

        @Override // kotlinx.coroutines.channels.t
        public kotlinx.coroutines.N0.x i(E e2, m.b bVar) {
            if (this.f10213d.i(this.f10214e == 1 ? g.a(e2) : e2, null, y(e2)) == null) {
                return null;
            }
            return C0816m.a;
        }

        @Override // kotlinx.coroutines.N0.m
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("ReceiveElement@");
            M.append(I.b(this));
            M.append("[receiveMode=");
            return e.a.a.a.a.C(M, this.f10214e, ']');
        }

        @Override // kotlinx.coroutines.channels.r
        public void z(i<?> iVar) {
            if (this.f10214e == 1) {
                this.f10213d.resumeWith(g.a(new g.a(iVar.f10230d)));
                return;
            }
            InterfaceC0812k<Object> interfaceC0812k = this.f10213d;
            Throwable th = iVar.f10230d;
            if (th == null) {
                th = new j("Channel was closed");
            }
            interfaceC0812k.resumeWith(com.prolificinteractive.materialcalendarview.r.J(th));
        }
    }

    private static final class b<E> extends C0477a<E> {

        /* renamed from: f, reason: collision with root package name */
        public final kotlin.s.b.l<E, kotlin.o> f10215f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC0812k<Object> interfaceC0812k, int i, kotlin.s.b.l<? super E, kotlin.o> lVar) {
            super(interfaceC0812k, i);
            this.f10215f = lVar;
        }

        @Override // kotlinx.coroutines.channels.r
        public kotlin.s.b.l<Throwable, kotlin.o> y(E e2) {
            return kotlinx.coroutines.N0.r.a(this.f10215f, e2, this.f10213d.getContext());
        }
    }

    private final class c extends AbstractC0797e {
        private final r<?> a;

        public c(r<?> rVar) {
            this.a = rVar;
        }

        @Override // kotlinx.coroutines.AbstractC0810j
        public void a(Throwable th) {
            if (this.a.v()) {
                Objects.requireNonNull(a.this);
            }
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Throwable th) {
            if (this.a.v()) {
                Objects.requireNonNull(a.this);
            }
            return kotlin.o.a;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("RemoveReceiveOnCancel[");
            M.append(this.a);
            M.append(']');
            return M.toString();
        }
    }

    public static final class d extends m.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f10216d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.N0.m mVar, a aVar) {
            super(mVar);
            this.f10216d = aVar;
        }

        @Override // kotlinx.coroutines.N0.AbstractC0787c
        public Object c(kotlinx.coroutines.N0.m mVar) {
            if (this.f10216d.x()) {
                return null;
            }
            return kotlinx.coroutines.N0.l.a();
        }
    }

    @kotlin.r.h.a.e(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    static final class e extends kotlin.r.h.a.c {
        /* synthetic */ Object a;
        final /* synthetic */ a<E> b;

        /* renamed from: c, reason: collision with root package name */
        int f10217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a<E> aVar, kotlin.r.d<? super e> dVar) {
            super(dVar);
            this.b = aVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.f10217c |= Integer.MIN_VALUE;
            Object c2 = this.b.c(this);
            return c2 == CoroutineSingletons.COROUTINE_SUSPENDED ? c2 : g.a(c2);
        }
    }

    public a(kotlin.s.b.l<? super E, kotlin.o> lVar) {
        super(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <R> Object C(int i, kotlin.r.d<? super R> dVar) {
        C0814l h = C0795d.h(kotlin.coroutines.intrinsics.a.d(dVar));
        C0477a c0477a = this.a == null ? new C0477a(h, i) : new b(h, i, this.a);
        while (true) {
            if (v(c0477a)) {
                h.f(new c(c0477a));
                break;
            }
            Object B = B();
            if (B instanceof i) {
                c0477a.z((i) B);
                break;
            }
            if (B != kotlinx.coroutines.channels.b.f10219d) {
                h.E(c0477a.f10214e == 1 ? g.a(B) : B, c0477a.y(B));
            }
        }
        Object u = h.u();
        if (u == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return u;
    }

    protected void A(Object obj, i<?> iVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((v) obj).A(iVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((v) arrayList.get(size)).A(iVar);
            }
        }
    }

    protected Object B() {
        while (true) {
            v u = u();
            if (u == null) {
                return kotlinx.coroutines.channels.b.f10219d;
            }
            if (u.B(null) != null) {
                u.y();
                return u.z();
            }
            u.C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.channels.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.r.d<? super kotlinx.coroutines.channels.g<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.a.e
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.a$e r0 = (kotlinx.coroutines.channels.a.e) r0
            int r1 = r0.f10217c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10217c = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.a$e r0 = new kotlinx.coroutines.channels.a$e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f10217c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.prolificinteractive.materialcalendarview.r.k0(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            com.prolificinteractive.materialcalendarview.r.k0(r5)
            java.lang.Object r5 = r4.B()
            kotlinx.coroutines.N0.x r2 = kotlinx.coroutines.channels.b.f10219d
            if (r5 == r2) goto L49
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.i
            if (r0 == 0) goto L48
            kotlinx.coroutines.channels.i r5 = (kotlinx.coroutines.channels.i) r5
            java.lang.Throwable r5 = r5.f10230d
            kotlinx.coroutines.channels.g$a r0 = new kotlinx.coroutines.channels.g$a
            r0.<init>(r5)
            r5 = r0
        L48:
            return r5
        L49:
            r0.f10217c = r3
            java.lang.Object r5 = r4.C(r3, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            kotlinx.coroutines.channels.g r5 = (kotlinx.coroutines.channels.g) r5
            java.lang.Object r5 = r5.c()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.a.c(kotlin.r.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.s
    public final void d(CancellationException cancellationException) {
        if (y()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName() + " was cancelled");
        }
        z(k(cancellationException));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.s
    public final Object e(kotlin.r.d<? super E> dVar) {
        Object B = B();
        return (B == kotlinx.coroutines.channels.b.f10219d || (B instanceof i)) ? C(0, dVar) : B;
    }

    @Override // kotlinx.coroutines.channels.c
    protected t<E> t() {
        t<E> t = super.t();
        if (t != null) {
            boolean z = t instanceof i;
        }
        return t;
    }

    protected boolean v(r<? super E> rVar) {
        int x;
        kotlinx.coroutines.N0.m r;
        if (!w()) {
            kotlinx.coroutines.N0.m i = i();
            d dVar = new d(rVar, this);
            do {
                kotlinx.coroutines.N0.m r2 = i.r();
                if (!(!(r2 instanceof v))) {
                    return false;
                }
                x = r2.x(rVar, i, dVar);
                if (x != 1) {
                }
            } while (x != 2);
            return false;
        }
        kotlinx.coroutines.N0.m i2 = i();
        do {
            r = i2.r();
            if (!(!(r instanceof v))) {
                return false;
            }
        } while (!r.l(rVar, i2));
        return true;
    }

    protected abstract boolean w();

    protected abstract boolean x();

    public boolean y() {
        return g() != null && x();
    }

    protected void z(boolean z) {
        i<?> h = h();
        if (h == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object obj = null;
        while (true) {
            kotlinx.coroutines.N0.m r = h.r();
            if (r instanceof kotlinx.coroutines.N0.k) {
                A(obj, h);
                return;
            } else if (r.v()) {
                obj = com.prolificinteractive.materialcalendarview.r.e0(obj, (v) r);
            } else {
                r.s();
            }
        }
    }
}
