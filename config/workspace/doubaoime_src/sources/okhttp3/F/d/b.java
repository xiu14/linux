package okhttp3.F.d;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.vivo.push.PushClient;
import f.g;
import f.t;
import f.x;
import java.io.IOException;
import kotlin.s.c.l;
import okhttp3.B;
import okhttp3.F.d.d;
import okhttp3.F.f.f;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.s;
import okhttp3.u;

/* loaded from: classes2.dex */
public final class b implements u {
    final e a;

    public b(e eVar) {
        this.a = eVar;
    }

    static boolean b(String str) {
        return DownloadUtils.CONTENT_LENGTH.equalsIgnoreCase(str) || DownloadHelper.CONTENT_ENCODING.equalsIgnoreCase(str) || DownloadHelper.CONTENT_TYPE.equalsIgnoreCase(str);
    }

    static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || DownloadHelper.TRANSFER_ENCODING.equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static B d(B b) {
        if (b == null || b.a() == null) {
            return b;
        }
        B.a G = b.G();
        G.b(null);
        return G.c();
    }

    @Override // okhttp3.u
    public B a(u.a aVar) throws IOException {
        x b;
        e eVar = this.a;
        B e2 = eVar != null ? eVar.e(((f) aVar).i()) : null;
        f fVar = (f) aVar;
        d a = new d.a(System.currentTimeMillis(), fVar.i(), e2).a();
        Request request = a.a;
        B b2 = a.b;
        e eVar2 = this.a;
        if (eVar2 != null) {
            eVar2.b(a);
        }
        if (e2 != null && b2 == null) {
            okhttp3.F.c.g(e2.a());
        }
        if (request == null && b2 == null) {
            B.a aVar2 = new B.a();
            aVar2.o(fVar.i());
            aVar2.m(Protocol.HTTP_1_1);
            aVar2.f(TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
            aVar2.j("Unsatisfiable Request (only-if-cached)");
            aVar2.b(okhttp3.F.c.f10498c);
            aVar2.p(-1L);
            aVar2.n(System.currentTimeMillis());
            return aVar2.c();
        }
        if (request == null) {
            B.a G = b2.G();
            G.d(d(b2));
            return G.c();
        }
        try {
            B f2 = fVar.f(request);
            if (f2 == null && e2 != null) {
            }
            if (b2 != null) {
                if (f2.l() == 304) {
                    B.a G2 = b2.G();
                    s w = b2.w();
                    s w2 = f2.w();
                    s.a aVar3 = new s.a();
                    int i = w.i();
                    for (int i2 = 0; i2 < i; i2++) {
                        String e3 = w.e(i2);
                        String k = w.k(i2);
                        if ((!"Warning".equalsIgnoreCase(e3) || !k.startsWith(PushClient.DEFAULT_REQUEST_ID)) && (b(e3) || !c(e3) || w2.d(e3) == null)) {
                            okhttp3.F.a.a.b(aVar3, e3, k);
                        }
                    }
                    int i3 = w2.i();
                    while (r0 < i3) {
                        String e4 = w2.e(r0);
                        if (!b(e4) && c(e4)) {
                            okhttp3.F.a.a.b(aVar3, e4, w2.k(r0));
                        }
                        r0++;
                    }
                    G2.i(aVar3.c());
                    G2.p(f2.P());
                    G2.n(f2.M());
                    G2.d(d(b2));
                    G2.k(d(f2));
                    B c2 = G2.c();
                    f2.a().close();
                    this.a.a();
                    this.a.f(b2, c2);
                    return c2;
                }
                okhttp3.F.c.g(b2.a());
            }
            B.a G3 = f2.G();
            G3.d(d(b2));
            G3.k(d(f2));
            B c3 = G3.c();
            if (this.a != null) {
                if (okhttp3.F.f.e.b(c3) && d.a(c3, request)) {
                    c d2 = this.a.d(c3);
                    if (d2 == null || (b = d2.b()) == null) {
                        return c3;
                    }
                    g o = c3.a().o();
                    l.g(b, "$receiver");
                    a aVar4 = new a(this, o, d2, new f.s(b));
                    String p = c3.p(DownloadHelper.CONTENT_TYPE);
                    long d3 = c3.a().d();
                    B.a G4 = c3.G();
                    l.g(aVar4, "$receiver");
                    G4.b(new okhttp3.F.f.g(p, d3, new t(aVar4)));
                    return G4.c();
                }
                String method = request.method();
                if (((method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE")) ? 1 : 0) != 0) {
                    try {
                        this.a.c(request);
                    } catch (IOException unused) {
                    }
                }
            }
            return c3;
        } finally {
            if (e2 != null) {
                okhttp3.F.c.g(e2.a());
            }
        }
    }
}
