package com.bytedance.memory.shrink;

import com.bytedance.memory.shrink.f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class d {
    private final InputStream a;
    private int b = 0;

    public d(InputStream inputStream) {
        this.a = inputStream;
    }

    private void b(int i, int i2, long j, e eVar) throws IOException {
        int i3;
        long j2;
        RuntimeException runtimeException;
        int i4;
        int i5;
        long j3;
        Object e2;
        int i6;
        int c2;
        long j4 = j;
        b c3 = eVar.c(i, i2, j4);
        if (c3 == null) {
            g.f(this.a, j4);
            return;
        }
        while (j4 > 0) {
            int read = this.a.read();
            long j5 = j4 - 1;
            if (read == 144) {
                c3.b(read, g.e(this.a, this.b));
                i3 = this.b;
            } else if (read != 195) {
                if (read == 254) {
                    int a = g.a(this.a);
                    c e3 = g.e(this.a, this.b);
                    f.a aVar = (f.a) c3;
                    try {
                        f.this.f5398d.write(254);
                        g.h(f.this.f5398d, a);
                        f.this.f5398d.write(e3.a());
                        i4 = this.b;
                    } finally {
                    }
                } else if (read != 255) {
                    switch (read) {
                        case 1:
                            c3.b(read, g.e(this.a, this.b));
                            g.f(this.a, this.b);
                            i3 = this.b << 1;
                            break;
                        case 2:
                            c e4 = g.e(this.a, this.b);
                            g.a(this.a);
                            g.a(this.a);
                            f.a aVar2 = (f.a) c3;
                            try {
                                f.this.f5398d.write(2);
                                f.this.f5398d.write(e4.a());
                                i5 = this.b;
                                i4 = i5 + 4;
                                break;
                            } finally {
                            }
                        case 3:
                            c e5 = g.e(this.a, this.b);
                            g.a(this.a);
                            g.a(this.a);
                            f.a aVar3 = (f.a) c3;
                            try {
                                f.this.f5398d.write(3);
                                f.this.f5398d.write(e5.a());
                                i5 = this.b;
                                i4 = i5 + 4;
                                break;
                            } finally {
                            }
                        case 4:
                            c e6 = g.e(this.a, this.b);
                            g.a(this.a);
                            f.a aVar4 = (f.a) c3;
                            try {
                                f.this.f5398d.write(4);
                                f.this.f5398d.write(e6.a());
                                i4 = this.b;
                                break;
                            } finally {
                            }
                        case 5:
                            c3.b(read, g.e(this.a, this.b));
                            i3 = this.b;
                            break;
                        case 6:
                            c e7 = g.e(this.a, this.b);
                            g.a(this.a);
                            f.a aVar5 = (f.a) c3;
                            try {
                                f.this.f5398d.write(6);
                                f.this.f5398d.write(e7.a());
                                i4 = this.b;
                                break;
                            } finally {
                            }
                        case 7:
                            c3.b(read, g.e(this.a, this.b));
                            i3 = this.b;
                            break;
                        case 8:
                            c e8 = g.e(this.a, this.b);
                            g.a(this.a);
                            g.a(this.a);
                            f.a aVar6 = (f.a) c3;
                            try {
                                f.this.f5398d.write(8);
                                f.this.f5398d.write(e8.a());
                                i5 = this.b;
                                i4 = i5 + 4;
                                break;
                            } finally {
                            }
                        default:
                            switch (read) {
                                case 32:
                                    c e9 = g.e(this.a, this.b);
                                    g.a(this.a);
                                    c e10 = g.e(this.a, this.b);
                                    c e11 = g.e(this.a, this.b);
                                    g.f(this.a, this.b << 2);
                                    int a2 = g.a(this.a);
                                    int i7 = (this.b * 7) + 4 + 4;
                                    short c4 = g.c(this.a);
                                    int i8 = i7 + 2;
                                    for (int i9 = 0; i9 < c4; i9++) {
                                        g.f(this.a, 2L);
                                        int read2 = this.a.read();
                                        BaseType type = BaseType.getType(read2);
                                        if (type == null) {
                                            throw new IllegalStateException(e.a.a.a.a.j("failure to skip type, cannot find type def of typeid: ", read2));
                                        }
                                        int size = type.getSize(this.b);
                                        g.f(this.a, size);
                                        i8 += size + 1 + 2;
                                    }
                                    int c5 = g.c(this.a);
                                    a[] aVarArr = new a[c5];
                                    int i10 = i8 + 2;
                                    int i11 = 0;
                                    while (i11 < c5) {
                                        c e12 = g.e(this.a, this.b);
                                        int read3 = this.a.read();
                                        BaseType type2 = BaseType.getType(read3);
                                        if (type2 == null) {
                                            throw new IllegalStateException(e.a.a.a.a.j("accept class failed, lost type def of typeId: ", read3));
                                        }
                                        InputStream inputStream = this.a;
                                        long j6 = j5;
                                        int i12 = this.b;
                                        switch (type2) {
                                            case OBJECT:
                                                e2 = g.e(inputStream, i12);
                                                break;
                                            case BOOLEAN:
                                                e2 = Boolean.valueOf(inputStream.read() != 0);
                                                break;
                                            case CHAR:
                                                e2 = Character.valueOf((char) g.c(inputStream));
                                                break;
                                            case FLOAT:
                                                e2 = Float.valueOf(Float.intBitsToFloat(g.a(inputStream)));
                                                break;
                                            case DOUBLE:
                                                e2 = Double.valueOf(Double.longBitsToDouble(g.b(inputStream)));
                                                break;
                                            case BYTE:
                                                e2 = Byte.valueOf((byte) inputStream.read());
                                                break;
                                            case SHORT:
                                                e2 = Short.valueOf(g.c(inputStream));
                                                break;
                                            case INT:
                                                e2 = Integer.valueOf(g.a(inputStream));
                                                break;
                                            case LONG:
                                                e2 = Long.valueOf(g.b(inputStream));
                                                break;
                                            default:
                                                e2 = null;
                                                break;
                                        }
                                        aVarArr[i11] = new a(read3, e12, e2);
                                        int i13 = this.b;
                                        i10 += type2.getSize(i13) + i13 + 1;
                                        i11++;
                                        j5 = j6;
                                    }
                                    j3 = j5;
                                    int c6 = g.c(this.a);
                                    a[] aVarArr2 = new a[c6];
                                    int i14 = i10 + 2;
                                    for (int i15 = 0; i15 < c6; i15++) {
                                        aVarArr2[i15] = new a(this.a.read(), g.e(this.a, this.b), null);
                                        i14 += this.b + 1;
                                    }
                                    f.a aVar7 = (f.a) c3;
                                    try {
                                        f.this.f5398d.write(32);
                                        f.this.f5398d.write(e9.a());
                                        f.this.f5398d.write(e10.a());
                                        f.this.f5398d.write(e11.a());
                                        g.g(f.this.f5398d, f.this.f5397c << 1);
                                        g.j(f.this.f5398d, a2);
                                        g.j(f.this.f5398d, 0);
                                        g.j(f.this.f5398d, c5);
                                        for (int i16 = 0; i16 < c5; i16++) {
                                            a aVar8 = aVarArr[i16];
                                            g.k(f.this.f5398d, aVar8.b);
                                            f.this.f5398d.write(aVar8.a);
                                            g.l(f.this.f5398d, aVar8.f5396c);
                                        }
                                        g.j(f.this.f5398d, c6);
                                        for (int i17 = 0; i17 < c6; i17++) {
                                            a aVar9 = aVarArr2[i17];
                                            g.k(f.this.f5398d, aVar9.b);
                                            f.this.f5398d.write(aVar9.a);
                                        }
                                        j2 = i14;
                                        j5 = j3;
                                        j4 = j5 - j2;
                                    } finally {
                                    }
                                case 33:
                                    c e13 = g.e(this.a, this.b);
                                    g.a(this.a);
                                    c e14 = g.e(this.a, this.b);
                                    int a3 = g.a(this.a);
                                    byte[] bArr = new byte[a3];
                                    g.d(this.a, bArr, a3);
                                    f.a aVar10 = (f.a) c3;
                                    try {
                                        f.this.f5398d.write(33);
                                        f.this.f5398d.write(e13.a());
                                        f.this.f5398d.write(e14.a());
                                        g.h(f.this.f5398d, a3);
                                        f.this.f5398d.write(bArr);
                                        int i18 = this.b;
                                        i6 = i18 + 4 + i18 + 4 + a3;
                                        j2 = i6;
                                        j4 = j5 - j2;
                                    } finally {
                                    }
                                case 34:
                                    c e15 = g.e(this.a, this.b);
                                    g.a(this.a);
                                    int a4 = g.a(this.a);
                                    c e16 = g.e(this.a, this.b);
                                    int i19 = this.b * a4;
                                    byte[] bArr2 = new byte[i19];
                                    g.d(this.a, bArr2, i19);
                                    f.a aVar11 = (f.a) c3;
                                    try {
                                        f.this.f5398d.write(34);
                                        f.this.f5398d.write(e15.a());
                                        g.h(f.this.f5398d, a4);
                                        f.this.f5398d.write(e16.a());
                                        f.this.f5398d.write(bArr2, 0, a4 * f.this.f5397c);
                                        int i20 = this.b;
                                        i6 = i20 + 4 + 4 + i20 + i19;
                                        j2 = i6;
                                        j4 = j5 - j2;
                                    } finally {
                                    }
                                case 35:
                                    c2 = c(read, c3);
                                    j3 = j5;
                                    j2 = c2;
                                    j5 = j3;
                                    j4 = j5 - j2;
                                default:
                                    j3 = j5;
                                    switch (read) {
                                        case 137:
                                            c3.b(read, g.e(this.a, this.b));
                                            c2 = this.b;
                                            break;
                                        case 138:
                                            c3.b(read, g.e(this.a, this.b));
                                            c2 = this.b;
                                            break;
                                        case 139:
                                            c3.b(read, g.e(this.a, this.b));
                                            c2 = this.b;
                                            break;
                                        case 140:
                                            c3.b(read, g.e(this.a, this.b));
                                            c2 = this.b;
                                            break;
                                        case 141:
                                            c3.b(read, g.e(this.a, this.b));
                                            c2 = this.b;
                                            break;
                                        case 142:
                                            c e17 = g.e(this.a, this.b);
                                            g.a(this.a);
                                            g.a(this.a);
                                            f.a aVar12 = (f.a) c3;
                                            try {
                                                f.this.f5398d.write(142);
                                                f.this.f5398d.write(e17.a());
                                                c2 = this.b + 4 + 4;
                                                break;
                                            } finally {
                                            }
                                        default:
                                            StringBuilder N = e.a.a.a.a.N("acceptHeapDumpRecord loop with unknown tag ", read, " with ");
                                            N.append(this.a.available());
                                            N.append(" bytes possibly remaining");
                                            throw new IllegalArgumentException(N.toString());
                                    }
                                    j2 = c2;
                                    j5 = j3;
                                    j4 = j5 - j2;
                            }
                    }
                } else {
                    c3.b(read, g.e(this.a, this.b));
                    i3 = this.b;
                }
                i3 = i4 + 4;
            } else {
                i3 = c(read, c3);
            }
            j2 = i3;
            j4 = j5 - j2;
        }
        c3.a();
    }

    private int c(int i, b bVar) throws IOException {
        c e2 = g.e(this.a, this.b);
        g.a(this.a);
        int a = g.a(this.a);
        int read = this.a.read();
        BaseType type = BaseType.getType(read);
        if (type == null) {
            throw new IllegalStateException(e.a.a.a.a.j("accept primitive array failed, lost type def of typeId: ", read));
        }
        int size = type.getSize(this.b) * a;
        g.d(this.a, new byte[size], size);
        f.a aVar = (f.a) bVar;
        try {
            f.this.f5398d.write(i);
            f.this.f5398d.write(e2.a());
            g.h(f.this.f5398d, a);
            f.this.f5398d.write(read);
            BaseType type2 = BaseType.getType(read);
            if (type2 != BaseType.CHAR && type2 != BaseType.BYTE) {
                g.g(f.this.f5398d, a * BaseType.getType(read).getSize(f.this.f5397c));
            }
            return this.b + 4 + 4 + 1 + size;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private void d(int i, long j, e eVar) throws IOException {
        eVar.e(g.e(this.a, this.b), g.e(this.a, this.b), g.e(this.a, this.b), g.e(this.a, this.b), g.a(this.a), g.a(this.a), i, j);
    }

    public void a(e eVar) throws IOException {
        int i;
        InputStream inputStream = this.a;
        StringBuilder sb = new StringBuilder();
        int read = inputStream.read();
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (read != 0) {
                sb.append((char) read);
                i2++;
                if (i2 > 2048) {
                    throw new IOException("Bad string data which causes result to be too long.");
                }
                read = inputStream.read();
            } else {
                String sb2 = sb.toString();
                int a = g.a(this.a);
                if (a <= 0 || a >= 1073741823) {
                    throw new IOException(e.a.a.a.a.j("bad idSize: ", a));
                }
                long b = g.b(this.a);
                this.b = a;
                eVar.b(sb2, a, b);
                while (true) {
                    try {
                        int read2 = this.a.read();
                        int a2 = g.a(this.a);
                        long a3 = g.a(this.a) & 4294967295L;
                        if (read2 == i3) {
                            i = i3;
                            c e2 = g.e(this.a, this.b);
                            long j = a3 - this.b;
                            byte[] bArr = new byte[(int) j];
                            g.d(this.a, bArr, j);
                            eVar.g(e2, new String(bArr, Charset.forName("UTF-8")), a2, a3);
                        } else if (read2 == 2) {
                            i = i3;
                            eVar.d(g.a(this.a), g.e(this.a, this.b), g.a(this.a), g.e(this.a, this.b), a2, a3);
                        } else if (read2 == 4) {
                            d(a2, a3, eVar);
                        } else if (read2 == 5) {
                            int a4 = g.a(this.a);
                            int a5 = g.a(this.a);
                            int a6 = g.a(this.a);
                            c[] cVarArr = new c[a6];
                            for (int i4 = 0; i4 < a6; i4++) {
                                cVarArr[i4] = g.e(this.a, this.b);
                            }
                            eVar.f(a4, a5, cVarArr, a2, a3);
                        } else if (read2 == 12 || read2 == 28) {
                            b(read2, a2, a3, eVar);
                        } else {
                            byte[] bArr2 = new byte[(int) a3];
                            g.d(this.a, bArr2, a3);
                            eVar.h(read2, a2, a3, bArr2);
                        }
                        i3 = i;
                    } catch (EOFException unused) {
                        eVar.a();
                        return;
                    }
                }
            }
        }
    }
}
