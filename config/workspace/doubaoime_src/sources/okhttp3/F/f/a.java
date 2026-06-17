package okhttp3.F.f;

import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import f.t;
import java.io.IOException;
import java.util.List;
import okhttp3.A;
import okhttp3.B;
import okhttp3.Request;
import okhttp3.k;
import okhttp3.l;
import okhttp3.s;
import okhttp3.u;
import okhttp3.v;

/* loaded from: classes2.dex */
public final class a implements u {
    private final l a;

    public a(l lVar) {
        this.a = lVar;
    }

    @Override // okhttp3.u
    public B a(u.a aVar) throws IOException {
        boolean z;
        f fVar = (f) aVar;
        Request i = fVar.i();
        Request.a newBuilder = i.newBuilder();
        A body = i.body();
        if (body != null) {
            v b = body.b();
            if (b != null) {
                newBuilder.d(DownloadHelper.CONTENT_TYPE, b.toString());
            }
            long a = body.a();
            if (a != -1) {
                newBuilder.d(DownloadUtils.CONTENT_LENGTH, Long.toString(a));
                newBuilder.h(DownloadHelper.TRANSFER_ENCODING);
            } else {
                newBuilder.d(DownloadHelper.TRANSFER_ENCODING, DownloadHelper.VALUE_CHUNKED);
                newBuilder.h(DownloadUtils.CONTENT_LENGTH);
            }
        }
        if (i.header(DownloadConstants.HOST) == null) {
            newBuilder.d(DownloadConstants.HOST, okhttp3.F.c.p(i.url(), false));
        }
        if (i.header("Connection") == null) {
            newBuilder.d("Connection", "Keep-Alive");
        }
        if (i.header(DownloadHelper.ACCEPT_ENCODING) == null && i.header("Range") == null) {
            newBuilder.d(DownloadHelper.ACCEPT_ENCODING, DownloadHelper.GZIP);
            z = true;
        } else {
            z = false;
        }
        List<k> b2 = this.a.b(i.url());
        if (!b2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                k kVar = b2.get(i2);
                sb.append(kVar.b());
                sb.append('=');
                sb.append(kVar.e());
            }
            newBuilder.d("Cookie", sb.toString());
        }
        if (i.header(DownloadConstants.USER_AGENT) == null) {
            newBuilder.d(DownloadConstants.USER_AGENT, "okhttp/3.12.13.20");
        }
        B f2 = fVar.f(newBuilder.b());
        e.d(this.a, i.url(), f2.w());
        B.a G = f2.G();
        G.o(i);
        if (z && DownloadHelper.GZIP.equalsIgnoreCase(f2.p(DownloadHelper.CONTENT_ENCODING)) && e.b(f2)) {
            f.l lVar = new f.l(f2.a().o());
            s.a g2 = f2.w().g();
            g2.d(DownloadHelper.CONTENT_ENCODING);
            g2.d(DownloadUtils.CONTENT_LENGTH);
            G.i(g2.c());
            String p = f2.p(DownloadHelper.CONTENT_TYPE);
            kotlin.s.c.l.g(lVar, "$receiver");
            G.b(new g(p, -1L, new t(lVar)));
        }
        return G.c();
    }
}
