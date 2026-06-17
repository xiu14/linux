package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class iz implements jf<iz, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f849a;

    /* renamed from: a, reason: collision with other field name */
    public ij f850a;

    /* renamed from: a, reason: collision with other field name */
    public String f851a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f852a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f853b;

    /* renamed from: c, reason: collision with other field name */
    public String f854c;

    /* renamed from: d, reason: collision with other field name */
    public String f855d;

    /* renamed from: e, reason: collision with other field name */
    public String f856e;

    /* renamed from: f, reason: collision with other field name */
    public String f857f;

    /* renamed from: g, reason: collision with other field name */
    public String f858g;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f848a = new ju("XmPushActionSubscriptionResult");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9265c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9266d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9267e = new jm("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9268f = new jm("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9269g = new jm("", (byte) 11, 8);
    private static final jm h = new jm("", (byte) 11, 9);
    private static final jm i = new jm("", (byte) 11, 10);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m609a() {
        return this.f851a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m611b() {
        return this.f850a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m612c() {
        return this.f853b != null;
    }

    public boolean d() {
        return this.f854c != null;
    }

    public boolean e() {
        return this.f852a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iz)) {
            return m610a((iz) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f855d != null;
    }

    public boolean g() {
        return this.f856e != null;
    }

    public boolean h() {
        return this.f857f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f858g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (m609a()) {
            sb.append("debug:");
            String str = this.f851a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m611b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f850a;
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
        String str2 = this.f853b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f854c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f849a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f855d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f856e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f857f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f858g;
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
        return this.f853b;
    }

    public String b() {
        return this.f856e;
    }

    public String c() {
        return this.f858g;
    }

    public void a(boolean z) {
        this.f852a.set(0, z);
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m608a();
        jpVar.a(f848a);
        if (this.f851a != null && m609a()) {
            jpVar.a(a);
            jpVar.a(this.f851a);
            jpVar.b();
        }
        if (this.f850a != null && m611b()) {
            jpVar.a(b);
            this.f850a.b(jpVar);
            jpVar.b();
        }
        if (this.f853b != null) {
            jpVar.a(f9265c);
            jpVar.a(this.f853b);
            jpVar.b();
        }
        if (this.f854c != null && d()) {
            jpVar.a(f9266d);
            jpVar.a(this.f854c);
            jpVar.b();
        }
        if (e()) {
            jpVar.a(f9267e);
            jpVar.a(this.f849a);
            jpVar.b();
        }
        if (this.f855d != null && f()) {
            jpVar.a(f9268f);
            jpVar.a(this.f855d);
            jpVar.b();
        }
        if (this.f856e != null && g()) {
            jpVar.a(f9269g);
            jpVar.a(this.f856e);
            jpVar.b();
        }
        if (this.f857f != null && h()) {
            jpVar.a(h);
            jpVar.a(this.f857f);
            jpVar.b();
        }
        if (this.f858g != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f858g);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m610a(iz izVar) {
        if (izVar == null) {
            return false;
        }
        boolean m609a = m609a();
        boolean m609a2 = izVar.m609a();
        if ((m609a || m609a2) && !(m609a && m609a2 && this.f851a.equals(izVar.f851a))) {
            return false;
        }
        boolean m611b = m611b();
        boolean m611b2 = izVar.m611b();
        if ((m611b || m611b2) && !(m611b && m611b2 && this.f850a.m536a(izVar.f850a))) {
            return false;
        }
        boolean m612c = m612c();
        boolean m612c2 = izVar.m612c();
        if ((m612c || m612c2) && !(m612c && m612c2 && this.f853b.equals(izVar.f853b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = izVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f854c.equals(izVar.f854c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = izVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f849a == izVar.f849a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = izVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f855d.equals(izVar.f855d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = izVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f856e.equals(izVar.f856e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = izVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f857f.equals(izVar.f857f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = izVar.i();
        if (i2 || i3) {
            return i2 && i3 && this.f858g.equals(izVar.f858g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iz izVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        if (!getClass().equals(izVar.getClass())) {
            return getClass().getName().compareTo(izVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m609a()).compareTo(Boolean.valueOf(izVar.m609a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m609a() && (a10 = jg.a(this.f851a, izVar.f851a)) != 0) {
            return a10;
        }
        int compareTo2 = Boolean.valueOf(m611b()).compareTo(Boolean.valueOf(izVar.m611b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m611b() && (a9 = jg.a(this.f850a, izVar.f850a)) != 0) {
            return a9;
        }
        int compareTo3 = Boolean.valueOf(m612c()).compareTo(Boolean.valueOf(izVar.m612c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m612c() && (a8 = jg.a(this.f853b, izVar.f853b)) != 0) {
            return a8;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(izVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a7 = jg.a(this.f854c, izVar.f854c)) != 0) {
            return a7;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(izVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a6 = jg.a(this.f849a, izVar.f849a)) != 0) {
            return a6;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(izVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a5 = jg.a(this.f855d, izVar.f855d)) != 0) {
            return a5;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(izVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a4 = jg.a(this.f856e, izVar.f856e)) != 0) {
            return a4;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(izVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a3 = jg.a(this.f857f, izVar.f857f)) != 0) {
            return a3;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(izVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (!i() || (a2 = jg.a(this.f858g, izVar.f858g)) == 0) {
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
                m608a();
                return;
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f851a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f850a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f853b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f854c = jpVar.mo644a();
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
                        this.f849a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f855d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f856e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f857f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 11) {
                        this.f858g = jpVar.mo644a();
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
    public void m608a() {
        if (this.f853b != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
