package com.bytedance.rpc.transport.ttnet;

import androidx.annotation.NonNull;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.rpc.transport.e;
import com.bytedance.rpc.transport.ttnet.a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class b implements e {
    private h a;
    private com.bytedance.rpc.transport.a b;

    class a extends InputStream {
        final /* synthetic */ InputStream a;

        a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.a.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.a.close();
            if (b.this.b != null) {
                a.b bVar = (a.b) b.this.b;
                com.bytedance.rpc.transport.ttnet.a.d(com.bytedance.rpc.transport.ttnet.a.this, bVar.a, bVar.b, bVar.f6081c);
            }
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.a.mark(i);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return this.a.read();
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            this.a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            return this.a.skip(j);
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr) throws IOException {
            return this.a.read(bArr);
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            return this.a.read(bArr, i, i2);
        }
    }

    public b(@NonNull h hVar, com.bytedance.rpc.transport.a aVar) {
        this.a = hVar;
        this.b = aVar;
    }

    public long b() throws IOException {
        return this.a.length();
    }

    public String c() {
        return this.a.a();
    }

    public InputStream d() throws IOException {
        return new a(this.a.d());
    }
}
