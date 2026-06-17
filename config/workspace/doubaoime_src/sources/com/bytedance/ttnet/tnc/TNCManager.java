package com.bytedance.ttnet.tnc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.d;
import com.bytedance.frameworks.baselib.network.http.p.i;
import com.bytedance.frameworks.baselib.network.http.p.k;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.N;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.i.c;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Request;
import okhttp3.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TNCManager implements d {
    private static String A;
    private static TNCManager z;
    private String h;
    private String i;
    private volatile long j;
    private Context m;
    private com.bytedance.ttnet.tnc.b n;
    private long a = 0;
    private volatile long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f6251c = 0;

    /* renamed from: d, reason: collision with root package name */
    private TNCUpdateSource f6252d = TNCUpdateSource.TTCACHE;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f6253e = 0;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f6254f = false;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f6255g = false;
    private AtomicBoolean k = new AtomicBoolean(false);
    private boolean l = false;
    private volatile int o = 0;
    private volatile long p = 0;
    private volatile long q = 0;
    private int r = 0;
    private HashMap<String, Integer> s = new HashMap<>();
    private HashMap<String, Integer> t = new HashMap<>();
    private int u = 0;
    private HashMap<String, Integer> v = new HashMap<>();
    private HashMap<String, Integer> w = new HashMap<>();
    private boolean x = true;
    Handler y = new b(Looper.getMainLooper());

    public enum TNCUpdateSource {
        TTRESUME(-2),
        TTHardCode(-1),
        TTCACHE(0),
        TTSERVER(1),
        TTERROR(2),
        TTPOLL(3),
        TTTNC(4),
        PORTRETRY(7),
        TTREGION(10),
        TTCRONET(20),
        TTCRONETFAILED(30);

        public final int mValue;

        TNCUpdateSource(int i) {
            this.mValue = i;
        }
    }

    class a implements com.bytedance.frameworks.baselib.network.http.o.a {
        final /* synthetic */ ICronetAppProvider a;

        a(ICronetAppProvider iCronetAppProvider) {
            this.a = iCronetAppProvider;
        }

        @Override // com.bytedance.frameworks.baselib.network.http.o.a
        public void a(String str, String str2) {
            this.a.sendAppMonitorEvent(str, str2);
        }

        @Override // com.bytedance.frameworks.baselib.network.http.o.a
        public boolean b(JSONObject jSONObject, String str, String str2, boolean z) {
            return TNCManager.e().j(jSONObject, str, str2, z);
        }

        @Override // com.bytedance.frameworks.baselib.network.http.o.a
        public void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5, String str6) {
            com.bytedance.ttnet.cronet.a.a().b(str, str2, str3, str4, str5, str6);
        }
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TNCUpdateSource tNCUpdateSource;
            if (message.what != 10000) {
                return;
            }
            boolean z = message.arg1 != 0;
            TNCManager tNCManager = TNCManager.this;
            int i = message.arg2;
            Objects.requireNonNull(tNCManager);
            if (i == 7) {
                tNCUpdateSource = TNCUpdateSource.PORTRETRY;
            } else if (i == 10) {
                tNCUpdateSource = TNCUpdateSource.TTREGION;
            } else if (i == 20) {
                tNCUpdateSource = TNCUpdateSource.TTCRONET;
            } else if (i != 30) {
                switch (i) {
                    case -2:
                        tNCUpdateSource = TNCUpdateSource.TTRESUME;
                        break;
                    case -1:
                        tNCUpdateSource = TNCUpdateSource.TTHardCode;
                        break;
                    case 0:
                        tNCUpdateSource = TNCUpdateSource.TTCACHE;
                        break;
                    case 1:
                        tNCUpdateSource = TNCUpdateSource.TTSERVER;
                        break;
                    case 2:
                        tNCUpdateSource = TNCUpdateSource.TTERROR;
                        break;
                    case 3:
                        tNCUpdateSource = TNCUpdateSource.TTPOLL;
                        break;
                    case 4:
                        tNCUpdateSource = TNCUpdateSource.TTTNC;
                        break;
                    default:
                        tNCUpdateSource = TNCUpdateSource.TTSERVER;
                        break;
                }
            } else {
                tNCUpdateSource = TNCUpdateSource.TTCRONETFAILED;
            }
            tNCManager.b(z, tNCUpdateSource);
        }
    }

    private TNCManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z2, TNCUpdateSource tNCUpdateSource) {
        if (f() == null) {
            return;
        }
        if (Logger.debug()) {
            Logger.d("TNCManager", "doUpdateRemote, " + z2);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z2) {
            if ((r0.j * 1000) + this.a > elapsedRealtime) {
                if (Logger.debug()) {
                    Logger.d("TNCManager", "doUpdateRemote, time limit");
                    return;
                }
                return;
            }
        }
        this.a = elapsedRealtime;
        if (tNCUpdateSource == TNCUpdateSource.TTTNC) {
            this.b = System.currentTimeMillis();
        }
        com.bytedance.ttnet.config.b.q(this.m).l(tNCUpdateSource, false);
    }

    static String d() {
        return A;
    }

    public static synchronized TNCManager e() {
        TNCManager tNCManager;
        synchronized (TNCManager.class) {
            if (z == null) {
                z = new TNCManager();
            }
            tNCManager = z;
        }
        return tNCManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k(okhttp3.B r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.tnc.TNCManager.k(okhttp3.B, java.lang.String):void");
    }

    private boolean l(Context context, TNCUpdateSource tNCUpdateSource, String str, String str2, String str3, String str4, boolean z2) {
        try {
            if (Logger.debug()) {
                Logger.d("TNCManager", "okhttp tnc response success, etag is " + str3 + ", tnc control " + str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                com.bytedance.ttnet.config.b.q(context).A(str3);
            }
            e().n.h(str4);
            if (!TextUtils.isEmpty(str2) && str2.equals(PushClient.DEFAULT_REQUEST_ID)) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(str);
            ClientKeyManager.j().c(str);
            boolean u = com.bytedance.ttnet.config.b.q(context).u(jSONObject, tNCUpdateSource, System.currentTimeMillis(), z2);
            if (u) {
                this.f6253e = System.currentTimeMillis();
                if (!this.f6254f) {
                    this.f6254f = true;
                }
                this.f6255g = true;
                if (tNCUpdateSource == TNCUpdateSource.TTTNC) {
                    this.q = this.p;
                }
            }
            return u;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void m(ICronetAppProvider iCronetAppProvider) {
        String carrierRegion = iCronetAppProvider.getCarrierRegion();
        String sysRegion = iCronetAppProvider.getSysRegion();
        String region = iCronetAppProvider.getRegion();
        if (TextUtils.isEmpty(carrierRegion)) {
            carrierRegion = !TextUtils.isEmpty(sysRegion) ? sysRegion : region;
        }
        com.bytedance.frameworks.baselib.network.http.o.b.j().i(carrierRegion, iCronetAppProvider.getStoreIdcRuleJSON(), iCronetAppProvider.getAppInitialRegionInfo(), ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c(), new a(iCronetAppProvider));
        if (!TextUtils.isEmpty(carrierRegion)) {
            A = TTNetInit.getGetDomainConfigByRegion(carrierRegion);
        }
        if (TextUtils.isEmpty(A)) {
            A = iCronetAppProvider.getGetDomainDefaultJSON();
        }
        if (Logger.debug()) {
            e.a.a.a.a.I0(e.a.a.a.a.U("region: ", carrierRegion, " json: "), A, "TNCManager");
        }
    }

    private void q() {
        if (Logger.debug()) {
            Logger.d("TNCManager", "resetTNCControlState");
        }
        this.r = 0;
        this.s.clear();
        this.t.clear();
        this.u = 0;
        this.v.clear();
        this.w.clear();
    }

    private void r(boolean z2, long j, TNCUpdateSource tNCUpdateSource) {
        if (this.y.hasMessages(10000)) {
            return;
        }
        Message obtainMessage = this.y.obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.arg1 = z2 ? 1 : 0;
        obtainMessage.arg2 = tNCUpdateSource.mValue;
        if (j > 0) {
            this.y.sendMessageDelayed(obtainMessage, j);
        } else {
            this.y.sendMessage(obtainMessage);
        }
    }

    public boolean c(Context context, boolean z2, TNCUpdateSource tNCUpdateSource, String str) {
        if (Logger.debug()) {
            Logger.d("TNCManager", "getdomain internal, use retrofit okhttp: " + z2 + ", tnc source: " + tNCUpdateSource);
        }
        ArrayList arrayList = new ArrayList();
        if (com.bytedance.ttnet.config.b.q(context).r() == null || com.bytedance.ttnet.config.b.q(context).r().size() == 0) {
            arrayList.addAll(Arrays.asList(com.bytedance.ttnet.config.b.q(context).o()));
        } else {
            arrayList.addAll(com.bytedance.ttnet.config.b.q(context).r());
            for (String str2 : com.bytedance.ttnet.config.b.q(context).o()) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        this.f6252d = tNCUpdateSource;
        this.j = System.currentTimeMillis();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = new k(e.a.a.a.a.U("https://", (String) it2.next(), "/get_domains/v5/").toString());
            try {
                kVar.b("abi", Build.SUPPORTED_ABIS[0]);
                kVar.a("tnc_src", tNCUpdateSource.mValue);
                kVar.b("okhttp_version", "4.2.243.8-doubao");
                if (com.bytedance.frameworks.baselib.network.http.o.b.j().k()) {
                    kVar.b("use_store_region_cookie", PushClient.DEFAULT_REQUEST_ID);
                }
                Object tTNetDepend = TTNetInit.getTTNetDepend();
                if (tTNetDepend != null && (tTNetDepend instanceof com.bytedance.ttnet.b)) {
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            com.bytedance.frameworks.baselib.network.http.o.b.j().a(hashMap);
            boolean z3 = !TextUtils.isEmpty(com.bytedance.frameworks.baselib.network.http.o.b.j().h());
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("x-tt-tnc-summary", str);
            }
            if (z2) {
                ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).a();
                kVar.a(WsConstants.KEY_APP_ID, 401734);
                kVar.b("device_platform", "android");
                if (TTNetInit.getCronetProvider() != null) {
                    kVar.b("version_code", TTNetInit.getCronetProvider().getVersionCode());
                    kVar.b("channel", TTNetInit.getCronetProvider().getChannel());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        arrayList2.add(new com.bytedance.retrofit2.client.b((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                String c2 = kVar.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Pair<String, String> c3 = l.c(c2, linkedHashMap);
                    String str3 = (String) c3.first;
                    String str4 = (String) c3.second;
                    INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.e(str3, INetworkApi.class);
                    if (iNetworkApi == null) {
                        continue;
                    } else {
                        InterfaceC0701e<String> doGet = iNetworkApi.doGet(true, -1, str4, linkedHashMap, arrayList2, null);
                        try {
                            N<String> execute = doGet.execute();
                            List<com.bytedance.retrofit2.client.b> e2 = execute.e();
                            String a2 = execute.a();
                            String g2 = RetrofitUtils.g(e2, "x-ss-etag");
                            String g3 = RetrofitUtils.g(e2, "x-tt-tnc-abtest");
                            String g4 = RetrofitUtils.g(e2, "x-tt-tnc-control");
                            this.h = RetrofitUtils.g(e2, "x-tt-tnc-config");
                            this.i = RetrofitUtils.g(e2, "x-ss-canary");
                            if (e().l(context, tNCUpdateSource, a2, g4, g2, g3, z3)) {
                                doGet.cancel();
                                return true;
                            }
                        } finally {
                            try {
                                if (doGet != null) {
                                    doGet.cancel();
                                }
                            } finally {
                            }
                        }
                        doGet.cancel();
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } else {
                com.bytedance.ttnet.i.a aVar = new com.bytedance.ttnet.i.a();
                aVar.a = kVar.c();
                aVar.b = true;
                System.currentTimeMillis();
                try {
                    String a3 = c.a(aVar.a, hashMap, new HashMap(), aVar);
                    System.currentTimeMillis();
                    this.i = aVar.h;
                    this.h = aVar.f6222g;
                    if (e().l(context, tNCUpdateSource, a3, aVar.f6221f, aVar.f6219d, aVar.f6220e, z3)) {
                        return true;
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    public com.bytedance.ttnet.tnc.a f() {
        com.bytedance.ttnet.tnc.b bVar = this.n;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public com.bytedance.ttnet.tnc.b g() {
        return this.n;
    }

    public JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("update_time", this.f6253e);
            jSONObject2.put("source", this.f6252d.mValue);
            int i = 1;
            jSONObject2.put("cold_start", this.f6254f ? 1 : 0);
            if (!this.f6255g) {
                i = 0;
            }
            jSONObject2.put("config_updated", i);
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject2.put("config", this.h);
            }
            if (!TextUtils.isEmpty(this.i)) {
                jSONObject2.put("canary", this.i);
            }
            jSONObject2.put("local_probe_version", this.q);
            String s = com.bytedance.ttnet.config.b.q(this.m).s();
            if (!TextUtils.isEmpty(s)) {
                jSONObject2.put("rules", s);
            }
            com.bytedance.ttnet.tnc.b bVar = this.n;
            if (bVar != null) {
                Objects.requireNonNull(bVar);
                if (!TextUtils.isEmpty("")) {
                    Objects.requireNonNull(this.n);
                    if (!TextUtils.isEmpty("")) {
                        Objects.requireNonNull(this.n);
                        jSONObject2.put("region", "");
                        Objects.requireNonNull(this.n);
                        jSONObject2.put("region_source", "");
                    }
                }
            }
            jSONObject.put(RemoteMessageConst.DATA, jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("version", this.p);
            jSONObject3.put("cmd", this.o);
            jSONObject3.put("send_time", this.b);
            jSONObject3.put("get_time", this.f6251c);
            jSONObject.put("probe", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("probe_version", this.q);
            jSONObject4.put("source", this.f6252d.mValue);
            jSONObject4.put("start_time", this.j);
            jSONObject.put("request", jSONObject4);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void i() {
        if (f() != null && i.c(this.m) && this.k.compareAndSet(false, true)) {
            r(true, 0L, TNCUpdateSource.TTCRONETFAILED);
        }
    }

    public boolean j(JSONObject jSONObject, String str, String str2, boolean z2) {
        boolean z3;
        if (Logger.debug()) {
            Logger.d("TNCManager", "data: " + jSONObject + " etag: " + str + " tncAttr: " + str2 + " needUpdateTnc: " + z2);
        }
        if (jSONObject != null) {
            com.bytedance.ttnet.tnc.b bVar = this.n;
            if (bVar != null) {
                bVar.h("");
                z3 = this.n.b(jSONObject, TNCUpdateSource.TTSERVER, str, System.currentTimeMillis());
            } else {
                z3 = false;
            }
            if (z3) {
                com.bytedance.frameworks.baselib.network.http.o.b.j().n();
            }
        } else {
            z3 = false;
        }
        if (!z2 || z3) {
            return false;
        }
        Logger.d("TNCManager", "doUpdateRemote tnc");
        b(true, TNCUpdateSource.TTREGION);
        return true;
    }

    public synchronized void n(Context context, boolean z2) {
        if (!this.l) {
            this.m = context;
            this.x = z2;
            this.n = new com.bytedance.ttnet.tnc.b(context, z2);
            if (z2) {
                SharedPreferences sharedPreferences = this.m.getSharedPreferences("ttnet_tnc_config", 0);
                this.o = sharedPreferences.getInt("tnc_probe_cmd", 0);
                this.p = sharedPreferences.getLong("tnc_probe_version", 0L);
            }
            if (Logger.debug()) {
                Logger.d("TNCManager", "initTnc, isMainProc: " + z2 + " probeCmd: " + this.o + " probeVersion: " + this.p);
            }
            this.l = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x016e A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:5:0x0007, B:10:0x000d, B:14:0x0017, B:16:0x0033, B:20:0x003d, B:24:0x0045, B:28:0x004d, B:30:0x0053, B:31:0x0079, B:33:0x007f, B:35:0x0083, B:37:0x0088, B:40:0x008e, B:42:0x0092, B:44:0x0098, B:47:0x00a2, B:49:0x00a8, B:57:0x012b, B:59:0x012f, B:61:0x0133, B:67:0x0141, B:69:0x0147, B:71:0x014f, B:76:0x016e, B:78:0x018b, B:80:0x0195, B:82:0x019f, B:84:0x01a5, B:85:0x01cb), top: B:4:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void o(okhttp3.Request r9, okhttp3.B r10) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.tnc.TNCManager.o(okhttp3.Request, okhttp3.B):void");
    }

    public synchronized void p(Request request, Exception exc) {
        if (request == null || exc == null) {
            return;
        }
        if (this.x) {
            if (NetworkUtils.h(this.m)) {
                t url = request.url();
                String y = url.y();
                String k = url.k();
                String f2 = url.f();
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String lowerCase = stringWriter.toString().toLowerCase();
                if ("http".equals(y) || "https".equals(y)) {
                    if (TextUtils.isEmpty(k)) {
                        return;
                    }
                    if (!TextUtils.isEmpty(lowerCase) && lowerCase.contains("timeout") && lowerCase.contains("time out") && !lowerCase.contains("unreachable")) {
                        com.bytedance.ttnet.tnc.a f3 = f();
                        if (f3 != null && f3.a) {
                            Map<String, Integer> map = f3.f6256c;
                            if (map != null && map.size() > 0 && f3.f6256c.containsKey(k)) {
                                if (Logger.debug()) {
                                    Logger.d("TNCManager", "onOk3Timeout, url matched: " + y + "://" + k + "#" + lowerCase + " " + this.r + "#" + this.s.size() + "#" + this.t.size() + " " + this.u + "#" + this.v.size() + "#" + this.w.size());
                                }
                                this.r++;
                                this.s.put(f2, 0);
                                this.t.put(k, 0);
                                if (this.r >= f3.f6257d && this.s.size() >= f3.f6258e && this.t.size() >= f3.f6259f) {
                                    if (Logger.debug()) {
                                        Logger.d("TNCManager", "onOk3Timeout, url doUpate: " + y + "://" + k);
                                    }
                                    r(false, 0L, TNCUpdateSource.TTERROR);
                                    q();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
