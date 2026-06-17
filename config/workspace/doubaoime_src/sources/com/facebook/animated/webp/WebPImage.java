package com.facebook.animated.webp;

import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.b;
import com.facebook.imagepipeline.animated.base.f;
import e.c.c.d.c;
import e.c.c.d.h;
import e.c.g.d;
import java.nio.ByteBuffer;

@c
/* loaded from: classes2.dex */
public class WebPImage extends f implements e.c.h.c.a.c {

    @c
    private long mNativeContext;

    @c
    public WebPImage() {
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

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
        return nativeGetLoopCount();
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public d d() {
        return e.c.g.c.j;
    }

    @Override // com.facebook.imagepipeline.animated.base.b
    public com.facebook.imagepipeline.animated.base.c e(int i) {
        return nativeGetFrame(i);
    }

    @Override // e.c.h.c.a.c
    public b f(long j, int i) {
        com.facebook.imagepipeline.nativecode.c.a();
        h.a(j != 0);
        return nativeCreateFromNativeMemory(j, i);
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
        WebPFrame nativeGetFrame = nativeGetFrame(i);
        try {
            return new AnimatedDrawableFrameInfo(i, nativeGetFrame.c(), nativeGetFrame.d(), nativeGetFrame.getWidth(), nativeGetFrame.getHeight(), nativeGetFrame.e() ? AnimatedDrawableFrameInfo.BlendOperation.BLEND_WITH_PREVIOUS : AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND, nativeGetFrame.f() ? AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND : AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT);
        } finally {
            nativeGetFrame.b();
        }
    }

    @Override // e.c.h.c.a.c
    public b j(ByteBuffer byteBuffer) {
        com.facebook.imagepipeline.nativecode.c.a();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
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
    WebPImage(long j) {
        this.mNativeContext = j;
    }
}
