package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.D;
import com.ttnet.org.chromium.net.E;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    private final CronetHttpURLConnection f8770d;

    /* renamed from: e, reason: collision with root package name */
    private final g f8771e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8772f;

    /* renamed from: g, reason: collision with root package name */
    private final ByteBuffer f8773g;
    private final D h = new b(null);
    private long i;
    private boolean j;
    private boolean k;

    private class b extends D {
        b(a aVar) {
        }

        @Override // com.ttnet.org.chromium.net.D
        public long a() {
            return c.this.f8772f;
        }

        @Override // com.ttnet.org.chromium.net.D
        public void d(E e2, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= c.this.f8773g.remaining()) {
                byteBuffer.put(c.this.f8773g);
                c.this.f8773g.clear();
                e2.a(false);
                if (c.this.k) {
                    return;
                }
                c.this.f8771e.d();
                return;
            }
            int limit = c.this.f8773g.limit();
            c.this.f8773g.limit(byteBuffer.remaining() + c.this.f8773g.position());
            byteBuffer.put(c.this.f8773g);
            c.this.f8773g.limit(limit);
            e2.a(false);
        }

        @Override // com.ttnet.org.chromium.net.D
        public void h(E e2) {
            if (!c.this.j) {
                e2.b(new HttpRetryException("Cannot retry streamed Http body", -1));
                return;
            }
            c.this.k = true;
            c.this.f8773g.rewind();
            e2.c();
        }
    }

    c(CronetHttpURLConnection cronetHttpURLConnection, long j, int i, g gVar) {
        if (j < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.f8772f = j;
        this.f8773g = ByteBuffer.allocate((int) Math.min(j, Math.max(16384, i)));
        this.f8770d = cronetHttpURLConnection;
        this.f8771e = gVar;
        this.i = 0L;
        this.j = true;
        this.k = false;
    }

    private void D(int i) throws ProtocolException {
        if (this.i + i <= this.f8772f) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("expected ");
        M.append(this.f8772f - this.i);
        M.append(" bytes but received ");
        M.append(i);
        throw new ProtocolException(M.toString());
    }

    private void G() throws IOException {
        d();
        this.f8773g.flip();
        int readTimeout = this.f8770d.getReadTimeout();
        try {
            this.f8771e.b(readTimeout);
        } catch (SocketTimeoutException unused) {
            CronetHttpURLConnection cronetHttpURLConnection = this.f8770d;
            if (cronetHttpURLConnection != null) {
                cronetHttpURLConnection.G();
                this.f8771e.e();
                this.f8771e.b(readTimeout / 2);
            }
        } catch (Exception e2) {
            CronetHttpURLConnection cronetHttpURLConnection2 = this.f8770d;
            if (cronetHttpURLConnection2 != null) {
                cronetHttpURLConnection2.u("Unexpected request usage, caught in CronetFixedModeOutputStream", e2);
                this.f8771e.e();
                this.f8771e.b(readTimeout / 2);
            }
        }
        a();
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    void h() throws IOException {
        if (this.i < this.f8772f) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    D l() {
        return this.h;
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.f
    void o() throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        d();
        D(1);
        if (!this.f8773g.hasRemaining()) {
            this.j = false;
            G();
        }
        this.f8773g.put((byte) i);
        long j = this.i + 1;
        this.i = j;
        if (j == this.f8772f) {
            G();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        d();
        if (bArr.length - i >= i2 && i >= 0 && i2 >= 0) {
            D(i2);
            int i3 = i2;
            while (i3 > 0) {
                if (!this.f8773g.hasRemaining()) {
                    this.j = false;
                    G();
                }
                int min = Math.min(i3, this.f8773g.remaining());
                this.f8773g.put(bArr, (i + i2) - i3, min);
                i3 -= min;
            }
            long j = this.i + i2;
            this.i = j;
            if (j == this.f8772f) {
                G();
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
