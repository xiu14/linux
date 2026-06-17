package bytekn.foundation.encryption;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public abstract class b {
    private final byte[] a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private long f1226c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1227d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1228e;

    public b(int i, int i2) {
        this.f1227d = i;
        this.f1228e = i2;
        this.a = new byte[i];
    }

    protected abstract void a(byte[] bArr);

    protected abstract byte[] b(long j);

    protected abstract void c();

    protected abstract void d(byte[] bArr);

    public final byte[] e() {
        byte[] bArr = new byte[this.f1228e];
        l.g(bArr, "out");
        byte[] b = b(this.f1226c);
        int i = 0;
        while (i < b.length) {
            int i2 = this.f1227d;
            int i3 = this.b;
            byte[] bArr2 = this.a;
            l.g(b, "src");
            l.g(bArr2, "dst");
            int i4 = (i2 - i3) + i;
            g.h(b, bArr2, i3, i, i4);
            d(this.a);
            this.b = 0;
            i = i4;
        }
        a(bArr);
        c();
        l.g(bArr, "bytes");
        return bArr;
    }

    public final int f() {
        return this.f1227d;
    }

    public final b g(byte[] bArr, int i, int i2) {
        l.g(bArr, RemoteMessageConst.DATA);
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(this.f1227d - this.b, i3);
            byte[] bArr2 = this.a;
            int i4 = this.b;
            l.g(bArr, "src");
            l.g(bArr2, "dst");
            int i5 = min + i;
            g.h(bArr, bArr2, i4, i, i5);
            i3 -= min;
            int i6 = this.b + min;
            this.b = i6;
            int i7 = this.f1227d;
            if (i6 >= i7) {
                this.b = i6 - i7;
                d(this.a);
            }
            i = i5;
        }
        this.f1226c += i2;
        return this;
    }
}
