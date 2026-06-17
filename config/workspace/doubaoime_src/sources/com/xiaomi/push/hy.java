package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class hy implements jf<hy, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f582a;

    /* renamed from: a, reason: collision with other field name */
    public String f583a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f584a = new BitSet(3);

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f585a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f586a;

    /* renamed from: b, reason: collision with other field name */
    public long f587b;

    /* renamed from: b, reason: collision with other field name */
    public String f588b;

    /* renamed from: c, reason: collision with other field name */
    public String f589c;

    /* renamed from: d, reason: collision with other field name */
    public String f590d;

    /* renamed from: e, reason: collision with other field name */
    public String f591e;

    /* renamed from: f, reason: collision with other field name */
    public String f592f;

    /* renamed from: g, reason: collision with other field name */
    public String f593g;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f581a = new ju("ClientUploadDataItem");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 11, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9169c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9170d = new jm("", (byte) 10, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9171e = new jm("", (byte) 10, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9172f = new jm("", (byte) 2, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9173g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 11, 8);
    private static final jm i = new jm("", (byte) 11, 9);
    private static final jm j = new jm("", (byte) 13, 10);
    private static final jm k = new jm("", (byte) 11, 11);

    /* renamed from: a, reason: collision with other method in class */
    public String m492a() {
        return this.f583a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m494a() {
    }

    public hy b(String str) {
        this.f588b = str;
        return this;
    }

    public hy c(String str) {
        this.f589c = str;
        return this;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m500d() {
        return this.f584a.get(0);
    }

    /* renamed from: e, reason: collision with other method in class */
    public boolean m501e() {
        return this.f584a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hy)) {
            return m497a((hy) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f584a.get(2);
    }

    public boolean g() {
        return this.f590d != null;
    }

    public boolean h() {
        return this.f591e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f592f != null;
    }

    public boolean j() {
        return this.f585a != null;
    }

    public boolean k() {
        return this.f593g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (m496a()) {
            sb.append("channel:");
            String str = this.f583a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m498b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f588b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (m499c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f589c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (m500d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f582a);
            z = false;
        }
        if (m501e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f587b);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f586a);
            z = false;
        }
        if (g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f590d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f591e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f592f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f585a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f593g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public hy a(String str) {
        this.f583a = str;
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m498b() {
        return this.f588b != null;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m499c() {
        return this.f589c != null;
    }

    public hy d(String str) {
        this.f590d = str;
        return this;
    }

    public hy e(String str) {
        this.f591e = str;
        return this;
    }

    public hy f(String str) {
        this.f592f = str;
        return this;
    }

    public hy g(String str) {
        this.f593g = str;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m496a() {
        return this.f583a != null;
    }

    public String b() {
        return this.f589c;
    }

    public void c(boolean z) {
        this.f584a.set(2, z);
    }

    public String d() {
        return this.f592f;
    }

    public String e() {
        return this.f593g;
    }

    public hy a(long j2) {
        this.f582a = j2;
        m495a(true);
        return this;
    }

    public hy b(long j2) {
        this.f587b = j2;
        b(true);
        return this;
    }

    public String c() {
        return this.f591e;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m495a(boolean z) {
        this.f584a.set(0, z);
    }

    public void b(boolean z) {
        this.f584a.set(1, z);
    }

    public long a() {
        return this.f587b;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m494a();
        jpVar.a(f581a);
        if (this.f583a != null && m496a()) {
            jpVar.a(a);
            jpVar.a(this.f583a);
            jpVar.b();
        }
        if (this.f588b != null && m498b()) {
            jpVar.a(b);
            jpVar.a(this.f588b);
            jpVar.b();
        }
        if (this.f589c != null && m499c()) {
            jpVar.a(f9169c);
            jpVar.a(this.f589c);
            jpVar.b();
        }
        if (m500d()) {
            jpVar.a(f9170d);
            jpVar.a(this.f582a);
            jpVar.b();
        }
        if (m501e()) {
            jpVar.a(f9171e);
            jpVar.a(this.f587b);
            jpVar.b();
        }
        if (f()) {
            jpVar.a(f9172f);
            jpVar.a(this.f586a);
            jpVar.b();
        }
        if (this.f590d != null && g()) {
            jpVar.a(f9173g);
            jpVar.a(this.f590d);
            jpVar.b();
        }
        if (this.f591e != null && h()) {
            jpVar.a(h);
            jpVar.a(this.f591e);
            jpVar.b();
        }
        if (this.f592f != null && i()) {
            jpVar.a(i);
            jpVar.a(this.f592f);
            jpVar.b();
        }
        if (this.f585a != null && j()) {
            jpVar.a(j);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f585a.size()));
            for (Map.Entry<String, String> entry : this.f585a.entrySet()) {
                jpVar.a(entry.getKey());
                jpVar.a(entry.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        if (this.f593g != null && k()) {
            jpVar.a(k);
            jpVar.a(this.f593g);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public hy a(boolean z) {
        this.f586a = z;
        c(true);
        return this;
    }

    public void a(String str, String str2) {
        if (this.f585a == null) {
            this.f585a = new HashMap();
        }
        this.f585a.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m493a() {
        return this.f585a;
    }

    public hy a(Map<String, String> map) {
        this.f585a = map;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m497a(hy hyVar) {
        if (hyVar == null) {
            return false;
        }
        boolean m496a = m496a();
        boolean m496a2 = hyVar.m496a();
        if ((m496a || m496a2) && !(m496a && m496a2 && this.f583a.equals(hyVar.f583a))) {
            return false;
        }
        boolean m498b = m498b();
        boolean m498b2 = hyVar.m498b();
        if ((m498b || m498b2) && !(m498b && m498b2 && this.f588b.equals(hyVar.f588b))) {
            return false;
        }
        boolean m499c = m499c();
        boolean m499c2 = hyVar.m499c();
        if ((m499c || m499c2) && !(m499c && m499c2 && this.f589c.equals(hyVar.f589c))) {
            return false;
        }
        boolean m500d = m500d();
        boolean m500d2 = hyVar.m500d();
        if ((m500d || m500d2) && !(m500d && m500d2 && this.f582a == hyVar.f582a)) {
            return false;
        }
        boolean m501e = m501e();
        boolean m501e2 = hyVar.m501e();
        if ((m501e || m501e2) && !(m501e && m501e2 && this.f587b == hyVar.f587b)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = hyVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f586a == hyVar.f586a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = hyVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f590d.equals(hyVar.f590d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = hyVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f591e.equals(hyVar.f591e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = hyVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f592f.equals(hyVar.f592f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = hyVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f585a.equals(hyVar.f585a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = hyVar.k();
        if (k2 || k3) {
            return k2 && k3 && this.f593g.equals(hyVar.f593g);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hy hyVar) {
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
        if (!getClass().equals(hyVar.getClass())) {
            return getClass().getName().compareTo(hyVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m496a()).compareTo(Boolean.valueOf(hyVar.m496a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m496a() && (a12 = jg.a(this.f583a, hyVar.f583a)) != 0) {
            return a12;
        }
        int compareTo2 = Boolean.valueOf(m498b()).compareTo(Boolean.valueOf(hyVar.m498b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m498b() && (a11 = jg.a(this.f588b, hyVar.f588b)) != 0) {
            return a11;
        }
        int compareTo3 = Boolean.valueOf(m499c()).compareTo(Boolean.valueOf(hyVar.m499c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m499c() && (a10 = jg.a(this.f589c, hyVar.f589c)) != 0) {
            return a10;
        }
        int compareTo4 = Boolean.valueOf(m500d()).compareTo(Boolean.valueOf(hyVar.m500d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m500d() && (a9 = jg.a(this.f582a, hyVar.f582a)) != 0) {
            return a9;
        }
        int compareTo5 = Boolean.valueOf(m501e()).compareTo(Boolean.valueOf(hyVar.m501e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m501e() && (a8 = jg.a(this.f587b, hyVar.f587b)) != 0) {
            return a8;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hyVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a7 = jg.a(this.f586a, hyVar.f586a)) != 0) {
            return a7;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hyVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a6 = jg.a(this.f590d, hyVar.f590d)) != 0) {
            return a6;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hyVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a5 = jg.a(this.f591e, hyVar.f591e)) != 0) {
            return a5;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hyVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a4 = jg.a(this.f592f, hyVar.f592f)) != 0) {
            return a4;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hyVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a3 = jg.a(this.f585a, hyVar.f585a)) != 0) {
            return a3;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(hyVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (!k() || (a2 = jg.a(this.f593g, hyVar.f593g)) == 0) {
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
                m494a();
                return;
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f583a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 11) {
                        this.f588b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f589c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 10) {
                        this.f582a = jpVar.mo638a();
                        m495a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 10) {
                        this.f587b = jpVar.mo638a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 2) {
                        this.f586a = jpVar.mo649a();
                        c(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f590d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f591e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 11) {
                        this.f592f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 13) {
                        jo mo641a = jpVar.mo641a();
                        this.f585a = new HashMap(mo641a.f918a * 2);
                        for (int i2 = 0; i2 < mo641a.f918a; i2++) {
                            this.f585a.put(jpVar.mo644a(), jpVar.mo644a());
                        }
                        jpVar.h();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 11) {
                        this.f593g = jpVar.mo644a();
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
