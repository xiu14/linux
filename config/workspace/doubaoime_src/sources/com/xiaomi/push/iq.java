package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class iq implements jf<iq, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public hu f731a;

    /* renamed from: a, reason: collision with other field name */
    public ih f732a;

    /* renamed from: a, reason: collision with other field name */
    public ij f733a;

    /* renamed from: a, reason: collision with other field name */
    public String f734a;

    /* renamed from: a, reason: collision with other field name */
    public ByteBuffer f735a;

    /* renamed from: b, reason: collision with other field name */
    public String f738b;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f730a = new ju("XmPushActionContainer");
    private static final jm a = new jm("", (byte) 8, 1);
    private static final jm b = new jm("", (byte) 2, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9230c = new jm("", (byte) 2, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9231d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9232e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9233f = new jm("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9234g = new jm("", (byte) 12, 7);
    private static final jm h = new jm("", (byte) 12, 8);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f736a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f737a = true;

    /* renamed from: b, reason: collision with other field name */
    public boolean f739b = true;

    public hu a() {
        return this.f731a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m566b() {
        return this.f737a;
    }

    public boolean c() {
        return this.f736a.get(0);
    }

    public boolean d() {
        return this.f736a.get(1);
    }

    public boolean e() {
        return this.f735a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iq)) {
            return m563a((iq) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f734a != null;
    }

    public boolean g() {
        return this.f738b != null;
    }

    public boolean h() {
        return this.f733a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f732a != null;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("XmPushActionContainer(", "action:");
        hu huVar = this.f731a;
        if (huVar == null) {
            R.append("null");
        } else {
            R.append(huVar);
        }
        R.append(", ");
        R.append("encryptAction:");
        R.append(this.f737a);
        R.append(", ");
        R.append("isRequest:");
        R.append(this.f739b);
        if (f()) {
            R.append(", ");
            R.append("appid:");
            String str = this.f734a;
            if (str == null) {
                R.append("null");
            } else {
                R.append(str);
            }
        }
        if (g()) {
            R.append(", ");
            R.append("packageName:");
            String str2 = this.f738b;
            if (str2 == null) {
                R.append("null");
            } else {
                R.append(str2);
            }
        }
        R.append(", ");
        R.append("target:");
        ij ijVar = this.f733a;
        if (ijVar == null) {
            R.append("null");
        } else {
            R.append(ijVar);
        }
        if (i()) {
            R.append(", ");
            R.append("metaInfo:");
            ih ihVar = this.f732a;
            if (ihVar == null) {
                R.append("null");
            } else {
                R.append(ihVar);
            }
        }
        R.append(")");
        return R.toString();
    }

    public iq a(hu huVar) {
        this.f731a = huVar;
        return this;
    }

    public iq b(boolean z) {
        this.f739b = z;
        m565b(true);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m562a() {
        return this.f731a != null;
    }

    public iq a(boolean z) {
        this.f737a = z;
        m561a(true);
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m565b(boolean z) {
        this.f736a.set(1, z);
    }

    public String b() {
        return this.f738b;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m561a(boolean z) {
        this.f736a.set(0, z);
    }

    public iq b(String str) {
        this.f738b = str;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m564a() {
        a(jg.a(this.f735a));
        return this.f735a.array();
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m560a();
        jpVar.a(f730a);
        if (this.f731a != null) {
            jpVar.a(a);
            jpVar.mo648a(this.f731a.a());
            jpVar.b();
        }
        jpVar.a(b);
        jpVar.a(this.f737a);
        jpVar.b();
        jpVar.a(f9230c);
        jpVar.a(this.f739b);
        jpVar.b();
        if (this.f735a != null) {
            jpVar.a(f9231d);
            jpVar.a(this.f735a);
            jpVar.b();
        }
        if (this.f734a != null && f()) {
            jpVar.a(f9232e);
            jpVar.a(this.f734a);
            jpVar.b();
        }
        if (this.f738b != null && g()) {
            jpVar.a(f9233f);
            jpVar.a(this.f738b);
            jpVar.b();
        }
        if (this.f733a != null) {
            jpVar.a(f9234g);
            this.f733a.b(jpVar);
            jpVar.b();
        }
        if (this.f732a != null && i()) {
            jpVar.a(h);
            this.f732a.b(jpVar);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public iq a(ByteBuffer byteBuffer) {
        this.f735a = byteBuffer;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m559a() {
        return this.f734a;
    }

    public iq a(String str) {
        this.f734a = str;
        return this;
    }

    public iq a(ij ijVar) {
        this.f733a = ijVar;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ih m558a() {
        return this.f732a;
    }

    public iq a(ih ihVar) {
        this.f732a = ihVar;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m563a(iq iqVar) {
        if (iqVar == null) {
            return false;
        }
        boolean m562a = m562a();
        boolean m562a2 = iqVar.m562a();
        if (((m562a || m562a2) && (!m562a || !m562a2 || !this.f731a.equals(iqVar.f731a))) || this.f737a != iqVar.f737a || this.f739b != iqVar.f739b) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = iqVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f735a.equals(iqVar.f735a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iqVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f734a.equals(iqVar.f734a))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iqVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f738b.equals(iqVar.f738b))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = iqVar.h();
        if ((h2 || h3) && !(h2 && h3 && this.f733a.m536a(iqVar.f733a))) {
            return false;
        }
        boolean i = i();
        boolean i2 = iqVar.i();
        if (i || i2) {
            return i && i2 && this.f732a.m528a(iqVar.f732a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iq iqVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(iqVar.getClass())) {
            return getClass().getName().compareTo(iqVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m562a()).compareTo(Boolean.valueOf(iqVar.m562a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m562a() && (a9 = jg.a(this.f731a, iqVar.f731a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iqVar.c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (c() && (a8 = jg.a(this.f737a, iqVar.f737a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iqVar.d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (d() && (a7 = jg.a(this.f739b, iqVar.f739b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iqVar.e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (e() && (a6 = jg.a(this.f735a, iqVar.f735a)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iqVar.f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (f() && (a5 = jg.a(this.f734a, iqVar.f734a)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iqVar.g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (g() && (a4 = jg.a(this.f738b, iqVar.f738b)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iqVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (h() && (a3 = jg.a(this.f733a, iqVar.f733a)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iqVar.i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!i() || (a2 = jg.a(this.f732a, iqVar.f732a)) == 0) {
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
                if (c()) {
                    if (d()) {
                        m560a();
                        return;
                    } else {
                        StringBuilder M = e.a.a.a.a.M("Required field 'isRequest' was not found in serialized data! Struct: ");
                        M.append(toString());
                        throw new jq(M.toString());
                    }
                }
                StringBuilder M2 = e.a.a.a.a.M("Required field 'encryptAction' was not found in serialized data! Struct: ");
                M2.append(toString());
                throw new jq(M2.toString());
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 8) {
                        this.f731a = hu.a(jpVar.mo637a());
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 2) {
                        this.f737a = jpVar.mo649a();
                        m561a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 2) {
                        this.f739b = jpVar.mo649a();
                        m565b(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f735a = jpVar.mo645a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f734a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 11) {
                        this.f738b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f733a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 12) {
                        ih ihVar = new ih();
                        this.f732a = ihVar;
                        ihVar.a(jpVar);
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
    public void m560a() {
        if (this.f731a != null) {
            if (this.f735a != null) {
                if (this.f733a != null) {
                    return;
                }
                StringBuilder M = e.a.a.a.a.M("Required field 'target' was not present! Struct: ");
                M.append(toString());
                throw new jq(M.toString());
            }
            StringBuilder M2 = e.a.a.a.a.M("Required field 'pushAction' was not present! Struct: ");
            M2.append(toString());
            throw new jq(M2.toString());
        }
        StringBuilder M3 = e.a.a.a.a.M("Required field 'action' was not present! Struct: ");
        M3.append(toString());
        throw new jq(M3.toString());
    }
}
