package com.ttnet.org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.Process;
import androidx.annotation.VisibleForTesting;
import com.bytedance.retrofit2.I;
import com.bytedance.retrofit2.RetrofitMetrics;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.ttnet.org.chromium.base.PowerMonitor;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.UsedByReflection;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.B;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTSlaSamplingSetting;
import com.ttnet.org.chromium.net.TTThreadConfigInfoProvider$BindCore;
import com.ttnet.org.chromium.net.TTThreadConfigInfoProvider$ThreadType;
import com.ttnet.org.chromium.net.impl.CronetLogger;
import com.ttnet.org.chromium.net.u;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import com.ttnet.org.chromium.net.z;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@UsedByReflection
@VisibleForTesting
/* loaded from: classes2.dex */
public class CronetUrlRequestContext extends AbstractC0763c {
    private static final HashSet<String> P = new HashSet<>();
    public static final /* synthetic */ int Q = 0;
    private double[] A;
    private TTAppInfoProvider B;
    private com.ttnet.org.chromium.net.x C;
    private com.ttnet.org.chromium.net.w D;
    private boolean E;
    private final Object F;
    private com.ttnet.org.chromium.net.A G;
    private Map<TTThreadConfigInfoProvider$ThreadType, Integer> H;
    private Map<TTThreadConfigInfoProvider$ThreadType, TTThreadConfigInfoProvider$BindCore> I;

    /* renamed from: J, reason: collision with root package name */
    private final ConditionVariable f8681J;
    private final String K;
    private long L;
    private final int M;
    private final boolean N;
    private final CronetLogger O;
    private final Object a;
    private final ConditionVariable b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f8682c;

    /* renamed from: d, reason: collision with root package name */
    private long f8683d;

    /* renamed from: e, reason: collision with root package name */
    private Thread f8684e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8685f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f8686g;
    private final Object h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final com.ttnet.org.chromium.base.g<M> m;
    private final com.ttnet.org.chromium.base.g<N> n;
    private final Map<u.a, O> o;
    private final Object p;
    private int q;
    private int r;
    private int s;
    private int t;
    private String[] u;
    private int[] v;
    private int[] w;
    private double[] x;
    private double[] y;
    private double[] z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetLibraryLoader.b();
            J.N.MhrJ$_b0();
            PowerMonitor.m(CronetUrlRequestContext.this.E);
            PowerMonitor.j();
            synchronized (CronetUrlRequestContext.this.a) {
                J.N.Mdu$OLLN(CronetUrlRequestContext.this.f8683d, CronetUrlRequestContext.this);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ URLDispatch a;

        b(CronetUrlRequestContext cronetUrlRequestContext, URLDispatch uRLDispatch) {
            this.a = uRLDispatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a();
        }
    }

    class c implements Runnable {
        final /* synthetic */ O a;
        final /* synthetic */ com.ttnet.org.chromium.net.u b;

