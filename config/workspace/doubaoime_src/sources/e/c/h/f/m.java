package e.c.h.f;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class m implements e.c.c.d.j<t> {
    private static final long a = TimeUnit.MINUTES.toMillis(5);

    @Override // e.c.c.d.j
    public t get() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = min < 16777216 ? 1048576 : min < 33554432 ? 2097152 : 4194304;
        return new t(i, Integer.MAX_VALUE, i, Integer.MAX_VALUE, i / 8, a);
    }
}
