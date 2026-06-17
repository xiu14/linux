package ms.bd.c;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;

/* loaded from: classes2.dex */
public final class a4 implements Runnable {
    public final /* synthetic */ b4 a;

    public a4(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b4 b4Var = this.a;
            if (b4Var.b != null) {
                b4Var.a.start();
                Handler handler = new Handler(this.a.a.getLooper());
                b4 b4Var2 = this.a;
                b4Var2.f10357d = (DisplayManager) b4Var2.b.getApplicationContext().getSystemService((String) y2.a(16777217, 0, 0L, "82099c", new byte[]{45, 57, 80, 93, 10, 117, 34}));
                DisplayManager displayManager = this.a.f10357d;
                if (displayManager != null) {
                    Display[] displays = displayManager.getDisplays();
                    int length = displays.length;
                    if (length > 1) {
                        if (y3.j == null) {
                            y3.j = new y3();
                        }
                        y3 y3Var = y3.j;
                        y3Var.getClass();
                        String d2 = y3.d(displays);
                        String b = y3.b(displays);
                        if (y3Var.f10479d != length) {
                            y3Var.f10480e = System.currentTimeMillis() / 1000;
                        }
                        y3Var.f10479d = length;
                        y3Var.i = true;
                        if (!TextUtils.isEmpty(d2)) {
                            y3Var.f10482g = d2;
                        }
                        if (!TextUtils.isEmpty(b)) {
                            y3Var.h = b;
                        }
                    }
                    b4 b4Var3 = this.a;
                    DisplayManager displayManager2 = b4Var3.f10357d;
                    g0 g0Var = new g0(displayManager2);
                    b4Var3.f10358e = g0Var;
                    displayManager2.registerDisplayListener(g0Var, handler);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
