package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class jc implements jf<jc, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public ij f887a;

    /* renamed from: a, reason: collision with other field name */
    public String f888a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f889a;

    /* renamed from: b, reason: collision with other field name */
    public String f890b;

    /* renamed from: c, reason: collision with other field name */
    public String f891c;

    /* renamed from: d, reason: collision with other field name */
    public String f892d;

    /* renamed from: e, reason: collision with other field name */
    public String f893e;

    /* renamed from: f, reason: collision with other field name */
    public String f894f;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f886a = new ju("XmPushActionUnSubscription");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9284c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9285d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9286e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9287f = new jm("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9288g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 15, 8);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m625a() {
        return this.f888a != null;
    }

    public boolean b() {
        return this.f887a != null;
    }

    public boolean c() {
        return this.f890b != null;
    }

    public boolean d() {
        return this.f891c != null;
    }

    public boolean e() {
        return this.f892d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jc)) {
            return m626a((jc) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f893e != null;
    }

    public boolean g() {
        return this.f894f != null;
    }

    public boolean h() {
        return this.f889a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (m625a()) {
            sb.append("debug:");
            String str = this.f888a;
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
            ij ijVar = this.f887a;
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
        String str2 = this.f890b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f891c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f892d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f893e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f894f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f889a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public jc a(String str) {
        this.f890b = str;
        return this;
    }

    public jc b(String str) {
        this.f891c = str;
        return this;
    }

    public jc c(String str) {
        this.f892d = str;
        return this;
    }

    public jc d(String str) {
        this.f893e = str;
        return this;
    }

    public jc e(String str) {
        this.f894f = str;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m626a(jc jcVar) {
        if (jcVar == null) {
            return false;
        }
        boolean m625a = m625a();
        boolean m625a2 = jcVar.m625a();
        if ((m625a || m625a2) && !(m625a && m625a2 && this.f888a.equals(jcVar.f888a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jcVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f887a.m536a(jcVar.f887a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jcVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f890b.equals(jcVar.f890b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jcVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f891c.equals(jcVar.f891c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jcVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f892d.equals(jcVar.f892d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jcVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f893e.equals(jcVar.f893e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jcVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f894f.equals(jcVar.f894f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jcVar.h();
        if (h2 || h3) {
            return h2 && h3 && this.f889a.equals(jcVar.f889a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f886a);
        if (this.f888a != null && m625a()) {
            jpVar.a(a);
            jpVar.a(this.f888a);
            jpVar.b();
        }
        if (this.f887a != null && b()) {
            jpVar.a(b);
            this.f887a.b(jpVar);
            jpVar.b();
        }
        if (this.f890b != null) {
            jpVar.a(f9284c);
            jpVar.a(this.f890b);
            jpVar.b();
        }
        if (this.f891c != null) {
            jpVar.a(f9285d);
            jpVar.a(this.f891c);
            jpVar.b();
        }
        if (this.f892d != null) {
            jpVar.a(f9286e);
            jpVar.a(this.f892d);
            jpVar.b();
        }
        if (this.f893e != null && f()) {
            jpVar.a(f9287f);
            jpVar.a(this.f893e);
            jpVar.b();
        }
        if (this.f894f != null && g()) {
            jpVar.a(f9288g);
            jpVar.a(this.f894f);
            jpVar.b();
        }
        if (this.f889a != null && h()) {
            jpVar.a(h);
            jpVar.a(new jn((byte) 11, this.f889a.size()));
            Iterator<String> it2 = this.f889a.iterator();
            while (it2.hasNext()) {
                jpVar.a(it2.next());
            }
            jpVar.e();
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jc jcVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(jcVar.getClass())) {
            return getClass().getName().compareTo(jcVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m625a()).compareTo(Boolean.valueOf(jcVar.m625a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m625a() && (a9 = jg.a(this.f888a, jcVar.f888a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jcVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a8 = jg.a(this.f887a, jcVar.f887a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jcVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a7 = jg.a(this.f890b, jcVar.f890b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jcVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a6 = jg.a(this.f891c, jcVar.f891c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jcVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a5 = jg.a(this.f892d, jcVar.f892d)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jcVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a4 = jg.a(this.f893e, jcVar.f893e)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jcVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a3 = jg.a(this.f894f, jcVar.f894f)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jcVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!h() || (a2 = jg.a(this.f889a, jcVar.f889a)) == 0) {
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
                        this.f888a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f887a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f890b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f891c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f892d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 11) {
                        this.f893e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f894f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 15) {
                        jn mo640a = jpVar.mo640a();
                        this.f889a = new ArrayList(mo640a.f917a);
                        for (int i = 0; i < mo640a.f917a; i++) {
                            this.f889a.add(jpVar.mo644a());
                        }
                        jpVar.i();
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
        if (this.f890b != null) {
            if (this.f891c != null) {
                if (this.f892d != null) {
                    return;
                }
                StringBuilder M = e.a.a.a.a.M("Required field 'topic' was not present! Struct: ");
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
