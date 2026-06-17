package kotlinx.coroutines.N0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class o<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    private final int a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10171c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f10172d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f10168e = new a(null);
    public static final x h = new x("REMOVE_FROZEN");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10169f = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10170g = AtomicLongFieldUpdater.newUpdater(o.class, "_state");

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }
    }

    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    public o(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.f10171c = i2;
        this.f10172d = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r15) {
        /*
            r14 = this;
        L0:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L15
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L14
            r1 = 2
        L14:
            return r1
        L15:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.f10171c
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L30
            return r1
        L30:
            boolean r4 = r14.b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.f10172d
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r2 = r14.a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L0
        L4e:
            return r1
        L4f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.N0.o.f10170g
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f10172d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L99
            kotlinx.coroutines.N0.o r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f10172d
            int r2 = r0.f10171c
            r2 = r2 & r10
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof kotlinx.coroutines.N0.o.b
            if (r2 == 0) goto L96
            kotlinx.coroutines.N0.o$b r1 = (kotlinx.coroutines.N0.o.b) r1
            int r1 = r1.a
            if (r1 != r10) goto L96
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f10172d
            int r2 = r0.f10171c
            r2 = r2 & r10
            r1.set(r2, r15)
            goto L97
        L96:
            r0 = 0
        L97:
            if (r0 != 0) goto L6d
        L99:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.N0.o.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f10170g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o<E> e() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f10170g.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            o<E> oVar = (o) this._next;
            if (oVar != null) {
                return oVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10169f;
            o oVar2 = new o(this.a * 2, this.b);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f10171c;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    Object obj = this.f10172d.get(i4);
                    if (obj == null) {
                        obj = new b(i);
                    }
                    oVar2.f10172d.set(oVar2.f10171c & i, obj);
                    i++;
                }
            }
            oVar2._state = (-1152921504606846977L) & j;
            atomicReferenceFieldUpdater.compareAndSet(this, null, oVar2);
        }
    }

    public final Object f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return h;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.f10171c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f10172d.get(i4);
            if (obj == null) {
                if (this.b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                long j2 = ((i + 1) & 1073741823) << 0;
                if (f10170g.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    this.f10172d.set(this.f10171c & i, null);
                    return obj;
                }
                if (this.b) {
                    o<E> oVar = this;
                    while (true) {
                        long j3 = oVar._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            oVar = oVar.e();
                        } else {
                            if (f10170g.compareAndSet(oVar, j3, (j3 & (-1073741824)) | j2)) {
                                oVar.f10172d.set(oVar.f10171c & i5, null);
                                oVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (oVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
