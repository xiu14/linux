package ms.bd.c;

import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class v1 implements Runnable {
    public final /* synthetic */ w1 a;

    public v1(w1 w1Var) {
        this.a = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a2 a2Var = this.a.b.a;
        if (a2Var.a) {
            if (a2Var.f10347d == null) {
                a2Var.f10347d = new z1(a2Var, a2Var.b);
            }
            if (!a2Var.f10348e) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1, 1, 2038, 262152, -3);
                layoutParams.gravity = 8388661;
                try {
                    a2Var.f10346c.addView(a2Var.f10347d, layoutParams);
                } catch (Exception unused) {
                }
                a2Var.f10348e = true;
            }
        }
        int i = this.a.b.b.b;
    }
}
