package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class ja implements jf<ja, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f862a;

    /* renamed from: a, reason: collision with other field name */
    public ij f863a;

    /* renamed from: a, reason: collision with other field name */
    public String f864a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f865a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f866a = true;

    /* renamed from: b, reason: collision with other field name */
    public String f867b;

    /* renamed from: c, reason: collision with other field name */
    public String f868c;

    /* renamed from: d, reason: collision with other field name */
    public String f869d;

    /* renamed from: e, reason: collision with other field name */
    public String f870e;

    /* renamed from: f, reason: collision with other field name */
    public String f871f;

    /* renamed from: g, reason: collision with other field name */
    public String f872g;

    /* renamed from: h, reason: collision with other field name */
    public String f873h;

    /* renamed from: i, reason: collision with other field name */
    public String f874i;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f861a = new ju("XmPushActionUnRegistration");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9274c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9275d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9276e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9277f = new jm("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9278g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 11, 8);
    private static final jm i = new jm("", (byte) 11, 9);
    private static final jm j = new jm("", (byte) 11, 10);
    private static final jm k = new jm("", (byte) 2, 11);
    private static final jm l = new jm("", (byte) 10, 12);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m620a() {
        return this.f864a != null;
    }

    public boolean b() {
        return this.f863a != null;
    }

    public boolean c() {
        return this.f867b != null;
    }

    public boolean d() {
        return this.f868c != null;
    }

    public boolean e() {
        return this.f869d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ja)) {
            return m621a((ja) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f870e != null;
    }

    public boolean g() {
        return this.f871f != null;
    }

    public boolean h() {
        return this.f872g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f873h != null;
    }

    public boolean j() {
        return this.f874i != null;
    }

    public boolean k() {
        return this.f865a.get(0);
    }

    public boolean l() {
        return this.f865a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        boolean z2 = false;
        if (m620a()) {
            sb.append("debug:");
            String str = this.f864a;
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
            ij ijVar = this.f863a;
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
        String str2 = this.f867b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f868c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("regId:");
            String str4 = this.f869d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str5 = this.f870e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f871f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("token:");
            String str7 = this.f872g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str8 = this.f873h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f874i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f866a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f862a);
        }
        sb.append(")");
        return sb.toString();
    }

    public ja a(String str) {
        this.f867b = str;
        return this;
    }

    public ja b(String str) {
        this.f868c = str;
        return this;
    }

    public ja c(String str) {
        this.f869d = str;
        return this;
    }

    public ja d(String str) {
        this.f871f = str;
        return this;
    }

    public ja e(String str) {
        this.f872g = str;
        return this;
    }

    public void a(boolean z) {
        this.f865a.set(0, z);
    }

    public void b(boolean z) {
        this.f865a.set(1, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m621a(ja jaVar) {
        if (jaVar == null) {
            return false;
        }
        boolean m620a = m620a();
        boolean m620a2 = jaVar.m620a();
        if ((m620a || m620a2) && !(m620a && m620a2 && this.f864a.equals(jaVar.f864a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jaVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f863a.m536a(jaVar.f863a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jaVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f867b.equals(jaVar.f867b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jaVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f868c.equals(jaVar.f868c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jaVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f869d.equals(jaVar.f869d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jaVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f870e.equals(jaVar.f870e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jaVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f871f.equals(jaVar.f871f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jaVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f872g.equals(jaVar.f872g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jaVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f873h.equals(jaVar.f873h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jaVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f874i.equals(jaVar.f874i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jaVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f866a == jaVar.f866a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jaVar.l();
        if (l2 || l3) {
            return l2 && l3 && this.f862a == jaVar.f862a;
        }
        return true;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f861a);
        if (this.f864a != null && m620a()) {
            jpVar.a(a);
            jpVar.a(this.f864a);
            jpVar.b();
        }
        if (this.f863a != null && b()) {
            jpVar.a(b);
            this.f863a.b(jpVar);
            jpVar.b();
        }
        if (this.f867b != null) {
            jpVar.a(f9274c);
            jpVar.a(this.f867b);
            jpVar.b();
        }
        if (this.f868c != null) {
            jpVar.a(f9275d);
            jpVar.a(this.f868c);
            jpVar.b();
        }
        if (this.f869d != null && e()) {
            jpVar.a(f9276e);
            jpVar.a(this.f869d);
            jpVar.b();
        }
        if (this.f870e != null && f()) {
            jpVar.a(f9277f);
            jpVar.a(this.f870e);
            jpVar.b();
        }
        if (this.f871f != null && g()) {
            jpVar.a(f9278g);
            jpVar.a(this.f871f);
            jpVar.b();
        }
        if (this.f872g != null && h()) {
            jpVar.a(h);
            jpVar.a(this.f872g);
            jpVar.b();
        }
        if (this.f873h != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f873h);
            jpVar.b();
        }
        if (this.f874i != null && j()) {
            jpVar.a(j);
            jpVar.a(this.f874i);
            jpVar.b();
        }
        if (k()) {
            jpVar.a(k);
            jpVar.a(this.f866a);
            jpVar.b();
        }
        if (l()) {
            jpVar.a(l);
            jpVar.a(this.f862a);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ja jaVar) {
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
        if (!getClass().equals(jaVar.getClass())) {
            return getClass().getName().compareTo(jaVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m620a()).compareTo(Boolean.valueOf(jaVar.m620a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m620a() && (a13 = jg.a(this.f864a, jaVar.f864a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jaVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a12 = jg.a(this.f863a, jaVar.f863a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jaVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a11 = jg.a(this.f867b, jaVar.f867b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jaVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a10 = jg.a(this.f868c, jaVar.f868c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jaVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a9 = jg.a(this.f869d, jaVar.f869d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jaVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a8 = jg.a(this.f870e, jaVar.f870e)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jaVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a7 = jg.a(this.f871f, jaVar.f871f)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jaVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a6 = jg.a(this.f872g, jaVar.f872g)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jaVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a5 = jg.a(this.f873h, jaVar.f873h)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(jaVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a4 = jg.a(this.f874i, jaVar.f874i)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(jaVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a3 = jg.a(this.f866a, jaVar.f866a)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(jaVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!l() || (a2 = jg.a(this.f862a, jaVar.f862a)) == 0) {
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
                a();
                return;
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f864a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f863a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f867b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f868c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f869d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 11) {
                        this.f870e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f871f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f872g = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f873h = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 11) {
                        this.f874i = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 2) {
                        this.f866a = jpVar.mo649a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 12:
                    if (b2 == 10) {
                        this.f862a = jpVar.mo638a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                default:
                    js.a(jpVar, b2);
                    break;
            }
            jpVar.g();
        }
    }

    public void a() {
        if (this.f867b != null) {
            if (this.f868c != null) {
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
