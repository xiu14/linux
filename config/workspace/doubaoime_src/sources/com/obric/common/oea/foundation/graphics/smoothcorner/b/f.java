package com.obric.common.oea.foundation.graphics.smoothcorner.b;

import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;

/* loaded from: classes2.dex */
public final class f extends d {
    private final String b = "QuadraticSmoothCornerExImpl";

    /* renamed from: c, reason: collision with root package name */
    private final float f7550c = 0.585786f;

    /* renamed from: d, reason: collision with root package name */
    private final float f7551d = 0.292893f;

    /* renamed from: e, reason: collision with root package name */
    private final float f7552e = 1.175f;

    @Override // com.obric.common.oea.foundation.graphics.smoothcorner.b.d
    public Path b(float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        float f8;
        f fVar;
        Path path;
        float f9 = f4 - f2;
        float f10 = f5 - f3;
        float min = Math.min(f9, f10);
        float max = Math.max(f9, f10);
        if (f6 != 0.0f) {
            float f11 = min * 0.5f;
            if (f6 == f11) {
                if (f6 == f11 && f9 == f10) {
                    return c(f2, f3, f4, f5, f6);
                }
                boolean z2 = f9 > f10;
                float c2 = kotlin.w.h.c(f6, f11);
                float min2 = Math.min(this.f7552e * c2, max * 0.5f);
                if (z2) {
                    float f12 = this.f7550c * c2;
                    float f13 = this.f7551d * c2;
                    float f14 = f2 + min2;
                    e eVar = new e(f14, f3);
                    float f15 = 2.0f * c2;
                    RectF rectF = new RectF(f2, f3, f2 + f15, f5);
                    RectF rectF2 = new RectF(f4 - f15, f3, f4, f5);
                    float f16 = f4 - min2;
                    e eVar2 = new e(f16, f3);
                    z = z2;
                    f8 = min2;
                    float f17 = f4 - f12;
                    e eVar3 = new e(f17, f3);
                    f7 = c2;
                    e eVar4 = new e(f4 - f13, f3 + f13);
                    e eVar5 = new e(f17, f5);
                    e eVar6 = new e(f16, f5);
                    e eVar7 = new e(f14, f5);
                    float f18 = f12 + f2;
                    e eVar8 = new e(f18, f5);
                    e eVar9 = new e(f2 + f13, f5 - f13);
                    e eVar10 = new e(f18, f3);
                    e eVar11 = new e(f14, f3);
                    path = new Path();
                    path.moveTo(eVar.c(), eVar.d());
                    path.quadTo(e.a.a.a.a.b(eVar2, path, eVar2.c(), eVar3), eVar3.d(), eVar4.c(), eVar4.d());
                    path.arcTo(rectF2, -45.0f, 90.0f);
                    path.quadTo(eVar5.c(), eVar5.d(), eVar6.c(), eVar6.d());
                    path.quadTo(e.a.a.a.a.b(eVar7, path, eVar7.c(), eVar8), eVar8.d(), eVar9.c(), eVar9.d());
                    path.arcTo(rectF, 135.0f, 90.0f);
                    path.quadTo(eVar10.c(), eVar10.d(), eVar11.c(), eVar11.d());
                    path.close();
                    fVar = this;
                } else {
                    z = z2;
                    f7 = c2;
                    f8 = min2;
                    float f19 = this.f7550c * f7;
                    float f20 = this.f7551d * f7;
                    float f21 = f3 + f8;
                    e eVar12 = new e(f4, f21);
                    float f22 = 2.0f * f7;
                    RectF rectF3 = new RectF(f2, f3, f4, f3 + f22);
                    RectF rectF4 = new RectF(f2, f5 - f22, f4, f5);
                    float f23 = f5 - f8;
                    e eVar13 = new e(f4, f23);
                    float f24 = f5 - f19;
                    e eVar14 = new e(f4, f24);
                    e eVar15 = new e(f4 - f20, f5 - f20);
                    e eVar16 = new e(f2, f24);
                    e eVar17 = new e(f2, f23);
                    e eVar18 = new e(f2, f21);
                    float f25 = f19 + f3;
                    e eVar19 = new e(f2, f25);
                    e eVar20 = new e(f2 + f20, f3 + f20);
                    e eVar21 = new e(f4, f25);
                    e eVar22 = new e(f4, f21);
                    Path path2 = new Path();
                    path2.moveTo(eVar12.c(), eVar12.d());
                    path2.quadTo(e.a.a.a.a.b(eVar13, path2, eVar13.c(), eVar14), eVar14.d(), eVar15.c(), eVar15.d());
                    path2.arcTo(rectF4, 45.0f, 90.0f);
                    path2.quadTo(eVar16.c(), eVar16.d(), eVar17.c(), eVar17.d());
                    path2.quadTo(e.a.a.a.a.b(eVar18, path2, eVar18.c(), eVar19), eVar19.d(), eVar20.c(), eVar20.d());
                    path2.arcTo(rectF3, 225.0f, 90.0f);
                    path2.quadTo(eVar21.c(), eVar21.d(), eVar22.c(), eVar22.d());
                    path2.close();
                    fVar = this;
                    path = path2;
                }
                Log.d(fVar.b, "build path, isHorizontal: " + z + ", radius: " + f6 + ", cornerSize: " + f7 + ", cornerSizeOptimized: " + f8);
                return path;
            }
        }
        return c(f2, f3, f4, f5, f6);
    }

    @Override // com.obric.common.oea.foundation.graphics.smoothcorner.b.d
    public boolean d(float f2, float f3) {
        return f2 == f3 * 0.5f;
    }
}
