package f;

import androidx.core.location.LocationRequestCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class t implements g {
    public final e a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final z f10060c;

    public t(z zVar) {
        kotlin.s.c.l.g(zVar, "source");
        this.f10060c = zVar;
        this.a = new e();
    }

    @Override // f.g
    public long B(h hVar) {
        kotlin.s.c.l.g(hVar, "targetBytes");
        kotlin.s.c.l.g(hVar, "targetBytes");
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        long j = 0;
        while (true) {
            long p = this.a.p(hVar, j);
            if (p != -1) {
                return p;
            }
            long I = this.a.I();
            if (this.f10060c.b0(this.a, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, I);
        }
    }

    @Override // f.g
    public String E(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("limit < 0: ", j).toString());
        }
        long j2 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long a2 = a(b, 0L, j2);
        if (a2 != -1) {
            return this.a.D(a2);
        }
        if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && T(j2) && this.a.l(j2 - 1) == ((byte) 13) && T(1 + j2) && this.a.l(j2) == b) {
            return this.a.D(j2);
        }
        e eVar = new e();
        e eVar2 = this.a;
        eVar2.h(eVar, 0L, Math.min(32, eVar2.I()));
        StringBuilder M = e.a.a.a.a.M("\\n not found: limit=");
        M.append(Math.min(this.a.I(), j));
        M.append(" content=");
        M.append(f.B.a.b(eVar.w()));
        M.append("…");
        throw new EOFException(M.toString());
    }

    @Override // f.g
    public boolean K(long j, h hVar) {
        int i;
        kotlin.s.c.l.g(hVar, "bytes");
        int f2 = hVar.f();
        kotlin.s.c.l.g(hVar, "bytes");
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j >= 0 && f2 >= 0 && hVar.f() - 0 >= f2) {
            for (0; i < f2; i + 1) {
                long j2 = i + j;
                i = (T(1 + j2) && this.a.l(j2) == hVar.j(0 + i)) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // f.g
    public String L(Charset charset) {
        kotlin.s.c.l.g(charset, "charset");
        this.a.S(this.f10060c);
        return this.a.L(charset);
    }

    @Override // f.g
    public boolean T(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("byteCount < 0: ", j).toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.a.I() < j) {
            if (this.f10060c.b0(this.a, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // f.g
    public String V() {
        return E(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // f.g
    public int W() {
        g0(4L);
        return com.prolificinteractive.materialcalendarview.r.h0(this.a.readInt());
    }

    @Override // f.g
    public byte[] X(long j) {
        if (T(j)) {
            return this.a.X(j);
        }
        throw new EOFException();
    }

    public long a(byte b, long j, long j2) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j && j2 >= j)) {
            StringBuilder Q = e.a.a.a.a.Q("fromIndex=", j, " toIndex=");
            Q.append(j2);
            throw new IllegalArgumentException(Q.toString().toString());
        }
        while (j < j2) {
            long o = this.a.o(b, j, j2);
            if (o == -1) {
                long I = this.a.I();
                if (I >= j2 || this.f10060c.b0(this.a, 8192) == -1) {
                    break;
                }
                j = Math.max(j, I);
            } else {
                return o;
            }
        }
        return -1L;
    }

    @Override // f.g, f.f
    public e b() {
        return this.a;
    }

    @Override // f.z
    public long b0(e eVar, long j) {
        kotlin.s.c.l.g(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("byteCount < 0: ", j).toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.a.I() == 0 && this.f10060c.b0(this.a, 8192) == -1) {
            return -1L;
        }
        return this.a.b0(eVar, Math.min(j, this.a.I()));
    }

    @Override // f.z
    public A c() {
        return this.f10060c.c();
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.f10060c.close();
        this.a.a();
    }

    public g d() {
        r rVar = new r(this);
        kotlin.s.c.l.g(rVar, "$receiver");
        return new t(rVar);
    }

    @Override // f.g
    public long d0() {
        g0(8L);
        return com.prolificinteractive.materialcalendarview.r.i0(this.a.readLong());
    }

    @Override // f.g
    public void g0(long j) {
        if (!T(j)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.b;
    }

    @Override // f.g
    public InputStream j() {
        return new a();
    }

    @Override // f.g
    public String k(long j) {
        if (T(j)) {
            return this.a.k(j);
        }
        throw new EOFException();
    }

    @Override // f.g
    public long k0() {
        byte l;
        g0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!T(i2)) {
                break;
            }
            l = this.a.l(i);
            if ((l < ((byte) 48) || l > ((byte) 57)) && ((l < ((byte) 97) || l > ((byte) 102)) && (l < ((byte) 65) || l > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            String format = String.format("Expected leading [0-9a-fA-F] character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(l)}, 1));
            kotlin.s.c.l.b(format, "java.lang.String.format(format, *args)");
            throw new NumberFormatException(format);
        }
        return this.a.k0();
    }

    @Override // f.g
    public h m(long j) {
        if (T(j)) {
            return this.a.m(j);
        }
        throw new EOFException();
    }

    @Override // f.g
    public int m0(p pVar) {
        kotlin.s.c.l.g(pVar, "options");
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int G = this.a.G(pVar, true);
            if (G != -2) {
                if (G == -1) {
                    return -1;
                }
                this.a.skip(pVar.a()[G].f());
                return G;
            }
        } while (this.f10060c.b0(this.a, 8192) != -1);
        return -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        kotlin.s.c.l.g(byteBuffer, "sink");
        if (this.a.I() == 0 && this.f10060c.b0(this.a, 8192) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    @Override // f.g
    public byte readByte() {
        g0(1L);
        return this.a.readByte();
    }

    @Override // f.g
    public void readFully(byte[] bArr) {
        kotlin.s.c.l.g(bArr, "sink");
        try {
            g0(bArr.length);
            this.a.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (this.a.I() > 0) {
                e eVar = this.a;
                int read = eVar.read(bArr, i, (int) eVar.I());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e2;
        }
    }

    @Override // f.g
    public int readInt() {
        g0(4L);
        return this.a.readInt();
    }

    @Override // f.g
    public long readLong() {
        g0(8L);
        return this.a.readLong();
    }

    @Override // f.g
    public short readShort() {
        g0(2L);
        return this.a.readShort();
    }

    @Override // f.g
    public void skip(long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.a.I() == 0 && this.f10060c.b0(this.a, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.a.I());
            this.a.skip(min);
            j -= min;
        }
    }

    @Override // f.g
    public e t() {
        return this.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("buffer(");
        M.append(this.f10060c);
        M.append(')');
        return M.toString();
    }

    @Override // f.g
    public boolean v() {
        if (!this.b) {
            return this.a.v() && this.f10060c.b0(this.a, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // f.g
    public void y(e eVar, long j) {
        kotlin.s.c.l.g(eVar, "sink");
        try {
            if (!T(j)) {
                throw new EOFException();
            }
            this.a.y(eVar, j);
        } catch (EOFException e2) {
            eVar.S(this.a);
            throw e2;
        }
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            t tVar = t.this;
            if (tVar.b) {
                throw new IOException("closed");
            }
            return (int) Math.min(tVar.a.I(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            t.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            t tVar = t.this;
            if (tVar.b) {
                throw new IOException("closed");
            }
            if (tVar.a.I() == 0) {
                t tVar2 = t.this;
                if (tVar2.f10060c.b0(tVar2.a, 8192) == -1) {
                    return -1;
                }
            }
            return t.this.a.readByte() & 255;
        }

        public String toString() {
            return t.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
            if (!t.this.b) {
                com.prolificinteractive.materialcalendarview.r.A(bArr.length, i, i2);
                if (t.this.a.I() == 0) {
                    t tVar = t.this;
                    if (tVar.f10060c.b0(tVar.a, 8192) == -1) {
                        return -1;
                    }
                }
                return t.this.a.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
