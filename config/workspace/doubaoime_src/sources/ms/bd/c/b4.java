package ms.bd.c;

import android.app.Application;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public final class b4 {

    /* renamed from: f, reason: collision with root package name */
    public static volatile b4 f10355f;
    public final HandlerThread a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10356c = false;

    /* renamed from: d, reason: collision with root package name */
    public DisplayManager f10357d;

    /* renamed from: e, reason: collision with root package name */
    public g0 f10358e;

    public b4(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        if (!(applicationContext instanceof Application)) {
            Context context2 = null;
            try {
                context2 = (Application) Class.forName((String) y2.a(16777217, 0, 0L, "8fb156", new byte[]{40, 106, 21, 87, 5, 40, 63, 9, 50, 113, 57, 42, 48, 70, 30, 40, 45, 78, 39, 120, 29, 108, 3, 64, 11, 37})).getMethod((String) y2.a(16777217, 0, 0L, "618c5e", new byte[]{36, 38, 89, 5, 15, 124, 33, 49, 121, 35, 43, 58, 72, 22, 30, 123, 58, 30}), null).invoke(null, null);
            } catch (Throwable unused) {
            }
            this.b = context2 == null ? this.b : context2;
        }
        this.a = new HandlerThread((String) y2.a(16777217, 0, 0L, "004aeb", new byte[]{12, 1, 116, 39}));
    }

    public final void finalize() {
        g0 g0Var;
        synchronized (this) {
            try {
                DisplayManager displayManager = this.f10357d;
                if (displayManager != null && (g0Var = this.f10358e) != null) {
                    displayManager.unregisterDisplayListener(g0Var);
                }
            } catch (Throwable unused) {
            }
            HandlerThread handlerThread = this.a;
            if (handlerThread != null) {
                try {
                    handlerThread.quitSafely();
                } catch (Throwable unused2) {
                }
            }
        }
        super.finalize();
    }
}
