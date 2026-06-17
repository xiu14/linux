package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;

@e.c.c.d.c
@TargetApi(27)
/* loaded from: classes2.dex */
public class AshmemMemoryChunkPool extends u {
    @e.c.c.d.c
    public AshmemMemoryChunkPool(com.facebook.common.memory.c cVar, B b, C c2) {
        super(cVar, b, c2);
    }

    @Override // com.facebook.imagepipeline.memory.u, com.facebook.imagepipeline.memory.AbstractC0719b
    public t b(int i) {
        return new C0718a(i);
    }

    @Override // com.facebook.imagepipeline.memory.u
    /* renamed from: q */
    public t b(int i) {
        return new C0718a(i);
    }
}
