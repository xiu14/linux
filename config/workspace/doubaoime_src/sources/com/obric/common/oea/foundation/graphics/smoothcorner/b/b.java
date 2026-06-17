package com.obric.common.oea.foundation.graphics.smoothcorner.b;

/* loaded from: classes2.dex */
public final class b {
    private final float a;
    private final float b;

    /* renamed from: c, reason: collision with root package name */
    private final float f7545c;

    /* renamed from: d, reason: collision with root package name */
    private final float f7546d;

    /* renamed from: e, reason: collision with root package name */
    private final float f7547e;

    /* renamed from: f, reason: collision with root package name */
    private final float f7548f;

    public b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f2;
        this.b = f3;
        this.f7545c = f4;
        this.f7546d = f5;
        this.f7547e = f6;
        this.f7548f = f7;
    }

    public final float a() {
        return this.f7547e;
    }

    public final float b() {
        return this.f7548f;
    }

    public final float c() {
        return this.f7545c;
    }

    public final float d() {
        return this.b;
    }

    public final float e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.f7545c, bVar.f7545c) == 0 && Float.compare(this.f7546d, bVar.f7546d) == 0 && Float.compare(this.f7547e, bVar.f7547e) == 0 && Float.compare(this.f7548f, bVar.f7548f) == 0;
    }

    public final float f() {
        return this.f7546d;
    }

    public int hashCode() {
        return Float.hashCode(this.f7548f) + e.a.a.a.a.x(this.f7547e, e.a.a.a.a.x(this.f7546d, e.a.a.a.a.x(this.f7545c, e.a.a.a.a.x(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ControlPoint(handleLarge=");
        M.append(this.a);
        M.append(", distanceOuter=");
        M.append(this.b);
        M.append(", distanceInner=");
        M.append(this.f7545c);
        M.append(", handleMedium=");
        M.append(this.f7546d);
        M.append(", curveInner=");
        M.append(this.f7547e);
        M.append(", curveOuter=");
        M.append(this.f7548f);
        M.append(")");
        return M.toString();
    }
}
