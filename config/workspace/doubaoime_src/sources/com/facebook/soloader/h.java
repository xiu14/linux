package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class h implements f {
    private InputStream a;
    private final ZipEntry b;

    /* renamed from: c, reason: collision with root package name */
    private final ZipFile f6708c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6709d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6710e = true;

    /* renamed from: f, reason: collision with root package name */
    private long f6711f = 0;

    public h(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f6708c = zipFile;
        this.b = zipEntry;
        this.f6709d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.f
    public int F(ByteBuffer byteBuffer, long j) throws IOException {
        if (this.a == null) {
            throw new IOException("InputStream is null");
        }
        int remaining = byteBuffer.remaining();
        long j2 = this.f6709d;
        long j3 = j2 - j;
        if (j3 <= 0) {
            return -1;
        }
        int i = (int) j3;
        if (remaining > i) {
            remaining = i;
        }
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new IOException(this.b.getName() + "'s InputStream is null");
        }
        long j4 = this.f6711f;
        if (j != j4) {
            if (j > j2) {
                j = j2;
            }
            if (j >= j4) {
                inputStream.skip(j - j4);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f6708c.getInputStream(this.b);
                this.a = inputStream2;
                if (inputStream2 == null) {
                    throw new IOException(this.b.getName() + "'s InputStream is null");
                }
                inputStream2.skip(j);
            }
            this.f6711f = j;
        }
        if (byteBuffer.hasArray()) {
            this.a.read(byteBuffer.array(), 0, remaining);
            byteBuffer.position(byteBuffer.position() + remaining);
        } else {
            byte[] bArr = new byte[remaining];
            this.a.read(bArr, 0, remaining);
            byteBuffer.put(bArr, 0, remaining);
        }
        this.f6711f += remaining;
        return remaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.close();
            this.f6710e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f6710e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return F(byteBuffer, this.f6711f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
