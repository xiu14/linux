package kotlin.v;

import java.util.Random;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b extends kotlin.v.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f10135c = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.v.a
    public Random f() {
        Random random = this.f10135c.get();
        l.e(random, "implStorage.get()");
        return random;
    }
}
