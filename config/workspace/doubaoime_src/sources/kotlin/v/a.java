package kotlin.v;

import java.util.Random;

/* loaded from: classes2.dex */
public abstract class a extends c {
    @Override // kotlin.v.c
    public int b(int i) {
        return ((-i) >> 31) & (f().nextInt() >>> (32 - i));
    }

    @Override // kotlin.v.c
    public float c() {
        return f().nextFloat();
    }

    @Override // kotlin.v.c
    public int d() {
        return f().nextInt();
    }

    public abstract Random f();
}
