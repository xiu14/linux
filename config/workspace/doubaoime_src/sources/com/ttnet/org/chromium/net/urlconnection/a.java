package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.D;
import com.ttnet.org.chromium.net.E;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: d, reason: collision with root package name */
    private final int f8762d;

    /* renamed from: e, reason: collision with root package name */
    private final D f8763e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f8764f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8765g;

    private class b extends D {
        b(C0402a c0402a) {
        }

        @Override // com.ttnet.org.chromium.net.D
        public long a() {
            if (a.this.f8762d == -1) {
                return a.this.f8765g ? a.this.f8764f.limit() : a.this.f8764f.position();
            }
            return a.this.f8762d;
        }

        @Override // com.ttnet.org.chromium.net.D
        public void d(E e2, ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < a.this.f8764f.remaining()) {
                byteBuffer.put(a.this.f8764f.array(), a.this.f8764f.position(), remaining);
                a.this.f8764f.position(a.this.f8764f.position() + remaining);
            } else {
                byteBuffer.put(a.this.f8764f);
            }
            e2.a(false);
        }

        @Override // com.ttnet.org.chromium.net.D
        public void h(E e2) {
            a.this.f8764f.position(0);
            e2.c();
        }
    }

    a(CronetHttpURLConnection cronetHttpURLConnection, long j) {
        this.f8763e = new b(null);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Content length < 0.");
        }
        int i = (int) j;
        this.f8762d = i;
        this.f8764f = ByteBuffer.allocate(i);
    }

    private void x(int i) throws IOException {
        if (this.f8762d != -1 && this.f8764f.position() + i > this.f8762d) {
            throw new ProtocolException(e.a.a.a.a.D(e.a.a.a.a.M("exceeded content-length limit of "), this.f8762d, " bytes"));
        }
        if (this.f8765g) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        }
        if (this.f8762d == -1 && this.f8764f.limit() - this.f8764f.position() <= i) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.f8764f.capacity() * 2, this.f8764f.capacity() + i));
            this.f8764f.flip();
            allocate.put(this.f8764f);
            this.f8764f = allocate;
        }
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    void h() throws IOException {
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    D l() {
        return this.f8763e;
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    void o() throws IOException {
        this.f8765g = true;
        if (this.f8764f.position() < this.f8762d) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        this.f8764f.flip();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        d();
        x(1);
        this.f8764f.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        d();
        x(i2);
        this.f8764f.put(bArr, i, i2);
    }

    a(CronetHttpURLConnection cronetHttpURLConnection) {
        this.f8763e = new b(null);
        this.f8762d = -1;
        this.f8764f = ByteBuffer.allocate(16384);
    }
}
