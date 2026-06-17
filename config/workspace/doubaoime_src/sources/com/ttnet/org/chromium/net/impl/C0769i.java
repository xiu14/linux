package com.ttnet.org.chromium.net.impl;

import androidx.annotation.NonNull;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ttnet.org.chromium.net.impl.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0769i implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private C0769i(@NonNull InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(@NonNull InputStream inputStream) {
        return inputStream instanceof FileInputStream ? ((FileInputStream) inputStream).getChannel() : new C0769i(inputStream);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasArray()) {
            byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), 4096), byteBuffer.remaining()))];
            int read = this.a.read(bArr);
            if (read > 0) {
                byteBuffer.put(bArr, 0, read);
            }
            return read;
        }
        int read2 = this.a.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        if (read2 <= 0) {
            return read2;
        }
        byteBuffer.position(byteBuffer.position() + read2);
        return read2;
    }
}
