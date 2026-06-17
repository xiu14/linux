package com.facebook.imagepipeline.nativecode;

import e.c.h.n.d;

@e.c.c.d.c
/* loaded from: classes2.dex */
public class NativeJpegTranscoderFactory implements d {
    private final int a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6518c;

    @e.c.c.d.c
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.f6518c = z2;
    }

    @Override // e.c.h.n.d
    @e.c.c.d.c
    public e.c.h.n.c createImageTranscoder(e.c.g.d dVar, boolean z) {
        if (dVar != e.c.g.c.a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.a, this.b, this.f6518c);
    }
}
