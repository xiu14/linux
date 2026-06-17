package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class iv implements jf<iv, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f795a;

    /* renamed from: a, reason: collision with other field name */
    public long f796a;

    /* renamed from: a, reason: collision with other field name */
    public ij f797a;

    /* renamed from: a, reason: collision with other field name */
    public String f798a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f800a;

    /* renamed from: b, reason: collision with other field name */
    public int f802b;

    /* renamed from: b, reason: collision with other field name */
    public long f803b;

    /* renamed from: b, reason: collision with other field name */
    public String f804b;

    /* renamed from: c, reason: collision with other field name */
    public long f805c;

    /* renamed from: c, reason: collision with other field name */
    public String f806c;

    /* renamed from: d, reason: collision with other field name */
    public String f807d;

    /* renamed from: e, reason: collision with other field name */
    public String f808e;

    /* renamed from: f, reason: collision with other field name */
    public String f809f;

    /* renamed from: g, reason: collision with other field name */
    public String f810g;

    /* renamed from: h, reason: collision with other field name */
    public String f811h;

    /* renamed from: i, reason: collision with other field name */
    public String f812i;

    /* renamed from: j, reason: collision with other field name */
    public String f813j;

    /* renamed from: k, reason: collision with other field name */
    public String f814k;

    /* renamed from: l, reason: collision with other field name */
    public String f815l;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f794a = new ju("XmPushActionRegistrationResult");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9245c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9246d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9247e = new jm("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9248f = new jm("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9249g = new jm("", (byte) 11, 8);
    private static final jm h = new jm("", (byte) 11, 9);
    private static final jm i = new jm("", (byte) 11, 10);
    private static final jm j = new jm("", (byte) 10, 11);
    private static final jm k = new jm("", (byte) 11, 12);
    private static final jm l = new jm("", (byte) 11, 13);
    private static final jm m = new jm("", (byte) 10, 14);
    private static final jm n = new jm("", (byte) 11, 15);
    private static final jm o = new jm("", (byte) 8, 16);
    private static final jm p = new jm("", (byte) 11, 17);
    private static final jm q = new jm("", (byte) 8, 18);
    private static final jm r = new jm("", (byte) 11, 19);
    private static final jm s = new jm("", (byte) 2, 20);
    private static final jm t = new jm("", (byte) 15, 21);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f799a = new BitSet(6);

    /* renamed from: a, reason: collision with other field name */
    public boolean f801a = false;

    /* renamed from: a, reason: collision with other method in class */
    public boolean m591a() {
        return this.f798a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m593b() {
        return this.f797a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m594c() {
        return this.f804b != null;
    }

    public boolean d() {
        return this.f806c != null;
    }

    public boolean e() {
        return this.f799a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iv)) {
            return m592a((iv) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f807d != null;
    }

    public boolean g() {
        return this.f808e != null;
    }

    public boolean h() {
        return this.f809f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f810g != null;
    }

    public boolean j() {
        return this.f799a.get(1);
    }

    public boolean k() {
        return this.f811h != null;
    }

    public boolean l() {
        return this.f812i != null;
    }

    public boolean m() {
        return this.f799a.get(2);
    }

    public boolean n() {
        return this.f813j != null;
    }

    public boolean o() {
        return this.f799a.get(3);
    }

    public boolean p() {
        return this.f814k != null;
    }

    public boolean q() {
        return this.f799a.get(4);
    }

    public boolean r() {
        return this.f815l != null;
    }

    public boolean s() {
        return this.f799a.get(5);
    }

    public boolean t() {
        return this.f800a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z2 = false;
        if (m591a()) {
            sb.append("debug:");
            String str = this.f798a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m593b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f797a;
            if (ijVar == null) {
                sb.append("null");
            } else {
                sb.append(ijVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f804b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.as.a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f806c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f796a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f807d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("regId:");
            String str5 = this.f808e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f810g;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f803b);
        }
        if (k()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str7 = this.f811h;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("clientId:");
            String str8 = this.f812i;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f805c);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str9 = this.f813j;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f795a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            String str10 = this.f814k;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f802b);
        }
        if (r()) {
            sb.append(", ");
            sb.append("region:");
            String str11 = this.f815l;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f801a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("autoMarkPkgs:");
            List<String> list = this.f800a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m588a() {
        return this.f804b;
    }

    public String b() {
        return this.f809f;
    }

    public String c() {
        return this.f810g;
    }

    public void d(boolean z) {
        this.f799a.set(3, z);
    }

    public void e(boolean z) {
        this.f799a.set(4, z);
    }

    public void f(boolean z) {
        this.f799a.set(5, z);
    }

    public long a() {
        return this.f796a;
    }

    public void b(boolean z) {
        this.f799a.set(1, z);
    }

    public void c(boolean z) {
        this.f799a.set(2, z);
    }

    public void a(boolean z) {
        this.f799a.set(0, z);
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m590a();
        jpVar.a(f794a);
        if (this.f798a != null && m591a()) {
            jpVar.a(a);
            jpVar.a(this.f798a);
            jpVar.b();
        }
        if (this.f797a != null && m593b()) {
            jpVar.a(b);
            this.f797a.b(jpVar);
            jpVar.b();
        }
        if (this.f804b != null) {
            jpVar.a(f9245c);
            jpVar.a(this.f804b);
            jpVar.b();
        }
        if (this.f806c != null) {
            jpVar.a(f9246d);
            jpVar.a(this.f806c);
            jpVar.b();
        }
        jpVar.a(f9247e);
        jpVar.a(this.f796a);
        jpVar.b();
        if (this.f807d != null && f()) {
            jpVar.a(f9248f);
            jpVar.a(this.f807d);
            jpVar.b();
        }
        if (this.f808e != null && g()) {
            jpVar.a(f9249g);
            jpVar.a(this.f808e);
            jpVar.b();
        }
        if (this.f809f != null && h()) {
            jpVar.a(h);
            jpVar.a(this.f809f);
            jpVar.b();
        }
        if (this.f810g != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f810g);
            jpVar.b();
        }
        if (j()) {
            jpVar.a(j);
            jpVar.a(this.f803b);
            jpVar.b();
        }
        if (this.f811h != null && k()) {
            jpVar.a(k);
            jpVar.a(this.f811h);
            jpVar.b();
        }
        if (this.f812i != null && l()) {
            jpVar.a(l);
            jpVar.a(this.f812i);
            jpVar.b();
        }
        if (m()) {
            jpVar.a(m);
            jpVar.a(this.f805c);
            jpVar.b();
        }
        if (this.f813j != null && n()) {
            jpVar.a(n);
            jpVar.a(this.f813j);
            jpVar.b();
        }
        if (o()) {
            jpVar.a(o);
            jpVar.mo648a(this.f795a);
            jpVar.b();
        }
        if (this.f814k != null && p()) {
            jpVar.a(p);
            jpVar.a(this.f814k);
            jpVar.b();
        }
        if (q()) {
            jpVar.a(q);
            jpVar.mo648a(this.f802b);
            jpVar.b();
        }
        if (this.f815l != null && r()) {
            jpVar.a(r);
            jpVar.a(this.f815l);
            jpVar.b();
        }
        if (s()) {
            jpVar.a(s);
            jpVar.a(this.f801a);
            jpVar.b();
        }
        if (this.f800a != null && t()) {
            jpVar.a(t);
            jpVar.a(new jn((byte) 11, this.f800a.size()));
            Iterator<String> it2 = this.f800a.iterator();
            while (it2.hasNext()) {
                jpVar.a(it2.next());
            }
            jpVar.e();
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public List<String> m589a() {
        return this.f800a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m592a(iv ivVar) {
        if (ivVar == null) {
            return false;
        }
        boolean m591a = m591a();
        boolean m591a2 = ivVar.m591a();
        if ((m591a || m591a2) && !(m591a && m591a2 && this.f798a.equals(ivVar.f798a))) {
            return false;
        }
        boolean m593b = m593b();
        boolean m593b2 = ivVar.m593b();
        if ((m593b || m593b2) && !(m593b && m593b2 && this.f797a.m536a(ivVar.f797a))) {
            return false;
        }
        boolean m594c = m594c();
        boolean m594c2 = ivVar.m594c();
        if ((m594c || m594c2) && !(m594c && m594c2 && this.f804b.equals(ivVar.f804b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ivVar.d();
        if (((d2 || d3) && !(d2 && d3 && this.f806c.equals(ivVar.f806c))) || this.f796a != ivVar.f796a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ivVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f807d.equals(ivVar.f807d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ivVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f808e.equals(ivVar.f808e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ivVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f809f.equals(ivVar.f809f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ivVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f810g.equals(ivVar.f810g))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ivVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f803b == ivVar.f803b)) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ivVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f811h.equals(ivVar.f811h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = ivVar.l();
        if ((l2 || l3) && !(l2 && l3 && this.f812i.equals(ivVar.f812i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = ivVar.m();
        if ((m2 || m3) && !(m2 && m3 && this.f805c == ivVar.f805c)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = ivVar.n();
        if ((n2 || n3) && !(n2 && n3 && this.f813j.equals(ivVar.f813j))) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = ivVar.o();
        if ((o2 || o3) && !(o2 && o3 && this.f795a == ivVar.f795a)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = ivVar.p();
        if ((p2 || p3) && !(p2 && p3 && this.f814k.equals(ivVar.f814k))) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = ivVar.q();
        if ((q2 || q3) && !(q2 && q3 && this.f802b == ivVar.f802b)) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = ivVar.r();
        if ((r2 || r3) && !(r2 && r3 && this.f815l.equals(ivVar.f815l))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = ivVar.s();
        if ((s2 || s3) && !(s2 && s3 && this.f801a == ivVar.f801a)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = ivVar.t();
        if (t2 || t3) {
            return t2 && t3 && this.f800a.equals(ivVar.f800a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iv ivVar) {
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
        if (!getClass().equals(ivVar.getClass())) {
            return getClass().getName().compareTo(ivVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m591a()).compareTo(Boolean.valueOf(ivVar.m591a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m591a() && (a21 = jg.a(this.f798a, ivVar.f798a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(m593b()).compareTo(Boolean.valueOf(ivVar.m593b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m593b() && (a20 = jg.a(this.f797a, ivVar.f797a)) != 0) {
            return a20;
        }
        int compareTo3 = Boolean.valueOf(m594c()).compareTo(Boolean.valueOf(ivVar.m594c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m594c() && (a19 = jg.a(this.f804b, ivVar.f804b)) != 0) {
            return a19;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ivVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a18 = jg.a(this.f806c, ivVar.f806c)) != 0) {
            return a18;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ivVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a17 = jg.a(this.f796a, ivVar.f796a)) != 0) {
            return a17;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ivVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a16 = jg.a(this.f807d, ivVar.f807d)) != 0) {
            return a16;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ivVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a15 = jg.a(this.f808e, ivVar.f808e)) != 0) {
            return a15;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ivVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a14 = jg.a(this.f809f, ivVar.f809f)) != 0) {
            return a14;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ivVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a13 = jg.a(this.f810g, ivVar.f810g)) != 0) {
            return a13;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ivVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a12 = jg.a(this.f803b, ivVar.f803b)) != 0) {
            return a12;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ivVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a11 = jg.a(this.f811h, ivVar.f811h)) != 0) {
            return a11;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ivVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a10 = jg.a(this.f812i, ivVar.f812i)) != 0) {
            return a10;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ivVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a9 = jg.a(this.f805c, ivVar.f805c)) != 0) {
            return a9;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ivVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a8 = jg.a(this.f813j, ivVar.f813j)) != 0) {
            return a8;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(ivVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a7 = jg.a(this.f795a, ivVar.f795a)) != 0) {
            return a7;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(ivVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a6 = jg.a(this.f814k, ivVar.f814k)) != 0) {
            return a6;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(ivVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a5 = jg.a(this.f802b, ivVar.f802b)) != 0) {
            return a5;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(ivVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a4 = jg.a(this.f815l, ivVar.f815l)) != 0) {
            return a4;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(ivVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a3 = jg.a(this.f801a, ivVar.f801a)) != 0) {
            return a3;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(ivVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!t() || (a2 = jg.a(this.f800a, ivVar.f800a)) == 0) {
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
                if (e()) {
                    m590a();
                    return;
                } else {
                    StringBuilder M = e.a.a.a.a.M("Required field 'errorCode' was not found in serialized data! Struct: ");
                    M.append(toString());
                    throw new jq(M.toString());
                }
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f798a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f797a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f804b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f806c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                default:
                    js.a(jpVar, b2);
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f796a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f807d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f808e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f809f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 11) {
                        this.f810g = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 10) {
                        this.f803b = jpVar.mo638a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 12:
                    if (b2 == 11) {
                        this.f811h = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 13:
                    if (b2 == 11) {
                        this.f812i = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 14:
                    if (b2 == 10) {
                        this.f805c = jpVar.mo638a();
                        c(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 15:
                    if (b2 == 11) {
                        this.f813j = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 16:
                    if (b2 == 8) {
                        this.f795a = jpVar.mo637a();
                        d(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 17:
                    if (b2 == 11) {
                        this.f814k = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 18:
                    if (b2 == 8) {
                        this.f802b = jpVar.mo637a();
                        e(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 19:
                    if (b2 == 11) {
                        this.f815l = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 20:
                    if (b2 == 2) {
                        this.f801a = jpVar.mo649a();
                        f(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 21:
                    if (b2 == 15) {
                        jn mo640a = jpVar.mo640a();
                        this.f800a = new ArrayList(mo640a.f917a);
                        for (int i2 = 0; i2 < mo640a.f917a; i2++) {
                            this.f800a.add(jpVar.mo644a());
                        }
                        jpVar.i();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
            }
            jpVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m590a() {
        if (this.f804b != null) {
            if (this.f806c != null) {
                return;
            }
            StringBuilder M = e.a.a.a.a.M("Required field 'appId' was not present! Struct: ");
            M.append(toString());
            throw new jq(M.toString());
        }
        StringBuilder M2 = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M2.append(toString());
        throw new jq(M2.toString());
    }
}
