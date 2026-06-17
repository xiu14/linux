package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.o.b;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.vivo.push.PushClient;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c extends com.bytedance.frameworks.baselib.network.http.impl.b {
    protected static volatile boolean i = true;
    protected static volatile boolean j = false;
    private static volatile boolean k = false;

    /* renamed from: g, reason: collision with root package name */
    protected volatile int f5098g;
    private volatile long h;

    c(Request request) {
        super(request);
        this.f5098g = 0;
        this.h = 0L;
        try {
            com.bytedance.frameworks.baselib.network.http.b bVar = this.b;
            bVar.x = 0;
            bVar.B.put("hc", "SsCronetHttpClient");
            this.b.B.put("hcv", k.k());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void N() {
        k = true;
    }

    private int O(Request request) {
        return k.g(request.getPath(), this.b);
    }

    private static String P(com.bytedance.retrofit2.mime.i iVar) {
        if (!(iVar instanceof com.bytedance.retrofit2.mime.a)) {
            return iVar.e();
        }
        com.bytedance.retrofit2.mime.a aVar = (com.bytedance.retrofit2.mime.a) iVar;
        if (TextUtils.isEmpty(aVar.f())) {
            return iVar.e();
        }
        String h = aVar.h();
        if (TextUtils.isEmpty(h)) {
            Logger.e("BaseCronetSsCall", "Request compress body md5 shouldn't be null.");
        }
        return h;
    }

    private static void Q(Request request) {
        com.bytedance.retrofit2.client.b firstHeader;
        JSONObject jSONObject;
        if (request.getMetrics() == null || (firstHeader = request.getFirstHeader("x-bd-content-encoding")) == null || TextUtils.isEmpty(firstHeader.b()) || (jSONObject = request.getMetrics().q0) == null) {
            return;
        }
        try {
            jSONObject.put("encode", firstHeader.b());
            jSONObject.put("disableReason", TTRequestCompressManager.DisableCompress.REMOVE_ENCODING.getReason());
        } catch (JSONException unused) {
        }
    }

    private static void R(long j2, long j3, int i2, long j4, Request request, TTRequestCompressManager.a aVar) {
        if (request.getMetrics() == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("beforeSize", j2);
            if (i2 != 0) {
                jSONObject.put("disableReason", i2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (aVar == null) {
            request.getMetrics().q0 = jSONObject;
            return;
        }
        try {
            if (!TextUtils.isEmpty(aVar.b)) {
                jSONObject.put("type", aVar.b);
                jSONObject.put("afterSize", j3);
            }
            int i3 = aVar.f6025c;
            if (i3 != 0) {
                jSONObject.put("disableReason", i3);
                if ((aVar.f6025c == TTRequestCompressManager.DisableCompress.GZIP_PREFIX_MISMATCH.getReason() || aVar.f6025c == TTRequestCompressManager.DisableCompress.ZSTD_PREFIX_MISMATCH.getReason()) && !TextUtils.isEmpty(aVar.f6026d)) {
                    jSONObject.put("prefix", aVar.f6026d);
                }
            }
            jSONObject.put("duration", System.currentTimeMillis() - j4);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        request.getMetrics().q0 = jSONObject;
    }

    public static void T(boolean z) {
        i = z;
    }

    public static void U(boolean z) {
        j = z;
    }

    private static String V(com.bytedance.retrofit2.mime.i iVar, Request request) {
        if (!(iVar instanceof com.bytedance.retrofit2.mime.a)) {
            return null;
        }
        com.bytedance.retrofit2.mime.a aVar = (com.bytedance.retrofit2.mime.a) iVar;
        if (!TextUtils.isEmpty(aVar.f())) {
            return aVar.f();
        }
        long length = iVar.length();
        if (!"POST".equalsIgnoreCase(request.getMethod())) {
            R(length, 0L, TTRequestCompressManager.DisableCompress.NON_POST_METHOD.getReason(), 0L, request, null);
            return null;
        }
        com.bytedance.retrofit2.client.b firstHeader = request.getFirstHeader("x-metasec-bp-body-compress");
        if (firstHeader != null && PushClient.DEFAULT_REQUEST_ID.equals(firstHeader.b())) {
            R(length, 0L, TTRequestCompressManager.DisableCompress.USER_DISABLE.getReason(), 0L, request, null);
            return null;
        }
        com.bytedance.retrofit2.client.b firstHeader2 = request.getFirstHeader("content-encoding");
        if (firstHeader2 != null && !TextUtils.isEmpty(firstHeader2.b())) {
            R(length, 0L, TTRequestCompressManager.DisableCompress.BODY_ENCODED.getReason(), 0L, request, null);
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar.j() && TTRequestCompressManager.d()) {
            R(length, 0L, TTRequestCompressManager.DisableCompress.BODY_ENCRYPTED.getReason(), currentTimeMillis, request, null);
            return null;
        }
        String host = request.getHost();
        String path = request.getPath();
        com.bytedance.retrofit2.client.b firstHeader3 = request.getFirstHeader("x-metasec-content-encoding");
        TTRequestCompressManager.a g2 = aVar.g(host, path, firstHeader3 == null ? false : PushClient.DEFAULT_REQUEST_ID.equals(firstHeader3.b()));
        if (g2 == null) {
            R(length, 0L, TTRequestCompressManager.DisableCompress.DATA_NULL.getReason(), currentTimeMillis, request, null);
            return null;
        }
        R(length, iVar.length(), 0, currentTimeMillis, request, g2);
        return g2.b;
    }

    protected void J(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null || this.f5131d) {
            return;
        }
        httpURLConnection.disconnect();
        this.f5131d = true;
        if (this.a.isResponseStreaming()) {
            l a = l.a();
            String url = this.a.getUrl();
            com.bytedance.frameworks.baselib.network.http.b bVar = this.b;
            a.b(url, bVar.t, bVar.u, bVar.F, bVar.A);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0533 A[Catch: all -> 0x05b0, TryCatch #6 {all -> 0x05b0, blocks: (B:48:0x0441, B:49:0x044b, B:52:0x0455, B:55:0x0465, B:58:0x0470, B:60:0x0476, B:63:0x0481, B:65:0x048b, B:66:0x048f, B:78:0x049b, B:80:0x04a1, B:84:0x04ab, B:85:0x04c9, B:88:0x04c5, B:94:0x04ce, B:95:0x04da, B:97:0x04e0, B:99:0x04f3, B:100:0x04f8, B:102:0x0504, B:103:0x0511, B:105:0x051b, B:107:0x0533, B:109:0x0539, B:110:0x0541, B:112:0x0547, B:115:0x055f, B:118:0x0565, B:124:0x0569, B:126:0x05a2, B:139:0x059f, B:140:0x0529, B:141:0x0508, B:143:0x050e, B:147:0x04d7, B:157:0x043e, B:160:0x03ee, B:149:0x03f4, B:152:0x03fc, B:155:0x0420, B:131:0x056d, B:134:0x0575, B:137:0x0592), top: B:159:0x03ee, inners: #3, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0547 A[Catch: all -> 0x05b0, TryCatch #6 {all -> 0x05b0, blocks: (B:48:0x0441, B:49:0x044b, B:52:0x0455, B:55:0x0465, B:58:0x0470, B:60:0x0476, B:63:0x0481, B:65:0x048b, B:66:0x048f, B:78:0x049b, B:80:0x04a1, B:84:0x04ab, B:85:0x04c9, B:88:0x04c5, B:94:0x04ce, B:95:0x04da, B:97:0x04e0, B:99:0x04f3, B:100:0x04f8, B:102:0x0504, B:103:0x0511, B:105:0x051b, B:107:0x0533, B:109:0x0539, B:110:0x0541, B:112:0x0547, B:115:0x055f, B:118:0x0565, B:124:0x0569, B:126:0x05a2, B:139:0x059f, B:140:0x0529, B:141:0x0508, B:143:0x050e, B:147:0x04d7, B:157:0x043e, B:160:0x03ee, B:149:0x03f4, B:152:0x03fc, B:155:0x0420, B:131:0x056d, B:134:0x0575, B:137:0x0592), top: B:159:0x03ee, inners: #3, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x056d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b7 A[Catch: all -> 0x03d7, TRY_LEAVE, TryCatch #9 {all -> 0x03d7, blocks: (B:36:0x0388, B:39:0x0390, B:163:0x03b7), top: B:35:0x0388, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0390 A[Catch: all -> 0x03d7, TRY_ENTER, TryCatch #9 {all -> 0x03d7, blocks: (B:36:0x0388, B:39:0x0390, B:163:0x03b7), top: B:35:0x0388, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03df A[Catch: all -> 0x05b2, TRY_LEAVE, TryCatch #8 {all -> 0x05b2, blocks: (B:3:0x0011, B:5:0x0023, B:6:0x0026, B:9:0x0088, B:11:0x008e, B:12:0x0094, B:14:0x00e2, B:17:0x00f4, B:19:0x00fa, B:20:0x00fe, B:22:0x0104, B:23:0x0108, B:27:0x0173, B:31:0x0217, B:33:0x021b, B:40:0x03db, B:42:0x03df, B:165:0x03d8, B:166:0x0223, B:195:0x0385, B:205:0x0212, B:215:0x01c4, B:231:0x016e, B:247:0x00df, B:259:0x0085, B:207:0x017b, B:210:0x0183, B:213:0x01a6, B:169:0x023b, B:171:0x0241, B:172:0x0285, B:175:0x0297, B:177:0x029b, B:178:0x02c3, B:180:0x02c7, B:181:0x02ee, B:183:0x02f2, B:184:0x0319, B:186:0x031d, B:187:0x033d, B:189:0x0341, B:190:0x0360, B:192:0x0364, B:193:0x0268, B:249:0x0036, B:252:0x003e, B:253:0x0077, B:255:0x007d, B:257:0x005e, B:197:0x01c9, B:200:0x01d1, B:203:0x01f5, B:36:0x0388, B:39:0x0390, B:163:0x03b7, B:239:0x0098, B:242:0x00a0, B:245:0x00c2), top: B:2:0x0011, inners: #0, #1, #2, #7, #9, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0455 A[Catch: all -> 0x05b0, TRY_ENTER, TryCatch #6 {all -> 0x05b0, blocks: (B:48:0x0441, B:49:0x044b, B:52:0x0455, B:55:0x0465, B:58:0x0470, B:60:0x0476, B:63:0x0481, B:65:0x048b, B:66:0x048f, B:78:0x049b, B:80:0x04a1, B:84:0x04ab, B:85:0x04c9, B:88:0x04c5, B:94:0x04ce, B:95:0x04da, B:97:0x04e0, B:99:0x04f3, B:100:0x04f8, B:102:0x0504, B:103:0x0511, B:105:0x051b, B:107:0x0533, B:109:0x0539, B:110:0x0541, B:112:0x0547, B:115:0x055f, B:118:0x0565, B:124:0x0569, B:126:0x05a2, B:139:0x059f, B:140:0x0529, B:141:0x0508, B:143:0x050e, B:147:0x04d7, B:157:0x043e, B:160:0x03ee, B:149:0x03f4, B:152:0x03fc, B:155:0x0420, B:131:0x056d, B:134:0x0575, B:137:0x0592), top: B:159:0x03ee, inners: #3, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04a1 A[Catch: all -> 0x05b0, TRY_LEAVE, TryCatch #6 {all -> 0x05b0, blocks: (B:48:0x0441, B:49:0x044b, B:52:0x0455, B:55:0x0465, B:58:0x0470, B:60:0x0476, B:63:0x0481, B:65:0x048b, B:66:0x048f, B:78:0x049b, B:80:0x04a1, B:84:0x04ab, B:85:0x04c9, B:88:0x04c5, B:94:0x04ce, B:95:0x04da, B:97:0x04e0, B:99:0x04f3, B:100:0x04f8, B:102:0x0504, B:103:0x0511, B:105:0x051b, B:107:0x0533, B:109:0x0539, B:110:0x0541, B:112:0x0547, B:115:0x055f, B:118:0x0565, B:124:0x0569, B:126:0x05a2, B:139:0x059f, B:140:0x0529, B:141:0x0508, B:143:0x050e, B:147:0x04d7, B:157:0x043e, B:160:0x03ee, B:149:0x03f4, B:152:0x03fc, B:155:0x0420, B:131:0x056d, B:134:0x0575, B:137:0x0592), top: B:159:0x03ee, inners: #3, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04e0 A[Catch: all -> 0x05b0, TryCatch #6 {all -> 0x05b0, blocks: (B:48:0x0441, B:49:0x044b, B:52:0x0455, B:55:0x0465, B:58:0x0470, B:60:0x0476, B:63:0x0481, B:65:0x048b, B:66:0x048f, B:78:0x049b, B:80:0x04a1, B:84:0x04ab, B:85:0x04c9, B:88:0x04c5, B:94:0x04ce, B:95:0x04da, B:97:0x04e0, B:99:0x04f3, B:100:0x04f8, B:102:0x0504, B:103:0x0511, B:105:0x051b, B:107:0x0533, B:109:0x0539, B:110:0x0541, B:112:0x0547, B:115:0x055f, B:118:0x0565, B:124:0x0569, B:126:0x05a2, B:139:0x059f, B:140:0x0529, B:141:0x0508, B:143:0x050e, B:147:0x04d7, B:157:0x043e, B:160:0x03ee, B:149:0x03f4, B:152:0x03fc, B:155:0x0420, B:131:0x056d, B:134:0x0575, B:137:0x0592), top: B:159:0x03ee, inners: #3, #10, #11, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void K(com.bytedance.retrofit2.client.Request r19, com.bytedance.frameworks.baselib.network.http.b r20, java.net.HttpURLConnection r21, java.util.Map<java.lang.String, java.lang.String> r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.c.K(com.bytedance.retrofit2.client.Request, com.bytedance.frameworks.baselib.network.http.b, java.net.HttpURLConnection, java.util.Map):void");
    }

    abstract HttpURLConnection L();

    protected HttpURLConnection M(String str, com.bytedance.frameworks.baselib.network.http.b bVar) throws IOException {
        long j2 = -1;
        try {
            Objects.requireNonNull(bVar.f5083d);
            j2 = System.nanoTime();
            return k.x(str, bVar);
        } finally {
            bVar.f5083d.n(j2);
        }
    }

    void S(HttpURLConnection httpURLConnection) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected boolean a() {
        return this.f5130c || k.m();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void b(Request request, Exception exc) throws com.bytedance.frameworks.baselib.network.http.l.d {
        String message = exc.getMessage();
        if (k.m() && !TextUtils.isEmpty(message) && message.contains("net::ERR_INTERNET_DISCONNECTED")) {
            StringBuilder M = e.a.a.a.a.M("network not available for ");
            M.append(this.a.getPath());
            M.append(", message:");
            M.append(message);
            new com.bytedance.frameworks.baselib.network.http.l.d(M.toString()).a(false, true, this.a.getUrl(), "", this.b);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void f(RetrofitMetrics retrofitMetrics) throws IOException {
        long u = retrofitMetrics.u();
        try {
            HttpURLConnection L = L();
            com.bytedance.retrofit2.mime.i body = this.a.getBody();
            if (body != null) {
                body.b(L.getOutputStream());
            }
            this.f5098g = L.getResponseCode();
        } finally {
            retrofitMetrics.t(u);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected Context h() {
        return k.f();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public InputStream j() throws IOException {
        if (L() != null) {
            return L().getInputStream();
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public int k() {
        return this.f5098g;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public String l(String str) {
        if (L() == null) {
            return null;
        }
        String headerField = L().getHeaderField(str);
        return TextUtils.isEmpty(headerField) ? L().getHeaderField(str.toLowerCase()) : headerField;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public InputStream m() {
        if (L() != null) {
            return L().getErrorStream();
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public String n() {
        return l(DownloadHelper.CONTENT_TYPE);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public boolean o() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public long p() {
        if (L() != null) {
            return L().getContentLength();
        }
        return 0L;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public String q() throws IOException {
        return L() != null ? L().getResponseMessage() : "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public boolean r() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public void s() {
        if (L() != null) {
            L().disconnect();
        }
    }

    @Override // com.bytedance.retrofit2.client.d
    public boolean setThrottleNetSpeed(long j2) {
        this.h = j2;
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.g
    public Map<String, List<String>> t() {
        if (L() != null) {
            return L().getHeaderFields();
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void y(com.bytedance.retrofit2.mime.h hVar) {
        if (this.a.isResponseStreaming() || !(hVar instanceof com.bytedance.retrofit2.mime.f)) {
            return;
        }
        this.b.f5083d.F0.f5887c.c();
        try {
            com.bytedance.frameworks.baselib.network.http.o.b.j().o(L(), ((com.bytedance.retrofit2.mime.f) hVar).k(), new b.InterfaceC0257b() { // from class: com.bytedance.frameworks.baselib.network.http.cronet.impl.a
            });
        } catch (Throwable unused) {
        }
        this.b.f5083d.K();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.impl.b
    protected void z(String str, Request request, com.bytedance.frameworks.baselib.network.http.b bVar, Map<String, String> map) throws IOException {
        try {
            try {
                bVar.f5083d.N();
                bVar.b = O(request);
                bVar.a = i && j && bVar.b <= 0 && !request.isResponseStreaming() && request.getMaxLength() <= 0;
                if (Logger.debug()) {
                    Logger.e("BaseCronetSsCall", "url is " + str + " useCronetInputStreamWithTTBuffer: " + bVar.a);
                }
                HttpURLConnection M = M(str, bVar);
                K(request, bVar, M, map);
                S(M);
            } catch (Exception e2) {
                throw com.bytedance.retrofit2.T.c.b(e2, str, bVar.G, bVar);
            }
        } finally {
            bVar.f5083d.M();
        }
    }
}
