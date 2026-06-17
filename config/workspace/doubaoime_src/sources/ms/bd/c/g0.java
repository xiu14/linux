package ms.bd.c;

import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;

/* loaded from: classes2.dex */
public final class g0 implements DisplayManager.DisplayListener {
    public final DisplayManager a;

    public g0(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        try {
            Display[] displays = this.a.getDisplays();
            int length = displays.length;
            if (length > 0) {
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
                if (!TextUtils.isEmpty(d2)) {
                    y3Var.f10482g = d2;
                }
                if (!TextUtils.isEmpty(b)) {
                    y3Var.h = b;
                }
                y3Var.a = System.currentTimeMillis() / 1000;
                y3Var.f10481f = (String) y2.a(16777217, 0, 0L, "7274a4", new byte[]{39, 52, 64});
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        try {
            Display[] displays = this.a.getDisplays();
            int length = displays.length;
            if (length > 0) {
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
                if (!TextUtils.isEmpty(d2)) {
                    y3Var.f10482g = d2;
                }
                if (!TextUtils.isEmpty(b)) {
                    y3Var.h = b;
                }
                y3Var.b = System.currentTimeMillis() / 1000;
                y3Var.f10481f = (String) y2.a(16777217, 0, 0L, "894c30", new byte[]{59, 62, 74, 24, 26, 34});
            }
        } catch (Exception unused) {
        }
    }
}