        c(CronetUrlRequestContext cronetUrlRequestContext, O o, com.ttnet.org.chromium.net.u uVar) {
            this.a = o;
            this.b = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b);
        }
    }

    @UsedByReflection
    public CronetUrlRequestContext(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        boolean MLLAskZ0;
        Object obj = new Object();
        this.a = obj;
        this.b = new ConditionVariable(false);
        this.f8682c = new AtomicInteger(0);
        this.f8686g = new Object();
        this.h = new Object();
        this.i = 0;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        com.ttnet.org.chromium.base.g<M> gVar = new com.ttnet.org.chromium.base.g<>();
        this.m = gVar;
        com.ttnet.org.chromium.base.g<N> gVar2 = new com.ttnet.org.chromium.base.g<>();
        this.n = gVar2;
        this.o = new HashMap();
        this.p = new Object();
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.x = new double[]{-1.0d, -1.0d};
        this.y = new double[]{-1.0d, -1.0d};
        this.z = new double[]{-1.0d, -1.0d};
        this.A = new double[]{-1.0d, -1.0d};
        Object obj2 = new Object();
        this.F = obj2;
        this.H = new HashMap();
        this.I = new HashMap();
        this.f8681J = new ConditionVariable();
        this.L = -1L;
        int hashCode = hashCode();
        this.M = hashCode;
        gVar.g();
        gVar2.g();
        this.f8685f = cronetEngineBuilderImpl.A0();
        CronetLibraryLoader.a(cronetEngineBuilderImpl.h0(), cronetEngineBuilderImpl);
        J.N.MyyJ5zsH(3);
        if (cronetEngineBuilderImpl.u0() == 1) {
            String m1 = cronetEngineBuilderImpl.m1();
            this.K = m1;
            HashSet<String> hashSet = P;
            synchronized (hashSet) {
                if (!hashSet.add(m1)) {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        } else {
            this.K = null;
        }
        this.B = cronetEngineBuilderImpl.c0();
        this.C = cronetEngineBuilderImpl.d0();
        this.D = cronetEngineBuilderImpl.l0();
        this.E = cronetEngineBuilderImpl.n0();
        synchronized (obj2) {
            this.G = cronetEngineBuilderImpl.n1();
        }
        synchronized (obj) {
            long MuixiOYs = J.N.MuixiOYs(d0(cronetEngineBuilderImpl));
            this.f8683d = MuixiOYs;
            if (MuixiOYs == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
            MLLAskZ0 = J.N.MLLAskZ0(MuixiOYs, this);
            this.N = MLLAskZ0;
        }
        if (MLLAskZ0) {
            this.O = C0765e.b();
        } else {
            this.O = C0765e.a(cronetEngineBuilderImpl.h0(), g0());
        }
        try {
            this.O.a(hashCode, new CronetLogger.a(cronetEngineBuilderImpl), new CronetLogger.c("Cronet/107.0.5273.2@8e1e9010".split("/")[1].split("@")[0]), g0());
        } catch (RuntimeException e2) {
            com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Error while trying to log CronetEngine creation: ", e2);
        }
        CronetLibraryLoader.d(new a());
    }

    @CalledByNative
    private String[] addSecurityFactor(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            hashMap.put(strArr[i2].toLowerCase(Locale.US), strArr[i2 + 1]);
        }
        Map<String, String> k0 = k0(str, hashMap);
        if (k0 == null) {
            return null;
        }
        String[] strArr2 = new String[k0.size() * 2];
        for (Map.Entry<String, String> entry : k0.entrySet()) {
            strArr2[i] = entry.getKey();
            strArr2[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr2;
    }

    private void b0() throws IllegalStateException {
        if (!(this.f8683d != 0)) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private String c0(Map<String, String> map) {
        String str = "";
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!key.isEmpty() && !value.isEmpty()) {
                    str = e.a.a.a.a.v(key, Constants.COLON_SEPARATOR, value, "\r\n", str);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long d0(com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl r30) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.d0(com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl):long");
    }

    static CronetLogger.CronetSource g0() {
        return AbstractC0759g.class.getClassLoader().equals(CronetUrlRequest.class.getClassLoader()) ? CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED : CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.net.UnknownHostException] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.net.ConnectException] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.net.SocketTimeoutException] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.net.ConnectException] */
    /* JADX WARN: Type inference failed for: r1v33, types: [g.a.b.c.a] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.net.SocketException] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.net.NoRouteToHostException] */
    @CalledByNative
    private void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        int i3;
        NetworkExceptionImpl networkExceptionImpl;
        com.ttnet.org.chromium.net.x xVar = this.C;
        if (xVar != null) {
            Objects.requireNonNull((org.chromium.c) xVar);
            com.bytedance.frameworks.baselib.network.http.b o = com.bytedance.frameworks.baselib.network.http.b.o();
            o.G = str2;
            o.s = str3;
            o.f5084e = j;
            o.f5085f = j;
            o.f5086g = j2;
            RetrofitMetrics retrofitMetrics = o.f5083d;
            I.b bVar = retrofitMetrics.E0.a;
            bVar.l = j2;
            o.j = j5;
            bVar.w = j5;
            retrofitMetrics.a0(j6);
            o.f5083d.d0(j7);
            o.f5083d.f0(j8);
            o.f5083d.c0(j9);
            o.f5083d.e0(j11);
            o.f5083d.b0(j10);
            o.f5083d.g0(j5 - j2);
            o.f5083d.i0(str4);
            o.h = j3;
            o.i = j4;
            o.w = z2;
            o.u = j12;
            o.D = str5;
            o.E = str6;
            o.x = 0;
            if (z) {
                com.bytedance.frameworks.baselib.network.http.f.r(str, o);
                return;
            }
            switch (i) {
                case 1:
                    i3 = 1;
                    break;
                case 2:
                    i3 = 2;
                    break;
                case 3:
                    i3 = 3;
                    break;
                case 4:
                    i3 = 4;
                    break;
                case 5:
                    i3 = 5;
                    break;
                case 6:
                    i3 = 6;
                    break;
                case 7:
                    i3 = 7;
                    break;
                case 8:
                    i3 = 8;
                    break;
                case 9:
                    i3 = 9;
                    break;
                case 10:
                    i3 = 10;
                    break;
                case 11:
                    i3 = 11;
                    break;
                default:
                    if (org.chromium.e.a().loggerDebug()) {
                        org.chromium.e.a().loggerD("monitor", "Unknown error code: " + i);
                    }
                    i3 = i;
                    break;
            }
            NetworkExceptionImpl networkExceptionImpl2 = new NetworkExceptionImpl(e.a.a.a.a.s("Exception in CronetUrlRequest: ", str7), i3, i2);
            switch (networkExceptionImpl2.getErrorCode()) {
                case 1:
                    networkExceptionImpl = new UnknownHostException(networkExceptionImpl2.getMessage());
                    break;
                case 2:
                case 3:
                    networkExceptionImpl = new ConnectException(networkExceptionImpl2.getMessage());
                    break;
                case 4:
                    networkExceptionImpl = new SocketTimeoutException(networkExceptionImpl2.getMessage());
                    break;
                case 5:
                case 7:
                    networkExceptionImpl = new ConnectException(networkExceptionImpl2.getMessage());
                    break;
                case 6:
                    networkExceptionImpl = new g.a.b.c.a(networkExceptionImpl2.getMessage());
                    break;
                case 8:
                    StringBuilder M = e.a.a.a.a.M("reset by peer ");
                    M.append(networkExceptionImpl2.getMessage());
                    networkExceptionImpl = new SocketException(M.toString());
                    break;
                case 9:
                    networkExceptionImpl = new NoRouteToHostException(networkExceptionImpl2.getMessage());
                    break;
            }
            networkExceptionImpl2 = networkExceptionImpl;
            com.bytedance.frameworks.baselib.network.http.f.o(str, o, networkExceptionImpl2);
        }
    }

    @CalledByNative
    private boolean handleApiSample(String str, String str2) {
        com.ttnet.org.chromium.net.x xVar = this.C;
        if (xVar == null) {
            return false;
        }
        Objects.requireNonNull(xVar);
        return true;
    }

    private void i0(int i) {
        if (!this.f8685f) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        if (i != 0 && i != 1) {
            throw new IllegalStateException(e.a.a.a.a.j("Error protocol: ", i));
        }
    }

    @CalledByNative
    private void initNetworkThread() {
        this.f8684e = Thread.currentThread();
        this.b.open();
        Thread currentThread = Thread.currentThread();
        StringBuilder M = e.a.a.a.a.M("ChromiumNet");
        M.append(Process.getThreadPriority(0));
        currentThread.setName(M.toString());
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            wVar.d();
        }
    }

    private static void n0(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e2) {
            com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception posting task to executor", e2);
        }
    }

    @CalledByNative
    private void onClientIPChanged(String str) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            wVar.a(str);
        }
    }

    @CalledByNative
    private void onColdStartFinish() {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            wVar.b();
        }
    }

    @CalledByNative
    private void onContextInitCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, String str, String str2) {
        com.prolificinteractive.materialcalendarview.r.f8226e = str;
        com.prolificinteractive.materialcalendarview.r.f8227f = str2;
        this.b.open();
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            wVar.c(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
        }
    }

    @CalledByNative
    private void onDropReasonChanged(boolean z, int[] iArr) {
        if (this.D != null) {
            List<Integer> arrayList = new ArrayList<>();
            if (iArr != null) {
                arrayList = (List) Arrays.stream(iArr).boxed().collect(Collectors.toList());
            }
            this.D.e(z, arrayList);
        }
    }

    @CalledByNative
    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.f8686g) {
            this.i = i;
            com.ttnet.org.chromium.net.w wVar = this.D;
            if (wVar != null) {
                Objects.requireNonNull((org.chromium.f) wVar);
                org.chromium.d.U().f0(i);
            }
        }
    }

    @CalledByNative
    private TTAppInfoProvider.AppInfo onGetAppInfo() {
        TTAppInfoProvider tTAppInfoProvider = this.B;
        if (tTAppInfoProvider != null) {
            return tTAppInfoProvider.a();
        }
        return null;
    }

    @CalledByNative
    private void onGroupRTTOrThroughputEstimatesComputed(String[] strArr, int[] iArr, int[] iArr2) {
        synchronized (this.f8686g) {
            this.u = strArr;
            this.v = iArr;
            this.w = iArr2;
        }
    }

    @CalledByNative
    private void onMultiNetworkStateChanged(int i, int i2) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            Objects.requireNonNull((org.chromium.f) wVar);
            org.chromium.d.U().h0(i, i2);
        }
    }

    @CalledByNative
    private void onNQLChanged(int i) {
        synchronized (this.p) {
            this.q = i;
            com.ttnet.org.chromium.net.w wVar = this.D;
            if (wVar != null) {
                Objects.requireNonNull((org.chromium.f) wVar);
                org.chromium.d.U().i0(i);
            }
        }
    }

    @CalledByNative
    private void onNetworkQualityRttAndThroughputNotified(int i, int i2, int i3) {
        synchronized (this.p) {
            this.r = i;
            this.s = i2;
            this.t = i3;
            com.ttnet.org.chromium.net.w wVar = this.D;
            if (wVar != null) {
                Objects.requireNonNull((org.chromium.f) wVar);
                org.chromium.d.U().j0(i, i2, i3);
            }
        }
    }

    @CalledByNative
    private void onNetworkQualityTypeChangedV3(int i) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            Objects.requireNonNull((org.chromium.f) wVar);
            org.chromium.d.U().k0(i);
        }
    }

    @CalledByNative
    private void onPacketLossComputed(int i, double d2, double d3, double d4, double d5) {
        synchronized (this.f8686g) {
            if (i != 0 && i != 1) {
                com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Error protocol from native. Protocol: " + i, new Object[0]);
                return;
            }
            this.x[i] = d2;
            this.y[i] = d3;
            this.z[i] = d4;
            this.A[i] = d5;
            com.ttnet.org.chromium.net.w wVar = this.D;
            if (wVar != null) {
                Objects.requireNonNull((org.chromium.f) wVar);
                org.chromium.d.U().l0(i, d2, d3, d4, d5);
            }
        }
    }

    @CalledByNative
    private void onPublicIPsChanged(String[] strArr, String[] strArr2) {
        if (this.D != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            Collections.addAll(arrayList, strArr);
            Collections.addAll(arrayList2, strArr2);
            this.D.f(arrayList, arrayList2);
        }
    }

    @CalledByNative
    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.f8686g) {
            this.j = i;
            this.k = i2;
            this.l = i3;
            com.ttnet.org.chromium.net.w wVar = this.D;
            if (wVar != null) {
                Objects.requireNonNull((org.chromium.f) wVar);
                org.chromium.d.U().n0(i, i2, i3);
            }
        }
    }

    @CalledByNative
    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.f8686g) {
            Iterator<M> it2 = this.m.iterator();
            if (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
                throw null;
            }
        }
    }

    @CalledByNative
    private void onSendAppMonitorEvent(String str, String str2) {
        com.ttnet.org.chromium.net.x xVar = this.C;
        if (xVar != null) {
            Objects.requireNonNull((org.chromium.c) xVar);
            org.chromium.d.U().w0(str, str2);
        }
    }

    @CalledByNative
    private void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5, String str6) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            wVar.h(str, str2, str3, str4, str5, str6);
        }
    }

    @CalledByNative
    private void onTLBDecompressFail() {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            Objects.requireNonNull((org.chromium.f) wVar);
            TTRequestCompressManager.t = Boolean.TRUE;
        }
    }

    @CalledByNative
    private void onTNCConfigChanged(String str, String str2, String str3) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            wVar.g(str, str2, str3);
        }
    }

    @CalledByNative
    private void onTNCRequestSucceeded(boolean z, boolean z2, int i) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            Objects.requireNonNull((org.chromium.f) wVar);
            org.chromium.d.U().t0(z, z2, i);
        }
    }

    @CalledByNative
    private void onTNCUpdateFailed(String[] strArr, String str) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            wVar.i(strArr, str);
        }
    }

    @CalledByNative
    private void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, String[] strArr, String str3) {
        int length = strArr.length;
        ArrayList arrayList = new ArrayList(strArr.length);
        Collections.addAll(arrayList, strArr);
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            Objects.requireNonNull((org.chromium.f) wVar);
            org.chromium.d.U().r0(str, str2, i, i2, i3, arrayList, str3);
        }
    }

    @CalledByNative
    private void onTTNetDetectInfoChanged(String str) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            wVar.j(str);
        }
    }

    @CalledByNative
    private void onThreadIdChanged(int[] iArr) {
        synchronized (this.F) {
            for (int i = 0; i < iArr.length - 1; i += 2) {
                TTThreadConfigInfoProvider$ThreadType tTThreadConfigInfoProvider$ThreadType = TTThreadConfigInfoProvider$ThreadType.values()[iArr[i]];
                int i2 = iArr[i + 1];
                this.H.put(tTThreadConfigInfoProvider$ThreadType, Integer.valueOf(i2));
                if (this.I.containsKey(tTThreadConfigInfoProvider$ThreadType) && this.G != null) {
                    int ordinal = this.I.get(tTThreadConfigInfoProvider$ThreadType).ordinal();
                    if (ordinal == 1) {
                        this.G.bindBigCore(i2);
                    } else if (ordinal == 2) {
                        this.G.bindLittleCore(i2);
                    } else if (ordinal == 3) {
                        this.G.resetCoreBind(i2);
                    }
                }
            }
        }
    }

    @CalledByNative
    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.f8686g) {
            Iterator<N> it2 = this.n.iterator();
            if (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
                throw null;
            }
        }
    }

    @CalledByNative
    private void onUrlDispatchComplete(URLDispatch uRLDispatch, String str, String str2, String str3, String str4) {
        uRLDispatch.g(str, str2, str3, str4);
        uRLDispatch.f(new b(this, uRLDispatch));
    }

    @CalledByNative
    private void onUserSpecifiedNetworkEnabled(boolean z) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            Objects.requireNonNull((org.chromium.f) wVar);
            org.chromium.d.U().u0(z);
        }
    }

    @CalledByNative
    private void onWiFiToCellStateChanged(int i, int i2) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar != null) {
            Objects.requireNonNull((org.chromium.f) wVar);
            org.chromium.d.U().v0(i, i2);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void A(String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (this.a) {
            J.N.MU6k4d25(this.f8683d, this, str, str2, str3, str4, str5, str6);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void B(String str, int i, Map<String, String> map) {
        synchronized (this.a) {
            b0();
            J.N.MBtj30QU(this.f8683d, this, str, i, c0(map));
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void C(String str) {
        synchronized (this.a) {
            J.N.Mcfn2q8$(this.f8683d, this, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void D(String str) {
        synchronized (this.a) {
            J.N.MPONMQm_(this.f8683d, this, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void E(int i) {
        synchronized (this.F) {
            if (this.G == null) {
                return;
            }
            TTThreadConfigInfoProvider$ThreadType tTThreadConfigInfoProvider$ThreadType = TTThreadConfigInfoProvider$ThreadType.values()[i];
            if (this.H.containsKey(tTThreadConfigInfoProvider$ThreadType)) {
                this.G.resetCoreBind(this.H.get(tTThreadConfigInfoProvider$ThreadType).intValue());
            } else {
                this.I.put(tTThreadConfigInfoProvider$ThreadType, TTThreadConfigInfoProvider$BindCore.CANCEL_BIND);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void F(boolean z) {
        synchronized (this.a) {
            J.N.MWOUQ7KG(this.f8683d, this, z);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void G(long j) {
        synchronized (this.a) {
            b0();
            com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Set alog func addr: " + j, new Object[0]);
            J.N.Me3xdZoU(this.f8683d, this, j);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void H(int i) {
        synchronized (this.a) {
            J.N.MksRT8QX(this.f8683d, this, i);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void I() {
        synchronized (this.a) {
            J.N.MaSOyuXL(this.f8683d, this);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void J(String str) {
        synchronized (this.a) {
            b0();
            J.N.MlH1XMiR(this.f8683d, this, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void K(String str) {
        synchronized (this.a) {
            J.N.Mj4Pi_Pa(this.f8683d, this, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void L(String str, String str2) {
        synchronized (this.a) {
            J.N.MhbNiNFL(this.f8683d, this, str, str2);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void M(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        synchronized (this.a) {
            try {
                try {
                    b0();
                    J.N.MIs1FVFz(this.f8683d, this, j, j2, j3, j4, j5, j6, j7, j8);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void N(String[] strArr, int i, long j) {
        synchronized (this.a) {
            b0();
            J.N.MiGn0DCY(this.f8683d, this, strArr, i, j);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void O(String[] strArr, int i) {
        synchronized (this.a) {
            b0();
            J.N.MohL$06P(this.f8683d, this, strArr, i);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void P(boolean z) {
        synchronized (this.a) {
            J.N.MN8yyQkr(this.f8683d, this, z);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void Q(String[] strArr, int i, int i2) {
        synchronized (this.a) {
            J.N.MA5SsGAv(this.f8683d, this, strArr, i, i2);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void R(String str, int i, String str2, Map<String, String> map) {
        synchronized (this.a) {
            J.N.MH0muaR3(this.f8683d, this, str, i, str2, c0(map));
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public Map<String, String> S(String str, int i, boolean z) throws IOException {
        URLDispatch uRLDispatch = new URLDispatch(str);
        synchronized (this.a) {
            b0();
            J.N.MRTGlzo1(this.f8683d, this, uRLDispatch, str, z);
        }
        uRLDispatch.h(i);
        HashMap hashMap = new HashMap();
        hashMap.put("final_url", uRLDispatch.d());
        hashMap.put("epoch", uRLDispatch.b());
        hashMap.put("etag", uRLDispatch.c());
        hashMap.put("ttnet_origin_host", uRLDispatch.e());
        return hashMap;
    }

    @Override // com.ttnet.org.chromium.net.k
    public void T(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        synchronized (this.a) {
            try {
                try {
                    J.N.MqjX8qD1(this.f8683d, this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC0763c
    protected com.ttnet.org.chromium.net.z U(z.b bVar, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        return new TTCronetNetExpRequest(this, bVar, executor, i, list, i2, i3, i4);
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC0763c
    public H V(String str, F.b bVar, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, u.a aVar, int i4, long j) {
        Object obj;
        long j2 = j == -1 ? this.L : j;
        Object obj2 = this.a;
        synchronized (obj2) {
            try {
                b0();
                obj = obj2;
                try {
                    CronetUrlRequest cronetUrlRequest = new CronetUrlRequest(this, str, i, bVar, executor, null, z, z2, z3, z4, i2, z5, i3, aVar, i4, j2);
                    return cronetUrlRequest;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC0763c
    public com.ttnet.org.chromium.net.B W(B.b bVar, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        return new CronetWebsocketConnection(this, bVar, executor, list, i, str, j, i2, j2, str2, i3, null, map, map2, z);
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC0763c
    public com.ttnet.org.chromium.net.B X(B.b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return new CronetWebsocketConnection(this, bVar, executor, list, map, map2, z);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC0759g
    public com.ttnet.org.chromium.net.y a() {
        return new TTCronetMpaService(this);
    }

    @Override // com.ttnet.org.chromium.net.k, com.ttnet.org.chromium.net.AbstractC0759g
    public F.a c(String str, F.b bVar, Executor executor) {
        return new I(str, bVar, executor, this);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC0759g
    public URLConnection e(URL url, Proxy proxy, boolean z) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new CronetHttpURLConnection(url, this, z);
        }
        throw new UnsupportedOperationException(e.a.a.a.a.s("Unexpected protocol:", protocol));
    }

    int e0() {
        return this.M;
    }

    @Override // com.ttnet.org.chromium.net.k
    public void f(String[] strArr, byte[] bArr, byte[] bArr2, long j, long j2) {
        synchronized (this.a) {
            J.N.MWb1lJ5e(this.f8683d, this, strArr, bArr, bArr2, j, j2);
        }
    }

    CronetLogger f0() {
        return this.O;
    }

    @Override // com.ttnet.org.chromium.net.k
    public void g(TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSetting) {
        synchronized (this.a) {
            b0();
            J.N.MKYzOUkj(this.f8683d, this, tTSamplingSettingProvider$TTSlaSamplingSetting);
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void h(int i) {
        synchronized (this.F) {
            if (this.G == null) {
                return;
            }
            TTThreadConfigInfoProvider$ThreadType tTThreadConfigInfoProvider$ThreadType = TTThreadConfigInfoProvider$ThreadType.values()[i];
            if (this.H.containsKey(tTThreadConfigInfoProvider$ThreadType)) {
                this.G.bindBigCore(this.H.get(tTThreadConfigInfoProvider$ThreadType).intValue());
            } else {
                this.I.put(tTThreadConfigInfoProvider$ThreadType, TTThreadConfigInfoProvider$BindCore.BIG_CORE);
            }
        }
    }

    @VisibleForTesting
    public long h0() {
        long j;
        synchronized (this.a) {
            b0();
            j = this.f8683d;
        }
        return j;
    }

    @Override // com.ttnet.org.chromium.net.k
    public void i(int i) {
        synchronized (this.F) {
            if (this.G == null) {
                return;
            }
            TTThreadConfigInfoProvider$ThreadType tTThreadConfigInfoProvider$ThreadType = TTThreadConfigInfoProvider$ThreadType.values()[i];
            if (this.H.containsKey(tTThreadConfigInfoProvider$ThreadType)) {
                this.G.bindLittleCore(this.H.get(tTThreadConfigInfoProvider$ThreadType).intValue());
            } else {
                this.I.put(tTThreadConfigInfoProvider$ThreadType, TTThreadConfigInfoProvider$BindCore.LITTLE_CORE);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.k
    public void j() {
        synchronized (this.a) {
            J.N.MK0SE_Ub(this.f8683d, this);
        }
    }

    public boolean j0(Thread thread) {
        return thread == this.f8684e;
    }

    @Override // com.ttnet.org.chromium.net.k
    public void k(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        synchronized (this.a) {
            J.N.M2ni33Tk(this.f8683d, this, z, str, str2, str3, z2, str4);
        }
    }

    Map<String, String> k0(String str, Map<String, String> map) {
        com.ttnet.org.chromium.net.w wVar = this.D;
        if (wVar == null) {
            return null;
        }
        return org.chromium.d.U().a0(str, map);
    }

    @Override // com.ttnet.org.chromium.net.k
    public double l(int i) {
        double d2;
        i0(i);
        synchronized (this.f8686g) {
            d2 = this.x[i];
        }
        return d2;
    }

    void l0() {
        this.f8682c.decrementAndGet();
    }

    @Override // com.ttnet.org.chromium.net.k
    public double m(int i) {
        double d2;
        i0(i);
        synchronized (this.f8686g) {
            d2 = this.A[i];
        }
        return d2;
    }

    void m0() {
        this.f8682c.incrementAndGet();
    }

    @Override // com.ttnet.org.chromium.net.k
    public int n() {
        int i;
        if (!this.f8685f) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f8686g) {
            i = this.l;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int o() {
        int i;
        if (!this.f8685f) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f8686g) {
            i = this.i;
        }
        return i;
    }

    void o0(com.ttnet.org.chromium.net.u uVar) {
        synchronized (this.h) {
            if (this.o.isEmpty()) {
                return;
            }
            Iterator it2 = new ArrayList(this.o.values()).iterator();
            while (it2.hasNext()) {
                O o = (O) it2.next();
                n0(o.a(), new c(this, o, uVar));
            }
        }
    }

    @CalledByNative
    String onRequestInterceptorToStart(String str, String[] strArr, String[] strArr2) {
        if (this.D == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < strArr.length; i += 2) {
            hashMap.put(strArr[i].toLowerCase(Locale.US), strArr[i + 1]);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr2) {
            arrayList.add(str2);
        }
        Objects.requireNonNull(this.D);
        return null;
    }

    @CalledByNative
    String onResponseInterceptorToStart(String str, String[] strArr, int i) {
        if (this.D == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2].toLowerCase(Locale.US), strArr[i2 + 1]));
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            ArrayList arrayList2 = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList2.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList2.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList2));
        }
        Objects.requireNonNull(this.D);
        return null;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int p() {
        int i;
        synchronized (this.p) {
            i = this.r;
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int q() {
        int i;
        synchronized (this.p) {
            i = this.t;
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int r() {
        int i;
        synchronized (this.p) {
            i = this.s;
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.k
    public Map<String, int[]> s() {
        if (!this.f8685f) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        HashMap hashMap = new HashMap();
        synchronized (this.f8686g) {
            if (this.u == null) {
                return hashMap;
            }
            int i = 0;
            while (true) {
                String[] strArr = this.u;
                if (i >= strArr.length) {
                    return hashMap;
                }
                hashMap.put(strArr[i], new int[]{this.v[i], this.w[i]});
                i++;
            }
        }
    }

    @CalledByNative
    public void stopNetLogCompleted() {
        this.f8681J.open();
    }

    @Override // com.ttnet.org.chromium.net.k
    public int t() {
        int i;
        if (!this.f8685f) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f8686g) {
            i = this.j;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int u() {
        int i;
        synchronized (this.p) {
            i = this.q;
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.k
    public List<Long> v() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            for (long j : J.N.MlOQJZ8w()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int w() {
        int i;
        if (!this.f8685f) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.f8686g) {
            i = this.k;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // com.ttnet.org.chromium.net.k
    public double x(int i) {
        double d2;
        i0(i);
        synchronized (this.f8686g) {
            d2 = this.x[i];
        }
        return d2;
    }

    @Override // com.ttnet.org.chromium.net.k
    public double y(int i) {
        double d2;
        i0(i);
        synchronized (this.f8686g) {
            d2 = this.y[i];
        }
        return d2;
    }
}
