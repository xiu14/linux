package e.c.h.f;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class k implements e.c.c.d.j<t> {
    private static final long b = TimeUnit.MINUTES.toMillis(5);
    private final ActivityManager a;

    public k(ActivityManager activityManager) {
        this.a = activityManager;
    }

    @Override // e.c.c.d.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public t get() {
        int min = Math.min(this.a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new t(min < 33554432 ? 4194304 : min < 67108864 ? 6291456 : min / 4, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, b);
    }
}
