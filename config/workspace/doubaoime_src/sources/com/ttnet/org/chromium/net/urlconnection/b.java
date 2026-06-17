package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.D;
import com.ttnet.org.chromium.net.E;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class b extends f {

    /* renamed from: d, reason: collision with root package name */
    private final CronetHttpURLConnection f8766d;

    /* renamed from: e, reason: collision with root package name */
    private final g f8767e;

    /* renamed from: f, reason: collision with root package name */
    private final ByteBuffer f8768f;

    /* renamed from: g, reason: collision with root package name */
    private final D f8769g = new C0403b(null);
    private boolean h;

    /* renamed from: com.ttnet.org.chromium.net.urlconnection.b$b, reason: collision with other inner class name */
    private class C0403b extends D {
        C0403b(a aVar) {
        }

        @Override // com.ttnet.org.chromium.net.D
        public long a() {
            return -1L;
        }

        @Override // com.ttnet.org.chromium.net.D
        public void d(E e2, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= b.this.f8768f.remaining()) {
                byteBuffer.put(b.this.f8768f);
                b.this.f8768f.clear();
                e2.a(b.this.h);
                if (b.this.h) {
                    return;
                }
                b.this.f8767e.d();
                return;
            }
            int limit = b.this.f8768f.limit();
            b.this.f8768f.limit(byteBuffer.remaining() + b.this.f8768f.position());
            byteBuffer.put(b.this.f8768f);
            b.this.f8768f.limit(limit);
            e2.a(false);
        }

        @Override // com.ttnet.org.chromium.net.D
        public void h(E e2) {
            e2.b(new HttpRetryException("Cannot retry streamed Http body", -1));
        }
    }

    b(CronetHttpURLConnection cronetHttpURLConnection, int i, g gVar) {
        if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.f8768f = ByteBuffer.allocate(i);
        this.f8766d = cronetHttpURLConnection;
        this.f8767e = gVar;
    }

    private void x() throws IOException {
        if (this.f8768f.hasRemaining()) {
            return;
        }
        d();
        this.f8768f.flip();
        int readTimeout = this.f8766d.getReadTimeout();
        try {
            this.f8767e.b(readTimeout);
        } catch (SocketTimeoutException unused) {
            CronetHttpURLConnection cronetHttpURLConnection = this.f8766d;
            if (cronetHttpURLConnection != null) {
                cronetHttpURLConnection.G();
                this.f8767e.e();
                this.f8767e.b(readTimeout / 2);
            }
        } catch (Exception e2) {
            CronetHttpURLConnection cronetHttpURLConnection2 = this.f8766d;
            if (cronetHttpURLConnection2 != null) {
                cronetHttpURLConnection2.u("Unexpected request usage, caught in CronetChunkedOutputStream", e2);
                this.f8767e.e();
                this.f8767e.b(readTimeout / 2);
            }
        }
        a();
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.h) {
            return;
        }
        this.h = true;
        this.f8768f.flip();
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    void h() throws IOException {
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    D l() {
        return this.f8769g;
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    void o() throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        x();
        this.f8768f.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.f8768f.remaining());
            this.f8768f.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            x();
        }
    }
}
