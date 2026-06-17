package okhttp3.F.j;

import f.l;
import f.o;
import f.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.F.c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f10571e = {42};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f10572f = new String[0];

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f10573g = {"*"};
    private static final a h = new a();
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final CountDownLatch b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f10574c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f10575d;

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, c.i);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    public static a b() {
        return h;
    }

    private void d() throws IOException {
        InputStream resourceAsStream = a.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        l lVar = new l(o.e(resourceAsStream));
        kotlin.s.c.l.g(lVar, "$receiver");
        t tVar = new t(lVar);
        try {
            byte[] bArr = new byte[tVar.readInt()];
            tVar.readFully(bArr);
            byte[] bArr2 = new byte[tVar.readInt()];
            tVar.readFully(bArr2);
            synchronized (this) {
                this.f10574c = bArr;
                this.f10575d = bArr2;
            }
            this.b.countDown();
        } finally {
            c.g(tVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0037, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0035, code lost:
    
        if (r1 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.j.a.c(java.lang.String):java.lang.String");
    }
}
