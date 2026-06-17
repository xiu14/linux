package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.r.f;

/* renamed from: kotlinx.coroutines.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0817m0 extends f.b {
    public static final a H = a.a;

    /* renamed from: kotlinx.coroutines.m0$a */
    public static final class a implements f.c<InterfaceC0817m0> {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    InterfaceC0820p S(r rVar);

    boolean a();

    void d(CancellationException cancellationException);

    boolean isCancelled();

    U p(boolean z, boolean z2, kotlin.s.b.l<? super Throwable, kotlin.o> lVar);

    CancellationException r();

    boolean start();

    U z(kotlin.s.b.l<? super Throwable, kotlin.o> lVar);
}
