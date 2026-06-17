package com.bytedance.compression.zstd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
class ZstdInputStreamNoFinalizer extends FilterInputStream {
    private static final int srcBuffSize;
    private final b bufferPool;
    private long dstPos;
    private boolean frameFinished;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead;
    private final byte[] src;
    private final ByteBuffer srcByteBuffer;
    private long srcPos;
    private long srcSize;
    private final long stream;

    static {
        com.bytedance.compression.zstd.f.a.a();
        srcBuffSize = (int) recommendedDInSize();
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream) throws IOException {
        this(inputStream, c.a);
    }

    private static native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native int freeDStream(long j);

    private native int initDStream(long j);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.needRead) {
            return 1;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        Objects.requireNonNull((c) this.bufferPool);
        freeDStream(this.stream);
        ((FilterInputStream) this).in.close();
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (i >= 0) {
            if (i2 <= bArr.length - i) {
                int i3 = 0;
                if (i2 == 0) {
                    return 0;
                }
                while (i3 == 0) {
                    i3 = readInternal(bArr, i, i2);
                }
                return i3;
            }
        }
        throw new IndexOutOfBoundsException("Requested length " + i2 + " from offset " + i + " in buffer of size " + bArr.length);
    }

    int readInternal(byte[] bArr, int i, int i2) throws IOException {
        long j;
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (i < 0 || i2 > bArr.length - i) {
            StringBuilder O = e.a.a.a.a.O("Requested length ", i2, " from offset ", i, " in buffer of size ");
            O.append(bArr.length);
            throw new IndexOutOfBoundsException(O.toString());
        }
        int i3 = i + i2;
        long j2 = i;
        this.dstPos = j2;
        long j3 = -1;
        while (true) {
            j = this.dstPos;
            long j4 = i3;
            if (j >= j4 || j3 >= j) {
                break;
            }
            if (this.needRead && (((FilterInputStream) this).in.available() > 0 || this.dstPos == j2)) {
                long read = ((FilterInputStream) this).in.read(this.src, 0, srcBuffSize);
                this.srcSize = read;
                this.srcPos = 0L;
                if (read < 0) {
                    this.srcSize = 0L;
                    if (this.frameFinished) {
                        return -1;
                    }
                    if (!this.isContinuous) {
                        throw new IOException("Read error or truncated source");
                    }
                    long j5 = (int) (this.dstPos - j2);
                    this.srcSize = j5;
                    if (j5 > 0) {
                        return (int) j5;
                    }
                    return -1;
                }
                this.frameFinished = false;
            }
            long j6 = this.dstPos;
            int decompressStream = decompressStream(this.stream, bArr, i3, this.src, (int) this.srcSize);
            long j7 = decompressStream;
            if (Zstd.isError(j7)) {
                StringBuilder M = e.a.a.a.a.M("Decompression error: ");
                M.append(Zstd.getErrorName(j7));
                throw new IOException(M.toString());
            }
            if (decompressStream == 0) {
                this.frameFinished = true;
                this.needRead = this.srcPos == this.srcSize;
                return (int) (this.dstPos - j2);
            }
            if (this.dstPos < j4) {
                r14 = true;
            }
            this.needRead = r14;
            j3 = j6;
        }
        return (int) (j - j2);
    }

    public synchronized ZstdInputStreamNoFinalizer setContinuous(boolean z) {
        this.isContinuous = z;
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        long loadDictDecompress = ZstdDecompress.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(loadDictDecompress)) {
            throw new IOException("Decompression error: " + Zstd.getErrorName(loadDictDecompress));
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (j <= 0) {
            return 0L;
        }
        int recommendedDOutSize = (int) recommendedDOutSize();
        if (recommendedDOutSize > j) {
            recommendedDOutSize = (int) j;
        }
        Objects.requireNonNull((c) this.bufferPool);
        try {
            byte[] extractArray = Zstd.extractArray(ByteBuffer.allocate(recommendedDOutSize));
            long j2 = j;
            while (j2 > 0) {
                int read = read(extractArray, 0, (int) Math.min(recommendedDOutSize, j2));
                if (read < 0) {
                    break;
                }
                j2 -= read;
            }
            return j - j2;
        } finally {
            Objects.requireNonNull((c) this.bufferPool);
        }
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream, b bVar) throws IOException {
        super(inputStream);
        this.dstPos = 0L;
        this.srcPos = 0L;
        this.srcSize = 0L;
        this.needRead = true;
        this.isContinuous = false;
        this.frameFinished = true;
        this.isClosed = false;
        this.bufferPool = bVar;
        int i = srcBuffSize;
        Objects.requireNonNull((c) bVar);
        ByteBuffer allocate = ByteBuffer.allocate(i);
        this.srcByteBuffer = allocate;
        if (allocate == null) {
            throw new IOException(e.a.a.a.a.k("Cannot get ByteBuffer of size ", i, " from the BufferPool"));
        }
        this.src = Zstd.extractArray(allocate);
        synchronized (this) {
            long createDStream = createDStream();
            this.stream = createDStream;
            initDStream(createDStream);
        }
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) throws IOException {
        zstdDictDecompress.acquireSharedLock();
        try {
            long loadFastDictDecompress = ZstdDecompress.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(loadFastDictDecompress)) {
                throw new IOException("Decompression error: " + Zstd.getErrorName(loadFastDictDecompress));
            }
        } finally {
            zstdDictDecompress.releaseSharedLock();
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = 0;
        while (i == 0) {
            i = readInternal(bArr, 0, 1);
        }
        if (i != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
