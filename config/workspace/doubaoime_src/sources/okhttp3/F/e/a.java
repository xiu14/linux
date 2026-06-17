package okhttp3.F.e;

import java.io.IOException;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.u;
import okhttp3.x;

/* loaded from: classes2.dex */
public final class a implements u {
    public final x a;

    public a(x xVar) {
        this.a = xVar;
    }

    @Override // okhttp3.u
    public B a(u.a aVar) throws IOException {
        okhttp3.F.f.f fVar = (okhttp3.F.f.f) aVar;
        Request i = fVar.i();
        g j = fVar.j();
        return fVar.g(i, j, j.h(this.a, aVar, !i.method().equals("GET")), j.d());
    }
}
