package com.bytedance.applog.sampling.util;

import androidx.core.location.LocationRequestCompat;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/* loaded from: classes.dex */
public class CityHashUtils {
    private static final boolean a = !"little".equals(System.getProperty("sun.cpu.endian"));
    private static CityHashUtils b = new CityHashUtils();

    private static class a {
        private final int a;
        private final boolean b;

        /* renamed from: c, reason: collision with root package name */
        private int f3890c;

        a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        boolean a() {
            return this.f3890c < this.a;
        }

        int b() {
            if (!this.b) {
                int i = this.f3890c;
                this.f3890c = i + 1;
                return i;
            }
            int i2 = this.a - 1;
            int i3 = this.f3890c;
            this.f3890c = i3 + 1;
            return i2 - i3;
        }
    }

    private int a(byte[] bArr, int i) {
        a aVar = new a(4, a);
        int i2 = 0;
        while (aVar.a()) {
            int b2 = aVar.b();
            i2 |= (bArr[b2 + i] & 255) << (b2 * 8);
        }
        return i2;
    }

    private long b(byte[] bArr, int i) {
        a aVar = new a(8, a);
        long j = 0;
        while (aVar.a()) {
            j |= (bArr[r1 + i] & 255) << (aVar.b() * 8);
        }
        return j;
    }

    private long c(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            long j = -5435081209227447693L;
            if (length <= 32) {
                if (length > 16) {
                    int length2 = bytes.length;
                    long j2 = (length2 * 2) - 7286425919675154353L;
                    long b2 = b(bytes, 0) * (-5435081209227447693L);
                    long b3 = b(bytes, 8);
                    long b4 = b(bytes, length2 - 8) * j2;
                    return f(g(b2 + b3, 43) + g(b4, 30) + (b(bytes, length2 - 16) * (-7286425919675154353L)), b2 + g(b3 - 7286425919675154353L, 18) + b4, j2);
                }
                int length3 = bytes.length;
                if (length3 >= 8) {
                    long j3 = (length3 * 2) - 7286425919675154353L;
                    long b5 = b(bytes, 0) - 7286425919675154353L;
                    long b6 = b(bytes, length3 - 8);
                    return f((g(b6, 37) * j3) + b5, (g(b5, 25) + b6) * j3, j3);
                }
                if (length3 >= 4) {
                    return f(((a(bytes, 0) & 4294967295L) << 3) + length3, 4294967295L & a(bytes, length3 - 4), (length3 * 2) - 7286425919675154353L);
                }
                if (length3 <= 0) {
                    return -7286425919675154353L;
                }
                int i = bytes[0] & 255;
                int i2 = bytes[length3 >>> 1] & 255;
                return (-7286425919675154353L) * h(((length3 + ((bytes[length3 - 1] & 255) << 2)) * (-4348849565147123417L)) ^ ((i + (i2 << 8)) * (-7286425919675154353L)));
            }
            if (length <= 64) {
                int length4 = bytes.length;
                long j4 = (length4 * 2) - 7286425919675154353L;
                long b7 = b(bytes, 0) * (-7286425919675154353L);
                long b8 = b(bytes, 8);
                long b9 = b(bytes, length4 - 24);
                long b10 = b(bytes, length4 - 32);
                long b11 = b(bytes, 16) * (-7286425919675154353L);
                long b12 = b(bytes, 24) * 9;
                long b13 = b(bytes, length4 - 8);
                long b14 = b(bytes, length4 - 16) * j4;
                long j5 = b7 + b13;
                long j6 = (j5 ^ b10) + b12 + 1;
                long reverseBytes = Long.reverseBytes((((g(b8, 30) + b9) * 9) + g(j5, 43) + j6) * j4) + b14;
                long j7 = b11 + b12;
                long g2 = g(j7, 42) + b9;
                long j8 = j7 + b9;
                return (h(((Long.reverseBytes(((g2 + j8) * j4) + ((Long.reverseBytes((j6 + reverseBytes) * j4) + b13) * j4)) + b8 + j8) * j4) + b10 + b14) * j4) + g2;
            }
            long b15 = b(bytes, length - 40);
            long b16 = b(bytes, length - 16) + b(bytes, length - 56);
            long j9 = length;
            long e2 = e(b(bytes, length - 48) + j9, b(bytes, length - 24));
            com.bytedance.applog.sampling.util.a i3 = i(bytes, length - 64, j9, e2);
            com.bytedance.applog.sampling.util.a i4 = i(bytes, length - 32, b16 - 5435081209227447693L, b15);
            long b17 = (b15 * (-5435081209227447693L)) + b(bytes, 0);
            int i5 = (length - 1) & (-64);
            com.bytedance.applog.sampling.util.a aVar = i4;
            com.bytedance.applog.sampling.util.a aVar2 = i3;
            int i6 = 0;
            int i7 = i5;
            while (true) {
                long g3 = g(aVar2.b() + b17 + b16 + b(bytes, i6 + 8), 37) * j;
                long g4 = g(aVar2.a() + b16 + b(bytes, i6 + 48), 42) * j;
                long a2 = g3 ^ aVar.a();
                long b18 = g4 + aVar2.b() + b(bytes, i6 + 40);
                long g5 = g(aVar.b() + e2, 33) * j;
                com.bytedance.applog.sampling.util.a i8 = i(bytes, i6, aVar2.a() * j, aVar.b() + a2);
                aVar = i(bytes, i6 + 32, aVar.a() + g5, b18 + b(bytes, i6 + 16));
                i6 += 64;
                i7 -= 64;
                if (i7 == 0) {
                    return e((h(b18) * (-5435081209227447693L)) + e(i8.b(), aVar.b()) + a2, e(i8.a(), aVar.a()) + g5);
                }
                aVar2 = i8;
                e2 = a2;
                b17 = g5;
                b16 = b18;
                j = -5435081209227447693L;
            }
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static BigInteger d(String str) {
        if (str == null) {
            str = "NULL";
        }
        long c2 = b.c(str);
        return c2 >= 0 ? BigInteger.valueOf(c2) : BigInteger.valueOf(c2 & LocationRequestCompat.PASSIVE_INTERVAL).add(BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL)).add(BigInteger.valueOf(1L));
    }

