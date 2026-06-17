package okhttp3.internal.http2;

import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final f.h f10612d = f.h.c(Constants.COLON_SEPARATOR);

    /* renamed from: e, reason: collision with root package name */
    public static final f.h f10613e = f.h.c(":status");

    /* renamed from: f, reason: collision with root package name */
    public static final f.h f10614f = f.h.c(":method");

    /* renamed from: g, reason: collision with root package name */
    public static final f.h f10615g = f.h.c(":path");
    public static final f.h h = f.h.c(":scheme");
    public static final f.h i = f.h.c(":authority");
    public final f.h a;
    public final f.h b;

    /* renamed from: c, reason: collision with root package name */
    final int f10616c;

    public b(f.h hVar, String str) {
        this(hVar, f.h.c(str));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public String toString() {
        return okhttp3.F.c.o("%s: %s", this.a.t(), this.b.t());
    }

    public b(f.h hVar, f.h hVar2) {
        this.a = hVar;
        this.b = hVar2;
        this.f10616c = hVar.f() + 32 + hVar2.f();
    }
}
