package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
class O extends C0725e {
    final /* synthetic */ AtomicBoolean a;

    O(P p, AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // com.facebook.imagepipeline.producers.W
    public void a() {
        this.a.set(true);
    }
}
