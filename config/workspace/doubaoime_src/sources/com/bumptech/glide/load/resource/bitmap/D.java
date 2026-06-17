package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import com.bumptech.glide.load.resource.bitmap.C;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class D extends MediaDataSource {
    final /* synthetic */ ByteBuffer a;

    D(C.d dVar, ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.a.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.a.limit()) {
            return -1;
        }
        this.a.position((int) j);
        int min = Math.min(i2, this.a.remaining());
        this.a.get(bArr, i, min);
        return min;
    }
}
