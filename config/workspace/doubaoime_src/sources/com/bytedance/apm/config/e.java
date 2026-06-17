package com.bytedance.apm.config;

/* loaded from: classes.dex */
public class e {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private long f3409c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3410d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3411e;

    /* renamed from: f, reason: collision with root package name */
    private int f3412f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3413g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private boolean n;
    private boolean o;

    public int a() {
        return this.f3412f;
    }

    public long b() {
        return this.l;
    }

    public long c() {
        return this.h;
    }

    public long d() {
        return this.m;
    }

    public boolean e() {
        return this.f3410d;
    }

    public boolean f() {
        return this.n;
    }

    public boolean g() {
        return this.o;
    }

    public boolean h() {
        return this.f3411e;
    }

    public boolean i() {
        return this.f3413g;
    }

    public void j(long j) {
        this.f3409c = j;
    }

    public void k(boolean z) {
        this.f3410d = z;
    }

    public void l(boolean z) {
        this.n = z;
    }

    public void m(int i) {
        this.f3412f = i;
    }

    public void n(long j) {
        this.l = j;
    }

    public void o(boolean z) {
        this.j = z;
    }

    public void p(boolean z) {
        this.o = z;
    }

    public void q(boolean z) {
        this.f3411e = z;
    }

    public void r(boolean z) {
        this.a = z;
    }

    public void s(boolean z) {
        this.b = z;
    }

    public void t(boolean z) {
        this.k = z;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("FluencyConfig{enableStackSampling=");
        M.append(this.a);
        M.append(", enableTrace=");
        M.append(this.b);
        M.append(", atraceTag=");
        M.append(this.f3409c);
        M.append(", blockDumpStackEnable=");
        M.append(this.f3410d);
        M.append(", enableGfxMonitor=");
        M.append(this.f3411e);
        M.append(", blockMonitorMode=");
        M.append(this.f3412f);
        M.append(", seriousBlockEnableUpload=");
        M.append(this.f3413g);
        M.append(", seriousBlockThreshold=");
        M.append(this.h);
        M.append(", slowMethodEnableUpload=");
        M.append(this.i);
        M.append(", dropEnableUpload=");
        M.append(this.j);
        M.append(", fpsEnableUpload=");
        M.append(this.k);
        M.append(", blockThreshold=");
        M.append(this.l);
        M.append(", slowMethodDropThreshold=");
        M.append(this.m);
        M.append(", blockEnableUpload=");
        M.append(this.n);
        M.append(", dropSlowMethodSwitch=");
        return e.a.a.a.a.L(M, this.o, '}');
    }

    public void u(boolean z) {
        this.f3413g = z;
    }

    public void v(long j) {
        this.h = j;
    }

    public void w(long j) {
        this.m = j;
    }

    public void x(boolean z) {
        this.i = z;
    }
}
