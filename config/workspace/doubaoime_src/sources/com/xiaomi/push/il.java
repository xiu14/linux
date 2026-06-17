package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class il implements jf<il, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public ij f690a;

    /* renamed from: a, reason: collision with other field name */
    public String f691a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f693a;

    /* renamed from: b, reason: collision with other field name */
    public String f694b;

    /* renamed from: c, reason: collision with other field name */
    public String f695c;

    /* renamed from: d, reason: collision with other field name */
    public String f696d;

    /* renamed from: e, reason: collision with other field name */
    public String f697e;

    /* renamed from: f, reason: collision with other field name */
    public String f698f;

    /* renamed from: g, reason: collision with other field name */
    public String f699g;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f688a = new ju("XmPushActionAckNotification");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9215c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9216d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9217e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9218f = new jm("", (byte) 10, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9219g = new jm("", (byte) 11, 8);
    private static final jm h = new jm("", (byte) 13, 9);
    private static final jm i = new jm("", (byte) 11, 10);
    private static final jm j = new jm("", (byte) 11, 11);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f692a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    public long f689a = 0;

    /* renamed from: a, reason: collision with other method in class */
    public boolean m541a() {
        return this.f691a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m543b() {
        return this.f690a != null;
    }

    public boolean c() {
        return this.f694b != null;
    }

    public boolean d() {
        return this.f695c != null;
    }

    public boolean e() {
        return this.f696d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof il)) {
            return m542a((il) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f692a.get(0);
    }

    public boolean g() {
        return this.f697e != null;
    }

    public boolean h() {
        return this.f693a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f698f != null;
    }

    public boolean j() {
        return this.f699g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (m541a()) {
            sb.append("debug:");
            String str = this.f691a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m543b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f690a;
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
        String str2 = this.f694b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f695c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f696d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f689a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("reason:");
            String str5 = this.f697e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f693a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f698f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f699g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public il a(ij ijVar) {
        this.f690a = ijVar;
        return this;
    }

    public il b(String str) {
        this.f695c = str;
        return this;
    }

    public il c(String str) {
        this.f696d = str;
        return this;
    }

    public il d(String str) {
        this.f697e = str;
        return this;
    }

    public il e(String str) {
        this.f698f = str;
        return this;
    }

    public String a() {
        return this.f694b;
    }

    public String b() {
        return this.f696d;
    }

    public il a(String str) {
        this.f694b = str;
        return this;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m540a();
        jpVar.a(f688a);
        if (this.f691a != null && m541a()) {
            jpVar.a(a);
            jpVar.a(this.f691a);
            jpVar.b();
        }
        if (this.f690a != null && m543b()) {
            jpVar.a(b);
            this.f690a.b(jpVar);
            jpVar.b();
        }
        if (this.f694b != null) {
            jpVar.a(f9215c);
            jpVar.a(this.f694b);
            jpVar.b();
        }
        if (this.f695c != null && d()) {
            jpVar.a(f9216d);
            jpVar.a(this.f695c);
            jpVar.b();
        }
        if (this.f696d != null && e()) {
            jpVar.a(f9217e);
            jpVar.a(this.f696d);
            jpVar.b();
        }
        if (f()) {
            jpVar.a(f9218f);
            jpVar.a(this.f689a);
            jpVar.b();
        }
        if (this.f697e != null && g()) {
            jpVar.a(f9219g);
            jpVar.a(this.f697e);
            jpVar.b();
        }
        if (this.f693a != null && h()) {
            jpVar.a(h);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f693a.size()));
            for (Map.Entry<String, String> entry : this.f693a.entrySet()) {
                jpVar.a(entry.getKey());
                jpVar.a(entry.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        if (this.f698f != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f698f);
            jpVar.b();
        }
        if (this.f699g != null && j()) {
            jpVar.a(j);
            jpVar.a(this.f699g);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public il a(long j2) {
        this.f689a = j2;
        a(true);
        return this;
    }

    public void a(boolean z) {
        this.f692a.set(0, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m539a() {
        return this.f693a;
    }

    public il a(Map<String, String> map) {
        this.f693a = map;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m542a(il ilVar) {
        if (ilVar == null) {
            return false;
        }
        boolean m541a = m541a();
        boolean m541a2 = ilVar.m541a();
        if ((m541a || m541a2) && !(m541a && m541a2 && this.f691a.equals(ilVar.f691a))) {
            return false;
        }
        boolean m543b = m543b();
        boolean m543b2 = ilVar.m543b();
        if ((m543b || m543b2) && !(m543b && m543b2 && this.f690a.m536a(ilVar.f690a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ilVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f694b.equals(ilVar.f694b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ilVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f695c.equals(ilVar.f695c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ilVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f696d.equals(ilVar.f696d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ilVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f689a == ilVar.f689a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ilVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f697e.equals(ilVar.f697e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ilVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f693a.equals(ilVar.f693a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ilVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f698f.equals(ilVar.f698f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ilVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f699g.equals(ilVar.f699g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(il ilVar) {
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
        if (!getClass().equals(ilVar.getClass())) {
            return getClass().getName().compareTo(ilVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m541a()).compareTo(Boolean.valueOf(ilVar.m541a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m541a() && (a11 = jg.a(this.f691a, ilVar.f691a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(m543b()).compareTo(Boolean.valueOf(ilVar.m543b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m543b() && (a10 = jg.a(this.f690a, ilVar.f690a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ilVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jg.a(this.f694b, ilVar.f694b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ilVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jg.a(this.f695c, ilVar.f695c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ilVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jg.a(this.f696d, ilVar.f696d)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ilVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jg.a(this.f689a, ilVar.f689a)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ilVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jg.a(this.f697e, ilVar.f697e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ilVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jg.a(this.f693a, ilVar.f693a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ilVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jg.a(this.f698f, ilVar.f698f)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ilVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = jg.a(this.f699g, ilVar.f699g)) == 0) {
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
                m540a();
                return;
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f691a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f690a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f694b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f695c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f696d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                default:
                    js.a(jpVar, b2);
                    break;
                case 7:
                    if (b2 == 10) {
                        this.f689a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f697e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 13) {
                        jo mo641a = jpVar.mo641a();
                        this.f693a = new HashMap(mo641a.f918a * 2);
                        for (int i2 = 0; i2 < mo641a.f918a; i2++) {
                            this.f693a.put(jpVar.mo644a(), jpVar.mo644a());
                        }
                        jpVar.h();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 11) {
                        this.f698f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 11) {
                        this.f699g = jpVar.mo644a();
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
    public void m540a() {
        if (this.f694b != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
