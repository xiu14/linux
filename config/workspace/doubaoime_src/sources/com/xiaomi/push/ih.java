package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ih implements jf<ih, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f642a;

    /* renamed from: a, reason: collision with other field name */
    public long f643a;

    /* renamed from: a, reason: collision with other field name */
    public String f644a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f645a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f646a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f647a;

    /* renamed from: b, reason: collision with other field name */
    public int f648b;

    /* renamed from: b, reason: collision with other field name */
    public String f649b;

    /* renamed from: b, reason: collision with other field name */
    public Map<String, String> f650b;

    /* renamed from: c, reason: collision with other field name */
    public int f651c;

    /* renamed from: c, reason: collision with other field name */
    public String f652c;

    /* renamed from: c, reason: collision with other field name */
    public Map<String, String> f653c;

    /* renamed from: d, reason: collision with other field name */
    public String f654d;

    /* renamed from: e, reason: collision with other field name */
    public String f655e;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f641a = new ju("PushMetaInfo");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 10, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9200c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9201d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9202e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9203f = new jm("", (byte) 8, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9204g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 8, 8);
    private static final jm i = new jm("", (byte) 8, 9);
    private static final jm j = new jm("", (byte) 13, 10);
    private static final jm k = new jm("", (byte) 13, 11);
    private static final jm l = new jm("", (byte) 2, 12);
    private static final jm m = new jm("", (byte) 13, 13);

    public ih() {
        this.f645a = new BitSet(5);
        this.f647a = false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ih m523a() {
        return new ih(this);
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m531b() {
        return this.f645a.get(0);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m533c() {
        return this.f649b != null;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m534d() {
        return this.f652c != null;
    }

    public boolean e() {
        return this.f654d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ih)) {
            return m528a((ih) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f645a.get(1);
    }

    public boolean g() {
        return this.f655e != null;
    }

    public boolean h() {
        return this.f645a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f645a.get(3);
    }

    public boolean j() {
        return this.f646a != null;
    }

    public boolean k() {
        return this.f650b != null;
    }

    public boolean l() {
        return this.f647a;
    }

    public boolean m() {
        return this.f645a.get(4);
    }

    public boolean n() {
        return this.f653c != null;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("PushMetaInfo(", "id:");
        String str = this.f644a;
        if (str == null) {
            R.append("null");
        } else {
            R.append(com.xiaomi.push.service.as.a(str));
        }
        R.append(", ");
        R.append("messageTs:");
        R.append(this.f643a);
        if (m533c()) {
            R.append(", ");
            R.append("topic:");
            String str2 = this.f649b;
            if (str2 == null) {
                R.append("null");
            } else {
                R.append(str2);
            }
        }
        if (m534d()) {
            R.append(", ");
            R.append("title:");
            String str3 = this.f652c;
            if (str3 == null) {
                R.append("null");
            } else {
                R.append(str3);
            }
        }
        if (e()) {
            R.append(", ");
            R.append("description:");
            String str4 = this.f654d;
            if (str4 == null) {
                R.append("null");
            } else {
                R.append(str4);
            }
        }
        if (f()) {
            R.append(", ");
            R.append("notifyType:");
            R.append(this.f642a);
        }
        if (g()) {
            R.append(", ");
            R.append("url:");
            String str5 = this.f655e;
            if (str5 == null) {
                R.append("null");
            } else {
                R.append(str5);
            }
        }
        if (h()) {
            R.append(", ");
            R.append("passThrough:");
            R.append(this.f648b);
        }
        if (i()) {
            R.append(", ");
            R.append("notifyId:");
            R.append(this.f651c);
        }
        if (j()) {
            R.append(", ");
            R.append("extra:");
            Map<String, String> map = this.f646a;
            if (map == null) {
                R.append("null");
            } else {
                R.append(map);
            }
        }
        if (k()) {
            R.append(", ");
            R.append("internal:");
            Map<String, String> map2 = this.f650b;
            if (map2 == null) {
                R.append("null");
            } else {
                R.append(map2);
            }
        }
        if (m()) {
            R.append(", ");
            R.append("ignoreRegInfo:");
            R.append(this.f647a);
        }
        if (n()) {
            R.append(", ");
            R.append("apsProperFields:");
            Map<String, String> map3 = this.f653c;
            if (map3 == null) {
                R.append("null");
            } else {
                R.append(map3);
            }
        }
        R.append(")");
        return R.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m524a() {
        return this.f644a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m529b() {
        return this.f649b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m532c() {
        return this.f652c;
    }

    public String d() {
        return this.f654d;
    }

    public void e(boolean z) {
        this.f645a.set(4, z);
    }

    public ih a(String str) {
        this.f644a = str;
        return this;
    }

    public ih b(String str) {
        this.f649b = str;
        return this;
    }

    public ih c(String str) {
        this.f652c = str;
        return this;
    }

    public ih d(String str) {
        this.f654d = str;
        return this;
    }

    public ih(ih ihVar) {
        BitSet bitSet = new BitSet(5);
        this.f645a = bitSet;
        bitSet.clear();
        this.f645a.or(ihVar.f645a);
        if (ihVar.m527a()) {
            this.f644a = ihVar.f644a;
        }
        this.f643a = ihVar.f643a;
        if (ihVar.m533c()) {
            this.f649b = ihVar.f649b;
        }
        if (ihVar.m534d()) {
            this.f652c = ihVar.f652c;
        }
        if (ihVar.e()) {
            this.f654d = ihVar.f654d;
        }
        this.f642a = ihVar.f642a;
        if (ihVar.g()) {
            this.f655e = ihVar.f655e;
        }
        this.f648b = ihVar.f648b;
        this.f651c = ihVar.f651c;
        if (ihVar.j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : ihVar.f646a.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.f646a = hashMap;
        }
        if (ihVar.k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry2 : ihVar.f650b.entrySet()) {
                hashMap2.put(entry2.getKey(), entry2.getValue());
            }
            this.f650b = hashMap2;
        }
        this.f647a = ihVar.f647a;
        if (ihVar.n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry<String, String> entry3 : ihVar.f653c.entrySet()) {
                hashMap3.put(entry3.getKey(), entry3.getValue());
            }
            this.f653c = hashMap3;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m527a() {
        return this.f644a != null;
    }

    public void b(boolean z) {
        this.f645a.set(1, z);
    }

    public void c(boolean z) {
        this.f645a.set(2, z);
    }

    public void d(boolean z) {
        this.f645a.set(3, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m522a() {
        return this.f643a;
    }

    public int b() {
        return this.f648b;
    }

    public int c() {
        return this.f651c;
    }

    public void a(boolean z) {
        this.f645a.set(0, z);
    }

    public ih b(int i2) {
        this.f648b = i2;
        c(true);
        return this;
    }

    public ih c(int i2) {
        this.f651c = i2;
        d(true);
        return this;
    }

    public int a() {
        return this.f642a;
    }

    public ih a(int i2) {
        this.f642a = i2;
        b(true);
        return this;
    }

    public void b(String str, String str2) {
        if (this.f650b == null) {
            this.f650b = new HashMap();
        }
        this.f650b.put(str, str2);
    }

    public void a(String str, String str2) {
        if (this.f646a == null) {
            this.f646a = new HashMap();
        }
        this.f646a.put(str, str2);
    }

    /* renamed from: b, reason: collision with other method in class */
    public Map<String, String> m530b() {
        return this.f650b;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m526a();
        jpVar.a(f641a);
        if (this.f644a != null) {
            jpVar.a(a);
            jpVar.a(this.f644a);
            jpVar.b();
        }
        jpVar.a(b);
        jpVar.a(this.f643a);
        jpVar.b();
        if (this.f649b != null && m533c()) {
            jpVar.a(f9200c);
            jpVar.a(this.f649b);
            jpVar.b();
        }
        if (this.f652c != null && m534d()) {
            jpVar.a(f9201d);
            jpVar.a(this.f652c);
            jpVar.b();
        }
        if (this.f654d != null && e()) {
            jpVar.a(f9202e);
            jpVar.a(this.f654d);
            jpVar.b();
        }
        if (f()) {
            jpVar.a(f9203f);
            jpVar.mo648a(this.f642a);
            jpVar.b();
        }
        if (this.f655e != null && g()) {
            jpVar.a(f9204g);
            jpVar.a(this.f655e);
            jpVar.b();
        }
        if (h()) {
            jpVar.a(h);
            jpVar.mo648a(this.f648b);
            jpVar.b();
        }
        if (i()) {
            jpVar.a(i);
            jpVar.mo648a(this.f651c);
            jpVar.b();
        }
        if (this.f646a != null && j()) {
            jpVar.a(j);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f646a.size()));
            for (Map.Entry<String, String> entry : this.f646a.entrySet()) {
                jpVar.a(entry.getKey());
                jpVar.a(entry.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        if (this.f650b != null && k()) {
            jpVar.a(k);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f650b.size()));
            for (Map.Entry<String, String> entry2 : this.f650b.entrySet()) {
                jpVar.a(entry2.getKey());
                jpVar.a(entry2.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        if (m()) {
            jpVar.a(l);
            jpVar.a(this.f647a);
            jpVar.b();
        }
        if (this.f653c != null && n()) {
            jpVar.a(m);
            jpVar.a(new jo((byte) 11, (byte) 11, this.f653c.size()));
            for (Map.Entry<String, String> entry3 : this.f653c.entrySet()) {
                jpVar.a(entry3.getKey());
                jpVar.a(entry3.getValue());
            }
            jpVar.d();
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m525a() {
        return this.f646a;
    }

    public ih a(Map<String, String> map) {
        this.f646a = map;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m528a(ih ihVar) {
        if (ihVar == null) {
            return false;
        }
        boolean m527a = m527a();
        boolean m527a2 = ihVar.m527a();
        if (((m527a || m527a2) && !(m527a && m527a2 && this.f644a.equals(ihVar.f644a))) || this.f643a != ihVar.f643a) {
            return false;
        }
        boolean m533c = m533c();
        boolean m533c2 = ihVar.m533c();
        if ((m533c || m533c2) && !(m533c && m533c2 && this.f649b.equals(ihVar.f649b))) {
            return false;
        }
        boolean m534d = m534d();
        boolean m534d2 = ihVar.m534d();
        if ((m534d || m534d2) && !(m534d && m534d2 && this.f652c.equals(ihVar.f652c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ihVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f654d.equals(ihVar.f654d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ihVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f642a == ihVar.f642a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ihVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f655e.equals(ihVar.f655e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ihVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f648b == ihVar.f648b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ihVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f651c == ihVar.f651c)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ihVar.j();
        if ((j2 || j3) && !(j2 && j3 && this.f646a.equals(ihVar.f646a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ihVar.k();
        if ((k2 || k3) && !(k2 && k3 && this.f650b.equals(ihVar.f650b))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = ihVar.m();
        if ((m2 || m3) && !(m2 && m3 && this.f647a == ihVar.f647a)) {
            return false;
        }
        boolean n = n();
        boolean n2 = ihVar.n();
        if (n || n2) {
            return n && n2 && this.f653c.equals(ihVar.f653c);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ih ihVar) {
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
        if (!getClass().equals(ihVar.getClass())) {
            return getClass().getName().compareTo(ihVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m527a()).compareTo(Boolean.valueOf(ihVar.m527a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m527a() && (a14 = jg.a(this.f644a, ihVar.f644a)) != 0) {
            return a14;
        }
        int compareTo2 = Boolean.valueOf(m531b()).compareTo(Boolean.valueOf(ihVar.m531b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m531b() && (a13 = jg.a(this.f643a, ihVar.f643a)) != 0) {
            return a13;
        }
        int compareTo3 = Boolean.valueOf(m533c()).compareTo(Boolean.valueOf(ihVar.m533c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m533c() && (a12 = jg.a(this.f649b, ihVar.f649b)) != 0) {
            return a12;
        }
        int compareTo4 = Boolean.valueOf(m534d()).compareTo(Boolean.valueOf(ihVar.m534d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m534d() && (a11 = jg.a(this.f652c, ihVar.f652c)) != 0) {
            return a11;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ihVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a10 = jg.a(this.f654d, ihVar.f654d)) != 0) {
            return a10;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ihVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a9 = jg.a(this.f642a, ihVar.f642a)) != 0) {
            return a9;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ihVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a8 = jg.a(this.f655e, ihVar.f655e)) != 0) {
            return a8;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ihVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a7 = jg.a(this.f648b, ihVar.f648b)) != 0) {
            return a7;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ihVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a6 = jg.a(this.f651c, ihVar.f651c)) != 0) {
            return a6;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ihVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a5 = jg.a(this.f646a, ihVar.f646a)) != 0) {
            return a5;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ihVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a4 = jg.a(this.f650b, ihVar.f650b)) != 0) {
            return a4;
        }
        int compareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ihVar.m()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m() && (a3 = jg.a(this.f647a, ihVar.f647a)) != 0) {
            return a3;
        }
        int compareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ihVar.n()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (!n() || (a2 = jg.a(this.f653c, ihVar.f653c)) == 0) {
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
                if (m531b()) {
                    m526a();
                    return;
                } else {
                    StringBuilder M = e.a.a.a.a.M("Required field 'messageTs' was not found in serialized data! Struct: ");
                    M.append(toString());
                    throw new jq(M.toString());
                }
            }
            int i2 = 0;
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f644a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 10) {
                        this.f643a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f649b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f652c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f654d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 8) {
                        this.f642a = jpVar.mo637a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f655e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 8) {
                        this.f648b = jpVar.mo637a();
                        c(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 8) {
                        this.f651c = jpVar.mo637a();
                        d(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 13) {
                        jo mo641a = jpVar.mo641a();
                        this.f646a = new HashMap(mo641a.f918a * 2);
                        while (i2 < mo641a.f918a) {
                            this.f646a.put(jpVar.mo644a(), jpVar.mo644a());
                            i2++;
                        }
                        jpVar.h();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 13) {
                        jo mo641a2 = jpVar.mo641a();
                        this.f650b = new HashMap(mo641a2.f918a * 2);
                        while (i2 < mo641a2.f918a) {
                            this.f650b.put(jpVar.mo644a(), jpVar.mo644a());
                            i2++;
                        }
                        jpVar.h();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 12:
                    if (b2 == 2) {
                        this.f647a = jpVar.mo649a();
                        e(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 13:
                    if (b2 == 13) {
                        jo mo641a3 = jpVar.mo641a();
                        this.f653c = new HashMap(mo641a3.f918a * 2);
                        while (i2 < mo641a3.f918a) {
                            this.f653c.put(jpVar.mo644a(), jpVar.mo644a());
                            i2++;
                        }
                        jpVar.h();
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
    public void m526a() {
        if (this.f644a != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
