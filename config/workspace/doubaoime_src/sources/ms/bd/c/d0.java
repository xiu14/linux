package ms.bd.c;

import android.content.Context;

/* loaded from: classes2.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ f0 b;

    public d0(f0 f0Var, Context context) {
        this.b = f0Var;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            f0.b(this.b, this.a);
            while (!((Boolean) y2.a(67108868, 0, 0L, null, null)).booleanValue()) {
                Thread.sleep(500L);
            }
            f0.d(this.b, this.a);
            f0.e(this.b, this.a);
        } catch (Throwable unused) {
        }
    }
}
