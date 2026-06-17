package com.bytedance.android.input.basic.image;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class g {
    private final DecodedImageType a;
    private final ImageFormatGuess b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2065c;

    public g(DecodedImageType decodedImageType, ImageFormatGuess imageFormatGuess, long j) {
        l.f(decodedImageType, "decodedType");
        l.f(imageFormatGuess, "sourceFormatGuess");
        this.a = decodedImageType;
        this.b = imageFormatGuess;
        this.f2065c = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.f2065c == gVar.f2065c;
    }

    public int hashCode() {
        return Long.hashCode(this.f2065c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ImageLoadInfo(decodedType=");
        M.append(this.a);
        M.append(", sourceFormatGuess=");
        M.append(this.b);
        M.append(", loadTimeMs=");
        return e.a.a.a.a.E(M, this.f2065c, ')');
    }
}
