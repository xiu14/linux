package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.o;
import kotlin.r.f;
import kotlin.s.b.l;
import kotlin.s.c.m;
import kotlin.w.h;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.InterfaceC0812k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.S;
import kotlinx.coroutines.U;
import kotlinx.coroutines.v0;
import kotlinx.coroutines.x0;

/* loaded from: classes2.dex */
public final class b extends c implements N {
    private volatile b _immediate;
    private final Handler a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10208c;

    /* renamed from: d, reason: collision with root package name */
    private final b f10209d;

    public static final class a implements Runnable {
        final /* synthetic */ InterfaceC0812k a;
        final /* synthetic */ b b;

        public a(InterfaceC0812k interfaceC0812k, b bVar) {
            this.a = interfaceC0812k;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.j(this.b, o.a);
        }
    }

    /* renamed from: kotlinx.coroutines.android.b$b, reason: collision with other inner class name */
    static final class C0476b extends m implements l<Throwable, o> {
        final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0476b(Runnable runnable) {
            super(1);
            this.b = runnable;
        }

        @Override // kotlin.s.b.l
        public o invoke(Throwable th) {
            b.this.a.removeCallbacks(this.b);
            return o.a;
        }
    }

    private b(Handler handler, String str, boolean z) {
        super(null);
        this.a = handler;
        this.b = str;
        this.f10208c = z;
        this._immediate = z ? this : null;
        b bVar = this._immediate;
        if (bVar == null) {
            bVar = new b(handler, str, true);
            this._immediate = bVar;
        }
        this.f10209d = bVar;
    }

    private final void c0(f fVar, Runnable runnable) {
        C0795d.d(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        S.b().dispatch(fVar, runnable);
    }

    public static void e0(b bVar, Runnable runnable) {
        bVar.a.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.android.c, kotlinx.coroutines.N
    public U A(long j, final Runnable runnable, f fVar) {
        if (this.a.postDelayed(runnable, h.d(j, 4611686018427387903L))) {
            return new U() { // from class: kotlinx.coroutines.android.a
                @Override // kotlinx.coroutines.U
                public final void b() {
                    b.e0(b.this, runnable);
                }
            };
        }
        c0(fVar, runnable);
        return x0.a;
    }

    @Override // kotlinx.coroutines.v0
    public v0 U() {
        return this.f10209d;
    }

    @Override // kotlinx.coroutines.D
    public void dispatch(f fVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        c0(fVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).a == this.a;
    }

    public int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // kotlinx.coroutines.D
    public boolean isDispatchNeeded(f fVar) {
        return (this.f10208c && kotlin.s.c.l.a(Looper.myLooper(), this.a.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.N
    public void o(long j, InterfaceC0812k<? super o> interfaceC0812k) {
        a aVar = new a(interfaceC0812k, this);
        if (this.a.postDelayed(aVar, h.d(j, 4611686018427387903L))) {
            interfaceC0812k.f(new C0476b(aVar));
        } else {
            c0(interfaceC0812k.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.v0, kotlinx.coroutines.D
    public String toString() {
        String Y = Y();
        if (Y != null) {
            return Y;
        }
        String str = this.b;
        if (str == null) {
            str = this.a.toString();
        }
        return this.f10208c ? e.a.a.a.a.s(str, ".immediate") : str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Handler handler, String str, int i) {
        this(handler, (String) null, false);
        int i2 = i & 2;
    }
}
