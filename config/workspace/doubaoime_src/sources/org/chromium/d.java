package org.chromium;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.frameworks.baselib.network.i.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static volatile d f10760d;
    private Object a;
    private ICronetAppProvider b;

    /* renamed from: c, reason: collision with root package name */
    private ICronetDepend f10761c;

    private d() {
    }

    private String J(String str) {
        try {
            Object obj = this.a;
            return obj == null ? "" : (String) com.bytedance.frameworks.baselib.network.i.a.b(obj).b(str).get();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static d U() {
        if (f10760d == null) {
            synchronized (d.class) {
                if (f10760d == null) {
                    f10760d = new d();
                }
            }
        }
        return f10760d;
    }

    public ArrayList<byte[]> A() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getOpaqueData();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (ArrayList) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getOpaqueData").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean B() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.getOptInit();
            }
            Object obj = this.a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getOptInit").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public Map<String, Pair<Integer, Integer>> C() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getQuicHint();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (Map) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getQuicHint").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String D() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getRegion");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getRegion();
    }

    public String E() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getSdkAppId");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getSdkAppId();
    }

    public String F() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getSdkVersion");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getSdkVersion();
    }

    public String G() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                return iCronetAppProvider == null ? "" : iCronetAppProvider.getSimOperator();
            }
            Object obj = this.a;
            return obj == null ? "" : (String) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getSimOperator").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public String H() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getStoreIdc");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getStoreIdc();
    }

    public String I() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getStoreIdcRuleJSON();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (String) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getStoreIdcRuleJSON").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String K() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getSysRegion");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getSysRegion();
    }

    public String L() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getTNCRequestFlags");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getTNCRequestFlags();
    }

    public Map<String, String> M() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getTNCRequestHeader();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (Map) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getTNCRequestHeader").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public Map<String, String> N() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getTNCRequestQuery();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (Map) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getTNCRequestQuery").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String O() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getUpdateVersionCode");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getUpdateVersionCode();
    }

    public String P() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getUserId");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getUserId();
    }

    public String Q() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getVersionCode");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getVersionCode();
    }

    public String R() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getVersionName");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getVersionName();
    }

    public int S() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return 0;
                }
                return iCronetAppProvider.getWifiFrequency();
            }
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return ((Integer) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getWifiFrequency").get()).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int T() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return 0;
                }
                return iCronetAppProvider.getWifiRssi();
            }
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return ((Integer) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getWifiRssi").get()).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public boolean V() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.isBOEProxyEnabled();
            }
            Object obj = this.a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("isBOEProxyEnabled").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean W() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.isEnableBrotli();
            }
            Object obj = this.a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("isEnableBrotli").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean X() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.isEnableHttp2();
            }
            Object obj = this.a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("isEnableHttp2").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean Y() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.isEnableQuic();
            }
            Object obj = this.a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("isEnableQuic").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean Z() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return false;
                }
                return iCronetAppProvider.needCustomLoadLibrary();
            }
            Object obj = this.a;
            if (obj == null) {
                return false;
            }
            return ((Boolean) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("needCustomLoadLibrary").get()).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void a(String str) {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                } else {
                    iCronetAppProvider.doLoadLibrary(str);
                }
            } else {
                Object obj = this.a;
                if (obj == null) {
                } else {
                    com.bytedance.frameworks.baselib.network.i.a.b(obj).a("doLoadLibrary", new Class[]{String.class}, str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Map<String, String> a0(String str, Map<String, String> map) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onCallToAddSecurityFactor info url = " + str);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.onCallToAddSecurityFactor(str, map);
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (Map) com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onCallToAddSecurityFactor", new Class[]{String.class, Map.class}, str, map).get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public List<String> b() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getAbSdkVersion();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (List) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getAbSdkVersion").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void b0(String str) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onClientIPChanged ");
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onClientIPChanged(str);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onClientIPChanged", new Class[]{String.class}, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String c() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getAbi");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getAbi();
    }

    public void c0() {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onColdStartFinish ");
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onColdStartFinish();
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).b("onColdStartFinish");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String d() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getAppId");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getAppId();
    }

    public void d0() {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onCronetBootSucceed ");
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onCronetBootSucceed();
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).b("onCronetBootSucceed");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String e() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getAppName");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getAppName();
    }

    public void e0(boolean z, List<Integer> list) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onDropReasonChanged " + z + ", Drop Reason List " + list);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onDropReasonChanged(z, list);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onDropReasonChanged", new Class[]{Boolean.TYPE, List.class}, Boolean.valueOf(z), list);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public long f() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return -1L;
                }
                return iCronetAppProvider.getAppStartTime();
            }
            Object obj = this.a;
            if (obj == null) {
                return -1L;
            }
            return ((Long) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getAppStartTime").get()).longValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return -1L;
        }
    }

    public void f0(int i) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onEffectiveConnectionTypeChanged type = " + i);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onEffectiveConnectionTypeChangedOnIOThread(i);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onEffectiveConnectionTypeChangedOnIOThread", new Class[]{Integer.TYPE}, Integer.valueOf(i));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String g() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getBypassBOEJSON();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (String) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getBypassBOEJSON").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void g0(String str, int i) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onMappingRequestStatus key = " + str + " status = " + i);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onMappingRequestStatus(str, i);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onMappingRequestStatus", new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String h() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getCarrierRegion");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getCarrierRegion();
    }

    public void h0(int i, int i2) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", e.a.a.a.a.l("onMultiNetworkStateChanged, prev state = ", i, ", curr state = ", i2));
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onMultiNetworkStateChanged(i, i2);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            a.b b = com.bytedance.frameworks.baselib.network.i.a.b(obj);
            Class<?> cls = Integer.TYPE;
            b.a("onMultiNetworkStateChanged", new Class[]{cls, cls}, Integer.valueOf(i), Integer.valueOf(i2)).get();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String i() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getChannel");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getChannel();
    }

    public void i0(int i) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onNetworkQualityLevelChanged, nql: " + i);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onNetworkQualityLevelChangedOnIOThread(i);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onNetworkQualityLevelChangedOnIOThread", new Class[]{Integer.TYPE}, Integer.valueOf(i)).get();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Map<String[], Pair<byte[], byte[]>> j() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getClientOpaqueData();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (Map) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getClientOpaqueData").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void j0(int i, int i2, int i3) {
        if (e.a().loggerDebug()) {
            e a = e.a();
            StringBuilder O = e.a.a.a.a.O("onNetworkQualityRttAndThroughputNotified, effectiveHrttMs: ", i, ", effectiveTrttMs: ", i2, ", effectiveRxThroughputKbps: ");
            O.append(i3);
            a.loggerD("CronetAppProviderManager", O.toString());
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onNetworkQualityRttAndThroughputNotifiedOnIOThread(i, i2, i3);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            a.b b = com.bytedance.frameworks.baselib.network.i.a.b(obj);
            Class<?> cls = Integer.TYPE;
            b.a("onNetworkQualityRttAndThroughputNotifiedOnIOThread", new Class[]{cls, cls, cls}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)).get();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String k() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getCronetSoPath();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (String) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getCronetSoPath").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void k0(int i) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onNetworkQualityTypeChangedV3, network_quality_type = " + i);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onEffectiveConnectionTypeChangedOnIOThread(i);
                com.bytedance.frameworks.baselib.network.i.a.e("com.bytedance.ttnet.NQEManager", null).a("notifyNQTChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            a.b b = com.bytedance.frameworks.baselib.network.i.a.b(obj);
            Class<?> cls = Integer.TYPE;
            b.a("onEffectiveConnectionTypeChangedOnIOThread", new Class[]{cls}, Integer.valueOf(i));
            com.bytedance.frameworks.baselib.network.i.a.d("com.bytedance.ttnet.NQEManager").a("notifyNQTChanged", new Class[]{cls}, Integer.valueOf(i));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String l() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getDeviceBrand");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDeviceBrand();
    }

    public void l0(int i, double d2, double d3, double d4, double d5) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onPacketLossComputed protocol = " + i + ", upstreamLossRate = " + d2 + ", upstreamLossRateVariance = " + d3 + ", downstreamLossRate = " + d4 + ", downstreamLossRateVariance = " + d5);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onPacketLossComputedOnIOThread(i, d2, d3, d4, d5);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            a.b b = com.bytedance.frameworks.baselib.network.i.a.b(obj);
            Class<?> cls = Double.TYPE;
            b.a("onPacketLossComputedOnIOThread", new Class[]{Integer.TYPE, cls, cls, cls, cls}, Integer.valueOf(i), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String m() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getDeviceId");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDeviceId();
    }

    public void m0(List<String> list, List<String> list2) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onPublicIPsChanged ");
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onPublicIPsChanged(list, list2);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onPublicIPsChanged", new Class[]{List.class, List.class}, list, list2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String n() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getDeviceModel");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDeviceModel();
    }

    public void n0(int i, int i2, int i3) {
        if (e.a().loggerDebug()) {
            e a = e.a();
            StringBuilder O = e.a.a.a.a.O("onRTTOrThroughputEstimatesComputed httpRtt = ", i, ", transportRttMs = ", i2, ",downstreamThroughputKbps = ");
            O.append(i3);
            a.loggerD("CronetAppProviderManager", O.toString());
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onRTTOrThroughputEstimatesComputedOnIOThread(i, i2, i3);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            a.b b = com.bytedance.frameworks.baselib.network.i.a.b(obj);
            Class<?> cls = Integer.TYPE;
            b.a("onRTTOrThroughputEstimatesComputedOnIOThread", new Class[]{cls, cls, cls}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String o() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getDevicePlatform");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDevicePlatform();
    }

    public void o0(String str, String str2, String str3) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onServerConfigUpdated json = " + str);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onServerConfigEtagChanged(str2);
                this.b.onServerConfigABTestChanged(str3);
                this.b.onServerConfigUpdated(str);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onServerConfigEtagChanged", new Class[]{String.class}, str2);
            com.bytedance.frameworks.baselib.network.i.a.b(this.a).a("onServerConfigABTestChanged", new Class[]{String.class}, str3);
            com.bytedance.frameworks.baselib.network.i.a.b(this.a).a("onServerConfigUpdated", new Class[]{String.class}, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String p() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getDeviceType");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getDeviceType();
    }

    public void p0(String str, String str2, String str3, String str4, String str5, String str6) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onStoreIdcChanged ");
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onStoreIdcChanged(str, str2, str3, str4, str5, str6);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onStoreIdcChanged", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5, str6);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String q() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getGetDomainDefaultJSON();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (String) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getGetDomainDefaultJSON").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void q0(String[] strArr, String str) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onTNCUpdateFailed ");
        }
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    Collections.addAll(arrayList, strArr);
                    if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                        ICronetAppProvider iCronetAppProvider = this.b;
                        if (iCronetAppProvider == null) {
                        } else {
                            iCronetAppProvider.onTNCUpdateFailed(arrayList, str);
                        }
                    } else {
                        Object obj = this.a;
                        if (obj == null) {
                        } else {
                            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onTNCUpdateFailed", new Class[]{ArrayList.class, String.class}, arrayList, str);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public Map<String, String> r() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                return iCronetAppProvider == null ? Collections.emptyMap() : iCronetAppProvider.getGetDomainDependHostMap();
            }
            Object obj = this.a;
            return obj == null ? Collections.emptyMap() : (Map) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getGetDomainDependHostMap").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return Collections.emptyMap();
        }
    }

    public void r0(String str, String str2, int i, int i2, int i3, List<String> list, String str3) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", e.a.a.a.a.u("onTTDnsResolveResult info uuid = ", str, " host: ", str2));
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onTTDnsResolveResult(str, str2, i, i2, i3, list, str3);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            a.b b = com.bytedance.frameworks.baselib.network.i.a.b(obj);
            Class<?> cls = Integer.TYPE;
            b.a("onTTDnsResolveResult", new Class[]{String.class, String.class, cls, cls, cls, List.class, String.class}, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list, str3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String s() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getHttpDnsRequestFlags");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getHttpDnsRequestFlags();
    }

    public void s0(String str) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onTTNetDetectInfoChanged info str = " + str);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onTTNetDetectInfoChanged(str);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String t() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getAppInitialRegionInfo");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getAppInitialRegionInfo();
    }

    public void t0(boolean z, boolean z2, int i) {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                } else {
                    iCronetAppProvider.onTncRequestSucceeded(z, z2, i);
                }
            } else {
                Object obj = this.a;
                if (obj == null) {
                    return;
                }
                a.b b = com.bytedance.frameworks.baselib.network.i.a.b(obj);
                Class<?> cls = Boolean.TYPE;
                b.a("onTncRequestSucceeded", new Class[]{cls, cls, Integer.TYPE}, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i)).get();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String u() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return null;
                }
                return iCronetAppProvider.getIsDropFirstTnc();
            }
            Object obj = this.a;
            if (obj == null) {
                return null;
            }
            return (String) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getIsDropFirstTnc").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public void u0(boolean z) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", "onUserSpecifiedNetworkEnabled, enable = " + z);
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onUserSpecifiedNetworkEnabled(z);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("onUserSpecifiedNetworkEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String v() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getManifestVersionCode");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getManifestVersionCode();
    }

    public void v0(int i, int i2) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", e.a.a.a.a.l("onWiFiToCellStateChanged, prev state = ", i, ", curr state = ", i2));
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.onWiFiToCellStateChanged(i, i2);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            a.b b = com.bytedance.frameworks.baselib.network.i.a.b(obj);
            Class<?> cls = Integer.TYPE;
            b.a("onWiFiToCellStateChanged", new Class[]{cls, cls}, Integer.valueOf(i), Integer.valueOf(i2)).get();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String w() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getNetAccessType");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getNetAccessType();
    }

    public void w0(String str, String str2) {
        if (e.a().loggerDebug()) {
            e.a().loggerD("CronetAppProviderManager", e.a.a.a.a.u("Send monitor json = ", str, ", log type =", str2));
        }
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                if (iCronetAppProvider == null) {
                    return;
                }
                iCronetAppProvider.sendAppMonitorEvent(str, str2);
                return;
            }
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            com.bytedance.frameworks.baselib.network.i.a.b(obj).a("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String x() {
        try {
            if (com.bytedance.frameworks.baselib.network.http.f.j()) {
                ICronetAppProvider iCronetAppProvider = this.b;
                return iCronetAppProvider == null ? "" : iCronetAppProvider.getNetworkOperator();
            }
            Object obj = this.a;
            return obj == null ? "" : (String) com.bytedance.frameworks.baselib.network.i.a.b(obj).b("getNetworkOperator").get();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public void x0(Object obj) {
        List h;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                if (cls != null && (h = org.apache.http.conn.ssl.d.h(cls)) != null && !h.isEmpty()) {
                    Iterator it2 = h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if ("com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider".equals(((Class) it2.next()).getName())) {
                            if (e.a().loggerDebug()) {
                                e.a().loggerD("CronetAppProviderManager", "inject CronetAppProviderManager success");
                            }
                            this.a = obj;
                        }
                    }
                }
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (obj instanceof ICronetAppProvider) {
            this.b = (ICronetAppProvider) obj;
        }
        if (obj instanceof ICronetDepend) {
            this.f10761c = (ICronetDepend) obj;
        }
    }

    public String y() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getOSApi");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getOSApi();
    }

    public String z() {
        if (!com.bytedance.frameworks.baselib.network.http.f.j()) {
            return J("getOSVersion");
        }
        ICronetAppProvider iCronetAppProvider = this.b;
        return iCronetAppProvider == null ? "" : iCronetAppProvider.getOSVersion();
    }
}
