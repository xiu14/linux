package ms.bd.c;

import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile m0 f10405c;
    public final j0 a;
    public l0 b;

    static {
        f10405c = null;
    }

    public m0() {
        HandlerThread handlerThread = new HandlerThread((String) y2.a(16777217, 0, 0L, "433d06", new byte[]{1, 40, 109, 3, 8, 16, 34, 23, 119, 49}));
        handlerThread.start();
        this.a = new j0(this, handlerThread.getLooper());
    }

    public static m0 a() {
        if (f10405c == null) {
            synchronized (m0.class) {
                if (f10405c == null) {
                    f10405c = new m0();
                }
            }
        }
        return f10405c;
    }

    public final boolean b(k0 k0Var, String str) {
        j0 j0Var = this.a;
        if (j0Var == null) {
            return false;
        }
        if (k0Var == k0.f10400d) {
            j0Var.removeMessages(k0Var.a);
            return true;
        }
        Message message = new Message();
        message.what = k0Var.ordinal();
        message.obj = str;
        return this.a.sendMessage(message);
    }
}
