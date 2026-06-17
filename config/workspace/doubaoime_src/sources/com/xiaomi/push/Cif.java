package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* renamed from: com.xiaomi.push.if, reason: invalid class name */
/* loaded from: classes2.dex */
public class Cif implements jf<Cif, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f613a;

    /* renamed from: a, reason: collision with other field name */
    public long f614a;

    /* renamed from: a, reason: collision with other field name */
    public String f615a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f616a = new BitSet(6);

    /* renamed from: a, reason: collision with other field name */
    public boolean f617a;

    /* renamed from: b, reason: collision with other field name */
    public int f618b;

    /* renamed from: b, reason: collision with other field name */
    public boolean f619b;

    /* renamed from: c, reason: collision with other field name */
    public int f620c;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f612a = new ju("OnlineConfigItem");
    private static final jm a = new jm("", (byte) 8, 1);
    private static final jm b = new jm("", (byte) 8, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9190c = new jm("", (byte) 2, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9191d = new jm("", (byte) 8, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9192e = new jm("", (byte) 10, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9193f = new jm("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9194g = new jm("", (byte) 2, 7);

    public int a() {
        return this.f613a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m511a() {
    }

    public int b() {
        return this.f618b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m515c() {
        return this.f616a.get(2);
    }

    public boolean d() {
        return this.f616a.get(3);
    }

    public boolean e() {
        return this.f616a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Cif)) {
            return m513a((Cif) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f615a != null;
    }

    public boolean g() {
        return this.f619b;
    }

    public boolean h() {
        return this.f616a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (m512a()) {
            sb.append("key:");
            sb.append(this.f613a);
            z = false;
        } else {
            z = true;
        }
        if (m514b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f618b);
            z = false;
        }
        if (m515c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f617a);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f620c);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f614a);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            String str = this.f615a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        } else {
            z2 = z;
        }
        if (h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f619b);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m512a() {
        return this.f616a.get(0);
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m514b() {
        return this.f616a.get(1);
    }

    public void c(boolean z) {
        this.f616a.set(2, z);
    }

    public void d(boolean z) {
        this.f616a.set(3, z);
    }

    public void e(boolean z) {
        this.f616a.set(4, z);
    }

    public void f(boolean z) {
        this.f616a.set(5, z);
    }

    public void a(boolean z) {
        this.f616a.set(0, z);
    }

    public void b(boolean z) {
        this.f616a.set(1, z);
    }

    public int c() {
        return this.f620c;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m509a() {
        return this.f614a;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m511a();
        jpVar.a(f612a);
        if (m512a()) {
            jpVar.a(a);
            jpVar.mo648a(this.f613a);
            jpVar.b();
        }
        if (m514b()) {
            jpVar.a(b);
            jpVar.mo648a(this.f618b);
            jpVar.b();
        }
        if (m515c()) {
            jpVar.a(f9190c);
            jpVar.a(this.f617a);
            jpVar.b();
        }
        if (d()) {
            jpVar.a(f9191d);
            jpVar.mo648a(this.f620c);
            jpVar.b();
        }
        if (e()) {
            jpVar.a(f9192e);
            jpVar.a(this.f614a);
            jpVar.b();
        }
        if (this.f615a != null && f()) {
            jpVar.a(f9193f);
            jpVar.a(this.f615a);
            jpVar.b();
        }
        if (h()) {
            jpVar.a(f9194g);
            jpVar.a(this.f619b);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m510a() {
        return this.f615a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m513a(Cif cif) {
        if (cif == null) {
            return false;
        }
        boolean m512a = m512a();
        boolean m512a2 = cif.m512a();
        if ((m512a || m512a2) && !(m512a && m512a2 && this.f613a == cif.f613a)) {
            return false;
        }
        boolean m514b = m514b();
        boolean m514b2 = cif.m514b();
        if ((m514b || m514b2) && !(m514b && m514b2 && this.f618b == cif.f618b)) {
            return false;
        }
        boolean m515c = m515c();
        boolean m515c2 = cif.m515c();
        if ((m515c || m515c2) && !(m515c && m515c2 && this.f617a == cif.f617a)) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = cif.d();
        if ((d2 || d3) && !(d2 && d3 && this.f620c == cif.f620c)) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = cif.e();
        if ((e2 || e3) && !(e2 && e3 && this.f614a == cif.f614a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = cif.f();
        if ((f2 || f3) && !(f2 && f3 && this.f615a.equals(cif.f615a))) {
            return false;
        }
        boolean h = h();
        boolean h2 = cif.h();
        if (h || h2) {
            return h && h2 && this.f619b == cif.f619b;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cif cif) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(cif.getClass())) {
            return getClass().getName().compareTo(cif.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m512a()).compareTo(Boolean.valueOf(cif.m512a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m512a() && (a8 = jg.a(this.f613a, cif.f613a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(m514b()).compareTo(Boolean.valueOf(cif.m514b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m514b() && (a7 = jg.a(this.f618b, cif.f618b)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(m515c()).compareTo(Boolean.valueOf(cif.m515c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m515c() && (a6 = jg.a(this.f617a, cif.f617a)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(cif.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a5 = jg.a(this.f620c, cif.f620c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(cif.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a4 = jg.a(this.f614a, cif.f614a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(cif.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a3 = jg.a(this.f615a, cif.f615a)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(cif.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!h() || (a2 = jg.a(this.f619b, cif.f619b)) == 0) {
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
                m511a();
                return;
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 8) {
                        this.f613a = jpVar.mo637a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 8) {
                        this.f618b = jpVar.mo637a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 2) {
                        this.f617a = jpVar.mo649a();
                        c(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 8) {
                        this.f620c = jpVar.mo637a();
                        d(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 10) {
                        this.f614a = jpVar.mo638a();
                        e(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 11) {
                        this.f615a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 2) {
                        this.f619b = jpVar.mo649a();
                        f(true);
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
}
