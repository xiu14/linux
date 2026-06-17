package kotlinx.coroutines;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* renamed from: kotlinx.coroutines.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0793c<T> {
    static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C0793c.class, "notCompletedCount");
    private final L<T>[] a;
    volatile /* synthetic */ int notCompletedCount;

    /* renamed from: kotlinx.coroutines.c$a */
    private final class a extends q0 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC0812k<List<? extends T>> f10210e;

        /* renamed from: f, reason: collision with root package name */
        public U f10211f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC0812k<? super List<? extends T>> interfaceC0812k) {
            this.f10210e = interfaceC0812k;
        }

        public final void A(C0793c<T>.b bVar) {
            this._disposer = bVar;
        }

        @Override // kotlin.s.b.l
        public /* bridge */ /* synthetic */ kotlin.o invoke(Throwable th) {
            y(th);
            return kotlin.o.a;
        }

        @Override // kotlinx.coroutines.AbstractC0826w
        public void y(Throwable th) {
            if (th != null) {
                Object g2 = this.f10210e.g(th);
                if (g2 != null) {
                    this.f10210e.t(g2);
                    b bVar = (b) this._disposer;
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C0793c.b.decrementAndGet(C0793c.this) == 0) {
                InterfaceC0812k<List<? extends T>> interfaceC0812k = this.f10210e;
                L[] lArr = ((C0793c) C0793c.this).a;
                ArrayList arrayList = new ArrayList(lArr.length);
                for (L l : lArr) {
                    arrayList.add(l.h());
                }
                interfaceC0812k.resumeWith(arrayList);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.c$b */
    private final class b extends AbstractC0808i {
        private final C0793c<T>.a[] a;

        public b(C0793c c0793c, C0793c<T>.a[] aVarArr) {
            this.a = aVarArr;
        }

        @Override // kotlinx.coroutines.AbstractC0810j
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (C0793c<T>.a aVar : this.a) {
                U u = aVar.f10211f;
                if (u == null) {
                    kotlin.s.c.l.l("handle");
                    throw null;
                }
                u.b();
            }
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Throwable th) {
            b();
            return kotlin.o.a;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("DisposeHandlersOnCancel[");
            M.append(this.a);
            M.append(']');
            return M.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0793c(L<? extends T>[] lArr) {
        this.a = lArr;
        this.notCompletedCount = lArr.length;
    }

    public final Object b(kotlin.r.d<? super List<? extends T>> dVar) {
        C0814l c0814l = new C0814l(kotlin.coroutines.intrinsics.a.d(dVar), 1);
        c0814l.v();
        int length = this.a.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            L<T> l = this.a[i];
            l.start();
            a aVar = new a(c0814l);
            aVar.f10211f = l.z(aVar);
            aVarArr[i] = aVar;
        }
        C0793c<T>.b bVar = new b(this, aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2].A(bVar);
        }
        if (c0814l.n()) {
            bVar.b();
        } else {
            c0814l.f(bVar);
        }
        Object u = c0814l.u();
        if (u == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
        }
        return u;
    }
}
