package g.a.c.c;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final i f10075c = new i();
    private final byte[] b;

    public a(org.apache.thrift.transport.b bVar) {
        super(bVar);
        this.b = new byte[8];
    }

    private void s(int i) throws f {
        if (i < 0) {
            throw new f(2, e.a.a.a.a.j("Negative length: ", i));
        }
    }

    private void t(int i) throws f {
        if (i < 0) {
            throw new f(2, e.a.a.a.a.j("Negative length: ", i));
        }
    }

    private int u(byte[] bArr, int i, int i2) throws g.a.c.b {
        return this.a.o(bArr, i, i2);
    }

    @Override // g.a.c.c.e
    public ByteBuffer a() throws g.a.c.b {
        int f2 = f();
        t(f2);
        if (this.a.l() >= f2) {
            ByteBuffer wrap = ByteBuffer.wrap(this.a.d(), this.a.h(), f2);
            this.a.a(f2);
            return wrap;
        }
        byte[] bArr = new byte[f2];
        this.a.o(bArr, 0, f2);
        return ByteBuffer.wrap(bArr);
    }

    @Override // g.a.c.c.e
    public byte b() throws g.a.c.b {
        if (this.a.l() < 1) {
            u(this.b, 0, 1);
            return this.b[0];
        }
        byte b = this.a.d()[this.a.h()];
        this.a.a(1);
        return b;
    }

    @Override // g.a.c.c.e
    public double c() throws g.a.c.b {
        return Double.longBitsToDouble(g());
    }

    @Override // g.a.c.c.e
    public b d() throws g.a.c.b {
        byte b = b();
        return new b("", b, b == 0 ? (short) 0 : e());
    }

    @Override // g.a.c.c.e
    public short e() throws g.a.c.b {
        byte[] bArr = this.b;
        int i = 0;
        if (this.a.l() >= 2) {
            bArr = this.a.d();
            i = this.a.h();
            this.a.a(2);
        } else {
            u(this.b, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // g.a.c.c.e
    public int f() throws g.a.c.b {
        byte[] bArr = this.b;
        int i = 0;
        if (this.a.l() >= 4) {
            bArr = this.a.d();
            i = this.a.h();
            this.a.a(4);
        } else {
            u(this.b, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // g.a.c.c.e
    public long g() throws g.a.c.b {
        byte[] bArr = this.b;
        int i = 0;
        if (this.a.l() >= 8) {
            bArr = this.a.d();
            i = this.a.h();
            this.a.a(8);
        } else {
            u(this.b, 0, 8);
        }
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Override // g.a.c.c.e
    public c h() throws g.a.c.b {
        byte b = b();
        int f2 = f();
        c cVar = new c(b, f2);
        s(f2);
        return cVar;
    }

    @Override // g.a.c.c.e
    public d i() throws g.a.c.b {
        byte b = b();
        byte b2 = b();
        int f2 = f();
        d dVar = new d(b, b2, f2);
        s(f2);
        return dVar;
    }

    @Override // g.a.c.c.e
    public h j() throws g.a.c.b {
        byte b = b();
        int f2 = f();
        h hVar = new h(b, f2);
        s(f2);
        return hVar;
    }

    @Override // g.a.c.c.e
    public String k() throws g.a.c.b {
        int f2 = f();
        t(f2);
        if (this.a.l() >= f2) {
            try {
                String str = new String(this.a.d(), this.a.h(), f2, "UTF-8");
                this.a.a(f2);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new g.a.c.b("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        t(f2);
        try {
            byte[] bArr = new byte[f2];
            this.a.o(bArr, 0, f2);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused2) {
            throw new g.a.c.b("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // g.a.c.c.e
    public i l() {
        return f10075c;
    }

    @Override // g.a.c.c.e
    public void m(ByteBuffer byteBuffer) throws g.a.c.b {
        int limit = byteBuffer.limit() - byteBuffer.position();
        p(limit);
        this.a.p(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), limit);
    }

    @Override // g.a.c.c.e
    public void n(byte b) throws g.a.c.b {
        byte[] bArr = this.b;
        bArr[0] = b;
        this.a.p(bArr, 0, 1);
    }

    @Override // g.a.c.c.e
    public void o(short s) throws g.a.c.b {
        byte[] bArr = this.b;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.a.p(bArr, 0, 2);
    }

    @Override // g.a.c.c.e
    public void p(int i) throws g.a.c.b {
        byte[] bArr = this.b;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.a.p(bArr, 0, 4);
    }

    @Override // g.a.c.c.e
    public void q(long j) throws g.a.c.b {
        byte[] bArr = this.b;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.a.p(bArr, 0, 8);
    }

    @Override // g.a.c.c.e
    public void r(String str) throws g.a.c.b {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            p(bytes.length);
            this.a.p(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new g.a.c.b("JVM DOES NOT SUPPORT UTF-8");
        }
    }
}
