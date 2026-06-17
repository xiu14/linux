package com.bytedance.frameworks.baselib.network.http;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class e extends InputStream {
    private InputStream a;
    private com.bytedance.retrofit2.client.d b;

    public e(InputStream inputStream, com.bytedance.retrofit2.client.d dVar) {
        this.a = inputStream;
        this.b = dVar;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.a;
        return inputStream != null ? inputStream.available() : super.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            InputStream inputStream = this.a;
            if (inputStream != null) {
                inputStream.close();
            }
            com.bytedance.retrofit2.client.d dVar = this.b;
            if (dVar != null) {
                dVar.cancel();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.mark(i);
        } else {
            super.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.a;
        return inputStream != null ? inputStream.markSupported() : super.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            InputStream inputStream = this.a;
            int read = inputStream != null ? inputStream.read(bArr) : super.read(bArr);
            if (read == -1) {
                close();
            }
            return read;
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.reset();
        } else {
            super.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.a;
        return inputStream != null ? inputStream.skip(j) : super.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        try {
            InputStream inputStream = this.a;
            if (inputStream != null) {
                read = inputStream.read(bArr, i, i2);
            } else {
                read = super.read(bArr, i, i2);
            }
            if (read == -1) {
                close();
            }
            return read;
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            InputStream inputStream = this.a;
            int read = inputStream != null ? inputStream.read() : -1;
            if (read == -1) {
                close();
            }
            return read;
        } catch (IOException e2) {
            throw e2;
        }
    }
}
