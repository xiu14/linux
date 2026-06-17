package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class j {
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1281c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1282d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private Bitmap f1283e;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public j(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.f1281c = str;
        this.f1282d = str2;
    }

    @Nullable
    public Bitmap a() {
        return this.f1283e;
    }

    public String b() {
        return this.f1282d;
    }

    public int c() {
        return this.b;
    }

    public String d() {
        return this.f1281c;
    }

    public int e() {
        return this.a;
    }

    public void f(@Nullable Bitmap bitmap) {
        this.f1283e = bitmap;
    }
}
