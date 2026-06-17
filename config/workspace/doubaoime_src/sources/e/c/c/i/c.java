package e.c.c.i;

import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class c {
    public static b a = null;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f9762c = a("RIFF");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f9763d = a("WEBP");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f9764e = a("VP8 ");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f9765f = a("VP8L");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f9766g = a("VP8X");

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean b(byte[] bArr, int i) {
        return i(bArr, i + 12, f9766g) && ((bArr[i + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i, int i2) {
        return i2 >= 21 && i(bArr, i + 12, f9766g);
    }

    public static boolean d(byte[] bArr, int i) {
        return i(bArr, i + 12, f9766g) && ((bArr[i + 20] & 16) == 16);
    }

    public static boolean e(byte[] bArr, int i) {
        return i(bArr, i + 12, f9765f);
    }

    public static boolean f(byte[] bArr, int i) {
        return i(bArr, i + 12, f9764e);
    }

    public static boolean g(byte[] bArr, int i, int i2) {
        return i2 >= 20 && i(bArr, i, f9762c) && i(bArr, i + 8, f9763d);
    }

    public static b h() {
        if (b) {
            return a;
        }
        b bVar = null;
        try {
            bVar = (b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        b = true;
        return bVar;
    }

    private static boolean i(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
