package d.a.b.c;

import d.a.b.e.i;
import d.a.b.e.j;
import kotlin.o;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class a implements b {
    private final i.a a = j.a().a();

    /* renamed from: d.a.b.c.a$a, reason: collision with other inner class name */
    static final class C0415a extends m implements kotlin.s.b.a<o> {
        final /* synthetic */ Runnable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0415a(Runnable runnable) {
            super(0);
            this.a = runnable;
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            this.a.run();
            return o.a;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        l.g(runnable, "runnable");
        this.a.a(0L, new C0415a(runnable));
    }
}
