package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.c;

/* loaded from: classes2.dex */
final class l implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f10685g = Logger.getLogger(d.class.getName());
    private final f.f a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final f.e f10686c;

    /* renamed from: d, reason: collision with root package name */
    private int f10687d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10688e;

    /* renamed from: f, reason: collision with root package name */
    final c.b f10689f;

    l(f.f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
        f.e eVar = new f.e();
        this.f10686c = eVar;
        this.f10689f = new c.b(eVar);
        this.f10687d = 16384;
    }

    private void D(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min(this.f10687d, j);
            long j2 = min;
            j -= j2;
            l(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.a.O(this.f10686c, j2);
        }
    }

    public synchronized void A(int i, long j) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            d.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        l(i, 4, (byte) 8, (byte) 0);
        this.a.writeInt((int) j);
        this.a.flush();
    }

    public synchronized void a(o oVar) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        this.f10687d = oVar.f(this.f10687d);
        if (oVar.c() != -1) {
            this.f10689f.d(oVar.c());
        }
        l(0, 0, (byte) 4, (byte) 1);
        this.a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f10688e = true;
        this.a.close();
    }

    public synchronized void d() throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        if (this.b) {
            Logger logger = f10685g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(okhttp3.F.c.o(">> CONNECTION %s", d.a.h()));
            }
            this.a.write(d.a.s());
            this.a.flush();
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public synchronized void h(boolean z, int i, f.e eVar, int i2) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        l(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.a.O(eVar, i2);
        }
    }

    public void l(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f10685g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.a(false, i, i2, b, b2));
        }
        int i3 = this.f10687d;
        if (i2 > i3) {
            d.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            d.b("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        f.f fVar = this.a;
        fVar.writeByte((i2 >>> 16) & 255);
        fVar.writeByte((i2 >>> 8) & 255);
        fVar.writeByte(i2 & 255);
        this.a.writeByte(b & 255);
        this.a.writeByte(b2 & 255);
        this.a.writeInt(i & Integer.MAX_VALUE);
    }

    public synchronized void o(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            d.b("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        l(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.a.writeInt(i);
        this.a.writeInt(errorCode.httpCode);
        if (bArr.length > 0) {
            this.a.write(bArr);
        }
        this.a.flush();
    }

    void p(boolean z, int i, List<b> list) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        this.f10689f.f(list);
        long I = this.f10686c.I();
        int min = (int) Math.min(this.f10687d, I);
        long j = min;
        byte b = I == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        l(i, min, (byte) 1, b);
        this.a.O(this.f10686c, j);
        if (I > j) {
            D(i, I - j);
        }
    }

    public int r() {
        return this.f10687d;
    }

    public synchronized void s(boolean z, int i, int i2) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        l(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.a.writeInt(i);
        this.a.writeInt(i2);
        this.a.flush();
    }

    public synchronized void w(int i, ErrorCode errorCode) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        l(i, 4, (byte) 3, (byte) 0);
        this.a.writeInt(errorCode.httpCode);
        this.a.flush();
    }

    public synchronized void x(o oVar) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        int i = 0;
        l(0, oVar.j() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (oVar.g(i)) {
                this.a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                this.a.writeInt(oVar.b(i));
            }
            i++;
        }
        this.a.flush();
    }

    public synchronized void z(boolean z, int i, List list) throws IOException {
        if (this.f10688e) {
            throw new IOException("closed");
        }
        p(z, i, list);
    }
}
