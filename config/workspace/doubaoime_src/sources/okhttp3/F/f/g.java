package okhttp3.F.f;

import okhttp3.D;
import okhttp3.v;

/* loaded from: classes2.dex */
public final class g extends D {
    private final String a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final f.g f10535c;

    public g(String str, long j, f.g gVar) {
        this.a = str;
        this.b = j;
        this.f10535c = gVar;
    }

    @Override // okhttp3.D
    public long d() {
        return this.b;
    }

    @Override // okhttp3.D
    public v h() {
        String str = this.a;
        if (str != null) {
            return v.d(str);
        }
        return null;
    }

    @Override // okhttp3.D
    public f.g o() {
        return this.f10535c;
    }
}
