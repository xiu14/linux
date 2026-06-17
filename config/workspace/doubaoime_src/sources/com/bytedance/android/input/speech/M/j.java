package com.bytedance.android.input.speech.M;

import java.io.InputStream;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class j implements com.ss.ugc.effectplatform.bridge.network.a {
    private final InputStream a;

    public j(InputStream inputStream) {
        l.f(inputStream, "inputStream");
        this.a = inputStream;
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.a
    public boolean available() {
        return this.a.available() >= 0;
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.a
    public void close() {
        this.a.close();
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.a
    public int read(byte[] bArr, int i, int i2) {
        l.f(bArr, com.heytap.mcssdk.liquid.b.a);
        return this.a.read(bArr, i, i2);
    }
}
