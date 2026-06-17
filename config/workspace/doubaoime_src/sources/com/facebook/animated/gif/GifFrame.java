package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.c;

/* loaded from: classes2.dex */
public class GifFrame implements c {

    @e.c.c.d.c
    private long mNativeContext;

    @e.c.c.d.c
    GifFrame(long j) {
        this.mNativeContext = j;
    }

    @e.c.c.d.c
    private native void nativeDispose();

    @e.c.c.d.c
    private native void nativeFinalize();

    @e.c.c.d.c
    private native int nativeGetDisposalMode();

    @e.c.c.d.c
    private native int nativeGetDurationMs();

    @e.c.c.d.c
    private native int nativeGetHeight();

    @e.c.c.d.c
    private native int nativeGetTransparentPixelColor();

    @e.c.c.d.c
    private native int nativeGetWidth();

    @e.c.c.d.c
    private native int nativeGetXOffset();

    @e.c.c.d.c
    private native int nativeGetYOffset();

    @e.c.c.d.c
    private native boolean nativeHasTransparency();

    @e.c.c.d.c
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    @Override // com.facebook.imagepipeline.animated.base.c
    public void a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    @Override // com.facebook.imagepipeline.animated.base.c
    public void b() {
        nativeDispose();
    }

    @Override // com.facebook.imagepipeline.animated.base.c
    public int c() {
        return nativeGetXOffset();
    }

    @Override // com.facebook.imagepipeline.animated.base.c
    public int d() {
        return nativeGetYOffset();
    }

    public int e() {
        return nativeGetDisposalMode();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // com.facebook.imagepipeline.animated.base.c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // com.facebook.imagepipeline.animated.base.c
    public int getWidth() {
        return nativeGetWidth();
    }
}
