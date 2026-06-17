package com.bytedance.apm.config;

import androidx.annotation.Nullable;
import com.bytedance.apm.launch.c;

/* loaded from: classes.dex */
public class b {
    private int a;

    /* renamed from: c, reason: collision with root package name */
    private long f3381c;

    /* renamed from: d, reason: collision with root package name */
    private long f3382d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3384f;

    /* renamed from: g, reason: collision with root package name */
    private long f3385g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private long l;
    private com.bytedance.apm.config.a m;
    private boolean o;
    private com.bytedance.apm.r.f p;
    private boolean b = false;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.apm.G.a f3383e = null;
    private com.bytedance.apm.launch.c n = null;

    /* renamed from: com.bytedance.apm.config.b$b, reason: collision with other inner class name */
    public static final class C0115b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f3388e;

        /* renamed from: g, reason: collision with root package name */
        private boolean f3390g;
        private com.bytedance.apm.config.a j;
        private boolean k;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3389f = false;
        private int a = 1000;
        private long b = 20000;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3386c = false;

        /* renamed from: d, reason: collision with root package name */
        private long f3387d = 1000;
        private int h = 0;
        private long i = 30000;
        private com.bytedance.apm.r.f l = new com.bytedance.apm.r.d();

        C0115b(a aVar) {
        }

        static /* synthetic */ long j(C0115b c0115b) {
            return 15000L;
        }

        public C0115b n(boolean z) {
            this.f3390g = z;
            return this;
        }

        public C0115b o(int i) {
            this.a = i;
            return this;
        }

        public C0115b p(com.bytedance.apm.config.a aVar) {
            this.j = aVar;
            return this;
        }

        public C0115b q(boolean z) {
            this.f3389f = z;
            return this;
        }

        public C0115b r(long j) {
            this.f3387d = j;
            return this;
        }

        public C0115b s(boolean z) {
            this.f3388e = z;
            return this;
        }

        public C0115b t(long j) {
            this.b = j;
            return this;
        }

        public C0115b u(boolean z) {
            this.f3386c = z;
            return this;
        }

        public C0115b v(boolean z) {
            this.k = z;
            return this;
        }

        @Deprecated
        public C0115b w(long j) {
            this.i = j;
            return this;
        }

        @Deprecated
        public C0115b x(int i) {
            this.h = i;
            return this;
        }
    }

    public b(C0115b c0115b) {
        this.a = c0115b.a;
        this.f3381c = c0115b.b;
        this.f3382d = C0115b.j(c0115b);
        this.f3384f = c0115b.f3386c;
        this.f3385g = c0115b.f3387d;
        this.h = c0115b.f3388e;
        this.i = c0115b.f3389f;
        this.j = c0115b.f3390g;
        this.l = c0115b.i;
        this.k = c0115b.h;
        this.m = c0115b.j;
        this.o = c0115b.k;
        com.bytedance.apm.g.M(false);
        com.bytedance.apm.g.Y(false);
        this.p = c0115b.l;
    }

    public static C0115b a() {
        return new C0115b(null);
    }

    @Nullable
    public com.bytedance.apm.config.a b() {
        return this.m;
    }

    @Nullable
    public com.bytedance.apm.r.f c() {
        return this.p;
    }

    public int d() {
        return this.a;
    }

    public long e() {
        return this.f3385g;
    }

    @Nullable
    public com.bytedance.apm.launch.c f() {
        if (this.n == null) {
            this.n = new c.a().a();
        }
        return this.n;
    }

    public long g() {
        return this.f3382d;
    }

    public long h() {
        return this.f3381c;
    }

    public long i() {
        long a2 = com.bytedance.apm.launch.a.b().a().a();
        return a2 != -1 ? a2 : this.l;
    }

    public int j() {
        return this.k;
    }

    @Nullable
    public com.bytedance.apm.G.a k() {
        return this.f3383e;
    }

    public boolean l() {
        return this.i;
    }

    public boolean m() {
        return this.j;
    }

    public boolean n() {
        return this.h;
    }

    public boolean o() {
        return this.f3384f;
    }

    public boolean p() {
        return this.b;
    }

    public boolean q() {
        return this.o;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ApmInitConfig{mCacheBufferCount=");
        M.append(this.a);
        M.append(", isReportCacheException=");
        M.append(false);
        M.append(", mViewIdmonitorPageSwitch=");
        M.append(this.b);
        M.append(", mMaxValidPageLoadTimeMs=");
        M.append(this.f3381c);
        M.append(", mMaxValidLaunchTimeMs=");
        M.append(this.f3382d);
        M.append(", mTraceListener=");
        M.append(this.f3383e);
        M.append(", mReportEvilMethodSwitch=");
        M.append(this.f3384f);
        M.append(", mEvilMethodThresholdMs=");
        M.append(this.f3385g);
        M.append(", mLimitEvilMethodDepth=");
        M.append(false);
        M.append(", mFullFpsTracer=");
        M.append(this.h);
        M.append(", mDisableFpsTracer=");
        M.append(false);
        M.append(", mChangeFpsLifeCycle=");
        M.append(false);
        M.append(", mActivityFps=");
        M.append(this.i);
        M.append(", mBinderMonitor=");
        M.append(this.j);
        M.append(", mTraceExtraFlag=");
        M.append(this.k);
        M.append(", mTraceExtraCollectTimeMs=");
        M.append(this.l);
        M.append(", mActivityLeakDetectConfig=");
        M.append(this.m);
        M.append(", mIgnoreNetMonitorUserAgentLabel='");
        M.append((String) null);
        M.append('\'');
        M.append(", mProcessName='");
        M.append((String) null);
        M.append('\'');
        M.append(", mEnableDeviceInfoOnPerfData=");
        M.append(false);
        M.append(", mLaunchConfig=");
        M.append(this.n);
        M.append(", mSupportMultiFrameRate=");
        M.append(this.o);
        M.append(", mEnableSliverDump=");
        M.append(false);
        M.append(", mEnableCpuAllocOpt=");
        M.append(false);
        M.append(", mEnableLooperOpt=");
        M.append(false);
        M.append(", mAlogUploadStrategy=");
        M.append(this.p);
        M.append('}');
        return M.toString();
    }
}
