package f;

import f.h;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0780a {
    private static final byte[] a;

    static {
        h.a aVar = h.f10046e;
        a = h.a.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").d();
        h.a.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static String a(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = (i & 1) != 0 ? a : null;
        kotlin.s.c.l.g(bArr, "$receiver");
        kotlin.s.c.l.g(bArr3, "map");
        byte[] bArr4 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            int i6 = i5 + 1;
            byte b3 = bArr[i5];
            int i7 = i3 + 1;
            bArr4[i3] = bArr3[(b & 255) >> 2];
            int i8 = i7 + 1;
            bArr4[i7] = bArr3[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr4[i8] = bArr3[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 = i9 + 1;
            bArr4[i9] = bArr3[b3 & 63];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i2];
            int i10 = i3 + 1;
            bArr4[i3] = bArr3[(b4 & 255) >> 2];
            int i11 = i10 + 1;
            bArr4[i10] = bArr3[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr4[i11] = b5;
            bArr4[i11 + 1] = b5;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b6 = bArr[i2];
            byte b7 = bArr[i12];
            int i13 = i3 + 1;
            bArr4[i3] = bArr3[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr4[i13] = bArr3[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr4[i14] = bArr3[(b7 & 15) << 2];
            bArr4[i14 + 1] = (byte) 61;
        }
        kotlin.s.c.l.g(bArr4, "$receiver");
        return new String(bArr4, kotlin.text.c.a);
    }
}
