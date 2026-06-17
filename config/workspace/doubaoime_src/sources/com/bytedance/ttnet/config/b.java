package com.bytedance.ttnet.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.baselib.network.TTNetInitMetrics;
import com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality;
import com.bytedance.frameworks.baselib.network.connectionclass.c;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.o;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.c;
import com.bytedance.ttnet.config.f;
import com.bytedance.ttnet.tnc.TNCManager;
import com.bytedance.ttnet.utils.a;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import com.xiaomi.mipush.sdk.Constants;
import e.b.f.a.a.a;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements f.c, WeakHandler.IHandler, a.InterfaceC0430a, c.InterfaceC0317c, k.b, k.a, c.b, f.InterfaceC0256f, k.d, f.d, f.g {
    private static b B = null;
    private static String C = null;
    private static String D = "";
    private static int E = -1;

    /* renamed from: J, reason: collision with root package name */
    private static int f6133J = -1;
    private static ArrayList<String> K;
    static boolean L;
    public static final /* synthetic */ int M = 0;
    private final boolean a;

    /* renamed from: e, reason: collision with root package name */
    private final Context f6136e;
    private volatile int u;
    private JSONObject w;
    private String x;
    private AtomicLong b = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f6134c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private final Object f6135d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f6137f = false;

    /* renamed from: g, reason: collision with root package name */
    private volatile int f6138g = -1;
    private long h = 0;
    private AtomicBoolean i = new AtomicBoolean(false);
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 1;
    private int n = 1;
    private int o = 1;
    private int p = 1;
    private int q = 1;
    private String r = "";
    private List<String> s = new CopyOnWriteArrayList();
    private List<String> t = new CopyOnWriteArrayList();
    private String v = "";
    private final AtomicInteger y = new AtomicInteger(10800);
    private final List<String> z = new CopyOnWriteArrayList();
    final WeakHandler A = new WeakHandler(Looper.getMainLooper(), this);

    class a extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TNCManager.TNCUpdateSource f6139e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6140f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, TNCManager.TNCUpdateSource tNCUpdateSource, boolean z) {
            super(str);
            this.f6139e = tNCUpdateSource;
            this.f6140f = z;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            b.this.F(this.f6139e, this.f6140f);
        }
    }

    /* renamed from: com.bytedance.ttnet.config.b$b, reason: collision with other inner class name */
    class C0318b extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f6142e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0318b(String str, Map map) {
            super(str);
            this.f6142e = map;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            com.bytedance.ttnet.d tTNetDepend = TTNetInit.getTTNetDepend();
            Context unused = b.this.f6136e;
            Objects.requireNonNull((com.bytedance.android.input.ttnet.d) tTNetDepend);
            Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
            if (!TextUtils.isEmpty(b.C)) {
                intent.setPackage(b.C);
            }
            b.this.f6136e.sendBroadcast(intent);
        }
    }

    class c extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f6144e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Map map) {
            super(str);
            this.f6144e = map;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            com.bytedance.ttnet.d tTNetDepend = TTNetInit.getTTNetDepend();
            Context unused = b.this.f6136e;
            Objects.requireNonNull((com.bytedance.android.input.ttnet.d) tTNetDepend);
        }
    }

    static final class d extends BroadcastReceiver {

        class a extends com.bytedance.common.utility.h.c {
            a(d dVar, String str) {
                super(str);
            }

            @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
            public void run() {
                j.j().h();
            }
        }

        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG".equals(intent.getAction())) {
                return;
            }
            new a(this, "SyncMainProcessConfig").a();
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        K = arrayList;
        L = false;
        arrayList.add("MI PAD 2");
        K.add("YT3-X90L");
        K.add("YT3-X90F");
        K.add("GT-810");
    }

    private b(Context context, boolean z) {
        this.f6136e = context;
        this.a = z;
    }

    public static b q(Context context) {
        b bVar;
        synchronized (b.class) {
            if (B == null) {
                boolean c2 = com.bytedance.frameworks.baselib.network.http.p.i.c(context);
                B = new b(context.getApplicationContext(), c2);
                if (K.contains(Build.MODEL)) {
                    L = true;
                }
                C = context.getPackageName();
                if (c2) {
                    e.b.f.a.a.a.e(B);
                    com.bytedance.frameworks.baselib.network.http.cronet.impl.k.I(B);
                    com.bytedance.frameworks.baselib.network.http.cronet.impl.k.H(B);
                    com.bytedance.frameworks.baselib.network.http.cronet.impl.k.K(B);
                    com.bytedance.ttnet.c.e(B);
                    com.bytedance.frameworks.baselib.network.connectionclass.c.c().d(B);
                    com.bytedance.frameworks.baselib.network.http.f.z(B);
                    com.bytedance.frameworks.baselib.network.http.f.x(B);
                    if (com.bytedance.frameworks.baselib.network.http.f.h() == null) {
                        com.bytedance.frameworks.baselib.network.http.f.B(B);
                    }
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                    try {
                        context.registerReceiver(new d(), intentFilter, null, null, 4);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    j j = j.j();
                    e.b.f.a.a.a.e(j);
                    com.bytedance.frameworks.baselib.network.http.cronet.impl.k.I(j);
                    com.bytedance.frameworks.baselib.network.http.cronet.impl.k.H(j);
                    com.bytedance.ttnet.c.e(j);
                    if (com.bytedance.frameworks.baselib.network.http.f.h() == null) {
                        com.bytedance.frameworks.baselib.network.http.f.B(j);
                    }
                }
                TTNetInitMetrics.j().k = System.nanoTime();
                com.bytedance.frameworks.baselib.network.http.cronet.impl.k.J(g.c(context));
                TTNetInitMetrics.j().l = System.nanoTime();
                com.bytedance.frameworks.baselib.network.http.f.w(B);
                e.a(context);
            }
            bVar = B;
        }
        return bVar;
    }

    public static boolean v() {
        String str;
        boolean z = true;
        if (!com.bytedance.ttnet.config.d.c()) {
            try {
                str = Build.SUPPORTED_ABIS[0];
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if ("x86".equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str)) {
                if (com.bytedance.ttnet.h.a.a()) {
                    Logger.d("AppConfig", "x86 support");
                    return false;
                }
                Logger.w("AppConfig", "Cronet unsupported CPU arch: " + str);
                o.q(2);
                return true;
            }
            return false;
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (strArr[i].contains("arm")) {
                break;
            }
            i++;
        }
        if (z) {
            if (o.h() == 2) {
                o.q(-1);
            }
        } else {
            if (com.bytedance.ttnet.h.a.a()) {
                Logger.d("AppConfig", "x86 support");
                return false;
            }
            o.q(2);
        }
        if (Logger.debug()) {
            StringBuilder M2 = e.a.a.a.a.M("use isCronetUnsupportedABIv2, result is ");
            M2.append(!z);
            Logger.d("AppConfig", M2.toString());
        }
        return !z;
    }

    private void x(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("return", str);
            jSONObject.put("CurrentShareCookieHostList", this.s.toString());
        } catch (JSONException unused) {
        }
        ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).e(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c(), "handleResponse", "shareCookieHostList", jSONObject);
    }

    public void A(String str) {
        this.v = str;
    }

    public boolean B(String str) {
        URI E0;
        if (com.bytedance.android.input.k.b.a.Y(str) || this.o <= 0) {
            return false;
        }
        try {
            E0 = com.bytedance.feedbackerlib.a.E0(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (E0 == null) {
            return false;
        }
        String host = E0.getHost();
        if (com.bytedance.android.input.k.b.a.Y(host)) {
            return false;
        }
        com.bytedance.feedbackerlib.a.C();
        return host.endsWith("snssdk.com");
    }

    synchronized void C() {
        if (System.currentTimeMillis() - this.b.get() > this.y.get() * 1000) {
            this.b.set(System.currentTimeMillis());
            try {
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                if (TNCManager.e().g() != null) {
                    TNCManager.e().g().e(this.b.get());
                }
            } catch (Exception unused) {
            }
        }
    }

    public void D() {
        synchronized (this.f6135d) {
            if (this.f6137f) {
                return;
            }
            this.f6137f = true;
            SharedPreferences sharedPreferences = this.f6136e.getSharedPreferences("ss_app_config", 0);
            sharedPreferences.getInt("ok_http_open", 0);
            sharedPreferences.getInt("ok_http3_open", 0);
            sharedPreferences.getInt("cronet_version", 0);
            this.j = sharedPreferences.getInt("http_dns_enabled", 0);
            sharedPreferences.getInt("detect_open", 0);
            sharedPreferences.getInt("detect_native_page", 1);
            sharedPreferences.getInt("collect_recent_page_info_enable", 1);
            this.k = sharedPreferences.getInt("add_ss_queries_open", 0);
            this.l = sharedPreferences.getInt("add_ss_queries_header_open", 0);
            this.m = sharedPreferences.getInt("add_ss_queries_plaintext_open", 1);
            sharedPreferences.getInt("add_device_fingerprint_open", 1);
            this.q = sharedPreferences.getInt("dynamic_adjust_threadpool_size_open", 1);
            if (this.f6138g < 0) {
                this.f6138g = sharedPreferences.getInt("chromium_boot_failures", 0);
            }
            com.bytedance.frameworks.baselib.network.dispatcher.e.e(this.q > 0);
            this.n = sharedPreferences.getInt("image_ttnet_enabled", 1);
            this.o = sharedPreferences.getInt("sample_band_width_enabled", 1);
            this.p = sharedPreferences.getInt("cdn_sample_band_width_enabled", 1);
            E = sharedPreferences.getInt("use_http_dns", -1);
            f6133J = sharedPreferences.getInt("use_http_dns_refetch_on_expire", -1);
            com.bytedance.frameworks.baselib.network.http.parser.e.b(sharedPreferences);
            com.bytedance.frameworks.baselib.network.http.cronet.impl.k.V(null, sharedPreferences);
            com.bytedance.ttnet.utils.a.b(sharedPreferences);
            if (this.k > 0 || this.l > 0) {
                com.bytedance.ttnet.l.a.c(true);
            }
            D = sharedPreferences.getString(WsConstants.KEY_FRONTIER_URLS, "");
            this.r = sharedPreferences.getString("cronet_so_path", "");
            String string = sharedPreferences.getString("api_http_host_list", "");
            if (!com.bytedance.android.input.k.b.a.Y(string)) {
                for (String str : string.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    if (!com.bytedance.android.input.k.b.a.Y(str)) {
                        this.t.add(str.trim());
                    }
                }
            }
            com.bytedance.frameworks.baselib.network.http.cronet.impl.h.d().h(sharedPreferences.getString("concurrent_request_config", ""));
            sharedPreferences.getString("add_common_params", "");
            Objects.requireNonNull(com.bytedance.frameworks.baselib.network.http.k.a.a());
            com.bytedance.frameworks.baselib.network.e.d.e().i(sharedPreferences.getString("L0_params", ""));
            int i = sharedPreferences.getInt("query_filter_enabled", Integer.MIN_VALUE);
            String string2 = sharedPreferences.getString("query_filter_actions", "");
            if (i != Integer.MIN_VALUE) {
                com.bytedance.frameworks.baselib.network.e.d.e().c(i > 0);
                com.bytedance.frameworks.baselib.network.e.d.e().f(string2);
            }
            String string3 = sharedPreferences.getString("share_cookie_host_list", "");
            com.bytedance.ttnet.utils.d.c(string3, this.s);
            Objects.requireNonNull(TTNetInit.getTTNetDepend());
            if (!com.bytedance.android.input.k.b.a.Y(null) && !com.bytedance.ttnet.utils.d.a(null, this.s)) {
                this.s.add(null);
            }
            com.bytedance.frameworks.baselib.network.http.f.K(sharedPreferences.getInt("private_protocol_enabled", 1) >= 1);
            int i2 = sharedPreferences.getInt("destroy_delta_millis", 100);
            if (i2 >= 0) {
                com.bytedance.frameworks.baselib.network.http.f.D(i2);
            }
            com.bytedance.frameworks.baselib.network.http.f.E(sharedPreferences.getInt("disable_rotating_host_path_retry", -1) >= 1);
            this.y.set(sharedPreferences.getInt("tnc_update_interval", 10800));
            String string4 = sharedPreferences.getString("send_tnc_host_arrays", "");
            if (!TextUtils.isEmpty(string4)) {
                String[] split = string4.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                this.z.clear();
                this.z.addAll(Arrays.asList(split));
            }
            this.x = sharedPreferences.getString("tnc_summary", "");
            if (TNCManager.e().g() != null) {
                TNCManager.e().g().d(this.b.get());
            }
            int i3 = sharedPreferences.getInt("disable_framed_transport", 0);
            if (i3 > 0) {
                try {
                    com.bytedance.frameworks.baselib.network.http.ok3.impl.f.b(i3);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (this.a) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (!com.bytedance.android.input.k.b.a.Y(D)) {
                        linkedHashMap.put(WsConstants.KEY_FRONTIER_URLS, D);
                    }
                    linkedHashMap.put("http_dns_enabled", Integer.valueOf(this.j));
                    linkedHashMap.put("add_ss_queries_open", Integer.valueOf(this.k));
                    linkedHashMap.put("add_ss_queries_header_open", Integer.valueOf(this.l));
                    linkedHashMap.put("add_ss_queries_plaintext_open", Integer.valueOf(this.m));
                    linkedHashMap.put("chromium_boot_failures", Integer.valueOf(this.f6138g));
                    linkedHashMap.put("share_cookie_host_list", string3);
                    linkedHashMap.put("disable_framed_transport", Integer.valueOf(i3));
                    new C0318b("SaveMapToProvider-Thread", linkedHashMap).a();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public void E(TNCManager.TNCUpdateSource tNCUpdateSource, boolean z) {
        if (this.a) {
            l(tNCUpdateSource, z);
        } else if (this.b.get() <= 0) {
            try {
                new com.bytedance.ttnet.config.a(this, "LoadDomainConfig4Other-Thread").a();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        if (com.bytedance.ttnet.tnc.TNCManager.e().c(r6.f6136e, false, com.bytedance.ttnet.tnc.TNCManager.TNCUpdateSource.PORTRETRY, r6.x) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void F(com.bytedance.ttnet.tnc.TNCManager.TNCUpdateSource r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.b.F(com.bytedance.ttnet.tnc.TNCManager$TNCUpdateSource, boolean):void");
    }

    @Override // e.b.f.a.a.a.InterfaceC0430a
    public boolean a() {
        return this.l > 0;
    }

    @Override // e.b.f.a.a.a.InterfaceC0430a
    public boolean b() {
        return this.m > 0;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.f.g
    public List<String> c(CookieManager cookieManager, com.bytedance.frameworks.baselib.network.http.impl.c cVar, URI uri) {
        String str;
        Throwable th;
        List<String> list;
        if (cookieManager != null || cVar != null) {
            Objects.requireNonNull(TTNetInit.getTTNetDepend());
            if (com.bytedance.android.input.k.b.a.Y(null)) {
                return null;
            }
            try {
                str = uri.getHost();
            } catch (Exception unused) {
                str = null;
            }
            if (!com.bytedance.android.input.k.b.a.Y(str) && com.bytedance.ttnet.utils.d.a(str, this.s)) {
                ArrayList arrayList = new ArrayList();
                if (cookieManager != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(uri.getScheme());
                    sb.append("://");
                    Objects.requireNonNull(TTNetInit.getTTNetDepend());
                    sb.append((String) null);
                    String cookie = cookieManager.getCookie(sb.toString());
                    if (!com.bytedance.android.input.k.b.a.Y(cookie)) {
                        arrayList.add(cookie);
                        return arrayList;
                    }
                }
                if (!com.bytedance.android.input.k.b.a.g0(arrayList) || cVar == null) {
                    return arrayList;
                }
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(uri.getScheme());
                    sb2.append("://");
                    Objects.requireNonNull(TTNetInit.getTTNetDepend());
                    sb2.append((String) null);
                    Map<String, List<String>> map = cVar.get(URI.create(sb2.toString()), new LinkedHashMap());
                    if (map == null || map.isEmpty()) {
                        return arrayList;
                    }
                    List<String> list2 = map.get("Cookie");
                    if (list2 != null) {
                        try {
                            list2.add("x-tt-cookie-backup-source=1");
                        } catch (Throwable th2) {
                            th = th2;
                            list = list2;
                            th.printStackTrace();
                            return list;
                        }
                    }
                    return list2;
                } catch (Throwable th3) {
                    th = th3;
                    list = arrayList;
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.f.g
    public List<String> d(String str) {
        if (com.bytedance.ttnet.utils.d.a(str, this.s)) {
            return this.s;
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.k.b
    public boolean e() {
        return this.j > 0;
    }

    @Override // com.bytedance.ttnet.c.InterfaceC0317c
    public boolean f() {
        if (this.i.compareAndSet(false, true)) {
            SharedPreferences sharedPreferences = this.f6136e.getSharedPreferences("ss_app_config", 0);
            if (this.f6138g < 0) {
                this.f6138g = sharedPreferences.getInt("chromium_boot_failures", 0);
            }
            if (Logger.debug()) {
                e.a.a.a.a.D0(e.a.a.a.a.M("mChromiumBootFailures is "), this.f6138g, "AppConfig");
            }
            this.h = sharedPreferences.getLong("chromium_boot_failures_timestamp", 0L);
            if (this.f6138g > 5 && System.currentTimeMillis() - this.h > TimeUnit.HOURS.toMillis(1L)) {
                this.f6138g = 5;
            }
        }
        if (L) {
            o.q(8);
            return false;
        }
        if (v()) {
            return false;
        }
        if (this.f6138g <= 5) {
            Objects.requireNonNull(TTNetInit.getTTNetDepend());
            return true;
        }
        o.q(3);
        Logger.e("AppConfig", "After five consecutive crashes of cronet, you must reinstall app to enable cronet, or wait until several hours");
        return false;
    }

    @Override // e.b.f.a.a.a.InterfaceC0430a
    public boolean g() {
        return this.k > 0;
    }

    @Override // com.bytedance.frameworks.baselib.network.connectionclass.c.b
    public void h(ConnectionQuality connectionQuality) {
        if (!Logger.debug() || connectionQuality == null) {
            return;
        }
        Logger.d("AppConfig", "onBandwidthStateChange bandwidthState = " + connectionQuality);
    }

    public void handleConfigUpdate(String str) {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        switch (message.what) {
            case 101:
                this.b.set(System.currentTimeMillis());
                if (Logger.debug()) {
                    Logger.d("TNCManager", "doRefresh, succ");
                }
                this.f6134c.set(false);
                break;
            case 102:
                if (Logger.debug()) {
                    Logger.d("TNCManager", "doRefresh, error");
                }
                this.f6134c.set(false);
                break;
            case 103:
                if (Logger.debug()) {
                    Logger.d("TNCManager", "do tnc polling");
                }
                E(TNCManager.TNCUpdateSource.TTPOLL, false);
                break;
            case 104:
                if (Logger.debug()) {
                    Logger.d("TNCManager", "did is empty, delay request tnc");
                }
                E(TNCManager.TNCUpdateSource.TTSERVER, false);
                break;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.k.a
    public boolean isCronetBootFailureExpected() {
        if (Logger.debug()) {
            Logger.d("AppConfig", "isCronetBootFailureExpected...");
        }
        boolean z = false;
        SharedPreferences sharedPreferences = this.f6136e.getSharedPreferences("ss_app_config", 0);
        if (f()) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            z = true;
            edit.putInt("chromium_boot_failures", this.f6138g + 1);
            edit.putLong("chromium_boot_failures_timestamp", System.currentTimeMillis());
            if (Logger.debug()) {
                Logger.d("AppConfig", "KEY_CHROMIUM_BOOT_FAILURES inc...");
            }
            com.bytedance.common.utility.i.a.a(edit);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("chromium_boot_failures", Integer.valueOf(this.f6138g + 1));
            if (TTNetInit.getCronetProvider().getOptInit()) {
                new c("SaveMapToProvider-Thread", linkedHashMap).a();
            } else {
                Objects.requireNonNull((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend());
            }
        }
        return z;
    }

    public boolean k(String str) {
        URI E0;
        if (com.bytedance.android.input.k.b.a.Y(str) || this.p <= 0) {
            return false;
        }
        try {
            E0 = com.bytedance.feedbackerlib.a.E0(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (E0 == null) {
            return false;
        }
        String host = E0.getHost();
        if (com.bytedance.android.input.k.b.a.Y(host)) {
            return false;
        }
        Objects.requireNonNull(TTNetInit.getTTNetDepend());
        if (TextUtils.isEmpty("byteimg.com")) {
            throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
        }
        return host.endsWith("byteimg.com");
    }

    public boolean l(TNCManager.TNCUpdateSource tNCUpdateSource, boolean z) {
        if (Logger.debug()) {
            StringBuilder M2 = e.a.a.a.a.M("doRefresh: updating state ");
            M2.append(this.f6134c.get());
            Logger.d("TNCManager", M2.toString());
        }
        if (this.f6134c.compareAndSet(false, true) || tNCUpdateSource == TNCManager.TNCUpdateSource.TTCRONETFAILED) {
            new a("AppConfigThread", tNCUpdateSource, z).a();
            return true;
        }
        if (Logger.debug()) {
            Logger.d("TNCManager", "doRefresh, already running " + tNCUpdateSource);
        }
        return false;
    }

    @Deprecated
    public String m(String str, com.bytedance.frameworks.baselib.network.http.c cVar) {
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return str;
        }
        try {
            if (this.a) {
                D();
            } else {
                C();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return str;
    }

    public JSONObject n() {
        return this.w;
    }

    public String[] o() {
        String[] b = ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).b();
        return b.length <= 0 ? new String[0] : b;
    }

    public String p() {
        return this.r;
    }

    public List<String> r() {
        return this.z;
    }

    public String s() {
        return this.x;
    }

    public void t(String str, Object obj) {
        boolean z;
        if (f.a(obj)) {
            try {
                z = u(obj, TNCManager.TNCUpdateSource.TTCRONET, System.currentTimeMillis(), false);
            } catch (Exception e2) {
                e2.printStackTrace();
                z = false;
            }
            int i = z ? 101 : 102;
            try {
                new JSONObject().put("from", "cronet");
                Objects.requireNonNull((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                handleConfigUpdate(str);
            } catch (Throwable unused) {
            }
            this.A.sendEmptyMessage(i);
        }
    }

    public boolean u(Object obj, TNCManager.TNCUpdateSource tNCUpdateSource, long j, boolean z) throws Exception {
        JSONObject b;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        String string;
        JSONObject jSONObject;
        String[] strArr;
        int i6;
        JSONObject jSONObject2 = new JSONObject();
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (com.bytedance.android.input.k.b.a.Y(str2)) {
                x(jSONObject2, "empty response.");
                return false;
            }
            b = new JSONObject(str2);
        } else {
            b = obj instanceof JSONObject ? (JSONObject) obj : obj instanceof f.a ? ((f.a) obj).b() : null;
        }
        if (b == null) {
            x(jSONObject2, "object is null.");
            return false;
        }
        this.x = b.optString("summary");
        JSONObject jSONObject3 = b.getJSONObject(RemoteMessageConst.DATA);
        E = jSONObject3.optInt("use_http_dns", -1);
        f6133J = jSONObject3.optInt("collect_recent_page_info_enable", -1);
        int optInt = jSONObject3.optInt("ok_http_open", 0);
        int optInt2 = jSONObject3.optInt("ok_http3_open", 0);
        int optInt3 = jSONObject3.optInt("cronet_version", 0);
        int optInt4 = jSONObject3.optInt("http_dns_enabled", 0);
        int optInt5 = jSONObject3.optInt("detect_open", 0);
        int optInt6 = jSONObject3.optInt("detect_native_page", 1);
        int optInt7 = jSONObject3.optInt("collect_recent_page_info_enable", 1);
        int optInt8 = jSONObject3.optInt("add_ss_queries_open", 0);
        int optInt9 = jSONObject3.optInt("add_ss_queries_header_open", 0);
        int optInt10 = jSONObject3.optInt("add_ss_queries_plaintext_open", 1);
        int optInt11 = jSONObject3.optInt("add_device_fingerprint_open", 1);
        int optInt12 = jSONObject3.optInt("image_ttnet_enabled", 1);
        int optInt13 = jSONObject3.optInt("sample_band_width_enabled", 1);
        int optInt14 = jSONObject3.optInt("cdn_sample_band_width_enabled", 1);
        int optInt15 = jSONObject3.optInt("dynamic_adjust_threadpool_size_open", 1);
        int optInt16 = jSONObject3.optInt("http_show_hijack", 1);
        int optInt17 = jSONObject3.optInt("http_verify_sign", 1);
        int optInt18 = jSONObject3.optInt("tnc_update_interval", -1);
        if (optInt18 > 0) {
            this.y.set(optInt18);
        }
        int optInt19 = jSONObject3.optInt("private_protocol_enabled", 1);
        com.bytedance.frameworks.baselib.network.http.f.K(optInt19 >= 1);
        int optInt20 = jSONObject3.optInt("destroy_delta_millis", 100);
        if (optInt20 >= 0) {
            com.bytedance.frameworks.baselib.network.http.f.D(optInt20);
        }
        int optInt21 = jSONObject3.optInt("disable_rotating_host_path_retry", -1);
        com.bytedance.frameworks.baselib.network.http.f.E(optInt21 >= 1);
        JSONArray optJSONArray = jSONObject3.optJSONArray("send_tnc_host_arrays");
        if (optJSONArray != null) {
            i3 = optInt21;
            this.z.clear();
            i2 = optInt5;
            int i7 = 0;
            while (i7 < optJSONArray.length()) {
                if (TextUtils.isEmpty(optJSONArray.optString(i7))) {
                    i6 = optInt3;
                } else {
                    i6 = optInt3;
                    this.z.add(optJSONArray.optString(i7));
                }
                i7++;
                optInt3 = i6;
            }
            i = optInt3;
        } else {
            i = optInt3;
            i2 = optInt5;
            i3 = optInt21;
        }
        int optInt22 = jSONObject3.optInt("crash_limit_times", 0);
        int optInt23 = jSONObject3.optInt("crash_detect_interval_ms", DownloadSettingValues.SYNC_INTERVAL_MS_FG);
        synchronized (this) {
            this.j = optInt4;
            this.k = optInt8;
            this.l = optInt9;
            this.m = optInt10;
            this.q = optInt15;
            this.n = optInt12;
            this.o = optInt13;
            this.p = optInt14;
        }
        com.bytedance.frameworks.baselib.network.dispatcher.e.e(optInt15 > 0);
        com.bytedance.ttnet.utils.b.c(jSONObject3.optInt("enable_req_ticket", 1) > 0);
        a.C0319a c2 = com.bytedance.ttnet.utils.a.c(jSONObject3);
        if (this.k > 0 || this.l > 0) {
            com.bytedance.ttnet.l.a.c(true);
        }
        com.bytedance.frameworks.baselib.network.http.parser.e.d(jSONObject3);
        com.bytedance.frameworks.baselib.network.http.cronet.impl.k.V(jSONObject3, null);
        String optString = jSONObject3.optString(WsConstants.KEY_FRONTIER_URLS, "");
        String optString2 = jSONObject3.optString("share_cookie_host_list", "");
        ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).f(optString2);
        String optString3 = jSONObject3.optString("api_http_host_list", "");
        String optString4 = jSONObject3.optString("concurrent_request_config", "");
        com.bytedance.frameworks.baselib.network.http.cronet.impl.h.d().h(optString4);
        String optString5 = jSONObject3.optString("add_common_params", "");
        Objects.requireNonNull(com.bytedance.frameworks.baselib.network.http.k.a.a());
        String optString6 = jSONObject3.optString("L0_params", "");
        com.bytedance.frameworks.baselib.network.e.d.e().i(optString6);
        int optInt24 = jSONObject3.optInt("query_filter_enabled", Integer.MIN_VALUE);
        String str3 = new String[]{RemoteMessageConst.DATA, "query_filter_actions"}[1];
        String optString7 = TextUtils.isEmpty(str3) ? null : jSONObject3.optString(str3);
        if (optInt24 != Integer.MIN_VALUE) {
            i4 = optInt24;
            com.bytedance.frameworks.baselib.network.e.d.e().c(optInt24 > 0);
            com.bytedance.frameworks.baselib.network.e.d.e().f(optString7);
        } else {
            i4 = optInt24;
        }
        this.u = jSONObject3.optInt("disable_encrypt_switch", 0);
        this.r = jSONObject3.optString("cronet_so_path", "");
        if (this.u == 2) {
            str = optString7;
            i5 = 0;
            SharedPreferences.Editor edit = this.f6136e.getSharedPreferences("app_log_encrypt_switch_count", 0).edit();
            edit.putInt("app_log_encrypt_faild_count", 0);
            com.bytedance.common.utility.i.a.a(edit);
        } else {
            str = optString7;
            i5 = 0;
        }
        int optInt25 = jSONObject3.optInt("disable_framed_transport", i5);
        if (optInt25 > 0) {
            try {
                com.bytedance.frameworks.baselib.network.http.ok3.impl.f.b(optInt25);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        int optInt26 = jSONObject3.optInt("pp_force_use_shared_stream", i5);
        com.bytedance.frameworks.baselib.network.http.f.G(optInt26 >= 1);
        synchronized (this) {
            SharedPreferences sharedPreferences = this.f6136e.getSharedPreferences("ss_app_config", 0);
            string = sharedPreferences.getString("share_cookie_host_list", "");
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putString("ttnet_response_verify", c2.b);
            edit2.putInt("ttnet_response_verify_enabled", c2.a);
            com.bytedance.frameworks.baselib.network.http.parser.e.c(edit2);
            com.bytedance.frameworks.baselib.network.http.cronet.impl.k.w(edit2);
            edit2.putInt("ok_http_open", optInt);
            edit2.putInt("ok_http3_open", optInt2);
            edit2.putInt("cronet_version", i);
            edit2.putInt("http_dns_enabled", optInt4);
            edit2.putInt("detect_open", i2);
            edit2.putInt("detect_native_page", optInt6);
            edit2.putInt("collect_recent_page_info_enable", optInt7);
            edit2.putInt("add_ss_queries_open", optInt8);
            edit2.putInt("add_ss_queries_header_open", optInt9);
            edit2.putInt("add_ss_queries_plaintext_open", optInt10);
            edit2.putInt("add_device_fingerprint_open", optInt11);
            edit2.putInt("dynamic_adjust_threadpool_size_open", optInt15);
            edit2.putInt("image_ttnet_enabled", optInt12);
            edit2.putInt("use_http_dns", E);
            edit2.putInt("use_http_dns_refetch_on_expire", f6133J);
            edit2.putInt("http_show_hijack", optInt16);
            edit2.putInt("http_verify_sign", optInt17);
            edit2.putInt("crash_limit_times", optInt22);
            edit2.putInt("crash_detect_interval_ms", optInt23);
            edit2.putString(WsConstants.KEY_FRONTIER_URLS, optString);
            edit2.putString("cronet_so_path", this.r);
            edit2.putString("share_cookie_host_list", optString2);
            jSONObject2.put("oldShareCookieHosts", string);
            jSONObject2.put("newShareCookieHosts", optString2);
            if (!TextUtils.isEmpty(optString2)) {
                this.s.clear();
                com.bytedance.ttnet.utils.d.c(optString2, this.s);
            }
            Objects.requireNonNull(TTNetInit.getTTNetDepend());
            if (!com.bytedance.android.input.k.b.a.Y(null) && !com.bytedance.ttnet.utils.d.a(null, this.s)) {
                this.s.add(null);
            }
            edit2.putString("api_http_host_list", optString3);
            edit2.putString("concurrent_request_config", optString4);
            edit2.putString("add_common_params", optString5);
            String str4 = str;
            edit2.putString("query_filter_actions", str4);
            edit2.putString("L0_params", optString6);
            int i8 = i4;
            edit2.putInt("query_filter_enabled", i8);
            String[] split = optString3.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            int length = split.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = length;
                String str5 = split[i9];
                if (com.bytedance.android.input.k.b.a.Y(str5)) {
                    strArr = split;
                } else {
                    strArr = split;
                    if (!com.bytedance.ttnet.utils.d.a(str5, this.t)) {
                        this.t.add(str5.trim());
                    }
                }
                i9++;
                length = i10;
                split = strArr;
            }
            edit2.putInt("android_log_encrypt_switch", this.u);
            edit2.putInt("image_ttnet_enabled", this.n);
            edit2.putInt("sample_band_width_enabled", this.o);
            edit2.putInt("cdn_sample_band_width_enabled", this.p);
            edit2.putInt("disable_framed_transport", optInt25);
            edit2.putInt("tnc_update_interval", this.y.get());
            edit2.putInt("private_protocol_enabled", optInt19);
            edit2.putInt("destroy_delta_millis", optInt20);
            int i11 = i3;
            edit2.putInt("disable_rotating_host_path_retry", i11);
            edit2.putInt("pp_force_use_shared_stream", optInt26);
            StringBuilder sb = new StringBuilder();
            for (int i12 = 0; i12 < this.z.size(); i12++) {
                sb.append(this.z.get(i12));
                if (i12 != this.z.size()) {
                    sb.append(',');
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                edit2.putString("send_tnc_host_arrays", sb2);
            }
            if (!TextUtils.isEmpty(this.x)) {
                edit2.putString("tnc_summary", this.x);
            }
            com.bytedance.common.utility.i.a.a(edit2);
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!com.bytedance.android.input.k.b.a.Y(optString) && !optString.equals(D)) {
                    D = optString;
                    linkedHashMap.put(WsConstants.KEY_FRONTIER_URLS, optString);
                }
                linkedHashMap.put("http_dns_enabled", Integer.valueOf(optInt4));
                linkedHashMap.put("add_ss_queries_open", Integer.valueOf(optInt8));
                linkedHashMap.put("add_ss_queries_header_open", Integer.valueOf(optInt9));
                linkedHashMap.put("add_ss_queries_plaintext_open", Integer.valueOf(optInt10));
                linkedHashMap.put("share_cookie_host_list", optString2);
                linkedHashMap.put("disable_framed_transport", Integer.valueOf(optInt25));
                linkedHashMap.put("query_filter_actions", str4);
                linkedHashMap.put("L0_params", optString6);
                linkedHashMap.put("query_filter_enabled", Integer.valueOf(i8));
                linkedHashMap.put("private_protocol_enabled", Integer.valueOf(optInt19));
                linkedHashMap.put("disable_rotating_host_path_retry", Integer.valueOf(i11));
                linkedHashMap.put("pp_force_use_shared_stream", Integer.valueOf(optInt26));
                Objects.requireNonNull((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend());
                Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                if (!TextUtils.isEmpty(C)) {
                    intent.setPackage(C);
                }
                this.f6136e.sendBroadcast(intent);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (!com.bytedance.android.input.k.b.a.Y(optString2)) {
            i b2 = i.b();
            Objects.requireNonNull(b2);
            if (!optString2.equals(string)) {
                new h(b2, "Sync-Cookie", string, optString2).a();
            }
        }
        if (e.b() != null) {
            jSONObject = jSONObject3;
            e.b().c(jSONObject);
        } else {
            jSONObject = jSONObject3;
        }
        if (TNCManager.e().g() != null) {
            TNCManager.e().g().b(jSONObject, tNCUpdateSource, this.v, j);
            if (z) {
                com.bytedance.frameworks.baselib.network.http.o.b.j().n();
            }
        }
        x(jSONObject2, "return true");
        return true;
    }

    public void w(String str, String str2, boolean z) throws IOException {
        if (this.t.isEmpty()) {
            return;
        }
        for (String str3 : this.t) {
            if (!com.bytedance.android.input.k.b.a.Y(str3) && str.endsWith(str3)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str + str2);
                    jSONObject.put("replace", z);
                    TTNetInit.monitorLogSend("api_http", jSONObject);
                } catch (Throwable unused) {
                }
                if (TTNetInit.apiHttpInterceptEnabled() && !z) {
                    throw new com.bytedance.frameworks.baselib.network.http.l.e("Api http request is not allowed to be executed");
                }
                return;
            }
        }
    }

    public void y() {
        try {
            if (Logger.debug()) {
                Logger.d("AppConfig", "KEY_CHROMIUM_BOOT_FAILURES set 0");
            }
            if (this.f6138g == 0) {
                return;
            }
            this.f6138g = 0;
            SharedPreferences.Editor edit = this.f6136e.getSharedPreferences("ss_app_config", 0).edit();
            edit.putInt("chromium_boot_failures", 0);
            com.bytedance.common.utility.i.a.a(edit);
            new LinkedHashMap().put("chromium_boot_failures", 0);
            Objects.requireNonNull((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void z(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            jSONObject = null;
        } else {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            JSONArray jSONArray = new JSONArray();
            for (String str2 : split) {
                jSONArray.put(str2);
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put("hit", jSONArray);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        this.w = jSONObject;
        TNCManager.e().g().h(str);
    }
}
