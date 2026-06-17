package com.facebook.animated.gif;

import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.b;
import com.facebook.imagepipeline.animated.base.f;
import e.c.c.d.c;
import e.c.c.d.h;
import e.c.g.d;
import java.nio.ByteBuffer;

@c
/* loaded from: classes2.dex */
public class GifImage extends f implements e.c.h.c.a.c {
    private static volatile boolean b;

    @c
    private long mNativeContext;

    @c
    public GifImage() {
    }

    private static synchronized void n() {
        synchronized (GifImage.class) {
            if (!b) {
                b = true;
                System.loadLibrary("gifimage");
            }
        }
    }

    @c
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @c
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @c
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @c
    private native void nativeDispose();

    @c
    private native void nativeFinalize();

    @c
    private native int nativeGetDuration();

    @c
    private native GifFrame nativeGetFrame(int i);

    @c
    private native int nativeGetFrameCount();

    @c
    private native int[] nativeGetFrameDurations();

    @c
    private native int nativeGetHeight();

    @c
    private native int nativeGetLoopCount();

    @c
    private native int nativeGetSizeInBytes();

    @c
    private native int nativeGetWidth();

    @c
    private native boolean nativeIsAnimated();

    @Override // com.facebook.imagepipeline.animated.base.b
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public void b() {
        nativeDispose();
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public int c() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public d d() {
        return e.c.g.c.f9839c;
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public com.facebook.imagepipeline.animated.base.c e(int i) {
        return nativeGetFrame(i);
    }

    @Override // e.c.h.c.a.c
    public b f(long j, int i) {
        n();
        h.a(j != 0);
        return nativeCreateFromNativeMemory(j, i, Integer.MAX_VALUE, false);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public boolean g() {
        return false;
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public AnimatedDrawableFrameInfo h(int i) {
        GifFrame nativeGetFrame = nativeGetFrame(i);
        try {
            int c2 = nativeGetFrame.c();
            int d2 = nativeGetFrame.d();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            AnimatedDrawableFrameInfo.BlendOperation blendOperation = AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS;
            int e2 = nativeGetFrame.e();
            return new AnimatedDrawableFrameInfo(i, c2, d2, width, height, blendOperation, e2 == 0 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT : e2 == 1 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT : e2 == 2 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND : e2 == 3 ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS : AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT);
        } finally {
            nativeGetFrame.b();
        }
    }

    @Override // e.c.h.c.a.c
    public b j(ByteBuffer byteBuffer) {
        n();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, false);
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public int[] k() {
        return nativeGetFrameDurations();
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public int l() {
        return nativeGetSizeInBytes();
    }

    @c
    GifImage(long j) {
        this.mNativeContext = j;
    }
}
