package g.a.c;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public class a extends ByteArrayOutputStream {
    private final int a;

    public a() {
        super(32);
        this.a = 32;
    }

    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    @Override // java.io.ByteArrayOutputStream
    public void reset() {
        super.reset();
        int length = ((ByteArrayOutputStream) this).buf.length;
        int i = this.a;
        if (length > i) {
            ((ByteArrayOutputStream) this).buf = new byte[i];
        }
    }
}
