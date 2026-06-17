package com.bytedance.apm;

import com.bytedance.compression.zstd.ZstdCompress;
import com.bytedance.compression.zstd.ZstdDictCompress;
import java.util.Arrays;

/* loaded from: classes.dex */
public class o implements com.bytedance.services.apm.api.i {
    private byte[] a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private ZstdDictCompress f3465c;

    @Override // com.bytedance.services.apm.api.i
    public byte[] a(byte[] bArr, byte[] bArr2, int i) {
        if (this.f3465c == null || !Arrays.equals(bArr2, this.a) || i != this.b) {
            this.f3465c = new ZstdDictCompress(bArr2, i);
            this.a = bArr2;
            this.b = i;
        }
        return ZstdCompress.compress(bArr, this.f3465c);
    }

    @Override // com.bytedance.services.apm.api.i
    public byte[] b(byte[] bArr, int i) {
        return ZstdCompress.compress(bArr, i);
    }
}
