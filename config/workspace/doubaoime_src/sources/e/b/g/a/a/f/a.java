package e.b.g.a.a.f;

/* loaded from: classes.dex */
public class a {
    public long a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f9516c;

    /* renamed from: d, reason: collision with root package name */
    public String f9517d;

    /* renamed from: e, reason: collision with root package name */
    public String f9518e;

    /* renamed from: f, reason: collision with root package name */
    public long f9519f;

    public a() {
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("LocalLog{id=");
        M.append(this.a);
        M.append(", aid=");
        M.append(this.b);
        M.append(", type='");
        e.a.a.a.a.G0(M, this.f9516c, '\'', ", type2='");
        e.a.a.a.a.G0(M, this.f9517d, '\'', ", data='");
        e.a.a.a.a.G0(M, this.f9518e, '\'', ", createTime=");
        return e.a.a.a.a.E(M, this.f9519f, '}');
    }

    public a(long j, String str) {
        this.a = j;
        this.f9518e = str;
    }

    public a(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.f9516c = str2;
        this.f9517d = str3;
        this.f9518e = str4;
        this.f9519f = j;
    }
}
