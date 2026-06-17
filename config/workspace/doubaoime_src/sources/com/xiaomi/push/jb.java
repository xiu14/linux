package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class jb implements jf<jb, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f876a;

    /* renamed from: a, reason: collision with other field name */
    public ij f877a;

    /* renamed from: a, reason: collision with other field name */
    public String f878a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f879a = new BitSet(3);

    /* renamed from: b, reason: collision with other field name */
    public long f880b;

    /* renamed from: b, reason: collision with other field name */
    public String f881b;

    /* renamed from: c, reason: collision with other field name */
    public long f882c;

    /* renamed from: c, reason: collision with other field name */
    public String f883c;

    /* renamed from: d, reason: collision with other field name */
    public String f884d;

    /* renamed from: e, reason: collision with other field name */
    public String f885e;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f875a = new ju("XmPushActionUnRegistrationResult");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9279c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9280d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9281e = new jm("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9282f = new jm("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9283g = new jm("", (byte) 11, 8);
    private static final jm h = new jm("", (byte) 10, 9);
    private static final jm i = new jm("", (byte) 10, 10);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m623a() {
        return this.f878a != null;
    }

    public boolean b() {
        return this.f877a != null;
    }

    public boolean c() {
        return this.f881b != null;
    }

    public boolean d() {
        return this.f883c != null;
    }

    public boolean e() {
        return this.f879a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jb)) {
            return m624a((jb) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f884d != null;
    }

    public boolean g() {
        return this.f885e != null;
    }

    public boolean h() {
        return this.f879a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f879a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (m623a()) {
            sb.append("debug:");
            String str = this.f878a;
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
            ij ijVar = this.f877a;
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
        String str2 = this.f881b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f883c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f876a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f884d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f885e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f880b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f882c);
        }
        sb.append(")");
        return sb.toString();
    }

    public void a(boolean z) {
        this.f879a.set(0, z);
    }

    public void b(boolean z) {
        this.f879a.set(1, z);
    }

    public void c(boolean z) {
        this.f879a.set(2, z);
    }

    public String a() {
        return this.f885e;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m622a();
        jpVar.a(f875a);
        if (this.f878a != null && m623a()) {
            jpVar.a(a);
            jpVar.a(this.f878a);
            jpVar.b();
        }
        if (this.f877a != null && b()) {
            jpVar.a(b);
            this.f877a.b(jpVar);
            jpVar.b();
        }
        if (this.f881b != null) {
            jpVar.a(f9279c);
            jpVar.a(this.f881b);
            jpVar.b();
        }
        if (this.f883c != null) {
            jpVar.a(f9280d);
            jpVar.a(this.f883c);
            jpVar.b();
        }
        jpVar.a(f9281e);
        jpVar.a(this.f876a);
        jpVar.b();
        if (this.f884d != null && f()) {
            jpVar.a(f9282f);
            jpVar.a(this.f884d);
            jpVar.b();
        }
        if (this.f885e != null && g()) {
            jpVar.a(f9283g);
            jpVar.a(this.f885e);
            jpVar.b();
        }
        if (h()) {
            jpVar.a(h);
            jpVar.a(this.f880b);
            jpVar.b();
        }
        if (i()) {
            jpVar.a(i);
            jpVar.a(this.f882c);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m624a(jb jbVar) {
        if (jbVar == null) {
            return false;
        }
        boolean m623a = m623a();
        boolean m623a2 = jbVar.m623a();
        if ((m623a || m623a2) && !(m623a && m623a2 && this.f878a.equals(jbVar.f878a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jbVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f877a.m536a(jbVar.f877a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jbVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f881b.equals(jbVar.f881b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jbVar.d();
        if (((d2 || d3) && !(d2 && d3 && this.f883c.equals(jbVar.f883c))) || this.f876a != jbVar.f876a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jbVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f884d.equals(jbVar.f884d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jbVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f885e.equals(jbVar.f885e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jbVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f880b == jbVar.f880b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jbVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f882c == jbVar.f882c;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jb jbVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(jbVar.getClass())) {
            return getClass().getName().compareTo(jbVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m623a()).compareTo(Boolean.valueOf(jbVar.m623a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m623a() && (a10 = jg.a(this.f878a, jbVar.f878a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(jbVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a9 = jg.a(this.f877a, jbVar.f877a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(jbVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a8 = jg.a(this.f881b, jbVar.f881b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(jbVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jg.a(this.f883c, jbVar.f883c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(jbVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jg.a(this.f876a, jbVar.f876a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(jbVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jg.a(this.f884d, jbVar.f884d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(jbVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jg.a(this.f885e, jbVar.f885e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(jbVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jg.a(this.f880b, jbVar.f880b)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(jbVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = jg.a(this.f882c, jbVar.f882c)) == 0) {
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
                    m622a();
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
                        this.f878a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f877a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f881b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f883c = jpVar.mo644a();
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
                        this.f876a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f884d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f885e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 10) {
                        this.f880b = jpVar.mo638a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 10) {
                        this.f882c = jpVar.mo638a();
                        c(true);
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
    public void m622a() {
        if (this.f881b != null) {
            if (this.f883c != null) {
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
