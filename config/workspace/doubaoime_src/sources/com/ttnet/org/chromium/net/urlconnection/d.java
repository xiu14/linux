package com.ttnet.org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class d extends InputStream {
    protected final CronetHttpURLConnection a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer f8774c;

    /* renamed from: d, reason: collision with root package name */
    protected IOException f8775d;

    public d(CronetHttpURLConnection cronetHttpURLConnection) {
        this.a = cronetHttpURLConnection;
    }

    private void a() throws IOException {
        if (this.b) {
            IOException iOException = this.f8775d;
            if (iOException != null) {
                throw iOException;
            }
        } else {
            if (d()) {
                return;
            }
            if (this.f8774c == null) {
                this.f8774c = ByteBuffer.allocateDirect(this.a.B() >= 8192 ? this.a.B() : 32768);
            }
            this.f8774c.clear();
            this.a.C(this.f8774c);
            IOException iOException2 = this.f8775d;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer = this.f8774c;
            if (byteBuffer != null) {
                byteBuffer.flip();
            }
        }
    }

    private boolean d() {
        ByteBuffer byteBuffer = this.f8774c;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!this.b) {
            if (d()) {
                return this.f8774c.remaining();
            }
            return 0;
        }
        IOException iOException = this.f8775d;
        if (iOException == null) {
            return 0;
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        CronetHttpURLConnection cronetHttpURLConnection = this.a;
        if (cronetHttpURLConnection != null) {
            cronetHttpURLConnection.disconnect();
        }
        super.close();
    }

    void h(IOException iOException) {
        this.f8775d = iOException;
        this.b = true;
        this.f8774c = null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        a();
        if (d()) {
            return this.f8774c.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        a();
        if (!d()) {
            return -1;
        }
        int min = Math.min(this.f8774c.limit() - this.f8774c.position(), i2);
        this.f8774c.get(bArr, i, min);
        return min;
    }
}
