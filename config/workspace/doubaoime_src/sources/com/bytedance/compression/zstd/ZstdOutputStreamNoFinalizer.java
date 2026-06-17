package com.bytedance.compression.zstd;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
class ZstdOutputStreamNoFinalizer extends FilterOutputStream {
    private static final int dstSize;
    private final b bufferPool;
    private boolean closeFrameOnFlush;
    private final byte[] dst;
    private final ByteBuffer dstByteBuffer;
    private long dstPos;
    private boolean frameClosed;
    private boolean isClosed;
    private long srcPos;
    private final long stream;

    static {
        com.bytedance.compression.zstd.f.a.a();
        dstSize = (int) recommendedCOutSize();
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, int i) throws IOException {
        this(outputStream, c.a);
        ZstdCompress.setCompressionLevel(this.stream, i);
    }

    private native int compressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native long createCStream();

    private native int endStream(long j, byte[] bArr, int i);

    private native int flushStream(long j, byte[] bArr, int i);

    private static native int freeCStream(long j);

    public static native long recommendedCOutSize();

    private native int resetCStream(long j);

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        close(true);
    }

    public synchronized void closeWithoutClosingParentStream() throws IOException {
        close(false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        int flushStream;
        int endStream;
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.frameClosed) {
            if (this.closeFrameOnFlush) {
                do {
                    endStream = endStream(this.stream, this.dst, dstSize);
                    long j = endStream;
                    if (Zstd.isError(j)) {
                        throw new IOException("Compression error: " + Zstd.getErrorName(j));
                    }
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                } while (endStream > 0);
                this.frameClosed = true;
            } else {
                do {
                    flushStream = flushStream(this.stream, this.dst, dstSize);
                    long j2 = flushStream;
                    if (Zstd.isError(j2)) {
                        throw new IOException("Compression error: " + Zstd.getErrorName(j2));
                    }
                    ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                } while (flushStream > 0);
            }
            ((FilterOutputStream) this).out.flush();
        }
    }

    public synchronized ZstdOutputStreamNoFinalizer setChecksum(boolean z) throws IOException {
        if (!this.frameClosed) {
            throw new IOException("Change of parameter on initialized stream");
        }
        long compressionChecksums = ZstdCompress.setCompressionChecksums(this.stream, z);
        if (Zstd.isError(compressionChecksums)) {
            throw new IOException("Compression param: " + Zstd.getErrorName(compressionChecksums));
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setCloseFrameOnFlush(boolean z) throws IOException {
        if (!this.frameClosed) {
            throw new IOException("Change of parameter on initialized stream");
        }
        this.closeFrameOnFlush = z;
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        if (!this.frameClosed) {
            throw new IOException("Change of parameter on initialized stream");
        }
        long loadDictCompress = ZstdCompress.loadDictCompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(loadDictCompress)) {
            throw new IOException("Compression param: " + Zstd.getErrorName(loadDictCompress));
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLevel(int i) throws IOException {
        if (!this.frameClosed) {
            throw new IOException("Change of parameter on initialized stream");
        }
        long compressionLevel = ZstdCompress.setCompressionLevel(this.stream, i);
        if (Zstd.isError(compressionLevel)) {
            throw new IOException("Compression param: " + Zstd.getErrorName(compressionLevel));
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLong(int i) throws IOException {
        if (!this.frameClosed) {
            throw new IOException("Change of parameter on initialized stream");
        }
        long compressionLong = ZstdCompress.setCompressionLong(this.stream, i);
        if (Zstd.isError(compressionLong)) {
            throw new IOException("Compression param: " + Zstd.getErrorName(compressionLong));
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWorkers(int i) throws IOException {
        if (!this.frameClosed) {
            throw new IOException("Change of parameter on initialized stream");
        }
        long compressionWorkers = ZstdCompress.setCompressionWorkers(this.stream, i);
        if (Zstd.isError(compressionWorkers)) {
            throw new IOException("Compression param: " + Zstd.getErrorName(compressionWorkers));
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (this.frameClosed) {
            long resetCStream = resetCStream(this.stream);
            if (Zstd.isError(resetCStream)) {
                throw new IOException("Compression error: cannot create header: " + Zstd.getErrorName(resetCStream));
            }
            this.frameClosed = false;
        }
        int i3 = i2 + i;
        this.srcPos = i;
        while (this.srcPos < i3) {
            long compressStream = compressStream(this.stream, this.dst, dstSize, bArr, i3);
            if (Zstd.isError(compressStream)) {
                throw new IOException("Compression error: " + Zstd.getErrorName(compressStream));
            }
            long j = this.dstPos;
            if (j > 0) {
                ((FilterOutputStream) this).out.write(this.dst, 0, (int) j);
            }
        }
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream) throws IOException {
        this(outputStream, c.a);
    }

    private void close(boolean z) throws IOException {
        int endStream;
        if (this.isClosed) {
            return;
        }
        try {
            if (!this.frameClosed) {
                do {
                    endStream = endStream(this.stream, this.dst, dstSize);
                    long j = endStream;
                    if (!Zstd.isError(j)) {
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } else {
                        throw new IOException("Compression error: " + Zstd.getErrorName(j));
                    }
                } while (endStream > 0);
            }
            if (z) {
                ((FilterOutputStream) this).out.close();
            }
        } finally {
            this.isClosed = true;
            Objects.requireNonNull((c) this.bufferPool);
            freeCStream(this.stream);
        }
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, b bVar, int i) throws IOException {
        this(outputStream, bVar);
        ZstdCompress.setCompressionLevel(this.stream, i);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, b bVar) throws IOException {
        super(outputStream);
        this.srcPos = 0L;
        this.dstPos = 0L;
        this.isClosed = false;
        this.closeFrameOnFlush = false;
        this.frameClosed = true;
        this.stream = createCStream();
        this.bufferPool = bVar;
        int i = dstSize;
        Objects.requireNonNull((c) bVar);
        ByteBuffer allocate = ByteBuffer.allocate(i);
        this.dstByteBuffer = allocate;
        if (allocate != null) {
            this.dst = Zstd.extractArray(allocate);
            return;
        }
        throw new IOException(e.a.a.a.a.k("Cannot get ByteBuffer of size ", i, " from the BufferPool"));
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) throws IOException {
        if (this.frameClosed) {
            long loadFastDictCompress = ZstdCompress.loadFastDictCompress(this.stream, zstdDictCompress);
            if (Zstd.isError(loadFastDictCompress)) {
                throw new IOException("Compression param: " + Zstd.getErrorName(loadFastDictCompress));
            }
        } else {
            throw new IOException("Change of parameter on initialized stream");
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
