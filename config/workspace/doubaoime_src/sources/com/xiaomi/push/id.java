package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class id implements jf<id, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f606a;

    /* renamed from: a, reason: collision with other field name */
    public ia f607a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f608a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    public List<Cif> f609a;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f605a = new ju("NormalConfig");
    private static final jm a = new jm("", (byte) 8, 1);
    private static final jm b = new jm("", (byte) 15, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9183c = new jm("", (byte) 8, 3);

    public int a() {
        return this.f606a;
    }

    public boolean b() {
        return this.f609a != null;
    }

    public boolean c() {
        return this.f607a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof id)) {
            return m508a((id) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("NormalConfig(", "version:");
        R.append(this.f606a);
        R.append(", ");
        R.append("configItems:");
        List<Cif> list = this.f609a;
        if (list == null) {
            R.append("null");
        } else {
            R.append(list);
        }
        if (c()) {
            R.append(", ");
            R.append("type:");
            ia iaVar = this.f607a;
            if (iaVar == null) {
                R.append("null");
            } else {
                R.append(iaVar);
            }
        }
        R.append(")");
        return R.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m507a() {
        return this.f608a.get(0);
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m506a();
        jpVar.a(f605a);
        jpVar.a(a);
        jpVar.mo648a(this.f606a);
        jpVar.b();
        if (this.f609a != null) {
            jpVar.a(b);
            jpVar.a(new jn((byte) 12, this.f609a.size()));
            Iterator<Cif> it2 = this.f609a.iterator();
            while (it2.hasNext()) {
                it2.next().b(jpVar);
            }
            jpVar.e();
            jpVar.b();
        }
        if (this.f607a != null && c()) {
            jpVar.a(f9183c);
            jpVar.mo648a(this.f607a.a());
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public void a(boolean z) {
        this.f608a.set(0, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public ia m505a() {
        return this.f607a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m508a(id idVar) {
        if (idVar == null || this.f606a != idVar.f606a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = idVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f609a.equals(idVar.f609a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = idVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f607a.equals(idVar.f607a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(id idVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(idVar.getClass())) {
            return getClass().getName().compareTo(idVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m507a()).compareTo(Boolean.valueOf(idVar.m507a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m507a() && (a4 = jg.a(this.f606a, idVar.f606a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(idVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jg.a(this.f609a, idVar.f609a)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(idVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = jg.a(this.f607a, idVar.f607a)) == 0) {
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
                break;
            }
            short s = mo639a.f916a;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        js.a(jpVar, b2);
                    } else if (b2 == 8) {
                        this.f607a = ia.a(jpVar.mo637a());
                    } else {
                        js.a(jpVar, b2);
                    }
                } else if (b2 == 15) {
                    jn mo640a = jpVar.mo640a();
                    this.f609a = new ArrayList(mo640a.f917a);
                    for (int i = 0; i < mo640a.f917a; i++) {
                        Cif cif = new Cif();
                        cif.a(jpVar);
                        this.f609a.add(cif);
                    }
                    jpVar.i();
                } else {
                    js.a(jpVar, b2);
                }
            } else if (b2 == 8) {
                this.f606a = jpVar.mo637a();
                a(true);
            } else {
                js.a(jpVar, b2);
            }
            jpVar.g();
        }
        jpVar.f();
        if (m507a()) {
            m506a();
        } else {
            StringBuilder M = e.a.a.a.a.M("Required field 'version' was not found in serialized data! Struct: ");
            M.append(toString());
            throw new jq(M.toString());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m506a() {
        if (this.f609a != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'configItems' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
