package com.facebook.imagepipeline.animated.base;

/* loaded from: classes2.dex */
public class AnimatedDrawableFrameInfo {
    public final int a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6437c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6438d;

    /* renamed from: e, reason: collision with root package name */
    public final BlendOperation f6439e;

    /* renamed from: f, reason: collision with root package name */
    public final DisposalMethod f6440f;

    public enum BlendOperation {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    public enum DisposalMethod {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public AnimatedDrawableFrameInfo(int i, int i2, int i3, int i4, int i5, BlendOperation blendOperation, DisposalMethod disposalMethod) {
        this.a = i2;
        this.b = i3;
        this.f6437c = i4;
        this.f6438d = i5;
        this.f6439e = blendOperation;
        this.f6440f = disposalMethod;
    }
}
