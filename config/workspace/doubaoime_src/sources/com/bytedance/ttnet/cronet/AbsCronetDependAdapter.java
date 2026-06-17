package com.bytedance.ttnet.cronet;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.frameworks.baselib.network.i.a;
import com.bytedance.ttnet.TTMultiNetwork;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.TTWiFiCellSwitcher;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AbsCronetDependAdapter implements ICronetDepend, ICronetAppProvider {
    private static final int MAX_ABSDK_VERSION_LENGTH = 5;
    private static final String TAG = "AbsCronetDependAdapter";

    class a extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6166e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6167f;

        a(int i, int i2) {
            this.f6166e = i;
            this.f6167f = i2;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                a.b a = com.bytedance.frameworks.baselib.network.i.a.a(TTWiFiCellSwitcher.class);
                Class<?> cls = Integer.TYPE;
                a.a("notifyWiFiToCellState", new Class[]{cls, cls}, Integer.valueOf(this.f6166e), Integer.valueOf(this.f6167f));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                AbsCronetDependAdapter.this.onWiFiToCellStateChangedForApp(this.f6166e, this.f6167f);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class b extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6169e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6170f;

        b(AbsCronetDependAdapter absCronetDependAdapter, int i, int i2) {
            this.f6169e = i;
            this.f6170f = i2;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                a.b a = com.bytedance.frameworks.baselib.network.i.a.a(TTMultiNetwork.class);
                Class<?> cls = Integer.TYPE;
                a.a("notifyMultiNetworkState", new Class[]{cls, cls}, Integer.valueOf(this.f6169e), Integer.valueOf(this.f6170f));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class c extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6171e;

        c(AbsCronetDependAdapter absCronetDependAdapter, boolean z) {
            this.f6171e = z;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                com.bytedance.frameworks.baselib.network.i.a.a(TTMultiNetwork.class).a("notifyUserSpecifiedNetworkEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(this.f6171e));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class d extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6172e;

        d(int i) {
            this.f6172e = i;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            AbsCronetDependAdapter.this.onNetworkQualityLevelChanged(this.f6172e);
        }
    }

    class e extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6174e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6175f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6176g;

        e(int i, int i2, int i3) {
            this.f6174e = i;
            this.f6175f = i2;
            this.f6176g = i3;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            AbsCronetDependAdapter.this.onNetworkQualityRttAndThroughputNotified(this.f6174e, this.f6175f, this.f6176g);
        }
    }

    class f extends com.bytedance.common.utility.h.c {
        f(AbsCronetDependAdapter absCronetDependAdapter) {
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            TTNetInit.notifyColdStartFinish();
        }
    }

    class g extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6177e;

        g(AbsCronetDependAdapter absCronetDependAdapter, String str) {
            this.f6177e = str;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            TTNetInit.onClientIPChanged(this.f6177e);
        }
    }

    class h extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f6178e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f6179f;

        h(AbsCronetDependAdapter absCronetDependAdapter, List list, List list2) {
            this.f6178e = list;
            this.f6179f = list2;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            TTNetInit.onPublicIPsChanged(this.f6178e, this.f6179f);
        }
    }

    class i extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6180e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6181f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f6182g;
        final /* synthetic */ String h;
        final /* synthetic */ String i;
        final /* synthetic */ String j;

        i(AbsCronetDependAdapter absCronetDependAdapter, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f6180e = str;
            this.f6181f = str2;
            this.f6182g = str3;
            this.h = str4;
            this.i = str5;
            this.j = str6;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            com.bytedance.ttnet.cronet.a.a().b(this.f6180e, this.f6181f, this.f6182g, this.h, this.i, this.j);
            com.bytedance.frameworks.baselib.network.http.o.b.j().m(this.f6181f, this.f6182g, this.h, this.i);
        }
    }

    class j extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6183e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f6184f;

        j(AbsCronetDependAdapter absCronetDependAdapter, boolean z, List list) {
            this.f6183e = z;
            this.f6184f = list;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            com.bytedance.ttnet.cronet.b.a().b(this.f6183e, this.f6184f);
        }
    }

    class k extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6185e;

        k(AbsCronetDependAdapter absCronetDependAdapter, String str) {
            this.f6185e = str;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                com.bytedance.ttnet.config.b.q(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c()).A(this.f6185e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class l extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f6186e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6187f;

        l(AbsCronetDependAdapter absCronetDependAdapter, ArrayList arrayList, String str) {
            this.f6186e = arrayList;
            this.f6187f = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0178 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #3 {all -> 0x01e7, blocks: (B:48:0x0152, B:50:0x0162, B:51:0x0172, B:53:0x0178), top: B:47:0x0152 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01a7 A[Catch: all -> 0x01e5, TryCatch #1 {all -> 0x01e5, blocks: (B:56:0x017e, B:58:0x018e, B:59:0x01a1, B:61:0x01a7, B:62:0x01d3), top: B:55:0x017e }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 518
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.cronet.AbsCronetDependAdapter.l.run():void");
        }
    }

    class m extends com.bytedance.common.utility.h.c {
        m(AbsCronetDependAdapter absCronetDependAdapter) {
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            com.bytedance.ttnet.config.b.q(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c()).y();
            com.bytedance.ttnet.c.d(true);
        }
    }

    class n extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6188e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6189f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6190g;

        n(AbsCronetDependAdapter absCronetDependAdapter, boolean z, boolean z2, int i) {
            this.f6188e = z;
            this.f6189f = z2;
            this.f6190g = i;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                com.bytedance.ttnet.config.g.c(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c()).e(this.f6188e, this.f6189f, this.f6190g);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class o extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6191e;

        o(AbsCronetDependAdapter absCronetDependAdapter, String str) {
            this.f6191e = str;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                com.bytedance.ttnet.config.b.q(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c()).z(this.f6191e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class p extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6192e;

        p(AbsCronetDependAdapter absCronetDependAdapter, String str) {
            this.f6192e = str;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                com.bytedance.ttnet.config.b q = com.bytedance.ttnet.config.b.q(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c());
                String str = this.f6192e;
                q.t(str, str);
                ClientKeyManager.j().c(this.f6192e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class q extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6193e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6194f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6195g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;
        final /* synthetic */ List j;
        final /* synthetic */ String k;

        q(AbsCronetDependAdapter absCronetDependAdapter, String str, String str2, int i, int i2, int i3, List list, String str3) {
            this.f6193e = str;
            this.f6194f = str2;
            this.f6195g = i;
            this.h = i2;
            this.i = i3;
            this.j = list;
            this.k = str3;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            com.bytedance.ttnet.j.a.c().a(this.f6193e, this.f6195g, this.h, this.i, this.j, this.k);
        }
    }

    class r extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6196e;

        r(String str) {
            this.f6196e = str;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            try {
                AbsCronetDependAdapter.this.onTTNetDetectResult(this.f6196e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class s extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6198e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6199f;

        s(String str, int i) {
            this.f6198e = str;
            this.f6199f = i;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            AbsCronetDependAdapter.this.onCronetMappingRequestStatus(this.f6198e, this.f6199f);
        }
    }

    class t extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6201e;

        t(int i) {
            this.f6201e = i;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            AbsCronetDependAdapter.this.onEffectiveConnectionTypeChanged(this.f6201e);
            AbsCronetDependAdapter.this.onNQEEffectiveConnectionTypeChanged(this.f6201e);
        }
    }

    class u extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6203e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6204f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6205g;

        u(int i, int i2, int i3) {
            this.f6203e = i;
            this.f6204f = i2;
            this.f6205g = i3;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            AbsCronetDependAdapter.this.onRTTOrThroughputEstimatesComputed(this.f6203e, this.f6204f, this.f6205g);
            AbsCronetDependAdapter.this.onNQERTTOrThroughputComputed(this.f6203e, this.f6204f, this.f6205g);
        }
    }

    class v extends com.bytedance.common.utility.h.c {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6206e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ double f6207f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ double f6208g;
        final /* synthetic */ double h;
        final /* synthetic */ double i;

        v(int i, double d2, double d3, double d4, double d5) {
            this.f6206e = i;
            this.f6207f = d2;
            this.f6208g = d3;
            this.h = d4;
            this.i = d5;
        }

        @Override // com.bytedance.common.utility.h.c, java.lang.Runnable
        public void run() {
            AbsCronetDependAdapter.this.onPacketLossComputed(this.f6206e, this.f6207f, this.f6208g, this.h, this.i);
            AbsCronetDependAdapter.this.onNQEPacketLossComputed(this.f6206e, this.f6207f, this.f6208g, this.h, this.i);
        }
    }

    protected AbsCronetDependAdapter() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void doLoadLibrary(String str) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbClient() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbFeature() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbFlag() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public List<String> getAbSdkVersion() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbi() {
        return Build.SUPPORTED_ABIS[0];
    }

    public String getAppId() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public com.bytedance.frameworks.baselib.network.http.cronet.a getAppInfoSubset() {
        com.bytedance.frameworks.baselib.network.http.cronet.a aVar = new com.bytedance.frameworks.baselib.network.http.cronet.a();
        List<String> abSdkVersion = getAbSdkVersion();
        String str = "";
        if (abSdkVersion != null) {
            int i2 = 0;
            for (String str2 : abSdkVersion) {
                i2++;
                if (i2 > 5) {
                    break;
                }
                if (!TextUtils.isEmpty(str2)) {
                    str = e.a.a.a.a.t(str, str2, Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
        }
        aVar.a = str;
        String[] b2 = ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).b();
        if (b2.length > 0) {
            aVar.b = b2[0];
        }
        if (b2.length > 1) {
            aVar.f5092c = b2[1];
        }
        if (b2.length > 2) {
            aVar.f5093d = b2[2];
        }
        HashMap hashMap = (HashMap) ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).d();
        String str3 = (String) hashMap.get(TTNetInit.DOMAIN_HTTPDNS_KEY);
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            aVar.f5094e = str3;
        }
        String str4 = (String) hashMap.get(TTNetInit.DOMAIN_BOE_KEY);
        if (str4 != null && !TextUtils.isEmpty(str4)) {
            aVar.f5095f = str4;
        }
        String str5 = (String) hashMap.get(TTNetInit.DOMAIN_BOE_HTTPS_KEY);
        if (str5 != null && !TextUtils.isEmpty(str5)) {
            aVar.f5096g = str5;
        }
        aVar.h = getAppInitialRegionInfo();
        return aVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppInitialRegionInfo() {
        return "";
    }

    public String getAppName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public long getAppStartTime() {
        return -1L;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getBypassBOEJSON() {
        return null;
    }

    public String getCarrierRegion() {
        return "";
    }

    public String getChannel() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCityName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCronetSoPath() {
        return com.bytedance.ttnet.config.b.q(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c()).p();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDPI() {
        int a2 = com.bytedance.common.utility.g.a(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c());
        return a2 > 0 ? String.valueOf(a2) : "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceBrand() {
        return Build.BRAND;
    }

    public String getDeviceId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDevicePlatform() {
        return "android";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceType() {
        return Build.MODEL;
    }

    public String getGetDomainDefaultJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] b2 = ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).b();
        boolean z = false;
        if (b2.length > 0) {
            linkedHashMap.put("first", b2[0]);
        }
        if (b2.length > 1) {
            linkedHashMap.put("second", b2[1]);
        }
        if (b2.length > 2) {
            linkedHashMap.put("third", b2[2]);
        }
        Map<String, String> d2 = ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).d();
        HashMap hashMap = (HashMap) d2;
        if (TextUtils.isEmpty((CharSequence) hashMap.get(TTNetInit.DOMAIN_HTTPDNS_KEY)) || (TextUtils.isEmpty((CharSequence) hashMap.get(TTNetInit.DOMAIN_BOE_KEY)) && TextUtils.isEmpty((CharSequence) hashMap.get(TTNetInit.DOMAIN_BOE_HTTPS_KEY)))) {
            z = true;
        }
        if (z) {
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        linkedHashMap.putAll(d2);
        return linkedHashMap;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getHttpDnsRequestFlags() {
        return "0";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getIId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getIsDropFirstTnc() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getLanguage() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean getLazyInitCronetIPC() {
        return false;
    }

    public String getManifestVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getNetAccessType() {
        return NetworkUtils.d(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getNetworkOperator() {
        return TTNetInit.getSystemApiSandbox() == null ? "" : TTNetInit.getSystemApiSandbox().getNetworkOperator();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOSApi() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOSVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            return (str == null || str.length() <= 10) ? str : str.substring(0, 10);
        } catch (Exception unused) {
            return "";
        }
    }

    public ArrayList<byte[]> getOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOpenUdid() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean getOptInit() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean getOptNqeDefault() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean getOptNqePersist() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getProcessFlag() {
        return com.bytedance.frameworks.baselib.network.http.p.i.b();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, Pair<Integer, Integer>> getQuicHint() {
        return null;
    }

    public String getRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getResolution() {
        String b2 = com.bytedance.common.utility.g.b(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c());
        return !com.bytedance.android.input.k.b.a.Y(b2) ? b2 : "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSdkAppId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSdkVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSimOperator() {
        return TTNetInit.getSystemApiSandbox() == null ? "" : TTNetInit.getSystemApiSandbox().getSimOperator();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSsmix() {
        return "a";
    }

    public String getStoreIdc() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getStoreIdcRuleJSON() {
        return null;
    }

    public String getSysRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getTNCRequestFlags() {
        return "0";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestHeader() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestQuery() {
        Object tTNetDepend = TTNetInit.getTTNetDepend();
        if (tTNetDepend != null && (tTNetDepend instanceof com.bytedance.ttnet.b)) {
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUUID() {
        return "";
    }

    public String getUpdateVersionCode() {
        return "-1";
    }

    public String getUserId() {
        return "";
    }

    public String getVersionCode() {
        return "-1";
    }

    public String getVersionName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public int getWifiFrequency() {
        if (TTNetInit.getSystemApiSandbox() == null) {
            return 0;
        }
        return TTNetInit.getSystemApiSandbox().getWifiFrequency();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public int getWifiRssi() {
        if (TTNetInit.getSystemApiSandbox() == null) {
            return 0;
        }
        return TTNetInit.getSystemApiSandbox().getWifiRssi();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isBOEProxyEnabled() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableBrotli() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableHttp2() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableQuic() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
        Logger.d(str, str2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        return Logger.debug();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean needCustomLoadLibrary() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry.getValue());
            hashMap.put(entry.getKey(), arrayList);
        }
        return com.bytedance.frameworks.baselib.network.http.f.P(str, hashMap);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onClientIPChanged(String str) {
        if (Logger.debug()) {
            Logger.d(TAG, "onClientIPChanged");
        }
        new g(this, str).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onColdStartFinish() {
        if (Logger.debug()) {
            Logger.d(TAG, "onColdStartFinish");
        }
        new f(this).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onCronetBootSucceed() {
        if (Logger.debug()) {
            Logger.d(TAG, "onCronetBootSucceed... ");
        }
        new m(this).a();
    }

    public void onCronetMappingRequestStatus(String str, int i2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onDropReasonChanged(boolean z, List<Integer> list) {
        if (Logger.debug()) {
            Logger.d(TAG, "onDropReasonChanged");
        }
        new j(this, z, list).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onEffectiveConnectionTypeChanged(int i2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onEffectiveConnectionTypeChangedOnIOThread(int i2) {
        if (Logger.debug()) {
            Logger.d(TAG, "onEffectiveConnectionTypeChangedOnIOThread type = " + i2);
        }
        new t(i2).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onMappingRequestStatus(String str, int i2) {
        if (Logger.debug()) {
            Logger.d(TAG, "onMappingRequestStatus key = " + str + " status: " + i2);
        }
        new s(str, i2).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onMultiNetworkStateChanged(int i2, int i3) {
        if (Logger.debug()) {
            Logger.d(TAG, "onMultiNetStateChanged prev state = " + i2 + ", curr state = " + i3);
        }
        new b(this, i2, i3).a();
    }

    public void onNQEEffectiveConnectionTypeChanged(int i2) {
    }

    public void onNQEPacketLossComputed(int i2, double d2, double d3, double d4, double d5) {
    }

    public void onNQERTTOrThroughputComputed(int i2, int i3, int i4) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onNetworkQualityLevelChanged(int i2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onNetworkQualityLevelChangedOnIOThread(int i2) {
        if (Logger.debug()) {
            Logger.d(TAG, "onNetworkQualityLevelChangedOnIOThread nql: " + i2);
        }
        new d(i2).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onNetworkQualityRttAndThroughputNotified(int i2, int i3, int i4) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onNetworkQualityRttAndThroughputNotifiedOnIOThread(int i2, int i3, int i4) {
        if (Logger.debug()) {
            e.a.a.a.a.D0(e.a.a.a.a.O("onNetworkQualityRttAndThroughputNotifiedOnIOThread, effectiveHrttMs: ", i2, ", effectiveTrttMs: ", i3, ", effectiveRxThroughputKbps: "), i4, TAG);
        }
        new e(i2, i3, i4).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onPacketLossComputed(int i2, double d2, double d3, double d4, double d5) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onPacketLossComputedOnIOThread(int i2, double d2, double d3, double d4, double d5) {
        if (Logger.debug()) {
            Logger.d(TAG, "onPacketLossComputed protocol = " + i2 + ", upstreamLossRate = " + d2 + ", upstreamLossRateVariance = " + d3 + ", downstreamLossRate = " + d4 + ", downstreamLossRateVariance = " + d5);
        }
        new v(i2, d2, d3, d4, d5).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onPublicIPsChanged(List<String> list, List<String> list2) {
        if (Logger.debug()) {
            Logger.d(TAG, "onPublicIPsChanged");
        }
        new h(this, list, list2).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onRTTOrThroughputEstimatesComputed(int i2, int i3, int i4) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onRTTOrThroughputEstimatesComputedOnIOThread(int i2, int i3, int i4) {
        if (Logger.debug()) {
            e.a.a.a.a.D0(e.a.a.a.a.O("onRTTOrThroughputEstimatesComputedOnIOThread httpRtt = ", i2, ", transportRttMs = ", i3, ",downstreamThroughputKbps = "), i4, TAG);
        }
        new u(i2, i3, i4).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigABTestChanged(String str) {
        try {
            new o(this, str).a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigEtagChanged(String str) {
        try {
            new k(this, str).a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigUpdated(String str) {
        try {
            if (Logger.debug()) {
                Logger.d(TAG, "config = " + str);
            }
            new p(this, str).a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5, String str6) {
        if (Logger.debug()) {
            Logger.d(TAG, "onStoreIdcChanged");
        }
        new i(this, str, str2, str3, str4, str5, str6).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTNCUpdateFailed(ArrayList<String> arrayList, String str) {
        if (Logger.debug()) {
            Logger.d(TAG, "onTNCUpdateFailed");
        }
        new l(this, arrayList, str).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTDnsResolveResult(String str, String str2, int i2, int i3, int i4, List<String> list, String str3) {
        if (Logger.debug()) {
            Logger.d(TAG, "onTTDnsResolveResult uuid = " + str + " host = " + str2);
        }
        new q(this, str, str2, i2, i3, i4, list, str3).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTNetDetectInfoChanged(String str) {
        if (Logger.debug()) {
            e.a.a.a.a.s0("onTTNetDetectInfoChanged result = ", str, TAG);
        }
        new r(str).a();
    }

    public void onTTNetDetectResult(String str) {
    }

    public void onTTNetworkStateChanged(int i2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onTncRequestSucceeded(boolean z, boolean z2, int i2) {
        try {
            if (Logger.debug()) {
                Logger.d(TAG, "stackOptEnabled = " + z);
            }
            new n(this, z, z2, i2).a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onUserSpecifiedNetworkEnabled(boolean z) {
        if (Logger.debug()) {
            Logger.d(TAG, "onUserSpecifiedNetworkEnabled enable = " + z);
        }
        new c(this, z).a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onWiFiToCellStateChanged(int i2, int i3) {
        if (Logger.debug()) {
            Logger.d(TAG, "onWiFiToCellStateChanged prev state = " + i2 + ", curr state = " + i3);
        }
        new a(i2, i3).a();
    }

    protected void onWiFiToCellStateChangedForApp(int i2, int i3) {
    }

    public void sendAppMonitorEvent(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
    }

    public final void tryStartTTNetDetect(List<String> list, int i2, int i3) {
    }
}
