package e.b.b.e.a.i;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private JSONObject A;
    private String B;
    private long D;
    private long E;
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f9384c;

    /* renamed from: d, reason: collision with root package name */
    private String f9385d;

    /* renamed from: e, reason: collision with root package name */
    private String f9386e;

    /* renamed from: f, reason: collision with root package name */
    private String f9387f;

    /* renamed from: g, reason: collision with root package name */
    private String f9388g;
    private String h;
    private String i;
    private String l;
    private int m;
    private String n;
    private String o;
    private String p;
    private String q;
    private long r;
    private String s;
    private String t;
    private String u;
    private long v;
    private long w;
    private String x;
    private JSONObject y;
    private JSONObject z;
    private String j = "Android";
    private String k = "android";
    private long C = -1;

    long A() {
        return this.v;
    }

    String B() {
        return this.f9385d;
    }

    String C() {
        return this.x;
    }

    String D() {
        return this.f9388g;
    }

    String E() {
        return this.h;
    }

    void F(int i) {
        this.a = i;
    }

    void G(int i) {
        this.m = i;
    }

    void H(String str) {
        this.f9386e = str;
    }

    void I(String str) {
        this.f9384c = str;
    }

    void J(long j) {
        this.C = j;
    }

    void K(String str) {
        this.B = str;
    }

    void L(String str) {
        this.o = str;
    }

    void M(String str) {
        this.b = str;
    }

    void N(String str) {
        this.p = str;
    }

    void O(String str) {
        this.n = str;
    }

    void P(String str) {
        this.k = str;
    }

    public void Q(JSONObject jSONObject) {
        this.y = null;
    }

    void R(JSONObject jSONObject) {
        this.A = jSONObject;
    }

    void S(String str) {
        this.f9387f = str;
    }

    void T(String str) {
        this.u = str;
    }

    public void U(long j) {
        this.E = j;
    }

    public void V(long j) {
        this.D = j;
    }

    void W(String str) {
        this.j = str;
    }

    void X(String str) {
        this.l = str;
    }

    void Y(String str) {
        this.t = str;
    }

    void Z(long j) {
        this.w = j;
    }

    int a() {
        return this.a;
    }

    void a0(String str) {
        this.q = str;
    }

    int b() {
        return this.m;
    }

    void b0(String str) {
        this.i = str;
    }

    String c() {
        return this.f9386e;
    }

    void c0(String str) {
        this.s = str;
    }

    String d() {
        return this.f9384c;
    }

    void d0(long j) {
        this.r = j;
    }

    long e() {
        return this.C;
    }

    public void e0(JSONObject jSONObject) {
        this.z = jSONObject;
    }

    String f() {
        return this.B;
    }

    void f0(long j) {
        this.v = j;
    }

    String g() {
        return this.o;
    }

    void g0(String str) {
        this.f9385d = str;
    }

    String h() {
        return this.b;
    }

    void h0(String str) {
        this.x = str;
    }

    String i() {
        return this.p;
    }

    void i0(String str) {
        this.f9388g = str;
    }

    String j() {
        return this.n;
    }

    void j0(String str) {
        this.h = str;
    }

    String k() {
        return this.k;
    }

    public JSONObject l() {
        return this.y;
    }

    JSONObject m() {
        return this.A;
    }

    String n() {
        return this.f9387f;
    }

    String o() {
        return this.u;
    }

    public long p() {
        return this.E;
    }

    public long q() {
        return this.D;
    }

    String r() {
        return this.j;
    }

    String s() {
        return this.l;
    }

    String t() {
        return this.t;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("HeaderInfo{aid=");
        M.append(this.a);
        M.append(", deviceId='");
        e.a.a.a.a.G0(M, this.b, '\'', ", channel='");
        e.a.a.a.a.G0(M, this.f9384c, '\'', ", updateVersionCode='");
        e.a.a.a.a.G0(M, this.f9385d, '\'', ", appVersion='");
        e.a.a.a.a.G0(M, this.f9386e, '\'', ", manifestVersionCode='");
        e.a.a.a.a.G0(M, this.f9387f, '\'', ", versionCode='");
        e.a.a.a.a.G0(M, this.f9388g, '\'', ", versionName='");
        e.a.a.a.a.G0(M, this.h, '\'', ", releaseBuild='");
        e.a.a.a.a.G0(M, this.i, '\'', ", os='");
        e.a.a.a.a.G0(M, this.j, '\'', ", devicePlatform='");
        e.a.a.a.a.G0(M, this.k, '\'', ", osVersion='");
        e.a.a.a.a.G0(M, this.l, '\'', ", apiVersion=");
        M.append(this.m);
        M.append(", deviceModel='");
        e.a.a.a.a.G0(M, this.n, '\'', ", deviceBrand='");
        e.a.a.a.a.G0(M, this.o, '\'', ", deviceManufacturer='");
        e.a.a.a.a.G0(M, this.p, '\'', ", processName='");
        e.a.a.a.a.G0(M, this.q, '\'', ", sid=");
        M.append(this.r);
        M.append(", romVersion='");
        e.a.a.a.a.G0(M, this.s, '\'', ", packageName='");
        e.a.a.a.a.G0(M, this.t, '\'', ", monitorVersion='");
        e.a.a.a.a.G0(M, this.u, '\'', ", uid=");
        M.append(this.v);
        M.append(", phoneStartTime=");
        M.append(this.w);
        M.append(", verifyInfo='");
        e.a.a.a.a.G0(M, this.x, '\'', ", dynamicExtra=");
        M.append(this.y);
        M.append(", stableExtra=");
        M.append(this.z);
        M.append(", filters=");
        M.append(this.A);
        M.append(", currentUpdateVersionCode='");
        return e.a.a.a.a.H(M, this.B, '\'', '}');
    }

    long u() {
        return this.w;
    }

    String v() {
        return this.q;
    }

    String w() {
        return this.i;
    }

    String x() {
        return this.s;
    }

    long y() {
        return this.r;
    }

    public JSONObject z() {
        return this.z;
    }
}
