package e.b.b.f.d;

import java.util.List;

/* loaded from: classes.dex */
public class a {
    private long a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f9435c;

    /* renamed from: d, reason: collision with root package name */
    private int f9436d;

    /* renamed from: e, reason: collision with root package name */
    private int f9437e;

    /* renamed from: f, reason: collision with root package name */
    private int f9438f;

    /* renamed from: g, reason: collision with root package name */
    private int f9439g;
    private long h;
    private List<String> i;
    private List<String> j;
    private List<String> k;
    private boolean l;

    public List<String> a() {
        return this.k;
    }

    public List<String> b() {
        return this.i;
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.f9435c;
    }

    public long e() {
        return this.b;
    }

    public List<String> f() {
        return this.j;
    }

    public long g() {
        return this.h;
    }

    public int h() {
        return this.f9439g;
    }

    public int i() {
        return this.f9437e;
    }

    public int j() {
        return this.f9438f;
    }

    public boolean k() {
        return this.l;
    }

    public void l(List<String> list) {
        this.k = list;
    }

    public void m(List<String> list) {
        this.i = list;
    }

    public void n(long j) {
        this.a = j;
    }

    public void o(long j) {
        this.f9435c = j;
    }

    public void p(long j) {
        this.b = j;
    }

    public void q(List<String> list) {
        this.j = list;
    }

    public void r(long j) {
        this.h = j;
    }

    public void s(int i) {
        this.f9439g = i;
    }

    public void t(int i) {
        this.f9436d = i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DiskConfig{diskThresholdBytes=");
        M.append(this.a);
        M.append(", folderThresholdBytes=");
        M.append(this.b);
        M.append(", fileThresholdBytes=");
        M.append(this.f9435c);
        M.append(", reportMaxCount=");
        M.append(this.f9436d);
        M.append(", reportMaxOutdatedCount=");
        M.append(this.f9437e);
        M.append(", reportMaxTopCount=");
        M.append(this.f9438f);
        M.append(", reportExceptionDirMaxCount=");
        M.append(this.f9439g);
        M.append(", outdatedIntervalMs=");
        M.append(this.h);
        M.append(", customRelativePaths=");
        M.append(this.i);
        M.append(", ignoredRelativePaths=");
        M.append(this.j);
        M.append(", complianceRelativePaths=");
        M.append(this.k);
        M.append(", isSample=");
        return e.a.a.a.a.L(M, this.l, '}');
    }

    public void u(int i) {
        this.f9437e = i;
    }

    public void v(int i) {
        this.f9438f = i;
    }

    public void w(boolean z) {
        this.l = z;
    }
}
