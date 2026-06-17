package bytekn.foundation.io.file;

import java.util.Arrays;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0014a f1231c = new C0014a(null);
    private byte[] a;
    private int b;

    /* renamed from: bytekn.foundation.io.file.a$a, reason: collision with other inner class name */
    public static final class C0014a {
        public C0014a(kotlin.s.c.g gVar) {
        }
    }

    public a(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(e.a.a.a.a.j("Negative initial size: ", i).toString());
        }
        this.a = new byte[i];
    }

    protected final byte[] a() {
        return this.a;
    }

    protected final int b() {
        return this.b;
    }

    public final byte[] c() {
        byte[] copyOf = Arrays.copyOf(this.a, this.b);
        kotlin.s.c.l.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public final void d(byte[] bArr, int i, int i2) {
        kotlin.s.c.l.g(bArr, com.heytap.mcssdk.liquid.b.a);
        if (i >= 0 && i <= bArr.length && i2 >= 0) {
            int i3 = i + i2;
            if (i3 - bArr.length <= 0) {
                int i4 = this.b + i2;
                byte[] bArr2 = this.a;
                if (i4 - bArr2.length > 0) {
                    int length = bArr2.length << 1;
                    if (length - i4 < 0) {
                        length = i4;
                    }
                    if (length - 2147483639 > 0) {
                        if (!(i4 >= 0)) {
                            throw new IllegalStateException("out of memory!".toString());
                        }
                        length = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, length);
                    kotlin.s.c.l.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                    this.a = copyOf;
                }
                kotlin.collections.g.h(bArr, this.a, this.b, i, i3);
                this.b += i2;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public String toString() {
        return this.a.toString();
    }
}
