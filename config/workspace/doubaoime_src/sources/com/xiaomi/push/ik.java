package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ik implements jf<ik, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f667a;

    /* renamed from: a, reason: collision with other field name */
    public long f668a;

    /* renamed from: a, reason: collision with other field name */
    public ij f669a;

    /* renamed from: a, reason: collision with other field name */
    public ix f670a;

    /* renamed from: a, reason: collision with other field name */
    public String f671a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f673a;

    /* renamed from: a, reason: collision with other field name */
    public short f674a;

    /* renamed from: b, reason: collision with other field name */
    public String f676b;

    /* renamed from: b, reason: collision with other field name */
    public short f677b;

    /* renamed from: c, reason: collision with other field name */
    public String f678c;

    /* renamed from: d, reason: collision with other field name */
    public String f679d;

    /* renamed from: e, reason: collision with other field name */
    public String f680e;

    /* renamed from: f, reason: collision with other field name */
    public String f681f;

    /* renamed from: g, reason: collision with other field name */
    public String f682g;

    /* renamed from: h, reason: collision with other field name */
    public String f683h;

    /* renamed from: i, reason: collision with other field name */
    public String f684i;

    /* renamed from: j, reason: collision with other field name */
    public String f685j;

    /* renamed from: k, reason: collision with other field name */
    public String f686k;

    /* renamed from: l, reason: collision with other field name */
    public String f687l;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f666a = new ju("XmPushActionAckMessage");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9210c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9211d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9212e = new jm("", (byte) 10, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9213f = new jm("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9214g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 12, 8);
    private static final jm i = new jm("", (byte) 11, 9);
    private static final jm j = new jm("", (byte) 11, 10);
    private static final jm k = new jm("", (byte) 2, 11);
    private static final jm l = new jm("", (byte) 11, 12);
    private static final jm m = new jm("", (byte) 11, 13);
    private static final jm n = new jm("", (byte) 11, 14);
    private static final jm o = new jm("", (byte) 6, 15);
    private static final jm p = new jm("", (byte) 6, 16);
    private static final jm q = new jm("", (byte) 11, 20);
    private static final jm r = new jm("", (byte) 11, 21);
    private static final jm s = new jm("", (byte) 8, 22);
    private static final jm t = new jm("", (byte) 13, 23);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f672a = new BitSet(5);

    /* renamed from: a, reason: collision with other field name */
    public boolean f675a = false;

    /* renamed from: a, reason: collision with other method in class */
    public boolean m537a() {
        return this.f671a != null;
    }

    public boolean b() {
        return this.f669a != null;
    }

    public boolean c() {
        return this.f676b != null;
    }

    public boolean d() {
        return this.f678c != null;
    }

    public boolean e() {
        return this.f672a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ik)) {
            return m538a((ik) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f679d != null;
    }

    public boolean g() {
        return this.f680e != null;
    }

    public boolean h() {
        return this.f670a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f681f != null;
    }

    public boolean j() {
        return this.f682g != null;
    }

    public boolean k() {
        return this.f672a.get(1);
    }

    public boolean l() {
        return this.f683h != null;
    }

    public boolean m() {
        return this.f684i != null;
    }

    public boolean n() {
        return this.f685j != null;
    }

    public boolean o() {
        return this.f672a.get(2);
    }

    public boolean p() {
        return this.f672a.get(3);
    }

    public boolean q() {
        return this.f686k != null;
    }

    public boolean r() {
        return this.f687l != null;
    }

    public boolean s() {
        return this.f672a.get(4);
    }

    public boolean t() {
        return this.f673a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = false;
        if (m537a()) {
            sb.append("debug:");
            String str = this.f671a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f669a;
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
        String str2 = this.f676b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f678c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f668a);
        if (f()) {
            sb.append(", ");
            sb.append("topic:");
            String str4 = this.f679d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str5 = this.f680e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("request:");
            ix ixVar = this.f670a;
            if (ixVar == null) {
                sb.append("null");
            } else {
                sb.append(ixVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f681f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f682g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f675a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f683h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            String str9 = this.f684i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f685j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f674a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f677b);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f686k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f687l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f667a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f673a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public ik a(String str) {
        this.f676b = str;
        return this;
    }

    public ik b(String str) {
        this.f678c = str;
        return this;
    }

    public ik c(String str) {
        this.f679d = str;
        return this;
    }

    public ik d(String str) {
        this.f680e = str;
        return this;
    }

    public void e(boolean z) {
        this.f672a.set(4, z);
    }

    public ik a(long j2) {
        this.f668a = j2;
        a(true);
        return this;
    }

    public void b(boolean z) {
        this.f672a.set(1, z);
    }

    public void c(boolean z) {
        this.f672a.set(2, z);
    }

    public void d(boolean z) {
        this.f672a.set(3, z);
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f666a);
        if (this.f671a != null && m537a()) {
            jpVar.a(a);
            jpVar.a(this.f671a);
            jpVar.b();
        }
        if (this.f669a != null && b()) {
            jpVar.a(b);
            this.f669a.b(jpVar);
            jpVar.b();
        }
        if (this.f676b != null) {
            jpVar.a(f9210c);
            jpVar.a(this.f676b);
            jpVar.b();
        }
        if (this.f678c != null) {
            jpVar.a(f9211d);
            jpVar.a(this.f678c);
            jpVar.b();
        }
        jpVar.a(f9212e);
        jpVar.a(this.f668a);
        jpVar.b();
        if (this.f679d != null && f()) {
            jpVar.a(f9213f);
            jpVar.a(this.f679d);
            jpVar.b();
        }
        if (this.f680e != null && g()) {
            jpVar.a(f9214g);
            jpVar.a(this.f680e);
            jpVar.b();
        }
        if (this.f670a != null && h()) {
            jpVar.a(h);
            this.f670a.b(jpVar);
            jpVar.b();
        }
        if (this.f681f != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f681f);
            jpVar.b();
        }
        if (this.f682g != null && j()) {
            jpVar.a(j);
            jpVar.a(this.f682g);
            jpVar.b();
        }
        if (k()) {
            jpVar.a(k);
            jpVar.a(this.f675a);
            jpVar.b();
        }
        if (this.f683h != null && l()) {
            jpVar.a(l);
            jpVar.a(this.f683h);
            jpVar.b();
        }
        if (this.f684i != null && m()) {
            jpVar.a(m);
            jpVar.a(this.f684i);
            jpVar.b();
        }
        if (this.f685j != null && n()) {
            jpVar.a(n);
            jpVar.a(this.f685j);
            jpVar.b();
        }
        if (o()) {
            jpVar.a(o);
            jpVar.a(this.f674a);
            jpVar.b();
        }
        if (p()) {
            jpVar.a(p);
            jpVar.a(this.f677b);
            jpVar.b();
        }
        if (this.f686k != null && q()) {
            jpVar.a(q);
            jpVar.a(this.f686k);
            jpVar.b();
        }
        if (this.f687l != null && r()) {
            jpVar.a(r);
            jpVar.a(this.f687l);
            jpVar.b();
        }
        if (s()) {
            jpVar.a(s);
            jpVar.mo648a(this.f667a);
            jpVar.b();
        }
        if (this.f673a != null && t()) {
            jpVar.a(t);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f673a.size()));
            for (Map.Entry<String, String> entry : this.f673a.entrySet()) {
                jpVar.a(entry.getKey());
                jpVar.a(entry.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public void a(boolean z) {
        this.f672a.set(0, z);
    }

    public ik a(short s2) {
        this.f674a = s2;
        c(true);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m538a(ik ikVar) {
        if (ikVar == null) {
            return false;
        }
        boolean m537a = m537a();
        boolean m537a2 = ikVar.m537a();
        if ((m537a || m537a2) && !(m537a && m537a2 && this.f671a.equals(ikVar.f671a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = ikVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f669a.m536a(ikVar.f669a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ikVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f676b.equals(ikVar.f676b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ikVar.d();
        if (((d2 || d3) && !(d2 && d3 && this.f678c.equals(ikVar.f678c))) || this.f668a != ikVar.f668a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ikVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f679d.equals(ikVar.f679d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ikVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f680e.equals(ikVar.f680e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ikVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f670a.m600a(ikVar.f670a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ikVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f681f.equals(ikVar.f681f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ikVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f682g.equals(ikVar.f682g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ikVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f675a == ikVar.f675a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = ikVar.l();
        if ((l2 || l3) && !(l2 && l3 && this.f683h.equals(ikVar.f683h))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = ikVar.m();
        if ((m2 || m3) && !(m2 && m3 && this.f684i.equals(ikVar.f684i))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = ikVar.n();
        if ((n2 || n3) && !(n2 && n3 && this.f685j.equals(ikVar.f685j))) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = ikVar.o();
        if ((o2 || o3) && !(o2 && o3 && this.f674a == ikVar.f674a)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = ikVar.p();
        if ((p2 || p3) && !(p2 && p3 && this.f677b == ikVar.f677b)) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = ikVar.q();
        if ((q2 || q3) && !(q2 && q3 && this.f686k.equals(ikVar.f686k))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = ikVar.r();
        if ((r2 || r3) && !(r2 && r3 && this.f687l.equals(ikVar.f687l))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = ikVar.s();
        if ((s2 || s3) && !(s2 && s3 && this.f667a == ikVar.f667a)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = ikVar.t();
        if (t2 || t3) {
            return t2 && t3 && this.f673a.equals(ikVar.f673a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ik ikVar) {
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
        if (!getClass().equals(ikVar.getClass())) {
            return getClass().getName().compareTo(ikVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m537a()).compareTo(Boolean.valueOf(ikVar.m537a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m537a() && (a21 = jg.a(this.f671a, ikVar.f671a)) != 0) {
            return a21;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ikVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a20 = jg.a(this.f669a, ikVar.f669a)) != 0) {
            return a20;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ikVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a19 = jg.a(this.f676b, ikVar.f676b)) != 0) {
            return a19;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ikVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a18 = jg.a(this.f678c, ikVar.f678c)) != 0) {
            return a18;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ikVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a17 = jg.a(this.f668a, ikVar.f668a)) != 0) {
            return a17;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ikVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a16 = jg.a(this.f679d, ikVar.f679d)) != 0) {
            return a16;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ikVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a15 = jg.a(this.f680e, ikVar.f680e)) != 0) {
            return a15;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ikVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a14 = jg.a(this.f670a, ikVar.f670a)) != 0) {
            return a14;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ikVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a13 = jg.a(this.f681f, ikVar.f681f)) != 0) {
            return a13;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ikVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a12 = jg.a(this.f682g, ikVar.f682g)) != 0) {
            return a12;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ikVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a11 = jg.a(this.f675a, ikVar.f675a)) != 0) {
            return a11;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ikVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a10 = jg.a(this.f683h, ikVar.f683h)) != 0) {
            return a10;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ikVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a9 = jg.a(this.f684i, ikVar.f684i)) != 0) {
            return a9;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ikVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a8 = jg.a(this.f685j, ikVar.f685j)) != 0) {
            return a8;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(ikVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (o() && (a7 = jg.a(this.f674a, ikVar.f674a)) != 0) {
            return a7;
        }
        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(ikVar.p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (p() && (a6 = jg.a(this.f677b, ikVar.f677b)) != 0) {
            return a6;
        }
        int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(ikVar.q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (q() && (a5 = jg.a(this.f686k, ikVar.f686k)) != 0) {
            return a5;
        }
        int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(ikVar.r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (r() && (a4 = jg.a(this.f687l, ikVar.f687l)) != 0) {
            return a4;
        }
        int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(ikVar.s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (s() && (a3 = jg.a(this.f667a, ikVar.f667a)) != 0) {
            return a3;
        }
        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(ikVar.t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!t() || (a2 = jg.a(this.f673a, ikVar.f673a)) == 0) {
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
                    a();
                    return;
                } else {
                    StringBuilder M = e.a.a.a.a.M("Required field 'messageTs' was not found in serialized data! Struct: ");
                    M.append(toString());
                    throw new jq(M.toString());
                }
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f671a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f669a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f676b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f678c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 10) {
                        this.f668a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 11) {
                        this.f679d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f680e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 12) {
                        ix ixVar = new ix();
                        this.f670a = ixVar;
                        ixVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f681f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 11) {
                        this.f682g = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 2) {
                        this.f675a = jpVar.mo649a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 12:
                    if (b2 == 11) {
                        this.f683h = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 13:
                    if (b2 == 11) {
                        this.f684i = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 14:
                    if (b2 == 11) {
                        this.f685j = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 15:
                    if (b2 == 6) {
                        this.f674a = jpVar.mo646a();
                        c(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 16:
                    if (b2 == 6) {
                        this.f677b = jpVar.mo646a();
                        d(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 17:
                case 18:
                case 19:
                default:
                    js.a(jpVar, b2);
                    break;
                case 20:
                    if (b2 == 11) {
                        this.f686k = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 21:
                    if (b2 == 11) {
                        this.f687l = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 22:
                    if (b2 == 8) {
                        this.f667a = jpVar.mo637a();
                        e(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 23:
                    if (b2 == 13) {
                        jo mo641a = jpVar.mo641a();
                        this.f673a = new HashMap(mo641a.f918a * 2);
                        for (int i2 = 0; i2 < mo641a.f918a; i2++) {
                            this.f673a.put(jpVar.mo644a(), jpVar.mo644a());
                        }
                        jpVar.h();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
            }
            jpVar.g();
        }
    }

    public void a() {
        if (this.f676b != null) {
            if (this.f678c != null) {
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
