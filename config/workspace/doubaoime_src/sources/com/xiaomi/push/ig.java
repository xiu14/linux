package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class ig implements jf<ig, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f622a;

    /* renamed from: a, reason: collision with other field name */
    public ih f623a;

    /* renamed from: a, reason: collision with other field name */
    public ij f624a;

    /* renamed from: a, reason: collision with other field name */
    public String f625a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f626a = new BitSet(4);

    /* renamed from: a, reason: collision with other field name */
    public boolean f627a = false;

    /* renamed from: b, reason: collision with other field name */
    public long f628b;

    /* renamed from: b, reason: collision with other field name */
    public String f629b;

    /* renamed from: c, reason: collision with other field name */
    public long f630c;

    /* renamed from: c, reason: collision with other field name */
    public String f631c;

    /* renamed from: d, reason: collision with other field name */
    public String f632d;

    /* renamed from: e, reason: collision with other field name */
    public String f633e;

    /* renamed from: f, reason: collision with other field name */
    public String f634f;

    /* renamed from: g, reason: collision with other field name */
    public String f635g;

    /* renamed from: h, reason: collision with other field name */
    public String f636h;

    /* renamed from: i, reason: collision with other field name */
    public String f637i;

    /* renamed from: j, reason: collision with other field name */
    public String f638j;

    /* renamed from: k, reason: collision with other field name */
    public String f639k;

    /* renamed from: l, reason: collision with other field name */
    public String f640l;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f621a = new ju("PushMessage");
    private static final jm a = new jm("", (byte) 12, 1);
    private static final jm b = new jm("", (byte) 11, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9195c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9196d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9197e = new jm("", (byte) 10, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9198f = new jm("", (byte) 10, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9199g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 11, 8);
    private static final jm i = new jm("", (byte) 11, 9);
    private static final jm j = new jm("", (byte) 11, 10);
    private static final jm k = new jm("", (byte) 11, 11);
    private static final jm l = new jm("", (byte) 12, 12);
    private static final jm m = new jm("", (byte) 11, 13);
    private static final jm n = new jm("", (byte) 2, 14);
    private static final jm o = new jm("", (byte) 11, 15);
    private static final jm p = new jm("", (byte) 10, 16);
    private static final jm q = new jm("", (byte) 11, 20);
    private static final jm r = new jm("", (byte) 11, 21);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m518a() {
        return this.f624a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m520b() {
        return this.f625a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m521c() {
        return this.f629b != null;
    }

    public boolean d() {
        return this.f631c != null;
    }

    public boolean e() {
        return this.f626a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ig)) {
            return m519a((ig) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f626a.get(1);
    }

    public boolean g() {
        return this.f632d != null;
    }

    public boolean h() {
        return this.f633e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f634f != null;
    }

    public boolean j() {
        return this.f635g != null;
    }

    public boolean k() {
        return this.f636h != null;
    }

    public boolean l() {
        return this.f623a != null;
    }

    public boolean m() {
        return this.f637i != null;
    }

    public boolean n() {
        return this.f626a.get(2);
    }

    public boolean o() {
        return this.f638j != null;
    }

    public boolean p() {
        return this.f626a.get(3);
    }

    public boolean q() {
        return this.f639k != null;
    }

    public boolean r() {
        return this.f640l != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (m518a()) {
            sb.append("to:");
            ij ijVar = this.f624a;
            if (ijVar == null) {
                sb.append("null");
            } else {
                sb.append(ijVar);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f625a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f629b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("payload:");
        String str3 = this.f631c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f622a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f628b);
        }
        if (g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.f632d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f633e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("regId:");
            String str6 = this.f634f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f635g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("topic:");
            String str8 = this.f636h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            ih ihVar = this.f623a;
            if (ihVar == null) {
                sb.append("null");
            } else {
                sb.append(ihVar);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f637i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f627a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f638j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f630c);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f639k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f640l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m516a() {
        return this.f625a;
    }

    public String b() {
        return this.f629b;
    }

    public String c() {
        return this.f631c;
    }

    public void d(boolean z) {
        this.f626a.set(3, z);
    }

    public long a() {
        return this.f622a;
    }

    public void b(boolean z) {
        this.f626a.set(1, z);
    }

    public void c(boolean z) {
        this.f626a.set(2, z);
    }

    public void a(boolean z) {
        this.f626a.set(0, z);
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m517a();
        jpVar.a(f621a);
        if (this.f624a != null && m518a()) {
            jpVar.a(a);
            this.f624a.b(jpVar);
            jpVar.b();
        }
        if (this.f625a != null) {
            jpVar.a(b);
            jpVar.a(this.f625a);
            jpVar.b();
        }
        if (this.f629b != null) {
            jpVar.a(f9195c);
            jpVar.a(this.f629b);
            jpVar.b();
        }
        if (this.f631c != null) {
            jpVar.a(f9196d);
            jpVar.a(this.f631c);
            jpVar.b();
        }
        if (e()) {
            jpVar.a(f9197e);
            jpVar.a(this.f622a);
            jpVar.b();
        }
        if (f()) {
            jpVar.a(f9198f);
            jpVar.a(this.f628b);
            jpVar.b();
        }
        if (this.f632d != null && g()) {
            jpVar.a(f9199g);
            jpVar.a(this.f632d);
            jpVar.b();
        }
        if (this.f633e != null && h()) {
            jpVar.a(h);
            jpVar.a(this.f633e);
            jpVar.b();
        }
        if (this.f634f != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f634f);
            jpVar.b();
        }
        if (this.f635g != null && j()) {
            jpVar.a(j);
            jpVar.a(this.f635g);
            jpVar.b();
        }
        if (this.f636h != null && k()) {
            jpVar.a(k);
            jpVar.a(this.f636h);
            jpVar.b();
        }
        if (this.f623a != null && l()) {
            jpVar.a(l);
            this.f623a.b(jpVar);
            jpVar.b();
        }
        if (this.f637i != null && m()) {
            jpVar.a(m);
            jpVar.a(this.f637i);
            jpVar.b();
        }
        if (n()) {
            jpVar.a(n);
            jpVar.a(this.f627a);
            jpVar.b();
        }
        if (this.f638j != null && o()) {
            jpVar.a(o);
            jpVar.a(this.f638j);
            jpVar.b();
        }
        if (p()) {
            jpVar.a(p);
            jpVar.a(this.f630c);
            jpVar.b();
        }
        if (this.f639k != null && q()) {
            jpVar.a(q);
            jpVar.a(this.f639k);
            jpVar.b();
        }
        if (this.f640l != null && r()) {
            jpVar.a(r);
            jpVar.a(this.f640l);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m519a(ig igVar) {
        if (igVar == null) {
            return false;
        }
        boolean m518a = m518a();
        boolean m518a2 = igVar.m518a();
        if ((m518a || m518a2) && !(m518a && m518a2 && this.f624a.m536a(igVar.f624a))) {
            return false;
        }
        boolean m520b = m520b();
        boolean m520b2 = igVar.m520b();
        if ((m520b || m520b2) && !(m520b && m520b2 && this.f625a.equals(igVar.f625a))) {
            return false;
        }
        boolean m521c = m521c();
        boolean m521c2 = igVar.m521c();
        if ((m521c || m521c2) && !(m521c && m521c2 && this.f629b.equals(igVar.f629b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = igVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f631c.equals(igVar.f631c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = igVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f622a == igVar.f622a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = igVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f628b == igVar.f628b)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = igVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f632d.equals(igVar.f632d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = igVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f633e.equals(igVar.f633e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = igVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f634f.equals(igVar.f634f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = igVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f635g.equals(igVar.f635g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = igVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f636h.equals(igVar.f636h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = igVar.l();
        if ((l2 || l3) && !(l2 && l3 && this.f623a.m528a(igVar.f623a))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = igVar.m();
        if ((m2 || m3) && !(m2 && m3 && this.f637i.equals(igVar.f637i))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = igVar.n();
        if ((n2 || n3) && !(n2 && n3 && this.f627a == igVar.f627a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = igVar.o();
        if ((o2 || o3) && !(o2 && o3 && this.f638j.equals(igVar.f638j))) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = igVar.p();
        if ((p2 || p3) && !(p2 && p3 && this.f630c == igVar.f630c)) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = igVar.q();
        if ((q2 || q3) && !(q2 && q3 && this.f639k.equals(igVar.f639k))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = igVar.r();
        if (r2 || r3) {
            return r2 && r3 && this.f640l.equals(igVar.f640l);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ig igVar) {
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
        if (!getClass().equals(igVar.getClass())) {
            return getClass().getName().compareTo(igVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m518a()).compareTo(Boolean.valueOf(igVar.m518a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m518a() && (a19 = jg.a(this.f624a, igVar.f624a)) != 0) {
            return a19;
        }
        int compareTo2 = Boolean.valueOf(m520b()).compareTo(Boolean.valueOf(igVar.m520b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m520b() && (a18 = jg.a(this.f625a, igVar.f625a)) != 0) {
            return a18;
        }
        int compareTo3 = Boolean.valueOf(m521c()).compareTo(Boolean.valueOf(igVar.m521c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m521c() && (a17 = jg.a(this.f629b, igVar.f629b)) != 0) {
            return a17;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(igVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a16 = jg.a(this.f631c, igVar.f631c)) != 0) {
            return a16;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(igVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a15 = jg.a(this.f622a, igVar.f622a)) != 0) {
            return a15;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(igVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a14 = jg.a(this.f628b, igVar.f628b)) != 0) {
            return a14;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(igVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a13 = jg.a(this.f632d, igVar.f632d)) != 0) {
            return a13;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(igVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a12 = jg.a(this.f633e, igVar.f633e)) != 0) {
            return a12;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(igVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a11 = jg.a(this.f634f, igVar.f634f)) != 0) {
            return a11;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(igVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a10 = jg.a(this.f635g, igVar.f635g)) != 0) {
            return a10;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(igVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a9 = jg.a(this.f636h, igVar.f636h)) != 0) {
            return a9;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(igVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a8 = jg.a(this.f623a, igVar.f623a)) != 0) {
            return a8;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(igVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a7 = jg.a(this.f637i, igVar.f637i)) != 0) {
            return a7;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(igVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a6 = jg.a(this.f627a, igVar.f627a)) != 0) {
            return a6;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(igVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a5 = jg.a(this.f638j, igVar.f638j)) != 0) {
            return a5;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(igVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a4 = jg.a(this.f630c, igVar.f630c)) != 0) {
            return a4;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(igVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a3 = jg.a(this.f639k, igVar.f639k)) != 0) {
            return a3;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(igVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!r() || (a2 = jg.a(this.f640l, igVar.f640l)) == 0) {
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
                m517a();
                return;
            }
            short s = mo639a.f916a;
            if (s != 20) {
                if (s != 21) {
                    switch (s) {
                        case 1:
                            if (b2 == 12) {
                                ij ijVar = new ij();
                                this.f624a = ijVar;
                                ijVar.a(jpVar);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 2:
                            if (b2 == 11) {
                                this.f625a = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 3:
                            if (b2 == 11) {
                                this.f629b = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 4:
                            if (b2 == 11) {
                                this.f631c = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 5:
                            if (b2 == 10) {
                                this.f622a = jpVar.mo638a();
                                a(true);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 6:
                            if (b2 == 10) {
                                this.f628b = jpVar.mo638a();
                                b(true);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 7:
                            if (b2 == 11) {
                                this.f632d = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 8:
                            if (b2 == 11) {
                                this.f633e = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 9:
                            if (b2 == 11) {
                                this.f634f = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 10:
                            if (b2 == 11) {
                                this.f635g = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 11:
                            if (b2 == 11) {
                                this.f636h = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 12:
                            if (b2 == 12) {
                                ih ihVar = new ih();
                                this.f623a = ihVar;
                                ihVar.a(jpVar);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 13:
                            if (b2 == 11) {
                                this.f637i = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 14:
                            if (b2 == 2) {
                                this.f627a = jpVar.mo649a();
                                c(true);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 15:
                            if (b2 == 11) {
                                this.f638j = jpVar.mo644a();
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        case 16:
                            if (b2 == 10) {
                                this.f630c = jpVar.mo638a();
                                d(true);
                                break;
                            } else {
                                js.a(jpVar, b2);
                                break;
                            }
                        default:
                            js.a(jpVar, b2);
                            break;
                    }
                } else if (b2 == 11) {
                    this.f640l = jpVar.mo644a();
                } else {
                    js.a(jpVar, b2);
                }
            } else if (b2 == 11) {
                this.f639k = jpVar.mo644a();
            } else {
                js.a(jpVar, b2);
            }
            jpVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m517a() {
        if (this.f625a != null) {
            if (this.f629b != null) {
                if (this.f631c != null) {
                    return;
                }
                StringBuilder M = e.a.a.a.a.M("Required field 'payload' was not present! Struct: ");
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