    private long e(long j, long j2) {
        com.bytedance.applog.sampling.util.a aVar = new com.bytedance.applog.sampling.util.a(j, j2);
        long b2 = (aVar.b() ^ aVar.a()) * (-7070675565921424023L);
        long a2 = ((b2 ^ (b2 >>> 47)) ^ aVar.a()) * (-7070675565921424023L);
        return (a2 ^ (a2 >>> 47)) * (-7070675565921424023L);
    }

    private long f(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private long g(long j, int i) {
        if (i == 0) {
            return j;
        }
        return (j << (64 - i)) | (j >>> i);
    }

    private long h(long j) {
        return j ^ (j >>> 47);
    }

    private com.bytedance.applog.sampling.util.a i(byte[] bArr, int i, long j, long j2) {
        long b2 = b(bArr, i);
        long b3 = b(bArr, i + 8);
        long b4 = b(bArr, i + 16);
        long b5 = b(bArr, i + 24);
        long j3 = j + b2;
        long j4 = b3 + j3 + b4;
        return new com.bytedance.applog.sampling.util.a(j4 + b5, g(j2 + j3 + b5, 21) + g(j4, 44) + j3);
    }

    public static void main(String[] strArr) {
        System.out.println(b.c("a"));
        System.out.println(b.c("abcdefghijkl"));
        System.out.println(b.c("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(b.c("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
        System.out.println(b.c("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
        System.out.println("=======");
        System.out.println(new BigInteger("15778675771769088146").add(new BigInteger("2668068301940463470")).toString());
        System.out.println(new BigInteger("12917804110809363939").add(new BigInteger("5528939962900187677")).toString());
        System.out.println(-1);
        System.out.println(new BigInteger("18446744073709551616").divide(new BigInteger("4")));
        System.out.println(new BigInteger("12917804110809363939").mod(new BigInteger("16000")));
    }
}
