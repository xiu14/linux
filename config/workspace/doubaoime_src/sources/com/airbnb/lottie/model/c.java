package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.content.j;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class c {
    private final List<j> a;
    private final char b;

    /* renamed from: c, reason: collision with root package name */
    private final double f1291c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1292d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1293e;

    public c(List<j> list, char c2, double d2, double d3, String str, String str2) {
        this.a = list;
        this.b = c2;
        this.f1291c = d3;
        this.f1292d = str;
        this.f1293e = str2;
    }

    public static int c(char c2, String str, String str2) {
        return str2.hashCode() + e.a.a.a.a.p0(str, (c2 + 0) * 31, 31);
    }

    public List<j> a() {
        return this.a;
    }

    public double b() {
        return this.f1291c;
    }

    public int hashCode() {
        return c(this.b, this.f1293e, this.f1292d);
    }
}
