package okhttp3;

import java.util.concurrent.TimeUnit;

/* renamed from: okhttp3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0835c {
    private final boolean a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10596c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10597d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10598e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10599f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10600g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    String m;

    static {
        TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
    }

    private C0835c(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.f10596c = i;
        this.f10597d = i2;
        this.f10598e = z3;
        this.f10599f = z4;
        this.f10600g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okhttp3.C0835c j(okhttp3.s r22) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C0835c.j(okhttp3.s):okhttp3.c");
    }

    public boolean a() {
        return this.f10598e;
    }

    public boolean b() {
        return this.f10599f;
    }

    public int c() {
        return this.f10596c;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public boolean f() {
        return this.f10600g;
    }

    public boolean g() {
        return this.a;
    }

    public boolean h() {
        return this.b;
    }

    public boolean i() {
        return this.j;
    }

    public String toString() {
        String str = this.m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            if (this.f10596c != -1) {
                sb.append("max-age=");
                sb.append(this.f10596c);
                sb.append(", ");
            }
            if (this.f10597d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f10597d);
                sb.append(", ");
            }
            if (this.f10598e) {
                sb.append("private, ");
            }
            if (this.f10599f) {
                sb.append("public, ");
            }
            if (this.f10600g) {
                sb.append("must-revalidate, ");
            }
            if (this.h != -1) {
                sb.append("max-stale=");
                sb.append(this.h);
                sb.append(", ");
            }
            if (this.i != -1) {
                sb.append("min-fresh=");
                sb.append(this.i);
                sb.append(", ");
            }
            if (this.j) {
                sb.append("only-if-cached, ");
            }
            if (this.k) {
                sb.append("no-transform, ");
            }
            if (this.l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.m = str;
        }
        return str;
    }
}
