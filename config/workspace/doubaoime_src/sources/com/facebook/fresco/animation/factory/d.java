package com.facebook.fresco.animation.factory;

import android.graphics.Rect;

/* loaded from: classes2.dex */
class d implements com.facebook.imagepipeline.animated.impl.b {
    final /* synthetic */ AnimatedFactoryV2Impl a;

    d(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.a = animatedFactoryV2Impl;
    }

    @Override // com.facebook.imagepipeline.animated.impl.b
    public com.facebook.imagepipeline.animated.base.a a(com.facebook.imagepipeline.animated.base.d dVar, Rect rect) {
        return new com.facebook.imagepipeline.animated.impl.a(AnimatedFactoryV2Impl.f(this.a), dVar, rect);
    }
}
