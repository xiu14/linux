package okhttp3.internal.http2;

import f.A;
import f.z;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.c;
import okhttp3.internal.http2.f;
import okhttp3.internal.http2.f.k;

/* loaded from: classes2.dex */
final class j implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    static final Logger f10667e = Logger.getLogger(d.class.getName());
    private final f.g a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10668c;

    /* renamed from: d, reason: collision with root package name */
    final c.a f10669d;

    static final class a implements z {
        private final f.g a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        byte f10670c;

        /* renamed from: d, reason: collision with root package name */
        int f10671d;

        /* renamed from: e, reason: collision with root package name */
        int f10672e;

        /* renamed from: f, reason: collision with root package name */
        short f10673f;

        a(f.g gVar) {
            this.a = gVar;
        }

        @Override // f.z
        public long b0(f.e eVar, long j) throws IOException {
            int i;
            int readInt;
            do {
                int i2 = this.f10672e;
                if (i2 != 0) {
                    long b0 = this.a.b0(eVar, Math.min(j, i2));
                    if (b0 == -1) {
                        return -1L;
                    }
                    this.f10672e = (int) (this.f10672e - b0);
                    return b0;
                }
                this.a.skip(this.f10673f);
                this.f10673f = (short) 0;
                if ((this.f10670c & 4) != 0) {
                    return -1L;
                }
                i = this.f10671d;
                int p = j.p(this.a);
                this.f10672e = p;
                this.b = p;
                byte readByte = (byte) (this.a.readByte() & 255);
                this.f10670c = (byte) (this.a.readByte() & 255);
                Logger logger = j.f10667e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(d.a(true, this.f10671d, this.b, readByte, this.f10670c));
                }
                readInt = this.a.readInt() & Integer.MAX_VALUE;
                this.f10671d = readInt;
                if (readByte != 9) {
                    d.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                    throw null;
                }
            } while (readInt == i);
            d.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // f.z
        public A c() {
            return this.a.c();
        }

        @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    interface b {
    }

    j(f.g gVar, boolean z) {
        this.a = gVar;
        this.f10668c = z;
        a aVar = new a(gVar);
        this.b = aVar;
        this.f10669d = new c.a(4096, aVar);
    }

    static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        d.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    private void l(b bVar, int i, int i2) throws IOException {
        k[] kVarArr;
        if (i < 8) {
            d.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            d.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int readInt = this.a.readInt();
        int readInt2 = this.a.readInt();
        int i3 = i - 8;
        if (ErrorCode.fromHttp2(readInt2) == null) {
            d.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        }
        f.h hVar = f.h.f10045d;
        if (i3 > 0) {
            hVar = this.a.m(i3);
        }
        f.l lVar = (f.l) bVar;
        Objects.requireNonNull(lVar);
        hVar.f();
        synchronized (f.this) {
            kVarArr = (k[]) f.this.f10636c.values().toArray(new k[f.this.f10636c.size()]);
            f.this.f10640g = true;
        }
        for (k kVar : kVarArr) {
            if (kVar.f10674c > readInt && kVar.i()) {
                ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                synchronized (kVar) {
                    if (kVar.k == null) {
                        kVar.k = errorCode;
                        kVar.notifyAll();
                    }
                }
                f.this.Y(kVar.f10674c);
            }
        }
    }

    private List<okhttp3.internal.http2.b> o(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.b;
        aVar.f10672e = i;
        aVar.b = i;
        aVar.f10673f = s;
        aVar.f10670c = b2;
        aVar.f10671d = i2;
        this.f10669d.h();
        return this.f10669d.d();
    }

    static int p(f.g gVar) throws IOException {
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    private void r(b bVar, int i, int i2) throws IOException {
        if (i != 4) {
            d.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long readInt = this.a.readInt() & 2147483647L;
        if (readInt == 0) {
            d.c("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        f.l lVar = (f.l) bVar;
        if (i2 == 0) {
            synchronized (f.this) {
                f fVar = f.this;
                fVar.r += readInt;
                fVar.notifyAll();
            }
            return;
        }
        k D = f.this.D(i2);
        if (D != null) {
            synchronized (D) {
                D.b += readInt;
                if (readInt > 0) {
                    D.notifyAll();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public boolean d(boolean z, b bVar) throws IOException {
        short readByte;
        boolean z2;
        ExecutorService executorService;
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2;
        try {
            this.a.g0(9L);
            int p = p(this.a);
            if (p < 0 || p > 16384) {
                d.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(p));
                throw null;
            }
            byte readByte2 = (byte) (this.a.readByte() & 255);
            if (z && readByte2 != 4) {
                d.c("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte2));
                throw null;
            }
            byte readByte3 = (byte) (this.a.readByte() & 255);
            int readInt = this.a.readInt() & Integer.MAX_VALUE;
            Logger logger = f10667e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d.a(true, readInt, p, readByte2, readByte3));
            }
            switch (readByte2) {
                case 0:
                    if (readInt == 0) {
                        d.c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z3 = (readByte3 & 1) != 0;
                    if ((readByte3 & 32) != 0) {
                        d.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    readByte = (readByte3 & 8) != 0 ? (short) (this.a.readByte() & 255) : (short) 0;
                    int a2 = a(p, readByte3, readByte);
                    f.g gVar = this.a;
                    f.l lVar = (f.l) bVar;
                    if (f.this.U(readInt)) {
                        f.this.M(readInt, gVar, a2, z3);
                    } else {
                        k D = f.this.D(readInt);
                        if (D == null) {
                            f.this.n0(readInt, ErrorCode.PROTOCOL_ERROR);
                            long j = a2;
                            f.this.f0(j);
                            gVar.skip(j);
                        } else {
                            D.k(gVar, a2);
                            if (z3) {
                                D.l();
                            }
                        }
                    }
                    this.a.skip(readByte);
                    return true;
                case 1:
                    if (readInt == 0) {
                        d.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z4 = (readByte3 & 1) != 0;
                    short readByte4 = (readByte3 & 8) != 0 ? (short) (this.a.readByte() & 255) : (short) 0;
                    if ((readByte3 & 32) != 0) {
                        this.a.readInt();
                        this.a.readByte();
                        Objects.requireNonNull((f.l) bVar);
                        p -= 5;
                    }
                    List<okhttp3.internal.http2.b> o = o(a(p, readByte3, readByte4), readByte4, readByte3, readInt);
                    f.l lVar2 = (f.l) bVar;
                    if (f.this.U(readInt)) {
                        f.this.P(readInt, o, z4);
                    } else {
                        synchronized (f.this) {
                            k D2 = f.this.D(readInt);
                            if (D2 == null) {
                                z2 = f.this.f10640g;
                                if (!z2) {
                                    f fVar = f.this;
                                    if (readInt > fVar.f10638e) {
                                        if (readInt % 2 != fVar.f10639f % 2) {
                                            k kVar = new k(readInt, f.this, false, z4, okhttp3.F.c.A(o));
                                            f fVar2 = f.this;
                                            fVar2.f10638e = readInt;
                                            fVar2.f10636c.put(Integer.valueOf(readInt), kVar);
                                            executorService = f.y;
                                            executorService.execute(new g(lVar2, "OkHttp %s stream %d", new Object[]{f.this.f10637d, Integer.valueOf(readInt)}, kVar));
                                        }
                                    }
                                }
                            } else {
                                D2.m(o);
                                if (z4) {
                                    D2.l();
                                }
                            }
                        }
                    }
                    return true;
                case 2:
                    if (p != 5) {
                        d.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(p));
                        throw null;
                    }
                    if (readInt == 0) {
                        d.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    this.a.readInt();
                    this.a.readByte();
                    Objects.requireNonNull((f.l) bVar);
                    return true;
                case 3:
                    if (p != 4) {
                        d.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(p));
                        throw null;
                    }
                    if (readInt == 0) {
                        d.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int readInt2 = this.a.readInt();
                    ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
                    if (fromHttp2 == null) {
                        d.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                        throw null;
                    }
                    f.l lVar3 = (f.l) bVar;
                    if (f.this.U(readInt)) {
                        f.this.S(readInt, fromHttp2);
                    } else {
                        k Y = f.this.Y(readInt);
                        if (Y != null) {
                            synchronized (Y) {
                                if (Y.k == null) {
                                    Y.k = fromHttp2;
                                    Y.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                case 4:
                    if (readInt != 0) {
                        d.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((readByte3 & 1) != 0) {
                        if (p == 0) {
                            Objects.requireNonNull((f.l) bVar);
                            return true;
                        }
                        d.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    if (p % 6 != 0) {
                        d.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(p));
                        throw null;
                    }
                    o oVar = new o();
                    for (int i = 0; i < p; i += 6) {
                        int readShort = this.a.readShort() & 65535;
                        int readInt3 = this.a.readInt();
                        if (readShort != 2) {
                            if (readShort == 3) {
                                readShort = 4;
                            } else if (readShort == 4) {
                                readShort = 7;
                                if (readInt3 < 0) {
                                    d.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                            } else if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                d.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                throw null;
                            }
                        } else if (readInt3 != 0 && readInt3 != 1) {
                            d.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                        oVar.i(readShort, readInt3);
                    }
                    f.l lVar4 = (f.l) bVar;
                    Objects.requireNonNull(lVar4);
                    scheduledExecutorService = f.this.h;
                    scheduledExecutorService.execute(new h(lVar4, "OkHttp %s ACK Settings", new Object[]{f.this.f10637d}, false, oVar));
                    return true;
                case 5:
                    if (readInt == 0) {
                        d.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    readByte = (readByte3 & 8) != 0 ? (short) (this.a.readByte() & 255) : (short) 0;
                    f.this.Q(this.a.readInt() & Integer.MAX_VALUE, o(a(p - 4, readByte3, readByte), readByte, readByte3, readInt));
                    return true;
                case 6:
                    if (p != 8) {
                        d.c("TYPE_PING length != 8: %s", Integer.valueOf(p));
                        throw null;
                    }
                    if (readInt != 0) {
                        d.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int readInt4 = this.a.readInt();
                    int readInt5 = this.a.readInt();
                    readByte = (readByte3 & 1) != 0 ? (short) 1 : (short) 0;
                    f.l lVar5 = (f.l) bVar;
                    Objects.requireNonNull(lVar5);
                    if (readByte == 0) {
                        scheduledExecutorService2 = f.this.h;
                        scheduledExecutorService2.execute(f.this.new k(true, readInt4, readInt5));
                        return true;
                    }
                    synchronized (f.this) {
                        try {
                            if (readInt4 == 1) {
                                f.h(f.this);
                            } else if (readInt4 == 2) {
                                f.x(f.this);
                            } else if (readInt4 == 3) {
                                f.z(f.this);
                                f.this.notifyAll();
                            }
                        } finally {
                        }
                    }
                    return true;
                case 7:
                    l(bVar, p, readInt);
                    return true;
                case 8:
                    r(bVar, p, readInt);
                    return true;
                default:
                    this.a.skip(p);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public void h(b bVar) throws IOException {
        if (this.f10668c) {
            if (d(true, bVar)) {
                return;
            }
            d.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        f.g gVar = this.a;
        f.h hVar = d.a;
        f.h m = gVar.m(hVar.f());
        Logger logger = f10667e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(okhttp3.F.c.o("<< CONNECTION %s", m.h()));
        }
        if (hVar.equals(m)) {
            return;
        }
        d.c("Expected a connection header but was %s", m.t());
        throw null;
    }
}
