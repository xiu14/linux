package ms.bd.c;

import android.opengl.EGL14;
import android.opengl.GLES20;

/* loaded from: classes2.dex */
public abstract class y0 {
    public static volatile String a;
    public static final String b = (String) y2.a(16777217, 0, 0, "261aa0", new byte[]{98, 33, 76, 6, 75, 55, 33, 24, 114, 37, 38, 48, 3});

    /* renamed from: c, reason: collision with root package name */
    public static final String f10472c = (String) y2.a(16777217, 0, 0, "f830bd", new byte[]{54, 63, 82, 86, 28});

    public static String a() {
        x0 x0Var;
        if (a != null) {
            return a;
        }
        synchronized (y0.class) {
            if (a != null) {
                return a;
            }
            x0 x0Var2 = null;
            try {
                try {
                    x0Var = new x0();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                x0Var = x0Var2;
            }
            try {
                x0Var.c(EGL14.EGL_NO_SURFACE);
                a = GLES20.glGetString(7936) + ((String) y2.a(16777217, 0, 0L, "ad5ae0", new byte[]{108})) + GLES20.glGetString(7937) + ((String) y2.a(16777217, 0, 0L, "a9bd06", new byte[]{108})) + GLES20.glGetString(7938);
                x0Var.b();
            } catch (Exception unused2) {
                x0Var2 = x0Var;
                a = f10472c;
                if (x0Var2 != null) {
                    x0Var2.b();
                }
                return a;
            } catch (Throwable th2) {
                th = th2;
                if (x0Var != null) {
                    x0Var.b();
                }
                throw th;
            }
            return a;
        }
    }
}
