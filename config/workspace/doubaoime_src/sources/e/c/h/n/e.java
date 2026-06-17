package e.c.h.n;

/* loaded from: classes2.dex */
public class e {
    public static final e.c.c.d.e<Integer> a = e.c.c.d.e.a(2, 7, 4, 5);

    public static int a(com.facebook.imagepipeline.common.f fVar, com.facebook.imagepipeline.image.f fVar2) {
        int r = fVar2.r();
        e.c.c.d.e<Integer> eVar = a;
        int indexOf = eVar.indexOf(Integer.valueOf(r));
        if (indexOf >= 0) {
            return eVar.get((((fVar.g() ? 0 : fVar.e()) / 90) + indexOf) % eVar.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int b(com.facebook.imagepipeline.common.f fVar, com.facebook.imagepipeline.image.f fVar2) {
        if (!fVar.f()) {
            return 0;
        }
        int G = fVar2.G();
        int G2 = (G == 90 || G == 180 || G == 270) ? fVar2.G() : 0;
        return fVar.g() ? G2 : (fVar.e() + G2) % 360;
    }

    public static int c(com.facebook.imagepipeline.common.f fVar, com.facebook.imagepipeline.common.e eVar, com.facebook.imagepipeline.image.f fVar2, boolean z) {
        if (!z || eVar == null) {
            return 8;
        }
        int b = b(fVar, fVar2);
        int a2 = a.contains(Integer.valueOf(fVar2.r())) ? a(fVar, fVar2) : 0;
        boolean z2 = b == 90 || b == 270 || a2 == 5 || a2 == 7;
        float x = z2 ? fVar2.x() : fVar2.N();
        float N = z2 ? fVar2.N() : fVar2.x();
        float max = Math.max(eVar.a / x, eVar.b / N);
        float f2 = x * max;
        float f3 = eVar.f6462c;
        if (f2 > f3) {
            max = f3 / x;
        }
        if (N * max > f3) {
            max = f3 / N;
        }
        int i = (int) ((max * 8.0f) + eVar.f6463d);
        if (i > 8) {
            return 8;
        }
        if (i < 1) {
            return 1;
        }
        return i;
    }
}
