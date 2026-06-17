package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class Mask {
    private final MaskMode a;
    private final com.airbnb.lottie.model.i.h b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.d f1294c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1295d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, com.airbnb.lottie.model.i.h hVar, com.airbnb.lottie.model.i.d dVar, boolean z) {
        this.a = maskMode;
        this.b = hVar;
        this.f1294c = dVar;
        this.f1295d = z;
    }

    public MaskMode a() {
        return this.a;
    }

    public com.airbnb.lottie.model.i.h b() {
        return this.b;
    }

    public com.airbnb.lottie.model.i.d c() {
        return this.f1294c;
    }

    public boolean d() {
        return this.f1295d;
    }
}
