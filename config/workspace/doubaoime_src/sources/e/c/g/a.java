package e.c.g;

import e.c.c.d.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {
    public static boolean a(d dVar, InputStream inputStream) {
        try {
            if (dVar != c.a && dVar != c.f9842f && dVar != c.h) {
                if (dVar != c.l && dVar != c.f9839c && dVar != c.k && dVar != c.f9840d && dVar != c.f9841e && dVar != c.i) {
                    if (dVar == c.b) {
                        byte[] bArr = new byte[29];
                        b(29, inputStream, bArr);
                        byte b = bArr[25];
                        if (b != 4 && b != 6) {
                            return false;
                        }
                        return true;
                    }
                    if (dVar == c.j) {
                        int d2 = e.c().d();
                        byte[] bArr2 = new byte[d2];
                        b(d2, inputStream, bArr2);
                        return e.c.c.i.c.d(bArr2, 0);
                    }
                }
                return true;
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    private static int b(int i, InputStream inputStream, byte[] bArr) throws IOException {
        Objects.requireNonNull(inputStream);
        h.a(bArr.length >= i);
        if (!inputStream.markSupported()) {
            return com.bytedance.feedbackerlib.a.w0(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return com.bytedance.feedbackerlib.a.w0(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }
}
