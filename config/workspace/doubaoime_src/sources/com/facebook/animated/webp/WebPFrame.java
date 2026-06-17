package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.c;

/* loaded from: classes2.dex */
public class WebPFrame implements c {

    @e.c.c.d.c
    private long mNativeContext;

    @e.c.c.d.c
    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

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

    public boolean e() {
        return nativeIsBlendWithPreviousFrame();
    }

    public boolean f() {
        return nativeShouldDisposeToBackgroundColor();
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
