package kotlinx.coroutines.P0;

import com.prolificinteractive.materialcalendarview.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;
import kotlinx.coroutines.InterfaceC0812k;
import kotlinx.coroutines.N0.w;
import kotlinx.coroutines.N0.x;

/* loaded from: classes2.dex */
final class h implements g {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10188c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10189d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10190e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10191f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f10192g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    volatile /* synthetic */ int _availablePermits;
    private final int a;
    private final l<Throwable, o> b;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;

    static final class a extends m implements l<Throwable, o> {
        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(Throwable th) {
            h.this.release();
            return o.a;
        }
    }

    public h(int i, int i2) {
        this.a = i;
        if (!(i > 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.j("Semaphore should have at least 1 permit, but had ", i).toString());
        }
        if (!(i2 >= 0 && i2 <= i)) {
            throw new IllegalArgumentException(e.a.a.a.a.j("The number of acquired permits should be in 0..", i).toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = i - i2;
        this.b = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4 A[EDGE_INSN: B:59:0x00d4->B:49:0x00d4 BREAK  A[LOOP:0: B:7:0x0015->B:58:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.N0.f, kotlinx.coroutines.N0.w] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.N0.x] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    @Override // kotlinx.coroutines.P0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.r.d<? super kotlin.o> r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.P0.h.a(kotlin.r.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.N0.f, kotlinx.coroutines.N0.w] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlinx.coroutines.N0.x] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // kotlinx.coroutines.P0.g
    public void release() {
        int i;
        j jVar;
        x xVar;
        x xVar2;
        int i2;
        x xVar3;
        x xVar4;
        InterfaceC0812k interfaceC0812k;
        Object i3;
        int i4;
        x xVar5;
        x xVar6;
        x xVar7;
        ?? r8;
        while (true) {
            int i5 = this._availablePermits;
            int i6 = 0;
            if ((i5 < this.a) != true) {
                StringBuilder M = e.a.a.a.a.M("The number of released permits cannot be greater than ");
                M.append(this.a);
                throw new IllegalStateException(M.toString().toString());
            }
            if (f10192g.compareAndSet(this, i5, i5 + 1)) {
                if (i5 >= 0) {
                    return;
                }
                j jVar2 = (j) this.head;
                long andIncrement = f10189d.getAndIncrement(this);
                i = i.f10196f;
                long j = andIncrement / i;
                do {
                    jVar = jVar2;
                    while (true) {
                        if (jVar.i() >= j && !jVar.d()) {
                            break;
                        }
                        Object a2 = kotlinx.coroutines.N0.f.a(jVar);
                        xVar = kotlinx.coroutines.N0.e.a;
                        if (a2 == xVar) {
                            jVar = kotlinx.coroutines.N0.e.a;
                            break;
                        }
                        w wVar = (w) ((kotlinx.coroutines.N0.f) a2);
                        if (wVar != null) {
                            jVar = wVar;
                        } else {
                            j jVar3 = new j(jVar.i() + 1, jVar, 0);
                            if (jVar.g(jVar3)) {
                                if (jVar.d()) {
                                    jVar.f();
                                }
                                jVar = jVar3;
                            }
                        }
                    }
                    xVar2 = kotlinx.coroutines.N0.e.a;
                    if ((jVar == xVar2) == true) {
                        break;
                    }
                    w S = r.S(jVar);
                    while (true) {
                        w wVar2 = (w) this.head;
                        if (wVar2.i() >= S.i()) {
                            break;
                        }
                        if (!S.l()) {
                            r8 = false;
                            break;
                        } else if (f10188c.compareAndSet(this, wVar2, S)) {
                            if (wVar2.h()) {
                                wVar2.f();
                            }
                        } else if (S.h()) {
                            S.f();
                        }
                    }
                    r8 = true;
                } while (r8 == false);
                j jVar4 = (j) r.S(jVar);
                jVar4.b();
                if (jVar4.i() <= j) {
                    i2 = i.f10196f;
                    int i7 = (int) (andIncrement % i2);
                    xVar3 = i.b;
                    Object andSet = jVar4.f10197e.getAndSet(i7, xVar3);
                    if (andSet == null) {
                        i4 = i.a;
                        while (i6 < i4) {
                            Object obj = jVar4.f10197e.get(i7);
                            xVar7 = i.f10193c;
                            if (obj == xVar7) {
                                i6 = 1;
                                break;
                            }
                            i6++;
                        }
                        xVar5 = i.b;
                        xVar6 = i.f10194d;
                        i6 = !jVar4.f10197e.compareAndSet(i7, xVar5, xVar6) ? 1 : 0;
                    } else {
                        xVar4 = i.f10195e;
                        if (andSet != xVar4 && (i3 = (interfaceC0812k = (InterfaceC0812k) andSet).i(o.a, null, this.b)) != null) {
                            interfaceC0812k.t(i3);
                            i6 = 1;
                            break;
                        }
                    }
                }
                if (i6 != 0) {
                    return;
                }
            }
        }
    }
}
