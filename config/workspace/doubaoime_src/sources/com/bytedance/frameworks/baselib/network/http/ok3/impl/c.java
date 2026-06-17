package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.ttnet.tnc.TNCManager;
import com.huawei.hms.framework.common.BundleUtil;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.A;
import okhttp3.B;
import okhttp3.InterfaceC0836d;
import okhttp3.Request;
import okhttp3.v;
import okhttp3.x;
import okhttp3.y;

/* loaded from: classes.dex */
public class c extends com.bytedance.frameworks.baselib.network.http.impl.b implements WeakHandler.IHandler {

    /* renamed from: g, reason: collision with root package name */
    x f5156g;
    Request h;
    B i;
    InterfaceC0836d j;
    volatile k k;

    public c(com.bytedance.retrofit2.client.Request request) {
        super(request);
        this.f5156g = null;
        this.k = null;
        try {
            com.bytedance.frameworks.baselib.network.http.b bVar = this.b;
            bVar.x = 1;
            bVar.B.put("hc", "SsOkHttp3Client");
            this.b.B.put("hcv", o.l());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.b.y = o.h();
        this.b.z = o.g();
        com.bytedance.frameworks.baselib.network.http.b bVar2 = this.b;
        RetrofitMetrics retrofitMetrics = bVar2.f5083d;
        retrofitMetrics.f5994g = bVar2.y;
        retrofitMetrics.h = bVar2.z;
        new WeakHandler(com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c.n().i().getLooper(), this);
        String url = this.a.getUrl();
        this.k = new k(this.b, o.e());
        this.k.G(url, this.a.getMethod());
    }

    private void J(com.bytedance.retrofit2.client.Request request, com.bytedance.frameworks.baselib.network.http.b bVar, Map<String, String> map) {
        okhttp3.o oVar;
        String e2;
        Objects.requireNonNull(bVar.f5083d);
        long nanoTime = System.nanoTime();
        try {
            x.b l = this.f5156g.l();
            if (bVar.f5082c != 0) {
                l.l(true);
            }
            int i = com.bytedance.frameworks.baselib.network.http.f.v;
            long j = 15000;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            l.d(j, timeUnit);
            l.o(j, timeUnit);
            l.s(j, timeUnit);
            l.n(o.m());
            l.j(com.bytedance.frameworks.baselib.network.http.p.c.c());
            com.bytedance.frameworks.baselib.network.http.c cVar = bVar.f5082c;
            if (cVar != null) {
                long j2 = cVar.b;
                if (j2 > 0) {
                    l.d(j2, timeUnit);
                }
                long j3 = cVar.f5088d;
                if (j3 > 0) {
                    l.s(j3, timeUnit);
                }
                long j4 = cVar.f5087c;
                if (j4 > 0) {
                    l.o(j4, timeUnit);
                }
                this.k.H(cVar);
            }
            String url = request.getUrl();
            String str = null;
            if (this.f5156g.h() != null) {
                x xVar = this.f5156g;
                Request.a aVar = new Request.a();
                aVar.g(url);
                aVar.j(url);
                oVar = this.f5156g.h().a(xVar.m(aVar.b()));
            } else {
                oVar = null;
            }
            l.k(new i(oVar, this.k));
            this.f5156g = l.c();
            ArrayList arrayList = new ArrayList();
            if (!request.isBypassDispatch()) {
                try {
                    url = L(url, request.getMethod(), arrayList);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            ArrayList arrayList2 = new ArrayList();
            long uptimeMillis = SystemClock.uptimeMillis();
            com.bytedance.frameworks.baselib.network.http.ok3.impl.p.b bVar2 = new com.bytedance.frameworks.baselib.network.http.ok3.impl.p.b();
            String a = com.bytedance.frameworks.baselib.network.http.ok3.impl.p.c.b().a(url, request, bVar2, arrayList2);
            bVar2.f5199e = SystemClock.uptimeMillis() - uptimeMillis;
            this.k.u(bVar2);
            boolean isEmpty = arrayList2.isEmpty();
            List<com.bytedance.retrofit2.client.b> list = arrayList2;
            if (isEmpty) {
                list = request.getHeaders();
            }
            String h = com.bytedance.frameworks.baselib.network.http.p.c.h(o.e(), a, list);
            Request.a aVar2 = new Request.a();
            aVar2.g(h);
            aVar2.j(h);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.bytedance.retrofit2.client.b bVar3 = (com.bytedance.retrofit2.client.b) it2.next();
                aVar2.a(bVar3.a(), bVar3.b());
            }
            if (Logger.debug()) {
                aVar2.a("fallback-reason", o.i(request));
            }
            if (r.c0(request.getMethod())) {
                String method = request.getMethod();
                com.bytedance.retrofit2.mime.i body = request.getBody();
                A requestBody = request.getRequestBody();
                if (requestBody == null) {
                    requestBody = body == null ? A.c(null, "body=null") : new b(v.d(body.a()), body);
                }
                aVar2.f(method, requestBody);
            } else {
                aVar2.f(request.getMethod(), null);
            }
            if (request.getBody() != null && !request.isPureRequest() && (e2 = request.getBody().e()) != null) {
                aVar2.a("X-SS-STUB", e2);
            }
            aVar2.a(DownloadHelper.ACCEPT_ENCODING, DownloadHelper.GZIP);
            for (com.bytedance.retrofit2.client.b bVar4 : list) {
                if (!com.bytedance.android.input.k.b.a.Y(bVar4.a()) && !com.bytedance.android.input.k.b.a.Y(bVar4.b())) {
                    if (DownloadConstants.USER_AGENT.equals(bVar4.a())) {
                        str = bVar4.b();
                    }
                    aVar2.d(bVar4.a(), bVar4.b());
                }
            }
            if (com.bytedance.android.input.k.b.a.Y(str)) {
                str = com.bytedance.frameworks.baselib.network.http.f.k();
                if (!com.bytedance.android.input.k.b.a.Y(str)) {
                    str = str + " " + o.l();
                    aVar2.d(DownloadConstants.USER_AGENT, str);
                }
            }
            if (com.bytedance.android.input.k.b.a.Y(str)) {
                str = o.f();
                if (!TextUtils.isEmpty(str)) {
                    aVar2.d(DownloadConstants.USER_AGENT, str);
                }
            }
            try {
                bVar.B.put("ua", str);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        aVar2.a(key, value);
                    }
                }
            }
            Request b = aVar2.b();
            this.h = b;
            this.j = this.f5156g.m(b);
            try {
                bVar.r = new URL(h);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            RetrofitMetrics retrofitMetrics = bVar.f5083d;
            retrofitMetrics.a = bVar.r;
            retrofitMetrics.m(nanoTime);
        } catch (Throwable th) {
            bVar.f5083d.m(nanoTime);
            throw th;
        }
    }

    private void K(com.bytedance.frameworks.baselib.network.http.b bVar) {
        long j = -1;
        try {
            Objects.requireNonNull(bVar.f5083d);
            j = System.nanoTime();
            this.f5156g = o.d();
        } finally {
            bVar.f5083d.n(j);
        }
    }

    private String L(String str, String str2, List<com.bytedance.retrofit2.client.b> list) throws Exception {
        String sb;
        if (com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().l()) {
            if (Logger.debug()) {
                Logger.d("Ok3SsCall", "fallback to host replace map");
            }
            long currentTimeMillis = System.currentTimeMillis();
            String j = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().j(str);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (str.equals(j) || !com.bytedance.frameworks.baselib.network.http.p.l.a(j)) {
                return str;
            }
            this.k.t(this.a.getMethod(), j, currentTimeMillis2 - currentTimeMillis, true, null);
            return j;
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.d c2 = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().c(new com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.k(str, str2, list));
        long currentTimeMillis4 = System.currentTimeMillis();
        if (c2 == null) {
            return str;
        }
        this.k.t(this.a.getMethod(), c2.a, currentTimeMillis4 - currentTimeMillis3, false, c2.f5213c);
        if (str.equals(c2.a)) {
            return str;
        }
        if (!c2.a.isEmpty() || c2.b.isEmpty()) {
            return com.bytedance.frameworks.baselib.network.http.p.l.a(c2.a) ? c2.a : str;
        }
        this.k.F(c2.f5214d);
        StringBuilder M = e.a.a.a.a.M("ERR_TTNET_TRAFFIC_CONTROL_DROP");
        if (c2.f5214d == -555) {
            sb = "";
        } else {
            StringBuilder M2 = e.a.a.a.a.M(BundleUtil.UNDERLINE_TAG);
            M2.append(-c2.f5214d);
            sb = M2.toString();
        }
        M.append(sb);
        M.append(", ");
        M.append(c2.f5214d);
        throw new Exception(M.toString());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected boolean a() {
        return this.f5130c;
    }

    @Override // com.bytedance.retrofit2.client.d
    public void cancel() {
        InterfaceC0836d interfaceC0836d = this.j;
        if (interfaceC0836d == null || ((y) interfaceC0836d).isCanceled()) {
            return;
        }
        this.k.a();
        ((y) this.j).cancel();
        this.f5131d = true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected IOException d(Exception exc) {
        if (exc instanceof com.bytedance.retrofit2.T.c) {
            com.bytedance.retrofit2.T.c cVar = (com.bytedance.retrofit2.T.c) exc;
            String url = this.a.getUrl();
            com.bytedance.frameworks.baselib.network.http.b bVar = this.b;
            cVar.a(false, true, url, bVar.G, bVar);
            return cVar;
        }
        com.bytedance.retrofit2.T.c cVar2 = new com.bytedance.retrofit2.T.c(exc.getMessage(), exc);
        String url2 = this.a.getUrl();
        com.bytedance.frameworks.baselib.network.http.b bVar2 = this.b;
        cVar2.a(false, true, url2, bVar2.G, bVar2);
        return cVar2;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void f(RetrofitMetrics retrofitMetrics) throws IOException {
        if (this.j != null) {
            long u = retrofitMetrics.u();
            try {
                this.i = ((y) this.j).c();
                this.k.I(this.i);
            } finally {
                retrofitMetrics.t(u);
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected Context h() {
        return o.e();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected int i(IOException iOException) {
        return okhttp3.G.e.c(iOException);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public InputStream j() {
        B b = this.i;
        if (b == null || b.a() == null) {
            return null;
        }
        return this.i.a().a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public int k() {
        B b = this.i;
        if (b != null) {
            return b.l();
        }
        return 0;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public String l(String str) {
        B b = this.i;
        if (b != null) {
            return b.p(str);
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public InputStream m() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public String n() {
        v h;
        B b = this.i;
        if (b == null || b.a() == null || (h = this.i.a().h()) == null) {
            return null;
        }
        return h.toString();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public boolean o() {
        return DownloadHelper.GZIP.equalsIgnoreCase(this.i.p(DownloadHelper.CONTENT_ENCODING));
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public long p() {
        B b = this.i;
        if (b == null || b.a() == null) {
            return 0L;
        }
        return this.i.a().d();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public String q() {
        B b = this.i;
        if (b != null) {
            return b.A();
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public boolean r() {
        B b = this.i;
        if (b == null || b.h() == null) {
            return false;
        }
        return this.i.D() == null || this.i.l() == 304;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public void s() {
        B b = this.i;
        if (b != null && b.a() != null) {
            com.bytedance.frameworks.baselib.network.http.parser.e.k(this.i.a());
        }
        InterfaceC0836d interfaceC0836d = this.j;
        if (interfaceC0836d != null) {
            ((y) interfaceC0836d).cancel();
        }
    }

    @Override // com.bytedance.retrofit2.client.d
    public boolean setThrottleNetSpeed(long j) {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public Map<String, List<String>> t() {
        B b = this.i;
        if (b != null) {
            return b.w().j();
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void v() throws IOException {
        int i = o.m;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void w(com.bytedance.frameworks.baselib.network.http.b bVar, com.bytedance.frameworks.baselib.network.http.impl.g gVar) {
        super.w(bVar, gVar);
        if (o.j() != null) {
            ((TNCManager) o.j()).o(this.h, this.i);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void x(Exception exc) {
        if (o.j() != null) {
            ((TNCManager) o.j()).p(this.h, exc);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void y(com.bytedance.retrofit2.mime.h hVar) {
        if (this.a.isResponseStreaming() || !(hVar instanceof com.bytedance.retrofit2.mime.f)) {
            return;
        }
        this.b.f5083d.F0.f5887c.c();
        try {
            com.bytedance.frameworks.baselib.network.http.o.b.j().p(this.i, this.a.getUrl(), ((com.bytedance.retrofit2.mime.f) hVar).k());
        } catch (Throwable unused) {
        }
        this.b.f5083d.K();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void z(String str, com.bytedance.retrofit2.client.Request request, com.bytedance.frameworks.baselib.network.http.b bVar, Map<String, String> map) throws IOException {
        try {
            try {
                bVar.f5083d.N();
                K(bVar);
                J(request, bVar, map);
            } catch (Exception e2) {
                throw com.bytedance.retrofit2.T.c.b(e2, str, bVar.G, bVar);
            }
        } finally {
            bVar.f5083d.M();
        }
    }
}
