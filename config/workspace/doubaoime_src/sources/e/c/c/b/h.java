package e.c.c.b;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class h extends e {
    private static h b;

    private h() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static h b() {
        if (b == null) {
            b = new h();
        }
        return b;
    }

    @Override // e.c.c.b.e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
