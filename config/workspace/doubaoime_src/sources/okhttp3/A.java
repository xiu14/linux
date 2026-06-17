package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class A {
    public static A c(v vVar, String str) {
        Charset charset = okhttp3.F.c.i;
        if (vVar != null) {
            Charset a = vVar.a();
            if (a == null) {
                vVar = v.d(vVar + "; charset=utf-8");
            } else {
                charset = a;
            }
        }
        return d(vVar, str.getBytes(charset));
    }

    public static A d(v vVar, byte[] bArr) {
        int length = bArr.length;
        okhttp3.F.c.f(bArr.length, 0, length);
        return new z(vVar, length, bArr, 0);
    }

    public long a() throws IOException {
        return -1L;
    }

    public abstract v b();

    public abstract void e(f.f fVar) throws IOException;
}
