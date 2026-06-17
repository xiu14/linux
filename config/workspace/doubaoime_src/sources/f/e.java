package f;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f10039c;
    public u a;
    private long b;

    public static final class a implements Closeable {
        public e a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        private u f10040c;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f10042e;

        /* renamed from: d, reason: collision with root package name */
        public long f10041d = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f10043f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f10044g = -1;

        public final int a(long j) {
            e eVar = this.a;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j < -1 || j > eVar.I()) {
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(eVar.I())}, 2));
                kotlin.s.c.l.b(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            }
            if (j == -1 || j == eVar.I()) {
                this.f10040c = null;
                this.f10041d = j;
                this.f10042e = null;
                this.f10043f = -1;
                this.f10044g = -1;
                return -1;
            }
            long j2 = 0;
            long I = eVar.I();
            u uVar = eVar.a;
            u uVar2 = this.f10040c;
            if (uVar2 != null) {
                long j3 = this.f10041d;
                int i = this.f10043f;
                if (uVar2 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                long j4 = j3 - (i - uVar2.b);
                if (j4 > j) {
                    I = j4;
                    uVar2 = uVar;
                    uVar = uVar2;
                } else {
                    j2 = j4;
                }
            } else {
                uVar2 = uVar;
            }
            if (I - j > j - j2) {
                while (uVar2 != null) {
                    int i2 = uVar2.f10061c;
                    int i3 = uVar2.b;
                    if (j >= (i2 - i3) + j2) {
                        j2 += i2 - i3;
                        uVar2 = uVar2.f10064f;
                    }
                }
                kotlin.s.c.l.k();
                throw null;
            }
            while (I > j) {
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                uVar = uVar.f10065g;
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                I -= uVar.f10061c - uVar.b;
            }
            j2 = I;
            uVar2 = uVar;
            if (this.b) {
                if (uVar2 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                if (uVar2.f10062d) {
                    byte[] bArr = uVar2.a;
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    kotlin.s.c.l.b(copyOf, "java.util.Arrays.copyOf(this, size)");
                    u uVar3 = new u(copyOf, uVar2.b, uVar2.f10061c, false, true);
                    if (eVar.a == uVar2) {
                        eVar.a = uVar3;
                    }
                    uVar2.b(uVar3);
                    u uVar4 = uVar3.f10065g;
                    if (uVar4 == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                    uVar4.a();
                    uVar2 = uVar3;
                }
            }
            this.f10040c = uVar2;
            this.f10041d = j;
            if (uVar2 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            this.f10042e = uVar2.a;
            int i4 = uVar2.b + ((int) (j - j2));
            this.f10043f = i4;
            int i5 = uVar2.f10061c;
            this.f10044g = i5;
            return i5 - i4;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.a != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.a = null;
            this.f10040c = null;
            this.f10041d = -1L;
            this.f10042e = null;
            this.f10043f = -1;
            this.f10044g = -1;
        }
    }

    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            e.this.U(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            kotlin.s.c.l.g(bArr, RemoteMessageConst.DATA);
            e.this.Q(bArr, i, i2);
        }
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(kotlin.text.c.a);
        kotlin.s.c.l.b(bytes, "(this as java.lang.String).getBytes(charset)");
        f10039c = bytes;
    }

    public String A() {
        return z(this.b, kotlin.text.c.a);
    }

    @Override // f.g
    public long B(h hVar) {
        kotlin.s.c.l.g(hVar, "targetBytes");
        return p(hVar, 0L);
    }

    @Override // f.f
    public f C() {
        return this;
    }

    public final String D(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (l(j2) == ((byte) 13)) {
                String k = k(j2);
                skip(2L);
                return k;
            }
        }
        String k2 = k(j);
        skip(1L);
        return k2;
    }

    @Override // f.g
    public String E(long j) throws EOFException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("limit < 0: ", j).toString());
        }
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            j2 = j + 1;
        }
        byte b2 = (byte) 10;
        long o = o(b2, 0L, j2);
        if (o != -1) {
            return D(o);
        }
        if (j2 < this.b && l(j2 - 1) == ((byte) 13) && l(j2) == b2) {
            return D(j2);
        }
        e eVar = new e();
        h(eVar, 0L, Math.min(32, this.b));
        StringBuilder M = e.a.a.a.a.M("\\n not found: limit=");
        M.append(Math.min(this.b, j));
        M.append(" content=");
        M.append(f.B.a.b(eVar.w()));
        M.append((char) 8230);
        throw new EOFException(M.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r19 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int G(f.p r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.G(f.p, boolean):int");
    }

    public final void H(long j) {
        this.b = j;
    }

    public final long I() {
        return this.b;
    }

    @Override // f.f
    public /* bridge */ /* synthetic */ f J(String str) {
        j0(str);
        return this;
    }

    @Override // f.g
    public boolean K(long j, h hVar) {
        kotlin.s.c.l.g(hVar, "bytes");
        int f2 = hVar.f();
        kotlin.s.c.l.g(hVar, "bytes");
        if (j < 0 || f2 < 0 || this.b - j < f2 || hVar.f() - 0 < f2) {
            return false;
        }
        for (int i = 0; i < f2; i++) {
            if (l(i + j) != hVar.j(0 + i)) {
                return false;
            }
        }
        return true;
    }

    @Override // f.g
    public String L(Charset charset) {
        kotlin.s.c.l.g(charset, "charset");
        return z(this.b, charset);
    }

    public final u M(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        u uVar = this.a;
        if (uVar == null) {
            u b2 = v.b();
            this.a = b2;
            b2.f10065g = b2;
            b2.f10064f = b2;
            return b2;
        }
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        u uVar2 = uVar.f10065g;
        if (uVar2 == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        if (uVar2.f10061c + i <= 8192 && uVar2.f10063e) {
            return uVar2;
        }
        u b3 = v.b();
        uVar2.b(b3);
        return b3;
    }

    public e N(h hVar) {
        kotlin.s.c.l.g(hVar, "byteString");
        hVar.u(this);
        return this;
    }

    @Override // f.x
    public void O(e eVar, long j) {
        u uVar;
        u b2;
        kotlin.s.c.l.g(eVar, "source");
        if (!(eVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        com.prolificinteractive.materialcalendarview.r.A(eVar.b, 0L, j);
        while (j > 0) {
            u uVar2 = eVar.a;
            if (uVar2 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            int i = uVar2.f10061c;
            if (uVar2 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            if (j < i - uVar2.b) {
                u uVar3 = this.a;
                if (uVar3 == null) {
                    uVar = null;
                } else {
                    if (uVar3 == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                    uVar = uVar3.f10065g;
                }
                if (uVar != null && uVar.f10063e) {
                    if ((uVar.f10061c + j) - (uVar.f10062d ? 0 : uVar.b) <= 8192) {
                        if (uVar2 == null) {
                            kotlin.s.c.l.k();
                            throw null;
                        }
                        uVar2.d(uVar, (int) j);
                        eVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                if (uVar2 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                int i2 = (int) j;
                Objects.requireNonNull(uVar2);
                if (!(i2 > 0 && i2 <= uVar2.f10061c - uVar2.b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i2 >= 1024) {
                    b2 = uVar2.c();
                } else {
                    b2 = v.b();
                    com.prolificinteractive.materialcalendarview.r.w(uVar2.a, uVar2.b, b2.a, 0, i2);
                }
                b2.f10061c = b2.b + i2;
                uVar2.b += i2;
                u uVar4 = uVar2.f10065g;
                if (uVar4 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                uVar4.b(b2);
                eVar.a = b2;
            }
            u uVar5 = eVar.a;
            if (uVar5 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            long j2 = uVar5.f10061c - uVar5.b;
            eVar.a = uVar5.a();
            u uVar6 = this.a;
            if (uVar6 == null) {
                this.a = uVar5;
                uVar5.f10065g = uVar5;
                uVar5.f10064f = uVar5;
            } else {
                if (uVar6 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                u uVar7 = uVar6.f10065g;
                if (uVar7 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                uVar7.b(uVar5);
                u uVar8 = uVar5.f10065g;
                if (!(uVar8 != uVar5)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                if (uVar8 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                if (uVar8.f10063e) {
                    int i3 = uVar5.f10061c - uVar5.b;
                    if (i3 <= (8192 - uVar8.f10061c) + (uVar8.f10062d ? 0 : uVar8.b)) {
                        uVar5.d(uVar8, i3);
                        uVar5.a();
                        v.a(uVar5);
                    }
                }
            }
            eVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public e P(byte[] bArr) {
        kotlin.s.c.l.g(bArr, "source");
        Q(bArr, 0, bArr.length);
        return this;
    }

    public e Q(byte[] bArr, int i, int i2) {
        kotlin.s.c.l.g(bArr, "source");
        long j = i2;
        com.prolificinteractive.materialcalendarview.r.A(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            u M = M(1);
            int min = Math.min(i3 - i, 8192 - M.f10061c);
            System.arraycopy(bArr, i, M.a, M.f10061c, min);
            i += min;
            M.f10061c += min;
        }
        this.b += j;
        return this;
    }

    public long S(z zVar) throws IOException {
        kotlin.s.c.l.g(zVar, "source");
        long j = 0;
        while (true) {
            long b0 = zVar.b0(this, 8192);
            if (b0 == -1) {
                return j;
            }
            j += b0;
        }
    }

    @Override // f.g
    public boolean T(long j) {
        return this.b >= j;
    }

    public e U(int i) {
        u M = M(1);
        byte[] bArr = M.a;
        int i2 = M.f10061c;
        M.f10061c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // f.g
    public String V() throws EOFException {
        return E(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // f.g
    public int W() throws EOFException {
        return com.prolificinteractive.materialcalendarview.r.h0(readInt());
    }

    @Override // f.g
    public byte[] X(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(e.a.a.a.a.n("byteCount: ", j).toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // f.f
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public e h0(long j) {
        int i;
        if (j == 0) {
            U(48);
            return this;
        }
        boolean z = false;
        int i2 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                j0("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j < 100000000) {
            if (j >= com.heytap.mcssdk.constant.a.q) {
                i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
            } else if (j >= 100) {
                i = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i2 = 2;
            }
            i2 = i;
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i2 = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
                i2 = i;
            }
        } else if (j >= 1000000000000000L) {
            i2 = j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j < 10000000000000L) {
            i2 = 13;
        } else {
            i = j < 100000000000000L ? 14 : 15;
            i2 = i;
        }
        if (z) {
            i2++;
        }
        u M = M(i2);
        byte[] bArr = M.a;
        int i3 = M.f10061c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = f10039c[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        M.f10061c += i2;
        this.b += i2;
        return this;
    }

    @Override // f.f
    public /* bridge */ /* synthetic */ f Z(h hVar) {
        N(hVar);
        return this;
    }

    public final void a() {
        skip(this.b);
    }

    @Override // f.f
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public e R(long j) {
        if (j == 0) {
            U(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        u M = M(numberOfTrailingZeros);
        byte[] bArr = M.a;
        int i = M.f10061c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f10039c[(int) (15 & j)];
            j >>>= 4;
        }
        M.f10061c += numberOfTrailingZeros;
        this.b += numberOfTrailingZeros;
        return this;
    }

    @Override // f.g, f.f
    public e b() {
        return this;
    }

    @Override // f.z
    public long b0(e eVar, long j) {
        kotlin.s.c.l.g(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("byteCount < 0: ", j).toString());
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        eVar.O(this, j);
        return j;
    }

    @Override // f.z
    public A c() {
        return A.f10033d;
    }

    public e c0(int i) {
        u M = M(4);
        byte[] bArr = M.a;
        int i2 = M.f10061c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        M.f10061c = i5 + 1;
        this.b += 4;
        return this;
    }

    public Object clone() {
        e eVar = new e();
        if (this.b != 0) {
            u uVar = this.a;
            if (uVar == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            u c2 = uVar.c();
            eVar.a = c2;
            c2.f10065g = c2;
            c2.f10064f = c2;
            u uVar2 = this.a;
            if (uVar2 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            for (u uVar3 = uVar2.f10064f; uVar3 != this.a; uVar3 = uVar3.f10064f) {
                u uVar4 = eVar.a;
                if (uVar4 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                u uVar5 = uVar4.f10065g;
                if (uVar5 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                if (uVar3 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                uVar5.b(uVar3.c());
            }
            eVar.b = this.b;
        }
        return eVar;
    }

    @Override // f.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long d() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        u uVar = this.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        u uVar2 = uVar.f10065g;
        if (uVar2 != null) {
            return (uVar2.f10061c >= 8192 || !uVar2.f10063e) ? j : j - (r3 - uVar2.b);
        }
        kotlin.s.c.l.k();
        throw null;
    }

    @Override // f.g
    public long d0() throws EOFException {
        return com.prolificinteractive.materialcalendarview.r.i0(readLong());
    }

    public e e0(long j) {
        u M = M(8);
        byte[] bArr = M.a;
        int i = M.f10061c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        M.f10061c = i8 + 1;
        this.b += 8;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        long j = this.b;
        e eVar = (e) obj;
        if (j != eVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        u uVar = this.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        u uVar2 = eVar.a;
        if (uVar2 == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        int i = uVar.b;
        int i2 = uVar2.b;
        long j3 = 0;
        while (j3 < this.b) {
            long min = Math.min(uVar.f10061c - i, uVar2.f10061c - i2);
            long j4 = j2;
            while (j4 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (uVar.a[i] != uVar2.a[i2]) {
                    return false;
                }
                j4++;
                i = i3;
                i2 = i4;
            }
            if (i == uVar.f10061c) {
                uVar = uVar.f10064f;
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                i = uVar.b;
            }
            if (i2 == uVar2.f10061c) {
                uVar2 = uVar2.f10064f;
                if (uVar2 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                i2 = uVar2.b;
            }
            j3 += min;
            j2 = 0;
        }
        return true;
    }

    public e f0(int i) {
        u M = M(2);
        byte[] bArr = M.a;
        int i2 = M.f10061c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        M.f10061c = i3 + 1;
        this.b += 2;
        return this;
    }

    @Override // f.f, f.x, java.io.Flushable
    public void flush() {
    }

    @Override // f.g
    public void g0(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final e h(e eVar, long j, long j2) {
        kotlin.s.c.l.g(eVar, "out");
        com.prolificinteractive.materialcalendarview.r.A(this.b, j, j2);
        if (j2 == 0) {
            return this;
        }
        eVar.b += j2;
        u uVar = this.a;
        while (uVar != null) {
            int i = uVar.f10061c;
            int i2 = uVar.b;
            if (j < i - i2) {
                while (j2 > 0) {
                    if (uVar == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                    u c2 = uVar.c();
                    int i3 = c2.b + ((int) j);
                    c2.b = i3;
                    c2.f10061c = Math.min(i3 + ((int) j2), c2.f10061c);
                    u uVar2 = eVar.a;
                    if (uVar2 == null) {
                        c2.f10065g = c2;
                        c2.f10064f = c2;
                        eVar.a = c2;
                    } else {
                        if (uVar2 == null) {
                            kotlin.s.c.l.k();
                            throw null;
                        }
                        u uVar3 = uVar2.f10065g;
                        if (uVar3 == null) {
                            kotlin.s.c.l.k();
                            throw null;
                        }
                        uVar3.b(c2);
                    }
                    j2 -= c2.f10061c - c2.b;
                    uVar = uVar.f10064f;
                    j = 0;
                }
                return this;
            }
            j -= i - i2;
            uVar = uVar.f10064f;
        }
        kotlin.s.c.l.k();
        throw null;
    }

    public int hashCode() {
        u uVar = this.a;
        if (uVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = uVar.f10061c;
            for (int i3 = uVar.b; i3 < i2; i3++) {
                i = (i * 31) + uVar.a[i3];
            }
            uVar = uVar.f10064f;
            if (uVar == null) {
                kotlin.s.c.l.k();
                throw null;
            }
        } while (uVar != this.a);
        return i;
    }

    @Override // f.f
    public OutputStream i0() {
        return new c();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // f.g
    public InputStream j() {
        return new b();
    }

    public e j0(String str) {
        kotlin.s.c.l.g(str, TypedValues.Custom.S_STRING);
        l0(str, 0, str.length());
        return this;
    }

    @Override // f.g
    public String k(long j) throws EOFException {
        return z(j, kotlin.text.c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[EDGE_INSN: B:41:0x00a1->B:38:0x00a1 BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    @Override // f.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long k0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lad
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            f.u r6 = r14.a
            if (r6 == 0) goto La8
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.f10061c
        L15:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L26
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L26
            int r11 = r10 - r11
            goto L3f
        L26:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L31
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L31
            goto L3b
        L31:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L72
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L72
        L3b:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L3f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L15
        L4f:
            f.e r0 = new f.e
            r0.<init>()
            f.e r0 = r0.R(r4)
            r0.U(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = e.a.a.a.a.M(r2)
            java.lang.String r0 = r0.A()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L8d
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = e.a.a.a.a.M(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            f.u r7 = r6.a()
            r14.a = r7
            f.v.a(r6)
            goto L9b
        L99:
            r6.b = r8
        L9b:
            if (r1 != 0) goto La1
            f.u r6 = r14.a
            if (r6 != 0) goto Lb
        La1:
            long r1 = r14.b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.b = r1
            return r4
        La8:
            kotlin.s.c.l.k()
            r0 = 0
            throw r0
        Lad:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.k0():long");
    }

    public final byte l(long j) {
        com.prolificinteractive.materialcalendarview.r.A(this.b, j, 1L);
        u uVar = this.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                uVar = uVar.f10065g;
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                j2 -= uVar.f10061c - uVar.b;
            }
            return uVar.a[(int) ((uVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = uVar.f10061c;
            int i2 = uVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return uVar.a[(int) ((i2 + j) - j3)];
            }
            uVar = uVar.f10064f;
            if (uVar == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            j3 = j4;
        }
    }

    public e l0(String str, int i, int i2) {
        char charAt;
        kotlin.s.c.l.g(str, TypedValues.Custom.S_STRING);
        if (!(i >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.j("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(e.a.a.a.a.l("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= str.length())) {
            StringBuilder N = e.a.a.a.a.N("endIndex > string.length: ", i2, " > ");
            N.append(str.length());
            throw new IllegalArgumentException(N.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                u M = M(1);
                byte[] bArr = M.a;
                int i3 = M.f10061c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = M.f10061c;
                int i6 = (i3 + i) - i5;
                M.f10061c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt2 < 2048) {
                    u M2 = M(2);
                    byte[] bArr2 = M2.a;
                    int i7 = M2.f10061c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    M2.f10061c = i7 + 2;
                    this.b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    u M3 = M(3);
                    byte[] bArr3 = M3.a;
                    int i8 = M3.f10061c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    M3.f10061c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        U(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        u M4 = M(4);
                        byte[] bArr4 = M4.a;
                        int i11 = M4.f10061c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        M4.f10061c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    @Override // f.g
    public h m(long j) throws EOFException {
        return new h(X(j));
    }

    @Override // f.g
    public int m0(p pVar) {
        kotlin.s.c.l.g(pVar, "options");
        int G = G(pVar, false);
        if (G == -1) {
            return -1;
        }
        skip(pVar.a()[G].f());
        return G;
    }

    @Override // f.f
    public f n() {
        return this;
    }

    public e n0(int i) {
        if (i < 128) {
            U(i);
        } else if (i < 2048) {
            u M = M(2);
            byte[] bArr = M.a;
            int i2 = M.f10061c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            M.f10061c = i2 + 2;
            this.b += 2;
        } else if (55296 <= i && 57343 >= i) {
            U(63);
        } else if (i < 65536) {
            u M2 = M(3);
            byte[] bArr2 = M2.a;
            int i3 = M2.f10061c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            M2.f10061c = i3 + 3;
            this.b += 3;
        } else {
            if (i > 1114111) {
                StringBuilder M3 = e.a.a.a.a.M("Unexpected code point: ");
                M3.append(Integer.toHexString(i));
                throw new IllegalArgumentException(M3.toString());
            }
            u M4 = M(4);
            byte[] bArr3 = M4.a;
            int i4 = M4.f10061c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            M4.f10061c = i4 + 4;
            this.b += 4;
        }
        return this;
    }

    public long o(byte b2, long j, long j2) {
        u uVar;
        long j3 = 0;
        if (!(0 <= j && j2 >= j)) {
            StringBuilder M = e.a.a.a.a.M("size=");
            M.append(this.b);
            M.append(" fromIndex=");
            M.append(j);
            M.append(" toIndex=");
            M.append(j2);
            throw new IllegalArgumentException(M.toString().toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        long j5 = -1;
        if (j == j2 || (uVar = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                uVar = uVar.f10065g;
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                j4 -= uVar.f10061c - uVar.b;
            }
            while (j4 < j2) {
                byte[] bArr = uVar.a;
                int min = (int) Math.min(uVar.f10061c, (uVar.b + j2) - j4);
                for (int i = (int) ((uVar.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b2) {
                        return (i - uVar.b) + j4;
                    }
                }
                j4 += uVar.f10061c - uVar.b;
                uVar = uVar.f10064f;
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                j5 = -1;
                j = j4;
            }
            return j5;
        }
        while (true) {
            long j6 = (uVar.f10061c - uVar.b) + j3;
            if (j6 > j) {
                while (j3 < j2) {
                    byte[] bArr2 = uVar.a;
                    int min2 = (int) Math.min(uVar.f10061c, (uVar.b + j2) - j3);
                    for (int i2 = (int) ((uVar.b + j) - j3); i2 < min2; i2++) {
                        if (bArr2[i2] == b2) {
                            return (i2 - uVar.b) + j3;
                        }
                    }
                    j3 += uVar.f10061c - uVar.b;
                    uVar = uVar.f10064f;
                    if (uVar == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                    j = j3;
                }
                return -1L;
            }
            uVar = uVar.f10064f;
            if (uVar == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            j3 = j6;
        }
    }

    public long p(h hVar, long j) {
        kotlin.s.c.l.g(hVar, "targetBytes");
        long j2 = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.n("fromIndex < 0: ", j).toString());
        }
        u uVar = this.a;
        if (uVar == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                uVar = uVar.f10065g;
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                j3 -= uVar.f10061c - uVar.b;
            }
            if (hVar.f() == 2) {
                byte j4 = hVar.j(0);
                byte j5 = hVar.j(1);
                while (j3 < this.b) {
                    byte[] bArr = uVar.a;
                    int i = uVar.f10061c;
                    for (int i2 = (int) ((uVar.b + j) - j3); i2 < i; i2++) {
                        byte b2 = bArr[i2];
                        if (b2 == j4 || b2 == j5) {
                            return (i2 - uVar.b) + j3;
                        }
                    }
                    j3 += uVar.f10061c - uVar.b;
                    uVar = uVar.f10064f;
                    if (uVar == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                    j = j3;
                }
            } else {
                byte[] i3 = hVar.i();
                while (j3 < this.b) {
                    byte[] bArr2 = uVar.a;
                    int i4 = uVar.f10061c;
                    for (int i5 = (int) ((uVar.b + j) - j3); i5 < i4; i5++) {
                        byte b3 = bArr2[i5];
                        for (byte b4 : i3) {
                            if (b3 == b4) {
                                return (i5 - uVar.b) + j3;
                            }
                        }
                    }
                    j3 += uVar.f10061c - uVar.b;
                    uVar = uVar.f10064f;
                    if (uVar == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j6 = (uVar.f10061c - uVar.b) + j2;
            if (j6 > j) {
                if (hVar.f() == 2) {
                    byte j7 = hVar.j(0);
                    byte j8 = hVar.j(1);
                    while (j2 < this.b) {
                        byte[] bArr3 = uVar.a;
                        int i6 = uVar.f10061c;
                        for (int i7 = (int) ((uVar.b + j) - j2); i7 < i6; i7++) {
                            byte b5 = bArr3[i7];
                            if (b5 == j7 || b5 == j8) {
                                return (i7 - uVar.b) + j2;
                            }
                        }
                        j2 += uVar.f10061c - uVar.b;
                        uVar = uVar.f10064f;
                        if (uVar == null) {
                            kotlin.s.c.l.k();
                            throw null;
                        }
                        j = j2;
                    }
                } else {
                    byte[] i8 = hVar.i();
                    while (j2 < this.b) {
                        byte[] bArr4 = uVar.a;
                        int i9 = uVar.f10061c;
                        for (int i10 = (int) ((uVar.b + j) - j2); i10 < i9; i10++) {
                            byte b6 = bArr4[i10];
                            for (byte b7 : i8) {
                                if (b6 == b7) {
                                    return (i10 - uVar.b) + j2;
                                }
                            }
                        }
                        j2 += uVar.f10061c - uVar.b;
                        uVar = uVar.f10064f;
                        if (uVar == null) {
                            kotlin.s.c.l.k();
                            throw null;
                        }
                        j = j2;
                    }
                }
                return -1L;
            }
            uVar = uVar.f10064f;
            if (uVar == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            j2 = j6;
        }
    }

    @Override // f.f
    public f q(long j) {
        e0(com.prolificinteractive.materialcalendarview.r.i0(j));
        return this;
    }

    public final a r(a aVar) {
        kotlin.s.c.l.g(aVar, "unsafeCursor");
        if (!(aVar.a == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.a = this;
        aVar.b = true;
        return aVar;
    }

    public int read(byte[] bArr, int i, int i2) {
        kotlin.s.c.l.g(bArr, "sink");
        com.prolificinteractive.materialcalendarview.r.A(bArr.length, i, i2);
        u uVar = this.a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i2, uVar.f10061c - uVar.b);
        System.arraycopy(uVar.a, uVar.b, bArr, i, min);
        int i3 = uVar.b + min;
        uVar.b = i3;
        this.b -= min;
        if (i3 == uVar.f10061c) {
            this.a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // f.g
    public byte readByte() throws EOFException {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        u uVar = this.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        int i = uVar.b;
        int i2 = uVar.f10061c;
        int i3 = i + 1;
        byte b2 = uVar.a[i];
        this.b = j - 1;
        if (i3 == i2) {
            this.a = uVar.a();
            v.a(uVar);
        } else {
            uVar.b = i3;
        }
        return b2;
    }

    @Override // f.g
    public void readFully(byte[] bArr) throws EOFException {
        kotlin.s.c.l.g(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // f.g
    public int readInt() throws EOFException {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        u uVar = this.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        int i = uVar.b;
        int i2 = uVar.f10061c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = uVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.b = j - 4;
        if (i8 == i2) {
            this.a = uVar.a();
            v.a(uVar);
        } else {
            uVar.b = i8;
        }
        return i9;
    }

    @Override // f.g
    public long readLong() throws EOFException {
        long j = this.b;
        if (j < 8) {
            throw new EOFException();
        }
        u uVar = this.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        int i = uVar.b;
        int i2 = uVar.f10061c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = uVar.a;
        long j2 = (bArr[i] & 255) << 56;
        long j3 = ((bArr[r10] & 255) << 48) | j2;
        long j4 = j3 | ((bArr[r6] & 255) << 40);
        long j5 = j4 | ((bArr[r10] & 255) << 32) | ((bArr[r6] & 255) << 24);
        long j6 = j5 | ((bArr[r9] & 255) << 16);
        long j7 = j6 | ((bArr[r6] & 255) << 8);
        int i3 = i + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        long j8 = j7 | (bArr[r9] & 255);
        this.b = j - 8;
        if (i3 == i2) {
            this.a = uVar.a();
            v.a(uVar);
        } else {
            uVar.b = i3;
        }
        return j8;
    }

    @Override // f.g
    public short readShort() throws EOFException {
        long j = this.b;
        if (j < 2) {
            throw new EOFException();
        }
        u uVar = this.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        int i = uVar.b;
        int i2 = uVar.f10061c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = uVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.b = j - 2;
        if (i4 == i2) {
            this.a = uVar.a();
            v.a(uVar);
        } else {
            uVar.b = i4;
        }
        return (short) i5;
    }

    public byte[] s() {
        return X(this.b);
    }

    @Override // f.g
    public void skip(long j) throws EOFException {
        while (j > 0) {
            u uVar = this.a;
            if (uVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, uVar.f10061c - uVar.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            int i = uVar.b + min;
            uVar.b = i;
            if (i == uVar.f10061c) {
                this.a = uVar.a();
                v.a(uVar);
            }
        }
    }

    @Override // f.g
    public e t() {
        return this;
    }

    public String toString() {
        h wVar;
        long j = this.b;
        int i = 0;
        if (!(j <= ((long) Integer.MAX_VALUE))) {
            StringBuilder M = e.a.a.a.a.M("size > Integer.MAX_VALUE: ");
            M.append(this.b);
            throw new IllegalStateException(M.toString().toString());
        }
        int i2 = (int) j;
        if (i2 == 0) {
            wVar = h.f10045d;
        } else {
            kotlin.s.c.l.g(this, "buffer");
            com.prolificinteractive.materialcalendarview.r.A(I(), 0L, i2);
            u uVar = this.a;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                if (uVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                int i5 = uVar.f10061c;
                int i6 = uVar.b;
                if (i5 == i6) {
                    throw new AssertionError("s.limit == s.pos");
                }
                i3 += i5 - i6;
                i4++;
                uVar = uVar.f10064f;
            }
            byte[][] bArr = new byte[i4][];
            int[] iArr = new int[i4 * 2];
            u uVar2 = this.a;
            int i7 = 0;
            while (i < i2) {
                if (uVar2 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                bArr[i7] = uVar2.a;
                i += uVar2.f10061c - uVar2.b;
                iArr[i7] = Math.min(i, i2);
                iArr[i7 + i4] = uVar2.b;
                uVar2.f10062d = true;
                i7++;
                uVar2 = uVar2.f10064f;
            }
            wVar = new w(bArr, iArr, null);
        }
        return wVar.toString();
    }

    @Override // f.f
    public f u(int i) {
        c0(com.prolificinteractive.materialcalendarview.r.h0(i));
        return this;
    }

    @Override // f.g
    public boolean v() {
        return this.b == 0;
    }

    public h w() {
        return new h(s());
    }

    @Override // f.f
    public /* bridge */ /* synthetic */ f write(byte[] bArr) {
        P(bArr);
        return this;
    }

    @Override // f.f
    public /* bridge */ /* synthetic */ f writeByte(int i) {
        U(i);
        return this;
    }

    @Override // f.f
    public /* bridge */ /* synthetic */ f writeInt(int i) {
        c0(i);
        return this;
    }

    @Override // f.f
    public /* bridge */ /* synthetic */ f writeShort(int i) {
        f0(i);
        return this;
    }

    public short x() throws EOFException {
        int readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // f.g
    public void y(e eVar, long j) throws EOFException {
        kotlin.s.c.l.g(eVar, "sink");
        long j2 = this.b;
        if (j2 >= j) {
            eVar.O(this, j);
        } else {
            eVar.O(this, j2);
            throw new EOFException();
        }
    }

    public String z(long j, Charset charset) throws EOFException {
        kotlin.s.c.l.g(charset, "charset");
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(e.a.a.a.a.n("byteCount: ", j).toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        u uVar = this.a;
        if (uVar == null) {
            kotlin.s.c.l.k();
            throw null;
        }
        int i = uVar.b;
        if (i + j > uVar.f10061c) {
            return new String(X(j), charset);
        }
        int i2 = (int) j;
        String str = new String(uVar.a, i, i2, charset);
        int i3 = uVar.b + i2;
        uVar.b = i3;
        this.b -= j;
        if (i3 == uVar.f10061c) {
            this.a = uVar.a();
            v.a(uVar);
        }
        return str;
    }

    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.I(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (e.this.I() > 0) {
                return e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            kotlin.s.c.l.g(bArr, "sink");
            return e.this.read(bArr, i, i2);
        }
    }

    @Override // f.f
    public /* bridge */ /* synthetic */ f write(byte[] bArr, int i, int i2) {
        Q(bArr, i, i2);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        kotlin.s.c.l.g(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            u M = M(1);
            int min = Math.min(i, 8192 - M.f10061c);
            byteBuffer.get(M.a, M.f10061c, min);
            i -= min;
            M.f10061c += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        kotlin.s.c.l.g(byteBuffer, "sink");
        u uVar = this.a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f10061c - uVar.b);
        byteBuffer.put(uVar.a, uVar.b, min);
        int i = uVar.b + min;
        uVar.b = i;
        this.b -= min;
        if (i == uVar.f10061c) {
            this.a = uVar.a();
            v.a(uVar);
        }
        return min;
    }
}
