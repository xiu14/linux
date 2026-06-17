package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0717e {
    private int a = -1;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private ColorFilter f6363c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f6364d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f6365e = -1;

    @SuppressLint({"Range"})
    public void a(Drawable drawable) {
        int i = this.a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.b) {
            drawable.setColorFilter(this.f6363c);
        }
        int i2 = this.f6364d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.f6365e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }

    public void b(int i) {
        this.a = i;
    }

    public void c(ColorFilter colorFilter) {
        this.f6363c = colorFilter;
        this.b = true;
    }

    public void d(boolean z) {
        this.f6364d = z ? 1 : 0;
    }

    public void e(boolean z) {
        this.f6365e = z ? 1 : 0;
    }
}
