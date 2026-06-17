package bytekn.foundation.encryption;

import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e extends b {
    private static final int[] j;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1229f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f1230g;
    private final int[] h;
    public static final a k = new a(null);
    private static final int[] i = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};

    public static final class a extends c {
        public a(g gVar) {
            super(d.a);
        }
    }

    static {
        int[] iArr = new int[64];
        for (int i2 = 0; i2 < 64; i2++) {
            iArr[i2] = (int) (Math.abs(Math.sin(i2 + 1.0d)) * 4294967296L);
        }
        j = iArr;
    }

    public e() {
        super(64, 16);
        this.f1229f = new int[4];
        this.f1230g = new int[4];
        this.h = new int[16];
        c();
    }

    @Override // bytekn.foundation.encryption.b
    protected void a(byte[] bArr) {
        l.g(bArr, "out");
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = (byte) (this.f1229f[i2 / 4] >>> ((i2 % 4) * 8));
        }
    }

    @Override // bytekn.foundation.encryption.b
    protected byte[] b(long j2) {
        long j3 = 8;
        long f2 = ((j2 + j3) / f()) + 1;
        long j4 = j3 * j2;
        int f3 = (int) ((f2 * f()) - j2);
        byte[] bArr = new byte[f3];
        bArr[0] = (byte) 128;
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[(f3 - 8) + i2] = (byte) (j4 >>> (i2 * 8));
        }
        return bArr;
    }

    @Override // bytekn.foundation.encryption.b
    protected void c() {
        int[] iArr = this.f1229f;
        iArr[0] = 1732584193;
        iArr[1] = (int) 4023233417L;
        iArr[2] = (int) 2562383102L;
        iArr[3] = 271733878;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    @Override // bytekn.foundation.encryption.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void d(byte[] r13) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bytekn.foundation.encryption.e.d(byte[]):void");
    }
}
