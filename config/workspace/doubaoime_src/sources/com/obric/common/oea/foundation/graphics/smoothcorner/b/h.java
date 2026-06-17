package com.obric.common.oea.foundation.graphics.smoothcorner.b;

import android.graphics.Path;

/* loaded from: classes2.dex */
public final class h extends d {
    private final float b = 128.19f;

    /* renamed from: c, reason: collision with root package name */
    private final float f7553c = 83.62f;

    /* renamed from: d, reason: collision with root package name */
    private final b f7554d = new b(67.45f, 51.16f, 34.86f, 22.07f, 13.36f, 4.64f);

    @Override // com.obric.common.oea.foundation.graphics.smoothcorner.b.d
    public Path b(float f2, float f3, float f4, float f5, float f6) {
        Path path = new Path();
        float f7 = f4 - f2;
        float f8 = f5 - f3;
        float min = Math.min(f7, f8);
        if (f6 == 0.0f || f6 >= min * 0.5f) {
            return c(f2, f3, f4, f5, f6);
        }
        float f9 = f6 / (min / 2.0f);
        float min2 = f9 > 0.5f ? 1.0f - (Math.min(1.0f, (f9 - 0.5f) / 0.4f) * 0.13877845f) : 1.0f;
        float min3 = f9 > 0.6f ? 1.0f + (Math.min(1.0f, (f9 - 0.6f) / 0.3f) * 0.042454004f) : 1.0f;
        float f10 = f6 / 100.0f;
        float f11 = this.b * f10 * min2;
        float f12 = this.f7553c * f10 * min3;
        b bVar = new b(this.f7554d.e() * f10, this.f7554d.d() * f10, this.f7554d.c() * f10, this.f7554d.f() * f10, this.f7554d.a() * f10, this.f7554d.b() * f10);
        float f13 = (f7 / 2.0f) + f2;
        e eVar = new e(f13, f3);
        float f14 = f4 - f11;
        e eVar2 = new e(Math.max(f13, f14), f3);
        float f15 = f4 - f12;
        e eVar3 = new e(f15, f3);
        e eVar4 = new e(f4 - bVar.e(), bVar.b() + f3);
        e eVar5 = new e(f4 - bVar.d(), bVar.a() + f3);
        e eVar6 = new e(f4 - bVar.c(), bVar.f() + f3);
        e eVar7 = new e(f4 - bVar.f(), bVar.c() + f3);
        e eVar8 = new e(f4 - bVar.a(), bVar.d() + f3);
        e eVar9 = new e(f4 - bVar.b(), bVar.e() + f3);
        float f16 = f3 + f12;
        e eVar10 = new e(f4, f16);
        float f17 = f8 / 2.0f;
        e eVar11 = new e(f4, Math.min(f17, f11) + f3);
        float f18 = f17 + f3;
        float f19 = f5 - f11;
        e eVar12 = new e(f4, Math.max(f18, f19));
        float f20 = f5 - f12;
        e eVar13 = new e(f4, f20);
        e eVar14 = new e(f4 - bVar.b(), f5 - bVar.e());
        e eVar15 = new e(f4 - bVar.a(), f5 - bVar.d());
        e eVar16 = new e(f4 - bVar.f(), f5 - bVar.c());
        e eVar17 = new e(f4 - bVar.c(), f5 - bVar.f());
        e eVar18 = new e(f4 - bVar.d(), f5 - bVar.a());
        e eVar19 = new e(f4 - bVar.e(), f5 - bVar.b());
        e eVar20 = new e(f15, f5);
        e eVar21 = new e(Math.max(f13, f14), f5);
        float f21 = f2 + f11;
        e eVar22 = new e(Math.min(f13, f21), f5);
        float f22 = f12 + f2;
        e eVar23 = new e(f22, f5);
        e eVar24 = new e(bVar.e() + f2, f5 - bVar.b());
        e eVar25 = new e(bVar.d() + f2, f5 - bVar.a());
        e eVar26 = new e(bVar.c() + f2, f5 - bVar.f());
        e eVar27 = new e(bVar.f() + f2, f5 - bVar.c());
        e eVar28 = new e(bVar.a() + f2, f5 - bVar.d());
        e eVar29 = new e(bVar.b() + f2, f5 - bVar.e());
        e eVar30 = new e(f2, f20);
        e eVar31 = new e(f2, Math.max(f18, f19));
        e eVar32 = new e(f2, Math.min(f18, f3 + f11));
        e eVar33 = new e(f2, f16);
        e eVar34 = new e(bVar.b() + f2, bVar.e() + f3);
        e eVar35 = new e(bVar.a() + f2, bVar.d() + f3);
        e eVar36 = new e(bVar.f() + f2, bVar.c() + f3);
        e eVar37 = new e(bVar.c() + f2, bVar.f() + f3);
        e eVar38 = new e(bVar.d() + f2, bVar.a() + f3);
        e eVar39 = new e(bVar.e() + f2, bVar.b() + f3);
        e eVar40 = new e(f22, f3);
        e eVar41 = new e(Math.min(f13, f21), f3);
        path.moveTo(eVar.c(), eVar.d());
        path.cubicTo(e.a.a.a.a.b(eVar2, path, eVar2.c(), eVar3), eVar3.d(), eVar4.c(), eVar4.d(), eVar5.c(), eVar5.d());
        path.cubicTo(eVar6.c(), eVar6.d(), eVar7.c(), eVar7.d(), eVar8.c(), eVar8.d());
        path.cubicTo(eVar9.c(), eVar9.d(), eVar10.c(), eVar10.d(), eVar11.c(), eVar11.d());
        path.cubicTo(e.a.a.a.a.b(eVar12, path, eVar12.c(), eVar13), eVar13.d(), eVar14.c(), eVar14.d(), eVar15.c(), eVar15.d());
        path.cubicTo(eVar16.c(), eVar16.d(), eVar17.c(), eVar17.d(), eVar18.c(), eVar18.d());
        path.cubicTo(eVar19.c(), eVar19.d(), eVar20.c(), eVar20.d(), eVar21.c(), eVar21.d());
        path.cubicTo(e.a.a.a.a.b(eVar22, path, eVar22.c(), eVar23), eVar23.d(), eVar24.c(), eVar24.d(), eVar25.c(), eVar25.d());
        path.cubicTo(eVar26.c(), eVar26.d(), eVar27.c(), eVar27.d(), eVar28.c(), eVar28.d());
        path.cubicTo(eVar29.c(), eVar29.d(), eVar30.c(), eVar30.d(), eVar31.c(), eVar31.d());
        path.cubicTo(e.a.a.a.a.b(eVar32, path, eVar32.c(), eVar33), eVar33.d(), eVar34.c(), eVar34.d(), eVar35.c(), eVar35.d());
        path.cubicTo(eVar36.c(), eVar36.d(), eVar37.c(), eVar37.d(), eVar38.c(), eVar38.d());
        path.cubicTo(eVar39.c(), eVar39.d(), eVar40.c(), eVar40.d(), eVar41.c(), eVar41.d());
        path.close();
        return path;
    }

    @Override // com.obric.common.oea.foundation.graphics.smoothcorner.b.d
    public boolean d(float f2, float f3) {
        return f2 < f3 * 0.5f;
    }
}
