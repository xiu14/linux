package com.bytedance.ttnet;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.baselib.network.TTNetInitMetrics;
import com.bytedance.frameworks.baselib.network.asynctask.NetworkAsyncTaskType;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.TTNetThreadConfig;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.TTDispatchResult;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.i;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.j;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.impl.SSCookieHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.o;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.retrofit2.C0697a;
import com.bytedance.retrofit2.InterfaceC0698b;
import com.bytedance.retrofit2.J;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.config.TTHttpCallThrottleControl;
import com.bytedance.ttnet.priority.TTHttpCallPriorityControl;
import com.bytedance.ttnet.tnc.TNCManager;
import com.bytedance.ttnet.utils.b;
import com.ss.android.message.log.PushLog;
import java.io.File;
import java.net.CookieHandler;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTNetInit {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DOMAIN_BOE_HTTPS_KEY = "boe_https";
    public static final String DOMAIN_BOE_KEY = "boe";
    public static final String DOMAIN_HTTPDNS_KEY = "httpdns";

    @Deprecated
    public static final String DOMAIN_NETLOG_KEY = "netlog";
    private static final String ENCRYPT_RETRY_HEADER = "x-ttnet-retry-encrypt";
    public static final String ENCRYPT_RETRY_VERIFY_HEADER = "x-tt-e-ignore-status-code-verify";
    private static final int INIT_TIMEOUT_VALUE = 5;
    private static final String OKHTTP_DISPATCH_FAILED = "okhttp dispatch failed.";
    private static final String RETURN_WRONG_FORMAT = "Conversion = 'ttUrlDispatch returns wrong format'";
    private static final String TAG = "TTNetInit";
    private static final String TTNET_CRONET_NOT_INITIALIZED = "cronet not init.";
    private static volatile ENV env = null;
    private static volatile String sClientIPString = null;
    private static long sCookieManagerInitStartTime = 0;
    public static ICronetAppProvider sCronetProvider = null;
    private static volatile int sDelayTime = 10;
    public static Map<String, String> sGetDomainRegionMap;
    private static com.bytedance.ttnet.d sITTNetDepend;
    private static volatile boolean sNotifiedColdStartFinsish;
    private static volatile List<String> sPublicIPv4List;
    private static volatile List<String> sPublicIPv6List;
    public static JSONObject sSlaSamplingSettingObject;
    private static com.bytedance.ttnet.e sSystemApiSandbox;
    private static com.bytedance.ttnet.g sTTNetThreadConfigInfoManager;
    private static volatile CountDownLatch sLatchInitCompleted = new CountDownLatch(1);
    private static volatile boolean sApiHttpInterceptEnabled = false;
    private static volatile boolean sCookieLogReportEnabled = false;
    private static volatile boolean sListenAppStateIndependently = false;
    private static volatile boolean sStateDelayNewStrategyEnabled = false;
    private static volatile boolean sMainThreadInitCookieEnabled = true;
    private static volatile long sMaxHttpDiskCacheSize = 67108864;
    private static volatile int sAppSecurityLevel = 0;
    public static com.bytedance.frameworks.baselib.network.b sLifeCycleMonitor = new com.bytedance.frameworks.baselib.network.b();

    public enum ENV {
        DEBUG,
        RELEASE
    }

    class a extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f6101e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6102f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Context context, boolean z) {
            super(str);
            this.f6101e = context;
            this.f6102f = z;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            if (Logger.debug()) {
                String str = TTNetInit.TAG;
                StringBuilder M = e.a.a.a.a.M("throttle control use new logic ");
                M.append(TTNetInit.sStateDelayNewStrategyEnabled);
                Logger.d(str, M.toString());
            }
            if (TTNetInit.sStateDelayNewStrategyEnabled) {
                SsHttpCall.setThrottleControl(TTHttpCallPriorityControl.f());
            } else {
                SsHttpCall.setThrottleControl(TTHttpCallThrottleControl.l());
            }
            com.bytedance.ttnet.config.b.q(this.f6101e).D();
            com.bytedance.ttnet.config.b.q(this.f6101e).E(TNCManager.TNCUpdateSource.TTSERVER, true);
            TTNetInit.tryInitCookieManager(this.f6101e, this.f6102f, true);
        }
    }

    class b extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f6103e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6104f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f6105g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Context context, boolean z, boolean z2) {
            super(str);
            this.f6103e = context;
            this.f6104f = z;
            this.f6105g = z2;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            com.bytedance.ttnet.config.b.q(this.f6103e).D();
            com.bytedance.ttnet.config.b.q(this.f6103e).E(TNCManager.TNCUpdateSource.TTSERVER, true);
            if (this.f6104f) {
                TTNetInit.tryInitCookieManager(this.f6103e, this.f6105g, false);
            } else {
                com.bytedance.frameworks.baselib.network.http.f.A(true);
                TTNetInit.setCookieInitCompleted();
            }
        }
    }

    class c implements b.a {
        final /* synthetic */ Context a;

        c(Context context) {
            this.a = context;
        }

        @Override // com.bytedance.ttnet.utils.b.a
        public void a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
            int i2 = z ? 1 : 0;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", str2);
                jSONObject2.put(PushLog.KEY_VALUE, i);
                jSONObject2.put(PushLog.KEY_EXT_VALUE, i2);
                jSONObject2.put("extraObject", jSONObject);
                ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).e(this.a, "set_cookie", str, jSONObject2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class d implements f.k {
        final /* synthetic */ h a;

        d(h hVar) {
            this.a = hVar;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.f.j
        public com.bytedance.frameworks.baselib.network.http.h a(Map<String, List<String>> map) {
            return null;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.f.k
        public com.bytedance.frameworks.baselib.network.http.h b(String str, List<com.bytedance.retrofit2.client.b> list, Map<String, List<String>> map) {
            com.bytedance.frameworks.baselib.network.http.h hVar = new com.bytedance.frameworks.baselib.network.http.h(false, false, null);
            try {
                List<String> list2 = map.get(TTNetInit.ENCRYPT_RETRY_VERIFY_HEADER);
                if (list2 != null && !list2.isEmpty()) {
                    String str2 = list2.get(0);
                    if (!com.bytedance.android.input.k.b.a.Y(str2) && str2.startsWith(ExifInterface.GPS_MEASUREMENT_2D)) {
                        h hVar2 = this.a;
                        if (hVar2 != null) {
                            hVar2.a(str, list, map);
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(TTNetInit.ENCRYPT_RETRY_HEADER, str2);
                        return new com.bytedance.frameworks.baselib.network.http.h(true, false, hashMap);
                    }
                }
                return hVar;
            } catch (Throwable th) {
                th.printStackTrace();
                return hVar;
            }
        }
    }

    class e implements SSCookieHandler.b {
        final /* synthetic */ Context a;

        e(Context context) {
            this.a = context;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.impl.SSCookieHandler.b
        public boolean a() {
            return TTNetInit.cookieLogReportEnabled();
        }

        @Override // com.bytedance.frameworks.baselib.network.http.impl.SSCookieHandler.b
        public void b(String str, String str2, JSONObject jSONObject) {
            if (TTNetInit.cookieLogReportEnabled()) {
                ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).e(this.a, str, str2, jSONObject);
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6106c;

        f(Context context, boolean z, boolean z2) {
            this.a = context;
            this.b = z;
            this.f6106c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            TTNetInit.tryInitCookieManager(this.a, this.b, this.f6106c);
        }
    }

    class g extends com.bytedance.frameworks.baselib.network.asynctask.b {
        g(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.bytedance.frameworks.baselib.network.i.a.d("com.ttnet.org.chromium.net.urlconnection.SegmentPool").b("checkAndReleaseIdleSegments");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public interface h {
        void a(String str, List<com.bytedance.retrofit2.client.b> list, Map<String, List<String>> map);
    }

    static {
        TTALog.init();
        env = ENV.RELEASE;
        sNotifiedColdStartFinsish = false;
        sClientIPString = "";
        sCookieManagerInitStartTime = 0L;
    }

    private static void CookieInitFailedReport(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "failed");
            jSONObject.put("exception", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        ((com.bytedance.android.input.ttnet.d) getTTNetDepend()).e(context, "TTNET-COOKIE", "init", jSONObject);
    }

    public static void OnAppActivitySuspend() {
        C0697a.b();
    }

    public static void OnAppActiviyResume() {
        C0697a.c();
    }

    public static com.bytedance.ttnet.j.c TTDnsResolve(String str, int i) throws Exception {
        return TTDnsResolve(str, i, null);
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2, long j, long j2) {
        k.r(context).b(strArr, bArr, bArr2, j, j2, false);
    }

    public static void addClientOpaqueDataV1(Context context, String[] strArr, byte[] bArr, byte[] bArr2, long j, long j2) {
        k.r(context).b(strArr, bArr, bArr2, j, j2, true);
    }

    public static boolean apiHttpInterceptEnabled() {
        return sApiHttpInterceptEnabled;
    }

    public static void clearClientOpaqueData(Context context) {
        k.r(context).d(false);
    }

    public static void clearClientOpaqueDataV1(Context context) {
        k.r(context).d(true);
    }

    private static void clearSharedPreferencesFile(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        context.getSharedPreferences(str, 0).edit().clear().apply();
    }

    public static void clearTNCFileBeforeStart(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        try {
            File file = new File(context.getFilesDir(), "server.json");
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(context.getFilesDir(), "tt_net_config.config");
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Throwable unused) {
        }
        int i = com.bytedance.ttnet.config.b.M;
        clearSharedPreferencesFile(context, "ss_app_config");
        clearSharedPreferencesFile(context, "ttnet_tnc_config");
        clearSharedPreferencesFile(context, "ttnet_store_region");
    }

    public static boolean cookieLogReportEnabled() {
        return sCookieLogReportEnabled;
    }

    private static void countDownInitCompletedLatch() {
        try {
            if (sLatchInitCompleted.getCount() > 0) {
                sLatchInitCompleted.countDown();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Deprecated
    public static List<InetAddress> dnsLookup(String str) throws Exception {
        List<String> list;
        if (!TTNetInitMetrics.k()) {
            throw new IllegalStateException("Cronet engine has not been initialized and completed.");
        }
        com.bytedance.ttnet.j.c TTDnsResolve = TTDnsResolve(str, 0);
        if (TTDnsResolve.a != 0 || (list = TTDnsResolve.b) == null || list.isEmpty()) {
            throw new UnknownHostException(str);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = TTDnsResolve.b.iterator();
        while (it2.hasNext()) {
            byte[] address = InetAddress.getByName(it2.next()).getAddress();
            if (address != null) {
                arrayList.add(InetAddress.getByAddress(str, address));
            }
        }
        if (arrayList.isEmpty()) {
            throw new UnknownHostException(str);
        }
        return arrayList;
    }

    @Deprecated
    public static void doCommand(Context context, String str) {
    }

    public static void enableApiHttpIntercept(boolean z) {
        sApiHttpInterceptEnabled = z;
    }

    public static void enableCookieLogReport(boolean z) {
        sCookieLogReportEnabled = z;
    }

    public static void enableProceedWithoutHook(boolean z) {
        com.bytedance.retrofit2.S.b.e(z);
    }

    public static void enableSsCallUseOkioReadForNoneStream(boolean z) {
        com.bytedance.frameworks.baselib.network.http.impl.b.F(z);
    }

    public static void enableSsCallUseZeroCopyReadForNoneStream(boolean z, int i) {
        com.bytedance.frameworks.baselib.network.http.cronet.impl.c.U(z);
        if (!z || i <= 0) {
            return;
        }
        long j = i * 1000;
        com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).e(new g(j, j));
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (z && (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
            return;
        }
        try {
            k cronetHttpClient = getCronetHttpClient(TTNetInitMetrics.CronetInitMode.BIZ_HTTPDNS_API);
            if (cronetHttpClient != null) {
                cronetHttpClient.e(z, str, str2, str3, z2, str4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void feedBackCronetInitFailedLog(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", i);
            jSONObject.put("exception", str);
            jSONObject.put("model", Build.MODEL);
            String str2 = "";
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null && strArr.length > 0) {
                str2 = Arrays.asList(strArr).toString();
            }
            jSONObject.put("abis", str2);
            Objects.requireNonNull((com.bytedance.android.input.ttnet.d) getTTNetDepend());
            com.bytedance.apm.c.d("cronet_failed", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void forceInitCronetKernel() throws Exception {
        if (TTNetInitMetrics.j().a == TTNetInitMetrics.CronetInitMode.NONE) {
            TTNetInitMetrics.j().a = TTNetInitMetrics.CronetInitMode.FORCE_INIT;
        }
        k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).S(false, false, false, com.bytedance.ttnet.config.b.q(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).e(), true, sCronetProvider);
    }

    @Deprecated
    public static long getALogFuncAddr() {
        return TTALog.getALogFuncAddr();
    }

    public static int getAppSecurityLevel() {
        return sAppSecurityLevel;
    }

    public static String getClientIpString() {
        return sClientIPString;
    }

    private static k getCronetHttpClient(TTNetInitMetrics.CronetInitMode cronetInitMode) throws Exception {
        if (TTNetInitMetrics.j().a == TTNetInitMetrics.CronetInitMode.NONE) {
            TTNetInitMetrics.j().a = cronetInitMode;
        }
        if (!com.bytedance.ttnet.c.c()) {
            return null;
        }
        k r = k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c());
        r.S(false, true, false, com.bytedance.ttnet.config.b.q(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).e(), false, sCronetProvider);
        sSlaSamplingSettingObject = null;
        return r;
    }

    public static ICronetAppProvider getCronetProvider() {
        return sCronetProvider;
    }

    public static int getEffectiveConnectionType() {
        try {
            return k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).l();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static ENV getEnv() {
        return env;
    }

    public static String getGetDomainConfigByRegion(String str) {
        Map<String, String> map = sGetDomainRegionMap;
        if (map == null || map.isEmpty() || sCronetProvider == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return sGetDomainRegionMap.get(str.toLowerCase());
    }

    public static Map<String, i> getGroupRttEstimates() throws Exception {
        return k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).n();
    }

    public static void getInitCompletedLatch() {
        try {
            sLatchInitCompleted.await(5L, TimeUnit.SECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean getListenAppStateIndependently() {
        return sListenAppStateIndependently;
    }

    public static void getMappingRequestState(String str) {
        try {
            k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).o(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static long getMaxHttpDiskCacheSize() {
        return sMaxHttpDiskCacheSize;
    }

    public static i getNetworkQuality() throws Exception {
        return k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).p();
    }

    public static j getPacketLossRateMetrics(int i) throws Exception {
        return k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).q(i);
    }

    public static List<String> getPublicIPv4List() {
        return sPublicIPv4List;
    }

    public static List<String> getPublicIPv6List() {
        return sPublicIPv6List;
    }

    public static JSONObject getSlaSamplingSetting() {
        return sSlaSamplingSettingObject;
    }

    public static boolean getStateDelayNewStrategyEnabled() {
        return sStateDelayNewStrategyEnabled;
    }

    public static com.bytedance.ttnet.e getSystemApiSandbox() {
        return sSystemApiSandbox;
    }

    public static com.bytedance.ttnet.d getTTNetDepend() {
        com.bytedance.ttnet.d dVar = sITTNetDepend;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    public static TTNetThreadConfig.a getThreadConfigCallbackImpl() {
        if (sTTNetThreadConfigInfoManager == null) {
            return null;
        }
        throw null;
    }

    public static List<TTNetThreadConfig> getThreadConfigInfoList() {
        if (sTTNetThreadConfigInfoManager == null) {
            return null;
        }
        throw null;
    }

    public static void monitorLogSend(String str, JSONObject jSONObject) {
        com.bytedance.ttnet.d dVar = sITTNetDepend;
        if (dVar != null) {
            Objects.requireNonNull((com.bytedance.android.input.ttnet.d) dVar);
            com.bytedance.apm.c.d(str, jSONObject);
        }
    }

    public static void notifyColdStartFinish() {
        if (sITTNetDepend == null || sNotifiedColdStartFinsish) {
            return;
        }
        sNotifiedColdStartFinsish = true;
        Objects.requireNonNull((com.bytedance.android.input.ttnet.d) sITTNetDepend);
    }

    public static void onClientIPChanged(String str) {
        if (str != null) {
            sClientIPString = str;
        }
    }

    public static void onPublicIPsChanged(List<String> list, List<String> list2) {
        sPublicIPv4List = list;
        sPublicIPv6List = list2;
    }

    public static void preInitCronetKernel() throws Exception {
        int i = -1;
        try {
            if (getCronetHttpClient(TTNetInitMetrics.CronetInitMode.PRE_INIT) == null) {
                i = o.h();
                feedBackCronetInitFailedLog(i, "");
            }
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                i = 3;
            }
            String b2 = com.bytedance.ttnet.utils.d.b(th);
            if (b2.length() > 1024) {
                b2 = b2.substring(0, 1024);
            }
            feedBackCronetInitFailedLog(i, b2);
            TNCManager.e().i();
            throw th;
        }
    }

    public static void preconnectUrl(String str) throws Exception {
        preconnectUrl(str, null);
    }

    public static void removeClientOpaqueData(Context context, String str) {
        k.r(context).z(str, false);
    }

    public static void removeClientOpaqueDataV1(Context context, String str) {
        k.r(context).z(str, true);
    }

    public static void runInBackGround(Context context, boolean z) {
        k.r(context).B(z);
    }

    @Deprecated
    public static void setALogFuncAddr(long j) throws Exception {
    }

    public static void setAppSecurityLevel(int i) {
        sAppSecurityLevel = i;
    }

    public static void setBypassOfflineCheck(boolean z) {
        k.E(z);
    }

    public static void setCookieHandler(Context context) {
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null && (cookieHandler instanceof SSCookieHandler)) {
                com.bytedance.frameworks.baselib.network.http.f.A(true);
                setCookieInitCompleted();
                return;
            }
            if (sCookieManagerInitStartTime <= 0) {
                com.bytedance.frameworks.baselib.network.http.f.A(true);
                setCookieInitCompleted();
                return;
            }
            if (TTNetInitMetrics.j().i == 0) {
                TTNetInitMetrics.j().i = System.nanoTime();
            }
            CookieManager cookieManager = null;
            try {
                cookieManager = CookieManager.getInstance();
            } catch (Throwable th) {
                sDelayTime = 0;
                CookieInitFailedReport(context, th.getMessage());
            }
            CookieManager cookieManager2 = cookieManager;
            int i = sDelayTime;
            Objects.requireNonNull(getTTNetDepend());
            CookieHandler.setDefault(new SSCookieHandler(context, i, cookieManager2, null, new e(context)));
            com.bytedance.frameworks.baselib.network.http.f.A(true);
            setCookieInitCompleted();
            TTNetInitMetrics.j().j = System.nanoTime();
        } catch (Throwable th2) {
            CookieInitFailedReport(context, th2.getMessage());
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setCookieInitCompleted() {
        try {
            k cronetHttpClient = getCronetHttpClient(TTNetInitMetrics.CronetInitMode.COOKIE_INIT_COMPLETE_API);
            if (cronetHttpClient != null) {
                cronetHttpClient.F();
            }
        } catch (Throwable unused) {
        }
    }

    public static void setCronetDepend(ICronetAppProvider iCronetAppProvider) {
        if (iCronetAppProvider == null) {
            throw new IllegalArgumentException("cronetDepend is null");
        }
        sCronetProvider = iCronetAppProvider;
        TNCManager.m(iCronetAppProvider);
        com.bytedance.ttnet.k.a.f().h(iCronetAppProvider);
        k.G(iCronetAppProvider);
        o.n(com.bytedance.ttnet.k.a.f());
    }

    public static void setDelayTime(int i) {
        sDelayTime = i;
    }

    @Deprecated
    public static void setEnableURLDispatcher(boolean z) throws Exception {
    }

    public static void setEnv(ENV env2) {
        env = env2;
    }

    public static void setFirstRequestWaitTime(long j) {
    }

    public static void setGetDomainRegionMap(Map<String, String> map) {
        if (map == null) {
            throw new IllegalArgumentException("getDomainRegionMap is null");
        }
        sGetDomainRegionMap = map;
    }

    @Deprecated
    public static void setHostResolverRulesForTesting(String str) throws Exception {
        k cronetHttpClient = getCronetHttpClient(TTNetInitMetrics.CronetInitMode.DEPRECATED_API);
        if (cronetHttpClient != null) {
            cronetHttpClient.L(str);
        }
    }

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) throws Exception {
    }

    public static void setListenAppStateIndependently(boolean z) {
        sListenAppStateIndependently = z;
    }

    public static void setMainThreadInitCookieEnabled(boolean z) {
        sMainThreadInitCookieEnabled = z;
    }

    public static void setMaxHttpDiskCacheSize(long j) {
        if (j > 0) {
            sMaxHttpDiskCacheSize = j;
        }
    }

    public static void setMonitorProcessHookV2(f.i<com.bytedance.ttnet.i.b> iVar) {
        com.bytedance.frameworks.baselib.network.http.f.I(iVar);
    }

    public static void setProcessFlag(int i) {
        com.bytedance.frameworks.baselib.network.http.p.i.d(i);
    }

    public static void setProxy(String str) throws Exception {
        if (TTNetInitMetrics.k()) {
            k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).M(str);
        } else {
            o.o(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c());
            o.s(str);
        }
    }

    public static void setRetryEncryptedRequestEnabled(h hVar) {
        com.bytedance.frameworks.baselib.network.http.f.b(ENCRYPT_RETRY_VERIFY_HEADER, new d(hVar));
    }

    public static void setSlaSamplingSetting(Context context, JSONObject jSONObject) {
        try {
            if (Logger.debug()) {
                Logger.d(TAG, "setSlaSamplingSetting");
            }
            k.r(context).N(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
            sSlaSamplingSettingObject = jSONObject;
        }
    }

    public static void setStateDelayNewStrategyEnabled(boolean z) {
        sStateDelayNewStrategyEnabled = z;
    }

    public static void setSystemApiSandbox(com.bytedance.ttnet.e eVar) {
        sSystemApiSandbox = eVar;
    }

    public static void setTTNetDepend(com.bytedance.ttnet.d dVar) {
        sITTNetDepend = dVar;
        HashMap hashMap = (HashMap) ((com.bytedance.android.input.ttnet.d) getTTNetDepend()).d();
        if (TextUtils.isEmpty((CharSequence) hashMap.get(DOMAIN_HTTPDNS_KEY)) || (TextUtils.isEmpty((CharSequence) hashMap.get(DOMAIN_BOE_KEY)) && TextUtils.isEmpty((CharSequence) hashMap.get(DOMAIN_BOE_HTTPS_KEY)))) {
            sITTNetDepend = null;
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        Object obj = sITTNetDepend;
        if (obj instanceof com.bytedance.ttnet.b) {
            Objects.requireNonNull((com.bytedance.ttnet.b) obj);
            setAppSecurityLevel(sAppSecurityLevel | 1);
        }
        com.bytedance.ttnet.d dVar2 = sITTNetDepend;
        if (dVar2 instanceof InterfaceC0698b) {
            RetrofitMetrics.J0 = (InterfaceC0698b) dVar2;
        }
        com.bytedance.ttnet.i.b.q();
        com.bytedance.frameworks.baselib.network.http.p.c.g((String) hashMap.get(DOMAIN_BOE_KEY));
        com.bytedance.frameworks.baselib.network.http.p.c.f((String) hashMap.get(DOMAIN_BOE_HTTPS_KEY));
        com.bytedance.ttnet.k.a.f().i(dVar);
    }

    public static void setTTNetThreadConfigInfoManager(com.bytedance.ttnet.g gVar) {
    }

    public static void setZstdFuncAddr(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) throws Exception {
        k cronetHttpClient = getCronetHttpClient(TTNetInitMetrics.CronetInitMode.ZSTD_API);
        if (cronetHttpClient != null) {
            if (Logger.debug()) {
                StringBuilder Q = e.a.a.a.a.Q(" createDCtxAddr:", j, " decompressStreamAddr:");
                Q.append(j2);
                Q.append(" freeDctxAddr:");
                Q.append(j3);
                Q.append(" isErrorAddr:");
                Q.append(j4);
                Q.append(" createDDictAddr:");
                Q.append(j5);
                Q.append(" dctxRefDDictAddr:");
                Q.append(j6);
                Q.append(" freeDDictAddr:");
                Q.append(j7);
                Q.append(" dctxResetAddr:");
                Q.append(j8);
                Logger.d("TTNet_ZSTD", Q.toString());
            }
            cronetHttpClient.O(j, j2, j3, j4, j5, j6, j7, j8);
        }
    }

    public static void trigerGetDomain(Context context) {
        triggerGetDomain(context, false);
    }

    public static void triggerGetDomain(Context context, boolean z) {
        k.r(context).R(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tryInitCookieManager(Context context, boolean z, boolean z2) {
        if (Logger.debug()) {
            Logger.d(TAG, "tryInitCookieManager needSetCookieHandler:" + z + ", isMain:" + z2);
        }
        try {
            sCookieManagerInitStartTime = System.currentTimeMillis();
            if (z) {
                if (TTNetInitMetrics.j().i == 0) {
                    TTNetInitMetrics.j().i = System.nanoTime();
                }
                CookieSyncManager.createInstance(context);
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                setCookieHandler(context);
                if (Logger.debug()) {
                    Logger.d("Process", " CookieManager = " + cookieManager.toString() + " pid = " + Process.myPid());
                }
            } else {
                com.bytedance.frameworks.baselib.network.http.f.A(true);
                setCookieInitCompleted();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (com.bytedance.frameworks.baselib.network.http.p.i.c(context) && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                if (sMainThreadInitCookieEnabled) {
                    new Handler(Looper.getMainLooper()).post(new f(context, z, z2));
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(WsConstants.KEY_CONNECTION_ERROR, th.getMessage());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.bytedance.ttnet.d dVar = sITTNetDepend;
                if (dVar != null) {
                    Objects.requireNonNull((com.bytedance.android.input.ttnet.d) dVar);
                    com.bytedance.apm.c.d("async_init_cookie_manager_fail", jSONObject);
                }
                CookieInitFailedReport(context, th.getMessage());
            }
        }
        ClientKeyManager.j().b(z2);
    }

    public static void tryInitTTNet(Context context, Application application, f.b<com.bytedance.ttnet.i.b> bVar, f.h<com.bytedance.ttnet.i.b> hVar, f.e eVar, boolean z, boolean... zArr) {
        TTNetInitMetrics.j().f5009d = System.currentTimeMillis();
        TTNetInitMetrics.j().f5010e = System.nanoTime();
        if (context == null) {
            throw new IllegalArgumentException("tryInitTTNet context is null");
        }
        boolean z2 = true;
        try {
            Reflect.on(Class.forName("com.bytedance.crash.Npth").newInstance()).call("registerSdk", new Class[]{Integer.TYPE, String.class}, 2616, "4.2.243.8-doubao");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (ENV.RELEASE != getEnv()) {
            Logger.d("ttnet_debug_mode", "debug_mode open");
            if ("true".equals(context.getSharedPreferences("ttnet_debug_setting", 0).getString("log_switcher", null))) {
                Logger.setLogLevel(2);
                J.b(Logger.getLogLevel());
            }
        } else {
            Logger.d("ttnet_debug_mode", "debug_mode close");
        }
        J.b(Logger.getLogLevel());
        com.bytedance.frameworks.baselib.network.http.f.v(bVar);
        com.bytedance.ttnet.i.b.q();
        KevaBuilder.getInstance().setContext(context);
        boolean z3 = (zArr == null || zArr.length <= 0) ? false : zArr[0];
        boolean c2 = com.bytedance.frameworks.baselib.network.http.p.i.c(context);
        if (c2) {
            new a("NetWork-AsyncInit", context, z).a();
        } else {
            if (!z3) {
                String a2 = com.bytedance.frameworks.baselib.network.http.p.i.a(context);
                if (!(a2 != null && (a2.endsWith(":push") || a2.endsWith(":pushservice")))) {
                    z2 = false;
                }
            }
            new b("NetWork-AsyncInit-other", context, z2, z).a();
        }
        com.bytedance.ttnet.f.a();
        TNCManager.e().n(context, c2);
        com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().q(context);
        com.bytedance.ttnet.config.b.q(context);
        TTNetInitMetrics.j().i(context);
        com.bytedance.frameworks.baselib.network.http.f.H(hVar);
        countDownInitCompletedLatch();
        if (!c2) {
            TTNetInitMetrics.j().b = false;
            TTNetInitMetrics.j().h = System.nanoTime();
            return;
        }
        com.bytedance.frameworks.baselib.network.http.f.y(eVar);
        if (com.bytedance.ttnet.utils.b.a() == null) {
            com.bytedance.ttnet.utils.b.d(new c(context));
        }
        sLifeCycleMonitor.c(com.bytedance.frameworks.baselib.network.e.e.f());
        if (application != null) {
            application.registerActivityLifecycleCallbacks(sLifeCycleMonitor);
        }
        if (!com.bytedance.ttnet.c.c()) {
            Log.d(TAG, "cronet disable");
            notifyColdStartFinish();
        }
        TTNetInitMetrics.j().h = System.nanoTime();
    }

    public static void trySetDefaultUserAgent(String str) {
        com.bytedance.frameworks.baselib.network.http.f.C(str);
    }

    public static boolean tryStartTTNetDetect(String[] strArr, int i, int i2) {
        if (strArr != null && strArr.length > 0 && i > 0 && i <= 180 && i2 >= 0) {
            try {
                k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).U(strArr, i, i2);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static TTDispatchResult ttUrlDispatch(String str) throws Exception {
        return ttUrlDispatchInternal(str, -1, true);
    }

    private static TTDispatchResult ttUrlDispatchInternal(String str, int i, boolean z) throws Exception {
        if (!com.bytedance.ttnet.config.b.q(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).f()) {
            com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.d c2 = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().c(new com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.k(str, null, null));
            if (c2 != null) {
                return new TTDispatchResult(str, c2.a, String.valueOf(com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().d()), com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.k().g(), TTDispatchResult.DispatchState.SUCCESS, "");
            }
            throw new IllegalArgumentException(OKHTTP_DISPATCH_FAILED);
        }
        if (!TTNetInitMetrics.k()) {
            throw new IllegalStateException(TTNET_CRONET_NOT_INITIALIZED);
        }
        try {
            new URL(str).toURI();
            return k.X(str, i, z);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static TTDispatchResult ttUrlDispatchV2(String str, int i) {
        return ttUrlDispatchV2(str, i, true);
    }

    @Deprecated
    public static boolean urlDispatchEnabled() {
        return true;
    }

    public static void useCustomizedCookieStoreName() {
        com.bytedance.frameworks.baselib.network.http.impl.h.g();
    }

    public static com.bytedance.ttnet.j.c TTDnsResolve(String str, int i, Map<String, String> map) throws Exception {
        if (TTNetInitMetrics.k()) {
            return com.bytedance.ttnet.j.a.c().b(str, i, map);
        }
        throw new IllegalStateException("Cronet engine has not been initialized and completed.");
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        k.r(context).b(strArr, bArr, bArr2, 0L, 0L, false);
    }

    public static void addClientOpaqueDataV1(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        k.r(context).b(strArr, bArr, bArr2, 0L, 0L, true);
    }

    public static void preconnectUrl(String str, Map<String, String> map) throws Exception {
        if (!TTNetInitMetrics.k()) {
            throw new IllegalStateException("Cronet engine has not been initialized and completed.");
        }
        try {
            new URL(str).toURI();
            k.r(((com.bytedance.android.input.ttnet.d) getTTNetDepend()).c()).y(str, map);
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static TTDispatchResult ttUrlDispatchV2(String str, int i, boolean z) {
        try {
            new URL(str).toURI();
            try {
                return ttUrlDispatchInternal(str, i, z);
            } catch (Exception e2) {
                String message = e2.getMessage();
                if ((e2 instanceof IllegalArgumentException) && OKHTTP_DISPATCH_FAILED.equals(message)) {
                    return new TTDispatchResult(str, TTDispatchResult.DispatchState.OKHTTP_DISPATCH_FAILED, e2);
                }
                boolean z2 = e2 instanceof IllegalStateException;
                return (z2 && TTNET_CRONET_NOT_INITIALIZED.equals(message)) ? new TTDispatchResult(str, TTDispatchResult.DispatchState.CRONET_NOT_INIT, e2) : ((e2 instanceof UnsupportedOperationException) && "CronetEngine has not been initialized.".equals(message)) ? new TTDispatchResult(str, TTDispatchResult.DispatchState.CRONET_NOT_INIT, e2) : (z2 && "Engine is shut down.".equals(message)) ? new TTDispatchResult(str, TTDispatchResult.DispatchState.CRONET_NOT_INIT, e2) : ((e2 instanceof UnknownFormatConversionException) && RETURN_WRONG_FORMAT.equals(message)) ? new TTDispatchResult(str, TTDispatchResult.DispatchState.WRONG_FORMAT, e2) : ((e2 instanceof URISyntaxException) || (e2 instanceof MalformedURLException)) ? new TTDispatchResult(str, TTDispatchResult.DispatchState.INVALID_FINAL_URL, e2) : ((e2 instanceof SocketTimeoutException) && "ttnet".equals(message)) ? new TTDispatchResult(str, TTDispatchResult.DispatchState.TIMEOUT, e2) : new TTDispatchResult(str, TTDispatchResult.DispatchState.NOT_REACHED, e2);
            }
        } catch (Exception e3) {
            return new TTDispatchResult(str, TTDispatchResult.DispatchState.INVALID_ORIGIN_URL, e3);
        }
    }
}
