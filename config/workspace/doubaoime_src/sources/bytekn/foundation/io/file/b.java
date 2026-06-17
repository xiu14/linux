package bytekn.foundation.io.file;

import java.io.InputStream;

/* loaded from: classes.dex */
public class b implements h {
    public InputStream a;

    public int a(byte[] bArr, int i, int i2) {
        kotlin.s.c.l.g(bArr, com.heytap.mcssdk.liquid.b.a);
        InputStream inputStream = this.a;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        kotlin.s.c.l.l("inputStream");
        throw null;
    }

    @Override // bytekn.foundation.io.file.h
    public void close() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.close();
        } else {
            kotlin.s.c.l.l("inputStream");
            throw null;
        }
    }
}
