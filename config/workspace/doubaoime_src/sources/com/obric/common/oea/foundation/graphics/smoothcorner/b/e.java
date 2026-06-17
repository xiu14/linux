package com.obric.common.oea.foundation.graphics.smoothcorner.b;

/* loaded from: classes2.dex */
public final class e {
    private final float a;
    private final float b;

    public e(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.a, eVar.a) == 0 && Float.compare(this.b, eVar.b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Point(x=");
        M.append(this.a);
        M.append(", y=");
        M.append(this.b);
        M.append(")");
        return M.toString();
    }
}
