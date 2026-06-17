package e.c.c.h;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class a extends FilterInputStream {
    private int a;
    private int b;

    public a(InputStream inputStream, int i) {
        super(inputStream);
        if (i < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.a = i;
        this.b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.b = this.a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.b == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.a = this.b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.a));
        this.a = (int) (this.a - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        if (i3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.a -= read;
        }
        return read;
    }
}
