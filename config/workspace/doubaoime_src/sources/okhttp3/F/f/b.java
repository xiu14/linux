package okhttp3.F.f;

import com.prolificinteractive.materialcalendarview.r;
import f.s;
import f.x;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.s.c.l;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.u;

/* loaded from: classes2.dex */
public final class b implements u {
    private final boolean a;

    static final class a extends f.i {
        long b;

        a(x xVar) {
            super(xVar);
        }

        @Override // f.i, f.x
        public void O(f.e eVar, long j) throws IOException {
            super.O(eVar, j);
            this.b += j;
        }
    }

    public b(boolean z) {
        this.a = z;
    }

    @Override // okhttp3.u
    public B a(u.a aVar) throws IOException {
        B c2;
        f fVar = (f) aVar;
        c e2 = fVar.e();
        okhttp3.F.e.g j = fVar.j();
        okhttp3.F.e.c cVar = (okhttp3.F.e.c) fVar.c();
        Request i = fVar.i();
        long currentTimeMillis = System.currentTimeMillis();
        fVar.d().r(fVar.a());
        e2.b(i);
        fVar.d().q(fVar.a(), i);
        B.a aVar2 = null;
        if (r.c0(i.method()) && i.body() != null) {
            if ("100-continue".equalsIgnoreCase(i.header("Expect"))) {
                e2.e();
                fVar.d().v(fVar.a());
                aVar2 = e2.d(true);
            }
            if (aVar2 == null) {
                fVar.d().p(fVar.a());
                a aVar3 = new a(e2.f(i, i.body().a()));
                l.g(aVar3, "$receiver");
                s sVar = new s(aVar3);
                i.body().e(sVar);
                sVar.close();
                fVar.d().o(fVar.a(), aVar3.b);
            } else if (!cVar.k()) {
                j.i();
            }
        }
        e2.a();
        if (aVar2 == null) {
            fVar.d().v(fVar.a());
            aVar2 = e2.d(false);
        }
        aVar2.o(i);
        aVar2.g(j.d().h());
        aVar2.p(currentTimeMillis);
        aVar2.n(System.currentTimeMillis());
        B c3 = aVar2.c();
        int l = c3.l();
        if (l == 100) {
            B.a d2 = e2.d(false);
            d2.o(i);
            d2.g(j.d().h());
            d2.p(currentTimeMillis);
            d2.n(System.currentTimeMillis());
            c3 = d2.c();
            l = c3.l();
        }
        fVar.d().u(fVar.a(), c3);
        if (this.a && l == 101) {
            B.a G = c3.G();
            G.b(okhttp3.F.c.f10498c);
            c2 = G.c();
        } else {
            B.a G2 = c3.G();
            G2.b(e2.c(c3));
            c2 = G2.c();
        }
        if ("close".equalsIgnoreCase(c2.N().header("Connection")) || "close".equalsIgnoreCase(c2.p("Connection"))) {
            j.i();
        }
        if ((l != 204 && l != 205) || c2.a().d() <= 0) {
            return c2;
        }
        StringBuilder N = e.a.a.a.a.N("HTTP ", l, " had non-zero Content-Length: ");
        N.append(c2.a().d());
        throw new ProtocolException(N.toString());
    }
}
