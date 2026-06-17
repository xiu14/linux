package com.obric.common.oea.foundation.graphics.smoothcorner.b;

import android.graphics.Path;

/* loaded from: classes2.dex */
public final class c extends d {
    private final double b = 0.017453292519943295d;

    /* renamed from: c, reason: collision with root package name */
    private final float f7549c = 0.6f;

    @Override // com.obric.common.oea.foundation.graphics.smoothcorner.b.d
    public Path b(float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        float f9;
        float f10 = f4 - f2;
        float min = Math.min(f10, f5 - f3);
        Path path = new Path();
        if (f6 == 0.0f || f6 >= 0.5f * min) {
            return c(f2, f3, f4, f5, f6);
        }
        float min2 = Math.min(min / 2.0f, (this.f7549c + 1.0f) * f6);
        float f11 = min / 4.0f;
        if (f6 > f11) {
            float f12 = this.f7549c;
            f7 = 1.0f - ((f6 - f11) / f11);
            f8 = (1.0f - (f12 * f7)) * 90;
            f9 = 45 * f12;
        } else {
            f7 = this.f7549c;
            f8 = (1.0f - f7) * 90;
            f9 = 45;
        }
        float f13 = (90 - f8) / 2.0f;
        double d2 = f9 * f7;
        float tan = (float) Math.tan(this.b * d2);
        float tan2 = ((float) Math.tan((f13 / 2.0f) * this.b)) * f6;
        float sqrt = (float) (Math.sqrt(2.0d) * Math.sin((f8 / 2.0f) * this.b) * f6);
        float cos = tan2 * ((float) Math.cos(this.b * d2));
        float f14 = cos * tan;
        float f15 = ((min2 - sqrt) - ((tan + 1.0f) * cos)) / 3.0f;
        e eVar = new e((f10 / 2.0f) + f2, f3);
        float f16 = f4 - min2;
        e eVar2 = new e(f16, f3);
        float f17 = min2 - (f15 * 2.0f);
        float f18 = f4 - f17;
        e eVar3 = new e(f18, f3);
        float f19 = f17 - f15;
        float f20 = f4 - f19;
        e eVar4 = new e(f20, f3);
        float f21 = f19 - cos;
        e eVar5 = new e(f4 - f21, f3 + f14);
        float f22 = f4 - f6;
        float f23 = f3 + f6;
        e eVar6 = new e(f22, f23);
        float f24 = f13 + 270.0f;
        float f25 = 360.0f - f13;
        float f26 = f3 + f21;
        float f27 = f3 + f19;
        e eVar7 = new e(f4, f27);
        float f28 = f3 + f17;
        e eVar8 = new e(f4, f28);
        float f29 = f3 + min2;
        e eVar9 = new e(f4, f29);
        float f30 = f5 - min2;
        e eVar10 = new e(f4, f30);
        float f31 = f5 - f17;
        e eVar11 = new e(f4, f31);
        float f32 = f5 - f19;
        e eVar12 = new e(f4, f32);
        e eVar13 = new e(f4 - f14, f5 - f21);
        float f33 = f5 - f6;
        e eVar14 = new e(f22, f33);
        float f34 = 90.0f - f13;
        e eVar15 = new e(f20, f5);
        e eVar16 = new e(f18, f5);
        e eVar17 = new e(f16, f5);
        float f35 = min2 + f2;
        e eVar18 = new e(f35, f5);
        float f36 = f17 + f2;
        e eVar19 = new e(f36, f5);
        float f37 = f19 + f2;
        e eVar20 = new e(f37, f5);
        e eVar21 = new e(f21 + f2, f5 - f14);
        float f38 = f2 + f6;
        e eVar22 = new e(f2, f32);
        e eVar23 = new e(f2, f31);
        e eVar24 = new e(f2, f30);
        e eVar25 = new e(f2, f29);
        e eVar26 = new e(f2, f28);
        e eVar27 = new e(f2, f27);
        e eVar28 = new e(f14 + f2, f26);
        e eVar29 = new e(f37, f3);
        e eVar30 = new e(f36, f3);
        e eVar31 = new e(f35, f3);
        path.moveTo(eVar.c(), eVar.d());
        path.cubicTo(e.a.a.a.a.b(eVar2, path, eVar2.c(), eVar3), eVar3.d(), eVar4.c(), eVar4.d(), eVar5.c(), eVar5.d());
        d.a(path, eVar6, f6, f24, f25);
        path.cubicTo(eVar7.c(), eVar7.d(), eVar8.c(), eVar8.d(), eVar9.c(), eVar9.d());
        path.cubicTo(e.a.a.a.a.b(eVar10, path, eVar10.c(), eVar11), eVar11.d(), eVar12.c(), eVar12.d(), eVar13.c(), eVar13.d());
        d.a(path, eVar14, f6, f13, f34);
        path.cubicTo(eVar15.c(), eVar15.d(), eVar16.c(), eVar16.d(), eVar17.c(), eVar17.d());
        path.cubicTo(e.a.a.a.a.b(eVar18, path, eVar18.c(), eVar19), eVar19.d(), eVar20.c(), eVar20.d(), eVar21.c(), eVar21.d());
        d.a(path, new e(f38, f33), f6, f13 + 90.0f, 180.0f - f13);
        path.cubicTo(eVar22.c(), eVar22.d(), eVar23.c(), eVar23.d(), eVar24.c(), eVar24.d());
        path.cubicTo(e.a.a.a.a.b(eVar25, path, eVar25.c(), eVar26), eVar26.d(), eVar27.c(), eVar27.d(), eVar28.c(), eVar28.d());
        d.a(path, new e(f38, f23), f6, f13 + 180.0f, 270.0f - f13);
        path.cubicTo(eVar29.c(), eVar29.d(), eVar30.c(), eVar30.d(), eVar31.c(), eVar31.d());
        path.close();
        return path;
    }

    @Override // com.obric.common.oea.foundation.graphics.smoothcorner.b.d
    public boolean d(float f2, float f3) {
        return f2 < f3 * 0.5f;
    }
}
