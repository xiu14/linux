package com.facebook.imagepipeline.memory;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class BufferMemoryChunkPool extends u {
    @e.c.c.d.c
    public BufferMemoryChunkPool(com.facebook.common.memory.c cVar, B b, C c2) {
        super(cVar, b, c2);
    }

    @Override // com.facebook.imagepipeline.memory.u, com.facebook.imagepipeline.memory.AbstractC0719b
    protected t b(int i) {
        return new j(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.u
    /* renamed from: q */
    public t b(int i) {
        return new j(i);
    }
}
