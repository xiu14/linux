package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.h;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends com.bytedance.frameworks.baselib.network.http.a implements ICronetClient.ICronetBootFailureCheckerProvider, ICronetClient.ICronetThreadStackOptFailureCheckerProvider {
    private static volatile int a = 0;
    private static Context b = null;

    /* renamed from: c, reason: collision with root package name */
    private static ICronetClient f5114c = null;

    /* renamed from: d, reason: collision with root package name */
    private static volatile k f5115d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f5116e = true;

    /* renamed from: f, reason: collision with root package name */
    private static volatile String f5117f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile String f5118g;
    private static ConcurrentHashMap<String, Integer> h = new ConcurrentHashMap<>();
    private static Map<String, Integer> i = new ConcurrentHashMap();
    private static volatile ICronetAppProvider j;
    private static a k;
    private static b l;
    private static c m;
    private static d n;

    public interface a {
        boolean isCronetBootFailureExpected();
    }

    public interface b {
        boolean e();
    }

    public interface c {
    }

    public interface d {
    }

    private k(Context context) {
        b = context.getApplicationContext();
    }

    public static void D(String str, String str2) throws Exception {
        c();
        f5114c.setBestHostWithRouteSelectionName(str, str2);
    }

    public static void E(boolean z) {
        f5116e = z;
    }

    public static void G(ICronetAppProvider iCronetAppProvider) {
        j = iCronetAppProvider;
    }

    public static void H(a aVar) {
        k = aVar;
    }

    public static void I(b bVar) {
        l = bVar;
    }

    public static void J(c cVar) {
        m = cVar;
    }

    public static void K(d dVar) {
        n = dVar;
    }

    private static void T() {
        if (f5114c == null) {
            String str = com.bytedance.android.input.k.b.a.Y("") ? "org.chromium.CronetClient" : "";
            Logger.w("SsCronetHttpClient", "tryResolveImpl:" + str);
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof ICronetClient) {
                    f5114c = (ICronetClient) newInstance;
                }
            } catch (Throwable th) {
                Logger.w("SsCronetHttpClient", "load CronetClient exception: " + th);
            }
        }
    }

    public static void V(JSONObject jSONObject, SharedPreferences sharedPreferences) {
        if (jSONObject != null) {
            a = jSONObject.optInt("cronet_inputstream_buff_size", 0);
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("post_body_buffer_size");
                if (optJSONObject != null) {
                    Z(optJSONObject);
                    f5117f = optJSONObject.toString();
                } else {
                    h.clear();
                    f5117f = "";
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("path_cronet_inputstream_buff_size");
                if (optJSONObject2 != null) {
                    String jSONObject2 = optJSONObject2.toString();
                    if (f5118g != null && jSONObject2.equals(f5118g)) {
                        return;
                    }
                    Y(optJSONObject2);
                    f5118g = jSONObject2;
                } else {
                    i.clear();
                    f5118g = "";
                }
            } catch (Throwable unused) {
            }
        }
        if (sharedPreferences != null) {
            a = sharedPreferences.getInt("cronet_inputstream_buff_size", 0);
            String string = sharedPreferences.getString("post_body_buffer_size", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    Z(new JSONObject(string));
                } catch (Throwable unused2) {
                }
            }
            String string2 = sharedPreferences.getString("path_cronet_inputstream_buff_size", "");
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            try {
                Y(new JSONObject(string2));
            } catch (Throwable unused3) {
            }
        }
    }

    public static TTDispatchResult X(String str, int i2, boolean z) throws Exception {
        c();
        return f5114c.ttUrlDispatch(str, i2, z);
    }

    private static void Y(JSONObject jSONObject) {
        i.clear();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                int optInt = jSONObject.optInt(next);
                if (optInt > 0 && optInt <= 20971520) {
                    i.put(next, Integer.valueOf(optInt));
                }
            }
        }
    }

    private static void Z(JSONObject jSONObject) {
        h.clear();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            int optInt = jSONObject.optInt(next);
            if (!TextUtils.isEmpty(next) && t(optInt)) {
                h.put(next, Integer.valueOf(optInt));
            }
        }
    }

    private static void c() {
        if (f5114c == null) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    public static Context f() {
        return b;
    }

    protected static int g(String str, com.bytedance.frameworks.baselib.network.http.b bVar) {
        Integer num;
        if (s(a)) {
            return a;
        }
        if (!TextUtils.isEmpty(str) && !i.isEmpty() && i.containsKey(str) && (num = i.get(str)) != null && s(num.intValue())) {
            return num.intValue();
        }
        if (bVar != null && bVar.f5082c != 0) {
            if (s(0)) {
                Objects.requireNonNull(bVar.f5082c);
            } else {
                Objects.requireNonNull(bVar.f5082c);
            }
        }
        return 0;
    }

    public static int h(HttpURLConnection httpURLConnection) {
        return f5114c.getCronetInternalErrorCode(httpURLConnection);
    }

    protected static int i(String str, int i2) {
        if (!t(i2)) {
            i2 = 0;
        }
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        if (h.containsKey(str)) {
            Integer num = h.get(str);
            i2 = num == null ? 0 : num.intValue();
        }
        if (t(i2)) {
            return i2;
        }
        return 0;
    }

    public static d j() {
        return n;
    }

    public static String k() throws Exception {
        c();
        return f5114c.getCronetVersion();
    }

    public static boolean m() {
        return f5116e;
    }

    public static k r(Context context) {
        if (f5115d == null) {
            synchronized (k.class) {
                if (f5115d == null) {
                    f5115d = new k(context);
                    T();
                }
            }
        }
        return f5115d;
    }

    protected static boolean s(int i2) {
        return i2 >= 8192 && i2 <= 20971520;
    }

    protected static boolean t(int i2) {
        return i2 >= 16384 && i2 <= 10485760;
    }

    public static void u(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) throws Exception {
        c();
        f5114c.notifyStoreRegionUpdated(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public static void w(SharedPreferences.Editor editor) {
        editor.putInt("cronet_inputstream_buff_size", a);
        if (f5117f != null) {
            editor.putString("post_body_buffer_size", f5117f);
        }
        if (f5118g != null) {
            editor.putString("path_cronet_inputstream_buff_size", f5118g);
        }
    }

    protected static HttpURLConnection x(String str, com.bytedance.frameworks.baselib.network.http.b bVar) throws IOException {
        T();
        ICronetClient iCronetClient = f5114c;
        if (iCronetClient == null) {
            throw new IllegalArgumentException("CronetClient is null");
        }
        iCronetClient.setCronetBootFailureCheckerProvider(f5115d);
        f5114c.setCronetThreadStackOptFailureCheckerProvider(f5115d);
        ICronetClient iCronetClient2 = f5114c;
        Context context = b;
        b bVar2 = l;
        return iCronetClient2.openConnection(context, str, bVar2 == null ? false : bVar2.e(), com.bytedance.frameworks.baselib.network.http.f.k(), bVar, j);
    }

    public void A(String str) throws Exception {
        c();
        f5114c.reportNetDiagnosisUserLog(str);
    }

    public void B(boolean z) {
        if (f5114c != null && com.bytedance.frameworks.baselib.network.http.p.i.c(b)) {
            f5114c.runInBackGround(z);
        }
    }

    public void C(long j2) throws Exception {
        c();
        f5114c.setAlogFuncAddr(j2);
    }

    public void F() {
        c();
        f5114c.setCookieInitCompleted();
    }

    public void L(String str) throws Exception {
        c();
        f5114c.setHostResolverRules(str);
    }

    public void M(String str) throws Exception {
        c();
        f5114c.setProxy(str);
    }

    public void N(JSONObject jSONObject) throws Exception {
        c();
        f5114c.setSlaSamplingSetting(jSONObject);
    }

    public void O(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) throws Exception {
        c();
        f5114c.setZstdFuncAddr(j2, j3, j4, j5, j6, j7, j8, j9);
    }

    public void P(String[] strArr, int i2, long j2) {
        c();
        f5114c.startThrottle(strArr, i2, j2);
    }

    public void Q(String[] strArr, int i2) {
        c();
        f5114c.stopThrottle(strArr, i2);
    }

    public void R(boolean z) {
        if (f5114c != null && com.bytedance.frameworks.baselib.network.http.p.i.c(b)) {
            f5114c.triggerGetDomain(z);
        }
    }

    public void S(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ICronetAppProvider iCronetAppProvider) {
        T();
        ICronetClient iCronetClient = f5114c;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureCheckerProvider(this);
            f5114c.setCronetThreadStackOptFailureCheckerProvider(this);
            f5114c.tryCreateCronetEngine(b, z, z2, z3, z4, com.bytedance.frameworks.baselib.network.http.f.k(), z5, iCronetAppProvider);
        }
    }

    public void U(String[] strArr, int i2, int i3) throws Exception {
        c();
        f5114c.tryStartNetDetect(strArr, i2, i3);
    }

    public void W(String str, int i2, String str2, Map<String, String> map) throws Exception {
        c();
        f5114c.ttDnsResolve(str, i2, str2, map);
    }

    @Override // com.bytedance.retrofit2.client.a
    public com.bytedance.retrofit2.client.d a(Request request) throws IOException {
        h.a b2;
        List<String> list;
        com.bytedance.retrofit2.mime.i body = request.getBody();
        if (body instanceof com.bytedance.retrofit2.mime.c) {
            com.bytedance.retrofit2.mime.c cVar = (com.bytedance.retrofit2.mime.c) body;
            cVar.l(request);
            Request.a newBuilder = request.newBuilder();
            newBuilder.c(cVar);
            request = newBuilder.a();
        }
        Request d2 = com.bytedance.frameworks.baselib.network.e.d.e().d(request);
        if (d2 != null) {
            request = d2;
        }
        if (!h.d().e() || request.getUrl().contains("no_retry=1") || (b2 = h.d().b(request)) == null || (list = b2.b) == null || list.size() < 2) {
            return new g(request);
        }
        request.getMetrics().F0.f5889e.a = true;
        return new com.bytedance.frameworks.baselib.network.http.cronet.impl.d(request, b2);
    }

    public void b(String[] strArr, byte[] bArr, byte[] bArr2, long j2, long j3, boolean z) {
        if (f5114c == null) {
            return;
        }
        if (z || com.bytedance.frameworks.baselib.network.http.p.i.c(b)) {
            f5114c.addClientOpaqueData(strArr, bArr, bArr2, j2, j3);
        }
    }

    public void d(boolean z) {
        if (f5114c == null) {
            return;
        }
        if (z || com.bytedance.frameworks.baselib.network.http.p.i.c(b)) {
            f5114c.clearClientOpaqueData();
        }
    }

    public void e(boolean z, String str, String str2, String str3, boolean z2, String str4) throws Exception {
        c();
        f5114c.enableTTBizHttpDns(z, str, str2, str3, z2, str4);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetThreadStackOptFailureCheckerProvider
    public String getThreadStackInitReason() {
        c cVar = m;
        if (cVar == null) {
            return null;
        }
        return ((com.bytedance.ttnet.config.g) cVar).b();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureCheckerProvider
    public boolean isCronetBootFailureExpected() {
        a aVar = k;
        if (aVar == null) {
            return false;
        }
        return aVar.isCronetBootFailureExpected();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetThreadStackOptFailureCheckerProvider
    public boolean isCronetThreadStackOptFailureExpected() {
        c cVar = m;
        if (cVar == null) {
            return false;
        }
        return ((com.bytedance.ttnet.config.g) cVar).d();
    }

    public int l() throws Exception {
        c();
        return f5114c.getEffectiveConnectionType();
    }

    public Map<String, i> n() throws Exception {
        c();
        return f5114c.getGroupRttEstimates();
    }

    public void o(String str) {
        c();
        f5114c.getMappingRequestState(str);
    }

    public i p() throws Exception {
        c();
        return f5114c.getNetworkQuality();
    }

    public j q(int i2) throws Exception {
        c();
        return f5114c.getPacketLossRateMetrics(i2);
    }

    public void v(String str, String str2, String str3, String str4, String str5, String str6) throws Exception {
        c();
        f5114c.notifyTNCConfigUpdated(str, str2, str3, str4, str5, str6);
    }

    public void y(String str, Map<String, String> map) throws Exception {
        c();
        f5114c.preconnectUrl(str, map);
    }

    public void z(String str, boolean z) {
        if (f5114c == null) {
            return;
        }
        if (z || com.bytedance.frameworks.baselib.network.http.p.i.c(b)) {
            f5114c.removeClientOpaqueData(str);
        }
    }
}
