package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ip implements jf<ip, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f719a;

    /* renamed from: a, reason: collision with other field name */
    public ij f720a;

    /* renamed from: a, reason: collision with other field name */
    public String f721a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f723a;

    /* renamed from: b, reason: collision with other field name */
    public String f725b;

    /* renamed from: c, reason: collision with other field name */
    public String f726c;

    /* renamed from: d, reason: collision with other field name */
    public String f727d;

    /* renamed from: e, reason: collision with other field name */
    public String f728e;

    /* renamed from: f, reason: collision with other field name */
    public String f729f;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f718a = new ju("XmPushActionCommandResult");
    private static final jm a = new jm("", (byte) 12, 2);
    private static final jm b = new jm("", (byte) 11, 3);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9225c = new jm("", (byte) 11, 4);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9226d = new jm("", (byte) 11, 5);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9227e = new jm("", (byte) 10, 7);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9228f = new jm("", (byte) 11, 8);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9229g = new jm("", (byte) 11, 9);
    private static final jm h = new jm("", (byte) 15, 10);
    private static final jm i = new jm("", (byte) 11, 12);
    private static final jm j = new jm("", (byte) 2, 13);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f722a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f724a = true;

    /* renamed from: a, reason: collision with other method in class */
    public boolean m554a() {
        return this.f720a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m556b() {
        return this.f721a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m557c() {
        return this.f725b != null;
    }

    public boolean d() {
        return this.f726c != null;
    }

    public boolean e() {
        return this.f722a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ip)) {
            return m555a((ip) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f727d != null;
    }

    public boolean g() {
        return this.f728e != null;
    }

    public boolean h() {
        return this.f723a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f729f != null;
    }

    public boolean j() {
        return this.f722a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m554a()) {
            sb.append("target:");
            ij ijVar = this.f720a;
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
        String str = this.f721a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f725b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f726c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f719a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f727d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f728e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f723a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f729f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f724a);
        }
        sb.append(")");
        return sb.toString();
    }

    public String a() {
        return this.f721a;
    }

    public String b() {
        return this.f726c;
    }

    public String c() {
        return this.f729f;
    }

    public void a(boolean z) {
        this.f722a.set(0, z);
    }

    public void b(boolean z) {
        this.f722a.set(1, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public List<String> m552a() {
        return this.f723a;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m553a();
        jpVar.a(f718a);
        if (this.f720a != null && m554a()) {
            jpVar.a(a);
            this.f720a.b(jpVar);
            jpVar.b();
        }
        if (this.f721a != null) {
            jpVar.a(b);
            jpVar.a(this.f721a);
            jpVar.b();
        }
        if (this.f725b != null) {
            jpVar.a(f9225c);
            jpVar.a(this.f725b);
            jpVar.b();
        }
        if (this.f726c != null) {
            jpVar.a(f9226d);
            jpVar.a(this.f726c);
            jpVar.b();
        }
        jpVar.a(f9227e);
        jpVar.a(this.f719a);
        jpVar.b();
        if (this.f727d != null && f()) {
            jpVar.a(f9228f);
            jpVar.a(this.f727d);
            jpVar.b();
        }
        if (this.f728e != null && g()) {
            jpVar.a(f9229g);
            jpVar.a(this.f728e);
            jpVar.b();
        }
        if (this.f723a != null && h()) {
            jpVar.a(h);
            jpVar.a(new jn((byte) 11, this.f723a.size()));
            Iterator<String> it2 = this.f723a.iterator();
            while (it2.hasNext()) {
                jpVar.a(it2.next());
            }
            jpVar.e();
            jpVar.b();
        }
        if (this.f729f != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f729f);
            jpVar.b();
        }
        if (j()) {
            jpVar.a(j);
            jpVar.a(this.f724a);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m555a(ip ipVar) {
        if (ipVar == null) {
            return false;
        }
        boolean m554a = m554a();
        boolean m554a2 = ipVar.m554a();
        if ((m554a || m554a2) && !(m554a && m554a2 && this.f720a.m536a(ipVar.f720a))) {
            return false;
        }
        boolean m556b = m556b();
        boolean m556b2 = ipVar.m556b();
        if ((m556b || m556b2) && !(m556b && m556b2 && this.f721a.equals(ipVar.f721a))) {
            return false;
        }
        boolean m557c = m557c();
        boolean m557c2 = ipVar.m557c();
        if ((m557c || m557c2) && !(m557c && m557c2 && this.f725b.equals(ipVar.f725b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ipVar.d();
        if (((d2 || d3) && !(d2 && d3 && this.f726c.equals(ipVar.f726c))) || this.f719a != ipVar.f719a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ipVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f727d.equals(ipVar.f727d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ipVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f728e.equals(ipVar.f728e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ipVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f723a.equals(ipVar.f723a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ipVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f729f.equals(ipVar.f729f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ipVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f724a == ipVar.f724a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ip ipVar) {
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
        if (!getClass().equals(ipVar.getClass())) {
            return getClass().getName().compareTo(ipVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m554a()).compareTo(Boolean.valueOf(ipVar.m554a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m554a() && (a11 = jg.a(this.f720a, ipVar.f720a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m556b()).compareTo(Boolean.valueOf(ipVar.m556b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m556b() && (a10 = jg.a(this.f721a, ipVar.f721a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(m557c()).compareTo(Boolean.valueOf(ipVar.m557c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m557c() && (a9 = jg.a(this.f725b, ipVar.f725b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ipVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jg.a(this.f726c, ipVar.f726c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ipVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jg.a(this.f719a, ipVar.f719a)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ipVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jg.a(this.f727d, ipVar.f727d)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ipVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jg.a(this.f728e, ipVar.f728e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ipVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jg.a(this.f723a, ipVar.f723a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ipVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jg.a(this.f729f, ipVar.f729f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ipVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = jg.a(this.f724a, ipVar.f724a)) == 0) {
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
                    m553a();
                    return;
                } else {
                    StringBuilder M = e.a.a.a.a.M("Required field 'errorCode' was not found in serialized data! Struct: ");
                    M.append(toString());
                    throw new jq(M.toString());
                }
            }
            switch (mo639a.f916a) {
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f720a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f721a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f725b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f726c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                case 11:
                default:
                    js.a(jpVar, b2);
                    break;
                case 7:
                    if (b2 == 10) {
                        this.f719a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f727d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f728e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 15) {
                        jn mo640a = jpVar.mo640a();
                        this.f723a = new ArrayList(mo640a.f917a);
                        for (int i2 = 0; i2 < mo640a.f917a; i2++) {
                            this.f723a.add(jpVar.mo644a());
                        }
                        jpVar.i();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 12:
                    if (b2 == 11) {
                        this.f729f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 13:
                    if (b2 == 2) {
                        this.f724a = jpVar.mo649a();
                        b(true);
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
    public void m553a() {
        if (this.f721a != null) {
            if (this.f725b != null) {
                if (this.f726c != null) {
                    return;
                }
                StringBuilder M = e.a.a.a.a.M("Required field 'cmdName' was not present! Struct: ");
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
