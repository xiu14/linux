package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kotlinx.coroutines.flow.g r4, kotlin.s.b.q r5, java.lang.Throwable r6, kotlin.r.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.l
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.l r0 = (kotlinx.coroutines.flow.l) r0
            int r1 = r0.f10274c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10274c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.l r0 = new kotlinx.coroutines.flow.l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f10274c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            com.prolificinteractive.materialcalendarview.r.k0(r7)     // Catch: java.lang.Throwable -> L45
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            com.prolificinteractive.materialcalendarview.r.k0(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L45
            r0.f10274c = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r4 = r5.d(r4, r6, r0)     // Catch: java.lang.Throwable -> L45
            if (r4 != r1) goto L42
            goto L44
        L42:
            kotlin.o r1 = kotlin.o.a
        L44:
            return r1
        L45:
            r4 = move-exception
            if (r6 == 0) goto L4d
            if (r6 == r4) goto L4d
            kotlin.a.a(r4, r6)
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h.b(kotlinx.coroutines.flow.g, kotlin.s.b.q, java.lang.Throwable, kotlin.r.d):java.lang.Object");
    }

    public static final <T> x<T> c(t<T> tVar) {
        return new u(tVar, null);
    }

    public static final <T> f<T> d(kotlin.s.b.p<? super kotlinx.coroutines.channels.q<? super T>, ? super kotlin.r.d<? super kotlin.o>, ? extends Object> pVar) {
        return new C0802b(pVar, null, 0, null, 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> f<T> e(f<? extends T> fVar) {
        return fVar instanceof InterfaceC0803c ? fVar : new d(fVar);
    }

    public static final <T> Object f(g<? super T> gVar, kotlinx.coroutines.channels.s<? extends T> sVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object g2 = g(gVar, sVar, true, dVar);
        return g2 == CoroutineSingletons.COROUTINE_SUSPENDED ? g2 : kotlin.o.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:12:0x0030, B:20:0x006e, B:22:0x0072, B:24:0x0077, B:26:0x007d, B:32:0x008b, B:36:0x008c, B:52:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:12:0x0030, B:20:0x006e, B:22:0x0072, B:24:0x0077, B:26:0x007d, B:32:0x008b, B:36:0x008c, B:52:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.g<? super T>] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlinx.coroutines.flow.g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009b -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object g(kotlinx.coroutines.flow.g<? super T> r6, kotlinx.coroutines.channels.s<? extends T> r7, boolean r8, kotlin.r.d<? super kotlin.o> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.j
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
            int r1 = r0.f10273e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10273e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.j r0 = new kotlinx.coroutines.flow.j
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10272d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f10273e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L55
            if (r2 == r3) goto L3f
            if (r2 != r4) goto L37
            boolean r6 = r0.f10271c
            java.lang.Object r7 = r0.b
            kotlinx.coroutines.channels.s r7 = (kotlinx.coroutines.channels.s) r7
            java.lang.Object r8 = r0.a
            kotlinx.coroutines.flow.g r8 = (kotlinx.coroutines.flow.g) r8
            com.prolificinteractive.materialcalendarview.r.k0(r9)     // Catch: java.lang.Throwable -> L53
        L33:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L5c
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            boolean r6 = r0.f10271c
            java.lang.Object r7 = r0.b
            kotlinx.coroutines.channels.s r7 = (kotlinx.coroutines.channels.s) r7
            java.lang.Object r8 = r0.a
            kotlinx.coroutines.flow.g r8 = (kotlinx.coroutines.flow.g) r8
            com.prolificinteractive.materialcalendarview.r.k0(r9)     // Catch: java.lang.Throwable -> L53
            kotlinx.coroutines.channels.g r9 = (kotlinx.coroutines.channels.g) r9     // Catch: java.lang.Throwable -> L53
            java.lang.Object r9 = r9.c()     // Catch: java.lang.Throwable -> L53
            goto L6e
        L53:
            r8 = move-exception
            goto La2
        L55:
            com.prolificinteractive.materialcalendarview.r.k0(r9)
            boolean r9 = r6 instanceof kotlinx.coroutines.flow.C
            if (r9 != 0) goto Laa
        L5c:
            r0.a = r6     // Catch: java.lang.Throwable -> L9e
            r0.b = r7     // Catch: java.lang.Throwable -> L9e
            r0.f10271c = r8     // Catch: java.lang.Throwable -> L9e
            r0.f10273e = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r9 = r7.c(r0)     // Catch: java.lang.Throwable -> L9e
            if (r9 != r1) goto L6b
            return r1
        L6b:
            r5 = r8
            r8 = r6
            r6 = r5
        L6e:
            boolean r2 = r9 instanceof kotlinx.coroutines.channels.g.a     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L8c
            boolean r8 = r9 instanceof kotlinx.coroutines.channels.g.a     // Catch: java.lang.Throwable -> L53
            r0 = 0
            if (r8 == 0) goto L7a
            kotlinx.coroutines.channels.g$a r9 = (kotlinx.coroutines.channels.g.a) r9     // Catch: java.lang.Throwable -> L53
            goto L7b
        L7a:
            r9 = r0
        L7b:
            if (r9 == 0) goto L80
            java.lang.Throwable r8 = r9.a     // Catch: java.lang.Throwable -> L53
            goto L81
        L80:
            r8 = r0
        L81:
            if (r8 != 0) goto L8b
            if (r6 == 0) goto L88
            kotlinx.coroutines.channels.h.b(r7, r0)
        L88:
            kotlin.o r6 = kotlin.o.a
            return r6
        L8b:
            throw r8     // Catch: java.lang.Throwable -> L53
        L8c:
            kotlinx.coroutines.channels.g.b(r9)     // Catch: java.lang.Throwable -> L53
            r0.a = r8     // Catch: java.lang.Throwable -> L53
            r0.b = r7     // Catch: java.lang.Throwable -> L53
            r0.f10271c = r6     // Catch: java.lang.Throwable -> L53
            r0.f10273e = r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r9 = r8.emit(r9, r0)     // Catch: java.lang.Throwable -> L53
            if (r9 != r1) goto L33
            return r1
        L9e:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        La2:
            throw r8     // Catch: java.lang.Throwable -> La3
        La3:
            r9 = move-exception
            if (r6 == 0) goto La9
            kotlinx.coroutines.channels.h.b(r7, r8)
        La9:
            throw r9
        Laa:
            kotlinx.coroutines.flow.C r6 = (kotlinx.coroutines.flow.C) r6
            java.lang.Throwable r6 = r6.a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h.g(kotlinx.coroutines.flow.g, kotlinx.coroutines.channels.s, boolean, kotlin.r.d):java.lang.Object");
    }

    public static final <T, R> f<R> h(f<? extends T> fVar, kotlin.s.b.p<? super T, ? super kotlin.r.d<? super f<? extends R>>, ? extends Object> pVar) {
        int i = q.b;
        return new o(new n(fVar, pVar));
    }

    public static final <T> f<T> j(kotlin.s.b.p<? super g<? super T>, ? super kotlin.r.d<? super kotlin.o>, ? extends Object> pVar) {
        return new v(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> f<T> k(f<? extends T> fVar, kotlin.r.f fVar2) {
        if (fVar2.get(InterfaceC0817m0.H) == null) {
            return kotlin.s.c.l.a(fVar2, kotlin.r.g.a) ? fVar : fVar instanceof kotlinx.coroutines.flow.D.m ? ((kotlinx.coroutines.flow.D.m) fVar).b(fVar2, -3, BufferOverflow.SUSPEND) : new kotlinx.coroutines.flow.D.k(fVar, fVar2, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + fVar2).toString());
    }

    public static final <T> InterfaceC0817m0 l(f<? extends T> fVar, G g2) {
        return C0795d.l(g2, null, null, new k(fVar, null), 3, null);
    }
}
