package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class c extends ByteArrayOutputStream {
    public c(int i) {
        super(i);
    }

    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        l.e(bArr, "buf");
        return bArr;
    }
}
