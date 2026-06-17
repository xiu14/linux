package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class it implements jf<it, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f745a;

    /* renamed from: a, reason: collision with other field name */
    public ij f746a;

    /* renamed from: a, reason: collision with other field name */
    public String f747a;

    /* renamed from: a, reason: collision with other field name */
    public ByteBuffer f748a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f749a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f750a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f751a;

    /* renamed from: b, reason: collision with other field name */
    public String f752b;

    /* renamed from: b, reason: collision with other field name */
    public boolean f753b;

    /* renamed from: c, reason: collision with other field name */
    public String f754c;

    /* renamed from: d, reason: collision with other field name */
    public String f755d;

    /* renamed from: e, reason: collision with other field name */
    public String f756e;

    /* renamed from: f, reason: collision with other field name */
    public String f757f;

    /* renamed from: g, reason: collision with other field name */
    public String f758g;

    /* renamed from: h, reason: collision with other field name */
    public String f759h;

    /* renamed from: i, reason: collision with other field name */
    public String f760i;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f744a = new ju("XmPushActionNotification");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9235c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9236d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9237e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9238f = new jm("", (byte) 2, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9239g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 13, 8);
    private static final jm i = new jm("", (byte) 11, 9);
    private static final jm j = new jm("", (byte) 11, 10);
    private static final jm k = new jm("", (byte) 11, 12);
    private static final jm l = new jm("", (byte) 11, 13);
    private static final jm m = new jm("", (byte) 11, 14);
    private static final jm n = new jm("", (byte) 10, 15);
    private static final jm o = new jm("", (byte) 2, 20);

    public it() {
        this.f749a = new BitSet(3);
        this.f751a = true;
        this.f753b = false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m577a() {
        return this.f747a != null;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m580b() {
        return this.f746a != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m581c() {
        return this.f752b != null;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m582d() {
        return this.f754c != null;
    }

    public boolean e() {
        return this.f755d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof it)) {
            return m578a((it) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f749a.get(0);
    }

    public boolean g() {
        return this.f756e != null;
    }

    public boolean h() {
        return this.f750a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f757f != null;
    }

    public boolean j() {
        return this.f758g != null;
    }

    public boolean k() {
        return this.f759h != null;
    }

    public boolean l() {
        return this.f760i != null;
    }

    public boolean m() {
        return this.f748a != null;
    }

    public boolean n() {
        return this.f749a.get(1);
    }

    public boolean o() {
        return this.f749a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (m577a()) {
            sb.append("debug:");
            String str = this.f747a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m580b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f746a;
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
        String str2 = this.f752b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m582d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f754c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f755d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f751a);
        if (g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f756e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f750a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f757f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f758g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f759h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f760i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f748a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                jg.a(byteBuffer, sb);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f745a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f753b);
        }
        sb.append(")");
        return sb.toString();
    }

    public ij a() {
        return this.f746a;
    }

    public String b() {
        return this.f754c;
    }

    public String c() {
        return this.f755d;
    }

    public String d() {
        return this.f757f;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m573a() {
        return this.f752b;
    }

    public it b(String str) {
        this.f754c = str;
        return this;
    }

    public it c(String str) {
        this.f755d = str;
        return this;
    }

    public it d(String str) {
        this.f757f = str;
        return this;
    }

    public it a(String str) {
        this.f752b = str;
        return this;
    }

    public void b(boolean z) {
        this.f749a.set(1, z);
    }

    public void c(boolean z) {
        this.f749a.set(2, z);
    }

    public it(String str, boolean z) {
        this();
        this.f752b = str;
        this.f751a = z;
        m576a(true);
    }

    public it a(boolean z) {
        this.f751a = z;
        m576a(true);
        return this;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m575a();
        jpVar.a(f744a);
        if (this.f747a != null && m577a()) {
            jpVar.a(a);
            jpVar.a(this.f747a);
            jpVar.b();
        }
        if (this.f746a != null && m580b()) {
            jpVar.a(b);
            this.f746a.b(jpVar);
            jpVar.b();
        }
        if (this.f752b != null) {
            jpVar.a(f9235c);
            jpVar.a(this.f752b);
            jpVar.b();
        }
        if (this.f754c != null && m582d()) {
            jpVar.a(f9236d);
            jpVar.a(this.f754c);
            jpVar.b();
        }
        if (this.f755d != null && e()) {
            jpVar.a(f9237e);
            jpVar.a(this.f755d);
            jpVar.b();
        }
        jpVar.a(f9238f);
        jpVar.a(this.f751a);
        jpVar.b();
        if (this.f756e != null && g()) {
            jpVar.a(f9239g);
            jpVar.a(this.f756e);
            jpVar.b();
        }
        if (this.f750a != null && h()) {
            jpVar.a(h);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f750a.size()));
            for (Map.Entry<String, String> entry : this.f750a.entrySet()) {
                jpVar.a(entry.getKey());
                jpVar.a(entry.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        if (this.f757f != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f757f);
            jpVar.b();
        }
        if (this.f758g != null && j()) {
            jpVar.a(j);
            jpVar.a(this.f758g);
            jpVar.b();
        }
        if (this.f759h != null && k()) {
            jpVar.a(k);
            jpVar.a(this.f759h);
            jpVar.b();
        }
        if (this.f760i != null && l()) {
            jpVar.a(l);
            jpVar.a(this.f760i);
            jpVar.b();
        }
        if (this.f748a != null && m()) {
            jpVar.a(m);
            jpVar.a(this.f748a);
            jpVar.b();
        }
        if (n()) {
            jpVar.a(n);
            jpVar.a(this.f745a);
            jpVar.b();
        }
        if (o()) {
            jpVar.a(o);
            jpVar.a(this.f753b);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m576a(boolean z) {
        this.f749a.set(0, z);
    }

    public void a(String str, String str2) {
        if (this.f750a == null) {
            this.f750a = new HashMap();
        }
        this.f750a.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m574a() {
        return this.f750a;
    }

    public it a(Map<String, String> map) {
        this.f750a = map;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m579a() {
        a(jg.a(this.f748a));
        return this.f748a.array();
    }

    public it a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    public it a(ByteBuffer byteBuffer) {
        this.f748a = byteBuffer;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m578a(it itVar) {
        if (itVar == null) {
            return false;
        }
        boolean m577a = m577a();
        boolean m577a2 = itVar.m577a();
        if ((m577a || m577a2) && !(m577a && m577a2 && this.f747a.equals(itVar.f747a))) {
            return false;
        }
        boolean m580b = m580b();
        boolean m580b2 = itVar.m580b();
        if ((m580b || m580b2) && !(m580b && m580b2 && this.f746a.m536a(itVar.f746a))) {
            return false;
        }
        boolean m581c = m581c();
        boolean m581c2 = itVar.m581c();
        if ((m581c || m581c2) && !(m581c && m581c2 && this.f752b.equals(itVar.f752b))) {
            return false;
        }
        boolean m582d = m582d();
        boolean m582d2 = itVar.m582d();
        if ((m582d || m582d2) && !(m582d && m582d2 && this.f754c.equals(itVar.f754c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = itVar.e();
        if (((e2 || e3) && !(e2 && e3 && this.f755d.equals(itVar.f755d))) || this.f751a != itVar.f751a) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = itVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f756e.equals(itVar.f756e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = itVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f750a.equals(itVar.f750a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = itVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f757f.equals(itVar.f757f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = itVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f758g.equals(itVar.f758g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = itVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f759h.equals(itVar.f759h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = itVar.l();
        if ((l2 || l3) && !(l2 && l3 && this.f760i.equals(itVar.f760i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = itVar.m();
        if ((m2 || m3) && !(m2 && m3 && this.f748a.equals(itVar.f748a))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = itVar.n();
        if ((n2 || n3) && !(n2 && n3 && this.f745a == itVar.f745a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = itVar.o();
        if (o2 || o3) {
            return o2 && o3 && this.f753b == itVar.f753b;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(it itVar) {
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
        if (!getClass().equals(itVar.getClass())) {
            return getClass().getName().compareTo(itVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m577a()).compareTo(Boolean.valueOf(itVar.m577a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m577a() && (a16 = jg.a(this.f747a, itVar.f747a)) != 0) {
            return a16;
        }
        int compareTo2 = Boolean.valueOf(m580b()).compareTo(Boolean.valueOf(itVar.m580b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m580b() && (a15 = jg.a(this.f746a, itVar.f746a)) != 0) {
            return a15;
        }
        int compareTo3 = Boolean.valueOf(m581c()).compareTo(Boolean.valueOf(itVar.m581c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m581c() && (a14 = jg.a(this.f752b, itVar.f752b)) != 0) {
            return a14;
        }
        int compareTo4 = Boolean.valueOf(m582d()).compareTo(Boolean.valueOf(itVar.m582d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m582d() && (a13 = jg.a(this.f754c, itVar.f754c)) != 0) {
            return a13;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(itVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a12 = jg.a(this.f755d, itVar.f755d)) != 0) {
            return a12;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(itVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a11 = jg.a(this.f751a, itVar.f751a)) != 0) {
            return a11;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(itVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a10 = jg.a(this.f756e, itVar.f756e)) != 0) {
            return a10;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(itVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a9 = jg.a(this.f750a, itVar.f750a)) != 0) {
            return a9;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(itVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a8 = jg.a(this.f757f, itVar.f757f)) != 0) {
            return a8;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(itVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a7 = jg.a(this.f758g, itVar.f758g)) != 0) {
            return a7;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(itVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a6 = jg.a(this.f759h, itVar.f759h)) != 0) {
            return a6;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(itVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a5 = jg.a(this.f760i, itVar.f760i)) != 0) {
            return a5;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(itVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a4 = jg.a(this.f748a, itVar.f748a)) != 0) {
            return a4;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(itVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a3 = jg.a(this.f745a, itVar.f745a)) != 0) {
            return a3;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(itVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (!o() || (a2 = jg.a(this.f753b, itVar.f753b)) == 0) {
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
                if (f()) {
                    m575a();
                    return;
                } else {
                    StringBuilder M = e.a.a.a.a.M("Required field 'requireAck' was not found in serialized data! Struct: ");
                    M.append(toString());
                    throw new jq(M.toString());
                }
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f747a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f746a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f752b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f754c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f755d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 2) {
                        this.f751a = jpVar.mo649a();
                        m576a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f756e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 13) {
                        jo mo641a = jpVar.mo641a();
                        this.f750a = new HashMap(mo641a.f918a * 2);
                        for (int i2 = 0; i2 < mo641a.f918a; i2++) {
                            this.f750a.put(jpVar.mo644a(), jpVar.mo644a());
                        }
                        jpVar.h();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f757f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 11) {
                        this.f758g = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                case 16:
                case 17:
                case 18:
                case 19:
                default:
                    js.a(jpVar, b2);
                    break;
                case 12:
                    if (b2 == 11) {
                        this.f759h = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 13:
                    if (b2 == 11) {
                        this.f760i = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 14:
                    if (b2 == 11) {
                        this.f748a = jpVar.mo645a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 15:
                    if (b2 == 10) {
                        this.f745a = jpVar.mo638a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 20:
                    if (b2 == 2) {
                        this.f753b = jpVar.mo649a();
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
    public void m575a() {
        if (this.f752b != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
