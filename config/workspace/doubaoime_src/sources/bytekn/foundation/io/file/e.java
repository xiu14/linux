package bytekn.foundation.io.file;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class e implements h {
    public FileOutputStream a;

    public void a() {
        FileOutputStream fileOutputStream = this.a;
        if (fileOutputStream == null) {
            kotlin.s.c.l.l("outputStream");
            throw null;
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }

    public void b(byte[] bArr, int i, int i2) {
        kotlin.s.c.l.g(bArr, "buffer");
        FileOutputStream fileOutputStream = this.a;
        if (fileOutputStream != null) {
            fileOutputStream.write(bArr, i, i2);
        } else {
            kotlin.s.c.l.l("outputStream");
            throw null;
        }
    }

    @Override // bytekn.foundation.io.file.h
    public void close() {
        FileOutputStream fileOutputStream = this.a;
        if (fileOutputStream == null) {
            kotlin.s.c.l.l("outputStream");
            throw null;
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }
}
