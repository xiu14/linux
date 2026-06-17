package f.B;

import f.h;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final h b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10035c = 0;

    static {
        h.a aVar = h.f10046e;
        b = h.a.b(new byte[0]);
    }

    public static final h a(String str) {
        l.g(str, "$receiver");
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.s("Unexpected hex string: ", str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((c(str.charAt(i2)) << 4) + c(str.charAt(i2 + 1)));
        }
        return new h(bArr);
    }

    public static final String b(h hVar) {
        l.g(hVar, "$receiver");
        char[] cArr = new char[hVar.d().length * 2];
        int i = 0;
        for (byte b2 : hVar.d()) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    private static final int c(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                throw new IllegalArgumentException(e.a.a.a.a.i("Unexpected hex digit: ", c2));
            }
        }
        return (c2 - c3) + 10;
    }

    public static final h d() {
        return b;
    }
}
