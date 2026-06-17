package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.impl.C0772l;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class t implements y {
    final /* synthetic */ com.ttnet.org.chromium.net.G a;
    final /* synthetic */ ByteBuffer b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0772l.f f8753c;

    t(C0772l.f fVar, com.ttnet.org.chromium.net.G g2, ByteBuffer byteBuffer) {
        this.f8753c = fVar;
        this.a = g2;
        this.b = byteBuffer;
    }

    @Override // com.ttnet.org.chromium.net.impl.y
    public void run() throws Exception {
        AtomicInteger atomicInteger;
        atomicInteger = this.f8753c.f8751d.f8748f;
        if (atomicInteger.compareAndSet(5, 4)) {
            C0772l.f fVar = this.f8753c;
            fVar.a.c(fVar.f8751d, this.a, this.b);
        }
    }
}
