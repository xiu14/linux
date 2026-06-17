package e.c.c.h;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class b extends FilterInputStream {
    private final byte[] a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f9761c;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.a = bArr;
    }

    private int a() {
        int i = this.b;
        byte[] bArr = this.a;
        if (i >= bArr.length) {
            return -1;
        }
        this.b = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.f9761c = this.b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.b = this.f9761c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a = a();
            if (a == -1) {
                break;
            }
            bArr[i + i3] = (byte) a;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
