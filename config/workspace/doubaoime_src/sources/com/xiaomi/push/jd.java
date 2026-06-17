package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class jd implements jf<jd, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f896a;

    /* renamed from: a, reason: collision with other field name */
    public ij f897a;

    /* renamed from: a, reason: collision with other field name */
    public String f898a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f899a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f900b;

    /* renamed from: c, reason: collision with other field name */
    public String f901c;

    /* renamed from: d, reason: collision with other field name */
    public String f902d;

    /* renamed from: e, reason: collision with other field name */
    public String f903e;

    /* renamed from: f, reason: collision with other field name */
    public String f904f;

    /* renamed from: g, reason: collision with other field name */
    public String f905g;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f895a = new ju("XmPushActionUnSubscriptionResult");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9289c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9290d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9291e = new jm("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9292f = new jm("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9293g = new jm("", (byte) 11, 8);
    private static final jm h = new jm("", (byte) 11, 9);
    private static final jm i = new jm("", (byte) 11, 10);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m628a() {
        return this.f898a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m630b() {
        return this.f897a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m631c() {
        return this.f900b != null;
    }

    public boolean d() {
        return this.f901c != null;
    }

    public boolean e() {
        return this.f899a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jd)) {
            return m629a((jd) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f902d != null;
    }

    public boolean g() {
        return this.f903e != null;
    }

    public boolean h() {
        return this.f904f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f905g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (m628a()) {
            sb.append("debug:");
            String str = this.f898a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m630b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f897a;
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
        String str2 = this.f900b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f901c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f896a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f902d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f903e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f904f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f905g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public String a() {
        return this.f900b;
    }

    public String b() {
        return this.f903e;
    }

    public String c() {
        return this.f905g;
    }

    public void a(boolean z) {
        this.f899a.set(0, z);
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m627a();
        jpVar.a(f895a);
        if (this.f898a != null && m628a()) {
            jpVar.a(a);
            jpVar.a(this.f898a);
            jpVar.b();
        }
        if (this.f897a != null && m630b()) {
            jpVar.a(b);
            this.f897a.b(jpVar);
            jpVar.b();
        }
        if (this.f900b != null) {
            jpVar.a(f9289c);
            jpVar.a(this.f900b);
            jpVar.b();
        }
        if (this.f901c != null && d()) {
            jpVar.a(f9290d);
            jpVar.a(this.f901c);
            jpVar.b();
        }
        if (e()) {
            jpVar.a(f9291e);
            jpVar.a(this.f896a);
            jpVar.b();
        }
        if (this.f902d != null && f()) {
            jpVar.a(f9292f);
            jpVar.a(this.f902d);
            jpVar.b();
        }
        if (this.f903e != null && g()) {
            jpVar.a(f9293g);
            jpVar.a(this.f903e);
            jpVar.b();
        }
        if (this.f904f != null && h()) {
            jpVar.a(h);
            jpVar.a(this.f904f);
            jpVar.b();
        }
        if (this.f905g != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f905g);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m629a(jd jdVar) {
        if (jdVar == null) {
            return false;
        }
        boolean m628a = m628a();
        boolean m628a2 = jdVar.m628a();
        if ((m628a || m628a2) && !(m628a && m628a2 && this.f898a.equals(jdVar.f898a))) {
            return false;
        }
        boolean m630b = m630b();
        boolean m630b2 = jdVar.m630b();
        if ((m630b || m630b2) && !(m630b && m630b2 && this.f897a.m536a(jdVar.f897a))) {
            return false;
        }
        boolean m631c = m631c();
        boolean m631c2 = jdVar.m631c();
        if ((m631c || m631c2) && !(m631c && m631c2 && this.f900b.equals(jdVar.f900b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jdVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f901c.equals(jdVar.f901c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jdVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f896a == jdVar.f896a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jdVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f902d.equals(jdVar.f902d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jdVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f903e.equals(jdVar.f903e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jdVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f904f.equals(jdVar.f904f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jdVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f905g.equals(jdVar.f905g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jd jdVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(jdVar.getClass())) {
            return getClass().getName().compareTo(jdVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m628a()).compareTo(Boolean.valueOf(jdVar.m628a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m628a() && (a10 = jg.a(this.f898a, jdVar.f898a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m630b()).compareTo(Boolean.valueOf(jdVar.m630b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m630b() && (a9 = jg.a(this.f897a, jdVar.f897a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(m631c()).compareTo(Boolean.valueOf(jdVar.m631c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m631c() && (a8 = jg.a(this.f900b, jdVar.f900b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jdVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jg.a(this.f901c, jdVar.f901c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jdVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jg.a(this.f896a, jdVar.f896a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jdVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jg.a(this.f902d, jdVar.f902d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jdVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jg.a(this.f903e, jdVar.f903e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jdVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jg.a(this.f904f, jdVar.f904f)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jdVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = jg.a(this.f905g, jdVar.f905g)) == 0) {
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
                m627a();
                return;
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f898a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f897a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f900b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f901c = jpVar.mo644a();
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
                        this.f896a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f902d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f903e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f904f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 11) {
                        this.f905g = jpVar.mo644a();
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
    public void m627a() {
        if (this.f900b != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
