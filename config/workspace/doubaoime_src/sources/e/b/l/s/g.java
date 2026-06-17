package e.b.l.s;

import java.io.InputStream;

/* loaded from: classes2.dex */
public class g extends org.apache.thrift.transport.b {
    private byte[] a;
    private final g.a.c.a b = new g.a.c.a();

    /* renamed from: c, reason: collision with root package name */
    private int f9658c;

    public g() {
    }

    @Override // org.apache.thrift.transport.b
    public void a(int i) {
        this.f9658c += i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.transport.b
    public byte[] d() {
        return this.a;
    }

    @Override // org.apache.thrift.transport.b
    public int h() {
        return this.f9658c;
    }

    @Override // org.apache.thrift.transport.b
    public int l() {
        return this.a.length - this.f9658c;
    }

    @Override // org.apache.thrift.transport.b
    public void p(byte[] bArr, int i, int i2) {
        this.b.write(bArr, i, i2);
    }

    public byte[] r() {
        return this.b.a();
    }

    @Override // org.apache.thrift.transport.b
    public int read(byte[] bArr, int i, int i2) {
        int l = l();
        if (i2 > l) {
            i2 = l;
        }
        if (i2 > 0) {
            System.arraycopy(this.a, this.f9658c, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    public g(InputStream inputStream) {
        try {
            this.a = e.b.l.q.c.d(inputStream);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
