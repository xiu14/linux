package com.obric.common.oea.foundation.graphics.smoothcorner.b;

import android.graphics.Path;

/* loaded from: classes2.dex */
public final class g extends d {
    private final float b = 1.175f;

    @Override // com.obric.common.oea.foundation.graphics.smoothcorner.b.d
    public Path b(float f2, float f3, float f4, float f5, float f6) {
        float min = Math.min(f4 - f2, f5 - f3);
        if (f6 == 0.0f || f6 >= min * 0.375d) {
            return c(f2, f3, f4, f5, f6);
        }
        float min2 = Math.min(min / 2.0f, f6 * this.b);
        float f7 = f3 + min2;
        e eVar = new e(f4, f7);
        float f8 = f5 - min2;
        e eVar2 = new e(f4, f8);
        e eVar3 = new e(f4, f5);
        float f9 = f4 - min2;
        e eVar4 = new e(f9, f5);
        float f10 = min2 + f2;
        e eVar5 = new e(f10, f5);
        e eVar6 = new e(f2, f5);
        e eVar7 = new e(f2, f8);
        e eVar8 = new e(f2, f7);
        e eVar9 = new e(f2, f3);
        e eVar10 = new e(f10, f3);
        e eVar11 = new e(f9, f3);
        e eVar12 = new e(f4, f3);
        e eVar13 = new e(f4, f7);
        Path path = new Path();
        path.moveTo(eVar.c(), eVar.d());
        path.quadTo(e.a.a.a.a.b(eVar2, path, eVar2.c(), eVar3), eVar3.d(), eVar4.c(), eVar4.d());
        path.quadTo(e.a.a.a.a.b(eVar5, path, eVar5.c(), eVar6), eVar6.d(), eVar7.c(), eVar7.d());
        path.quadTo(e.a.a.a.a.b(eVar8, path, eVar8.c(), eVar9), eVar9.d(), eVar10.c(), eVar10.d());
        path.quadTo(e.a.a.a.a.b(eVar11, path, eVar11.c(), eVar12), eVar12.d(), eVar13.c(), eVar13.d());
        path.close();
        return path;
    }

    @Override // com.obric.common.oea.foundation.graphics.smoothcorner.b.d
    public boolean d(float f2, float f3) {
        return ((double) f2) < ((double) f3) * 0.375d;
    }
}
