package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.producers.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0737q extends C0725e {
    final /* synthetic */ AtomicBoolean a;

    C0737q(r rVar, AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // com.facebook.imagepipeline.producers.W
    public void a() {
        this.a.set(true);
    }
}
