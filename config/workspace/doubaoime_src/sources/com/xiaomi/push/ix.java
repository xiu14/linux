package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ix implements jf<ix, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public ig f826a;

    /* renamed from: a, reason: collision with other field name */
    public ij f827a;

    /* renamed from: a, reason: collision with other field name */
    public String f828a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f830a;

    /* renamed from: b, reason: collision with other field name */
    public String f832b;

    /* renamed from: c, reason: collision with other field name */
    public String f833c;

    /* renamed from: d, reason: collision with other field name */
    public String f834d;

    /* renamed from: e, reason: collision with other field name */
    public String f835e;

    /* renamed from: f, reason: collision with other field name */
    public String f836f;

    /* renamed from: g, reason: collision with other field name */
    public String f837g;

    /* renamed from: h, reason: collision with other field name */
    public String f838h;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f825a = new ju("XmPushActionSendMessage");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9255c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9256d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9257e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9258f = new jm("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9259g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 12, 8);
    private static final jm i = new jm("", (byte) 2, 9);
    private static final jm j = new jm("", (byte) 13, 10);
    private static final jm k = new jm("", (byte) 11, 11);
    private static final jm l = new jm("", (byte) 11, 12);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f829a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    public boolean f831a = true;

    /* renamed from: a, reason: collision with other method in class */
    public boolean m599a() {
        return this.f828a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m601b() {
        return this.f827a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m602c() {
        return this.f832b != null;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m603d() {
        return this.f833c != null;
    }

    /* renamed from: e, reason: collision with other method in class */
    public boolean m604e() {
        return this.f834d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ix)) {
            return m600a((ix) obj);
        }
        return false;
    }

    /* renamed from: f, reason: collision with other method in class */
    public boolean m605f() {
        return this.f835e != null;
    }

    public boolean g() {
        return this.f836f != null;
    }

    public boolean h() {
        return this.f826a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f829a.get(0);
    }

    public boolean j() {
        return this.f830a != null;
    }

    public boolean k() {
        return this.f837g != null;
    }

    public boolean l() {
        return this.f838h != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = false;
        if (m599a()) {
            sb.append("debug:");
            String str = this.f828a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m601b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f827a;
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
        String str2 = this.f832b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f833c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m604e()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f834d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m605f()) {
            sb.append(", ");
            sb.append("topic:");
            String str5 = this.f835e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str6 = this.f836f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("message:");
            ig igVar = this.f826a;
            if (igVar == null) {
                sb.append("null");
            } else {
                sb.append(igVar);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f831a);
        }
        if (j()) {
            sb.append(", ");
            sb.append("params:");
            Map<String, String> map = this.f830a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f837g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str8 = this.f838h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m597a() {
        return this.f832b;
    }

    public String b() {
        return this.f833c;
    }

    public String c() {
        return this.f835e;
    }

    public String d() {
        return this.f836f;
    }

    public String e() {
        return this.f837g;
    }

    public String f() {
        return this.f838h;
    }

    public ig a() {
        return this.f826a;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m598a();
        jpVar.a(f825a);
        if (this.f828a != null && m599a()) {
            jpVar.a(a);
            jpVar.a(this.f828a);
            jpVar.b();
        }
        if (this.f827a != null && m601b()) {
            jpVar.a(b);
            this.f827a.b(jpVar);
            jpVar.b();
        }
        if (this.f832b != null) {
            jpVar.a(f9255c);
            jpVar.a(this.f832b);
            jpVar.b();
        }
        if (this.f833c != null) {
            jpVar.a(f9256d);
            jpVar.a(this.f833c);
            jpVar.b();
        }
        if (this.f834d != null && m604e()) {
            jpVar.a(f9257e);
            jpVar.a(this.f834d);
            jpVar.b();
        }
        if (this.f835e != null && m605f()) {
            jpVar.a(f9258f);
            jpVar.a(this.f835e);
            jpVar.b();
        }
        if (this.f836f != null && g()) {
            jpVar.a(f9259g);
            jpVar.a(this.f836f);
            jpVar.b();
        }
        if (this.f826a != null && h()) {
            jpVar.a(h);
            this.f826a.b(jpVar);
            jpVar.b();
        }
        if (i()) {
            jpVar.a(i);
            jpVar.a(this.f831a);
            jpVar.b();
        }
        if (this.f830a != null && j()) {
            jpVar.a(j);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f830a.size()));
            for (Map.Entry<String, String> entry : this.f830a.entrySet()) {
                jpVar.a(entry.getKey());
                jpVar.a(entry.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        if (this.f837g != null && k()) {
            jpVar.a(k);
            jpVar.a(this.f837g);
            jpVar.b();
        }
        if (this.f838h != null && l()) {
            jpVar.a(l);
            jpVar.a(this.f838h);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public void a(boolean z) {
        this.f829a.set(0, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m600a(ix ixVar) {
        if (ixVar == null) {
            return false;
        }
        boolean m599a = m599a();
        boolean m599a2 = ixVar.m599a();
        if ((m599a || m599a2) && !(m599a && m599a2 && this.f828a.equals(ixVar.f828a))) {
            return false;
        }
        boolean m601b = m601b();
        boolean m601b2 = ixVar.m601b();
        if ((m601b || m601b2) && !(m601b && m601b2 && this.f827a.m536a(ixVar.f827a))) {
            return false;
        }
        boolean m602c = m602c();
        boolean m602c2 = ixVar.m602c();
        if ((m602c || m602c2) && !(m602c && m602c2 && this.f832b.equals(ixVar.f832b))) {
            return false;
        }
        boolean m603d = m603d();
        boolean m603d2 = ixVar.m603d();
        if ((m603d || m603d2) && !(m603d && m603d2 && this.f833c.equals(ixVar.f833c))) {
            return false;
        }
        boolean m604e = m604e();
        boolean m604e2 = ixVar.m604e();
        if ((m604e || m604e2) && !(m604e && m604e2 && this.f834d.equals(ixVar.f834d))) {
            return false;
        }
        boolean m605f = m605f();
        boolean m605f2 = ixVar.m605f();
        if ((m605f || m605f2) && !(m605f && m605f2 && this.f835e.equals(ixVar.f835e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ixVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f836f.equals(ixVar.f836f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ixVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f826a.m519a(ixVar.f826a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ixVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f831a == ixVar.f831a)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ixVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f830a.equals(ixVar.f830a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ixVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f837g.equals(ixVar.f837g))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = ixVar.l();
        if (l2 || l3) {
            return l2 && l3 && this.f838h.equals(ixVar.f838h);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ix ixVar) {
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
        if (!getClass().equals(ixVar.getClass())) {
            return getClass().getName().compareTo(ixVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m599a()).compareTo(Boolean.valueOf(ixVar.m599a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m599a() && (a13 = jg.a(this.f828a, ixVar.f828a)) != 0) {
            return a13;
        }
        int compareTo2 = Boolean.valueOf(m601b()).compareTo(Boolean.valueOf(ixVar.m601b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m601b() && (a12 = jg.a(this.f827a, ixVar.f827a)) != 0) {
            return a12;
        }
        int compareTo3 = Boolean.valueOf(m602c()).compareTo(Boolean.valueOf(ixVar.m602c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m602c() && (a11 = jg.a(this.f832b, ixVar.f832b)) != 0) {
            return a11;
        }
        int compareTo4 = Boolean.valueOf(m603d()).compareTo(Boolean.valueOf(ixVar.m603d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m603d() && (a10 = jg.a(this.f833c, ixVar.f833c)) != 0) {
            return a10;
        }
        int compareTo5 = Boolean.valueOf(m604e()).compareTo(Boolean.valueOf(ixVar.m604e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m604e() && (a9 = jg.a(this.f834d, ixVar.f834d)) != 0) {
            return a9;
        }
        int compareTo6 = Boolean.valueOf(m605f()).compareTo(Boolean.valueOf(ixVar.m605f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m605f() && (a8 = jg.a(this.f835e, ixVar.f835e)) != 0) {
            return a8;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ixVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a7 = jg.a(this.f836f, ixVar.f836f)) != 0) {
            return a7;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ixVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a6 = jg.a(this.f826a, ixVar.f826a)) != 0) {
            return a6;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ixVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a5 = jg.a(this.f831a, ixVar.f831a)) != 0) {
            return a5;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ixVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a4 = jg.a(this.f830a, ixVar.f830a)) != 0) {
            return a4;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ixVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a3 = jg.a(this.f837g, ixVar.f837g)) != 0) {
            return a3;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ixVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!l() || (a2 = jg.a(this.f838h, ixVar.f838h)) == 0) {
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
                m598a();
                return;
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f828a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f827a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f832b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f833c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f834d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 11) {
                        this.f835e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f836f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 12) {
                        ig igVar = new ig();
                        this.f826a = igVar;
                        igVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 2) {
                        this.f831a = jpVar.mo649a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 13) {
                        jo mo641a = jpVar.mo641a();
                        this.f830a = new HashMap(mo641a.f918a * 2);
                        for (int i2 = 0; i2 < mo641a.f918a; i2++) {
                            this.f830a.put(jpVar.mo644a(), jpVar.mo644a());
                        }
                        jpVar.h();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 11) {
                        this.f837g = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 12:
                    if (b2 == 11) {
                        this.f838h = jpVar.mo644a();
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

    /* renamed from: a, reason: collision with other method in class */
    public void m598a() {
        if (this.f832b != null) {
            if (this.f833c != null) {
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
