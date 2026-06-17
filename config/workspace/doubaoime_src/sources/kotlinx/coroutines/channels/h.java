package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.G;

/* loaded from: classes2.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.coroutines.channels.q<?> r4, kotlin.s.b.a<kotlin.o> r5, kotlin.r.d<? super kotlin.o> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.n
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.n r0 = (kotlinx.coroutines.channels.n) r0
            int r1 = r0.f10234d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10234d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.n r0 = new kotlinx.coroutines.channels.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10233c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f10234d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.b
            r5 = r4
            kotlin.s.b.a r5 = (kotlin.s.b.a) r5
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.channels.q r4 = (kotlinx.coroutines.channels.q) r4
            com.prolificinteractive.materialcalendarview.r.k0(r6)     // Catch: java.lang.Throwable -> L30
            goto L76
        L30:
            r4 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            kotlin.r.f r6 = r0.getContext()
            kotlinx.coroutines.m0$a r2 = kotlinx.coroutines.InterfaceC0817m0.H
            kotlin.r.f$b r6 = r6.get(r2)
            if (r6 != r4) goto L4b
            r6 = r3
            goto L4c
        L4b:
            r6 = 0
        L4c:
            if (r6 == 0) goto L80
            r0.a = r4     // Catch: java.lang.Throwable -> L30
            r0.b = r5     // Catch: java.lang.Throwable -> L30
            r0.f10234d = r3     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l     // Catch: java.lang.Throwable -> L30
            kotlin.r.d r2 = kotlin.coroutines.intrinsics.a.d(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L30
            r6.v()     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.channels.o r2 = new kotlinx.coroutines.channels.o     // Catch: java.lang.Throwable -> L30
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L30
            r4.m(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L73
            java.lang.String r6 = "frame"
            kotlin.s.c.l.f(r0, r6)     // Catch: java.lang.Throwable -> L30
        L73:
            if (r4 != r1) goto L76
            return r1
        L76:
            r5.invoke()
            kotlin.o r4 = kotlin.o.a
            return r4
        L7c:
            r5.invoke()
            throw r4
        L80:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.h.a(kotlinx.coroutines.channels.q, kotlin.s.b.a, kotlin.r.d):java.lang.Object");
    }

    public static final void b(s<?> sVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = new CancellationException("Channel was consumed, consumer had failed");
                r0.initCause(th);
            }
        }
        sVar.d(r0);
    }

    public static final <E> s<E> c(G g2, kotlin.r.f fVar, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, kotlin.s.b.l<? super Throwable, kotlin.o> lVar, kotlin.s.b.p<? super q<? super E>, ? super kotlin.r.d<? super kotlin.o>, ? extends Object> pVar) {
        p pVar2 = new p(C0795d.m(g2, fVar), com.prolificinteractive.materialcalendarview.r.a(i, bufferOverflow, null, 4));
        if (lVar != null) {
            pVar2.p(false, true, lVar);
        }
        coroutineStart.invoke(pVar, pVar2, pVar2);
        return pVar2;
    }
}
