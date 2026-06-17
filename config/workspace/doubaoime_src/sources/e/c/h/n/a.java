package e.c.h.n;

/* loaded from: classes2.dex */
public class a {
    public static int a(com.facebook.imagepipeline.common.f fVar, com.facebook.imagepipeline.common.e eVar, com.facebook.imagepipeline.image.f fVar2, int i) {
        float f2;
        double d2;
        int G;
        int i2 = 1;
        if (!com.facebook.imagepipeline.image.f.Y(fVar2)) {
            return 1;
        }
        e.c.c.d.h.a(com.facebook.imagepipeline.image.f.Y(fVar2));
        int i3 = 2;
        if (eVar == null || eVar.b <= 0 || eVar.a <= 0 || fVar2.N() == 0 || fVar2.x() == 0) {
            f2 = 1.0f;
        } else {
            if (fVar.g()) {
                G = fVar2.G();
                e.c.c.d.h.a(G == 0 || G == 90 || G == 180 || G == 270);
            } else {
                G = 0;
            }
            boolean z = G == 90 || G == 270;
            int x = z ? fVar2.x() : fVar2.N();
            int N = z ? fVar2.N() : fVar2.x();
            float f3 = eVar.a / x;
            float f4 = eVar.b / N;
            f2 = Math.max(f3, f4);
            e.c.c.e.a.s("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(eVar.a), Integer.valueOf(eVar.b), Integer.valueOf(x), Integer.valueOf(N), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f2));
        }
        if (fVar2.z() == e.c.g.c.a) {
            if (f2 <= 0.6666667f) {
                do {
                    i2 = i3;
                    i3 = i2 * 2;
                    d2 = 1.0d / i3;
                } while ((d2 * 0.3333333432674408d) + d2 > f2);
            }
        } else if (f2 <= 0.6666667f) {
            while (true) {
                double d3 = i3;
                if (((1.0d / (Math.pow(d3, 2.0d) - d3)) * 0.3333333432674408d) + (1.0d / d3) <= f2) {
                    break;
                }
                i3++;
            }
            i2 = i3 - 1;
        }
        int max = Math.max(fVar2.x(), fVar2.N());
        float f5 = eVar != null ? eVar.f6462c : i;
        while (max / i2 > f5) {
            i2 = fVar2.z() == e.c.g.c.a ? i2 * 2 : i2 + 1;
        }
        return i2;
    }
}
