package d.a.e;

import d.a.b.e.i;
import d.a.b.e.j;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class e {
    private static final i.a a = j.b().a();
    public static final e b = null;

    static final class a extends m implements kotlin.s.b.a<o> {
        final /* synthetic */ Runnable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Runnable runnable) {
            super(0);
            this.a = runnable;
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            this.a.run();
            return o.a;
        }
    }

    public static final void a(Runnable runnable) {
        l.g(runnable, "runnable");
        a.a(0L, new a(runnable));
    }
}
