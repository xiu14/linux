package okhttp3.internal.http2;

import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import f.t;
import f.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.B;
import okhttp3.D;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.internal.http2.k;
import okhttp3.s;
import okhttp3.u;
import okhttp3.x;

/* loaded from: classes2.dex */
public final class e implements okhttp3.F.f.c {

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f10629f = okhttp3.F.c.r(WsConstants.KEY_CONNECTION, "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f10630g = okhttp3.F.c.r(WsConstants.KEY_CONNECTION, "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final u.a a;
    final okhttp3.F.e.g b;

    /* renamed from: c, reason: collision with root package name */
    private final f f10631c;

    /* renamed from: d, reason: collision with root package name */
    private k f10632d;

    /* renamed from: e, reason: collision with root package name */
    private final Protocol f10633e;

    class a extends f.j {
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        long f10634c;

        a(z zVar) {
            super(zVar);
            this.b = false;
            this.f10634c = 0L;
        }

        private void d(IOException iOException) {
            if (this.b) {
                return;
            }
            this.b = true;
            e eVar = e.this;
            eVar.b.o(false, eVar, this.f10634c, iOException);
        }

        @Override // f.z
        public long b0(f.e eVar, long j) throws IOException {
            try {
                long b0 = a().b0(eVar, j);
                if (b0 > 0) {
                    this.f10634c += b0;
                }
                return b0;
            } catch (IOException e2) {
                d(e2);
                throw e2;
            }
        }

        @Override // f.j, f.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            d(null);
        }
    }

    public e(x xVar, u.a aVar, okhttp3.F.e.g gVar, f fVar) {
        this.a = aVar;
        this.b = gVar;
        this.f10631c = fVar;
        List<Protocol> p = xVar.p();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f10633e = p.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.F.f.c
    public void a() throws IOException {
        ((k.a) this.f10632d.g()).close();
    }

    @Override // okhttp3.F.f.c
    public void b(Request request) throws IOException {
        if (this.f10632d != null) {
            return;
        }
        boolean z = request.body() != null;
        s headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.i() + 4);
        arrayList.add(new b(b.f10614f, request.method()));
        arrayList.add(new b(b.f10615g, okhttp3.F.f.h.a(request.url())));
        String header = request.header(DownloadConstants.HOST);
        if (header != null) {
            arrayList.add(new b(b.i, header));
        }
        arrayList.add(new b(b.h, request.url().y()));
        int i = headers.i();
        for (int i2 = 0; i2 < i; i2++) {
            f.h c2 = f.h.c(headers.e(i2).toLowerCase(Locale.US));
            if (!f10629f.contains(c2.t())) {
                arrayList.add(new b(c2, headers.k(i2)));
            }
        }
        k I = this.f10631c.I(arrayList, z);
        this.f10632d = I;
        k.c cVar = I.i;
        long h = ((okhttp3.F.f.f) this.a).h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.g(h, timeUnit);
        this.f10632d.j.g(((okhttp3.F.f.f) this.a).k(), timeUnit);
    }

    @Override // okhttp3.F.f.c
    public D c(B b) throws IOException {
        okhttp3.F.e.g gVar = this.b;
        gVar.f10527f.t(gVar.f10526e);
        String p = b.p(DownloadHelper.CONTENT_TYPE);
        long a2 = okhttp3.F.f.e.a(b);
        a aVar = new a(this.f10632d.h());
        kotlin.s.c.l.g(aVar, "$receiver");
        return new okhttp3.F.f.g(p, a2, new t(aVar));
    }

    @Override // okhttp3.F.f.c
    public void cancel() {
        k kVar = this.f10632d;
        if (kVar != null) {
            kVar.f(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.F.f.c
    public B.a d(boolean z) throws IOException {
        s n = this.f10632d.n();
        Protocol protocol = this.f10633e;
        s.a aVar = new s.a();
        int i = n.i();
        okhttp3.F.f.j jVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            String e2 = n.e(i2);
            String k = n.k(i2);
            if (e2.equals(":status")) {
                jVar = okhttp3.F.f.j.a("HTTP/1.1 " + k);
            } else if (!f10630g.contains(e2)) {
                okhttp3.F.a.a.b(aVar, e2, k);
            }
        }
        if (jVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        B.a aVar2 = new B.a();
        aVar2.m(protocol);
        aVar2.f(jVar.b);
        aVar2.j(jVar.f10541c);
        aVar2.i(aVar.c());
        if (z && okhttp3.F.a.a.d(aVar2) == 100) {
            return null;
        }
        return aVar2;
    }

    @Override // okhttp3.F.f.c
    public void e() throws IOException {
        this.f10631c.v.flush();
    }

    @Override // okhttp3.F.f.c
    public f.x f(Request request, long j) {
        return this.f10632d.g();
    }
}
