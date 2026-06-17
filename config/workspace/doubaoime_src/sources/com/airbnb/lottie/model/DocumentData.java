package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class DocumentData {
    public final String a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1284c;

    /* renamed from: d, reason: collision with root package name */
    public final Justification f1285d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1286e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1287f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1288g;

    @ColorInt
    public final int h;

    @ColorInt
    public final int i;
    public final float j;
    public final boolean k;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f2, Justification justification, int i, float f3, float f4, @ColorInt int i2, @ColorInt int i3, float f5, boolean z) {
        this.a = str;
        this.b = str2;
        this.f1284c = f2;
        this.f1285d = justification;
        this.f1286e = i;
        this.f1287f = f3;
        this.f1288g = f4;
        this.h = i2;
        this.i = i3;
        this.j = f5;
        this.k = z;
    }

    public int hashCode() {
        int ordinal = ((this.f1285d.ordinal() + (((int) (e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31) + this.f1284c)) * 31)) * 31) + this.f1286e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f1287f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
