package com.bytedance.monitor.collector;

/* loaded from: classes.dex */
public class i {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5454c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5455d;

    /* renamed from: e, reason: collision with root package name */
    private long f5456e;

    /* renamed from: f, reason: collision with root package name */
    private int f5457f;

    public static class a {
        private boolean a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5458c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5459d;

        /* renamed from: e, reason: collision with root package name */
        private long f5460e;

        /* renamed from: f, reason: collision with root package name */
        private int f5461f;

        public a g(long j) {
            this.f5460e = j;
            return this;
        }

        public a h(boolean z) {
            this.a = z;
            return this;
        }

        public a i(boolean z) {
            this.b = z;
            return this;
        }

        public a j(boolean z) {
            this.f5458c = z;
            return this;
        }

        public a k(boolean z) {
            this.f5459d = z;
            return this;
        }

        public a l(int i) {
            this.f5461f = i;
            return this;
        }
    }

    public i(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.f5454c = aVar.f5458c;
        this.f5456e = aVar.f5460e;
        this.f5457f = aVar.f5461f;
        this.f5455d = aVar.f5459d;
    }

    public long a() {
        return this.f5456e;
    }

    public int b() {
        return this.f5457f;
    }

    public boolean c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.f5454c;
    }

    public boolean f() {
        return this.f5455d;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MonitorConfig{enableAtrace=");
        M.append(this.a);
        M.append(", enableBinder=");
        M.append(this.b);
        M.append(", enableLooperMonitor=");
        M.append(this.f5454c);
        M.append(", enableStackSampling=");
        M.append(this.f5455d);
        M.append(", atraceTag=");
        M.append(this.f5456e);
        M.append(", runMode=");
        M.append(this.f5457f);
        M.append(", alogRef=");
        M.append(0L);
        M.append('}');
        return M.toString();
    }
}
