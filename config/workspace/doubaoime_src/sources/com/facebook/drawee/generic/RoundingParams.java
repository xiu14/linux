package com.facebook.drawee.generic;

import androidx.annotation.ColorInt;
import e.c.c.d.h;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class RoundingParams {
    private RoundingMethod a = RoundingMethod.BITMAP_ONLY;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private float[] f6393c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f6394d = 0;

    /* renamed from: e, reason: collision with root package name */
    private float f6395e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private int f6396f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f6397g = 0.0f;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public int a() {
        return this.f6396f;
    }

    public float b() {
        return this.f6395e;
    }

    public float[] c() {
        return this.f6393c;
    }

    public int d() {
        return this.f6394d;
    }

    public float e() {
        return this.f6397g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RoundingParams.class != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.b == roundingParams.b && this.f6394d == roundingParams.f6394d && Float.compare(roundingParams.f6395e, this.f6395e) == 0 && this.f6396f == roundingParams.f6396f && Float.compare(roundingParams.f6397g, this.f6397g) == 0 && this.a == roundingParams.a) {
            return Arrays.equals(this.f6393c, roundingParams.f6393c);
        }
        return false;
    }

    public boolean f() {
        return this.b;
    }

    public RoundingMethod g() {
        return this.a;
    }

    public RoundingParams h(@ColorInt int i) {
        this.f6396f = i;
        return this;
    }

    public int hashCode() {
        RoundingMethod roundingMethod = this.a;
        int hashCode = (((roundingMethod != null ? roundingMethod.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.f6393c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f6394d) * 31;
        float f2 = this.f6395e;
        int floatToIntBits = (((hashCode2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f6396f) * 31;
        float f3 = this.f6397g;
        return ((((floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31) + 0) * 31) + 0;
    }

    public RoundingParams i(float f2) {
        h.b(f2 >= 0.0f, "the border width cannot be < 0");
        this.f6395e = f2;
        return this;
    }

    public RoundingParams j(float f2, float f3, float f4, float f5) {
        if (this.f6393c == null) {
            this.f6393c = new float[8];
        }
        float[] fArr = this.f6393c;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f5;
        fArr[6] = f5;
        return this;
    }

    public RoundingParams k(float f2) {
        if (this.f6393c == null) {
            this.f6393c = new float[8];
        }
        Arrays.fill(this.f6393c, f2);
        return this;
    }

    public RoundingParams l(@ColorInt int i) {
        this.f6394d = i;
        this.a = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    public RoundingParams m(float f2) {
        h.b(f2 >= 0.0f, "the padding cannot be < 0");
        this.f6397g = f2;
        return this;
    }

    public RoundingParams n(boolean z) {
        this.b = z;
        return this;
    }

    public RoundingParams o(RoundingMethod roundingMethod) {
        this.a = roundingMethod;
        return this;
    }
}
