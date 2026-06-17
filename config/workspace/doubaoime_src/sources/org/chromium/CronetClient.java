package org.chromium;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.TTNetInitMetrics;
import com.bytedance.frameworks.baselib.network.asynctask.NetworkAsyncTaskType;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.TTNetThreadConfig;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.TTDispatchResult;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.j;
import com.bytedance.frameworks.baselib.network.http.p.i;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import com.ttnet.org.chromium.net.A;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTEventLogSamplingRule;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTSlaSamplingRule;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTSlaSamplingSetting;
import com.ttnet.org.chromium.net.TTThreadConfigInfoProvider$ThreadConfigInfo;
import com.ttnet.org.chromium.net.impl.C0768h;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.k;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UnknownFormatConversionException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CronetClient implements ICronetClient {
    private static final String BORINGSSL_LIBRARY_NAME = "ttboringssl";
    private static final String CRYPTO_LIBRARY_NAME = "ttcrypto";
    private static final int INVALID_THREAD_PRIORITY = 20;
    private static final String KEY_CRASH_DETECT_INTERVAL_MS = "crash_detect_interval_ms";
    private static final String KEY_CRASH_LIMIT_TIMES = "crash_limit_times";
    private static final String KEY_TTNET_CRASH_TIMES = "ttnet_crash_times";
    private static final int MAX_THREAD_STACK_SIZE = 5242880;
    private static final int MIN_THREAD_STACK_SIZE = 51200;
    private static final String SP_SS_APP_CONFIG = "ss_app_config";
    public static final String TAG = "CronetClient";
    private static final String TTNET_ALOG_CLASS = "com.bytedance.ttnet.TTALog";
    private static final String TTNET_BOE_FLAG = "ttnet_boe.flag";
    private static final String TTNET_CACHE_DIR = "ttnet_storage/";
    private static final String TTNET_CONFIG_FILE = "ttnet_config.json";
    private static final String TTNET_INIT_CLASS = "com.bytedance.ttnet.TTNetInit";
    private static int sAppID = 0;
    private static ICronetClient.ICronetBootFailureCheckerProvider sCronetBootFailureCheckerProvider = null;
    private static volatile AbstractC0759g sCronetEngine = null;
    private static ICronetClient.ICronetThreadStackOptFailureCheckerProvider sCronetThreadStackOptFailureCheckerProvider = null;
    private static volatile int sNetworkThreadPriority = 20;
    private int mTTNetCrashTimes;
    private int mCrashLimitTimes = 0;
    private int mCrashDetectTimerInterval = DownloadSettingValues.SYNC_INTERVAL_MS_FG;

    private TTAppInfoProvider.AppInfo convertToCronetAppInfo(com.bytedance.frameworks.baselib.network.http.cronet.a aVar) {
        TTAppInfoProvider.AppInfo appInfo = new TTAppInfoProvider.AppInfo();
        appInfo.a(aVar.a);
        appInfo.o(aVar.b);
        appInfo.p(aVar.f5092c);
        appInfo.q(aVar.f5093d);
        appInfo.n(aVar.f5094e);
        appInfo.l(aVar.f5095f);
        appInfo.m(aVar.f5096g);
        appInfo.s(aVar.h);
        return appInfo;
    }

    private static TTSamplingSettingProvider$TTSlaSamplingSetting convertToCronetSlaSamplingSetting(com.bytedance.frameworks.baselib.network.g.c cVar) {
        TTSamplingSettingProvider$TTSlaSamplingRule tTSamplingSettingProvider$TTSlaSamplingRule;
        TTSamplingSettingProvider$TTEventLogSamplingRule tTSamplingSettingProvider$TTEventLogSamplingRule;
        if (cVar == null) {
            return null;
        }
        try {
            com.bytedance.frameworks.baselib.network.g.b d2 = cVar.d();
            if (d2 != null) {
                tTSamplingSettingProvider$TTSlaSamplingRule = new TTSamplingSettingProvider$TTSlaSamplingRule();
                tTSamplingSettingProvider$TTSlaSamplingRule.a = d2.b();
                tTSamplingSettingProvider$TTSlaSamplingRule.b = d2.a();
                tTSamplingSettingProvider$TTSlaSamplingRule.f8638c = d2.h();
                tTSamplingSettingProvider$TTSlaSamplingRule.f8639d = d2.e();
                tTSamplingSettingProvider$TTSlaSamplingRule.f8641f = d2.f();
                tTSamplingSettingProvider$TTSlaSamplingRule.f8640e = d2.d();
                tTSamplingSettingProvider$TTSlaSamplingRule.f8642g = d2.g();
                tTSamplingSettingProvider$TTSlaSamplingRule.i = d2.c();
                tTSamplingSettingProvider$TTSlaSamplingRule.h = d2.i();
            } else {
                tTSamplingSettingProvider$TTSlaSamplingRule = null;
            }
            com.bytedance.frameworks.baselib.network.g.a c2 = cVar.c();
            if (c2 != null) {
                tTSamplingSettingProvider$TTEventLogSamplingRule = new TTSamplingSettingProvider$TTEventLogSamplingRule();
                tTSamplingSettingProvider$TTEventLogSamplingRule.a = c2.a();
            } else {
                tTSamplingSettingProvider$TTEventLogSamplingRule = null;
            }
            TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSetting = new TTSamplingSettingProvider$TTSlaSamplingSetting();
            tTSamplingSettingProvider$TTSlaSamplingSetting.a = cVar.a();
            tTSamplingSettingProvider$TTSlaSamplingSetting.b = cVar.b();
            tTSamplingSettingProvider$TTSlaSamplingSetting.f8643c = tTSamplingSettingProvider$TTSlaSamplingRule;
            tTSamplingSettingProvider$TTSlaSamplingSetting.f8644d = tTSamplingSettingProvider$TTEventLogSamplingRule;
            return tTSamplingSettingProvider$TTSlaSamplingSetting;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void detectCronetColdStartCrash(final Context context, k.a aVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_SS_APP_CONFIG, 0);
        int i = sharedPreferences.getInt(KEY_CRASH_LIMIT_TIMES, 0);
        this.mCrashLimitTimes = i;
        if (i <= 0) {
            int i2 = sharedPreferences.getInt(KEY_TTNET_CRASH_TIMES, 0);
            this.mTTNetCrashTimes = i2;
            if (i2 > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(KEY_TTNET_CRASH_TIMES, 0);
                edit.apply();
                return;
            }
            return;
        }
        this.mTTNetCrashTimes = sharedPreferences.getInt(KEY_TTNET_CRASH_TIMES, 0);
        int i3 = sharedPreferences.getInt(KEY_CRASH_DETECT_INTERVAL_MS, DownloadSettingValues.SYNC_INTERVAL_MS_FG);
        this.mCrashDetectTimerInterval = i3;
        if (i3 <= 0) {
            this.mCrashDetectTimerInterval = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
        }
        if (com.ttnet.org.chromium.base.e.b()) {
            StringBuilder M = e.a.a.a.a.M("processname is ");
            M.append(i.a(context));
            M.append(" count is ");
            M.append(this.mTTNetCrashTimes);
            M.append(" limit is ");
            M.append(this.mCrashLimitTimes);
            M.append(" interval is ");
            M.append(this.mCrashDetectTimerInterval);
            com.ttnet.org.chromium.base.e.a(TAG, M.toString());
        }
        if (this.mTTNetCrashTimes >= this.mCrashLimitTimes) {
            if (com.ttnet.org.chromium.base.e.b()) {
                StringBuilder M2 = e.a.a.a.a.M("processname is ");
                M2.append(i.a(context));
                M2.append("set secure mode true");
                com.ttnet.org.chromium.base.e.a(TAG, M2.toString());
            }
            aVar.k(true);
        }
        if (i.c(context)) {
            final SharedPreferences.Editor edit2 = sharedPreferences.edit();
            int i4 = this.mTTNetCrashTimes + 1;
            this.mTTNetCrashTimes = i4;
            edit2.putInt(KEY_TTNET_CRASH_TIMES, i4);
            edit2.commit();
            if (com.ttnet.org.chromium.base.e.b()) {
                StringBuilder M3 = e.a.a.a.a.M("processname is ");
                M3.append(i.a(context));
                M3.append(" save count ");
                M3.append(this.mTTNetCrashTimes);
                com.ttnet.org.chromium.base.e.a(TAG, M3.toString());
            }
            com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).e(new com.bytedance.frameworks.baselib.network.asynctask.b(this.mCrashDetectTimerInterval, 0L) { // from class: org.chromium.CronetClient.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.ttnet.org.chromium.base.e.b()) {
                        StringBuilder M4 = e.a.a.a.a.M("processname is ");
                        M4.append(i.a(context));
                        M4.append(" clear count ");
                        com.ttnet.org.chromium.base.e.a(CronetClient.TAG, M4.toString());
                    }
                    edit2.putInt(CronetClient.KEY_TTNET_CRASH_TIMES, 0);
                    edit2.apply();
                }
            });
        }
    }

    private static long getALogFuncAddr() throws Exception {
        return ((Long) com.bytedance.frameworks.baselib.network.i.a.b(Class.forName(TTNET_ALOG_CLASS).newInstance()).b("getALogFuncAddr").get()).longValue();
    }

    private static int getAppSecurityLevel() {
        try {
            return ((Integer) com.bytedance.frameworks.baselib.network.i.a.b(Class.forName(TTNET_INIT_CLASS).newInstance()).b("getAppSecurityLevel").get()).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static AbstractC0759g getCronetEngine() {
        Objects.requireNonNull(sCronetEngine, "Cronet engine is null.");
        return sCronetEngine;
    }

    private static String getDomainConfigByRegion() {
        String h = d.U().h();
        String K = d.U().K();
        String D = d.U().D();
        if (TextUtils.isEmpty(h)) {
            h = !TextUtils.isEmpty(K) ? K : D;
        }
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        try {
            return (String) com.bytedance.frameworks.baselib.network.i.a.b(Class.forName(TTNET_INIT_CLASS).newInstance()).a("getGetDomainConfigByRegion", new Class[]{String.class}, h).get();
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean getListenAppStateIndependently() {
        try {
            return ((Boolean) com.bytedance.frameworks.baselib.network.i.a.b(Class.forName(TTNET_INIT_CLASS).newInstance()).b("getListenAppStateIndependently").get()).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private static long getMaxHttpDiskCacheSize() {
        try {
            return ((Long) com.bytedance.frameworks.baselib.network.i.a.b(Class.forName(TTNET_INIT_CLASS).newInstance()).b("getMaxHttpDiskCacheSize").get()).longValue();
        } catch (Exception unused) {
            return 67108864L;
        }
    }

    private String getProxyConfig(String str) {
        Throwable th;
        BufferedReader bufferedReader;
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    File file = new File(str + TTNET_CONFIG_FILE);
                    if (file.exists()) {
                        bufferedReader = new BufferedReader(new FileReader(file));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            str2 = new JSONObject(sb.toString()).optString("ttnet_proxy", "");
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return str2;
                            } catch (Throwable th3) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
        }
        return str2;
    }

    private static JSONObject getSlaSamplingSetting() {
        try {
            return (JSONObject) com.bytedance.frameworks.baselib.network.i.a.b(Class.forName(TTNET_INIT_CLASS).newInstance()).b("getSlaSamplingSetting").get();
        } catch (Exception unused) {
            return null;
        }
    }

    private static TTNetThreadConfig.a getThreadConfigCallbackImpl() {
        try {
            return (TTNetThreadConfig.a) com.bytedance.frameworks.baselib.network.i.a.b(Class.forName(TTNET_INIT_CLASS).newInstance()).b("getThreadConfigCallbackImpl").get();
        } catch (Exception unused) {
            return null;
        }
    }

    private static ArrayList<TTNetThreadConfig> getThreadConfigInfoList() {
        try {
            return (ArrayList) com.bytedance.frameworks.baselib.network.i.a.b(Class.forName(TTNET_INIT_CLASS).newInstance()).b("getThreadConfigInfoList").get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setNetworkThreadPriority(int i) {
        sNetworkThreadPriority = i;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void addClientOpaqueData(String[] strArr, byte[] bArr, byte[] bArr2, long j, long j2) {
        try {
            if (e.a().loggerDebug()) {
                e.a().loggerD(TAG, "addClientOpaqueData start");
            }
            if (sCronetEngine instanceof k) {
                ((k) sCronetEngine).f(strArr, bArr, bArr2, j, j2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void bindBigCore(TTNetThreadConfig.ThreadType threadType) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).h(threadType.ordinal());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void bindLittleCore(TTNetThreadConfig.ThreadType threadType) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).i(threadType.ordinal());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void clearClientOpaqueData() {
        try {
            if (e.a().loggerDebug()) {
                e.a().loggerD(TAG, "clearClientOpaqueData start");
            }
            if (sCronetEngine instanceof k) {
                ((k) sCronetEngine).j();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    A convertToCronetThreadConfigCallback(final TTNetThreadConfig.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new A() { // from class: org.chromium.CronetClient.2
            @Override // com.ttnet.org.chromium.net.A
            public void bindBigCore(int i) {
                aVar.bindBigCore(i);
            }

            @Override // com.ttnet.org.chromium.net.A
            public void bindLittleCore(int i) {
                aVar.bindLittleCore(i);
            }

            @Override // com.ttnet.org.chromium.net.A
            public void resetCoreBind(int i) {
                aVar.resetCoreBind(i);
            }
        };
    }

    ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> convertToCronetThreadConfigInfoList(ArrayList<TTNetThreadConfig> arrayList, boolean z) {
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> arrayList2 = new ArrayList<>();
                    EnumSet.noneOf(TTNetThreadConfig.ThreadType.class);
                    Iterator<TTNetThreadConfig> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Objects.requireNonNull(it2.next());
                    }
                    return arrayList2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).k(z, str, str2, str3, z2, str4);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getCronetInternalErrorCode(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection instanceof CronetHttpURLConnection) {
                return ((CronetHttpURLConnection) httpURLConnection).z();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public String getCronetVersion() {
        return "TTNetVersion:8e1e9010 2026-04-20 QuicVersion:21ac1950 2025-11-18";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getEffectiveConnectionType() throws Exception {
        if (sCronetEngine instanceof k) {
            return ((k) sCronetEngine).o();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getEffectiveHttpRttMs() throws Exception {
        if (sCronetEngine instanceof k) {
            return ((k) sCronetEngine).p();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getEffectiveRxThroughputKbps() throws Exception {
        if (sCronetEngine instanceof k) {
            return ((k) sCronetEngine).q();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getEffectiveTransportRttMs() throws Exception {
        if (sCronetEngine instanceof k) {
            return ((k) sCronetEngine).r();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public Map<String, com.bytedance.frameworks.baselib.network.http.cronet.impl.i> getGroupRttEstimates() throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        k kVar = (k) sCronetEngine;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, int[]> entry : kVar.s().entrySet()) {
            if (entry.getValue().length != 2) {
                throw new UnknownFormatConversionException("getGroupRttEstimates returns wrong format");
            }
            com.bytedance.frameworks.baselib.network.http.cronet.impl.i iVar = new com.bytedance.frameworks.baselib.network.http.cronet.impl.i();
            int i = entry.getValue()[0];
            int i2 = entry.getValue()[1];
            hashMap.put(entry.getKey(), iVar);
        }
        return hashMap;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void getMappingRequestState(final String str) {
        try {
            CronetUrlRequest b = C0768h.b(str);
            if (b != null) {
                b.Q(new F.c() { // from class: org.chromium.CronetClient.5
                    @Override // com.ttnet.org.chromium.net.F.c
                    public void onStatus(int i) {
                        f.k().l(str, i);
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public com.bytedance.frameworks.baselib.network.http.cronet.impl.i getNetworkQuality() throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        k kVar = (k) sCronetEngine;
        com.bytedance.frameworks.baselib.network.http.cronet.impl.i iVar = new com.bytedance.frameworks.baselib.network.http.cronet.impl.i();
        kVar.w();
        kVar.t();
        kVar.n();
        return iVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getNetworkQualityLevel() throws Exception {
        if (sCronetEngine instanceof k) {
            return ((k) sCronetEngine).u();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public j getPacketLossRateMetrics(int i) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        j jVar = new j();
        k kVar = (k) sCronetEngine;
        kVar.x(i);
        kVar.y(i);
        kVar.l(i);
        kVar.m(i);
        return jVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection) {
        return httpURLConnection instanceof CronetHttpURLConnection;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void notifyStoreRegionUpdated(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).T(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).A(str, str2, str3, str4, str5, str6);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public HttpURLConnection openConnection(Context context, String str, boolean z, String str2, com.bytedance.frameworks.baselib.network.http.b bVar, ICronetAppProvider iCronetAppProvider) throws IOException {
        try {
            if (TTNetInitMetrics.j().a == TTNetInitMetrics.CronetInitMode.NONE) {
                TTNetInitMetrics.j().a = TTNetInitMetrics.CronetInitMode.LAZY_INIT;
            }
            tryCreateCronetEngine(context, false, false, false, z, str2, false, iCronetAppProvider);
            CronetHttpURLConnection cronetHttpURLConnection = (CronetHttpURLConnection) sCronetEngine.e(new URL(str), Proxy.NO_PROXY, bVar.a);
            cronetHttpURLConnection.H(new h(bVar));
            return cronetHttpURLConnection;
        } catch (Throwable th) {
            if (th instanceof MalformedURLException) {
                throw th;
            }
            if ((th instanceof UnsupportedOperationException) && th.getMessage() != null && th.getMessage().contains("Unexpected protocol")) {
                throw new IOException("MalformedURLException", th);
            }
            throw new IOException(th);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void preconnectUrl(String str, Map<String, String> map) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).B(str, 1, map);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void removeClientOpaqueData(String str) {
        try {
            if (e.a().loggerDebug()) {
                e.a().loggerD(TAG, "removeClientOpaqueData start");
            }
            if (sCronetEngine instanceof k) {
                ((k) sCronetEngine).C(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void reportNetDiagnosisUserLog(String str) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).D(str);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void resetCoreBind(TTNetThreadConfig.ThreadType threadType) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).E(threadType.ordinal());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void runInBackGround(boolean z) {
        try {
            if (e.a().loggerDebug()) {
                e.a().loggerD(TAG, "runInBackGround start");
            }
            if (sCronetEngine instanceof k) {
                ((k) sCronetEngine).F(z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setAlogFuncAddr(long j) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).G(j);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setAppStartUpState(int i) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).H(i);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setBestHostWithRouteSelectionName(String str, String str2) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).L(str, str2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCookieInitCompleted() {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).I();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetBootFailureCheckerProvider(ICronetClient.ICronetBootFailureCheckerProvider iCronetBootFailureCheckerProvider) {
        sCronetBootFailureCheckerProvider = iCronetBootFailureCheckerProvider;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetThreadStackOptFailureCheckerProvider(ICronetClient.ICronetThreadStackOptFailureCheckerProvider iCronetThreadStackOptFailureCheckerProvider) {
        sCronetThreadStackOptFailureCheckerProvider = iCronetThreadStackOptFailureCheckerProvider;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setHostResolverRules(String str) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).J(str);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) throws Exception {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setProxy(String str) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).K(str);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setSlaSamplingSetting(JSONObject jSONObject) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        if (sAppID <= 0) {
            sAppID = Integer.parseInt(d.U().d());
        }
        TTSamplingSettingProvider$TTSlaSamplingSetting convertToCronetSlaSamplingSetting = convertToCronetSlaSamplingSetting(com.bytedance.frameworks.baselib.network.g.d.a(jSONObject, sAppID));
        if (convertToCronetSlaSamplingSetting == null) {
            return;
        }
        ((k) sCronetEngine).g(convertToCronetSlaSamplingSetting);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setZstdFuncAddr(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).M(j, j2, j3, j4, j5, j6, j7, j8);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void startThrottle(String[] strArr, int i, long j) {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).N(strArr, i, j);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void stopThrottle(String[] strArr, int i) {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).O(strArr, i);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void triggerGetDomain(boolean z) {
        try {
            if (e.a().loggerDebug()) {
                e.a().loggerD(TAG, "triggerGetDomain start");
            }
            if (sCronetEngine instanceof k) {
                ((k) sCronetEngine).P(z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0369 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[Catch: all -> 0x04e4, SYNTHETIC, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x038a A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0390 A[Catch: all -> 0x04e4, TRY_LEAVE, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c5 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d1 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0413 A[Catch: all -> 0x04e4, TRY_LEAVE, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041e A[Catch: Exception -> 0x0438, all -> 0x04e4, TRY_LEAVE, TryCatch #5 {Exception -> 0x0438, blocks: (B:174:0x0416, B:176:0x041e), top: B:173:0x0416, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043e A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0483 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0491 A[Catch: all -> 0x04e4, TRY_LEAVE, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0487 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0449 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ac A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b9 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c7 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0206 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0217 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0241 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0266 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0274 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bb A[Catch: all -> 0x04e4, LOOP:0: B:85:0x02b5->B:87:0x02bb, LOOP_END, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f1 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0307 A[Catch: all -> 0x04e4, TryCatch #3 {, blocks: (B:6:0x000b, B:8:0x000f, B:10:0x002c, B:12:0x0030, B:15:0x0037, B:16:0x0045, B:18:0x0046, B:20:0x0056, B:23:0x005f, B:25:0x007d, B:26:0x0084, B:28:0x00d6, B:29:0x00e0, B:31:0x012c, B:32:0x012f, B:39:0x0195, B:41:0x019b, B:43:0x01a1, B:44:0x01a6, B:46:0x01ac, B:47:0x01af, B:49:0x01b9, B:50:0x01bd, B:52:0x01c7, B:53:0x01cb, B:55:0x01d5, B:56:0x01d9, B:58:0x0206, B:60:0x0217, B:61:0x0220, B:63:0x0241, B:64:0x025c, B:66:0x0266, B:67:0x026e, B:69:0x0274, B:70:0x0277, B:72:0x0281, B:74:0x0287, B:75:0x028a, B:77:0x0294, B:79:0x029a, B:80:0x029d, B:82:0x02a7, B:84:0x02ad, B:85:0x02b5, B:87:0x02bb, B:89:0x02e7, B:91:0x02f1, B:92:0x02f9, B:94:0x0307, B:96:0x0321, B:98:0x0327, B:106:0x0337, B:108:0x0369, B:111:0x0352, B:128:0x035c, B:134:0x0365, B:133:0x0362, B:118:0x034c, B:143:0x0380, B:145:0x038a, B:147:0x0390, B:158:0x03c0, B:160:0x03c5, B:162:0x03cb, B:164:0x03d1, B:166:0x03df, B:167:0x03e2, B:169:0x03ec, B:170:0x0405, B:172:0x0413, B:174:0x0416, B:176:0x041e, B:179:0x043e, B:180:0x0441, B:183:0x044f, B:185:0x0483, B:186:0x048b, B:188:0x0491, B:200:0x04ce, B:201:0x0487, B:202:0x0449, B:204:0x0439, B:207:0x0188, B:215:0x04d1, B:216:0x04e2, B:190:0x0495, B:192:0x049d, B:193:0x04b6, B:196:0x04be, B:197:0x04c1, B:150:0x039c, B:152:0x03af, B:153:0x03b2, B:155:0x03ba), top: B:5:0x000b, inners: #5, #6, #7, #14 }] */
    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tryCreateCronetEngine(android.content.Context r18, boolean r19, boolean r20, boolean r21, boolean r22, java.lang.String r23, boolean r24, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider r25) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.tryCreateCronetEngine(android.content.Context, boolean, boolean, boolean, boolean, java.lang.String, boolean, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider):void");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void tryStartNetDetect(String[] strArr, int i, int i2) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).Q(strArr, i, i2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void ttDnsResolve(String str, int i, String str2, Map<String, String> map) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((k) sCronetEngine).R(str, i, str2, map);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public TTDispatchResult ttUrlDispatch(String str, int i, boolean z) throws Exception {
        if (!(sCronetEngine instanceof k)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        Map<String, String> S = ((k) sCronetEngine).S(str, i, z);
        String str2 = S.get("final_url");
        if (TextUtils.isEmpty(str2)) {
            throw new UnknownFormatConversionException("ttUrlDispatch returns wrong format");
        }
        new URL(str2).toURI();
        return new TTDispatchResult(str, str2, S.get("epoch"), S.get("etag"), TTDispatchResult.DispatchState.SUCCESS, S.get("ttnet_origin_host"));
    }
}
