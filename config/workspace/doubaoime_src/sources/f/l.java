package f;

import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class l implements z {
    private byte a;
    private final t b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f10049c;

    /* renamed from: d, reason: collision with root package name */
    private final m f10050d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f10051e;

    public l(z zVar) {
        kotlin.s.c.l.g(zVar, "source");
        t tVar = new t(zVar);
        this.b = tVar;
        Inflater inflater = new Inflater(true);
        this.f10049c = inflater;
        this.f10050d = new m(tVar, inflater);
        this.f10051e = new CRC32();
    }

    private final void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        kotlin.s.c.l.b(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    private final void d(e eVar, long j, long j2) {
        u uVar = eVar.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        do {
            int i = uVar.f10061c;
            int i2 = uVar.b;
            if (j < i - i2) {
                while (j2 > 0) {
                    int min = (int) Math.min(uVar.f10061c - r7, j2);
                    this.f10051e.update(uVar.a, (int) (uVar.b + j), min);
                    j2 -= min;
                    uVar = uVar.f10064f;
                    if (uVar == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                    j = 0;
                }
                return;
            }
            j -= i - i2;
            uVar = uVar.f10064f;
        } while (uVar != null);
        kotlin.s.c.l.k();
        throw null;
    }

    @Override // f.z
    public long b0(e eVar, long j) throws IOException {
        long j2;
        kotlin.s.c.l.g(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("byteCount < 0: ", j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.a == 0) {
            this.b.g0(10L);
            byte l = this.b.a.l(3L);
            boolean z = ((l >> 1) & 1) == 1;
            if (z) {
                d(this.b.a, 0L, 10L);
            }
            a("ID1ID2", 8075, this.b.readShort());
            this.b.skip(8L);
            if (((l >> 2) & 1) == 1) {
                this.b.g0(2L);
                if (z) {
                    d(this.b.a, 0L, 2L);
                }
                long x = this.b.a.x();
                this.b.g0(x);
                if (z) {
                    j2 = x;
                    d(this.b.a, 0L, x);
                } else {
                    j2 = x;
                }
                this.b.skip(j2);
            }
            if (((l >> 3) & 1) == 1) {
                long a = this.b.a((byte) 0, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
                if (a == -1) {
                    throw new EOFException();
                }
                if (z) {
                    d(this.b.a, 0L, a + 1);
                }
                this.b.skip(a + 1);
            }
            if (((l >> 4) & 1) == 1) {
                long a2 = this.b.a((byte) 0, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
                if (a2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    d(this.b.a, 0L, a2 + 1);
                }
                this.b.skip(a2 + 1);
            }
            if (z) {
                t tVar = this.b;
                tVar.g0(2L);
                a("FHCRC", tVar.a.x(), (short) this.f10051e.getValue());
                this.f10051e.reset();
            }
            this.a = (byte) 1;
        }
        if (this.a == 1) {
            long I = eVar.I();
            long b0 = this.f10050d.b0(eVar, j);
            if (b0 != -1) {
                d(eVar, I, b0);
                return b0;
            }
            this.a = (byte) 2;
        }
        if (this.a == 2) {
            a("CRC", this.b.W(), (int) this.f10051e.getValue());
            a("ISIZE", this.b.W(), (int) this.f10049c.getBytesWritten());
            this.a = (byte) 3;
            if (!this.b.v()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // f.z
    public A c() {
        return this.b.c();
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10050d.close();
    }
}
