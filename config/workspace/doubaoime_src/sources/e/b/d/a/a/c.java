package e.b.d.a.a;

import android.os.Handler;
import android.view.View;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class c implements View.OnClickListener {
    private final long a;
    private final l<View, o> b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(long j, l<? super View, o> lVar) {
        kotlin.s.c.l.f(lVar, "clickBlock");
        this.a = j;
        this.b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z;
        Handler handler;
        Runnable runnable;
        kotlin.s.c.l.f(view, "v");
        z = e.a;
        if (z) {
            e.a = false;
            handler = e.b;
            runnable = e.f9501c;
            handler.postDelayed(runnable, this.a);
            this.b.invoke(view);
        }
    }
}
