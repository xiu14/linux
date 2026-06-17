package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class iu implements jf<iu, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f762a;

    /* renamed from: a, reason: collision with other field name */
    public long f763a;

    /* renamed from: a, reason: collision with other field name */
    public ii f764a;

    /* renamed from: a, reason: collision with other field name */
    public ij f765a;

    /* renamed from: a, reason: collision with other field name */
    public String f766a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f768a;

    /* renamed from: b, reason: collision with other field name */
    public int f770b;

    /* renamed from: b, reason: collision with other field name */
    public long f771b;

    /* renamed from: b, reason: collision with other field name */
    public String f772b;

    /* renamed from: c, reason: collision with other field name */
    public int f774c;

    /* renamed from: c, reason: collision with other field name */
    public String f775c;

    /* renamed from: d, reason: collision with other field name */
    public int f777d;

    /* renamed from: d, reason: collision with other field name */
    public String f778d;

    /* renamed from: e, reason: collision with other field name */
    public int f779e;

    /* renamed from: e, reason: collision with other field name */
    public String f780e;

    /* renamed from: f, reason: collision with other field name */
    public String f781f;

    /* renamed from: g, reason: collision with other field name */
    public String f782g;

    /* renamed from: h, reason: collision with other field name */
    public String f783h;

    /* renamed from: i, reason: collision with other field name */
    public String f784i;

    /* renamed from: j, reason: collision with other field name */
    public String f785j;

    /* renamed from: k, reason: collision with other field name */
    public String f786k;

    /* renamed from: l, reason: collision with other field name */
    public String f787l;

    /* renamed from: m, reason: collision with other field name */
    public String f788m;

    /* renamed from: n, reason: collision with other field name */
    public String f789n;

    /* renamed from: o, reason: collision with other field name */
    public String f790o;

    /* renamed from: p, reason: collision with other field name */
    public String f791p;

    /* renamed from: q, reason: collision with other field name */
    public String f792q;

    /* renamed from: r, reason: collision with other field name */
    public String f793r;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f761a = new ju("XmPushActionRegistration");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9240c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9241d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9242e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9243f = new jm("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9244g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 11, 8);
    private static final jm i = new jm("", (byte) 11, 9);
    private static final jm j = new jm("", (byte) 11, 10);
    private static final jm k = new jm("", (byte) 11, 11);
    private static final jm l = new jm("", (byte) 11, 12);
    private static final jm m = new jm("", (byte) 8, 13);
    private static final jm n = new jm("", (byte) 8, 14);
    private static final jm o = new jm("", (byte) 11, 15);
    private static final jm p = new jm("", (byte) 11, 16);
    private static final jm q = new jm("", (byte) 11, 17);
    private static final jm r = new jm("", (byte) 11, 18);
    private static final jm s = new jm("", (byte) 8, 19);
    private static final jm t = new jm("", (byte) 8, 20);
    private static final jm u = new jm("", (byte) 2, 21);
    private static final jm v = new jm("", (byte) 10, 22);
    private static final jm w = new jm("", (byte) 10, 23);
    private static final jm x = new jm("", (byte) 11, 24);
    private static final jm y = new jm("", (byte) 11, 25);
    private static final jm z = new jm("", (byte) 2, 26);
    private static final jm A = new jm("", (byte) 13, 100);
    private static final jm B = new jm("", (byte) 2, 101);
    private static final jm C = new jm("", (byte) 11, 102);
    private static final jm D = new jm("", (byte) 8, 103);
    private static final jm E = new jm("", (byte) 8, 104);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f767a = new BitSet(10);

    /* renamed from: a, reason: collision with other field name */
    public boolean f769a = true;

    /* renamed from: c, reason: collision with other field name */
    public boolean f776c = false;

    /* renamed from: b, reason: collision with other field name */
    public boolean f773b = false;

    public boolean A() {
        return this.f768a != null;
    }

    public boolean B() {
        return this.f767a.get(7);
    }

    public boolean C() {
        return this.f793r != null;
    }

    public boolean D() {
        return this.f767a.get(8);
    }

    public boolean E() {
        return this.f767a.get(9);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m584a() {
        return this.f766a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m586b() {
        return this.f765a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m587c() {
        return this.f772b != null;
    }

    public boolean d() {
        return this.f775c != null;
    }

    public boolean e() {
        return this.f778d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iu)) {
            return m585a((iu) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f780e != null;
    }

    public boolean g() {
        return this.f781f != null;
    }

    public boolean h() {
        return this.f782g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f783h != null;
    }

    public boolean j() {
        return this.f784i != null;
    }

    public boolean k() {
        return this.f785j != null;
    }

    public boolean l() {
        return this.f786k != null;
    }

    public boolean m() {
        return this.f767a.get(0);
    }

    public boolean n() {
        return this.f767a.get(1);
    }

    public boolean o() {
        return this.f787l != null;
    }

    public boolean p() {
        return this.f788m != null;
    }

    public boolean q() {
        return this.f789n != null;
    }

    public boolean r() {
        return this.f790o != null;
    }

    public boolean s() {
        return this.f767a.get(2);
    }

    public boolean t() {
        return this.f764a != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        boolean z3 = false;
        if (m584a()) {
            sb.append("debug:");
            String str = this.f766a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (m586b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f765a;
            if (ijVar == null) {
                sb.append("null");
            } else {
                sb.append(ijVar);
            }
        } else {
            z3 = z2;
        }
        if (!z3) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f772b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.as.a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f775c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str4 = this.f778d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f780e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(", ");
        sb.append("token:");
        String str6 = this.f781f;
        if (str6 == null) {
            sb.append("null");
        } else {
            sb.append(str6);
        }
        if (h()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str7 = this.f782g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str8 = this.f783h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            String str9 = this.f784i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str10 = this.f785j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            String str11 = this.f786k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f762a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f770b);
        }
        if (o()) {
            sb.append(", ");
            sb.append("androidId:");
            String str12 = this.f787l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("imei:");
            String str13 = this.f788m;
            if (str13 == null) {
                sb.append("null");
            } else {
                sb.append(str13);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("serial:");
            String str14 = this.f789n;
            if (str14 == null) {
                sb.append("null");
            } else {
                sb.append(str14);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str15 = this.f790o;
            if (str15 == null) {
                sb.append("null");
            } else {
                sb.append(str15);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f774c);
        }
        if (t()) {
            sb.append(", ");
            sb.append("reason:");
            ii iiVar = this.f764a;
            if (iiVar == null) {
                sb.append("null");
            } else {
                sb.append(iiVar);
            }
        }
        if (u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f769a);
        }
        if (v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f763a);
        }
        if (w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f771b);
        }
        if (x()) {
            sb.append(", ");
            sb.append("subImei:");
            String str16 = this.f791p;
            if (str16 == null) {
                sb.append("null");
            } else {
                sb.append(str16);
            }
        }
        if (y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            String str17 = this.f792q;
            if (str17 == null) {
                sb.append("null");
            } else {
                sb.append(str17);
            }
        }
        if (z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f773b);
        }
        if (A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            Map<String, String> map = this.f768a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f776c);
        }
        if (C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            String str18 = this.f793r;
            if (str18 == null) {
                sb.append("null");
            } else {
                sb.append(str18);
            }
        }
        if (D()) {
            sb.append(", ");
            sb.append("xmsfHostVersionCode:");
            sb.append(this.f777d);
        }
        if (E()) {
            sb.append(", ");
            sb.append("pushBundleVersionCode:");
            sb.append(this.f779e);
        }
        sb.append(")");
        return sb.toString();
    }

    public boolean u() {
        return this.f767a.get(3);
    }

    public boolean v() {
        return this.f767a.get(4);
    }

    public boolean w() {
        return this.f767a.get(5);
    }

    public boolean x() {
        return this.f791p != null;
    }

    public boolean y() {
        return this.f792q != null;
    }

    public boolean z() {
        return this.f767a.get(6);
    }

    public String a() {
        return this.f772b;
    }

    public String b() {
        return this.f775c;
    }

    public iu c(String str) {
        this.f778d = str;
        return this;
    }

    public iu d(String str) {
        this.f780e = str;
        return this;
    }

    public iu e(String str) {
        this.f781f = str;
        return this;
    }

    public iu f(String str) {
        this.f782g = str;
        return this;
    }

    public iu g(String str) {
        this.f783h = str;
        return this;
    }

    public iu h(String str) {
        this.f786k = str;
        return this;
    }

    public iu i(String str) {
        this.f790o = str;
        return this;
    }

    public void j(boolean z2) {
        this.f767a.set(9, z2);
    }

    public iu a(String str) {
        this.f772b = str;
        return this;
    }

    public iu b(String str) {
        this.f775c = str;
        return this;
    }

    public String c() {
        return this.f781f;
    }

    public void d(boolean z2) {
        this.f767a.set(3, z2);
    }

    public void e(boolean z2) {
        this.f767a.set(4, z2);
    }

    public void f(boolean z2) {
        this.f767a.set(5, z2);
    }

    public void g(boolean z2) {
        this.f767a.set(6, z2);
    }

    public void h(boolean z2) {
        this.f767a.set(7, z2);
    }

    public void i(boolean z2) {
        this.f767a.set(8, z2);
    }

    public iu a(int i2) {
        this.f762a = i2;
        a(true);
        return this;
    }

    public iu b(int i2) {
        this.f770b = i2;
        b(true);
        return this;
    }

    public iu c(int i2) {
        this.f774c = i2;
        c(true);
        return this;
    }

    public iu d(int i2) {
        this.f779e = i2;
        j(true);
        return this;
    }

    public void a(boolean z2) {
        this.f767a.set(0, z2);
    }

    public void b(boolean z2) {
        this.f767a.set(1, z2);
    }

    public void c(boolean z2) {
        this.f767a.set(2, z2);
    }

    public iu a(ii iiVar) {
        this.f764a = iiVar;
        return this;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m583a();
        jpVar.a(f761a);
        if (this.f766a != null && m584a()) {
            jpVar.a(a);
            jpVar.a(this.f766a);
            jpVar.b();
        }
        if (this.f765a != null && m586b()) {
            jpVar.a(b);
            this.f765a.b(jpVar);
            jpVar.b();
        }
        if (this.f772b != null) {
            jpVar.a(f9240c);
            jpVar.a(this.f772b);
            jpVar.b();
        }
        if (this.f775c != null) {
            jpVar.a(f9241d);
            jpVar.a(this.f775c);
            jpVar.b();
        }
        if (this.f778d != null && e()) {
            jpVar.a(f9242e);
            jpVar.a(this.f778d);
            jpVar.b();
        }
        if (this.f780e != null && f()) {
            jpVar.a(f9243f);
            jpVar.a(this.f780e);
            jpVar.b();
        }
        if (this.f781f != null) {
            jpVar.a(f9244g);
            jpVar.a(this.f781f);
            jpVar.b();
        }
        if (this.f782g != null && h()) {
            jpVar.a(h);
            jpVar.a(this.f782g);
            jpVar.b();
        }
        if (this.f783h != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f783h);
            jpVar.b();
        }
        if (this.f784i != null && j()) {
            jpVar.a(j);
            jpVar.a(this.f784i);
            jpVar.b();
        }
        if (this.f785j != null && k()) {
            jpVar.a(k);
            jpVar.a(this.f785j);
            jpVar.b();
        }
        if (this.f786k != null && l()) {
            jpVar.a(l);
            jpVar.a(this.f786k);
            jpVar.b();
        }
        if (m()) {
            jpVar.a(m);
            jpVar.mo648a(this.f762a);
            jpVar.b();
        }
        if (n()) {
            jpVar.a(n);
            jpVar.mo648a(this.f770b);
            jpVar.b();
        }
        if (this.f787l != null && o()) {
            jpVar.a(o);
            jpVar.a(this.f787l);
            jpVar.b();
        }
        if (this.f788m != null && p()) {
            jpVar.a(p);
            jpVar.a(this.f788m);
            jpVar.b();
        }
        if (this.f789n != null && q()) {
            jpVar.a(q);
            jpVar.a(this.f789n);
            jpVar.b();
        }
        if (this.f790o != null && r()) {
            jpVar.a(r);
            jpVar.a(this.f790o);
            jpVar.b();
        }
        if (s()) {
            jpVar.a(s);
            jpVar.mo648a(this.f774c);
            jpVar.b();
        }
        if (this.f764a != null && t()) {
            jpVar.a(t);
            jpVar.mo648a(this.f764a.a());
            jpVar.b();
        }
        if (u()) {
            jpVar.a(u);
            jpVar.a(this.f769a);
            jpVar.b();
        }
        if (v()) {
            jpVar.a(v);
            jpVar.a(this.f763a);
            jpVar.b();
        }
        if (w()) {
            jpVar.a(w);
            jpVar.a(this.f771b);
            jpVar.b();
        }
        if (this.f791p != null && x()) {
            jpVar.a(x);
            jpVar.a(this.f791p);
            jpVar.b();
        }
        if (this.f792q != null && y()) {
            jpVar.a(y);
            jpVar.a(this.f792q);
            jpVar.b();
        }
        if (z()) {
            jpVar.a(z);
            jpVar.a(this.f773b);
            jpVar.b();
        }
        if (this.f768a != null && A()) {
            jpVar.a(A);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f768a.size()));
            for (Map.Entry<String, String> entry : this.f768a.entrySet()) {
                jpVar.a(entry.getKey());
                jpVar.a(entry.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        if (B()) {
            jpVar.a(B);
            jpVar.a(this.f776c);
            jpVar.b();
        }
        if (this.f793r != null && C()) {
            jpVar.a(C);
            jpVar.a(this.f793r);
            jpVar.b();
        }
        if (D()) {
            jpVar.a(D);
            jpVar.mo648a(this.f777d);
            jpVar.b();
        }
        if (E()) {
            jpVar.a(E);
            jpVar.mo648a(this.f779e);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m585a(iu iuVar) {
        if (iuVar == null) {
            return false;
        }
        boolean m584a = m584a();
        boolean m584a2 = iuVar.m584a();
        if ((m584a || m584a2) && !(m584a && m584a2 && this.f766a.equals(iuVar.f766a))) {
            return false;
        }
        boolean m586b = m586b();
        boolean m586b2 = iuVar.m586b();
        if ((m586b || m586b2) && !(m586b && m586b2 && this.f765a.m536a(iuVar.f765a))) {
            return false;
        }
        boolean m587c = m587c();
        boolean m587c2 = iuVar.m587c();
        if ((m587c || m587c2) && !(m587c && m587c2 && this.f772b.equals(iuVar.f772b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = iuVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f775c.equals(iuVar.f775c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = iuVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f778d.equals(iuVar.f778d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iuVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f780e.equals(iuVar.f780e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iuVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f781f.equals(iuVar.f781f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = iuVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f782g.equals(iuVar.f782g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = iuVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f783h.equals(iuVar.f783h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = iuVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f784i.equals(iuVar.f784i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = iuVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f785j.equals(iuVar.f785j))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = iuVar.l();
        if ((l2 || l3) && !(l2 && l3 && this.f786k.equals(iuVar.f786k))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = iuVar.m();
        if ((m2 || m3) && !(m2 && m3 && this.f762a == iuVar.f762a)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = iuVar.n();
        if ((n2 || n3) && !(n2 && n3 && this.f770b == iuVar.f770b)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = iuVar.o();
        if ((o2 || o3) && !(o2 && o3 && this.f787l.equals(iuVar.f787l))) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = iuVar.p();
        if ((p2 || p3) && !(p2 && p3 && this.f788m.equals(iuVar.f788m))) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = iuVar.q();
        if ((q2 || q3) && !(q2 && q3 && this.f789n.equals(iuVar.f789n))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = iuVar.r();
        if ((r2 || r3) && !(r2 && r3 && this.f790o.equals(iuVar.f790o))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = iuVar.s();
        if ((s2 || s3) && !(s2 && s3 && this.f774c == iuVar.f774c)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = iuVar.t();
        if ((t2 || t3) && !(t2 && t3 && this.f764a.equals(iuVar.f764a))) {
            return false;
        }
        boolean u2 = u();
        boolean u3 = iuVar.u();
        if ((u2 || u3) && !(u2 && u3 && this.f769a == iuVar.f769a)) {
            return false;
        }
        boolean v2 = v();
        boolean v3 = iuVar.v();
        if ((v2 || v3) && !(v2 && v3 && this.f763a == iuVar.f763a)) {
            return false;
        }
        boolean w2 = w();
        boolean w3 = iuVar.w();
        if ((w2 || w3) && !(w2 && w3 && this.f771b == iuVar.f771b)) {
            return false;
        }
        boolean x2 = x();
        boolean x3 = iuVar.x();
        if ((x2 || x3) && !(x2 && x3 && this.f791p.equals(iuVar.f791p))) {
            return false;
        }
        boolean y2 = y();
        boolean y3 = iuVar.y();
        if ((y2 || y3) && !(y2 && y3 && this.f792q.equals(iuVar.f792q))) {
            return false;
        }
        boolean z2 = z();
        boolean z3 = iuVar.z();
        if ((z2 || z3) && !(z2 && z3 && this.f773b == iuVar.f773b)) {
            return false;
        }
        boolean A2 = A();
        boolean A3 = iuVar.A();
        if ((A2 || A3) && !(A2 && A3 && this.f768a.equals(iuVar.f768a))) {
            return false;
        }
        boolean B2 = B();
        boolean B3 = iuVar.B();
        if ((B2 || B3) && !(B2 && B3 && this.f776c == iuVar.f776c)) {
            return false;
        }
        boolean C2 = C();
        boolean C3 = iuVar.C();
        if ((C2 || C3) && !(C2 && C3 && this.f793r.equals(iuVar.f793r))) {
            return false;
        }
        boolean D2 = D();
        boolean D3 = iuVar.D();
        if ((D2 || D3) && !(D2 && D3 && this.f777d == iuVar.f777d)) {
            return false;
        }
        boolean E2 = E();
        boolean E3 = iuVar.E();
        if (E2 || E3) {
            return E2 && E3 && this.f779e == iuVar.f779e;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iu iuVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        int a20;
        int a21;
        int a22;
        int a23;
        int a24;
        int a25;
        int a26;
        int a27;
        int a28;
        int a29;
        int a30;
        int a31;
        int a32;
        if (!getClass().equals(iuVar.getClass())) {
            return getClass().getName().compareTo(iuVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m584a()).compareTo(Boolean.valueOf(iuVar.m584a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m584a() && (a32 = jg.a(this.f766a, iuVar.f766a)) != 0) {
            return a32;
        }
        int compareTo2 = Boolean.valueOf(m586b()).compareTo(Boolean.valueOf(iuVar.m586b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m586b() && (a31 = jg.a(this.f765a, iuVar.f765a)) != 0) {
            return a31;
        }
        int compareTo3 = Boolean.valueOf(m587c()).compareTo(Boolean.valueOf(iuVar.m587c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m587c() && (a30 = jg.a(this.f772b, iuVar.f772b)) != 0) {
            return a30;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iuVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a29 = jg.a(this.f775c, iuVar.f775c)) != 0) {
            return a29;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iuVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a28 = jg.a(this.f778d, iuVar.f778d)) != 0) {
            return a28;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iuVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a27 = jg.a(this.f780e, iuVar.f780e)) != 0) {
            return a27;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iuVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a26 = jg.a(this.f781f, iuVar.f781f)) != 0) {
            return a26;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iuVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a25 = jg.a(this.f782g, iuVar.f782g)) != 0) {
            return a25;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iuVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a24 = jg.a(this.f783h, iuVar.f783h)) != 0) {
            return a24;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(iuVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a23 = jg.a(this.f784i, iuVar.f784i)) != 0) {
            return a23;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(iuVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a22 = jg.a(this.f785j, iuVar.f785j)) != 0) {
            return a22;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(iuVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a21 = jg.a(this.f786k, iuVar.f786k)) != 0) {
            return a21;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(iuVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a20 = jg.a(this.f762a, iuVar.f762a)) != 0) {
            return a20;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(iuVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a19 = jg.a(this.f770b, iuVar.f770b)) != 0) {
            return a19;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(iuVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a18 = jg.a(this.f787l, iuVar.f787l)) != 0) {
            return a18;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(iuVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a17 = jg.a(this.f788m, iuVar.f788m)) != 0) {
            return a17;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(iuVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a16 = jg.a(this.f789n, iuVar.f789n)) != 0) {
            return a16;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(iuVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a15 = jg.a(this.f790o, iuVar.f790o)) != 0) {
            return a15;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(iuVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a14 = jg.a(this.f774c, iuVar.f774c)) != 0) {
            return a14;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(iuVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (t() && (a13 = jg.a(this.f764a, iuVar.f764a)) != 0) {
            return a13;
        }
        int compareTo21 = Boolean.valueOf(u()).compareTo(Boolean.valueOf(iuVar.u()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (u() && (a12 = jg.a(this.f769a, iuVar.f769a)) != 0) {
            return a12;
        }
        int compareTo22 = Boolean.valueOf(v()).compareTo(Boolean.valueOf(iuVar.v()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (v() && (a11 = jg.a(this.f763a, iuVar.f763a)) != 0) {
            return a11;
        }
        int compareTo23 = Boolean.valueOf(w()).compareTo(Boolean.valueOf(iuVar.w()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (w() && (a10 = jg.a(this.f771b, iuVar.f771b)) != 0) {
            return a10;
        }
        int compareTo24 = Boolean.valueOf(x()).compareTo(Boolean.valueOf(iuVar.x()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (x() && (a9 = jg.a(this.f791p, iuVar.f791p)) != 0) {
            return a9;
        }
        int compareTo25 = Boolean.valueOf(y()).compareTo(Boolean.valueOf(iuVar.y()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (y() && (a8 = jg.a(this.f792q, iuVar.f792q)) != 0) {
            return a8;
        }
        int compareTo26 = Boolean.valueOf(z()).compareTo(Boolean.valueOf(iuVar.z()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (z() && (a7 = jg.a(this.f773b, iuVar.f773b)) != 0) {
            return a7;
        }
        int compareTo27 = Boolean.valueOf(A()).compareTo(Boolean.valueOf(iuVar.A()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (A() && (a6 = jg.a(this.f768a, iuVar.f768a)) != 0) {
            return a6;
        }
        int compareTo28 = Boolean.valueOf(B()).compareTo(Boolean.valueOf(iuVar.B()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (B() && (a5 = jg.a(this.f776c, iuVar.f776c)) != 0) {
            return a5;
        }
        int compareTo29 = Boolean.valueOf(C()).compareTo(Boolean.valueOf(iuVar.C()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (C() && (a4 = jg.a(this.f793r, iuVar.f793r)) != 0) {
            return a4;
        }
        int compareTo30 = Boolean.valueOf(D()).compareTo(Boolean.valueOf(iuVar.D()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (D() && (a3 = jg.a(this.f777d, iuVar.f777d)) != 0) {
            return a3;
        }
        int compareTo31 = Boolean.valueOf(E()).compareTo(Boolean.valueOf(iuVar.E()));
        if (compareTo31 != 0) {
            return compareTo31;
        }
        if (!E() || (a2 = jg.a(this.f779e, iuVar.f779e)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jf
    public void a(jp jpVar) {
        jpVar.mo643a();
        while (true) {
            jm mo639a = jpVar.mo639a();
            byte b2 = mo639a.a;
            if (b2 == 0) {
                jpVar.f();
                m583a();
                return;
            }
            short s2 = mo639a.f916a;
            switch (s2) {
                case 1:
                    if (b2 == 11) {
                        this.f766a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f765a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f772b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f775c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f778d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 11) {
                        this.f780e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f781f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f782g = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f783h = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 11) {
                        this.f784i = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 11) {
                        this.f785j = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 12:
                    if (b2 == 11) {
                        this.f786k = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 13:
                    if (b2 == 8) {
                        this.f762a = jpVar.mo637a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 14:
                    if (b2 == 8) {
                        this.f770b = jpVar.mo637a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 15:
                    if (b2 == 11) {
                        this.f787l = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 16:
                    if (b2 == 11) {
                        this.f788m = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 17:
                    if (b2 == 11) {
                        this.f789n = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 18:
                    if (b2 == 11) {
                        this.f790o = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 19:
                    if (b2 == 8) {
                        this.f774c = jpVar.mo637a();
                        c(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 20:
                    if (b2 == 8) {
                        this.f764a = ii.a(jpVar.mo637a());
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 21:
                    if (b2 == 2) {
                        this.f769a = jpVar.mo649a();
                        d(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 22:
                    if (b2 == 10) {
                        this.f763a = jpVar.mo638a();
                        e(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 23:
                    if (b2 == 10) {
                        this.f771b = jpVar.mo638a();
                        f(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 24:
                    if (b2 == 11) {
                        this.f791p = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 25:
                    if (b2 == 11) {
                        this.f792q = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 26:
                    if (b2 == 2) {
                        this.f773b = jpVar.mo649a();
                        g(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                default:
                    switch (s2) {
                        case 100:
                            if (b2 == 13) {
                                jo mo641a = jpVar.mo641a();
                                this.f768a = new HashMap(mo641a.f918a * 2);
                                for (int i2 = 0; i2 < mo641a.f918a; i2++) {
                                    this.f768a.put(jpVar.mo644a(), jpVar.mo644a());
                                }
                                jpVar.h();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 101:
                            if (b2 == 2) {
                                this.f776c = jpVar.mo649a();
                                h(true);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 102:
                            if (b2 == 11) {
                                this.f793r = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 103:
                            if (b2 == 8) {
                                this.f777d = jpVar.mo637a();
                                i(true);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 104:
                            if (b2 == 8) {
                                this.f779e = jpVar.mo637a();
                                j(true);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        default:
                            js.a(jpVar, b2);
                            break;
                    }
            }
            jpVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m583a() {
        if (this.f772b != null) {
            if (this.f775c != null) {
                if (this.f781f != null) {
                    return;
                }
                StringBuilder M = e.a.a.a.a.M("Required field 'token' was not present! Struct: ");
                M.append(toString());
                throw new jq(M.toString());
            }
            StringBuilder M2 = e.a.a.a.a.M("Required field 'appId' was not present! Struct: ");
            M2.append(toString());
            throw new jq(M2.toString());
        }
        StringBuilder M3 = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M3.append(toString());
        throw new jq(M3.toString());
    }
}
