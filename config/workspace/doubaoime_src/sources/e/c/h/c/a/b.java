package e.c.h.c.a;

import e.c.h.f.j;
import e.c.h.g.f;

/* loaded from: classes2.dex */
public class b {
    private static boolean a;
    private static a b;

    /* renamed from: c, reason: collision with root package name */
    private static int f9848c;

    public static a a(e.c.h.d.b bVar, f fVar, j<com.facebook.cache.common.b, com.facebook.imagepipeline.image.d> jVar, boolean z) {
        if (!a) {
            try {
                b = (a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(e.c.h.d.b.class, f.class, j.class, Boolean.TYPE).newInstance(bVar, fVar, jVar, Boolean.valueOf(z));
            } catch (Throwable unused) {
            }
            if (b != null) {
                a = true;
            }
        }
        return b;
    }

    public static int b() {
        return f9848c;
    }

    public static void c(int i) {
        f9848c = i;
    }
}
