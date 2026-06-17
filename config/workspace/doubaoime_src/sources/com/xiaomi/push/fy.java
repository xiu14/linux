package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class fy implements jf<fy, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public byte f441a;

    /* renamed from: a, reason: collision with other field name */
    public int f442a;

    /* renamed from: a, reason: collision with other field name */
    public String f443a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f444a = new BitSet(6);

    /* renamed from: b, reason: collision with other field name */
    public int f445b;

    /* renamed from: b, reason: collision with other field name */
    public String f446b;

    /* renamed from: c, reason: collision with other field name */
    public int f447c;

    /* renamed from: c, reason: collision with other field name */
    public String f448c;

    /* renamed from: d, reason: collision with other field name */
    public int f449d;

    /* renamed from: d, reason: collision with other field name */
    public String f450d;

    /* renamed from: e, reason: collision with other field name */
    public int f451e;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f440a = new ju("StatsEvent");
    private static final jm a = new jm("", (byte) 3, 1);
    private static final jm b = new jm("", (byte) 8, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9098c = new jm("", (byte) 8, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9099d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9100e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9101f = new jm("", (byte) 8, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9102g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 11, 8);
    private static final jm i = new jm("", (byte) 8, 9);
    private static final jm j = new jm("", (byte) 8, 10);

    public fy a(byte b2) {
        this.f441a = b2;
        a(true);
        return this;
    }

    public boolean b() {
        return this.f444a.get(1);
    }

    public boolean c() {
        return this.f444a.get(2);
    }

    public boolean d() {
        return this.f443a != null;
    }

    public boolean e() {
        return this.f446b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fy)) {
            return m400a((fy) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f444a.get(3);
    }

    public boolean g() {
        return this.f448c != null;
    }

    public boolean h() {
        return this.f450d != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f444a.get(4);
    }

    public boolean j() {
        return this.f444a.get(5);
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("StatsEvent(", "chid:");
        R.append((int) this.f441a);
        R.append(", ");
        R.append("type:");
        R.append(this.f442a);
        R.append(", ");
        R.append("value:");
        R.append(this.f445b);
        R.append(", ");
        R.append("connpt:");
        String str = this.f443a;
        if (str == null) {
            R.append("null");
        } else {
            R.append(str);
        }
        if (e()) {
            R.append(", ");
            R.append("host:");
            String str2 = this.f446b;
            if (str2 == null) {
                R.append("null");
            } else {
                R.append(str2);
            }
        }
        if (f()) {
            R.append(", ");
            R.append("subvalue:");
            R.append(this.f447c);
        }
        if (g()) {
            R.append(", ");
            R.append("annotation:");
            String str3 = this.f448c;
            if (str3 == null) {
                R.append("null");
            } else {
                R.append(str3);
            }
        }
        if (h()) {
            R.append(", ");
            R.append("user:");
            String str4 = this.f450d;
            if (str4 == null) {
                R.append("null");
            } else {
                R.append(str4);
            }
        }
        if (i()) {
            R.append(", ");
            R.append("time:");
            R.append(this.f449d);
        }
        if (j()) {
            R.append(", ");
            R.append("clientIp:");
            R.append(this.f451e);
        }
        R.append(")");
        return R.toString();
    }

    public void b(boolean z) {
        this.f444a.set(1, z);
    }

    public void c(boolean z) {
        this.f444a.set(2, z);
    }

    public void d(boolean z) {
        this.f444a.set(3, z);
    }

    public void e(boolean z) {
        this.f444a.set(4, z);
    }

    public void f(boolean z) {
        this.f444a.set(5, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m399a() {
        return this.f444a.get(0);
    }

    public fy b(int i2) {
        this.f445b = i2;
        c(true);
        return this;
    }

    public fy c(int i2) {
        this.f447c = i2;
        d(true);
        return this;
    }

    public fy d(String str) {
        this.f450d = str;
        return this;
    }

    public void a(boolean z) {
        this.f444a.set(0, z);
    }

    public fy d(int i2) {
        this.f449d = i2;
        e(true);
        return this;
    }

    public fy a(int i2) {
        this.f442a = i2;
        b(true);
        return this;
    }

    public fy b(String str) {
        this.f446b = str;
        return this;
    }

    public fy c(String str) {
        this.f448c = str;
        return this;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f440a);
        jpVar.a(a);
        jpVar.a(this.f441a);
        jpVar.b();
        jpVar.a(b);
        jpVar.mo648a(this.f442a);
        jpVar.b();
        jpVar.a(f9098c);
        jpVar.mo648a(this.f445b);
        jpVar.b();
        if (this.f443a != null) {
            jpVar.a(f9099d);
            jpVar.a(this.f443a);
            jpVar.b();
        }
        if (this.f446b != null && e()) {
            jpVar.a(f9100e);
            jpVar.a(this.f446b);
            jpVar.b();
        }
        if (f()) {
            jpVar.a(f9101f);
            jpVar.mo648a(this.f447c);
            jpVar.b();
        }
        if (this.f448c != null && g()) {
            jpVar.a(f9102g);
            jpVar.a(this.f448c);
            jpVar.b();
        }
        if (this.f450d != null && h()) {
            jpVar.a(h);
            jpVar.a(this.f450d);
            jpVar.b();
        }
        if (i()) {
            jpVar.a(i);
            jpVar.mo648a(this.f449d);
            jpVar.b();
        }
        if (j()) {
            jpVar.a(j);
            jpVar.mo648a(this.f451e);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public fy a(String str) {
        this.f443a = str;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m400a(fy fyVar) {
        if (fyVar == null || this.f441a != fyVar.f441a || this.f442a != fyVar.f442a || this.f445b != fyVar.f445b) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = fyVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f443a.equals(fyVar.f443a))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = fyVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f446b.equals(fyVar.f446b))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = fyVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f447c == fyVar.f447c)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = fyVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f448c.equals(fyVar.f448c))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = fyVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f450d.equals(fyVar.f450d))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = fyVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f449d == fyVar.f449d)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = fyVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f451e == fyVar.f451e;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fy fyVar) {
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
        if (!getClass().equals(fyVar.getClass())) {
            return getClass().getName().compareTo(fyVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m399a()).compareTo(Boolean.valueOf(fyVar.m399a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m399a() && (a11 = jg.a(this.f441a, fyVar.f441a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(fyVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a10 = jg.a(this.f442a, fyVar.f442a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(fyVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jg.a(this.f445b, fyVar.f445b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(fyVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jg.a(this.f443a, fyVar.f443a)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(fyVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jg.a(this.f446b, fyVar.f446b)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(fyVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jg.a(this.f447c, fyVar.f447c)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(fyVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jg.a(this.f448c, fyVar.f448c)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(fyVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jg.a(this.f450d, fyVar.f450d)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(fyVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jg.a(this.f449d, fyVar.f449d)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(fyVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = jg.a(this.f451e, fyVar.f451e)) == 0) {
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
                if (m399a()) {
                    if (b()) {
                        if (c()) {
                            a();
                            return;
                        } else {
                            StringBuilder M = e.a.a.a.a.M("Required field 'value' was not found in serialized data! Struct: ");
                            M.append(toString());
                            throw new jq(M.toString());
                        }
                    }
                    StringBuilder M2 = e.a.a.a.a.M("Required field 'type' was not found in serialized data! Struct: ");
                    M2.append(toString());
                    throw new jq(M2.toString());
                }
                StringBuilder M3 = e.a.a.a.a.M("Required field 'chid' was not found in serialized data! Struct: ");
                M3.append(toString());
                throw new jq(M3.toString());
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 3) {
                        this.f441a = jpVar.a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 8) {
                        this.f442a = jpVar.mo637a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 8) {
                        this.f445b = jpVar.mo637a();
                        c(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f443a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f446b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 8) {
                        this.f447c = jpVar.mo637a();
                        d(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f448c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f450d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 9:
                    if (b2 == 8) {
                        this.f449d = jpVar.mo637a();
                        e(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 8) {
                        this.f451e = jpVar.mo637a();
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

    public void a() {
        if (this.f443a != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'connpt' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
