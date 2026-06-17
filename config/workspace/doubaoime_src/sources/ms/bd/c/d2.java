package ms.bd.c;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class d2 implements Cloneable {
    public long a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f10362c;

    /* renamed from: d, reason: collision with root package name */
    public long f10363d;

    /* renamed from: e, reason: collision with root package name */
    public final c2 f10364e = new c2();

    /* renamed from: f, reason: collision with root package name */
    public long f10365f;

    static {
    }

    public final d2 a() {
        try {
            return (d2) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final Object clone() {
        try {
            return (d2) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        this.f10364e.getClass();
        Locale locale = Locale.US;
        String str = (String) y2.a(16777217, 0, 0L, "f192d1", new byte[]{50, 55, 6, 3, 95, 106, 32, 20, 36, 39, 115, Byte.MAX_VALUE, 15, 85});
        Long valueOf = Long.valueOf(this.a);
        Long valueOf2 = Long.valueOf(this.b);
        Long valueOf3 = Long.valueOf(this.f10362c);
        long j = this.f10363d;
        return String.format(locale, str, valueOf, valueOf2, valueOf3, Long.valueOf(j != 0 ? this.f10365f - j : 0L), this.f10364e);
    }
}
