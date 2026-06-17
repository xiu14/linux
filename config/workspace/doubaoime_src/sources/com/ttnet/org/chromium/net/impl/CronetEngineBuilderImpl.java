package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTSlaSamplingSetting;
import com.ttnet.org.chromium.net.TTThreadConfigInfoProvider$ThreadConfigInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class CronetEngineBuilderImpl extends com.ttnet.org.chromium.net.m {
    private long A;
    private String B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean F;
    private String G;
    private TTAppInfoProvider.AppInfo H;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f8646J;
    private boolean K;
    private long L;
    private ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> M;
    private com.ttnet.org.chromium.net.A N;
    private TTSamplingSettingProvider$TTSlaSamplingSetting O;
    private boolean P;
    private String Q;
    private final Context a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8648d;

    /* renamed from: e, reason: collision with root package name */
    private String f8649e;

    /* renamed from: f, reason: collision with root package name */
    private String f8650f;
    private HttpCacheMode j;
    private long k;
    private boolean l;
    private boolean n;
    private boolean o;
    private TTAppInfoProvider p;
    private com.ttnet.org.chromium.net.x q;
    private com.ttnet.org.chromium.net.w r;
    private String s;
    private ArrayList<byte[]> t;
    private Map<String[], Pair<byte[], byte[]>> u;
    private String v;
    private String w;
    private String x;
    private boolean y;
    private boolean z;
    private final List<b> b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    private final List<a> f8647c = new LinkedList();
    private int m = 20;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8651g = true;
    private boolean h = true;
    private boolean i = false;

    @VisibleForTesting
    enum HttpCacheMode {
        DISABLED(0, false),
        DISK(1, true),
        DISK_NO_HTTP(1, false),
        MEMORY(2, true);

        private final boolean mContentCacheEnabled;
        private final int mType;

        HttpCacheMode(int i, boolean z) {
            this.mContentCacheEnabled = z;
            this.mType = i;
        }

        @VisibleForTesting
        static HttpCacheMode fromPublicBuilderCacheMode(int i) {
            if (i == 0) {
                return DISABLED;
            }
            if (i == 1) {
                return MEMORY;
            }
            if (i == 2) {
                return DISK_NO_HTTP;
            }
            if (i == 3) {
                return DISK;
            }
            throw new IllegalArgumentException("Unknown public builder cache mode");
        }

        int getType() {
            return this.mType;
        }

        boolean isContentCacheEnabled() {
            return this.mContentCacheEnabled;
        }

        int toPublicBuilderCacheMode() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return 0;
            }
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 1;
            }
            throw new IllegalArgumentException("Unknown internal builder cache mode");
        }
    }

    public static class a {
    }

    public static class b {
        final String a;
        final int b;

        /* renamed from: c, reason: collision with root package name */
        final int f8652c;

        b(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.f8652c = i2;
        }
    }

    static {
        Pattern.compile("^[0-9\\.]*$");
    }

    public CronetEngineBuilderImpl(Context context, boolean z) {
        this.a = context.getApplicationContext();
        W(0, 0L);
        this.l = false;
        this.f8648d = true;
        this.n = false;
        this.C = false;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m A(boolean z, boolean z2) {
        this.f8646J = z;
        this.K = z2;
        return this;
    }

    @VisibleForTesting
    boolean A0() {
        return this.l;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m B(String str) {
        this.G = str;
        return this;
    }

    boolean B0() {
        return this.I;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m C(String str) {
        this.x = str;
        return this;
    }

    boolean C0() {
        return this.f8646J;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m D(TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSetting) {
        this.O = tTSamplingSettingProvider$TTSlaSamplingSetting;
        return this;
    }

    boolean D0() {
        return this.K;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m E(boolean z, String str) {
        this.P = z;
        this.Q = str;
        return this;
    }

    boolean E0() {
        return this.P;
    }

    @Override // com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m F(String str) {
        e1(str);
        return this;
    }

    String F0() {
        return this.G;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m G(String str) {
        this.w = str;
        return this;
    }

    int G0() {
        return this.j.toPublicBuilderCacheMode();
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m H(TTAppInfoProvider.AppInfo appInfo) {
        this.H = appInfo;
        return this;
    }

    @VisibleForTesting
    boolean H0() {
        return this.f8648d;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m I(long j) {
        this.L = j;
        return this;
    }

    List<a> I0() {
        return this.f8647c;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m J(com.ttnet.org.chromium.net.A a2) {
        this.N = a2;
        return this;
    }

    @VisibleForTesting
    boolean J0() {
        return this.f8651g;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m K(ArrayList arrayList) {
        this.M = arrayList;
        return this;
    }

    List<b> K0() {
        return this.b;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m L(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.m = i;
        return this;
    }

    TTSamplingSettingProvider$TTSlaSamplingSetting L0() {
        return this.O;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m M(String str) {
        this.f8649e = str;
        return this;
    }

    public CronetEngineBuilderImpl M0(long j) {
        this.A = j;
        return this;
    }

    TTAppInfoProvider.AppInfo N() {
        return this.H;
    }

    public CronetEngineBuilderImpl N0(TTAppInfoProvider tTAppInfoProvider) {
        this.p = tTAppInfoProvider;
        return this;
    }

    long O() {
        return this.A;
    }

    public CronetEngineBuilderImpl O0(com.ttnet.org.chromium.net.x xVar) {
        this.q = xVar;
        return this;
    }

    public CronetEngineBuilderImpl P(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException(e.a.a.a.a.s("Illegal QUIC Hint Host: ", str));
        }
        this.b.add(new b(str, i, i2));
        return this;
    }

    public CronetEngineBuilderImpl P0(int i) {
        this.D = i;
        return this;
    }

    boolean Q() {
        return this.y;
    }

    public CronetEngineBuilderImpl Q0(String str) {
        this.v = str;
        return this;
    }

    boolean R() {
        return this.i;
    }

    public CronetEngineBuilderImpl R0(Map<String[], Pair<byte[], byte[]>> map) {
        this.u = map;
        return this;
    }

    boolean S() {
        return !this.j.isContentCacheEnabled();
    }

    public CronetEngineBuilderImpl S0(com.ttnet.org.chromium.net.w wVar) {
        this.r = wVar;
        return this;
    }

    public CronetEngineBuilderImpl T(boolean z) {
        this.y = z;
        return this;
    }

    public CronetEngineBuilderImpl T0(String str) {
        this.s = str;
        return this;
    }

    public CronetEngineBuilderImpl U(boolean z) {
        this.i = z;
        return this;
    }

    public CronetEngineBuilderImpl U0(boolean z) {
        this.E = z;
        return this;
    }

    public CronetEngineBuilderImpl V(boolean z) {
        this.h = z;
        return this;
    }

    public CronetEngineBuilderImpl V0(boolean z) {
        this.F = z;
        return this;
    }

    public CronetEngineBuilderImpl W(int i, long j) {
        HttpCacheMode fromPublicBuilderCacheMode = HttpCacheMode.fromPublicBuilderCacheMode(i);
        if (fromPublicBuilderCacheMode.getType() == 1 && this.f8650f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.j = fromPublicBuilderCacheMode;
        this.k = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public CronetEngineBuilderImpl x(AbstractC0759g.a.AbstractC0400a abstractC0400a) {
        return this;
    }

    public CronetEngineBuilderImpl X(boolean z) {
        this.n = z;
        return this;
    }

    public CronetEngineBuilderImpl X0(ArrayList<byte[]> arrayList) {
        this.t = arrayList;
        return this;
    }

    public CronetEngineBuilderImpl Y(boolean z) {
        this.l = z;
        return this;
    }

    public CronetEngineBuilderImpl Y0(boolean z) {
        this.I = z;
        return this;
    }

    public CronetEngineBuilderImpl Z(boolean z) {
        this.f8651g = z;
        return this;
    }

    public CronetEngineBuilderImpl Z0(boolean z, boolean z2) {
        this.f8646J = z;
        this.K = z2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m a(String str, int i, int i2) {
        P(str, i, i2);
        return this;
    }

    public CronetEngineBuilderImpl a0(boolean z) {
        this.z = z;
        return this;
    }

    public CronetEngineBuilderImpl a1(String str) {
        this.G = str;
        return this;
    }

    public CronetEngineBuilderImpl b0() {
        this.o = true;
        return this;
    }

    public CronetEngineBuilderImpl b1(String str) {
        this.x = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m c(boolean z) {
        this.y = z;
        return this;
    }

    TTAppInfoProvider c0() {
        return this.p;
    }

    public CronetEngineBuilderImpl c1(TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSetting) {
        this.O = tTSamplingSettingProvider$TTSlaSamplingSetting;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m d(boolean z) {
        this.i = z;
        return this;
    }

    com.ttnet.org.chromium.net.x d0() {
        return this.q;
    }

    public CronetEngineBuilderImpl d1(boolean z, String str) {
        this.P = z;
        this.Q = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m e(boolean z) {
        this.h = z;
        return this;
    }

    int e0() {
        return this.D;
    }

    public CronetEngineBuilderImpl e1(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalArgumentException("create Storage path failed");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f8650f = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m f(int i, long j) {
        W(i, j);
        return this;
    }

    String f0() {
        return this.v;
    }

    public CronetEngineBuilderImpl f1(String str) {
        this.w = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m g(boolean z) {
        this.n = z;
        return this;
    }

    Map<String[], Pair<byte[], byte[]>> g0() {
        return this.u;
    }

    public CronetEngineBuilderImpl g1(TTAppInfoProvider.AppInfo appInfo) {
        this.H = appInfo;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m h(boolean z) {
        this.l = z;
        return this;
    }

    Context h0() {
        return this.a;
    }

    public CronetEngineBuilderImpl h1(long j) {
        this.L = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m i(boolean z) {
        this.f8651g = z;
        return this;
    }

    public String i0() {
        return this.B;
    }

    public CronetEngineBuilderImpl i1(com.ttnet.org.chromium.net.A a2) {
        this.N = a2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m j(boolean z) {
        this.z = z;
        return this;
    }

    String j0() {
        if (!this.f8651g) {
            return "";
        }
        Context context = this.a;
        int i = K.f8719c;
        return context.getPackageName() + " Cronet/TTNetVersion:8e1e9010 2026-04-20 QuicVersion:21ac1950 2025-11-18";
    }

    public CronetEngineBuilderImpl j1(ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> arrayList) {
        this.M = arrayList;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m k() {
        this.o = true;
        return this;
    }

    public String k0() {
        return K.a(this.a);
    }

    public CronetEngineBuilderImpl k1(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.m = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m l(boolean z) {
        this.C = z;
        return this;
    }

    com.ttnet.org.chromium.net.w l0() {
        return this.r;
    }

    public CronetEngineBuilderImpl l1(String str) {
        this.f8649e = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m m(long j) {
        this.A = j;
        return this;
    }

    String m0() {
        return this.s;
    }

    @VisibleForTesting
    String m1() {
        return this.f8650f;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m n(TTAppInfoProvider tTAppInfoProvider) {
        this.p = tTAppInfoProvider;
        return this;
    }

    boolean n0() {
        return this.C;
    }

    com.ttnet.org.chromium.net.A n1() {
        return this.N;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m o(com.ttnet.org.chromium.net.x xVar) {
        this.q = xVar;
        return this;
    }

    ArrayList<byte[]> o0() {
        return this.t;
    }

    ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> o1() {
        return this.M;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m p(int i) {
        this.D = i;
        return this;
    }

    String p0() {
        return this.x;
    }

    @VisibleForTesting
    int p1(int i) {
        int i2 = this.m;
        return i2 == 20 ? i : i2;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m q(String str) {
        this.v = str;
        return this;
    }

    String q0() {
        return this.w;
    }

    String q1() {
        return this.Q;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m r(Map map) {
        this.u = map;
        return this;
    }

    @VisibleForTesting
    String r0() {
        return this.f8649e;
    }

    boolean r1() {
        return this.z;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m s(String str) {
        this.B = str;
        return this;
    }

    @VisibleForTesting
    boolean s0() {
        return this.h;
    }

    long s1() {
        return this.L;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m t(com.ttnet.org.chromium.net.w wVar) {
        this.r = wVar;
        return this;
    }

    long t0() {
        return this.k;
    }

    boolean t1() {
        return this.o;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m u(String str) {
        this.s = str;
        return this;
    }

    @VisibleForTesting
    int u0() {
        return this.j.getType();
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m v(boolean z) {
        this.E = z;
        return this;
    }

    boolean v0() {
        return this.n;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m w(boolean z) {
        this.F = z;
        return this;
    }

    boolean w0() {
        return this.E;
    }

    boolean x0() {
        return this.F;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m y(ArrayList arrayList) {
        this.t = arrayList;
        return this;
    }

    L y0() {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.m z(boolean z) {
        this.I = z;
        return this;
    }

    public CronetEngineBuilderImpl z0(boolean z) {
        this.C = z;
        return this;
    }
}
