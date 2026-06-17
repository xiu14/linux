package d.a.b.e;

import android.os.Handler;
import android.os.Looper;
import d.a.b.e.i;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class g implements i {

    private static final class a implements i.a {
        private volatile Handler a = new Handler(Looper.getMainLooper());
        private final Object b = new Object();

        @Override // d.a.b.e.i.a
        public void a(long j, kotlin.s.b.a<o> aVar) {
            l.g(aVar, "task");
            if (this.a != null) {
                synchronized (this.b) {
                    Handler handler = this.a;
                    if (handler != null) {
                        handler.postDelayed(new h(aVar), j);
                    }
                }
            }
        }
    }

    @Override // d.a.b.e.i
    public i.a a() {
        return new a();
    }
}
