package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class io implements jf<io, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f707a;

    /* renamed from: a, reason: collision with other field name */
    public ij f708a;

    /* renamed from: a, reason: collision with other field name */
    public String f709a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f710a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f711a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f712a;

    /* renamed from: b, reason: collision with other field name */
    public String f713b;

    /* renamed from: b, reason: collision with other field name */
    public boolean f714b;

    /* renamed from: c, reason: collision with other field name */
    public String f715c;

    /* renamed from: d, reason: collision with other field name */
    public String f716d;

    /* renamed from: e, reason: collision with other field name */
    public String f717e;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f706a = new ju("XmPushActionCommand");
    private static final jm a = new jm("", (byte) 12, 2);
    private static final jm b = new jm("", (byte) 11, 3);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9220c = new jm("", (byte) 11, 4);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9221d = new jm("", (byte) 11, 5);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9222e = new jm("", (byte) 15, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9223f = new jm("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9224g = new jm("", (byte) 11, 9);
    private static final jm h = new jm("", (byte) 2, 10);
    private static final jm i = new jm("", (byte) 2, 11);
    private static final jm j = new jm("", (byte) 10, 12);

    public io() {
        this.f710a = new BitSet(3);
        this.f712a = false;
        this.f714b = true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m550a() {
        return this.f708a != null;
    }

    public boolean b() {
        return this.f709a != null;
    }

    public boolean c() {
        return this.f713b != null;
    }

    public boolean d() {
        return this.f715c != null;
    }

    public boolean e() {
        return this.f711a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof io)) {
            return m551a((io) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f716d != null;
    }

    public boolean g() {
        return this.f717e != null;
    }

    public boolean h() {
        return this.f710a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f710a.get(1);
    }

    public boolean j() {
        return this.f710a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m550a()) {
            sb.append("target:");
            ij ijVar = this.f708a;
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
        String str = this.f709a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f713b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f715c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f711a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f716d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f717e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f712a);
        }
        if (i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f714b);
        }
        if (j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f707a);
        }
        sb.append(")");
        return sb.toString();
    }

    public io a(String str) {
        this.f709a = str;
        return this;
    }

    public io b(String str) {
        this.f713b = str;
        return this;
    }

    public io c(String str) {
        this.f715c = str;
        return this;
    }

    public io d(String str) {
        this.f716d = str;
        return this;
    }

    public io e(String str) {
        this.f717e = str;
        return this;
    }

    public String a() {
        return this.f715c;
    }

    public void b(boolean z) {
        this.f710a.set(1, z);
    }

    public void c(boolean z) {
        this.f710a.set(2, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m549a(String str) {
        if (this.f711a == null) {
            this.f711a = new ArrayList();
        }
        this.f711a.add(str);
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m548a();
        jpVar.a(f706a);
        if (this.f708a != null && m550a()) {
            jpVar.a(a);
            this.f708a.b(jpVar);
            jpVar.b();
        }
        if (this.f709a != null) {
            jpVar.a(b);
            jpVar.a(this.f709a);
            jpVar.b();
        }
        if (this.f713b != null) {
            jpVar.a(f9220c);
            jpVar.a(this.f713b);
            jpVar.b();
        }
        if (this.f715c != null) {
            jpVar.a(f9221d);
            jpVar.a(this.f715c);
            jpVar.b();
        }
        if (this.f711a != null && e()) {
            jpVar.a(f9222e);
            jpVar.a(new jn((byte) 11, this.f711a.size()));
            Iterator<String> it2 = this.f711a.iterator();
            while (it2.hasNext()) {
                jpVar.a(it2.next());
            }
            jpVar.e();
            jpVar.b();
        }
        if (this.f716d != null && f()) {
            jpVar.a(f9223f);
            jpVar.a(this.f716d);
            jpVar.b();
        }
        if (this.f717e != null && g()) {
            jpVar.a(f9224g);
            jpVar.a(this.f717e);
            jpVar.b();
        }
        if (h()) {
            jpVar.a(h);
            jpVar.a(this.f712a);
            jpVar.b();
        }
        if (i()) {
            jpVar.a(i);
            jpVar.a(this.f714b);
            jpVar.b();
        }
        if (j()) {
            jpVar.a(j);
            jpVar.a(this.f707a);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public io(String str, String str2, String str3) {
        this();
        this.f709a = str;
        this.f713b = str2;
        this.f715c = str3;
    }

    public void a(boolean z) {
        this.f710a.set(0, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m551a(io ioVar) {
        if (ioVar == null) {
            return false;
        }
        boolean m550a = m550a();
        boolean m550a2 = ioVar.m550a();
        if ((m550a || m550a2) && !(m550a && m550a2 && this.f708a.m536a(ioVar.f708a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = ioVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f709a.equals(ioVar.f709a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ioVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f713b.equals(ioVar.f713b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ioVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f715c.equals(ioVar.f715c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ioVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f711a.equals(ioVar.f711a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ioVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f716d.equals(ioVar.f716d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ioVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f717e.equals(ioVar.f717e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ioVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f712a == ioVar.f712a)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ioVar.i();
        if ((i2 || i3) && !(i2 && i3 && this.f714b == ioVar.f714b)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ioVar.j();
        if (j2 || j3) {
            return j2 && j3 && this.f707a == ioVar.f707a;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(io ioVar) {
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
        if (!getClass().equals(ioVar.getClass())) {
            return getClass().getName().compareTo(ioVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m550a()).compareTo(Boolean.valueOf(ioVar.m550a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m550a() && (a11 = jg.a(this.f708a, ioVar.f708a)) != 0) {
            return a11;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ioVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a10 = jg.a(this.f709a, ioVar.f709a)) != 0) {
            return a10;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ioVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a9 = jg.a(this.f713b, ioVar.f713b)) != 0) {
            return a9;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ioVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a8 = jg.a(this.f715c, ioVar.f715c)) != 0) {
            return a8;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ioVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a7 = jg.a(this.f711a, ioVar.f711a)) != 0) {
            return a7;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ioVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a6 = jg.a(this.f716d, ioVar.f716d)) != 0) {
            return a6;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ioVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a5 = jg.a(this.f717e, ioVar.f717e)) != 0) {
            return a5;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ioVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a4 = jg.a(this.f712a, ioVar.f712a)) != 0) {
            return a4;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ioVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a3 = jg.a(this.f714b, ioVar.f714b)) != 0) {
            return a3;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ioVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!j() || (a2 = jg.a(this.f707a, ioVar.f707a)) == 0) {
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
                m548a();
                return;
            }
            switch (mo639a.f916a) {
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f708a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f709a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f713b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f715c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 15) {
                        jn mo640a = jpVar.mo640a();
                        this.f711a = new ArrayList(mo640a.f917a);
                        for (int i2 = 0; i2 < mo640a.f917a; i2++) {
                            this.f711a.add(jpVar.mo644a());
                        }
                        jpVar.i();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f716d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                default:
                    js.a(jpVar, b2);
                    break;
                case 9:
                    if (b2 == 11) {
                        this.f717e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 10:
                    if (b2 == 2) {
                        this.f712a = jpVar.mo649a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 11:
                    if (b2 == 2) {
                        this.f714b = jpVar.mo649a();
                        b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 12:
                    if (b2 == 10) {
                        this.f707a = jpVar.mo638a();
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
    public void m548a() {
        if (this.f709a != null) {
            if (this.f713b != null) {
                if (this.f715c != null) {
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
