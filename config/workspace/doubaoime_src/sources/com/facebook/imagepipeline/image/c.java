package com.facebook.imagepipeline.image;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class c extends d {

    /* renamed from: d, reason: collision with root package name */
    private Drawable f6469d;

    public c(Drawable drawable) {
        this.f6469d = drawable;
    }

    @Override // com.facebook.imagepipeline.image.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6469d = null;
    }

    @Override // com.facebook.imagepipeline.image.h
    public int d() {
        return 1;
    }

    @Override // com.facebook.imagepipeline.image.h
    public int getHeight() {
        Drawable drawable = this.f6469d;
        if (drawable == null) {
            return 0;
        }
        return Math.max(0, drawable.getIntrinsicHeight());
    }

    @Override // com.facebook.imagepipeline.image.h
    public int getWidth() {
        Drawable drawable = this.f6469d;
        if (drawable == null) {
            return 0;
        }
        return Math.max(0, drawable.getIntrinsicWidth());
    }

    @Override // com.facebook.imagepipeline.image.d
    public boolean isClosed() {
        return this.f6469d == null;
    }

    @Override // com.facebook.imagepipeline.image.d
    public int o() {
        return 0;
    }

    public Drawable s() {
        return this.f6469d;
    }
}
