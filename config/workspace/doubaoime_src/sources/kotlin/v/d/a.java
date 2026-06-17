package kotlin.v.d;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a extends kotlin.v.a {
    @Override // kotlin.v.c
    public int e(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.v.a
    public Random f() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.e(current, "current()");
        return current;
    }
}
