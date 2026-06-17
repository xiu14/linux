package com.ss.ugc.effectplatform.download;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b extends bytekn.foundation.io.file.b {
    private final com.ss.ugc.effectplatform.bridge.network.a b;

    public b(com.ss.ugc.effectplatform.bridge.network.a aVar) {
        l.g(aVar, "byteReadStream");
        this.b = aVar;
    }

    @Override // bytekn.foundation.io.file.b
    public int a(byte[] bArr, int i, int i2) {
        l.g(bArr, com.heytap.mcssdk.liquid.b.a);
        return this.b.read(bArr, i, i2);
    }

    @Override // bytekn.foundation.io.file.b, bytekn.foundation.io.file.h
    public void close() {
        this.b.close();
    }
}
